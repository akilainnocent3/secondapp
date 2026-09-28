package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class pbd0 implements pdd0 {
    public static final pbd0 a = new pbd0();
    public static final String b = AnalyticsEvent.SOCIAL_PUBLISH_AT_CHOOSE_BET_CLICK;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pbd0);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return -718755286;
    }

    public final String toString() {
        return "PublishAtChooseBetClick";
    }
}
