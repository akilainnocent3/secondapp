package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class yxi extends RecyclerView.f<uyi> implements wxd0 {
    public final s9s a;
    public final FragmentManager b;
    public final qkt<Fragment> c;
    public final qkt<Fragment.SavedState> d;
    public final qkt<Integer> e;
    public d f;
    public final c i;
    public boolean v;
    public boolean w;

    public class a implements cbs {
        public final /* synthetic */ uyi a;

        public a(uyi uyiVar) {
            this.a = uyiVar;
        }

        @Override // defpackage.cbs
        public final void F0(ibs ibsVar, s9s.a aVar) {
            yxi yxiVar = yxi.this;
            if (yxiVar.b.V()) {
                return;
            }
            ibsVar.getLifecycle().d(this);
            uyi uyiVar = this.a;
            FrameLayout frameLayout = (FrameLayout) uyiVar.itemView;
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            if (frameLayout.isAttachedToWindow()) {
                yxiVar.n(uyiVar);
            }
        }
    }

    public static abstract class b extends RecyclerView.h {
        @Override // androidx.recyclerview.widget.RecyclerView.h
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void b(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void c(int i, int i2, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void d(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void e(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void f(int i, int i2) {
            a();
        }
    }

    public static class c {
        public CopyOnWriteArrayList a;

        public static void b(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e.b) it.next()).getClass();
            }
        }

        public final ArrayList a() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((e) it.next()).getClass();
                arrayList.add(e.a);
            }
            return arrayList;
        }
    }

    public class d {
        public cyi a;
        public dyi b;
        public eyi c;
        public ViewPager2 d;
        public long e = -1;

        public d() {
        }

        public static ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            rcp.a(parent, "Expected ViewPager2 instance. Got: ");
            return null;
        }

        public final void b(boolean z) {
            int currentItem;
            Fragment fragmentB;
            yxi yxiVar = yxi.this;
            c cVar = yxiVar.i;
            qkt<Fragment> qktVar = yxiVar.c;
            FragmentManager fragmentManager = yxiVar.b;
            if (fragmentManager.V() || this.d.getScrollState() != 0 || qktVar.d() || yxiVar.getItemCount() == 0 || (currentItem = this.d.getCurrentItem()) >= yxiVar.getItemCount()) {
                return;
            }
            long itemId = yxiVar.getItemId(currentItem);
            if ((itemId != this.e || z) && (fragmentB = qktVar.b(itemId)) != null && fragmentB.isAdded()) {
                this.e = itemId;
                androidx.fragment.app.a aVarA = oke.a(fragmentManager, fragmentManager);
                ArrayList arrayList = new ArrayList();
                int i = 0;
                Fragment fragment = null;
                for (int i2 = 0; i2 < qktVar.h(); i2++) {
                    long jE = qktVar.e(i2);
                    Fragment fragmentI = qktVar.i(i2);
                    if (fragmentI.isAdded()) {
                        if (jE != this.e) {
                            aVarA.q(fragmentI, s9s.b.d);
                            arrayList.add(cVar.a());
                        } else {
                            fragment = fragmentI;
                        }
                        fragmentI.setMenuVisibility(jE == this.e);
                    }
                }
                if (fragment != null) {
                    aVarA.q(fragment, s9s.b.e);
                    arrayList.add(cVar.a());
                }
                if (aVarA.c.isEmpty()) {
                    return;
                }
                aVarA.l();
                Collections.reverse(arrayList);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    cVar.getClass();
                    c.b((List) obj);
                }
            }
        }
    }

    public static abstract class e {
        public static final a a = new a();

        public class a implements b {
        }

        public interface b {
        }
    }

    public yxi(FragmentManager fragmentManager, s9s s9sVar) {
        this.c = new qkt<>();
        this.d = new qkt<>();
        this.e = new qkt<>();
        c cVar = new c();
        cVar.a = new CopyOnWriteArrayList();
        this.i = cVar;
        this.v = false;
        this.w = false;
        this.b = fragmentManager;
        this.a = s9sVar;
        super.setHasStableIds(true);
    }

    public static void i(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            ib5.a("Design assumption violated.");
            return;
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    @Override // defpackage.wxd0
    public final Bundle a() {
        qkt<Fragment> qktVar = this.c;
        int iH = qktVar.h();
        qkt<Fragment.SavedState> qktVar2 = this.d;
        Bundle bundle = new Bundle(qktVar2.h() + iH);
        for (int i = 0; i < qktVar.h(); i++) {
            long jE = qktVar.e(i);
            Fragment fragmentB = qktVar.b(jE);
            if (fragmentB != null && fragmentB.isAdded()) {
                this.b.d0(bundle, avg.a(jE, "f#"), fragmentB);
            }
        }
        for (int i2 = 0; i2 < qktVar2.h(); i2++) {
            long jE2 = qktVar2.e(i2);
            if (j(jE2)) {
                bundle.putParcelable(avg.a(jE2, "s#"), qktVar2.b(jE2));
            }
        }
        return bundle;
    }

    @Override // defpackage.wxd0
    public final void e(Parcelable parcelable) {
        qkt<Fragment.SavedState> qktVar = this.d;
        if (qktVar.d()) {
            qkt<Fragment> qktVar2 = this.c;
            if (qktVar2.d()) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        qktVar2.f(this.b.M(str, bundle), Long.parseLong(str.substring(2)));
                    } else {
                        if (!str.startsWith("s#") || str.length() <= 2) {
                            hb5.a("Unexpected key in savedState: ".concat(str));
                            return;
                        }
                        long j = Long.parseLong(str.substring(2));
                        Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                        if (j(j)) {
                            qktVar.f(savedState, j);
                        }
                    }
                }
                if (qktVar2.d()) {
                    return;
                }
                this.w = true;
                this.v = true;
                l();
                Handler handler = new Handler(Looper.getMainLooper());
                ayi ayiVar = new ayi(this);
                this.a.a(new byi(handler, ayiVar));
                handler.postDelayed(ayiVar, 10000L);
                return;
            }
        }
        ib5.a("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public long getItemId(int i) {
        return i;
    }

    public boolean j(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    public abstract Fragment k(int i);

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        qkt<Fragment> qktVar;
        qkt<Integer> qktVar2;
        Fragment fragmentB;
        View view;
        if (!this.w || this.b.V()) {
            return;
        }
        tx0 tx0Var = new tx0(0);
        int i = 0;
        while (true) {
            qktVar = this.c;
            int iH = qktVar.h();
            qktVar2 = this.e;
            if (i >= iH) {
                break;
            }
            long jE = qktVar.e(i);
            if (!j(jE)) {
                tx0Var.add(Long.valueOf(jE));
                qktVar2.g(jE);
            }
            i++;
        }
        if (!this.v) {
            this.w = false;
            for (int i2 = 0; i2 < qktVar.h(); i2++) {
                long jE2 = qktVar.e(i2);
                if (qktVar2.c(jE2) < 0 && ((fragmentB = qktVar.b(jE2)) == null || (view = fragmentB.getView()) == null || view.getParent() == null)) {
                    tx0Var.add(Long.valueOf(jE2));
                }
            }
        }
        tx0.a aVar = new tx0.a();
        while (aVar.hasNext()) {
            o(((Long) aVar.next()).longValue());
        }
    }

    public final Long m(int i) {
        int i2 = 0;
        Long lValueOf = null;
        while (true) {
            qkt<Integer> qktVar = this.e;
            if (i2 >= qktVar.h()) {
                return lValueOf;
            }
            if (qktVar.i(i2).intValue() == i) {
                if (lValueOf != null) {
                    ib5.a("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    return null;
                }
                lValueOf = Long.valueOf(qktVar.e(i2));
            }
            i2++;
        }
    }

    public final void n(uyi uyiVar) {
        Fragment fragmentB = this.c.b(uyiVar.getItemId());
        if (fragmentB == null) {
            ib5.a("Design assumption violated.");
            return;
        }
        FrameLayout frameLayout = (FrameLayout) uyiVar.itemView;
        View view = fragmentB.getView();
        if (!fragmentB.isAdded() && view != null) {
            ib5.a("Design assumption violated.");
            return;
        }
        boolean zIsAdded = fragmentB.isAdded();
        FragmentManager fragmentManager = this.b;
        if (zIsAdded && view == null) {
            fragmentManager.e0(new zxi(this, fragmentB, frameLayout), false);
            return;
        }
        if (fragmentB.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                i(view, frameLayout);
                return;
            }
            return;
        }
        if (fragmentB.isAdded()) {
            i(view, frameLayout);
            return;
        }
        if (fragmentManager.V()) {
            if (fragmentManager.K) {
                return;
            }
            this.a.a(new a(uyiVar));
            return;
        }
        fragmentManager.e0(new zxi(this, fragmentB, frameLayout), false);
        c cVar = this.i;
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = cVar.a.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
            arrayList.add(e.a);
        }
        try {
            fragmentB.setMenuVisibility(false);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
            aVar.e(0, fragmentB, "f" + uyiVar.getItemId(), 1);
            aVar.q(fragmentB, s9s.b.d);
            aVar.l();
            this.f.b(false);
        } finally {
            c.b(arrayList);
        }
    }

    public final void o(long j) {
        ViewParent parent;
        qkt<Fragment> qktVar = this.c;
        Fragment fragmentB = qktVar.b(j);
        if (fragmentB == null) {
            return;
        }
        if (fragmentB.getView() != null && (parent = fragmentB.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zJ = j(j);
        qkt<Fragment.SavedState> qktVar2 = this.d;
        if (!zJ) {
            qktVar2.g(j);
        }
        if (!fragmentB.isAdded()) {
            qktVar.g(j);
            return;
        }
        FragmentManager fragmentManager = this.b;
        if (fragmentManager.V()) {
            this.w = true;
            return;
        }
        boolean zIsAdded = fragmentB.isAdded();
        e.a aVar = e.a;
        c cVar = this.i;
        if (zIsAdded && j(j)) {
            cVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = cVar.a.iterator();
            while (it.hasNext()) {
                ((e) it.next()).getClass();
                arrayList.add(aVar);
            }
            Fragment.SavedState savedStateJ0 = fragmentManager.j0(fragmentB);
            c.b(arrayList);
            qktVar2.f(savedStateJ0, j);
        }
        cVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = cVar.a.iterator();
        while (it2.hasNext()) {
            ((e) it2.next()).getClass();
            arrayList2.add(aVar);
        }
        try {
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
            aVar2.p(fragmentB);
            aVar2.l();
            qktVar.g(j);
        } finally {
            c.b(arrayList2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        km20.b(this.f == null);
        d dVar = new d();
        this.f = dVar;
        dVar.d = d.a(recyclerView);
        cyi cyiVar = new cyi(dVar);
        dVar.a = cyiVar;
        dVar.d.c(cyiVar);
        dyi dyiVar = new dyi(dVar);
        dVar.b = dyiVar;
        registerAdapterDataObserver(dyiVar);
        eyi eyiVar = new eyi(dVar);
        dVar.c = eyiVar;
        this.a.a(eyiVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        uyi uyiVar = (uyi) d0Var;
        long itemId = uyiVar.getItemId();
        int id = ((FrameLayout) uyiVar.itemView).getId();
        Long lM = m(id);
        qkt<Integer> qktVar = this.e;
        if (lM != null && lM.longValue() != itemId) {
            o(lM.longValue());
            qktVar.g(lM.longValue());
        }
        qktVar.f(Integer.valueOf(id), itemId);
        long itemId2 = getItemId(i);
        qkt<Fragment> qktVar2 = this.c;
        if (qktVar2.c(itemId2) < 0) {
            Fragment fragmentK = k(i);
            fragmentK.setInitialSavedState(this.d.b(itemId2));
            qktVar2.f(fragmentK, itemId2);
        }
        FrameLayout frameLayout = (FrameLayout) uyiVar.itemView;
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        if (frameLayout.isAttachedToWindow()) {
            n(uyiVar);
        }
        l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = uyi.a;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new uyi(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        d dVar = this.f;
        dVar.getClass();
        d.a(recyclerView).f(dVar.a);
        yxi yxiVar = yxi.this;
        yxiVar.unregisterAdapterDataObserver(dVar.b);
        yxiVar.a.d(dVar.c);
        dVar.d = null;
        this.f = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final boolean onFailedToRecycleView(RecyclerView.d0 d0Var) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewAttachedToWindow(RecyclerView.d0 d0Var) {
        n((uyi) d0Var);
        l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewRecycled(RecyclerView.d0 d0Var) {
        Long lM = m(((FrameLayout) ((uyi) d0Var).itemView).getId());
        if (lM != null) {
            o(lM.longValue());
            this.e.g(lM.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public yxi(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public yxi(androidx.fragment.app.e eVar) {
        this(eVar.getSupportFragmentManager(), eVar.getLifecycle());
    }
}
