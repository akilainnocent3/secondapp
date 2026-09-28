package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.TicketResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xho {
    public final boolean a;
    public final TicketResult b;

    public xho(boolean z, TicketResult ticketResult) {
        this.a = z;
        this.b = ticketResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xho)) {
            return false;
        }
        xho xhoVar = (xho) obj;
        return this.a == xhoVar.a && Intrinsics.g(this.b, xhoVar.b);
    }

    public final int hashCode() {
        int iA = mtg0.a(Boolean.hashCode(false) * 31, 31, this.a);
        TicketResult ticketResult = this.b;
        return (iA + (ticketResult != null ? ticketResult.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "InstantWinPlaceBetResult(isLegends=false, limitExceeded=" + this.a + ", ticketResult=" + this.b + ", roundInfo=null)";
    }
}
