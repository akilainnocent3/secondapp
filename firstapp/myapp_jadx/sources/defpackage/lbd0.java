package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes6.dex */
public final class lbd0 implements pdd0 {
    public static final lbd0 a = new lbd0();
    public static final String b = AnalyticsEvent.SOCIAL_CODE_HUB_CLICKED;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lbd0);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return 2102296998;
    }

    public final String toString() {
        return "CodeHubClick";
    }
}
