package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes7.dex */
public final class sxj implements pdd0 {
    public static final sxj a = new sxj();
    public static final String b = AnalyticsEvent.GAMES_RECOMMENDATION_CAROUSEL_EXPAND;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof sxj);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return 596246210;
    }

    public final String toString() {
        return "GamesCarouselSectionExpand";
    }
}
