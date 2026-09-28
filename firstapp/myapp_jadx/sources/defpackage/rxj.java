package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes7.dex */
public final class rxj implements pdd0 {
    public static final rxj a = new rxj();
    public static final String b = AnalyticsEvent.GAMES_RECOMMENDATION_CAROUSEL_COLLAPSE;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rxj);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return -1225991723;
    }

    public final String toString() {
        return "GamesCarouselSectionCollapse";
    }
}
