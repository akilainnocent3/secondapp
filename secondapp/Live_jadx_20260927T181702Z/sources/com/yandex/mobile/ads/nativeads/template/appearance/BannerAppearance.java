package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import yads.a52;
import yads.qm;
import yv.g;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@g
public final class BannerAppearance implements Parcelable, a52 {

    @l
    public static final Parcelable.Creator<BannerAppearance> CREATOR = new qm();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HorizontalOffset f76963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HorizontalOffset f76964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f76965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f76966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f76967f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f76968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f76969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f76970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private HorizontalOffset f76971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private HorizontalOffset f76972e;

        @l
        public final BannerAppearance build() {
            return new BannerAppearance(this.f76971d, this.f76972e, this.f76968a, this.f76969b, this.f76970c, null);
        }

        @l
        public final Builder setBackgroundColor(int i10) {
            this.f76968a = i10;
            return this;
        }

        @l
        public final Builder setBorderColor(int i10) {
            this.f76969b = i10;
            return this;
        }

        @l
        public final Builder setBorderWidth(float f10) {
            this.f76970c = f10;
            return this;
        }

        @l
        public final Builder setContentPadding(@m HorizontalOffset horizontalOffset) {
            this.f76971d = horizontalOffset;
            return this;
        }

        @l
        public final Builder setImageMargins(@m HorizontalOffset horizontalOffset) {
            this.f76972e = horizontalOffset;
            return this;
        }
    }

    public /* synthetic */ BannerAppearance(HorizontalOffset horizontalOffset, HorizontalOffset horizontalOffset2, int i10, int i11, float f10, x xVar) {
        this(horizontalOffset, horizontalOffset2, i10, i11, f10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(BannerAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        m0.n(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.BannerAppearance");
        BannerAppearance bannerAppearance = (BannerAppearance) obj;
        return m0.g(getContentPadding(), bannerAppearance.getContentPadding()) && m0.g(getImageMargins(), bannerAppearance.getImageMargins()) && getBackgroundColor() == bannerAppearance.getBackgroundColor() && getBorderColor() == bannerAppearance.getBorderColor() && getBorderWidth() == bannerAppearance.getBorderWidth();
    }

    @Override // yads.a52
    public int getBackgroundColor() {
        return this.f76965d;
    }

    @Override // yads.a52
    public int getBorderColor() {
        return this.f76966e;
    }

    @Override // yads.a52
    public float getBorderWidth() {
        return this.f76967f;
    }

    public int hashCode() {
        HorizontalOffset contentPadding = getContentPadding();
        int iHashCode = (contentPadding != null ? contentPadding.hashCode() : 0) * 31;
        HorizontalOffset imageMargins = getImageMargins();
        return Float.floatToIntBits(getBorderWidth()) + ((getBorderColor() + ((getBackgroundColor() + ((iHashCode + (imageMargins != null ? imageMargins.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel, int i10) {
        HorizontalOffset horizontalOffset = this.f76963b;
        if (horizontalOffset == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            horizontalOffset.writeToParcel(parcel, i10);
        }
        HorizontalOffset horizontalOffset2 = this.f76964c;
        if (horizontalOffset2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            horizontalOffset2.writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.f76965d);
        parcel.writeInt(this.f76966e);
        parcel.writeFloat(this.f76967f);
    }

    private BannerAppearance(HorizontalOffset horizontalOffset, HorizontalOffset horizontalOffset2, int i10, int i11, float f10) {
        this.f76963b = horizontalOffset;
        this.f76964c = horizontalOffset2;
        this.f76965d = i10;
        this.f76966e = i11;
        this.f76967f = f10;
    }

    @Override // yads.a52
    @m
    public HorizontalOffset getContentPadding() {
        return this.f76963b;
    }

    @Override // yads.a52
    @m
    public HorizontalOffset getImageMargins() {
        return this.f76964c;
    }
}
