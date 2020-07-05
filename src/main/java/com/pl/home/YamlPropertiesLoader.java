package com.pl.home;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

class YamlPropertiesLoader {

    Properties getProperties() {
        String userDir = System.getProperty("user.dir");

        try {
            InputStream inputStream = Files.newInputStream(Path.of(userDir, "src", "main", "resources", "application.yml"));
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties;
        } catch (
                IOException e) {
            throw new IllegalStateException("could not load properties file" + e);
        }
    }
}