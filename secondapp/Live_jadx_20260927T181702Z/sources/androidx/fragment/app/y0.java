package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public StringBuilder f11126c = new StringBuilder(128);

    public y0(String str) {
        this.f11125b = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d();
    }

    public final void d() {
        if (this.f11126c.length() > 0) {
            Log.d(this.f11125b, this.f11126c.toString());
            StringBuilder sb2 = this.f11126c;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        d();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                d();
            } else {
                this.f11126c.append(c10);
            }
        }
    }
}
