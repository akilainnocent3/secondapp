package db;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY})
public class a implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final HttpURLConnection f78678b;

    public a(@NonNull HttpURLConnection httpURLConnection) {
        this.f78678b = httpURLConnection;
    }

    @Override // db.d
    @Nullable
    public String V0() {
        return this.f78678b.getContentType();
    }

    public final String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th2;
            }
        }
        bufferedReader.close();
        return sb2.toString();
    }

    @Override // db.d
    @NonNull
    public InputStream b1() throws IOException {
        return this.f78678b.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f78678b.disconnect();
    }

    @Override // db.d
    public boolean isSuccessful() {
        try {
            return this.f78678b.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // db.d
    @Nullable
    public String s0() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f78678b.getURL() + ". Failed with " + this.f78678b.getResponseCode() + IOUtils.LINE_SEPARATOR_UNIX + a(this.f78678b);
        } catch (IOException | NullPointerException e10) {
            gb.g.f("get error failed ", e10);
            return e10.getMessage();
        }
    }
}
