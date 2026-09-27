package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends o {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f46753b;

    public d(String str, byte[] bArr) {
        super(str);
        this.f46753b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f46777a.equals(dVar.f46777a) && Arrays.equals(this.f46753b, dVar.f46753b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f46753b) + ((this.f46777a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46777a);
        parcel.writeByteArray(this.f46753b);
    }

    public d(Parcel parcel) {
        super(parcel.readString());
        this.f46753b = parcel.createByteArray();
    }
}
