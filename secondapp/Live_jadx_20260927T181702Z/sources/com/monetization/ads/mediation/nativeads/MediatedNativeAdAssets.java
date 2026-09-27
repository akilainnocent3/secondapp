package com.monetization.ads.mediation.nativeads;

import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class MediatedNativeAdAssets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f71892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f71893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f71894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f71895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MediatedNativeAdImage f71896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final MediatedNativeAdImage f71897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final MediatedNativeAdImage f71898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final MediatedNativeAdMedia f71899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f71900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f71901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f71902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f71903l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f71904m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f71905n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final MediatedNativeAdImage f71906o;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f71907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f71908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f71909c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f71910d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private MediatedNativeAdImage f71911e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private MediatedNativeAdImage f71912f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private MediatedNativeAdImage f71913g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private MediatedNativeAdMedia f71914h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f71915i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f71916j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f71917k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f71918l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f71919m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f71920n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private MediatedNativeAdImage f71921o;

        @l
        public final MediatedNativeAdAssets build() {
            return new MediatedNativeAdAssets(this.f71907a, this.f71908b, this.f71909c, this.f71910d, this.f71911e, this.f71912f, this.f71913g, this.f71914h, this.f71915i, this.f71916j, this.f71917k, this.f71918l, this.f71919m, this.f71920n, this.f71921o, null);
        }

        @l
        public final Builder setAge(@m String str) {
            this.f71907a = str;
            return this;
        }

        @l
        public final Builder setBody(@m String str) {
            this.f71908b = str;
            return this;
        }

        @l
        public final Builder setCallToAction(@m String str) {
            this.f71909c = str;
            return this;
        }

        @l
        public final Builder setDomain(@m String str) {
            this.f71910d = str;
            return this;
        }

        @l
        public final Builder setFavicon(@m MediatedNativeAdImage mediatedNativeAdImage) {
            this.f71911e = mediatedNativeAdImage;
            return this;
        }

        @l
        public final Builder setFeedback(@m MediatedNativeAdImage mediatedNativeAdImage) {
            this.f71921o = mediatedNativeAdImage;
            return this;
        }

        @l
        public final Builder setIcon(@m MediatedNativeAdImage mediatedNativeAdImage) {
            this.f71912f = mediatedNativeAdImage;
            return this;
        }

        @l
        public final Builder setImage(@m MediatedNativeAdImage mediatedNativeAdImage) {
            this.f71913g = mediatedNativeAdImage;
            return this;
        }

        @l
        public final Builder setMedia(@m MediatedNativeAdMedia mediatedNativeAdMedia) {
            this.f71914h = mediatedNativeAdMedia;
            return this;
        }

        @l
        public final Builder setPrice(@m String str) {
            this.f71915i = str;
            return this;
        }

        @l
        public final Builder setRating(@m String str) {
            this.f71916j = str;
            return this;
        }

        @l
        public final Builder setReviewCount(@m String str) {
            this.f71917k = str;
            return this;
        }

        @l
        public final Builder setSponsored(@m String str) {
            this.f71918l = str;
            return this;
        }

        @l
        public final Builder setTitle(@m String str) {
            this.f71919m = str;
            return this;
        }

        @l
        public final Builder setWarning(@m String str) {
            this.f71920n = str;
            return this;
        }
    }

    public /* synthetic */ MediatedNativeAdAssets(String str, String str2, String str3, String str4, MediatedNativeAdImage mediatedNativeAdImage, MediatedNativeAdImage mediatedNativeAdImage2, MediatedNativeAdImage mediatedNativeAdImage3, MediatedNativeAdMedia mediatedNativeAdMedia, String str5, String str6, String str7, String str8, String str9, String str10, MediatedNativeAdImage mediatedNativeAdImage4, x xVar) {
        this(str, str2, str3, str4, mediatedNativeAdImage, mediatedNativeAdImage2, mediatedNativeAdImage3, mediatedNativeAdMedia, str5, str6, str7, str8, str9, str10, mediatedNativeAdImage4);
    }

    @m
    public final String getAge() {
        return this.f71892a;
    }

    @m
    public final String getBody() {
        return this.f71893b;
    }

    @m
    public final String getCallToAction() {
        return this.f71894c;
    }

    @m
    public final String getDomain() {
        return this.f71895d;
    }

    @m
    public final MediatedNativeAdImage getFavicon() {
        return this.f71896e;
    }

    @m
    public final MediatedNativeAdImage getFeedback() {
        return this.f71906o;
    }

    @m
    public final MediatedNativeAdImage getIcon() {
        return this.f71897f;
    }

    @m
    public final MediatedNativeAdImage getImage() {
        return this.f71898g;
    }

    @m
    public final MediatedNativeAdMedia getMedia() {
        return this.f71899h;
    }

    @m
    public final String getPrice() {
        return this.f71900i;
    }

    @m
    public final String getRating() {
        return this.f71901j;
    }

    @m
    public final String getReviewCount() {
        return this.f71902k;
    }

    @m
    public final String getSponsored() {
        return this.f71903l;
    }

    @m
    public final String getTitle() {
        return this.f71904m;
    }

    @m
    public final String getWarning() {
        return this.f71905n;
    }

    private MediatedNativeAdAssets(String str, String str2, String str3, String str4, MediatedNativeAdImage mediatedNativeAdImage, MediatedNativeAdImage mediatedNativeAdImage2, MediatedNativeAdImage mediatedNativeAdImage3, MediatedNativeAdMedia mediatedNativeAdMedia, String str5, String str6, String str7, String str8, String str9, String str10, MediatedNativeAdImage mediatedNativeAdImage4) {
        this.f71892a = str;
        this.f71893b = str2;
        this.f71894c = str3;
        this.f71895d = str4;
        this.f71896e = mediatedNativeAdImage;
        this.f71897f = mediatedNativeAdImage2;
        this.f71898g = mediatedNativeAdImage3;
        this.f71899h = mediatedNativeAdMedia;
        this.f71900i = str5;
        this.f71901j = str6;
        this.f71902k = str7;
        this.f71903l = str8;
        this.f71904m = str9;
        this.f71905n = str10;
        this.f71906o = mediatedNativeAdImage4;
    }
}
