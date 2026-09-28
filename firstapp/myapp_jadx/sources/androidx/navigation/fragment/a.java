package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.r;
import androidx.fragment.app.FragmentManager.s;
import androidx.fragment.app.g;
import androidx.navigation.fragment.a;
import defpackage.bin;
import defpackage.cbs;
import defpackage.cin;
import defpackage.ck30;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.haj;
import defpackage.hb5;
import defpackage.ib5;
import defpackage.ifx;
import defpackage.j8i0;
import defpackage.jq40;
import defpackage.lfy;
import defpackage.p48;
import defpackage.paj;
import defpackage.qwi;
import defpackage.rwi;
import defpackage.s8i0;
import defpackage.u48;
import defpackage.uwi;
import defpackage.v8i0;
import defpackage.vj5;
import defpackage.vkx;
import defpackage.wwi;
import defpackage.xwi;
import defpackage.yfx;
import defpackage.ygx;
import defpackage.ywi;
import defpackage.zix;
import defpackage.zwi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/a;", "Lvkx;", "Landroidx/navigation/fragment/a$b;", "b", "a", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@vkx.a("fragment")
public class a extends vkx<b> {
    public final Context c;
    public final FragmentManager d;
    public final int e;
    public final LinkedHashSet f;
    public final ArrayList g;
    public final qwi h;
    public final rwi i;

    /* JADX INFO: renamed from: androidx.navigation.fragment.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/fragment/a$a;", "Lj8i0;", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0067a extends j8i0 {
        public WeakReference<Function0<Unit>> a;

        @Override // defpackage.j8i0
        public final void onCleared() {
            super.onCleared();
            WeakReference<Function0<Unit>> weakReference = this.a;
            if (weakReference == null) {
                Intrinsics.n("completeTransition");
                throw null;
            }
            Function0<Unit> function0 = weakReference.get();
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static class b extends ygx {
        public String i;

        public b() {
            throw null;
        }

        @Override // defpackage.ygx
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof b) && super.equals(obj) && Intrinsics.g(this.i, ((b) obj).i);
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
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, ck30.b);
            typedArrayObtainAttributes.getClass();
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                this.i = string;
            }
            Unit unit = Unit.a;
            typedArrayObtainAttributes.recycle();
        }

        @Override // defpackage.ygx
        public final String toString() {
            StringBuilder sb = new StringBuilder(super.toString());
            sb.append(" class=");
            String str = this.i;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            return sb.toString();
        }
    }

    public static final class c implements lfy, paj {
        public final /* synthetic */ uwi a;

