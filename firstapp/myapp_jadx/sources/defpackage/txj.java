package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes7.dex */
public final class txj implements pdd0 {
    public static final txj a = new txj();
    public static final String b = AnalyticsEvent.GAMES_RECOMMENDATION_CAROUSEL_VIEW;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof txj);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return 1127367885;
    }

    public final String toString() {
        return "GamesCarouselSectionView";
    }
}
