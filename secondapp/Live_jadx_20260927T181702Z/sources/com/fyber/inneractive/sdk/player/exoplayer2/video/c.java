package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f47196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47197e;

    public c(int i10, int i11, int i12, byte[] bArr) {
        this.f47193a = i10;
        this.f47194b = i11;
        this.f47195c = i12;
        this.f47196d = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f47193a == cVar.f47193a && this.f47194b == cVar.f47194b && this.f47195c == cVar.f47195c && Arrays.equals(this.f47196d, cVar.f47196d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f47197e == 0) {
            this.f47197e = Arrays.hashCode(this.f47196d) + ((((((this.f47193a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f47194b) * 31) + this.f47195c) * 31);
        }
        return this.f47197e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f47193a);
        sb2.append(", ");
        sb2.append(this.f47194b);
        sb2.append(", ");
        sb2.append(this.f47195c);
        sb2.append(", ");
        sb2.append(this.f47196d != null);
        sb2.append(gi.j.f86771d);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f47193a);
        parcel.writeInt(this.f47194b);
        parcel.writeInt(this.f47195c);
        parcel.writeInt(this.f47196d != null ? 1 : 0);
        byte[] bArr = this.f47196d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public c(Parcel parcel) {
        this.f47193a = parcel.readInt();
        this.f47194b = parcel.readInt();
        this.f47195c = parcel.readInt();
        this.f47196d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
