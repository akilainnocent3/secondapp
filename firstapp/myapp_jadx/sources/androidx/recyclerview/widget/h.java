package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import defpackage.g9i0;
import defpackage.r6i0;
import defpackage.rr1;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i0 {
    public static TimeInterpolator s;
    public final ArrayList<RecyclerView.d0> h = new ArrayList<>();
    public final ArrayList<RecyclerView.d0> i = new ArrayList<>();
    public final ArrayList<e> j = new ArrayList<>();
    public final ArrayList<d> k = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.d0>> l = new ArrayList<>();
    public final ArrayList<ArrayList<e>> m = new ArrayList<>();
    public final ArrayList<ArrayList<d>> n = new ArrayList<>();
    public final ArrayList<RecyclerView.d0> o = new ArrayList<>();
    public final ArrayList<RecyclerView.d0> p = new ArrayList<>();
    public final ArrayList<RecyclerView.d0> q = new ArrayList<>();
    public final ArrayList<RecyclerView.d0> r = new ArrayList<>();

    public class a implements Runnable {
        public final /* synthetic */ ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                h hVar = h.this;
                if (i >= size) {
                    arrayList.clear();
                    hVar.m.remove(arrayList);
                    return;
                }
                Object obj = arrayList.get(i);
                i++;
                e eVar = (e) obj;
                RecyclerView.d0 d0Var = eVar.a;
                int i2 = eVar.b;
                int i3 = eVar.c;
                int i4 = eVar.d;
                int i5 = eVar.e;
                hVar.getClass();
                View view = d0Var.itemView;
                int i6 = i4 - i2;
                int i7 = i5 - i3;
                if (i6 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i7 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                hVar.p.add(d0Var);
                viewPropertyAnimatorAnimate.setDuration(hVar.e).setListener(new k(hVar, d0Var, i6, view, i7, viewPropertyAnimatorAnimate)).start();
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ ArrayList a;

        public b(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                h hVar = h.this;
                if (i >= size) {
                    arrayList.clear();
                    hVar.n.remove(arrayList);
                    return;
                }
                Object obj = arrayList.get(i);
                i++;
                d dVar = (d) obj;
                ArrayList<RecyclerView.d0> arrayList2 = hVar.r;
                RecyclerView.d0 d0Var = dVar.a;
                View view = d0Var == null ? null : d0Var.itemView;
                RecyclerView.d0 d0Var2 = dVar.b;
                View view2 = d0Var2 != null ? d0Var2.itemView : null;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(hVar.f);
                    arrayList2.add(dVar.a);
                    duration.translationX(dVar.e - dVar.c);
                    duration.translationY(dVar.f - dVar.d);
                    duration.alpha(0.0f).setListener(new l(hVar, dVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                    arrayList2.add(dVar.b);
                    viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(hVar.f).alpha(1.0f).setListener(new m(hVar, dVar, viewPropertyAnimatorAnimate, view2)).start();
                }
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ ArrayList a;

        public c(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                h hVar = h.this;
                if (i >= size) {
                    arrayList.clear();
                    hVar.l.remove(arrayList);
                    return;
                }
                Object obj = arrayList.get(i);
                i++;
                RecyclerView.d0 d0Var = (RecyclerView.d0) obj;
                hVar.getClass();
                View view = d0Var.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                hVar.o.add(d0Var);
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(hVar.c).setListener(new j(view, viewPropertyAnimatorAnimate, hVar, d0Var)).start();
            }
        }
    }

    public static class d {
        public RecyclerView.d0 a;
        public RecyclerView.d0 b;
        public int c;
        public int d;
        public int e;
        public int f;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.a);
            sb.append(", newHolder=");
            sb.append(this.b);
            sb.append(", fromX=");
            sb.append(this.c);
            sb.append(", fromY=");
            sb.append(this.d);
            sb.append(", toX=");
            sb.append(this.e);
            sb.append(", toY=");
            return rr1.b(sb, this.f, '}');
        }
    }

    public static class e {
        public RecyclerView.d0 a;
        public int b;
        public int c;
        public int d;
        public int e;
    }

    public static void q(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.d0) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean g(RecyclerView.d0 d0Var, List<Object> list) {
        return !list.isEmpty() || f(d0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void i(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        view.animate().cancel();
        ArrayList<e> arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList.get(size).a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                h(d0Var);
                arrayList.remove(size);
            }
        }
        s(this.k, d0Var);
        if (this.h.remove(d0Var)) {
            view.setAlpha(1.0f);
            h(d0Var);
        }
        if (this.i.remove(d0Var)) {
            view.setAlpha(1.0f);
            h(d0Var);
        }
        ArrayList<ArrayList<d>> arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList<d> arrayList3 = arrayList2.get(size2);
            s(arrayList3, d0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<e>> arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList<e> arrayList5 = arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (arrayList5.get(size4).a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    h(d0Var);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.d0>> arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.d0> arrayList7 = arrayList6.get(size5);
            if (arrayList7.remove(d0Var)) {
                view.setAlpha(1.0f);
                h(d0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(d0Var);
        this.o.remove(d0Var);
        this.r.remove(d0Var);
        this.p.remove(d0Var);
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void j() {
        ArrayList<e> arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = arrayList.get(size);
            View view = eVar.a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            h(eVar.a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.d0> arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            h(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.d0> arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = arrayList3.get(size3);
            d0Var.itemView.setAlpha(1.0f);
            h(d0Var);
            arrayList3.remove(size3);
        }
        ArrayList<d> arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            d dVar = arrayList4.get(size4);
            RecyclerView.d0 d0Var2 = dVar.a;
            if (d0Var2 != null) {
                t(dVar, d0Var2);
            }
            RecyclerView.d0 d0Var3 = dVar.b;
            if (d0Var3 != null) {
                t(dVar, d0Var3);
            }
        }
        arrayList4.clear();
        if (k()) {
            ArrayList<ArrayList<e>> arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList<e> arrayList6 = arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    e eVar2 = arrayList6.get(size6);
                    View view2 = eVar2.a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    h(eVar2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.d0>> arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.d0> arrayList8 = arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.d0 d0Var4 = arrayList8.get(size8);
                    d0Var4.itemView.setAlpha(1.0f);
                    h(d0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList<ArrayList<d>> arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList<d> arrayList10 = arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    d dVar2 = arrayList10.get(size10);
                    RecyclerView.d0 d0Var5 = dVar2.a;
                    if (d0Var5 != null) {
                        t(dVar2, d0Var5);
                    }
                    RecyclerView.d0 d0Var6 = dVar2.b;
                    if (d0Var6 != null) {
                        t(dVar2, d0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            q(this.q);
            q(this.p);
            q(this.o);
            q(this.r);
            ArrayList<RecyclerView.l.a> arrayList11 = this.b;
            int size11 = arrayList11.size();
            for (int i = 0; i < size11; i++) {
                arrayList11.get(i).a();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean k() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void l() {
        long j;
        ArrayList<RecyclerView.d0> arrayList = this.h;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList<e> arrayList2 = this.j;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList<d> arrayList3 = this.k;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList<RecyclerView.d0> arrayList4 = this.i;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            j = this.d;
            if (i >= size) {
                break;
            }
            RecyclerView.d0 d0Var = arrayList.get(i);
            i++;
            RecyclerView.d0 d0Var2 = d0Var;
            View view = d0Var2.itemView;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.q.add(d0Var2);
            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new i(view, viewPropertyAnimatorAnimate, this, d0Var2)).start();
            arrayList = arrayList;
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList<e> arrayList5 = new ArrayList<>();
            arrayList5.addAll(arrayList2);
            this.m.add(arrayList5);
            arrayList2.clear();
            a aVar = new a(arrayList5);
            if (zIsEmpty) {
                aVar.run();
            } else {
                View view2 = arrayList5.get(0).a.itemView;
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                view2.postOnAnimationDelayed(aVar, j);
            }
        }
        if (!zIsEmpty3) {
            ArrayList<d> arrayList6 = new ArrayList<>();
            arrayList6.addAll(arrayList3);
            this.n.add(arrayList6);
            arrayList3.clear();
            b bVar = new b(arrayList6);
            if (zIsEmpty) {
                bVar.run();
            } else {
                View view3 = arrayList6.get(0).a.itemView;
                WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
                view3.postOnAnimationDelayed(bVar, j);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.d0> arrayList7 = new ArrayList<>();
        arrayList7.addAll(arrayList4);
        this.l.add(arrayList7);
        arrayList4.clear();
        c cVar = new c(arrayList7);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
            return;
        }
        if (zIsEmpty) {
            j = 0;
        }
        long jMax = Math.max(!zIsEmpty2 ? this.e : 0L, zIsEmpty3 ? 0L : this.f) + j;
        View view4 = arrayList7.get(0).itemView;
        WeakHashMap<View, g9i0> weakHashMap3 = r6i0.a;
        view4.postOnAnimationDelayed(cVar, jMax);
    }

    @Override // androidx.recyclerview.widget.i0
    public final void m(RecyclerView.d0 d0Var) {
        u(d0Var);
        d0Var.itemView.setAlpha(0.0f);
        this.i.add(d0Var);
    }

    @Override // androidx.recyclerview.widget.i0
    public final boolean n(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i, int i2, int i3, int i4) {
        if (d0Var == d0Var2) {
            return o(d0Var, i, i2, i3, i4);
        }
        float translationX = d0Var.itemView.getTranslationX();
        float translationY = d0Var.itemView.getTranslationY();
        float alpha = d0Var.itemView.getAlpha();
        u(d0Var);
        d0Var.itemView.setTranslationX(translationX);
        d0Var.itemView.setTranslationY(translationY);
        d0Var.itemView.setAlpha(alpha);
        u(d0Var2);
        d0Var2.itemView.setTranslationX(-((int) ((i3 - i) - translationX)));
        d0Var2.itemView.setTranslationY(-((int) ((i4 - i2) - translationY)));
        d0Var2.itemView.setAlpha(0.0f);
        d dVar = new d();
        dVar.a = d0Var;
        dVar.b = d0Var2;
        dVar.c = i;
        dVar.d = i2;
        dVar.e = i3;
        dVar.f = i4;
        this.k.add(dVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.i0
    public final boolean o(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) d0Var.itemView.getTranslationY());
        u(d0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            h(d0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        e eVar = new e();
        eVar.a = d0Var;
        eVar.b = translationX;
        eVar.c = translationY;
        eVar.d = i3;
        eVar.e = i4;
        this.j.add(eVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.i0
    public final void p(RecyclerView.d0 d0Var) {
        u(d0Var);
        this.h.add(d0Var);
    }

    public final void r() {
        if (k()) {
            return;
        }
        ArrayList<RecyclerView.l.a> arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
        arrayList.clear();
    }

    public final void s(ArrayList arrayList, RecyclerView.d0 d0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (t(dVar, d0Var) && dVar.a == null && dVar.b == null) {
                arrayList.remove(dVar);
            }
        }
    }

    public final boolean t(d dVar, RecyclerView.d0 d0Var) {
        if (dVar.b == d0Var) {
            dVar.b = null;
        } else {
            if (dVar.a != d0Var) {
                return false;
            }
            dVar.a = null;
        }
        d0Var.itemView.setAlpha(1.0f);
        d0Var.itemView.setTranslationX(0.0f);
        d0Var.itemView.setTranslationY(0.0f);
        h(d0Var);
        return true;
    }

    public final void u(RecyclerView.d0 d0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        d0Var.itemView.animate().setInterpolator(s);
        i(d0Var);
    }
}
