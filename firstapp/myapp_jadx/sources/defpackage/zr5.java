package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zr5 {
    public final tkf0 a;

    public zr5(tkf0 tkf0Var) {
        this.a = tkf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr5)) {
            return false;
        }
        tkf0 tkf0Var = this.a;
        nk0 nk0Var = tkf0Var.a;
        tkf0 tkf0Var2 = ((zr5) obj).a;
        return Intrinsics.g(nk0Var, tkf0Var2.a) && tkf0Var.b.d(tkf0Var2.b) && Intrinsics.g(tkf0Var.c, tkf0Var2.c) && tkf0Var.d == tkf0Var2.d && tkf0Var.e == tkf0Var2.e && tkf0Var.f == tkf0Var2.f && Intrinsics.g(tkf0Var.g, tkf0Var2.g) && tkf0Var.h == tkf0Var2.h && tkf0Var.i == tkf0Var2.i && kxa.c(tkf0Var.j, tkf0Var2.j);
    }

    public final int hashCode() {
        tkf0 tkf0Var = this.a;
        int iHashCode = tkf0Var.a.hashCode() * 31;
        imf0 imf0Var = tkf0Var.b;
        ora0 ora0Var = imf0Var.a;
        long j = ora0Var.b;
        pmf0[] pmf0VarArr = omf0.b;
        int iHashCode2 = Long.hashCode(j) * 31;
        t9i t9iVar = ora0Var.c;
        int i = (iHashCode2 + (t9iVar != null ? t9iVar.a : 0)) * 31;
        n9i n9iVar = ora0Var.d;
        int iHashCode3 = (i + (n9iVar != null ? Integer.hashCode(n9iVar.a) : 0)) * 31;
        o9i o9iVar = ora0Var.e;
        int iHashCode4 = (iHashCode3 + (o9iVar != null ? Integer.hashCode(o9iVar.a) : 0)) * 31;
        f8i f8iVar = ora0Var.f;
        int iHashCode5 = (iHashCode4 + (f8iVar != null ? f8iVar.hashCode() : 0)) * 31;
        String str = ora0Var.g;
        int iA = f87.a((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, ora0Var.h, 31);
        t82 t82Var = ora0Var.i;
        int iHashCode6 = (iA + (t82Var != null ? Float.hashCode(t82Var.a) : 0)) * 31;
        ljf0 ljf0Var = ora0Var.j;
        int iHashCode7 = (iHashCode6 + (ljf0Var != null ? ljf0Var.hashCode() : 0)) * 31;
        cet cetVar = ora0Var.k;
        int iHashCode8 = (iHashCode7 + (cetVar != null ? cetVar.a.hashCode() : 0)) * 31;
        long j2 = ora0Var.l;
        int i2 = j58.n;
        nbh0.a aVar = nbh0.b;
        int iA2 = f87.a(iHashCode8, j2, 31);
        kk10 kk10Var = ora0Var.o;
        int iHashCode9 = (imf0Var.b.hashCode() + ((iA2 + (kk10Var != null ? kk10Var.hashCode() : 0)) * 31)) * 31;
        uk10 uk10Var = imf0Var.c;
        return Long.hashCode(tkf0Var.j) + ((tkf0Var.i.hashCode() + ((tkf0Var.h.hashCode() + ((tkf0Var.g.hashCode() + gpp.a(tkf0Var.f, mtg0.a((ai50.a((iHashCode9 + (uk10Var != null ? uk10Var.hashCode() : 0) + iHashCode) * 31, 31, tkf0Var.c) + tkf0Var.d) * 31, 31, tkf0Var.e), 31)) * 31)) * 31)) * 31);
    }
}
