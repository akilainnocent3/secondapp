package com.ironsource.mediationsdk.ads.nativead.interfaces;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface NativeAdDataInterface {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @m
        private final Drawable f62418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @m
        private final Uri f62419b;

        public Image(@m Drawable drawable, @m Uri uri) {
            this.f62418a = drawable;
            this.f62419b = uri;
        }

        @m
        public final Drawable getDrawable() {
            return this.f62418a;
        }

        @m
        public final Uri getUri() {
            return this.f62419b;
        }
    }

    @m
    String getAdvertiser();

    @m
    String getBody();

    @m
    String getCallToAction();

    @m
    Image getIcon();

    @m
    String getTitle();
}
