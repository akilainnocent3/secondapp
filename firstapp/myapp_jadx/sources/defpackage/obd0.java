package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes6.dex */
public final class obd0 implements pdd0 {
    public static final obd0 a = new obd0();
    public static final String b = AnalyticsEvent.SOCIAL_FOLLOWING_ADD_TO_BETSLIP_CLICK;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof obd0);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return 678354376;
    }

    public final String toString() {
        return "FollowingAddToBetslipClick";
    }
}
