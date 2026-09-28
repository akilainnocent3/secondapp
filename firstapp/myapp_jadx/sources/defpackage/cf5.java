package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cf5 {
    public static final int d = EventInRound.$stable;
    public final String a;
    public final EventInRound b;
    public final wf5 c;

    public cf5(String str, EventInRound eventInRound, wf5 wf5Var) {
        this.a = str;
        this.b = eventInRound;
        this.c = wf5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf5)) {
            return false;
        }
        cf5 cf5Var = (cf5) obj;
        return Intrinsics.g(this.a, cf5Var.a) && this.b.equals(cf5Var.b) && this.c.equals(cf5Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        return this.c.a.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "BuildAndGoItem(roundId=" + this.a + ", event=" + this.b + ", oddsItem=" + this.c + ")";
    }
}
