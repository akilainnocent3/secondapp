package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class q8k0 extends lx30 implements Serializable {
    private static final a w = new a(null);
    public int c;
    public int d;
    public int e;
    public int f;
    public int i;
    public int v;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // defpackage.lx30
    public final int a(int i) {
        return (e() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.lx30
    public final int e() {
        int i = this.c;
        int i2 = i ^ (i >>> 2);
        this.c = this.d;
        this.d = this.e;
        this.e = this.f;
        int i3 = this.i;
        this.f = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.i = i4;
        int i5 = this.v + 362437;
        this.v = i5;
        return i4 + i5;
    }
}
