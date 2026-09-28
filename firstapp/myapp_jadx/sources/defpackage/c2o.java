package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c2o {
    public final fqo a;
    public final g0o b;

    public c2o(fqo fqoVar, g0o g0oVar) {
        fqoVar.getClass();
        this.a = fqoVar;
        this.b = g0oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2o)) {
            return false;
        }
        c2o c2oVar = (c2o) obj;
        return Intrinsics.g(this.a, c2oVar.a) && Intrinsics.g(this.b, c2oVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        g0o g0oVar = this.b;
        return iHashCode + (g0oVar == null ? 0 : g0oVar.hashCode());
    }

    public final String toString() {
        return "InstantRacingRaceUiState(topAppBarState=" + this.a + ", contentState=" + this.b + ")";
    }
}
