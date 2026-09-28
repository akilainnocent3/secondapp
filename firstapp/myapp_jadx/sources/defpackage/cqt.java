package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cqt implements pdd0 {
    public final String a = "loyalty__daily_reward_claim__click";

    public cqt(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqt) && Intrinsics.g(this.a, ((cqt) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("LoyaltyDailyRewardClaimClickEvent(name=", this.a, ")");
    }
}
