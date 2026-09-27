package com.bytedance.sdk.component.tq.hww.hww.hww;

import com.bytedance.sdk.component.tq.hww.weu;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class rs extends weu {
    HttpURLConnection hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    InputStream f35031tq;

    public rs(HttpURLConnection httpURLConnection) throws IOException {
        this.hww = httpURLConnection;
        this.f35031tq = new vgm(httpURLConnection.getInputStream(), httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.tq.hww.weu, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f35031tq.close();
            this.hww.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.tq.hww.weu
    public com.bytedance.sdk.component.tq.hww.rs hv() {
        if (this.hww.getContentType() != null) {
            return com.bytedance.sdk.component.tq.hww.rs.hww(this.hww.getContentType());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.tq.hww.weu
    public long hww() {
        try {
            return this.hww.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.tq.hww.weu
    public InputStream sd() {
        return this.f35031tq;
    }

    @Override // com.bytedance.sdk.component.tq.hww.weu
    public String tq() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f35031tq));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = stringBuffer.toString();
                    close();
                    return string;
                }
                stringBuffer.append(line + IOUtils.LINE_SEPARATOR_UNIX);
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.tq.hww.weu
    public byte[] vy() {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i10 = this.f35031tq.read(bArr);
                if (i10 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public rs(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.hww = httpURLConnection;
        this.f35031tq = new vgm(inputStream, httpURLConnection);
    }
}
