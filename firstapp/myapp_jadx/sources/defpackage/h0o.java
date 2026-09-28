package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h0o implements Serializable {
    public final String a;
    public final u3o b;

    public h0o(String str, u3o u3oVar) {
        str.getClass();
        u3oVar.getClass();
        this.a = str;
        this.b = u3oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0o)) {
            return false;
        }
        h0o h0oVar = (h0o) obj;
        return Intrinsics.g(this.a, h0oVar.a) && Intrinsics.g(this.b, h0oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InstantRacingRaceInput(sportId=" + this.a + ", settleRound=" + this.b + ")";
    }
}
