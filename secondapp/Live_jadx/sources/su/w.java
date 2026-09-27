package su;

import com.unity3d.services.ads.gmascar.utils.ScarConstants;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum w {
    IN(ScarConstants.IN_SIGNAL_KEY),
    OUT("out"),
    INV("");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f135534b;

    w(String str) {
        this.f135534b = str;
    }

    @Override // java.lang.Enum
    @oy.l
    public String toString() {
        return this.f135534b;
    }
}
