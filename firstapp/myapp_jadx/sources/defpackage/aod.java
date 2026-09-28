package defpackage;

import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class aod {
    public final ChannelAsset.Channel a;
    public final DepositDropAlertStatus b;
    public final boolean c;
    public final x000 d;

    public aod(ChannelAsset.Channel channel, DepositDropAlertStatus depositDropAlertStatus, boolean z, x000 x000Var) {
        depositDropAlertStatus.getClass();
        x000Var.getClass();
        this.a = channel;
        this.b = depositDropAlertStatus;
        this.c = z;
        this.d = x000Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aod)) {
            return false;
        }
        aod aodVar = (aod) obj;
        return Intrinsics.g(this.a, aodVar.a) && Intrinsics.g(this.b, aodVar.b) && this.c == aodVar.c && Intrinsics.g(this.d, aodVar.d);
    }

    public final int hashCode() {
        ChannelAsset.Channel channel = this.a;
        return this.d.hashCode() + mtg0.a((this.b.hashCode() + ((channel == null ? 0 : channel.hashCode()) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "DepositAlertCheckParams(channel=" + this.a + ", dropAlertStatus=" + this.b + ", isSupportPayBill=" + this.c + ", payBillInteractType=" + this.d + ")";
    }
}
