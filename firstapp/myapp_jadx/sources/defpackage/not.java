package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class not implements mot {
    public final InputStream a;
    public final String b;
    public final String c;

    public not(InputStream inputStream, String str, String str2) {
        this.a = inputStream;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.mot
    public final String Q() {
        return this.b;
    }

    @Override // defpackage.mot
    public final InputStream X() throws IOException {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            return inputStream;
        }
        String str = this.c;
        if (str == null) {
            str = "No input stream available";
        }
        throw new IOException(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // defpackage.mot
    public final String h1() {
        return this.c;
    }

    @Override // defpackage.mot
    public final boolean isSuccessful() {
        return this.a != null && this.c == null;
    }
}
