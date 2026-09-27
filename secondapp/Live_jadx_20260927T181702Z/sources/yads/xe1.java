package yads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f157821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f157822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final we1 f157823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ue1 f157824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final te1 f157825e;

    public xe1(Context context, ViewGroup viewGroup, we1 we1Var, ue1 ue1Var, te1 te1Var) {
        this.f157821a = context;
        this.f157822b = viewGroup;
        this.f157823c = we1Var;
        this.f157824d = ue1Var;
        this.f157825e = te1Var;
    }

    public final boolean a() {
        Object next;
        we1 we1Var = this.f157823c;
        Context context = this.f157821a;
        Iterator it = we1Var.f157337a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((se1) next).f155398d.a(context));
        se1 se1Var = (se1) next;
        if (se1Var == null) {
            return false;
        }
        ue1 ue1Var = this.f157824d;
        ViewGroup viewGroup = this.f157822b;
        ue1Var.getClass();
        Context context2 = viewGroup.getContext();
        int i10 = se1Var.f155395a;
        Class cls = se1Var.f155396b;
        ue1Var.f156389a.getClass();
        ViewGroup viewGroup2 = (ViewGroup) es2.a(context2, cls, i10, viewGroup);
        if (viewGroup2 == null) {
            return false;
        }
        te1 te1Var = this.f157825e;
        ViewGroup viewGroup3 = this.f157822b;
        te1Var.getClass();
        try {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            viewGroup3.removeAllViews();
            viewGroup3.addView(viewGroup2, layoutParams);
        } catch (Throwable unused) {
        }
        zf0 zf0Var = se1Var.f155397c;
        te1Var.f155859a = zf0Var;
        if (zf0Var == null) {
            return true;
        }
        zf0Var.a(viewGroup2);
        return true;
    }

    public final void b() {
        te1 te1Var = this.f157825e;
        ViewGroup viewGroup = this.f157822b;
        te1Var.getClass();
        try {
            viewGroup.removeAllViews();
            zf0 zf0Var = te1Var.f155859a;
            if (zf0Var != null) {
                zf0Var.c();
            }
        } catch (Throwable unused) {
        }
    }
}
