package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends o {
    public static final Parcelable.Creator<s> CREATOR = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46781c;

    public s(String str, String str2, String str3) {
        super(str);
        this.f46780b = str2;
        this.f46781c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f46777a.equals(sVar.f46777a) && z.a(this.f46780b, sVar.f46780b) && z.a(this.f46781c, sVar.f46781c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f46777a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f46780b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f46781c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46777a);
        parcel.writeString(this.f46780b);
        parcel.writeString(this.f46781c);
    }

    public s(Parcel parcel) {
        super(parcel.readString());
        this.f46780b = parcel.readString();
        this.f46781c = parcel.readString();
    }
}
