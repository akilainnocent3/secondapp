package yads;

import java.nio.FloatBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mk2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f152519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatBuffer f152520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FloatBuffer f152521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f152522d;

    public mk2(jk2 jk2Var) {
        this.f152519a = jk2Var.a();
        this.f152520b = sz0.a(jk2Var.f151140c);
        this.f152521c = sz0.a(jk2Var.f151141d);
        int i10 = jk2Var.f151139b;
        if (i10 == 1) {
            this.f152522d = 5;
        } else if (i10 != 2) {
            this.f152522d = 4;
        } else {
            this.f152522d = 6;
        }
    }
}
