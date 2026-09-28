package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes6.dex */
public final class ibd0 implements pdd0 {
    public static final ibd0 a = new ibd0();
    public static final String b = AnalyticsEvent.SOCIAL_ADD_TO_BETSLIP;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ibd0);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return 1798159501;
    }

    public final String toString() {
        return "AddToBetslipClick";
    }
}
