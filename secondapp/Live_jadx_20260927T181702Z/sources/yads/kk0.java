package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class kk0 implements Comparator, Parcelable {
    public static final Parcelable.Creator<kk0> CREATOR = new hk0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk0[] f151565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f151566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f151567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f151568e;

    public kk0(Parcel parcel) {
        this.f151567d = parcel.readString();
        jk0[] jk0VarArr = (jk0[]) ib3.a((jk0[]) parcel.createTypedArray(jk0.CREATOR));
        this.f151565b = jk0VarArr;
        this.f151568e = jk0VarArr.length;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        jk0 jk0Var = (jk0) obj;
        jk0 jk0Var2 = (jk0) obj2;
        UUID uuid = jr.f151216a;
        if (uuid.equals(jk0Var.f151134c)) {
            return uuid.equals(jk0Var2.f151134c) ? 0 : 1;
        }
        return jk0Var.f151134c.compareTo(jk0Var2.f151134c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kk0.class == obj.getClass()) {
            kk0 kk0Var = (kk0) obj;
            if (ib3.a(this.f151567d, kk0Var.f151567d) && Arrays.equals(this.f151565b, kk0Var.f151565b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f151566c == 0) {
            String str = this.f151567d;
            this.f151566c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f151565b);
        }
        return this.f151566c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f151567d);
        parcel.writeTypedArray(this.f151565b, 0);
    }

    public kk0(String str, boolean z10, jk0... jk0VarArr) {
        this.f151567d = str;
        jk0VarArr = z10 ? (jk0[]) jk0VarArr.clone() : jk0VarArr;
        this.f151565b = jk0VarArr;
        this.f151568e = jk0VarArr.length;
        Arrays.sort(jk0VarArr, this);
    }
}
