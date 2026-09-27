package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends o {
    public static final Parcelable.Creator<l> CREATOR = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f46771e;

    public l(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f46768b = str;
        this.f46769c = str2;
        this.f46770d = str3;
        this.f46771e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (z.a(this.f46768b, lVar.f46768b) && z.a(this.f46769c, lVar.f46769c) && z.a(this.f46770d, lVar.f46770d) && Arrays.equals(this.f46771e, lVar.f46771e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f46768b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f46769c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f46770d;
        return Arrays.hashCode(this.f46771e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46768b);
        parcel.writeString(this.f46769c);
        parcel.writeString(this.f46770d);
        parcel.writeByteArray(this.f46771e);
    }

    public l(Parcel parcel) {
        super("GEOB");
        this.f46768b = parcel.readString();
        this.f46769c = parcel.readString();
        this.f46770d = parcel.readString();
        this.f46771e = parcel.createByteArray();
    }
}
