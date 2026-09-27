package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mp extends v21 {
    public static final Parcelable.Creator<mp> CREATOR = new lp();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f152595c;

    public mp(Parcel parcel) {
        super((String) ib3.a((Object) parcel.readString()));
        this.f152595c = (byte[]) ib3.a((Object) parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mp.class == obj.getClass()) {
            mp mpVar = (mp) obj;
            if (this.f156721b.equals(mpVar.f156721b) && Arrays.equals(this.f152595c, mpVar.f152595c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f152595c) + k4.a(this.f156721b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f156721b);
        parcel.writeByteArray(this.f152595c);
    }

    public mp(String str, byte[] bArr) {
        super(str);
        this.f152595c = bArr;
    }
}
