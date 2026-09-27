package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bz0 extends v21 {
    public static final Parcelable.Creator<bz0> CREATOR = new az0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f147455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f147456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f147457f;

    public bz0(Parcel parcel) {
        super("GEOB");
        this.f147454c = (String) ib3.a((Object) parcel.readString());
        this.f147455d = (String) ib3.a((Object) parcel.readString());
        this.f147456e = (String) ib3.a((Object) parcel.readString());
        this.f147457f = (byte[]) ib3.a((Object) parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bz0.class == obj.getClass()) {
            bz0 bz0Var = (bz0) obj;
            if (ib3.a(this.f147454c, bz0Var.f147454c) && ib3.a(this.f147455d, bz0Var.f147455d) && ib3.a(this.f147456e, bz0Var.f147456e) && Arrays.equals(this.f147457f, bz0Var.f147457f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f147454c;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f147455d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f147456e;
        return Arrays.hashCode(this.f147457f) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f156721b + ": mimeType=" + this.f147454c + ", filename=" + this.f147455d + ", description=" + this.f147456e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f147454c);
        parcel.writeString(this.f147455d);
        parcel.writeString(this.f147456e);
        parcel.writeByteArray(this.f147457f);
    }

    public bz0(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f147454c = str;
        this.f147455d = str2;
        this.f147456e = str3;
        this.f147457f = bArr;
    }
}
