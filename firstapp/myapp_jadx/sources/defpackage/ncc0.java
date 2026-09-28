package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ncc0 {
    public final String a;
    public final String b;
    public final String c;
    public final List<enc0> d;

    public ncc0(String str, String str2, String str3, List<enc0> list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncc0)) {
            return false;
        }
        ncc0 ncc0Var = (ncc0) obj;
        return this.a.equals(ncc0Var.a) && this.b.equals(ncc0Var.b) && this.c.equals(ncc0Var.c) && Intrinsics.g(this.d, ncc0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return nve.a(this.c, ", teams=", ")", ux5.a("SportyLegendsLeague(leagueId=", this.a, ", leagueName=", this.b, ", iconUrl="), this.d);
    }
}
