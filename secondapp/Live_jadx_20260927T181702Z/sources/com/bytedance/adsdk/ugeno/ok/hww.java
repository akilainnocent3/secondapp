package com.bytedance.adsdk.ugeno.ok;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hww implements Parcelable {

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final Parcelable f32556tq;
    public static final hww hww = new hww() { // from class: com.bytedance.adsdk.ugeno.ok.hww.1
    };
    public static final Parcelable.Creator<hww> CREATOR = new Parcelable.ClassLoaderCreator<hww>() { // from class: com.bytedance.adsdk.ugeno.ok.hww.2
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public hww createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public hww createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return hww.hww;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public hww[] newArray(int i10) {
            return new hww[i10];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Parcelable hww() {
        return this.f32556tq;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f32556tq, i10);
    }

    private hww() {
        this.f32556tq = null;
    }

    public hww(Parcelable parcelable) {
        if (parcelable != null) {
            this.f32556tq = parcelable == hww ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public hww(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f32556tq = parcelable == null ? hww : parcelable;
    }
}
