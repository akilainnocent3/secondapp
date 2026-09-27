package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.MediaView;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.be, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3564be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InMobiNativeImage f56069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f56070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f56071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f56072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Float f56073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f56074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaView f56075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f56076j;

    public C3564be(String str, String str2, InMobiNativeImage iconImage, String str3, JSONObject extras, String str4, Float f10, boolean z10, MediaView mediaView, View view) {
        kotlin.jvm.internal.m0.p(iconImage, "iconImage");
        kotlin.jvm.internal.m0.p(extras, "extras");
        this.f56067a = str;
        this.f56068b = str2;
        this.f56069c = iconImage;
        this.f56070d = str3;
        this.f56071e = extras;
        this.f56072f = str4;
        this.f56073g = f10;
        this.f56074h = z10;
        this.f56075i = mediaView;
        this.f56076j = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3564be)) {
            return false;
        }
        C3564be c3564be = (C3564be) obj;
        return kotlin.jvm.internal.m0.g(this.f56067a, c3564be.f56067a) && kotlin.jvm.internal.m0.g(this.f56068b, c3564be.f56068b) && kotlin.jvm.internal.m0.g(this.f56069c, c3564be.f56069c) && kotlin.jvm.internal.m0.g(this.f56070d, c3564be.f56070d) && kotlin.jvm.internal.m0.g(this.f56071e, c3564be.f56071e) && kotlin.jvm.internal.m0.g(this.f56072f, c3564be.f56072f) && kotlin.jvm.internal.m0.g(this.f56073g, c3564be.f56073g) && this.f56074h == c3564be.f56074h && kotlin.jvm.internal.m0.g(this.f56075i, c3564be.f56075i) && kotlin.jvm.internal.m0.g(this.f56076j, c3564be.f56076j);
    }

    public final int hashCode() {
        String str = this.f56067a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f56068b;
        int iHashCode2 = (this.f56069c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f56070d;
        int iHashCode3 = (this.f56071e.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f56072f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f10 = this.f56073g;
        int iA = (g8.a.a(this.f56074h) + ((iHashCode4 + (f10 == null ? 0 : f10.hashCode())) * 31)) * 31;
        MediaView mediaView = this.f56075i;
        int iHashCode5 = (iA + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        View view = this.f56076j;
        return iHashCode5 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        return "NativePubData(title=" + this.f56067a + ", description=" + this.f56068b + ", iconImage=" + this.f56069c + ", ctaText=" + this.f56070d + ", extras=" + this.f56071e + ", sponsored=" + this.f56072f + ", adRating=" + this.f56073g + ", isVideo=" + this.f56074h + ", mediaView=" + this.f56075i + ", adChoiceIcon=" + this.f56076j + gi.j.f86771d;
    }
}
