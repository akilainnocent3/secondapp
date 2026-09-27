package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class e13 implements Parcelable {
    public static final Parcelable.Creator<e13> CREATOR;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f148460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f148461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f148462d;

    static {
        new Comparator() { // from class: yads.uz3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                e13 e13Var = (e13) obj;
                e13 e13Var2 = (e13) obj2;
                return hy.f150337a.a(e13Var.f148460b, e13Var2.f148460b).a(e13Var.f148461c, e13Var2.f148461c).a(e13Var.f148462d, e13Var2.f148462d).a();
            }
        };
        CREATOR = new d13();
    }

    public e13(int i10, long j10, long j11) {
        ni.a(j10 < j11);
        this.f148460b = j10;
        this.f148461c = j11;
        this.f148462d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e13.class == obj.getClass()) {
            e13 e13Var = (e13) obj;
            if (this.f148460b == e13Var.f148460b && this.f148461c == e13Var.f148461c && this.f148462d == e13Var.f148462d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f148460b), Long.valueOf(this.f148461c), Integer.valueOf(this.f148462d)});
    }

    public final String toString() {
        long j10 = this.f148460b;
        long j11 = this.f148461c;
        int i10 = this.f148462d;
        int i11 = ib3.f150516a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + j10 + ", endTimeMs=" + j11 + ", speedDivisor=" + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f148460b);
        parcel.writeLong(this.f148461c);
        parcel.writeInt(this.f148462d);
    }
}
