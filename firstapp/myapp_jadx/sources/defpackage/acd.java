package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class acd {
    public final byte[] a = new byte[8];
    public final ArrayDeque<a> b = new ArrayDeque<>();
    public final nvh0 c = new nvh0();
    public idv.a d;
    public int e;
    public int f;
    public long g;

    public static final class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public final long a(l4h l4hVar, int i) {
        byte[] bArr = this.a;
        l4hVar.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
