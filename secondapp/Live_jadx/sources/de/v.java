package de;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f79004a = "LogResponseInternal";

    public static v a(long j10) {
        return new l(j10);
    }

    @NonNull
    public static v b(@NonNull Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        v vVarA = a(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return vVarA;
                    }
                    v vVarA2 = a(jsonReader.nextLong());
                    jsonReader.close();
                    return vVarA2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th2) {
            jsonReader.close();
            throw th2;
        }
    }

    public abstract long c();
}
