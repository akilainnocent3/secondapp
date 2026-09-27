package yads;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class a53 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SurfaceView f146662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f146663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ij1 f146664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public li f146665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ji3 f146666e;

    public a53(@oy.l Context context) {
        super(context);
        SurfaceView surfaceView = new SurfaceView(context);
        this.f146662a = surfaceView;
        this.f146663b = 1.0f;
        this.f146664c = new cz2();
        setBackgroundColor(-16777216);
        addView(surfaceView, new FrameLayout.LayoutParams(-1, -2, 17));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        hj1 hj1VarA = this.f146664c.a(i10, i11);
        super.onMeasure(hj1VarA.f150155a, hj1VarA.f150156b);
        li liVar = this.f146665d;
        if (liVar != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f10 = measuredWidth;
            float f11 = measuredHeight;
            float f12 = liVar.f151991a;
            if ((f12 / (f10 / f11)) - 1 > 0.0f) {
                measuredHeight = (int) (f10 / f12);
            } else {
                measuredWidth = (int) (f11 * f12);
            }
            liVar.f151992b.f150155a = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            liVar.f151992b.f150156b = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            hj1 hj1Var = liVar.f151992b;
            if (hj1Var == null) {
                return;
            }
            this.f146662a.measure(hj1Var.f150155a, hj1Var.f150156b);
        }
    }

    public final void setAspectRatio(float f10) {
        if (f10 <= 0.0f || f10 == this.f146663b) {
            return;
        }
        this.f146663b = f10;
        this.f146665d = new li(f10, new hj1());
        this.f146664c = new ok2(f10);
        requestLayout();
    }

    @k.j0
    public final void setPlayer(@oy.m ji3 ji3Var) {
        if (kotlin.jvm.internal.m0.g(this.f146666e, ji3Var)) {
            return;
        }
        ji3 ji3Var2 = this.f146666e;
        if (ji3Var2 != null) {
            ji3Var2.clearVideoSurfaceView(this.f146662a);
        }
        this.f146666e = ji3Var;
        if (ji3Var == null || !ji3Var.a()) {
            return;
        }
        ji3Var.setVideoSurfaceView(this.f146662a);
    }
}
