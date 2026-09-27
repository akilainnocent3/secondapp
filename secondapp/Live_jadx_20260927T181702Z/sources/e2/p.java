package e2;

import android.util.Log;
import java.io.Writer;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public class p extends Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public StringBuilder f79812c = new StringBuilder(128);

    public p(String str) {
        this.f79811b = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d();
    }

    public final void d() {
        if (this.f79812c.length() > 0) {
            Log.d(this.f79811b, this.f79812c.toString());
            StringBuilder sb2 = this.f79812c;
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
                this.f79812c.append(c10);
            }
        }
    }
}
