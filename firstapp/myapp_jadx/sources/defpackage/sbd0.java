package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes6.dex */
public final class sbd0 implements pdd0 {
    public static final sbd0 a = new sbd0();
    public static final String b = AnalyticsEvent.SOCIAL_UNFOLLOW_CLICKED;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sbd0);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return -82946935;
    }

    public final String toString() {
        return "UnfollowPageClick";
    }
}
