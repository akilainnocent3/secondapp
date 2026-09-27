package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import yads.d52;
import yads.g31;
import yv.g;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@g
public final class ImageAppearance implements Parcelable, d52 {

    @l
    public static final Parcelable.Creator<ImageAppearance> CREATOR = new g31();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SizeConstraint f76983b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SizeConstraint f76984a;

        @l
        public final ImageAppearance build() {
            return new ImageAppearance(this.f76984a, null);
        }

        @l
        public final Builder setWidthConstraint(@m SizeConstraint sizeConstraint) {
            this.f76984a = sizeConstraint;
            return this;
        }
    }

    public /* synthetic */ ImageAppearance(SizeConstraint sizeConstraint, x xVar) {
        this(sizeConstraint);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(ImageAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        m0.n(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.ImageAppearance");
        return m0.g(getWidthConstraint(), ((ImageAppearance) obj).getWidthConstraint());
    }

    public int hashCode() {
        SizeConstraint widthConstraint = getWidthConstraint();
        if (widthConstraint != null) {
            return widthConstraint.hashCode();
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel, int i10) {
        SizeConstraint sizeConstraint = this.f76983b;
        if (sizeConstraint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sizeConstraint.writeToParcel(parcel, i10);
        }
    }

    private ImageAppearance(SizeConstraint sizeConstraint) {
        this.f76983b = sizeConstraint;
    }

    @Override // yads.d52
    @m
    public SizeConstraint getWidthConstraint() {
        return this.f76983b;
    }
}
