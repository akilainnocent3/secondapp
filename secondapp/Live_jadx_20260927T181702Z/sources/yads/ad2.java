package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ad2 implements ss1 {
    public static final Parcelable.Creator<ad2> CREATOR = new zc2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f146763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f146764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f146765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f146766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f146767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f146768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f146769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f146770i;

    public ad2(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f146763b = i10;
        this.f146764c = str;
        this.f146765d = str2;
        this.f146766e = i11;
        this.f146767f = i12;
        this.f146768g = i13;
        this.f146769h = i14;
        this.f146770i = bArr;
    }

    @Override // yads.ss1
    public /* synthetic */ mx0 a() {
        return ya4.a(this);
    }

    @Override // yads.ss1
    public /* synthetic */ byte[] b() {
        return ya4.c(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ad2.class == obj.getClass()) {
            ad2 ad2Var = (ad2) obj;
            if (this.f146763b == ad2Var.f146763b && this.f146764c.equals(ad2Var.f146764c) && this.f146765d.equals(ad2Var.f146765d) && this.f146766e == ad2Var.f146766e && this.f146767f == ad2Var.f146767f && this.f146768g == ad2Var.f146768g && this.f146769h == ad2Var.f146769h && Arrays.equals(this.f146770i, ad2Var.f146770i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f146770i) + ((((((((k4.a(this.f146765d, k4.a(this.f146764c, (this.f146763b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31, 31), 31) + this.f146766e) * 31) + this.f146767f) * 31) + this.f146768g) * 31) + this.f146769h) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f146764c + ", description=" + this.f146765d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f146763b);
        parcel.writeString(this.f146764c);
        parcel.writeString(this.f146765d);
        parcel.writeInt(this.f146766e);
        parcel.writeInt(this.f146767f);
        parcel.writeInt(this.f146768g);
        parcel.writeInt(this.f146769h);
        parcel.writeByteArray(this.f146770i);
    }

    @Override // yads.ss1
    public final void a(im1 im1Var) {
        byte[] bArr = this.f146770i;
        int i10 = this.f146763b;
        if (im1Var.f150686j == null || ib3.a((Object) Integer.valueOf(i10), (Object) 3) || !ib3.a((Object) im1Var.f150687k, (Object) 3)) {
            im1Var.f150686j = (byte[]) bArr.clone();
            im1Var.f150687k = Integer.valueOf(i10);
        }
    }

    public ad2(Parcel parcel) {
        this.f146763b = parcel.readInt();
        this.f146764c = (String) ib3.a((Object) parcel.readString());
        this.f146765d = (String) ib3.a((Object) parcel.readString());
        this.f146766e = parcel.readInt();
        this.f146767f = parcel.readInt();
        this.f146768g = parcel.readInt();
        this.f146769h = parcel.readInt();
        this.f146770i = (byte[]) ib3.a((Object) parcel.createByteArray());
    }
}
