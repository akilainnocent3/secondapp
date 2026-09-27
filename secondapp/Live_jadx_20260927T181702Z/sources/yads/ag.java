package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ag extends v21 {
    public static final Parcelable.Creator<ag> CREATOR = new zf();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f146785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f146786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f146787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f146788f;

    public ag(Parcel parcel) {
        super("APIC");
        this.f146785c = (String) ib3.a((Object) parcel.readString());
        this.f146786d = parcel.readString();
        this.f146787e = parcel.readInt();
        this.f146788f = (byte[]) ib3.a((Object) parcel.createByteArray());
    }

    @Override // yads.v21, yads.ss1
    public final void a(im1 im1Var) {
        byte[] bArr = this.f146788f;
        int i10 = this.f146787e;
        if (im1Var.f150686j == null || ib3.a((Object) Integer.valueOf(i10), (Object) 3) || !ib3.a((Object) im1Var.f150687k, (Object) 3)) {
            im1Var.f150686j = (byte[]) bArr.clone();
            im1Var.f150687k = Integer.valueOf(i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ag.class == obj.getClass()) {
            ag agVar = (ag) obj;
            if (this.f146787e == agVar.f146787e && ib3.a(this.f146785c, agVar.f146785c) && ib3.a(this.f146786d, agVar.f146786d) && Arrays.equals(this.f146788f, agVar.f146788f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f146787e + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f146785c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f146786d;
        return Arrays.hashCode(this.f146788f) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f156721b + ": mimeType=" + this.f146785c + ", description=" + this.f146786d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f146785c);
        parcel.writeString(this.f146786d);
        parcel.writeInt(this.f146787e);
        parcel.writeByteArray(this.f146788f);
    }

    public ag(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f146785c = str;
        this.f146786d = str2;
        this.f146787e = i10;
        this.f146788f = bArr;
    }
}
