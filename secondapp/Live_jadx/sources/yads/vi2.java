package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vi2 extends v21 {
    public static final Parcelable.Creator<vi2> CREATOR = new ui2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f156992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f156993d;

    public vi2(Parcel parcel) {
        super("PRIV");
        this.f156992c = (String) ib3.a((Object) parcel.readString());
        this.f156993d = (byte[]) ib3.a((Object) parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vi2.class == obj.getClass()) {
            vi2 vi2Var = (vi2) obj;
            if (ib3.a(this.f156992c, vi2Var.f156992c) && Arrays.equals(this.f156993d, vi2Var.f156993d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f156992c;
        return Arrays.hashCode(this.f156993d) + (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f156721b + ": owner=" + this.f156992c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f156992c);
        parcel.writeByteArray(this.f156993d);
    }

    public vi2(String str, byte[] bArr) {
        super("PRIV");
        this.f156992c = str;
        this.f156993d = bArr;
    }
}
