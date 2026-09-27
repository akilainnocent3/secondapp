package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f45721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f45723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f45724e;

    public c(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f45721b = uuid;
        this.f45722c = str;
        bArr.getClass();
        this.f45723d = bArr;
        this.f45724e = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        c cVar = (c) obj;
        return this.f45722c.equals(cVar.f45722c) && z.a(this.f45721b, cVar.f45721b) && Arrays.equals(this.f45723d, cVar.f45723d);
    }

    public final int hashCode() {
        if (this.f45720a == 0) {
            this.f45720a = Arrays.hashCode(this.f45723d) + ((this.f45722c.hashCode() + (this.f45721b.hashCode() * 31)) * 31);
        }
        return this.f45720a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f45721b.getMostSignificantBits());
        parcel.writeLong(this.f45721b.getLeastSignificantBits());
        parcel.writeString(this.f45722c);
        parcel.writeByteArray(this.f45723d);
        parcel.writeByte(this.f45724e ? (byte) 1 : (byte) 0);
    }

    public c(Parcel parcel) {
        this.f45721b = new UUID(parcel.readLong(), parcel.readLong());
        this.f45722c = parcel.readString();
        this.f45723d = parcel.createByteArray();
        this.f45724e = parcel.readByte() != 0;
    }
}
