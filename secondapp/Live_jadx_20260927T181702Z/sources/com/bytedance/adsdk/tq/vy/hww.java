package com.bytedance.adsdk.tq.vy;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hww implements vy {
    private final HttpURLConnection hww;

    public hww(HttpURLConnection httpURLConnection) {
        this.hww = httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.hww.disconnect();
    }

    @Override // com.bytedance.adsdk.tq.vy.vy
    public boolean hww() {
        try {
            return this.hww.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.bytedance.adsdk.tq.vy.vy
    public String sd() {
        return this.hww.getContentType();
    }

    @Override // com.bytedance.adsdk.tq.vy.vy
    public InputStream tq() throws IOException {
        return this.hww.getInputStream();
    }

    @Override // com.bytedance.adsdk.tq.vy.vy
    public String vy() {
        try {
            if (hww()) {
                return null;
            }
            return "Unable to fetch " + this.hww.getURL() + ". Failed with " + this.hww.getResponseCode() + IOUtils.LINE_SEPARATOR_UNIX + hww(this.hww);
        } catch (IOException e10) {
            return e10.getMessage();
        }
    }

    private String hww(HttpURLConnection httpURLConnection) throws IOException {
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
}
