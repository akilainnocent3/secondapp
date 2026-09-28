package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class mj1 {
    public final long a;

    public mj1(long j) {
        this.a = j;
    }

    public static mj1 a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        mj1 mj1Var = new mj1(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return mj1Var;
                    }
                    mj1 mj1Var2 = new mj1(jsonReader.nextLong());
                    jsonReader.close();
                    return mj1Var2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof mj1) && this.a == ((mj1) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return nrz.a(this.a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
