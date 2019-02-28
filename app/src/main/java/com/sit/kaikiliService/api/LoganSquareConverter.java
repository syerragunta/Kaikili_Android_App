package com.sit.kaikiliService.api;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
>>>>>>> 2/14/2019
=======
import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
>>>>>>> 2/15/2019
=======
import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
>>>>>>> 2/16/2019
=======
import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
>>>>>>> 2/16/2019 V1
=======
import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
>>>>>>> 2/16/2019 V2
=======
import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
>>>>>>> 2/16/2019
=======
import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
>>>>>>> 2/18/2019
=======
import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
>>>>>>> 2/21/2019
=======
import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
>>>>>>> 2/22/2019
=======
import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
>>>>>>> 2/23/2019
=======
import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
>>>>>>> 2/25/2019
=======
import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
>>>>>>> 2/26/2019
=======
import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
>>>>>>> 2/27/2019
=======
import android.util.Log;

import com.bluelinelabs.logansquare.LoganSquare;
>>>>>>> 2/28/2019
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import java.lang.reflect.Type;
=======
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
>>>>>>> 2/14/2019
=======
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
>>>>>>> 2/15/2019
=======
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
>>>>>>> 2/16/2019
=======
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
>>>>>>> 2/16/2019 V1
=======
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
>>>>>>> 2/16/2019 V2
=======
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
>>>>>>> 2/16/2019
=======
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
>>>>>>> 2/18/2019
=======
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
>>>>>>> 2/21/2019
=======
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
>>>>>>> 2/22/2019
=======
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
>>>>>>> 2/23/2019
=======
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
>>>>>>> 2/25/2019
=======
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
>>>>>>> 2/26/2019
=======
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
>>>>>>> 2/27/2019
=======
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
>>>>>>> 2/28/2019

import retrofit.converter.ConversionException;
import retrofit.converter.Converter;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
import retrofit.mime.TypedString;
>>>>>>> 2/14/2019
=======
import retrofit.mime.TypedString;
>>>>>>> 2/15/2019
=======
import retrofit.mime.TypedString;
>>>>>>> 2/16/2019
=======
import retrofit.mime.TypedString;
>>>>>>> 2/16/2019 V1
=======
import retrofit.mime.TypedString;
>>>>>>> 2/16/2019 V2
=======
import retrofit.mime.TypedString;
>>>>>>> 2/16/2019
=======
import retrofit.mime.TypedString;
>>>>>>> 2/18/2019
=======
import retrofit.mime.TypedString;
>>>>>>> 2/21/2019
=======
import retrofit.mime.TypedString;
>>>>>>> 2/22/2019
=======
import retrofit.mime.TypedString;
>>>>>>> 2/23/2019
=======
import retrofit.mime.TypedString;
>>>>>>> 2/25/2019
=======
import retrofit.mime.TypedString;
>>>>>>> 2/26/2019
=======
import retrofit.mime.TypedString;
>>>>>>> 2/27/2019
=======
import retrofit.mime.TypedString;
>>>>>>> 2/28/2019

/**
 * Created by ketan patel on 9/2/2019.
 * ketan_patel25@yahoo.com
 * Sharva Infotech PVT LTD
 *
 */

/**
 * A {@link Converter} which uses parsing and serialization provided by bluelinelabs' LoganSquare library.
 *
 * @author aurae
 */
public class LoganSquareConverter implements Converter {

    @Override public Object fromBody(TypedInput typedInput, Type type) throws ConversionException {
        try {
            InputStream in = typedInput.in(); // convert the typedInput to String
            String string = fromStream(in);
            in.close(); // we are responsible to close the InputStream after use

            if (String.class.equals(type)) {
                return string;
            } else {
                return new Gson().fromJson(string, type); // convert to the supplied type, typically Object, JsonObject or Map<String, Object>
            }
        } catch (Exception e) { // a lot may happen here, whatever happens
            throw new ConversionException(e); // wrap it into ConversionException so retrofit can process it
        }
    }

    @Override public TypedOutput toBody(Object object) { // not required
        return null;
    }

    private static String fromStream(InputStream in) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder out = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            out.append(line);
            out.append("\r\n");
        }
        return out.toString();
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
//
=======

>>>>>>> 2/14/2019
=======

>>>>>>> 2/15/2019
=======

>>>>>>> 2/16/2019
=======

>>>>>>> 2/16/2019 V1
=======

>>>>>>> 2/16/2019 V2
=======

>>>>>>> 2/16/2019
=======

>>>>>>> 2/18/2019
=======

>>>>>>> 2/21/2019
=======

>>>>>>> 2/22/2019
=======

>>>>>>> 2/23/2019
=======

>>>>>>> 2/25/2019
=======

>>>>>>> 2/26/2019
=======

>>>>>>> 2/27/2019
=======

>>>>>>> 2/28/2019
//    @Override
//    public Object fromBody(TypedInput body, Type type) throws ConversionException {
//        try {
//            // Check if the type contains a parametrized list
//            if (ParameterizedType.class.isAssignableFrom(type.getClass())) {
//                // Grab the actual type parameter from the parametrized list and delegate to LoganSquare
//                ParameterizedType parameterized = (ParameterizedType) type;
//                return LoganSquare.parseList(body.in(), (Class) parameterized.getActualTypeArguments()[0]);
//
//            } else {
//                // Single elements get parsed immediately
//                Log.e( "post Data --------",LoganSquare.parse(body.in(), (Class) type).toString());
//
//                return LoganSquare.parse(body.in(), (Class) type);
//            }
//        } catch (Exception e) {
//            throw new ConversionException(e);
//        }
//    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
//
=======

>>>>>>> 2/14/2019
=======

>>>>>>> 2/15/2019
=======

>>>>>>> 2/16/2019
=======

>>>>>>> 2/16/2019 V1
=======

>>>>>>> 2/16/2019 V2
=======

>>>>>>> 2/16/2019
=======

>>>>>>> 2/18/2019
=======

>>>>>>> 2/21/2019
=======

>>>>>>> 2/22/2019
=======

>>>>>>> 2/23/2019
=======

>>>>>>> 2/25/2019
=======

>>>>>>> 2/26/2019
=======

>>>>>>> 2/27/2019
=======

>>>>>>> 2/28/2019
//    @SuppressWarnings("unchecked")
//    @Override
//    public TypedOutput toBody(Object object) {
//        try {
//            // Check if the type contains a parametrized list
//            if (List.class.isAssignableFrom(object.getClass())) {
//                // Convert the input to a list first, access the first element and serialize the list
//                List<Object> list = (List<Object>) object;
//                if (list.isEmpty()) {
//                    return new TypedString("[]");
//                } else {
//                    Object firstElement = list.get(0);
//                    Log.e( "Out put ------", firstElement.toString());
//                    return new TypedString(LoganSquare.serialize(list, (Class<Object>) firstElement.getClass()));
//                }
//            } else {
//                // Serialize single elements immediately
//                return new TypedString(LoganSquare.serialize(object));
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
}
