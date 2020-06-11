package com.github.enesusta.istihza.resource;

import com.github.enesusta.jloader.Loader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Component
public final class DefaultJsonResource implements JsonResource {

    @Autowired
    Loader loader;

    @Override
    public final String getJsonResource(final String jsonResourceFileName) {

        final StringBuffer stringBuffer = new StringBuffer();
        try (InputStream inputStream = loader.load(jsonResourceFileName)) {

            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String str;
            while ((str = bufferedReader.readLine()) != null) stringBuffer.append(str);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuffer.toString();
    }

}
