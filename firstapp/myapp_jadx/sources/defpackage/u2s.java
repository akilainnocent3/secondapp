package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u2s {
    public final String a;
    public final List<u3s> b;

    public u2s(String str, List<u3s> list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2s)) {
            return false;
        }
        u2s u2sVar = (u2s) obj;
        return this.a.equals(u2sVar.a) && Intrinsics.g(this.b, u2sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nf.b("LeagueStats(leagueName=", this.a, ", teamInfos=", ")", this.b);
    }
}
