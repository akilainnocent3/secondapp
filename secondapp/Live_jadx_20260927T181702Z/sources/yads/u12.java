package yads;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class u12 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ns.o[] f156217e = {wb.a(u12.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o32 f156218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p12 f156219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o12 f156220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lm2 f156221d;

    public u12(View view, o32 o32Var, p12 p12Var) {
        this.f156218a = o32Var;
        this.f156219b = p12Var;
        this.f156221d = mm2.a(view);
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        lm2 lm2Var = this.f156221d;
        ns.o[] oVarArr = f156217e;
        ns.o oVar = oVarArr[0];
        View view = (View) lm2Var.f152056a.get();
        if (view != null) {
            view.addOnAttachStateChangeListener(this);
        }
        lm2 lm2Var2 = this.f156221d;
        ns.o oVar2 = oVarArr[0];
        View view2 = (View) lm2Var2.f152056a.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            p12 p12Var = this.f156219b;
            o32 o32Var = this.f156218a;
            p12Var.getClass();
            o12 o12Var = new o12(view2, o32Var);
            this.f156220c = o12Var;
            lm2 lm2Var3 = o12Var.f153304b;
            ns.o oVar3 = o12.f153302d[0];
            View view3 = (View) lm2Var3.f152056a.get();
            if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(o12Var);
        }
    }

    public final void b() {
        o12 o12Var = this.f156220c;
        if (o12Var != null) {
            o12Var.a();
        }
        this.f156220c = null;
        lm2 lm2Var = this.f156221d;
        ns.o oVar = f156217e[0];
        View view = (View) lm2Var.f152056a.get();
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        this.f156218a.f153340a.g();
        lm2 lm2Var = this.f156221d;
        ns.o oVar = f156217e[0];
        View view2 = (View) lm2Var.f152056a.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            p12 p12Var = this.f156219b;
            o32 o32Var = this.f156218a;
            p12Var.getClass();
            o12 o12Var = new o12(view2, o32Var);
            this.f156220c = o12Var;
            lm2 lm2Var2 = o12Var.f153304b;
            ns.o oVar2 = o12.f153302d[0];
            View view3 = (View) lm2Var2.f152056a.get();
            if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(o12Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        o12 o12Var = this.f156220c;
        if (o12Var != null) {
            o12Var.a();
        }
        this.f156220c = null;
        this.f156218a.f153340a.h();
    }
}
