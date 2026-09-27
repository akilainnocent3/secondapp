package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wt extends v21 {
    public static final Parcelable.Creator<wt> CREATOR = new vt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f157502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f157503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f157504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f157505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v21[] f157506g;

    public wt(Parcel parcel) {
        super("CTOC");
        this.f157502c = (String) ib3.a((Object) parcel.readString());
        this.f157503d = parcel.readByte() != 0;
        this.f157504e = parcel.readByte() != 0;
        this.f157505f = (String[]) ib3.a(parcel.createStringArray());
        int i10 = parcel.readInt();
        this.f157506g = new v21[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f157506g[i11] = (v21) parcel.readParcelable(v21.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wt.class == obj.getClass()) {
            wt wtVar = (wt) obj;
            if (this.f157503d == wtVar.f157503d && this.f157504e == wtVar.f157504e && ib3.a(this.f157502c, wtVar.f157502c) && Arrays.equals(this.f157505f, wtVar.f157505f) && Arrays.equals(this.f157506g, wtVar.f157506g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((((this.f157503d ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f157504e ? 1 : 0)) * 31;
        String str = this.f157502c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f157502c);
        parcel.writeByte(this.f157503d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f157504e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f157505f);
        parcel.writeInt(this.f157506g.length);
        for (v21 v21Var : this.f157506g) {
            parcel.writeParcelable(v21Var, 0);
        }
    }

    public wt(String str, boolean z10, boolean z11, String[] strArr, v21[] v21VarArr) {
        super("CTOC");
        this.f157502c = str;
        this.f157503d = z10;
        this.f157504e = z11;
        this.f157505f = strArr;
        this.f157506g = v21VarArr;
    }
}
