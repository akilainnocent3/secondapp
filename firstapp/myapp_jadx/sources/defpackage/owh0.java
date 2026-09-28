package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class owh0 extends mwh0 {
    public final float A;
    public final float B;
    public final float C;
    public final String a;
    public final List<qxz> b;
    public final int c;
    public final ya5 d;
    public final float e;
    public final ya5 f;
    public final float i;
    public final float v;
    public final int w;
    public final int y;
    public final float z;

    /* JADX WARN: Multi-variable type inference failed */
    public owh0(String str, List<? extends qxz> list, int i, ya5 ya5Var, float f, ya5 ya5Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = ya5Var;
        this.e = f;
        this.f = ya5Var2;
        this.i = f2;
        this.v = f3;
        this.w = i2;
        this.y = i3;
        this.z = f4;
        this.A = f5;
        this.B = f6;
        this.C = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && owh0.class == obj.getClass()) {
            owh0 owh0Var = (owh0) obj;
            return Intrinsics.g(this.a, owh0Var.a) && Intrinsics.g(this.d, owh0Var.d) && this.e == owh0Var.e && Intrinsics.g(this.f, owh0Var.f) && this.i == owh0Var.i && this.v == owh0Var.v && this.w == owh0Var.w && this.y == owh0Var.y && this.z == owh0Var.z && this.A == owh0Var.A && this.B == owh0Var.B && this.C == owh0Var.C && this.c == owh0Var.c && Intrinsics.g(this.b, owh0Var.b);
        }
        return false;
    }

    public final int hashCode() {
        int iA = ai50.a(this.a.hashCode() * 31, 31, this.b);
        ya5 ya5Var = this.d;
        int iA2 = tvh.a(this.e, (iA + (ya5Var != null ? ya5Var.hashCode() : 0)) * 31, 31);
        ya5 ya5Var2 = this.f;
        return Integer.hashCode(this.c) + tvh.a(this.C, tvh.a(this.B, tvh.a(this.A, tvh.a(this.z, gpp.a(this.y, gpp.a(this.w, tvh.a(this.v, tvh.a(this.i, (iA2 + (ya5Var2 != null ? ya5Var2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
