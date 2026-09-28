package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes6.dex */
public final class jbd0 implements pdd0 {
    public static final jbd0 a = new jbd0();
    public static final String b = AnalyticsEvent.SOCIAL_BOOKING_CODE_TAB_VIEW;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jbd0);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return -1812836966;
    }

    public final String toString() {
        return "BookingCodeTabView";
    }
}
