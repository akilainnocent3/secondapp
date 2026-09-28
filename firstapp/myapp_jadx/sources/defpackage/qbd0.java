package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes5.dex */
public final class qbd0 implements pdd0 {
    public static final qbd0 a = new qbd0();
    public static final String b = AnalyticsEvent.SOCIAL_PUBLISH_MY_BET_CANCEL_CLICK;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qbd0);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return 1789443858;
    }

    public final String toString() {
        return "PublishMyBetCancelClick";
    }
}
