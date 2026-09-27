package yads;

import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class e72 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei3 f148545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextureView f148546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n52 f148547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i62 f148548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ij1 f148549e;

    public e72(Context context, ei3 ei3Var, TextureView textureView, n52 n52Var) {
        super(context);
        this.f148545a = ei3Var;
        this.f148546b = textureView;
        this.f148547c = n52Var;
        this.f148549e = new cz2();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i62 i62Var = this.f148548d;
        if (i62Var != null) {
            a62 a62Var = (a62) i62Var;
            a62Var.f146673a.a(a62Var.f146674b.f148546b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i62 i62Var = this.f148548d;
        if (i62Var != null) {
            a62 a62Var = (a62) i62Var;
            a62Var.f146674b.f148545a.f148723a.clearAnimation();
            a62Var.f146673a.a((TextureView) null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        hj1 hj1VarA = this.f148549e.a(i10, i11);
        super.onMeasure(hj1VarA.f150155a, hj1VarA.f150156b);
    }

    public final void setAspectRatio(float f10) {
        this.f148549e = new ok2(f10);
    }

    public final void setOnAttachStateChangeListener(@oy.m i62 i62Var) {
        this.f148548d = i62Var;
    }
}
