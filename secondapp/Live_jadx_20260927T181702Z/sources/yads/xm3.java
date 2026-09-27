package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4235d4;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public class xm3 implements ss1 {
    public static final Parcelable.Creator<xm3> CREATOR = new vm3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f157920c;

    public xm3(Parcel parcel) {
        this.f157919b = (String) ib3.a((Object) parcel.readString());
        this.f157920c = (String) ib3.a((Object) parcel.readString());
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
        if (obj != null && getClass() == obj.getClass()) {
            xm3 xm3Var = (xm3) obj;
            if (this.f157919b.equals(xm3Var.f157919b) && this.f157920c.equals(xm3Var.f157920c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f157920c.hashCode() + k4.a(this.f157919b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    public final String toString() {
        return "VC: " + this.f157919b + C4235d4.j.f61456b + this.f157920c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f157919b);
        parcel.writeString(this.f157920c);
    }

    @Override // yads.ss1
    public final void a(im1 im1Var) {
        String str = this.f157919b;
        str.getClass();
        switch (str) {
            case "ALBUM":
                im1Var.f150679c = this.f157920c;
                break;
            case "TITLE":
                im1Var.f150677a = this.f157920c;
                break;
            case "DESCRIPTION":
                im1Var.f150683g = this.f157920c;
                break;
            case "ALBUMARTIST":
                im1Var.f150680d = this.f157920c;
                break;
            case "ARTIST":
                im1Var.f150678b = this.f157920c;
                break;
        }
    }

    public xm3(String str, String str2) {
        this.f157919b = str;
        this.f157920c = str2;
    }
}
