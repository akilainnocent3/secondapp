package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import gm.j0;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class o {
    @Deprecated
    public o() {
    }

    public static j d(JsonReader jsonReader) throws t, k {
        w strictness = jsonReader.getStrictness();
        if (strictness == w.LEGACY_STRICT) {
            jsonReader.setStrictness(w.LENIENT);
        }
        try {
            try {
                j jVarA = j0.a(jsonReader);
                jsonReader.setStrictness(strictness);
                return jVarA;
            } catch (Throwable th2) {
                jsonReader.setStrictness(strictness);
                throw th2;
            }
        } catch (OutOfMemoryError | StackOverflowError e10) {
            throw new n("Failed parsing JSON source: " + jsonReader + " to Json", e10);
        }
    }

    public static j e(Reader reader) throws t, k {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            j jVarD = d(jsonReader);
            if (!jVarD.w() && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new t("Did not consume the entire document.");
            }
            return jVarD;
        } catch (MalformedJsonException | NumberFormatException e10) {
            throw new t(e10);
        } catch (IOException e11) {
            throw new k(e11);
        }
    }

    public static j f(String str) throws t {
        return e(new StringReader(str));
    }

    @qj.m(imports = {"com.google.gson.JsonParser"}, replacement = "JsonParser.parseReader(json)")
    @Deprecated
    public j a(JsonReader jsonReader) throws t, k {
        return d(jsonReader);
    }

    @qj.m(imports = {"com.google.gson.JsonParser"}, replacement = "JsonParser.parseReader(json)")
    @Deprecated
    public j b(Reader reader) throws t, k {
        return e(reader);
    }

    @qj.m(imports = {"com.google.gson.JsonParser"}, replacement = "JsonParser.parseString(json)")
    @Deprecated
    public j c(String str) throws t {
        return f(str);
    }
}
