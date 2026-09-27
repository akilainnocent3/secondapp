package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jk0 implements Parcelable {
    public static final Parcelable.Creator<jk0> CREATOR = new ik0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f151133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f151134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f151135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f151136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f151137f;

    public jk0(Parcel parcel) {
        this.f151134c = new UUID(parcel.readLong(), parcel.readLong());
        this.f151135d = parcel.readString();
        this.f151136e = (String) ib3.a((Object) parcel.readString());
        this.f151137f = parcel.createByteArray();
    }

    public final boolean a(UUID uuid) {
        return jr.f151216a.equals(this.f151134c) || uuid.equals(this.f151134c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jk0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        jk0 jk0Var = (jk0) obj;
        return ib3.a(this.f151135d, jk0Var.f151135d) && ib3.a(this.f151136e, jk0Var.f151136e) && ib3.a(this.f151134c, jk0Var.f151134c) && Arrays.equals(this.f151137f, jk0Var.f151137f);
    }

    public final int hashCode() {
        if (this.f151133b == 0) {
            int iHashCode = this.f151134c.hashCode() * 31;
            String str = this.f151135d;
            this.f151133b = Arrays.hashCode(this.f151137f) + k4.a(this.f151136e, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }
        return this.f151133b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f151134c.getMostSignificantBits());
        parcel.writeLong(this.f151134c.getLeastSignificantBits());
        parcel.writeString(this.f151135d);
        parcel.writeString(this.f151136e);
        parcel.writeByteArray(this.f151137f);
    }

    public jk0(UUID uuid, String str, String str2, byte[] bArr) {
        this.f151134c = (UUID) ni.a(uuid);
        this.f151135d = str;
        this.f151136e = (String) ni.a((Object) str2);
        this.f151137f = bArr;
    }
}