        public c(uwi uwiVar) {
            this.a = uwiVar;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [qwi] */
    public a(Context context, FragmentManager fragmentManager, int i) {
        context.getClass();
        fragmentManager.getClass();
        this.c = context;
        this.d = fragmentManager;
        this.e = i;
        this.f = new LinkedHashSet();
        this.g = new ArrayList();
        this.h = new cbs() { // from class: qwi
            @Override // defpackage.cbs
            public final void F0(ibs ibsVar, s9s.a aVar) {
                if (aVar == s9s.a.ON_DESTROY) {
                    Fragment fragment = (Fragment) ibsVar;
                    a aVar2 = this.a;
                    Object obj = null;
                    for (Object obj2 : (Iterable) aVar2.b().f.a.getValue()) {
                        if (((ifx) obj2).f.equals(fragment.getTag())) {
                            obj = obj2;
                        }
                    }
                    ifx ifxVar = (ifx) obj;
                    if (ifxVar != null) {
                        if (a.n()) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + ifxVar + " due to fragment " + ibsVar + " lifecycle reaching DESTROYED");
                        }
                        aVar2.b().b(ifxVar);
                    }
                }
            }
        };
        this.i = new rwi(this);
    }

    public static void k(a aVar, final String str, int i) {
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) != 0;
        ArrayList arrayList = aVar.g;
        if (z2) {
            p48.A(arrayList, new Function1() { // from class: vwi
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Pair pair = (Pair) obj;
                    pair.getClass();
                    return Boolean.valueOf(Intrinsics.g(pair.a, str));
                }
            });
        }
        arrayList.add(new Pair(str, Boolean.valueOf(z)));
    }

    public static boolean n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // defpackage.vkx
    public final ygx a() {
        return new b(this);
    }

    @Override // defpackage.vkx
    public final void d(List list, zix zixVar) {
        list.getClass();
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.V()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ifx ifxVar = (ifx) it.next();
            boolean zIsEmpty = ((List) b().e.a.getValue()).isEmpty();
            if (zixVar == null || zIsEmpty || !zixVar.b || !this.f.remove(ifxVar.f)) {
                androidx.fragment.app.a aVarM = m(ifxVar, zixVar);
                String str = ifxVar.f;
                if (!zIsEmpty) {
                    ifx ifxVar2 = (ifx) CollectionsKt.d0((List) b().e.a.getValue());
                    if (ifxVar2 != null) {
                        k(this, ifxVar2.f, 6);
                    }
                    k(this, str, 6);
                    aVarM.c(str);
                }
                aVarM.d();
                if (n()) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + ifxVar);
                }
                b().h(ifxVar);
            } else {
                fragmentManager.A(fragmentManager.new r(ifxVar.f), false);
                b().h(ifxVar);
            }
        }
    }

    @Override // defpackage.vkx
    public final void e(final yfx.a aVar) {
        super.e(aVar);
        if (n()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        zwi zwiVar = new zwi() { // from class: twi
            @Override // defpackage.zwi
            public final void a(FragmentManager fragmentManager, Fragment fragment) {
                Object objPrevious;
                fragmentManager.getClass();
                yfx.a aVar2 = aVar;
                List list = (List) aVar2.e.a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!((ifx) objPrevious).f.equals(fragment.getTag()));
                ifx ifxVar = (ifx) objPrevious;
                boolean zN = a.n();
                a aVar3 = this;
                if (zN) {
                    Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + ifxVar + " to FragmentManager " + aVar3.d);
                }
                if (ifxVar != null) {
                    fragment.getViewLifecycleOwnerLiveData().f(fragment, new a.c(new uwi(aVar3, fragment, ifxVar)));
                    fragment.getLifecycle().a(aVar3.h);
                    aVar3.l(fragment, ifxVar, aVar2);
                }
            }
        };
        FragmentManager fragmentManager = this.d;
        fragmentManager.q.add(zwiVar);
        fragmentManager.o.add(new ywi(aVar, this));
    }

    @Override // defpackage.vkx
    public final void f(ifx ifxVar) {
        String str = ifxVar.f;
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.V()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        androidx.fragment.app.a aVarM = m(ifxVar, null);
        List list = (List) b().e.a.getValue();
        if (list.size() > 1) {
            ifx ifxVar2 = (ifx) CollectionsKt.V(list.size() - 2, list);
            if (ifxVar2 != null) {
                k(this, ifxVar2.f, 6);
            }
            k(this, str, 4);
            fragmentManager.Z(1, str);
            k(this, str, 2);
            aVarM.c(str);
        }
        aVarM.d();
        b().c(ifxVar);
    }

    @Override // defpackage.vkx
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f;
            linkedHashSet.clear();
            p48.w(stringArrayList, linkedHashSet);
        }
    }

    @Override // defpackage.vkx
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return vj5.a(new Pair("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // defpackage.vkx
    public final void i(ifx ifxVar, boolean z) {
        FragmentManager fragmentManager = this.d;
        if (fragmentManager.V()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().e.a.getValue();
        int iIndexOf = list.indexOf(ifxVar);
        List listSubList = list.subList(iIndexOf, list.size());
        ifx ifxVar2 = (ifx) CollectionsKt.T(list);
        ifx ifxVar3 = (ifx) CollectionsKt.V(iIndexOf - 1, list);
        if (ifxVar3 != null) {
            k(this, ifxVar3.f, 6);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listSubList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    k(this, ((ifx) obj).f, 4);
                }
                if (z) {
                    for (ifx ifxVar4 : CollectionsKt.m0(listSubList)) {
                        if (Intrinsics.g(ifxVar4, ifxVar2)) {
                            Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + ifxVar4);
                        } else {
                            fragmentManager.A(fragmentManager.new s(ifxVar4.f), false);
                            this.f.add(ifxVar4.f);
                        }
                    }
                } else {
                    fragmentManager.Z(1, ifxVar.f);
                }
                if (n()) {
                    Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + ifxVar + " with savedState " + z);
                }
                b().e(ifxVar, z);
                return;
            }
            Object next = it.next();
            ifx ifxVar5 = (ifx) next;
            u48 u48VarK = CollectionsKt.K(this.g);
            String str = ifxVar5.f;
            Iterator<Object> it2 = u48VarK.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                Pair pair = (Pair) it2.next();
                pair.getClass();
                String str2 = (String) pair.a;
                if (i < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                if (str.equals(str2)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0 || !ifxVar5.f.equals(ifxVar2.f)) {
                arrayList.add(next);
            }
        }
    }

    public final void l(Fragment fragment, ifx ifxVar, yfx.a aVar) {
        fragment.getClass();
        v8i0 viewModelStore = fragment.getViewModelStore();
        viewModelStore.getClass();
        cin cinVar = new cin();
        cinVar.a(jq40.a(C0067a.class), new wwi());
        bin binVarB = cinVar.b();
        cyb.a aVar2 = cyb.a.b;
        aVar2.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, binVarB, aVar2);
        dq7 dq7VarA = jq40.a(C0067a.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
        } else {
            ((C0067a) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI))).a = new WeakReference<>(new xwi(ifxVar, aVar, this, fragment));
        }
    }

    public final androidx.fragment.app.a m(ifx ifxVar, zix zixVar) {
        ygx ygxVar = ifxVar.b;
        ygxVar.getClass();
        Bundle bundleA = ifxVar.v.a();
        String str = ((b) ygxVar).i;
        if (str == null) {
            ib5.a("Fragment class was not set");
            return null;
        }
        char cCharAt = str.charAt(0);
        Context context = this.c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        FragmentManager fragmentManager = this.d;
        g gVarO = fragmentManager.O();
        context.getClassLoader();
        Fragment fragmentA = gVarO.a(str);
        fragmentA.getClass();
        fragmentA.setArguments(bundleA);
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        int i = zixVar != null ? zixVar.f : -1;
        int i2 = zixVar != null ? zixVar.g : -1;
        int i3 = zixVar != null ? zixVar.h : -1;
        int i4 = zixVar != null ? zixVar.i : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            aVar.h(i, i2, i3, i4 != -1 ? i4 : 0);
        }
        aVar.f(this.e, fragmentA, ifxVar.f);
        aVar.r(fragmentA);
        aVar.r = true;
        return aVar;
    }
}
