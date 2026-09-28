package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes6.dex */
public final class nbd0 implements pdd0 {
    public static final nbd0 a = new nbd0();
    public static final String b = AnalyticsEvent.SOCIAL_FOLLOW_CLICKED;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nbd0);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return 273772226;
    }

    public final String toString() {
        return "FollowPageClick";
    }
}
