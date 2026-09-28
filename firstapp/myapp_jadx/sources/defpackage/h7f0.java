package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lh7f0;", "Lj8i0;", "dedicated-team-page"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class h7f0 extends j8i0 {
    public final v340 A;
    public final nfk a;
    public final m6k b;
    public final uck c;
    public final org d;
    public final ong e;
    public final String f;
    public final wwd0 i;
    public final wwd0 v;
    public final wwd0 w;
    public final wwd0 y;
    public final wwd0 z;

    @c0d(c = "com.sportybet.feature.dedicatedteampage.team.presentation.viewmodel.TeamMatchesViewModel$fetchEvents$2", f = "TeamMatchesViewModel.kt", l = {260, 261}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public pjd a;
        public Object b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ String f;

        /* JADX INFO: renamed from: h7f0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.dedicatedteampage.team.presentation.viewmodel.TeamMatchesViewModel$fetchEvents$2$fixturesDeferred$1", f = "TeamMatchesViewModel.kt", l = {258}, m = "invokeSuspend", v = 2)
        public static final class C0626a extends tje0 implements Function2<v5b, v1b<? super zi50<? extends hqz<fng>>>, Object> {
            public int a;
            public final /* synthetic */ h7f0 b;
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0626a(h7f0 h7f0Var, String str, v1b<? super C0626a> v1bVar) {
                super(2, v1bVar);
                this.b = h7f0Var;
                this.c = str;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0626a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends hqz<fng>>> v1bVar) {
                return ((C0626a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                Object objB;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    h7f0 h7f0Var = this.b;
                    m6k m6kVar = h7f0Var.b;
                    String str = h7f0Var.f;
                    this.a = 1;
                    objB = m6k.b(m6kVar, str, this.c, null, this, 8);
                    if (objB == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                    objB = ((zi50) obj).a;
                }
                return new zi50(objB);
            }
        }

        @c0d(c = "com.sportybet.feature.dedicatedteampage.team.presentation.viewmodel.TeamMatchesViewModel$fetchEvents$2$resultsDeferred$1", f = "TeamMatchesViewModel.kt", l = {257}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super zi50<? extends hqz<fng>>>, Object> {
            public int a;
            public final /* synthetic */ h7f0 b;
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h7f0 h7f0Var, String str, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = h7f0Var;
                this.c = str;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends hqz<fng>>> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                Object objB;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    h7f0 h7f0Var = this.b;
                    uck uckVar = h7f0Var.c;
                    String str = h7f0Var.f;
                    this.a = 1;
                    objB = uck.b(uckVar, str, this.c, null, this, 8);
                    if (objB == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                    objB = ((zi50) obj).a;
                }
                return new zi50(objB);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.f = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = h7f0.this.new a(this.f, v1bVar);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0073  */
        /* JADX WARN: Code duplicated, block: B:22:0x0083  */
        /* JADX WARN: Code duplicated, block: B:25:0x008c  */
        /* JADX WARN: Code duplicated, block: B:27:0x009c  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            pjd pjdVarA;
            Object obj2;
            Object obj3;
            wwd0 wwd0Var;
            Object value;
            f7f0 f7f0Var;
            c7f0 c7f0Var;
            c7f0 c7f0Var2;
            c7f0 c7f0Var3;
            v5b v5bVar = (v5b) this.d;
            y5b y5bVar = y5b.a;
            int i = this.c;
            h7f0 h7f0Var = h7f0.this;
            if (i == 0) {
                uj50.b(obj);
                String str = this.f;
                pjd pjdVarA2 = ej5.a(v5bVar, null, new b(h7f0Var, str, null), 3);
                pjdVarA = ej5.a(v5bVar, null, new C0626a(h7f0Var, str, null), 3);
                this.d = null;
                this.a = pjdVarA;
                this.c = 1;
                obj = pjdVarA2.q(this);
                if (obj != y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                pjdVarA = this.a;
                uj50.b(obj);
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.b;
                uj50.b(obj);
            }
            obj3 = ((zi50) obj).a;
            wwd0Var = h7f0Var.z;
            do {
                value = wwd0Var.getValue();
                f7f0Var = (f7f0) value;
                if (zi50.a(obj2) == null) {
                    hqz hqzVar = (hqz) obj2;
                    c7f0Var = new c7f0(hqzVar.a, hqzVar.b, hqzVar.c);
                } else {
                    c7f0Var = f7f0Var.g;
                }
                c7f0Var2 = c7f0Var;
                if (zi50.a(obj3) == null) {
                    hqz hqzVar2 = (hqz) obj3;
                    c7f0Var3 = new c7f0(hqzVar2.a, hqzVar2.b, hqzVar2.c);
                } else {
                    c7f0Var3 = f7f0Var.h;
                }
            } while (!wwd0Var.g(value, f7f0.a(f7f0Var, null, null, null, null, false, false, c7f0Var2, c7f0Var3, 47)));
            return Unit.a;
            Object obj4 = ((zi50) obj).a;
            this.d = null;
            this.a = null;
            this.b = obj4;
            this.c = 2;
            Object objAwait = pjdVarA.await(this);
            if (objAwait != y5bVar) {
                obj = objAwait;
                obj2 = obj4;
                obj3 = ((zi50) obj).a;
                wwd0Var = h7f0Var.z;
                do {
                    value = wwd0Var.getValue();
                    f7f0Var = (f7f0) value;
                    if (zi50.a(obj2) == null) {
                        hqz hqzVar3 = (hqz) obj2;
                        c7f0Var = new c7f0(hqzVar3.a, hqzVar3.b, hqzVar3.c);
                    } else {
                        c7f0Var = f7f0Var.g;
                    }
                    c7f0Var2 = c7f0Var;
                    if (zi50.a(obj3) == null) {
                        hqz hqzVar4 = (hqz) obj3;
                        c7f0Var3 = new c7f0(hqzVar4.a, hqzVar4.b, hqzVar4.c);
                    } else {
                        c7f0Var3 = f7f0Var.h;
                    }
                } while (!wwd0Var.g(value, f7f0.a(f7f0Var, null, null, null, null, false, false, c7f0Var2, c7f0Var3, 47)));
                return Unit.a;
            }
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.feature.dedicatedteampage.team.presentation.viewmodel.TeamMatchesViewModel$uiState$1", f = "TeamMatchesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements kaj<f7f0, o7v, String, Boolean, mjs, v1b<? super g7f0>, Object> {
        public /* synthetic */ f7f0 a;
        public /* synthetic */ o7v b;
        public /* synthetic */ String c;
        public /* synthetic */ boolean d;
        public /* synthetic */ mjs e;

        public b(v1b<? super b> v1bVar) {
            super(6, v1bVar);
        }

        @Override // defpackage.kaj
        public final Object f(f7f0 f7f0Var, o7v o7vVar, String str, Boolean bool, mjs mjsVar, v1b<? super g7f0> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            b bVar = h7f0.this.new b(v1bVar);
            bVar.a = f7f0Var;
            bVar.b = o7vVar;
            bVar.c = str;
            bVar.d = zBooleanValue;
            bVar.e = mjsVar;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object next;
            Object next2;
            prg prgVar;
            h7f0 h7f0Var = h7f0.this;
            String str = h7f0Var.f;
            org orgVar = h7f0Var.d;
            f7f0 f7f0Var = this.a;
            o7v o7vVar = this.b;
            String str2 = this.c;
            boolean z = this.d;
            mjs mjsVar = this.e;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (z) {
                return g7f0.c.a;
            }
            String str3 = f7f0Var.a;
            c7f0 c7f0Var = f7f0Var.g;
            c7f0 c7f0Var2 = f7f0Var.h;
            if (str3 != null) {
                return new g7f0.b(str3);
            }
            ngs ngsVarB = kotlin.collections.a.b();
            ngsVarB.add(new r680("All Leagues", 2, null, new Integer(R.drawable.ic_menu_lines_16dp)));
            List<a4g0> list = f7f0Var.b;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            for (a4g0 a4g0Var : list) {
                arrayList.add(new r680(a4g0Var.c, 4, a4g0Var.d, null));
            }
            ngsVarB.addAll(arrayList);
            uf00 uf00VarF = a4h.f(kotlin.collections.a.a(ngsVarB));
            Iterator<E> it = uf00VarF.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(((r680) next).a, str2));
            r680 r680Var = (r680) next;
            if (r680Var == null) {
                r680Var = (r680) CollectionsKt.T(uf00VarF);
            }
            r680 r680Var2 = r680Var;
            boolean z2 = f7f0Var.e;
            boolean z3 = f7f0Var.f;
            List<fng> list2 = c7f0Var.a;
            orgVar.getClass();
            list2.getClass();
            str.getClass();
            uf00 uf00VarB = orgVar.b(str, false, list2);
            uf00 uf00VarA = orgVar.a(str, c7f0Var2.a);
            List<fng> list3 = c7f0Var2.a;
            ivs ivsVar = orgVar.a;
            bnh0 bnh0Var = ivsVar.b;
            list3.getClass();
            str.getClass();
            Iterator<T> it2 = list3.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((fng) next2).o);
            fng fngVar = (fng) next2;
            if (fngVar == null) {
                prgVar = null;
            } else {
                String str4 = fngVar.a;
                prg prgVarC = orgVar.c(fngVar, false, str);
                mgb0 mgb0Var = ivsVar.c;
                str4.getClass();
                String strD = bnh0.d(bnh0Var, new String[]{"liveTracker"}, kpu.f(new Pair(AnalyticsParam.EVENT_PARAM_ID, StringsKt.m0(str4, ":", str4)), new Pair("locale", mgb0Var.getLanguageCode())), 4);
                String strD2 = bnh0.d(bnh0Var, new String[]{"statistics"}, kpu.f(new Pair(AnalyticsParam.EVENT_PARAM_ID, StringsKt.m0(str4, ":", str4)), new Pair("locale", mgb0Var.getLanguageCode())), 4);
                String str5 = prgVarC.a;
                String str6 = prgVarC.b;
                String str7 = prgVarC.c;
                String str8 = prgVarC.d;
                String str9 = prgVarC.e;
                String str10 = prgVarC.f;
                String str11 = prgVarC.g;
                String str12 = prgVarC.h;
                String str13 = prgVarC.i;
                String str14 = prgVarC.j;
                String str15 = prgVarC.k;
                boolean z4 = prgVarC.l;
                boolean z5 = prgVarC.m;
                boolean z6 = prgVarC.n;
                String str16 = prgVarC.o;
                boolean z7 = prgVarC.p;
                boolean z8 = prgVarC.q;
                str5.getClass();
                prgVar = new prg(str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, z4, z5, z6, str16, z7, z8, strD, strD2);
            }
            return new g7f0.a(o7vVar, z2, z3, uf00VarA, uf00VarB, c7f0Var2.c, c7f0Var.c, prgVar, mjsVar, uf00VarF, r680Var2);
        }
    }

    public h7f0(vu60 vu60Var, nfk nfkVar, m6k m6kVar, uck uckVar, org orgVar, ong ongVar, rdd0 rdd0Var) {
        vu60Var.getClass();
        rdd0Var.getClass();
        this.a = nfkVar;
        this.b = m6kVar;
        this.c = uckVar;
        this.d = orgVar;
        this.e = ongVar;
        String str = (String) vu60Var.b("team_id");
        this.f = str == null ? "" : str;
        String str2 = (String) vu60Var.b("matches_tab");
        String str3 = str2 != null ? str2 : "";
        wwd0 wwd0VarA = xwd0.a(Boolean.TRUE);
        this.i = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(o7v.valueOf(str3));
        this.v = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a("All Leagues");
        this.w = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(mjs.a);
        this.y = wwd0VarA4;
        wwd0 wwd0VarA5 = xwd0.a(new f7f0(0));
        this.z = wwd0VarA5;
        this.A = e1i.e(r1i.c(wwd0VarA5, wwd0VarA2, wwd0VarA3, wwd0VarA, wwd0VarA4, new b(null)), o8i0.d(this), q490.a.a, g7f0.c.a);
        ej5.c(o8i0.d(this), null, null, new i7f0(this, null), 3);
    }

    public final void x1(String str) {
        while (true) {
            wwd0 wwd0Var = this.z;
            Object value = wwd0Var.getValue();
            String str2 = str;
            if (wwd0Var.g(value, f7f0.a((f7f0) value, null, null, null, str2, true, false, new c7f0(0), new c7f0(0), 7))) {
                ej5.c(o8i0.d(this), null, null, new a(str2, null), 3);
                return;
            }
            str = str2;
        }
    }
}
