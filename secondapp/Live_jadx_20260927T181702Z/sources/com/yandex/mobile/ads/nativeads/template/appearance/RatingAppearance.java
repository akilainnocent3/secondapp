package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import yads.e52;
import yads.sl2;
import yv.g;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@g
public final class RatingAppearance implements Parcelable, e52 {

    @l
    public static final Parcelable.Creator<RatingAppearance> CREATOR = new sl2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f77013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f77014c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f77015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f77016b;

        @l
        public final RatingAppearance build() {
            return new RatingAppearance(this.f77015a, this.f77016b, null);
        }

        @l
        public final Builder setBackgroundStarColor(int i10) {
            this.f77015a = i10;
            return this;
        }

        @l
        public final Builder setProgressStarColor(int i10) {
            this.f77016b = i10;
            return this;
        }
    }

    public /* synthetic */ RatingAppearance(int i10, int i11, x xVar) {
        this(i10, i11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(RatingAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        m0.n(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance");
        RatingAppearance ratingAppearance = (RatingAppearance) obj;
        return getBackgroundStarColor() == ratingAppearance.getBackgroundStarColor() && getProgressStarColor() == ratingAppearance.getProgressStarColor();
    }

    @Override // yads.e52
    public int getBackgroundStarColor() {
        return this.f77013b;
    }

    @Override // yads.e52
    public int getProgressStarColor() {
        return this.f77014c;
    }

    public int hashCode() {
        return getProgressStarColor() + (getBackgroundStarColor() * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel, int i10) {
        parcel.writeInt(this.f77013b);
        parcel.writeInt(this.f77014c);
    }

    private RatingAppearance(int i10, int i11) {
        this.f77013b = i10;
        this.f77014c = i11;
    }
}
