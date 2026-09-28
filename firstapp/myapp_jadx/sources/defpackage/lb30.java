package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class lb30 implements ikh {
    public static final Charset c = Charset.forName("UTF-8");
    public final File a;
    public jb30 b;

    public static class a {
        public final byte[] a;
        public final int b;

        public a(int i, byte[] bArr) {
            this.a = bArr;
            this.b = i;
        }
    }

    public lb30(File file) {
        this.a = file;
    }

    @Override // defpackage.ikh
    public final void a() {
        ti8.b(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // defpackage.ikh
    public final String b() {
        a aVar;
        byte[] bArr;
        if (this.a.exists()) {
            d();
            jb30 jb30Var = this.b;
            if (jb30Var == null) {
                aVar = null;
            } else {
                int[] iArr = {0};
                byte[] bArr2 = new byte[jb30Var.H()];
                try {
                    this.b.g(new kb30(bArr2, iArr));
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                aVar = new a(iArr[0], bArr2);
            }
        } else {
            aVar = null;
        }
        if (aVar == null) {
            bArr = null;
        } else {
            int i = aVar.b;
            bArr = new byte[i];
            System.arraycopy(aVar.a, 0, bArr, 0, i);
        }
        if (bArr != null) {
            return new String(bArr, c);
        }
        return null;
    }

    @Override // defpackage.ikh
    public final void c(long j, String str) {
        d();
        if (this.b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "...".concat(str.substring(str.length() - Http2.INITIAL_MAX_FRAME_SIZE));
            }
            this.b.d(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(c));
            while (!this.b.l() && this.b.H() > 65536) {
                this.b.u();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }

    public final void d() {
        File file = this.a;
        if (this.b == null) {
            try {
                this.b = new jb30(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }
}
