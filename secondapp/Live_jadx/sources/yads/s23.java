package yads;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class s23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f155235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f155236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f155237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f155238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f155239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f155240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f155241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f155242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f155243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f155244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f155245k;

    public s23(long j10, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j11, boolean z13, long j12, int i10, int i11, int i12) {
        this.f155235a = j10;
        this.f155236b = z10;
        this.f155237c = z11;
        this.f155238d = z12;
        this.f155240f = Collections.unmodifiableList(arrayList);
        this.f155239e = j11;
        this.f155241g = z13;
        this.f155242h = j12;
        this.f155243i = i10;
        this.f155244j = i11;
        this.f155245k = i12;
    }

    public static s23 a(Parcel parcel) {
        return new s23(parcel);
    }

    public s23(Parcel parcel) {
        this.f155235a = parcel.readLong();
        this.f155236b = parcel.readByte() == 1;
        this.f155237c = parcel.readByte() == 1;
        this.f155238d = parcel.readByte() == 1;
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(r23.a(parcel));
        }
        this.f155240f = Collections.unmodifiableList(arrayList);
        this.f155239e = parcel.readLong();
        this.f155241g = parcel.readByte() == 1;
        this.f155242h = parcel.readLong();
        this.f155243i = parcel.readInt();
        this.f155244j = parcel.readInt();
        this.f155245k = parcel.readInt();
    }
}
