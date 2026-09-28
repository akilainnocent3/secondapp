package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes6.dex */
public final class mbd0 implements pdd0 {
    public static final mbd0 a = new mbd0();
    public static final String b = AnalyticsEvent.SOCIAL_FIND_FRIENDS_CLICKED;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mbd0);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return 681076050;
    }

    public final String toString() {
        return "FindFriendsClick";
    }
}
