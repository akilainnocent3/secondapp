package com.yandex.mobile.ads.feed;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class FeedAdAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f76851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f76852b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f76853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Double f76854b;

        public Builder(int i10) {
            this.f76853a = i10;
        }

        @l
        public final FeedAdAppearance build() {
            return new FeedAdAppearance(Integer.valueOf(this.f76853a), this.f76854b);
        }

        @l
        public final Builder setCardCornerRadius(@m Double d10) {
            this.f76854b = d10;
            return this;
        }
    }

    public FeedAdAppearance(@m Integer num, @m Double d10) {
        this.f76851a = num;
        this.f76852b = d10;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !m0.g(FeedAdAppearance.class, obj.getClass())) {
            return false;
        }
        FeedAdAppearance feedAdAppearance = (FeedAdAppearance) obj;
        if (m0.g(this.f76851a, feedAdAppearance.f76851a)) {
            return m0.d(this.f76852b, feedAdAppearance.f76852b);
        }
        return false;
    }

    @m
    public final Double getCardCornerRadius() {
        return this.f76852b;
    }

    @m
    public final Integer getCardWidth() {
        return this.f76851a;
    }

    public int hashCode() {
        Integer num = this.f76851a;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Double d10 = this.f76852b;
        return iHashCode + (d10 != null ? d10.hashCode() : 0);
    }
}
