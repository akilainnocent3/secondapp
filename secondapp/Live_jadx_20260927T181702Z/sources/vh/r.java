package vh;

import androidx.annotation.NonNull;
import k.c1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f141181c = {ih.a.c.f91137s3, ih.a.c.f91247x3, ih.a.c.f91159t3, ih.a.c.f91269y3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f141182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @c1
    public final int f141183b;

    public r(@NonNull @k.f int[] iArr, @c1 int i10) {
        if (i10 != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.f141182a = iArr;
        this.f141183b = i10;
    }

    @NonNull
    public static r a(@NonNull @k.f int[] iArr) {
        return new r(iArr, 0);
    }

    @NonNull
    public static r b(@NonNull @k.f int[] iArr, @c1 int i10) {
        return new r(iArr, i10);
    }

    @NonNull
    public static r c() {
        return b(f141181c, ih.a.n.f92641aa);
    }

    @NonNull
    public int[] d() {
        return this.f141182a;
    }

    @c1
    public int e() {
        return this.f141183b;
    }
}
