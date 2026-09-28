package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.d;
import androidx.fragment.app.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lske;", "Lvkx;", "Lske$a;", "a", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@vkx.a("dialog")
public final class ske extends vkx<a> {
    public final Context c;
    public final FragmentManager d;
    public final LinkedHashSet e;
    public final b f;
    public final LinkedHashMap g;

    public static class a extends ygx implements jyh {
        public String i;

        public a() {
            throw null;
        }

        @Override // defpackage.ygx
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof a) && super.equals(obj) && Intrinsics.g(this.i, ((a) obj).i);
        }

        @Override // defpackage.ygx
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.i;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // defpackage.ygx
        public final void k(Context context, AttributeSet attributeSet) {
            context.getClass();
            super.k(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, ck30.a);
            typedArrayObtainAttributes.getClass();
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                this.i = string;
            }
            typedArrayObtainAttributes.recycle();
        }
    }

    public static final class b implements cbs {

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[s9s.a.values().length];
                try {
                    iArr[s9s.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[s9s.a.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[s9s.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[s9s.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
            }
        }

        public b() {
        }

        @Override // defpackage.cbs
        public final void F0(ibs ibsVar, s9s.a aVar) {
            int iNextIndex;
            int i = a.a[aVar.ordinal()];
            ske skeVar = ske.this;
            if (i == 1) {
                d dVar = (d) ibsVar;
                Iterable iterable = (Iterable) skeVar.b().e.a.getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (((ifx) it.next()).f.equals(dVar.getTag())) {
                            return;
                        }
                    }
                }
                dVar.dismiss();
                return;
            }
            Object obj = null;
            if (i == 2) {
                d dVar2 = (d) ibsVar;
                for (Object obj2 : (Iterable) skeVar.b().f.a.getValue()) {
                    if (((ifx) obj2).f.equals(dVar2.getTag())) {
                        obj = obj2;
                    }
                }
                ifx ifxVar = (ifx) obj;
                if (ifxVar != null) {
                    skeVar.b().b(ifxVar);
                    return;
                }
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                d dVar3 = (d) ibsVar;
                for (Object obj3 : (Iterable) skeVar.b().f.a.getValue()) {
                    if (((ifx) obj3).f.equals(dVar3.getTag())) {
                        obj = obj3;
                    }
                }
                ifx ifxVar2 = (ifx) obj;
                if (ifxVar2 != null) {
                    skeVar.b().b(ifxVar2);
                }
                dVar3.getLifecycle().d(this);
                return;
            }
            d dVar4 = (d) ibsVar;
            if (dVar4.requireDialog().isShowing()) {
                return;
            }
            List list = (List) skeVar.b().e.a.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((ifx) listIterator.previous()).f.equals(dVar4.getTag())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            ifx ifxVar3 = (ifx) CollectionsKt.V(iNextIndex, list);
            if (!Intrinsics.g(CollectionsKt.d0(list), ifxVar3)) {
                Log.i("DialogFragmentNavigator", "Dialog " + dVar4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
            }
            if (ifxVar3 != null) {
                skeVar.l(iNextIndex, ifxVar3, false);
            }
        }
    }

    public ske(Context context, FragmentManager fragmentManager) {
        context.getClass();
        fragmentManager.getClass();
        this.c = context;
        this.d = fragmentManager;
        this.e = new LinkedHashSet();
        this.f = new b();
        this.g = new LinkedHashMap();
    }

    @Override // defpackage.vkx
    public final ygx a() {
        return new a(this);
    }

    @Override // defpackage.vkx
    public final void d(List list, zix zixVar) {
        list.getClass();
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.V()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ifx ifxVar = (ifx) it.next();
            k(ifxVar).show(fragmentManager, ifxVar.f);
            ifx ifxVar2 = (ifx) CollectionsKt.d0((List) b().e.a.getValue());
            boolean zM = CollectionsKt.M((Iterable) b().f.a.getValue(), ifxVar2);
            b().h(ifxVar);
            if (ifxVar2 != null && !zM) {
                b().b(ifxVar2);
            }
        }
    }

    @Override // defpackage.vkx
    public final void e(yfx.a aVar) {
        s9s lifecycle;
        super.e(aVar);
        Iterator it = ((List) aVar.e.a.getValue()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            FragmentManager fragmentManager = this.d;
            if (!zHasNext) {
                fragmentManager.q.add(new zwi() { // from class: rke
                    @Override // defpackage.zwi
                    public final void a(FragmentManager fragmentManager2, Fragment fragment) {
                        fragmentManager2.getClass();
                        ske skeVar = this.a;
                        LinkedHashSet linkedHashSet = skeVar.e;
                        if (y8h0.a(linkedHashSet).remove(fragment.getTag())) {
                            fragment.getLifecycle().a(skeVar.f);
                        }
                        LinkedHashMap linkedHashMap = skeVar.g;
                        y8h0.c(linkedHashMap).remove(fragment.getTag());
                    }
                });
                return;
            }
            ifx ifxVar = (ifx) it.next();
            d dVar = (d) fragmentManager.H(ifxVar.f);
            if (dVar == null || (lifecycle = dVar.getLifecycle()) == null) {
                this.e.add(ifxVar.f);
            } else {
                lifecycle.a(this.f);
            }
        }
    }

    @Override // defpackage.vkx
    public final void f(ifx ifxVar) {
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.V()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        String str = ifxVar.f;
        d dVar = (d) this.g.get(str);
        if (dVar == null) {
            Fragment fragmentH = fragmentManager.H(str);
            dVar = fragmentH instanceof d ? (d) fragmentH : null;
        }
        if (dVar != null) {
            dVar.getLifecycle().d(this.f);
            dVar.dismiss();
        }
        k(ifxVar).show(fragmentManager, str);
        xkx xkxVarB = b();
        List list = (List) xkxVarB.e.a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            ifx ifxVar2 = (ifx) listIterator.previous();
            if (ifxVar2.f.equals(str)) {
                wwd0 wwd0Var = xkxVarB.c;
                wwd0Var.k(null, yi80.f(yi80.f((Set) wwd0Var.getValue(), ifxVar2), ifxVar));
                xkxVarB.c(ifxVar);
                return;
            }
        }
        ibh0.a("List contains no element matching the predicate.");
    }

    @Override // defpackage.vkx
    public final void i(ifx ifxVar, boolean z) {
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.V()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().e.a.getValue();
        int iIndexOf = list.indexOf(ifxVar);
        Iterator it = CollectionsKt.m0(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentH = fragmentManager.H(((ifx) it.next()).f);
            if (fragmentH != null) {
                ((d) fragmentH).dismiss();
            }
        }
        l(iIndexOf, ifxVar, z);
    }

    public final d k(ifx ifxVar) {
        ygx ygxVar = ifxVar.b;
        ygxVar.getClass();
        a aVar = (a) ygxVar;
        String str = aVar.i;
        if (str == null) {
            ib5.a("DialogFragment class was not set");
            return null;
        }
        char cCharAt = str.charAt(0);
        Context context = this.c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        g gVarO = this.d.O();
        context.getClassLoader();
        Fragment fragmentA = gVarO.a(str);
        fragmentA.getClass();
        if (d.class.isAssignableFrom(fragmentA.getClass())) {
            d dVar = (d) fragmentA;
            dVar.setArguments(ifxVar.v.a());
            dVar.getLifecycle().a(this.f);
            this.g.put(ifxVar.f, dVar);
            return dVar;
        }
        StringBuilder sb = new StringBuilder("Dialog destination ");
        String str2 = aVar.i;
        if (str2 != null) {
            kb5.a(uf80.a(sb, str2, " is not an instance of DialogFragment"));
            return null;
        }
        ib5.a("DialogFragment class was not set");
        return null;
    }

    public final void l(int i, ifx ifxVar, boolean z) {
        ifx ifxVar2 = (ifx) CollectionsKt.V(i - 1, (List) b().e.a.getValue());
        boolean zM = CollectionsKt.M((Iterable) b().f.a.getValue(), ifxVar2);
        b().e(ifxVar, z);
        if (ifxVar2 == null || zM) {
            return;
        }
        b().b(ifxVar2);
    }
}
