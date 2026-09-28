package defpackage;

import com.sporty.android.core.model.luckywheel.LuckyWheelSpinResponse;
import com.sporty.android.core.model.luckywheel.TicketInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class acb0 {
    public final lk50<LuckyWheelSpinResponse> a;
    public final TicketInfo b;

    public acb0(lk50<LuckyWheelSpinResponse> lk50Var, TicketInfo ticketInfo) {
        lk50Var.getClass();
        this.a = lk50Var;
        this.b = ticketInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acb0)) {
            return false;
        }
        acb0 acb0Var = (acb0) obj;
        return Intrinsics.g(this.a, acb0Var.a) && Intrinsics.g(this.b, acb0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        TicketInfo ticketInfo = this.b;
        return iHashCode + (ticketInfo == null ? 0 : ticketInfo.hashCode());
    }

    public final String toString() {
        return "SpinResult(result=" + this.a + ", ticketInfo=" + this.b + ")";
    }
}
