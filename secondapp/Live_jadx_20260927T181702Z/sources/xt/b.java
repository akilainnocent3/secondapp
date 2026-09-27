package xt;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final String f145631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final d f145632b;

    @l
    public String a() {
        return b().getDescription();
    }

    @l
    public d b() {
        return this.f145632b;
    }

    @l
    public String toString() {
        String strA = a();
        if (strA.length() <= 0) {
            return this.f145631a;
        }
        return this.f145631a + " (" + strA + ')';
    }
}
