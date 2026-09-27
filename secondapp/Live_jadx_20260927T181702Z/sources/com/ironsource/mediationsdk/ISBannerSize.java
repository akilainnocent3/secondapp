package com.ironsource.mediationsdk;

import android.content.Context;
import com.ironsource.Y7;
import com.unity3d.mediation.LevelPlayAdSize;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class ISBannerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f62381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f62382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f62383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f62384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Y7 f62385e;
    public static final ISBannerSize BANNER = l.a("BANNER", 320, 50);
    public static final ISBannerSize LARGE = l.a(l.f62700b, 320, 90);
    public static final ISBannerSize RECTANGLE = l.a(l.f62701c, 300, 250);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final ISBannerSize f62380f = l.a();
    public static final ISBannerSize SMART = l.a(l.f62703e, 0, 0);

    public ISBannerSize(int i10, int i11) {
        this("CUSTOM", i10, i11);
    }

    public static int getMaximalAdaptiveHeight(int i10) {
        return l.b(i10);
    }

    public void a(Y7 y10) {
        if (l.a(y10, this.f62381a, this.f62382b)) {
            this.f62385e = y10;
        }
    }

    public String getDescription() {
        return this.f62383c;
    }

    public int getHeight() {
        return this.f62382b;
    }

    public int getWidth() {
        return this.f62381a;
    }

    public boolean isAdaptive() {
        return this.f62384d;
    }

    public boolean isSmart() {
        return this.f62383c.equals(l.f62703e);
    }

    public void setAdaptive(boolean z10) {
        this.f62384d = z10;
    }

    public LevelPlayAdSize toLevelPlayAdSize(Context context) {
        if (isAdaptive()) {
            return LevelPlayAdSize.createAdaptiveAdSize(context, Integer.valueOf(this.f62385e.d()));
        }
        String description = getDescription();
        description.getClass();
        switch (description) {
            case "RECTANGLE":
            case "MEDIUM_RECTANGLE":
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            case "LARGE":
                return LevelPlayAdSize.LARGE;
            case "BANNER":
                return LevelPlayAdSize.BANNER;
            case "CUSTOM":
                return LevelPlayAdSize.createCustomSize(this.f62381a, this.f62382b);
            default:
                return LevelPlayAdSize.BANNER;
        }
    }

    public ISBannerSize(String str, int i10, int i11) {
        this.f62383c = str;
        this.f62381a = i10;
        this.f62382b = i11;
        this.f62385e = new Y7(i10, i11);
    }
}
