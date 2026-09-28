package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dqt implements pdd0 {
    public final String a = "loyalty__daily_reward_giveaway_claim__click";

    public dqt(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqt) && Intrinsics.g(this.a, ((dqt) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("LoyaltyDailyRewardGiveawayClaimClickEvent(name=", this.a, ")");
    }
}
