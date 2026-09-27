package yads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class r23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f154724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f154725b;

    public r23(int i10, long j10) {
        this.f154724a = i10;
        this.f154725b = j10;
    }

    public static r23 a(Parcel parcel) {
        return new r23(parcel.readInt(), parcel.readLong());
    }
}
