package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class c090 implements pdd0 {
    public static final c090 a = new c090();
    public static final String b = AnalyticsEvent.SOCIAL_SHARE_CODE_VIEW;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c090);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return 1651051929;
    }

    public final String toString() {
        return "ShareCodeView";
    }
}
