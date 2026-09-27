package yads;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class x31 implements j41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y31 f157653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f157654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u41 f157655c;

    public x31(y31 y31Var, Map map, u41 u41Var) {
        this.f157653a = y31Var;
        this.f157654b = map;
        this.f157655c = u41Var;
    }

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        boolean z10 = ad1.f146762a;
        this.f157653a.a(this.f157654b);
    }

    @Override // yads.j41
    public final void a(i41 i41Var, boolean z10) {
        String str = this.f157655c.f156268c;
        Bitmap bitmap = i41Var.f150421a;
        if (bitmap != null) {
            if (str != null) {
                this.f157654b.put(str, bitmap);
                this.f157653a.f158119c.a(str, bitmap);
            }
            this.f157653a.a(this.f157654b);
        }
    }
}
