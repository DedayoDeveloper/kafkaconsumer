package com.kafka.kafkaconsumer.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.kafkaconsumer.model.Payloads;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class MessageDeserializer implements Deserializer<Payloads> {
    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {

    }

    @Override
    public void close() {

    }

    @Override
    public Payloads deserialize(String s, byte[] bytes) {
        ObjectMapper mapper = new ObjectMapper();
        Payloads payloads = null;
        try {
            payloads = mapper.readValue(bytes, Payloads.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return payloads;
    }




}
