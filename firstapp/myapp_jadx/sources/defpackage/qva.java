package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: loaded from: classes4.dex */
public final class qva {
    public static String a(String str, String str2) {
        return lx5.a("https://console.firebase.google.com/project/", str, "/performance/app/android:", str2);
    }

    public static tcp b(JsonReader jsonReader) {
        d9e0 strictness = jsonReader.getStrictness();
        if (strictness == d9e0.b) {
            jsonReader.setStrictness(d9e0.a);
        }
        try {
            try {
                tcp tcpVarA = w8e0.a(jsonReader);
                jsonReader.setStrictness(strictness);
                return tcpVarA;
            } catch (Throwable th) {
                jsonReader.setStrictness(strictness);
                throw th;
            }
        } catch (OutOfMemoryError | StackOverflowError e) {
            throw new zdp("Failed parsing JSON source: " + jsonReader + " to Json", e);
        }
    }

    public static tcp c(String str) {
        try {
            try {
                JsonReader jsonReader = new JsonReader(new StringReader(str));
                tcp tcpVarB = b(jsonReader);
                try {
                    tcpVarB.getClass();
                    if (!(tcpVarB instanceof tdp) && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                        throw new qep("Did not consume the entire document.");
                    }
                    return tcpVarB;
                } catch (NumberFormatException e) {
                    e = e;
                    throw new qep(e);
                }
            } catch (IOException e2) {
                throw new kdp(e2);
            }
        } catch (MalformedJsonException | NumberFormatException e3) {
            e = e3;
        }
    }
}
