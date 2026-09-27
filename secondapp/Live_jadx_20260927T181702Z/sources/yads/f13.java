package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class f13 implements ss1 {
    public static final Parcelable.Creator<f13> CREATOR = new c13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f148930b;

    public f13(ArrayList arrayList) {
        this.f148930b = arrayList;
        ni.a(!a(arrayList));
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
        if (obj == null || f13.class != obj.getClass()) {
            return false;
        }
        return this.f148930b.equals(((f13) obj).f148930b);
    }

    public final int hashCode() {
        return this.f148930b.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f148930b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f148930b);
    }

    @Override // yads.ss1
    public /* synthetic */ void a(im1 im1Var) {
        ya4.b(this, im1Var);
    }

    public static boolean a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j10 = ((e13) arrayList.get(0)).f148461c;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            if (((e13) arrayList.get(i10)).f148460b < j10) {
                return true;
            }
            j10 = ((e13) arrayList.get(i10)).f148461c;
        }
        return false;
    }
}
