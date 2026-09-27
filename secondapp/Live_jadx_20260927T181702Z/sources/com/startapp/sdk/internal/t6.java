package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class t6 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f75533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f75534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f75535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f75536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f75537e;

    public t6() {
        this.f75535c = Float.MAX_VALUE;
        this.f75536d = -3.4028235E38f;
        this.f75537e = 0L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f75533a);
        parcel.writeFloat(this.f75534b);
        parcel.writeFloat(this.f75535c);
        parcel.writeFloat(this.f75536d);
    }

    public t6(Parcel parcel) {
        this.f75535c = Float.MAX_VALUE;
        this.f75536d = -3.4028235E38f;
        this.f75537e = 0L;
        this.f75533a = parcel.readFloat();
        this.f75534b = parcel.readFloat();
        this.f75535c = parcel.readFloat();
        this.f75536d = parcel.readFloat();
        this.f75537e = AnimationUtils.currentAnimationTimeMillis();
    }
}
