package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class n3f0 {
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;

    public n3f0() {
        if (lo9.b == null) {
            lo9.b = new lo9();
        }
    }

    public final int a(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }
}
