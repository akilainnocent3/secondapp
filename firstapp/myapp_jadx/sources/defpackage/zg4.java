package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zg4 {
    public final int a;
    public final long b;
    public final float c;
    public final String d;
    public final hh4 e;
    public final int f;

    public zg4(int i, long j, float f, String str, hh4 hh4Var) {
        this.a = i;
        this.b = j;
        this.c = f;
        this.d = str;
        this.e = hh4Var;
        this.f = i / 3;
    }

    public static zg4 a(zg4 zg4Var, long j, hh4 hh4Var, int i) {
        int i2 = zg4Var.a;
        if ((i & 2) != 0) {
            j = zg4Var.b;
        }
        long j2 = j;
        float f = zg4Var.c;
        String str = zg4Var.d;
        if ((i & 16) != 0) {
            hh4Var = zg4Var.e;
        }
        hh4 hh4Var2 = hh4Var;
        zg4Var.getClass();
        str.getClass();
        hh4Var2.getClass();
        return new zg4(i2, j2, f, str, hh4Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg4)) {
            return false;
        }
        zg4 zg4Var = (zg4) obj;
        return this.a == zg4Var.a && j7f.b(this.b, zg4Var.b) && g7f.b(this.c, zg4Var.c) && Intrinsics.g(this.d, zg4Var.d) && Intrinsics.g(this.e, zg4Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(tvh.a(this.c, f87.a(Integer.hashCode(this.a) * 31, this.b, 31), 31), 31, this.d);
    }

    public final String toString() {
        String strE = j7f.e(this.b);
        String strC = g7f.c(this.c);
        StringBuilder sbA = uqe0.a(this.a, "BoardInfo(id=", ", offset=", strE, ", size=");
        hxa.c(sbA, strC, ", backBoardImg=", this.d, ", boardState=");
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }
}
