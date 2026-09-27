package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.model.AdDetails;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class z0 extends View.BaseSavedState {
    public static final Parcelable.Creator<z0> CREATOR = new y0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdDetails[] f75932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f75933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f75934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f75935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f75936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f75937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f75938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f75939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AdInformationOverrides f75940i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BannerOptions f75941j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AdRulesResult f75942k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f75943l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c1[] f75944m;

    public z0(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        if (!this.f75943l) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(this.f75936e);
        parcel.writeFloat(this.f75933b);
        parcel.writeInt(this.f75934c);
        parcel.writeInt(this.f75935d);
        parcel.writeParcelableArray(this.f75932a, i10);
        parcel.writeInt(this.f75937f ? 1 : 0);
        parcel.writeInt(this.f75938g ? 1 : 0);
        parcel.writeInt(this.f75939h ? 1 : 0);
        c1[] c1VarArr = this.f75944m;
        if (c1VarArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(c1VarArr.length);
            for (c1 c1Var : this.f75944m) {
                parcel.writeParcelable(c1Var, i10);
            }
        }
        parcel.writeSerializable(this.f75940i);
        parcel.writeSerializable(this.f75941j);
        parcel.writeSerializable(this.f75942k);
    }

    public z0(Parcel parcel) {
        super(parcel);
        if (parcel.readInt() != 1) {
            this.f75943l = false;
            return;
        }
        this.f75943l = true;
        this.f75936e = parcel.readInt();
        this.f75933b = parcel.readFloat();
        this.f75934c = parcel.readInt();
        this.f75935d = parcel.readInt();
        Parcelable[] parcelableArray = parcel.readParcelableArray(AdDetails.class.getClassLoader());
        if (parcelableArray != null) {
            AdDetails[] adDetailsArr = new AdDetails[parcelableArray.length];
            this.f75932a = adDetailsArr;
            System.arraycopy(parcelableArray, 0, adDetailsArr, 0, parcelableArray.length);
        }
        int i10 = parcel.readInt();
        this.f75937f = false;
        if (i10 == 1) {
            this.f75937f = true;
        }
        int i11 = parcel.readInt();
        this.f75938g = false;
        if (i11 == 1) {
            this.f75938g = true;
        }
        int i12 = parcel.readInt();
        this.f75939h = false;
        if (i12 == 1) {
            this.f75939h = true;
        }
        int i13 = parcel.readInt();
        if (i13 > 0) {
            this.f75944m = new c1[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                this.f75944m[i14] = (c1) parcel.readParcelable(c1.class.getClassLoader());
            }
        }
        this.f75940i = (AdInformationOverrides) parcel.readSerializable();
        this.f75941j = (BannerOptions) parcel.readSerializable();
        this.f75942k = (AdRulesResult) parcel.readSerializable();
    }
}
