package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qci implements cfi {
    public final rci a;

    public qci(rci rciVar) {
        rciVar.getClass();
        this.a = rciVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qci) && Intrinsics.g(this.a, ((qci) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FootballFamilySettlementLeagueTabContentState(status=" + this.a + ")";
    }
}
