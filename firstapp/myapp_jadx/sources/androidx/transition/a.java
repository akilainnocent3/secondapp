package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;
import defpackage.gc6;
import defpackage.hb5;
import defpackage.hgd;
import defpackage.ngd;
import defpackage.ryi;
import defpackage.syi;
import defpackage.ztg0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a extends ryi {

    /* JADX INFO: renamed from: androidx.transition.a$a, reason: collision with other inner class name */
    public class C0074a extends Transition.c {
        public final /* synthetic */ Rect a;

        public C0074a(Rect rect) {
            this.a = rect;
        }

        @Override // androidx.transition.Transition.c
        public final Rect a() {
            return this.a;
        }
    }

    public class c extends Transition.c {
        public final /* synthetic */ Rect a;

        public c(Rect rect) {
            this.a = rect;
        }

        @Override // androidx.transition.Transition.c
        public final Rect a() {
            Rect rect = this.a;
            if (rect.isEmpty()) {
                return null;
            }
            return rect;
        }
    }

    @Override // defpackage.ryi
    public final void a(View view, Object obj) {
        ((Transition) obj).b(view);
    }

    @Override // defpackage.ryi
    public final void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.W.size();
            while (i < size) {
                b(transitionSet.Q(i), arrayList);
                i++;
            }
            return;
        }
        if (ryi.k(transition.e) && ryi.k(transition.f)) {
            int size2 = arrayList.size();
            while (i < size2) {
                transition.b(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.ryi
    public final void c(Object obj) {
        ((ztg0) obj).d();
    }

    @Override // defpackage.ryi
    public final void d(Object obj, ngd ngdVar) {
        ((ztg0) obj).i(ngdVar);
    }

    @Override // defpackage.ryi
    public final void e(ViewGroup viewGroup, Object obj) {
        e.a(viewGroup, (Transition) obj);
    }

    @Override // defpackage.ryi
    public final boolean g(Object obj) {
        return obj instanceof Transition;
    }

    @Override // defpackage.ryi
    public final Object h(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // defpackage.ryi
    public final Object i(ViewGroup viewGroup, Object obj) {
        Transition transition = (Transition) obj;
        ArrayList<ViewGroup> arrayList = e.c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut() && Build.VERSION.SDK_INT >= 34) {
            if (transition.v()) {
                arrayList.add(viewGroup);
                Transition transitionClone = transition.clone();
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.P(transitionClone);
                e.c(viewGroup, transitionSet);
                viewGroup.setTag(R.id.transition_current_scene, null);
                e.a aVar = new e.a();
                aVar.a = transitionSet;
                aVar.b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(aVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                viewGroup.invalidate();
                Transition.e eVar = new Transition.e(transitionSet);
                transitionSet.Q = eVar;
                transitionSet.a(eVar);
                return transitionSet.Q;
            }
            hb5.a("The Transition must support seeking.");
        }
        return null;
    }

    @Override // defpackage.ryi
    public final boolean l() {
        return true;
    }

    @Override // defpackage.ryi
    public final boolean m(Object obj) {
        boolean zV = ((Transition) obj).v();
        if (!zV) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zV;
    }

    @Override // defpackage.ryi
    public final Object n(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.P(transition);
            transitionSet.P(transition2);
            transitionSet.T(1);
            transition = transitionSet;
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition != null) {
            transitionSet2.P(transition);
        }
        transitionSet2.P(transition3);
        return transitionSet2;
    }

    @Override // defpackage.ryi
    public final Object o(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.P((Transition) obj);
        }
        transitionSet.P((Transition) obj2);
        return transitionSet;
    }

    @Override // defpackage.ryi
    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).a(new b(view, arrayList));
    }

    @Override // defpackage.ryi
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).a(new androidx.transition.b(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.ryi
    public final void r(Object obj, float f) {
        ztg0 ztg0Var = (ztg0) obj;
        if (ztg0Var.isReady()) {
            long jB = (long) (f * ztg0Var.b());
            if (jB == 0) {
                jB = 1;
            }
            if (jB == ztg0Var.b()) {
                jB = ztg0Var.b() - 1;
            }
            ztg0Var.h(jB);
        }
    }

    @Override // defpackage.ryi
    public final void s(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            ryi.j(rect, view);
            ((Transition) obj).I(new C0074a(rect));
        }
    }

    @Override // defpackage.ryi
    public final void t(Object obj, Rect rect) {
        ((Transition) obj).I(new c(rect));
    }

    @Override // defpackage.ryi
    public final void u(Fragment fragment, Object obj, gc6 gc6Var, Runnable runnable) {
        v(obj, gc6Var, null, runnable);
    }

    @Override // defpackage.ryi
    public final void v(Object obj, gc6 gc6Var, hgd hgdVar, Runnable runnable) {
        Transition transition = (Transition) obj;
        syi syiVar = new syi(hgdVar, transition, runnable);
        synchronized (gc6Var) {
            while (gc6Var.d) {
                try {
                    try {
                        gc6Var.wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (gc6Var.b != syiVar) {
                gc6Var.b = syiVar;
                if (gc6Var.a) {
                    Runnable runnable2 = syiVar.a;
                    Transition transition2 = syiVar.b;
                    Runnable runnable3 = syiVar.c;
                    if (runnable2 == null) {
                        transition2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        transition.a(new androidx.transition.c(runnable));
    }

    @Override // defpackage.ryi
    public final void w(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        ArrayList<View> arrayList2 = transitionSet.f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ryi.f(arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // defpackage.ryi
    public final void x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            ArrayList<View> arrayList3 = transitionSet.f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // defpackage.ryi
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.P((Transition) obj);
        return transitionSet;
    }

    public final void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.W.size();
            while (i < size) {
                z(transitionSet.Q(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (ryi.k(transition.e)) {
            ArrayList<View> arrayList3 = transition.f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    transition.b(arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    transition.C(arrayList.get(size3));
                }
            }
        }
    }

    public class b implements Transition.f {
        public final /* synthetic */ View a;
        public final /* synthetic */ ArrayList b;

        public b(View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // androidx.transition.Transition.f
        public final void g(Transition transition) {
            transition.B(this);
            transition.a(this);
        }

        @Override // androidx.transition.Transition.f
        public final void j(Transition transition) {
            transition.B(this);
            this.a.setVisibility(8);
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((View) arrayList.get(i)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.f
        public final void k(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public final void a() {
        }

        @Override // androidx.transition.Transition.f
        public final void f() {
        }
    }
}
