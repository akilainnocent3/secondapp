package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lzg90;", "Lj8i0;", "d", "a", "c", "b", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zg90 extends j8i0 {
    public final v340 A;
    public final uf00<x690> a;
    public final l790 b;
    public final k5b c;
    public final uqm d;
    public final iym e;
    public final wwd0 f;
    public final wwd0 i;
    public final wwd0 v;
    public final wwd0 w;
    public final ku90<rd90> y;
    public final t340 z;

    public static final class a {
        public final uf00<x690> a;
        public final uf00<c> b;

        public a(uf00<x690> uf00Var, uf00<c> uf00Var2) {
            uf00Var.getClass();
            uf00Var2.getClass();
            this.a = uf00Var;
            this.b = uf00Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "InitData(recentShortcuts=" + this.a + ", shortcuts=" + this.b + ")";
        }
    }

    public interface b<T> {

        public static final class a<T> implements b<T> {
            public final T a;

            public a(T t) {
                this.a = t;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                T t = this.a;
                if (t == null) {
                    return 0;
                }
                return t.hashCode();
            }

            public final String toString() {
                return aya.b(this.a, "HasData(data=", ")");
            }
        }

        /* JADX INFO: renamed from: zg90$b$b, reason: collision with other inner class name */
        public static final class C1392b implements b {
            public static final C1392b a = new C1392b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1392b);
            }

            public final int hashCode() {
                return -87882711;
            }

            public final String toString() {
                return "NoData";
            }
        }
    }

    public static final class c {
        public final v690 a;
        public final uf00<x690> b;

        public c(uf00 uf00Var, v690 v690Var) {
            v690Var.getClass();
            uf00Var.getClass();
            this.a = v690Var;
            this.b = uf00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Intrinsics.g(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SidePanelShortcut(group=" + this.a + ", shortcuts=" + this.b + ")";
        }
    }

    public interface d {
        zg90 a(uf00<x690> uf00Var);
    }

    @c0d(c = "com.sporty.android.platform.features.homeshortcut.sidepanel.SidePanelViewModel$uiState$1", f = "SidePanelViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements jaj<lk50<? extends a>, b<? extends v690>, List<? extends x690>, ae90, v1b<? super rg90>, Object> {
        public /* synthetic */ lk50 a;
        public /* synthetic */ b b;
        public /* synthetic */ List c;
        public /* synthetic */ ae90 d;

        public e(v1b<? super e> v1bVar) {
            super(5, v1bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            lk50 lk50Var = this.a;
            b bVar = this.b;
            List list = this.c;
            ae90 ae90Var = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (bVar instanceof b.a) {
                obj2 = ((b.a) bVar).a;
            } else {
                if (!Intrinsics.g(bVar, b.C1392b.a)) {
                    uhc.a();
                    return null;
                }
                obj2 = null;
            }
            v690 v690Var = (v690) obj2;
            if (v690Var == null) {
                return rg90.b.a;
            }
            if ((lk50Var instanceof lk50.a) || Intrinsics.g(lk50Var, lk50.b.a)) {
                return rg90.b.a;
            }
            if (!(lk50Var instanceof lk50.c)) {
                uhc.a();
                return null;
            }
            a aVar = (a) ((lk50.c) lk50Var).a;
            uf00<x690> uf00Var = aVar.a;
            uf00 uf00VarF = a4h.f(list);
            ArrayList arrayList = new ArrayList();
            if (zg90.this.d.isLogin()) {
                arrayList.add(new ne90.e(uf00VarF));
            }
            if (!uf00Var.isEmpty() && !ae90Var.a) {
                StringUiText stringUiText = vch0.a;
                arrayList.add(new ne90.c(new ResourceUiText(R.string.component_sporty_banner__group_recents)));
                arrayList.add(new ne90.b(uf00Var));
                arrayList.add(ne90.f.a);
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            arrayList.add(new ne90.h(a4h.f(arrayList2)));
            int i = 0;
            for (c cVar : aVar.b) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                c cVar2 = cVar;
                v690 v690Var2 = cVar2.a;
                arrayList2.add(new yg90(v690Var2, arrayList.size()));
                int i3 = v690Var2.b;
                StringUiText stringUiText2 = vch0.a;
                arrayList.add(new ne90.j(new ResourceUiText(i3), v690Var2));
                ArrayList arrayListL = CollectionsKt.L(cVar2.b, 5);
                ArrayList arrayList3 = new ArrayList(l48.r(arrayListL, 10));
                int size2 = arrayListL.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj3 = arrayListL.get(i4);
                    i4++;
                    arrayList3.add(new ne90.l(a4h.f((List) obj3), v690Var2));
                }
                arrayList.addAll(arrayList3);
                if (i != aVar.b.size() - 1) {
                    arrayList.add(new ne90.k(v690Var2));
                }
                i = i2;
            }
            arrayList.set(size, new ne90.h(a4h.f(arrayList2)));
            int size3 = (arrayList.size() - ((yg90) CollectionsKt.b0(arrayList2)).b) - 1;
            w690[] w690VarArr = w690.a;
            arrayList.add(new ne90.a((size3 * 62.0f) + 66.0f));
            return new rg90.c(v690Var, a4h.f(arrayList), ae90Var);
        }

        @Override // defpackage.jaj
        public final Object l(lk50<? extends a> lk50Var, b<? extends v690> bVar, List<? extends x690> list, ae90 ae90Var, v1b<? super rg90> v1bVar) {
            e eVar = zg90.this.new e(v1bVar);
            eVar.a = lk50Var;
            eVar.b = bVar;
            eVar.c = list;
            eVar.d = ae90Var;
            return eVar.invokeSuspend(Unit.a);
        }
    }

    @c0d(c = "com.sporty.android.platform.features.homeshortcut.sidepanel.SidePanelViewModel$uiState$2", f = "SidePanelViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<myh<? super rg90>, v1b<? super Unit>, Object> {
        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zg90.this.new f(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super rg90> myhVar, v1b<? super Unit> v1bVar) {
            return ((f) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            zg90 zg90Var = zg90.this;
            uf00<x690> uf00Var = zg90Var.a;
            or60 or60Var = new or60(new ah90(uf00Var, null));
            k5b k5bVar = zg90Var.c;
            lyh lyhVarC = ozh.c(or60Var, k5bVar);
            l790 l790Var = zg90Var.b;
            l790Var.getClass();
            uf00Var.getClass();
            y690 y690Var = l790Var.a;
            ArrayList arrayList = new ArrayList(l48.r(uf00Var, 10));
            Iterator<x690> it = uf00Var.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a);
            }
            kzh.d(ozh.c(new g1i(bm50.a(new n1i(new s78(new o790(y690Var.d(arrayList), uf00Var), lyhVarC, new hh90(3, null)), new or60(new n790(null, l790Var, uf00Var)), new ih90(zg90Var, null))), new jh90(zg90Var, null)), k5bVar), o8i0.d(zg90Var));
            return Unit.a;
        }
    }

    public zg90(uf00<x690> uf00Var, l790 l790Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, uqm uqmVar, iym iymVar) {
        uf00Var.getClass();
        l790Var.getClass();
        uqmVar.getClass();
        iymVar.getClass();
        this.a = uf00Var;
        this.b = l790Var;
        this.c = k5bVar;
        this.d = uqmVar;
        this.e = iymVar;
        wwd0 wwd0VarA = xwd0.a(b.C1392b.a);
        this.f = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(lk50.b.a);
        this.i = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(m2g.a);
        this.v = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(new ae90(false, s690.b.a));
        this.w = wwd0VarA4;
        ku90<rd90> ku90Var = new ku90<>();
        this.y = ku90Var;
        this.z = e1i.a(ku90Var);
        this.A = e1i.e(new xzh(ozh.c(r1i.b(wwd0VarA2, wwd0VarA, wwd0VarA3, wwd0VarA4, new e(null)), k5bVar), new f(null)), o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), rg90.b.a);
    }

    public static uf00 z1(uf00 uf00Var, uf00 uf00Var2, boolean z) {
        boolean z2;
        t690 t690Var;
        ArrayList arrayList = new ArrayList(l48.r(uf00Var, 10));
        Iterator<E> it = uf00Var.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            uf00<x690> uf00Var3 = cVar.b;
            ArrayList arrayList2 = new ArrayList(l48.r(uf00Var3, 10));
            for (x690 x690Var : uf00Var3) {
                if (uf00Var2 != null && uf00Var2.isEmpty()) {
                    z2 = false;
                    break;
                }
                Iterator<E> it2 = uf00Var2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = false;
                        break;
                    }
                    if (Intrinsics.g(((x690) it2.next()).a, x690Var.a)) {
                        z2 = true;
                        break;
                    }
                }
                if (!z && z2) {
                    t690Var = t690.c;
                } else if (z) {
                    t690Var = z2 ? t690.c : t690.a;
                } else {
                    t690Var = t690.d;
                }
                arrayList2.add(x690.a(x690Var, t690Var, false, 383));
            }
            uf00 uf00VarF = a4h.f(arrayList2);
            v690 v690Var = cVar.a;
            v690Var.getClass();
            uf00VarF.getClass();
            arrayList.add(new c(uf00VarF, v690Var));
        }
        return a4h.f(arrayList);
    }

    public final void x1() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.w;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ae90.a((ae90) value, false, s690.b.a, 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y1(Boolean bool, ArrayList arrayList) {
        wwd0 wwd0Var;
        Object value;
        Object value2;
        do {
            wwd0Var = this.w;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ae90.a((ae90) value, bool.booleanValue(), null, 2)));
        wwd0 wwd0Var2 = this.v;
        if (arrayList != null) {
            do {
                value2 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value2, arrayList));
        }
        wwd0 wwd0Var3 = this.i;
        Object value3 = wwd0Var3.getValue();
        if (!(((lk50) value3) instanceof lk50.c)) {
            value3 = null;
        }
        lk50 lk50Var = (lk50) value3;
        if (lk50Var != null) {
            a aVar = (a) ((lk50.c) lk50Var).a;
            uf00 uf00VarZ1 = z1(aVar.b, a4h.f((Iterable) wwd0Var2.getValue()), ((ae90) wwd0Var.getValue()).a);
            uf00<x690> uf00Var = aVar.a;
            uf00Var.getClass();
            uf00VarZ1.getClass();
            lk50.c cVar = new lk50.c(new a(uf00Var, uf00VarZ1));
            wwd0Var3.getClass();
            wwd0Var3.k(null, cVar);
        }
    }
}
