package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;
import yads.b11;
import yads.c52;
import yv.g;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@g
public final class HorizontalOffset implements c52, Parcelable {

    @l
    public static final Parcelable.Creator<HorizontalOffset> CREATOR = new b11();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f76957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f76958c;

    public HorizontalOffset(float f10, float f11) {
        this.f76957b = f10;
        this.f76958c = f11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(HorizontalOffset.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        m0.n(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.HorizontalOffset");
        HorizontalOffset horizontalOffset = (HorizontalOffset) obj;
        return getLeft() == horizontalOffset.getLeft() && getRight() == horizontalOffset.getRight();
    }

    @Override // yads.c52
    public float getLeft() {
        return this.f76957b;
    }

    @Override // yads.c52
    public float getRight() {
        return this.f76958c;
    }

    public int hashCode() {
        return Float.floatToIntBits(getRight()) + (Float.floatToIntBits(getLeft()) * 31);
    }

    @l
    public String toString() {
        return getLeft() + ", " + getRight();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@l Parcel parcel, int i10) {
        parcel.writeFloat(this.f76957b);
        parcel.writeFloat(this.f76958c);
    }
}
