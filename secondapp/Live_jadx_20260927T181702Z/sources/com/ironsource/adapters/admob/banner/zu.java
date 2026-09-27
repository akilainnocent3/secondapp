package com.ironsource.adapters.admob.banner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class zu {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private FrameLayout.LayoutParams f60630zr;

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    private zv f60631zs;
    private final NativeAdView zz;

    public zu(ISBannerSize iSBannerSize, zv zvVar, Context context) {
        FrameLayout.LayoutParams layoutParams;
        this.f60631zs = zvVar;
        String description = iSBannerSize.getDescription();
        description.getClass();
        switch (description) {
            case "RECTANGLE":
                this.f60630zr = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 300), AdapterUtils.dpToPixels(context, 250));
                break;
            case "LARGE":
                layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 320), AdapterUtils.dpToPixels(context, 90));
                this.f60630zr = layoutParams;
                break;
            case "SMART":
            case "BANNER":
                layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 320), AdapterUtils.dpToPixels(context, 50));
                this.f60630zr = layoutParams;
                break;
        }
        this.f60630zr.gravity = 17;
        this.zz = (NativeAdView) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.f60631zs.zs(), (ViewGroup) null);
    }

    public NativeAdView zr() {
        return this.zz;
    }

    public FrameLayout.LayoutParams zz() {
        return this.f60630zr;
    }
}
