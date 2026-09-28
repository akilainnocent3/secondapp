package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class sfd0 {
    public final imf0 a;
    public final imf0 b;
    public final imf0 c;
    public final imf0 d;
    public final imf0 e;
    public final imf0 f;
    public final imf0 g;
    public final imf0 h;

    public sfd0(int i) {
        imf0 imf0Var = new imf0(0L, 0L, t9i.A, null, null, 0L, null, null, 0, 0L, null, null, 16777211);
        t9i t9iVar = t9i.B;
        imf0 imf0Var2 = new imf0(0L, 0L, t9iVar, null, null, 0L, null, null, 0, 0L, null, null, 16777211);
        imf0 imf0Var3 = new imf0(0L, 0L, t9i.C, null, null, 0L, null, null, 0, 0L, null, null, 16777211);
        t9i t9iVar2 = t9i.E;
        imf0 imf0Var4 = new imf0(0L, 0L, t9iVar2, null, null, 0L, null, null, 0, 0L, null, null, 16777211);
        t9i t9iVar3 = t9i.G;
        imf0 imf0Var5 = new imf0(0L, 0L, t9iVar3, null, null, 0L, null, null, 0, 0L, null, null, 16777211);
        imf0 imf0Var6 = new imf0(0L, 0L, t9iVar2, new n9i(1), null, 0L, null, null, 0, 0L, null, null, 16777203);
        imf0 imf0Var7 = new imf0(0L, 0L, t9iVar3, new n9i(1), null, 0L, null, null, 0, 0L, null, null, 16777203);
        imf0 imf0Var8 = new imf0(0L, 0L, t9iVar, new n9i(1), null, 0L, null, null, 0, 0L, null, null, 16777203);
        this.a = imf0Var;
        this.b = imf0Var2;
        this.c = imf0Var3;
        this.d = imf0Var4;
        this.e = imf0Var5;
        this.f = imf0Var6;
        this.g = imf0Var7;
        this.h = imf0Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfd0)) {
            return false;
        }
        sfd0 sfd0Var = (sfd0) obj;
        return Intrinsics.g(this.a, sfd0Var.a) && Intrinsics.g(this.b, sfd0Var.b) && Intrinsics.g(this.c, sfd0Var.c) && Intrinsics.g(this.d, sfd0Var.d) && Intrinsics.g(this.e, sfd0Var.e) && Intrinsics.g(this.f, sfd0Var.f) && Intrinsics.g(this.g, sfd0Var.g) && Intrinsics.g(this.h, sfd0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + gg8.b(gg8.b(gg8.b(gg8.b(gg8.b(gg8.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "SportyTypography(light=" + this.a + ", regular=" + this.b + ", medium=" + this.c + ", bold=" + this.d + ", extraBold=" + this.e + ", boldItalic=" + this.f + ", extraBoldItalic=" + this.g + ", regularItalic=" + this.h + ")";
    }

    public sfd0() {
        this(0);
    }
}
