package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class p21 implements ss1 {
    public static final Parcelable.Creator<p21> CREATOR = new o21();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f153689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f153690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f153691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f153692g;

    public p21(int i10, String str, String str2, String str3, boolean z10, int i11) {
        ni.a(i11 == -1 || i11 > 0);
        this.f153687b = i10;
        this.f153688c = str;
        this.f153689d = str2;
        this.f153690e = str3;
        this.f153691f = z10;
        this.f153692g = i11;
    }

    @Override // yads.ss1
    public /* synthetic */ mx0 a() {
        return ya4.a(this);
    }

    @Override // yads.ss1
    public /* synthetic */ byte[] b() {
        return ya4.c(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p21.class == obj.getClass()) {
            p21 p21Var = (p21) obj;
            if (this.f153687b == p21Var.f153687b && ib3.a(this.f153688c, p21Var.f153688c) && ib3.a(this.f153689d, p21Var.f153689d) && ib3.a(this.f153690e, p21Var.f153690e) && this.f153691f == p21Var.f153691f && this.f153692g == p21Var.f153692g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f153687b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f153688c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f153689d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f153690e;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f153691f ? 1 : 0)) * 31) + this.f153692g;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f153689d + "\", genre=\"" + this.f153688c + "\", bitrate=" + this.f153687b + ", metadataInterval=" + this.f153692g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f153687b);
        parcel.writeString(this.f153688c);
        parcel.writeString(this.f153689d);
        parcel.writeString(this.f153690e);
        boolean z10 = this.f153691f;
        int i11 = ib3.f150516a;
        parcel.writeInt(z10 ? 1 : 0);
        parcel.writeInt(this.f153692g);
    }

    public static p21 a(Map map) {
        boolean z10;
        int i10;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i11;
        int i12;
        List list = (List) map.get("icy-br");
        boolean z11 = true;
        int i13 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i12 = Integer.parseInt(str4) * 1000;
                if (i12 > 0) {
                    z10 = true;
                    i10 = i12;
                } else {
                    try {
                        ih1.d("IcyHeaders", "Invalid bitrate: " + str4);
                        z10 = false;
                        i10 = -1;
                    } catch (NumberFormatException unused) {
                        pk1.a("Invalid bitrate header: ", str4, "IcyHeaders");
                        z10 = false;
                        i10 = i12;
                    }
                }
            } catch (NumberFormatException unused2) {
                i12 = -1;
            }
        } else {
            z10 = false;
            i10 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z10 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z10 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z10 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i14 = Integer.parseInt(str5);
                if (i14 > 0) {
                    i11 = i14;
                } else {
                    try {
                        ih1.d("IcyHeaders", "Invalid metadata interval: " + str5);
                    } catch (NumberFormatException unused3) {
                        i13 = i14;
                        pk1.a("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                    z11 = z10;
                    i11 = i13;
                }
            } catch (NumberFormatException unused4) {
            }
        } else {
            z11 = z10;
            i11 = i13;
        }
        if (z11) {
            return new p21(i10, str, str2, str3, zEquals, i11);
        }
        return null;
    }

    public p21(Parcel parcel) {
        this.f153687b = parcel.readInt();
        this.f153688c = parcel.readString();
        this.f153689d = parcel.readString();
        this.f153690e = parcel.readString();
        this.f153691f = ib3.a(parcel);
        this.f153692g = parcel.readInt();
    }

    @Override // yads.ss1
    public final void a(im1 im1Var) {
        String str = this.f153689d;
        if (str != null) {
            im1Var.D = str;
        }
        String str2 = this.f153688c;
        if (str2 != null) {
            im1Var.B = str2;
        }
    }
}
