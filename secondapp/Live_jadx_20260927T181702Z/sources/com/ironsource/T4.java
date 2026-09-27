package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface T4 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        @oy.m
        ISDemandOnlyBannerLayout a(@oy.m Activity activity, @oy.m ISBannerSize iSBannerSize);

        void a(@oy.m Activity activity, @oy.m ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, @oy.m String str);

        void e(@oy.m String str);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void a(@oy.m Activity activity, @oy.m String str);

        void a(@oy.m ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener);

        void b(@oy.m Activity activity, @oy.m String str, @oy.m String str2);

        void c(@oy.m String str);

        boolean d(@oy.m String str);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void a(@oy.m Activity activity, @oy.m String str, @oy.m String str2);

        void a(@oy.m ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener);

        void a(@oy.m String str);

        void b(@oy.m Activity activity, @oy.m String str);

        boolean j(@oy.m String str);
    }

    @oy.m
    String a(@oy.l Context context);
}
