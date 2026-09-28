package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes5.dex */
public final class kbd0 implements pdd0 {
    public static final kbd0 a = new kbd0();
    public static final String b = AnalyticsEvent.SOCIAL_CHOOSE_MY_BET_VIEW;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kbd0);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return 1013341805;
    }

    public final String toString() {
        return "ChooseMyBetView";
    }
}
