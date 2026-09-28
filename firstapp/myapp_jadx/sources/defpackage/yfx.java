package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class yfx {
    public final Context a;
    public final igx b;
    public final ufx c;
    public final Activity d;
    public boolean e;
    public final c f;
    public final boolean g;
    public final mpe0 h;

    public class a extends xkx {
        public final vkx<? extends ygx> g;
        public final /* synthetic */ yfx h;

        public a(yfx yfxVar, vkx<? extends ygx> vkxVar) {
            vkxVar.getClass();
            this.h = yfxVar;
            this.g = vkxVar;
        }

        @Override // defpackage.xkx
        public final ifx a(ygx ygxVar, Bundle bundle) {
            igx igxVar = this.h.b;
            igxVar.getClass();
            return ifx.a.a(igxVar.a.c, ygxVar, bundle, igxVar.k(), igxVar.p);
        }

        @Override // defpackage.xkx
        public final void b(ifx ifxVar) {
            jgx jgxVar;
            v8i0 v8i0Var;
            ifxVar.getClass();
            igx igxVar = this.h.b;
            wwd0 wwd0Var = igxVar.i;
            lfx lfxVar = ifxVar.v;
            LinkedHashMap linkedHashMap = igxVar.x;
            boolean zG = Intrinsics.g(linkedHashMap.get(ifxVar), Boolean.TRUE);
            super.b(ifxVar);
            Unit unit = Unit.a;
            linkedHashMap.remove(ifxVar);
            gx0<ifx> gx0Var = igxVar.f;
            if (gx0Var.contains(ifxVar)) {
                if (this.d) {
                    return;
                }
                igxVar.y();
                wwd0 wwd0Var2 = igxVar.g;
                ArrayList arrayList = new ArrayList(gx0Var);
                wwd0Var2.getClass();
                wwd0Var2.k(null, arrayList);
                ArrayList arrayListU = igxVar.u();
                wwd0Var.getClass();
                wwd0Var.k(null, arrayListU);
                return;
            }
            igxVar.x(ifxVar);
            String str = ifxVar.f;
            if (lfxVar.j.d.compareTo(s9s.b.c) >= 0) {
                lfxVar.k = s9s.b.a;
                lfxVar.b();
            }
            if (!gx0Var.isEmpty()) {
                Iterator<ifx> it = gx0Var.iterator();
                while (it.hasNext()) {
                    if (it.next().f.equals(str)) {
                    }
                }
                if (!zG) {
                    v8i0Var.a();
                }
            } else if (!zG && (jgxVar = igxVar.p) != null && (v8i0Var = (v8i0) jgxVar.a.remove(str)) != null) {
                v8i0Var.a();
            }
            igxVar.y();
            ArrayList arrayListU2 = igxVar.u();
            wwd0Var.getClass();
            wwd0Var.k(null, arrayListU2);
        }

        @Override // defpackage.xkx
        public final void d(ifx ifxVar, boolean z) {
            igx igxVar = this.h.b;
            igxVar.getClass();
            vkx vkxVarB = igxVar.t.b(ifxVar.b.a);
            igxVar.x.put(ifxVar, Boolean.valueOf(z));
            if (!vkxVarB.equals(this.g)) {
                Object obj = igxVar.u.get(vkxVarB);
                obj.getClass();
                ((a) obj).d(ifxVar, z);
                return;
            }
            dgx dgxVar = igxVar.w;
            if (dgxVar != null) {
                dgxVar.invoke(ifxVar);
                super.d(ifxVar, z);
                Unit unit = Unit.a;
                return;
            }
            gx0<ifx> gx0Var = igxVar.f;
            int iIndexOf = gx0Var.indexOf(ifxVar);
            if (iIndexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + ifxVar + " as it was not found on the current back stack");
                return;
            }
            int i = iIndexOf + 1;
            if (i != gx0Var.c) {
                igxVar.q(gx0Var.get(i).b.b.e, true, false);
            }
            igx.t(igxVar, ifxVar);
            super.d(ifxVar, z);
            Unit unit2 = Unit.a;
            igxVar.b.invoke();
            igxVar.b();
        }

        @Override // defpackage.xkx
        public final void f(ifx ifxVar) {
            ifxVar.getClass();
            super.f(ifxVar);
            igx igxVar = this.h.b;
            igxVar.getClass();
            if (!igxVar.f.contains(ifxVar)) {
                ib5.a("Cannot transition entry that is not in the back stack");
                return;
            }
            s9s.b bVar = s9s.b.d;
            lfx lfxVar = ifxVar.v;
            lfxVar.k = bVar;
            lfxVar.b();
        }

        @Override // defpackage.xkx
        public final void g(ifx ifxVar) {
            ifxVar.getClass();
            igx igxVar = this.h.b;
            igxVar.getClass();
            vkx vkxVarB = igxVar.t.b(ifxVar.b.a);
            if (!vkxVarB.equals(this.g)) {
                Object obj = igxVar.u.get(vkxVarB);
                if (obj != null) {
                    ((a) obj).g(ifxVar);
                    return;
                } else {
                    q1b.a(uf80.a(new StringBuilder("NavigatorBackStack for "), ifxVar.b.a, " should already be created"));
                    return;
                }
            }
            Function1<? super ifx, Unit> function1 = igxVar.v;
            if (function1 != null) {
                function1.invoke(ifxVar);
                super.g(ifxVar);
            } else {
                Log.i("NavController", "Ignoring add of destination " + ifxVar.b + " outside of the call to navigate(). ");
            }
        }

        public final void i(ifx ifxVar) {
            ifxVar.getClass();
            super.g(ifxVar);
        }
    }

    public interface b {
        void a(yfx yfxVar, ygx ygxVar, Bundle bundle);
    }

    public static final class c extends cny {
        public c() {
            super(false);
        }

        @Override // defpackage.cny
        public final void b() {
            yfx.this.k();
        }
    }

    public yfx(Context context) {
        context.getClass();
        this.a = context;
        this.b = new igx(this, new vfx(this));
        this.c = new ufx(context);
        for (Object obj : fd80.c(context, new wfx())) {
            if (((Context) obj) instanceof Activity) {
                this.d = (Activity) obj;
                this.f = new c();
                this.g = true;
                wkx wkxVar = this.b.t;
                wkxVar.a(new nhx(wkxVar));
                this.b.t.a(new id(this.a));
                this.h = hwr.b(new sbe(this, 1));
            }
        }
        obj = null;
        this.d = (Activity) obj;
        this.f = new c();
        this.g = true;
        wkx wkxVar2 = this.b.t;
        wkxVar2.a(new nhx(wkxVar2));
        this.b.t.a(new id(this.a));
        this.h = hwr.b(new sbe(this, 1));
    }

    public static void h(yfx yfxVar, Object obj, zix zixVar, int i) {
        if ((i & 2) != 0) {
            zixVar = null;
        }
        yfxVar.getClass();
        obj.getClass();
        igx igxVar = yfxVar.b;
        igxVar.getClass();
        igxVar.o(igxVar.f(obj), zixVar);
    }

    public static void i(yfx yfxVar, String str, zix zixVar, int i) {
        if ((i & 2) != 0) {
            zixVar = null;
        }
        yfxVar.getClass();
        str.getClass();
        yfxVar.b.o(str, zixVar);
    }

    public static void l(yfx yfxVar, Object obj) {
        yfxVar.getClass();
        obj.getClass();
        igx igxVar = yfxVar.b;
        igxVar.getClass();
        if (igxVar.r(igxVar.f(obj), false, false)) {
            igxVar.b();
        }
    }

    public static void m(yfx yfxVar, String str, boolean z) {
        yfxVar.getClass();
        str.getClass();
        igx igxVar = yfxVar.b;
        igxVar.getClass();
        if (igxVar.r(str, z, false)) {
            igxVar.b();
        }
    }

    public final void a(b bVar) {
        igx igxVar = this.b;
        igxVar.getClass();
        igxVar.q.add(bVar);
        gx0<ifx> gx0Var = igxVar.f;
        if (gx0Var.isEmpty()) {
            return;
        }
        ifx ifxVarLast = gx0Var.last();
        bVar.a(igxVar.a, ifxVarLast.b, ifxVarLast.v.a());
    }

    public final ifx b(dq7 dq7Var) {
        Object objPrevious;
        igx igxVar = this.b;
        igxVar.getClass();
        int iB = w060.b(ue80.b(dq7Var));
        if (igx.e(iB, igxVar.j(), null, true) == null) {
            axz.a(dq7Var.k(), "Destination with route ", " cannot be found in navigation graph ", igxVar.j());
            return null;
        }
        List list = (List) igxVar.h.a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((ifx) objPrevious).b.b.e != iB);
        ifx ifxVar = (ifx) objPrevious;
        if (ifxVar != null) {
            return ifxVar;
        }
        axz.a(dq7Var.k(), "No destination with route ", " is on the NavController's back stack. The current destination is ", igxVar.i());
        return null;
    }

    public final void c() {
        ifx ifxVarPrevious;
        ifx ifxVar;
        igx igxVar = this.b;
        igxVar.getClass();
        gx0<ifx> gx0Var = igxVar.f;
        ListIterator<ifx> listIterator = gx0Var.listIterator(gx0Var.getB());
        do {
            if (!listIterator.hasPrevious()) {
                ifxVarPrevious = null;
                break;
            } else {
                ifxVarPrevious = listIterator.previous();
                ifxVar = ifxVarPrevious;
            }
        } while (!ifxVar.b.i("bio_auth_entry_route", ifxVar.v.a()));
        if (ifxVarPrevious != null) {
            return;
        }
        r2z.a(igxVar.i(), "No destination with route bio_auth_entry_route is on the NavController's back stack. The current destination is ");
    }

    public final int d() {
        gx0<ifx> gx0Var = this.b.f;
        int i = 0;
        if (gx0Var != null && gx0Var.isEmpty()) {
            return 0;
        }
        Iterator<ifx> it = gx0Var.iterator();
        while (it.hasNext()) {
            if (!(it.next().b instanceof fhx) && (i = i + 1) < 0) {
                kotlin.collections.b.p();
                throw null;
            }
        }
        return i;
    }

    public final ifx e() {
        Object next;
        Iterator it = CollectionsKt.m0(this.b.f).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = fd80.b(it).iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!(((ifx) next).b instanceof fhx)) {
                return (ifx) next;
            }
        }
        next = null;
        return (ifx) next;
    }

    public final void f(int i, Bundle bundle) {
        int i2;
        zix zixVar;
        Bundle bundleA;
        igx igxVar = this.b;
        ygx ygxVar = igxVar.f.isEmpty() ? igxVar.c : igxVar.f.last().b;
        if (ygxVar == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        afx afxVarE = ygxVar.e(i);
        if (afxVarE != null) {
            zixVar = afxVarE.b;
            i2 = afxVarE.a;
            Bundle bundle2 = afxVarE.c;
            if (bundle2 != null) {
                o2g.a.getClass();
                bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                bundleA.putAll(bundle2);
            } else {
                bundleA = null;
            }
        } else {
            i2 = i;
            zixVar = null;
            bundleA = null;
        }
        if (bundle != null) {
            if (bundleA == null) {
                o2g.a.getClass();
                bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundleA.putAll(bundle);
        }
        if (i2 == 0 && zixVar != null) {
            boolean z = zixVar.d;
            ygp<?> ygpVar = zixVar.k;
            String str = zixVar.j;
            int i3 = zixVar.c;
            if (i3 != -1 || str != null || ygpVar != null) {
                if (str != null) {
                    m(this, str, z);
                    return;
                } else if (ygpVar != null) {
                    igxVar.p(w060.b(ue80.b(ygpVar)), z);
                    return;
                } else {
                    if (i3 != -1) {
                        igxVar.p(i3, z);
                        return;
                    }
                    return;
                }
            }
        }
        if (i2 == 0) {
            hb5.a("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            return;
        }
        ygx ygxVarD = igxVar.d(i2, null);
        if (ygxVarD != null) {
            igxVar.n(ygxVarD, bundleA, zixVar);
            return;
        }
        int i4 = ygx.f;
        ufx ufxVar = this.c;
        String strA = ygx.a.a(ufxVar, i2);
        if (afxVarE == null) {
            nrh0.a(strA, "Navigation action/destination ", " cannot be found from the current destination ", ygxVar);
            return;
        }
        StringBuilder sbA = he.a("Navigation destination ", strA, " referenced from action ");
        sbA.append(ygx.a.a(ufxVar, i));
        sbA.append(" cannot be found from the current destination ");
        sbA.append(ygxVar);
        throw new IllegalArgumentException(sbA.toString().toString());
    }

    public final void g(String str, Function1<? super ajx, Unit> function1) {
        str.getClass();
        igx igxVar = this.b;
        igxVar.getClass();
        igxVar.o(str, bjx.a(function1));
    }

    public final void j() {
        Bundle bundleC;
        Intent intent;
        if (d() != 1) {
            k();
            return;
        }
        Activity activity = this.d;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        igx igxVar = this.b;
        int i = 0;
        if (intArray == null) {
            ygx ygxVarI = igxVar.i();
            ygxVarI.getClass();
            int i2 = ygxVarI.b.e;
            for (fhx fhxVar = ygxVarI.c; fhxVar != null; fhxVar = fhxVar.c) {
                dhx dhxVar = fhxVar.b;
                if (fhxVar.i.c != i2) {
                    o2g.a.getClass();
                    Bundle bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        Intent intent2 = activity.getIntent();
                        intent2.getClass();
                        bundleA.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
                        fhx fhxVarL = igxVar.l();
                        Intent intent3 = activity.getIntent();
                        intent3.getClass();
                        ygx.b bVarO = fhxVarL.o(new ugx(intent3.getData(), intent3.getAction(), intent3.getType()), fhxVarL);
                        if ((bVarO != null ? bVarO.b : null) != null && (bundleC = bVarO.a.c(bVarO.b)) != null) {
                            bundleA.putAll(bundleC);
                        }
                    }
                    sgx sgxVar = new sgx(this);
                    int i3 = dhxVar.e;
                    ArrayList arrayList = sgxVar.e;
                    arrayList.clear();
                    arrayList.add(new sgx.a(i3, null));
                    sgxVar.c();
                    sgxVar.c.putExtra("android-support-nav:controller:deepLinkExtras", bundleA);
                    sgxVar.a().b();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                i2 = dhxVar.e;
            }
            return;
        }
        if (this.e) {
            activity.getClass();
            Intent intent4 = activity.getIntent();
            Bundle extras2 = intent4.getExtras();
            extras2.getClass();
            int[] intArray2 = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
            intArray2.getClass();
            ArrayList arrayList2 = new ArrayList(intArray2.length);
            int length = intArray2.length;
            for (int iA = 0; iA < length; iA = ndv.a(intArray2[iA], iA, 1, arrayList2)) {
            }
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            if (arrayList2.size() < 2) {
                return;
            }
            int iIntValue = ((Number) p48.C(arrayList2)).intValue();
            if (parcelableArrayList != null) {
            }
            ygx ygxVarE = igx.e(iIntValue, igxVar.j(), null, false);
            if (ygxVarE instanceof fhx) {
                int i4 = fhx.v;
                iIntValue = fhx.a.a((fhx) ygxVarE).b.e;
            }
            ygx ygxVarI2 = igxVar.i();
            if (ygxVarI2 == null || iIntValue != ygxVarI2.b.e) {
                return;
            }
            sgx sgxVar2 = new sgx(this);
            o2g.a.getClass();
            Bundle bundleA2 = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            bundleA2.putParcelable("android-support-nav:controller:deepLinkIntent", intent4);
            Bundle bundle = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
            if (bundle != null) {
                bundleA2.putAll(bundle);
            }
            sgxVar2.c.putExtra("android-support-nav:controller:deepLinkExtras", bundleA2);
            int size = arrayList2.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList2.get(i5);
                i5++;
                int i6 = i + 1;
                if (i < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                sgxVar2.e.add(new sgx.a(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i) : null));
                sgxVar2.c();
                i = i6;
            }
            sgxVar2.a().b();
            activity.finish();
        }
    }

    public final boolean k() {
        igx igxVar = this.b;
        if (igxVar.f.isEmpty()) {
            return false;
        }
        ygx ygxVarI = igxVar.i();
        ygxVarI.getClass();
        return igxVar.p(ygxVarI.b.e, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(Bundle bundle) throws Throwable {
        Bundle bundle2;
        Bundle[] bundleArr;
        Throwable th;
        if (bundle != null) {
            bundle.setClassLoader(this.a.getClassLoader());
        }
        igx igxVar = this.b;
        LinkedHashMap linkedHashMap = igxVar.n;
        Throwable th2 = null;
        if (bundle == null) {
            th = null;
        } else {
            if (bundle.containsKey("android-support-nav:controller:navigatorState")) {
                bundle2 = bundle.getBundle("android-support-nav:controller:navigatorState");
                if (bundle2 == null) {
                    s5b.a("android-support-nav:controller:navigatorState");
                    throw null;
                }
            } else {
                bundle2 = null;
            }
            igxVar.d = bundle2;
            if (bundle.containsKey("android-support-nav:controller:backStack")) {
                ArrayList arrayListB = Build.VERSION.SDK_INT >= 34 ? rj5.a.b(bundle, "android-support-nav:controller:backStack", tgp.b(jq40.a(Bundle.class))) : bundle.getParcelableArrayList("android-support-nav:controller:backStack");
                if (arrayListB == null) {
                    s5b.a("android-support-nav:controller:backStack");
                    throw null;
                }
                bundleArr = (Bundle[]) arrayListB.toArray(new Bundle[0]);
            } else {
                bundleArr = null;
            }
            igxVar.e = bundleArr;
            linkedHashMap.clear();
            if (bundle.containsKey("android-support-nav:controller:backStackDestIds") && bundle.containsKey("android-support-nav:controller:backStackIds")) {
                int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                if (intArray == null) {
                    s5b.a("android-support-nav:controller:backStackDestIds");
                    throw null;
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                if (stringArrayList == null) {
                    s5b.a("android-support-nav:controller:backStackIds");
                    throw null;
                }
                int length = intArray.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    Throwable th3 = th2;
                    igxVar.m.put(Integer.valueOf(intArray[i]), !Intrinsics.g(stringArrayList.get(i2), "") ? (String) stringArrayList.get(i2) : th3);
                    i++;
                    i2 = i3;
                    th2 = th3;
                }
            }
            th = th2;
            if (bundle.containsKey("android-support-nav:controller:backStackStates")) {
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                if (stringArrayList2 == null) {
                    s5b.a("android-support-nav:controller:backStackStates");
                    throw th;
                }
                int size = stringArrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    String str = stringArrayList2.get(i4);
                    i4++;
                    String str2 = str;
                    if (bundle.containsKey("android-support-nav:controller:backStackStates:" + str2)) {
                        String strA = inm.a("android-support-nav:controller:backStackStates:", str2);
                        ArrayList arrayListB2 = Build.VERSION.SDK_INT >= 34 ? rj5.a.b(bundle, strA, tgp.b(jq40.a(Bundle.class))) : bundle.getParcelableArrayList(strA);
                        if (arrayListB2 == null) {
                            s5b.a(strA);
                            throw th;
                        }
                        gx0 gx0Var = new gx0(arrayListB2.size());
                        int size2 = arrayListB2.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj = arrayListB2.get(i5);
                            i5++;
                            gx0Var.addLast(new rfx((Bundle) obj));
                        }
                        linkedHashMap.put(str2, gx0Var);
                    }
                }
            }
        }
        if (bundle != null) {
            boolean z = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
            Boolean boolValueOf = (z || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z) : th;
            this.e = boolValueOf != 0 ? boolValueOf.booleanValue() : false;
        }
    }

    public final Bundle o() {
        Bundle bundleA;
        LinkedHashMap linkedHashMap;
        igx igxVar = this.b;
        LinkedHashMap linkedHashMap2 = igxVar.n;
        gx0<ifx> gx0Var = igxVar.f;
        LinkedHashMap linkedHashMap3 = igxVar.m;
        ArrayList arrayList = new ArrayList();
        o2g.a.getClass();
        Bundle bundleA2 = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        for (Map.Entry entry : kpu.l(igxVar.t.a).entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleH = ((vkx) entry.getValue()).h();
            if (bundleH != null) {
                arrayList.add(str);
                str.getClass();
                bundleA2.putBundle(str, bundleH);
            }
        }
        if (arrayList.isEmpty()) {
            bundleA = null;
        } else {
            o2g.a.getClass();
            bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            qv60.a(bundleA2, "android-support-nav:controller:navigatorState:names", arrayList);
            bundleA.putBundle("android-support-nav:controller:navigatorState", bundleA2);
        }
        if (gx0Var.isEmpty()) {
            linkedHashMap = linkedHashMap2;
        } else {
            if (bundleA == null) {
                o2g.a.getClass();
                bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            for (ifx ifxVar : gx0Var) {
                ifxVar.getClass();
                int i = ifxVar.b.b.e;
                String str2 = ifxVar.f;
                lfx lfxVar = ifxVar.v;
                Bundle bundleA3 = lfxVar.a();
                o2g o2gVar = o2g.a;
                o2gVar.getClass();
                LinkedHashMap linkedHashMap4 = linkedHashMap2;
                Bundle bundleA4 = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                lfxVar.h.b(bundleA4);
                o2gVar.getClass();
                Bundle bundleA5 = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                bundleA5.putString("nav-entry-state:id", str2);
                bundleA5.putInt("nav-entry-state:destination-id", i);
                if (bundleA3 == null) {
                    bundleA3 = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                }
                bundleA5.putBundle("nav-entry-state:args", bundleA3);
                bundleA5.putBundle("nav-entry-state:saved-state", bundleA4);
                arrayList2.add(bundleA5);
                linkedHashMap2 = linkedHashMap4;
            }
            linkedHashMap = linkedHashMap2;
            bundleA.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
        }
        if (!linkedHashMap3.isEmpty()) {
            if (bundleA == null) {
                o2g.a.getClass();
                bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            int[] iArr = new int[linkedHashMap3.size()];
            ArrayList arrayList3 = new ArrayList();
            int i2 = 0;
            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str3 = (String) entry2.getValue();
                int i3 = i2 + 1;
                iArr[i2] = iIntValue;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList3.add(str3);
                i2 = i3;
            }
            bundleA.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            qv60.a(bundleA, "android-support-nav:controller:backStackIds", arrayList3);
        }
        if (!linkedHashMap.isEmpty()) {
            if (bundleA == null) {
                o2g.a.getClass();
                bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                String str4 = (String) entry3.getKey();
                gx0 gx0Var2 = (gx0) entry3.getValue();
                arrayList4.add(str4);
                ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                Iterator<E> it = gx0Var2.iterator();
                while (it.hasNext()) {
                    sfx sfxVar = ((rfx) it.next()).a;
                    o2g.a.getClass();
                    Bundle bundleA6 = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    bundleA6.putString("nav-entry-state:id", sfxVar.a);
                    bundleA6.putInt("nav-entry-state:destination-id", sfxVar.b);
                    Bundle bundleA7 = sfxVar.c;
                    if (bundleA7 == null) {
                        bundleA7 = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    bundleA6.putBundle("nav-entry-state:args", bundleA7);
                    bundleA6.putBundle("nav-entry-state:saved-state", sfxVar.d);
                    arrayList5.add(bundleA6);
                }
                bundleA.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str4, arrayList5);
            }
            qv60.a(bundleA, "android-support-nav:controller:backStackStates", arrayList4);
        }
        if (this.e) {
            if (bundleA == null) {
                o2g.a.getClass();
                bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundleA.putBoolean("android-support-nav:controller:deepLinkHandled", this.e);
        }
        return bundleA;
    }

    public final void p(fhx fhxVar) {
        fhxVar.getClass();
        igx igxVar = this.b;
        igxVar.getClass();
        fhxVar.getClass();
        igxVar.w(fhxVar, null);
    }
}
