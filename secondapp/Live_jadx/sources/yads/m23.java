package yads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class m23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f152284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f152285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f152286c;

    public m23(int i10, long j10, long j11) {
        this.f152284a = i10;
        this.f152285b = j10;
        this.f152286c = j11;
    }

    public static m23 a(Parcel parcel) {
        return new m23(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }
}
