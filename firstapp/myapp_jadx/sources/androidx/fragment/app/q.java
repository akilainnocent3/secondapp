package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.q;
import com.sportybet.android.gp.tz.R;
import defpackage.hb5;
import defpackage.hce0;
import defpackage.he;
import defpackage.p48;
import defpackage.sr1;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    public static class a {
        public boolean a;
        public boolean b;

        public boolean a() {
            return this instanceof androidx.fragment.app.b.c;
        }

        public void b(ViewGroup viewGroup) {
            viewGroup.getClass();
        }

        public void c(ViewGroup viewGroup) {
            viewGroup.getClass();
        }

        public void d(sr1 sr1Var, ViewGroup viewGroup) {
            viewGroup.getClass();
        }

        public void e(ViewGroup viewGroup) {
            viewGroup.getClass();
        }
    }

    public static final class b extends c {
        public final k l;

        public b(c.b bVar, c.a aVar, k kVar) {
            super(bVar, aVar, kVar.c);
            this.l = kVar;
        }

        @Override // androidx.fragment.app.q.c
        public final void b() {
            super.b();
            this.c.mTransitioning = false;
            this.l.k();
        }

        @Override // androidx.fragment.app.q.c
        public final void e() {
            k kVar = this.l;
            Fragment fragment = kVar.c;
            if (this.h) {
                return;
            }
            this.h = true;
            c.a aVar = this.b;
            if (aVar != c.a.b) {
                if (aVar == c.a.c) {
                    View viewRequireView = fragment.requireView();
                    viewRequireView.getClass();
                    if (FragmentManager.R(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragment);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            View viewFindFocus = fragment.mView.findFocus();
            if (viewFindFocus != null) {
                fragment.setFocusedView(viewFindFocus);
                if (FragmentManager.R(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                }
            }
            View viewRequireView2 = this.c.requireView();
            viewRequireView2.getClass();
            if (viewRequireView2.getParent() == null) {
                if (FragmentManager.R(2)) {
                    Log.v("FragmentManager", "Adding fragment " + fragment + " view " + viewRequireView2 + " to container in onStart");
                }
                kVar.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                if (FragmentManager.R(2)) {
                    Log.v("FragmentManager", "Making view " + viewRequireView2 + " INVISIBLE in onStart");
                }
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragment.getPostOnViewCreatedAlpha());
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Setting view alpha to " + fragment.getPostOnViewCreatedAlpha() + " in onStart");
            }
        }
    }

    public static class c {
        public b a;
        public a b;
        public final Fragment c;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;
        public final ArrayList j;
        public final ArrayList k;
        public final ArrayList d = new ArrayList();
        public boolean i = true;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a a;
            public static final a b;
            public static final a c;
            public static final /* synthetic */ a[] d;

            static {
                a aVar = new a("NONE", 0);
                a = aVar;
                a aVar2 = new a("ADDING", 1);
                b = aVar2;
                a aVar3 = new a("REMOVING", 2);
                c = aVar3;
                d = new a[]{aVar, aVar2, aVar3};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) d.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class b {
            public static final b a;
            public static final b b;
            public static final b c;
            public static final b d;
            public static final /* synthetic */ b[] e;

            static {
                b bVar = new b("REMOVED", 0);
                a = bVar;
                b bVar2 = new b("VISIBLE", 1);
                b = bVar2;
                b bVar3 = new b("GONE", 2);
                c = bVar3;
                b bVar4 = new b("INVISIBLE", 3);
                d = bVar4;
                e = new b[]{bVar, bVar2, bVar3, bVar4};
            }

            public b() {
                throw null;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) e.clone();
            }

            public final void a(View view, ViewGroup viewGroup) {
                view.getClass();
                viewGroup.getClass();
                if (FragmentManager.R(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
                }
                int iOrdinal = ordinal();
                if (iOrdinal == 0) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        if (FragmentManager.R(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                        }
                        viewGroup2.removeView(view);
                        return;
                    }
                    return;
                }
                if (iOrdinal == 1) {
                    if (FragmentManager.R(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (FragmentManager.R(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                        }
                        viewGroup.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (iOrdinal == 2) {
                    if (FragmentManager.R(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (iOrdinal != 3) {
                    return;
                }
                if (FragmentManager.R(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public c(b bVar, a aVar, Fragment fragment) {
            this.a = bVar;
            this.b = aVar;
            this.c = fragment;
            ArrayList arrayList = new ArrayList();
            this.j = arrayList;
            this.k = arrayList;
        }

        public final void a(ViewGroup viewGroup) {
            viewGroup.getClass();
            this.h = false;
            if (this.e) {
                return;
            }
            this.e = true;
            if (this.j.isEmpty()) {
                b();
                return;
            }
            for (a aVar : CollectionsKt.A0(this.k)) {
                aVar.getClass();
                if (!aVar.b) {
                    aVar.b(viewGroup);
                }
                aVar.b = true;
            }
        }

        public void b() {
            int i = 0;
            this.h = false;
            if (this.f) {
                return;
            }
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f = true;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }

        public final void c(a aVar) {
            aVar.getClass();
            ArrayList arrayList = this.j;
            if (arrayList.remove(aVar) && arrayList.isEmpty()) {
                b();
            }
        }

        public final void d(b bVar, a aVar) {
            int iOrdinal = aVar.ordinal();
            Fragment fragment = this.c;
            b bVar2 = b.a;
            if (iOrdinal == 0) {
                if (this.a != bVar2) {
                    if (FragmentManager.R(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.a + " -> " + bVar + '.');
                    }
                    this.a = bVar;
                    return;
                }
                return;
            }
            if (iOrdinal == 1) {
                if (this.a == bVar2) {
                    if (FragmentManager.R(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                    }
                    this.a = b.b;
                    this.b = a.b;
                    this.i = true;
                    return;
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
            }
            this.a = bVar2;
            this.b = a.c;
            this.i = true;
        }

        public void e() {
            this.h = true;
        }

        public final String toString() {
            StringBuilder sbA = he.a("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            sbA.append(this.a);
            sbA.append(" lifecycleImpact = ");
            sbA.append(this.b);
            sbA.append(" fragment = ");
            sbA.append(this.c);
            sbA.append('}');
            return sbA.toString();
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public q(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final q i(ViewGroup viewGroup, FragmentManager fragmentManager) {
        viewGroup.getClass();
        fragmentManager.getClass();
        fragmentManager.P().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof q) {
            return (q) tag;
        }
        androidx.fragment.app.b bVar = new androidx.fragment.app.b(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, bVar);
        return bVar;
    }

    public static boolean j(ArrayList arrayList) {
        boolean z;
        Object obj;
        int size = arrayList.size();
        int i = 0;
        loop0: while (true) {
            z = true;
            while (true) {
                if (i >= size) {
                    break loop0;
                }
                Object obj2 = arrayList.get(i);
                i++;
                c cVar = (c) obj2;
                if (!cVar.k.isEmpty()) {
                    ArrayList arrayList2 = cVar.k;
                    if (!arrayList2.isEmpty()) {
                        int size2 = arrayList2.size();
                        int i2 = 0;
                        do {
                            if (i2 >= size2) {
                                break;
                            }
                            obj = arrayList2.get(i2);
                            i2++;
                        } while (((a) obj).a());
                    } else {
                        break;
                    }
                }
                z = false;
            }
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList.get(i3);
                i3++;
                p48.w(((c) obj3).k, arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(c cVar) {
        cVar.getClass();
        if (cVar.i) {
            c.b bVar = cVar.a;
            View viewRequireView = cVar.c.requireView();
            viewRequireView.getClass();
            bVar.a(viewRequireView, this.a);
            cVar.i = false;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z);

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            p48.w(((c) obj).k, arrayList2);
        }
        List listA0 = CollectionsKt.A0(CollectionsKt.E0(arrayList2));
        int size2 = listA0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((a) listA0.get(i2)).c(this.a);
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            a((c) arrayList.get(i3));
        }
        List listA1 = CollectionsKt.A0(arrayList);
        int size4 = listA1.size();
        for (int i4 = 0; i4 < size4; i4++) {
            c cVar = (c) listA1.get(i4);
            if (cVar.k.isEmpty()) {
                cVar.b();
            }
        }
    }

    public final void d(c.b bVar, c.a aVar, k kVar) {
        synchronized (this.b) {
            try {
                c cVarF = f(kVar.c);
                if (cVarF == null) {
                    Fragment fragment = kVar.c;
                    cVarF = (fragment.mTransitioning || fragment.mRemoving) ? g(fragment) : null;
                }
                if (cVarF != null) {
                    cVarF.d(bVar, aVar);
                    return;
                }
                final b bVar2 = new b(bVar, aVar, kVar);
                this.b.add(bVar2);
                bVar2.d.add(new Runnable() { // from class: androidx.fragment.app.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        q qVar = this.a;
                        ArrayList arrayList = qVar.b;
                        q.b bVar3 = bVar2;
                        if (arrayList.contains(bVar3)) {
                            q.c.b bVar4 = bVar3.a;
                            View view = bVar3.c.mView;
                            view.getClass();
                            bVar4.a(view, qVar.a);
                        }
                    }
                });
                bVar2.d.add(new Runnable() { // from class: isa0
                    @Override // java.lang.Runnable
                    public final void run() {
                        q qVar = this.a;
                        ArrayList arrayList = qVar.b;
                        q.b bVar3 = bVar2;
                        arrayList.remove(bVar3);
                        qVar.c.remove(bVar3);
                    }
                });
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        boolean z;
        if (this.f) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            h();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList arrayList = new ArrayList(this.c);
                this.c.clear();
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    z = true;
                    if (i >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i);
                    i++;
                    c cVar = (c) obj;
                    if (this.b.isEmpty() || !cVar.c.mTransitioning) {
                        z = false;
                    }
                    cVar.g = z;
                }
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    c cVar2 = (c) obj2;
                    if (this.d) {
                        if (FragmentManager.R(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + cVar2);
                        }
                        cVar2.b();
                    } else {
                        if (FragmentManager.R(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + cVar2);
                        }
                        cVar2.a(this.a);
                    }
                    this.d = false;
                    if (!cVar2.f) {
                        this.c.add(cVar2);
                    }
                }
                if (!this.b.isEmpty()) {
                    m();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    if (FragmentManager.R(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayList2, this.e);
                    boolean zJ = j(arrayList2);
                    int size3 = arrayList2.size();
                    int i3 = 0;
                    boolean z2 = true;
                    while (i3 < size3) {
                        Object obj3 = arrayList2.get(i3);
                        i3++;
                        if (!((c) obj3).c.mTransitioning) {
                            z2 = false;
                        }
                    }
                    if (!z2 || zJ) {
                        z = false;
                    }
                    this.d = z;
                    if (FragmentManager.R(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zJ + " \ntransition = " + z2);
                    }
                    if (!z2) {
                        l(arrayList2);
                        c(arrayList2);
                    } else if (zJ) {
                        l(arrayList2);
                        int size4 = arrayList2.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            a((c) arrayList2.get(i4));
                        }
                    }
                    this.e = false;
                    if (FragmentManager.R(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final c f(Fragment fragment) {
        Object obj;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            obj = arrayList.get(i);
            i++;
            c cVar = (c) obj;
            if (cVar.c.equals(fragment) && !cVar.e) {
                return (c) obj;
            }
        }
        obj = null;
        return (c) obj;
    }

    public final c g(Fragment fragment) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            obj = arrayList.get(i);
            i++;
            c cVar = (c) obj;
            if (cVar.c.equals(fragment) && !cVar.e) {
                return (c) obj;
            }
        }
        obj = null;
        return (c) obj;
    }

    public final void h() {
        String str;
        String str2;
        if (FragmentManager.R(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                m();
                l(this.b);
                ArrayList arrayList = new ArrayList(this.c);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((c) obj).g = false;
                }
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    c cVar = (c) obj2;
                    if (FragmentManager.R(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + cVar);
                    }
                    cVar.a(this.a);
                }
                ArrayList arrayList2 = new ArrayList(this.b);
                int size3 = arrayList2.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    ((c) obj3).g = false;
                }
                int size4 = arrayList2.size();
                while (i < size4) {
                    Object obj4 = arrayList2.get(i);
                    i++;
                    c cVar2 = (c) obj4;
                    if (FragmentManager.R(2)) {
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + cVar2);
                    }
                    cVar2.a(this.a);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        Object objPrevious;
        c.b bVar;
        synchronized (this.b) {
            try {
                m();
                ArrayList arrayList = this.b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    c cVar = (c) objPrevious;
                    View view = cVar.c.mView;
                    view.getClass();
                    if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                        bVar = c.b.d;
                    } else {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            bVar = c.b.b;
                        } else if (visibility == 4) {
                            bVar = c.b.d;
                        } else {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            bVar = c.b.c;
                        }
                    }
                    c.b bVar2 = cVar.a;
                    c.b bVar3 = c.b.b;
                    if (bVar2 == bVar3 && bVar != bVar3) {
                        break;
                    }
                }
                c cVar2 = (c) objPrevious;
                Fragment fragment = cVar2 != null ? cVar2.c : null;
                this.f = fragment != null ? fragment.isPostponed() : false;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((c) arrayList.get(i)).e();
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            p48.w(((c) obj).k, arrayList2);
        }
        List listA0 = CollectionsKt.A0(CollectionsKt.E0(arrayList2));
        int size3 = listA0.size();
        for (int i3 = 0; i3 < size3; i3++) {
            a aVar = (a) listA0.get(i3);
            aVar.getClass();
            ViewGroup viewGroup = this.a;
            viewGroup.getClass();
            if (!aVar.a) {
                aVar.e(viewGroup);
            }
            aVar.a = true;
        }
    }

    public final void m() {
        c.b bVar;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c cVar = (c) obj;
            if (cVar.b == c.a.b) {
                View viewRequireView = cVar.c.requireView();
                viewRequireView.getClass();
                int visibility = viewRequireView.getVisibility();
                if (visibility == 0) {
                    bVar = c.b.b;
                } else if (visibility == 4) {
                    bVar = c.b.d;
                } else {
                    if (visibility != 8) {
                        hb5.a(hce0.a(visibility, "Unknown visibility "));
                        return;
                    }
                    bVar = c.b.c;
                }
                cVar.d(bVar, c.a.a);
            }
        }
    }
}
