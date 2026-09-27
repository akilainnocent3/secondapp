package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends o {
    public static final Parcelable.Creator<q> CREATOR = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f46779c;

    public q(String str, byte[] bArr) {
        super("PRIV");
        this.f46778b = str;
        this.f46779c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (z.a(this.f46778b, qVar.f46778b) && Arrays.equals(this.f46779c, qVar.f46779c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f46778b;
        return Arrays.hashCode(this.f46779c) + (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46778b);
        parcel.writeByteArray(this.f46779c);
    }

    public q(Parcel parcel) {
        super("PRIV");
        this.f46778b = parcel.readString();
        this.f46779c = parcel.createByteArray();
    }
}
