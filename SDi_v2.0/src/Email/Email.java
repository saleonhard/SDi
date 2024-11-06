package Email;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {

    public boolean enviarEmail(String ass, String noticia, String to) throws UnsupportedEncodingException {
        boolean r = false;
        Properties props = new Properties();
        
        try {
            // Carregar as configurações do arquivo properties
            FileInputStream input = new FileInputStream("config.properties");
            props.load(input);

            // Definindo parâmetros de conexão SMTP usando as propriedades carregadas
            String smtpHost = props.getProperty("smtp.host");
            String smtpPort = props.getProperty("smtp.port");
            String smtpSocketFactoryPort = props.getProperty("smtp.socketFactory.port");
            String smtpSocketFactoryClass = props.getProperty("smtp.socketFactory.class");
            String smtpAuth = props.getProperty("smtp.auth");
            String smtpSSL = props.getProperty("smtp.ssl.enable");
            String smtpProtocols = props.getProperty("smtp.ssl.protocols");

            props.put("mail.smtp.host", smtpHost);
            props.put("mail.smtp.socketFactory.port", smtpSocketFactoryPort);
            props.put("mail.smtp.socketFactory.class", smtpSocketFactoryClass);
            props.put("mail.smtp.auth", smtpAuth);
            props.put("mail.smtp.port", smtpPort);
            props.put("mail.smtp.ssl.enable", smtpSSL);
            props.put("mail.smtp.ssl.protocols", smtpProtocols);

            // Configurar a sessão de e-mail
            Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    // Usando o username e password do arquivo de configuração
                    String username = props.getProperty("smtp.username");
                    String password = props.getProperty("smtp.password");
                    return new PasswordAuthentication(username, password);
                }
            });

            // Ativa o debug para sessão
            session.setDebug(true);

            try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(props.getProperty("smtp.username"), "SDi")); // Remetente

                Address[] toUser = InternetAddress.parse(to); // Destinatário(s)
                message.setRecipients(Message.RecipientType.TO, toUser);
                message.setSubject(ass); // Assunto
                message.setText(noticia); // Corpo do e-mail

                // Enviar a mensagem
                Transport.send(message);

                System.out.println("E-mail enviado com sucesso!");
                r = true;

            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            System.err.println("Erro ao carregar as configurações: " + e.getMessage());
            r = false;
        }

        return r;
    }
}
