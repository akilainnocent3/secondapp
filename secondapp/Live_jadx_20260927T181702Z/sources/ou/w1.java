package ou;

import com.unity3d.services.ads.gmascar.utils.ScarConstants;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum w1 {
    INVARIANT("", true, true, 0),
    IN_VARIANCE(ScarConstants.IN_SIGNAL_KEY, true, false, -1),
    OUT_VARIANCE("out", false, true, 1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f119830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f119831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f119832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f119833e;

    w1(String str, boolean z10, boolean z11, int i10) {
        this.f119830b = str;
        this.f119831c = z10;
        this.f119832d = z11;
        this.f119833e = i10;
    }

    public final boolean g() {
        return this.f119832d;
    }

    @oy.l
    public final String h() {
        return this.f119830b;
    }

    @Override // java.lang.Enum
    @oy.l
    public String toString() {
        return this.f119830b;
    }
}
