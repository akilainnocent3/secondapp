package yads;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class z31 implements d51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lv.l0 f158579a;

    public z31(lv.l0 l0Var) {
        this.f158579a = l0Var;
    }

    @Override // yads.d51
    public final void a(String str, Bitmap bitmap) {
        this.f158579a.j(new q31(str, bitmap));
    }

    @Override // yads.d51
    public final void a(Map map) {
        lv.o0.a.a(this.f158579a.d(), null, 1, null);
    }
}
