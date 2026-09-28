package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes6.dex */
public final class rbd0 implements pdd0 {
    public static final rbd0 a = new rbd0();
    public static final String b = AnalyticsEvent.SOCIAL_SHARE_MY_BET_CLICK;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rbd0);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return 1466954172;
    }

    public final String toString() {
        return "ShareMyBetClick";
    }
}
