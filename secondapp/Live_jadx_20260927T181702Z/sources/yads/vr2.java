package yads;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vr2 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f157069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x63 f157070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y42 f157071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f157072d;

    public vr2(b2 b2Var, x63 x63Var, y42 y42Var, c2 c2Var) {
        this.f157069a = b2Var;
        this.f157070b = x63Var;
        this.f157071c = y42Var;
        this.f157072d = c2Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        b2 b2Var = this.f157069a;
        b2Var.f147017b.add(this.f157072d);
        this.f157070b.getClass();
        View viewFindViewWithTag = viewGroup.findViewWithTag("timer_container");
        if (!androidx.activity.k0.a(viewFindViewWithTag)) {
            viewFindViewWithTag = null;
        }
        y42 y42Var = this.f157071c;
        y42Var.f158136c = viewFindViewWithTag;
        ay0 ay0Var = y42Var.f158135b;
        if (ay0Var != null) {
            ay0Var.start();
        }
    }

    @Override // yads.zf0
    public final void c() {
        b2 b2Var = this.f157069a;
        b2Var.f147017b.remove(this.f157072d);
        y42 y42Var = this.f157071c;
        y42Var.f158136c = null;
        ay0 ay0Var = y42Var.f158135b;
        if (ay0Var != null) {
            ay0Var.invalidate();
        }
    }
}
