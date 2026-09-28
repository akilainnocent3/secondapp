package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class q8j0 {
    public static final WeakHashMap<View, q8j0> v = new WeakHashMap<>();
    public final pd0 a = new pd0(4, "captionBar");
    public final pd0 b;
    public final pd0 c;
    public final pd0 d;
    public final pd0 e;
    public final pd0 f;
    public final pd0 g;
    public final pd0 h;
    public final pd0 i;
    public final bvh0 j;
    public final ydh0 k;
    public final bvh0 l;
    public final bvh0 m;
    public final bvh0 n;
    public final bvh0 o;
    public final bvh0 p;
    public final bvh0 q;
    public final bvh0 r;
    public final boolean s;
    public int t;
    public final ann u;

    public static final class a {
        public static q8j0 a(androidx.compose.runtime.a aVar) {
            final q8j0 q8j0Var;
            final View view = (View) aVar.O(AndroidCompositionLocals_androidKt.f);
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            synchronized (weakHashMap) {
                try {
                    q8j0 q8j0Var2 = weakHashMap.get(view);
                    if (q8j0Var2 == null) {
                        q8j0Var2 = new q8j0(view);
                        weakHashMap.put(view, q8j0Var2);
                    }
                    q8j0Var = q8j0Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            boolean zA = aVar.A(q8j0Var) | aVar.A(view);
            Object objY = aVar.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: o8j0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        q8j0 q8j0Var3 = q8j0Var;
                        ann annVar = q8j0Var3.u;
                        int i = q8j0Var3.t;
                        View view2 = view;
                        if (i == 0) {
                            WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
                            r6i0.d.n(view2, annVar);
                            if (view2.isAttachedToWindow()) {
                                view2.requestApplyInsets();
                            }
                            view2.addOnAttachStateChangeListener(annVar);
                            h8j0.a(view2, annVar);
                        }
                        q8j0Var3.t++;
                        return new p8j0(q8j0Var3, view2);
                    }
                };
                aVar.r(objY);
            }
            xvf.c(q8j0Var, (Function1) objY, aVar);
            return q8j0Var;
        }

        public static bvh0 b(int i, String str) {
            return new bvh0(new enn(0, 0, 0, 0), str);
        }
    }

    public q8j0(View view) {
        pd0 pd0Var = new pd0(128, "displayCutout");
        this.b = pd0Var;
        pd0 pd0Var2 = new pd0(8, "ime");
        this.c = pd0Var2;
        pd0 pd0Var3 = new pd0(32, "mandatorySystemGestures");
        this.d = pd0Var3;
        this.e = new pd0(2, "navigationBars");
        this.f = new pd0(1, "statusBars");
        pd0 pd0Var4 = new pd0(519, "systemBars");
        this.g = pd0Var4;
        pd0 pd0Var5 = new pd0(16, "systemGestures");
        this.h = pd0Var5;
        pd0 pd0Var6 = new pd0(64, "tappableElement");
        this.i = pd0Var6;
        bvh0 bvh0Var = new bvh0(new enn(0, 0, 0, 0), "waterfall");
        this.j = bvh0Var;
        this.k = new ydh0(new ydh0(pd0Var4, pd0Var2), pd0Var);
        new ydh0(new ydh0(new ydh0(pd0Var6, pd0Var3), pd0Var5), bvh0Var);
        this.l = a.b(4, "captionBarIgnoringVisibility");
        this.m = a.b(2, "navigationBarsIgnoringVisibility");
        this.n = a.b(1, "statusBarsIgnoringVisibility");
        this.o = a.b(519, "systemBarsIgnoringVisibility");
        this.p = a.b(64, "tappableElementIgnoringVisibility");
        this.q = a.b(8, "imeAnimationTarget");
        this.r = a.b(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.s = bool != null ? bool.booleanValue() : false;
        this.u = new ann(this);
    }

    public static void a(q8j0 q8j0Var, l8j0 l8j0Var) {
        q8j0Var.a.f(l8j0Var, 0);
        q8j0Var.c.f(l8j0Var, 0);
        q8j0Var.b.f(l8j0Var, 0);
        q8j0Var.e.f(l8j0Var, 0);
        q8j0Var.f.f(l8j0Var, 0);
        q8j0Var.g.f(l8j0Var, 0);
        q8j0Var.h.f(l8j0Var, 0);
        q8j0Var.i.f(l8j0Var, 0);
        q8j0Var.d.f(l8j0Var, 0);
        bvh0 bvh0Var = q8j0Var.l;
        l8j0.l lVar = l8j0Var.a;
        bvh0Var.f(z8j0.a(lVar.h(4)));
        q8j0Var.m.f(z8j0.a(lVar.h(2)));
        q8j0Var.n.f(z8j0.a(lVar.h(1)));
        q8j0Var.o.f(z8j0.a(lVar.h(519)));
        q8j0Var.p.f(z8j0.a(lVar.h(64)));
        ise iseVarF = lVar.f();
        if (iseVarF != null) {
            q8j0Var.j.f(z8j0.a(iseVarF.a()));
        }
        c5a0.e.getClass();
        c5a0.a.f();
    }
}
