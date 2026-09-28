package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class dtg {
    public final Event a;
    public final long b;

    public dtg(Event event) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        event.getClass();
        this.a = event;
        this.b = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtg)) {
            return false;
        }
        dtg dtgVar = (dtg) obj;
        return Intrinsics.g(this.a, dtgVar.a) && this.b == dtgVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EventWrapper(event=" + this.a + ", updatedAt=" + this.b + ")";
    }
}
