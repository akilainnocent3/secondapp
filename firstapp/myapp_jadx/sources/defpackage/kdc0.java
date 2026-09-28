package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kdc0 {
    public final List<ncc0> a;
    public final List<lgc0> b;

    public kdc0(List<ncc0> list, List<lgc0> list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdc0)) {
            return false;
        }
        kdc0 kdc0Var = (kdc0) obj;
        return Intrinsics.g(this.a, kdc0Var.a) && Intrinsics.g(this.b, kdc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return w9d.a("SportyLegendsLeaguesAndTeams(leagues=", ", recommendedMatches=", ")", this.a, this.b);
    }
}
