package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class px extends v21 {
    public static final Parcelable.Creator<px> CREATOR = new ox();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f154179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f154180e;

    public px(Parcel parcel) {
        super("COMM");
        this.f154178c = (String) ib3.a((Object) parcel.readString());
        this.f154179d = (String) ib3.a((Object) parcel.readString());
        this.f154180e = (String) ib3.a((Object) parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && px.class == obj.getClass()) {
            px pxVar = (px) obj;
            if (ib3.a(this.f154179d, pxVar.f154179d) && ib3.a(this.f154178c, pxVar.f154178c) && ib3.a(this.f154180e, pxVar.f154180e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f154178c;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f154179d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f154180e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f156721b + ": language=" + this.f154178c + ", description=" + this.f154179d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f156721b);
        parcel.writeString(this.f154178c);
        parcel.writeString(this.f154180e);
    }

    public px(String str, String str2, String str3) {
        super("COMM");
        this.f154178c = str;
        this.f154179d = str2;
        this.f154180e = str3;
    }
}
