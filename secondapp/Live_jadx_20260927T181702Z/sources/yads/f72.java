package yads;

import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class f72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p52 f149002a;

    public f72(p52 p52Var) {
        this.f149002a = p52Var;
    }

    public final void a(e72 e72Var) {
        TextureView textureView = e72Var.f148546b;
        this.f149002a.a(textureView);
        textureView.setVisibility(0);
        e72Var.f148547c.setVisibility(0);
        e72Var.f148545a.setVisibility(0);
    }

    public final void b(e72 e72Var) {
        TextureView textureView = e72Var.f148546b;
        this.f149002a.a((TextureView) null);
        textureView.setVisibility(8);
        e72Var.f148547c.setVisibility(8);
        e72Var.f148545a.setVisibility(8);
    }
}
