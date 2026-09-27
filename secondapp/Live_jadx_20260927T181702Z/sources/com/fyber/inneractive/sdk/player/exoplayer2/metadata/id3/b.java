package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends o {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f46752e;

    public b(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f46749b = str;
        this.f46750c = str2;
        this.f46751d = i10;
        this.f46752e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f46751d == bVar.f46751d && z.a(this.f46749b, bVar.f46749b) && z.a(this.f46750c, bVar.f46750c) && Arrays.equals(this.f46752e, bVar.f46752e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f46751d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f46749b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f46750c;
        return Arrays.hashCode(this.f46752e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46749b);
        parcel.writeString(this.f46750c);
        parcel.writeInt(this.f46751d);
        parcel.writeByteArray(this.f46752e);
    }

    public b(Parcel parcel) {
        super("APIC");
        this.f46749b = parcel.readString();
        this.f46750c = parcel.readString();
        this.f46751d = parcel.readInt();
        this.f46752e = parcel.createByteArray();
    }
}
