package com.myIdea.AirTicketPrice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class AirTicketPriceApplication {
    public static void main(String[] args) {
//        TelegramBotsApi botsApi = null;
//        try {
//            botsApi = new TelegramBotsApi(DefaultBotSession.class);
//            botsApi.registerBot(new Bot());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        SpringApplication.run(AirTicketPriceApplication.class, args);
    }

}