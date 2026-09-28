package defpackage;

import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.team.presentation.viewmodel.TeamOverviewViewModel$fetchTeamData$1", f = "TeamOverviewViewModel.kt", l = {109, 121, 122, 123}, m = "invokeSuspend", v = 2)
public final class r7f0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public pjd a;
    public List b;
    public String c;
    public pjd d;
    public ojd e;
    public Object f;
    public Object i;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ s7f0 y;

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.dedicatedteampage.team.presentation.viewmodel.TeamOverviewViewModel$fetchTeamData$1$fixturesDeferred$1", f = "TeamOverviewViewModel.kt", l = {119}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super zi50<? extends hqz<fng>>>, Object> {
        public int a;
        public final /* synthetic */ s7f0 b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s7f0 s7f0Var, String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = s7f0Var;
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends hqz<fng>>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objB;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s7f0 s7f0Var = this.b;
                m6k m6kVar = s7f0Var.d;
                String str = s7f0Var.y;
                this.a = 1;
                objB = m6k.b(m6kVar, str, this.c, null, this, 12);
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

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.dedicatedteampage.team.presentation.viewmodel.TeamOverviewViewModel$fetchTeamData$1$newsDeferred$1", f = "TeamOverviewViewModel.kt", l = {106}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super zi50<? extends hqz<wgh>>>, Object> {
        public int a;
        public final /* synthetic */ s7f0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s7f0 s7f0Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = s7f0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends hqz<wgh>>> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objB;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s7f0 s7f0Var = this.b;
                lfk lfkVar = s7f0Var.a;
                String str = s7f0Var.y;
                this.a = 1;
                objB = lfk.b(lfkVar, str, null, this, 6);
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

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.dedicatedteampage.team.presentation.viewmodel.TeamOverviewViewModel$fetchTeamData$1$resultsDeferred$1", f = "TeamOverviewViewModel.kt", l = {115}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super zi50<? extends hqz<fng>>>, Object> {
        public int a;
        public final /* synthetic */ s7f0 b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s7f0 s7f0Var, String str, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = s7f0Var;
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends hqz<fng>>> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objB;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s7f0 s7f0Var = this.b;
                uck uckVar = s7f0Var.c;
                String str = s7f0Var.y;
                this.a = 1;
                objB = uck.b(uckVar, str, this.c, null, this, 12);
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

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.dedicatedteampage.team.presentation.viewmodel.TeamOverviewViewModel$fetchTeamData$1$tournamentsDeferred$1", f = "TeamOverviewViewModel.kt", l = {107}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super zi50<? extends List<? extends a4g0>>>, Object> {
        public int a;
        public final /* synthetic */ s7f0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(s7f0 s7f0Var, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = s7f0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends List<? extends a4g0>>> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objA;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s7f0 s7f0Var = this.b;
                nfk nfkVar = s7f0Var.b;
                String str = s7f0Var.y;
                this.a = 1;
                objA = nfkVar.a(str, this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objA = ((zi50) obj).a;
            }
            return new zi50(objA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7f0(s7f0 s7f0Var, v1b<? super r7f0> v1bVar) {
        super(2, v1bVar);
        this.y = s7f0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        r7f0 r7f0Var = new r7f0(this.y, v1bVar);
        r7f0Var.w = obj;
        return r7f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((r7f0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x011c  */
    /* JADX WARN: Code duplicated, block: B:40:0x013c  */
    /* JADX WARN: Code duplicated, block: B:51:0x015e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0163  */
    /* JADX WARN: Code duplicated, block: B:55:0x0166  */
    /* JADX WARN: Code duplicated, block: B:58:0x0173  */
    /* JADX WARN: Code duplicated, block: B:61:0x0178  */
    /* JADX WARN: Code duplicated, block: B:62:0x017b  */
    /* JADX WARN: Code duplicated, block: B:65:0x018f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
    /* JADX WARN: Code duplicated, block: B:69:0x0197  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        pjd pjdVarA;
        Object objQ;
        List list;
        ojd ojdVarA;
        Object objAwait;
        pjd pjdVar;
        String str;
        Object obj2;
        Object objAwait2;
        String str2;
        List list2;
        Object obj3;
        Object objAwait3;
        Object obj4;
        Object obj5;
        String str3;
        Object obj6;
        boolean z;
        hqz hqzVar;
        List list3;
        uf00 uf00VarA;
        hqz hqzVar2;
        List list4;
        uf00 uf00VarB;
        hqz hqzVar3;
        List list5;
        uf00 uf00VarA2;
        s7f0 s7f0Var = this.y;
        String str4 = s7f0Var.y;
        org orgVar = s7f0Var.e;
        wwd0 wwd0Var = s7f0Var.A;
        wwd0 wwd0Var2 = s7f0Var.C;
        wwd0 wwd0Var3 = s7f0Var.B;
        v5b v5bVar = (v5b) this.w;
        y5b y5bVar = y5b.a;
        int i = this.v;
        if (i == 0) {
            uj50.b(obj);
            Boolean bool = Boolean.FALSE;
            wwd0Var3.getClass();
            wwd0Var3.k(null, bool);
            wwd0Var2.getClass();
            wwd0Var2.k(null, bool);
            wwd0Var.setValue(null);
            pjdVarA = ej5.a(v5bVar, null, new b(s7f0Var, null), 3);
            pjd pjdVarA2 = ej5.a(v5bVar, null, new d(s7f0Var, null), 3);
            this.w = v5bVar;
            this.a = pjdVarA;
            this.v = 1;
            objQ = pjdVarA2.q(this);
            if (objQ != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            pjdVarA = this.a;
            uj50.b(obj);
            objQ = obj;
        } else {
            if (i == 2) {
                ojd ojdVar = this.e;
                pjdVar = this.d;
                str = this.c;
                list = this.b;
                uj50.b(obj);
                ojdVarA = ojdVar;
                objAwait = obj;
                obj2 = ((zi50) objAwait).a;
                this.w = null;
                this.a = null;
                this.b = list;
                this.c = str;
                this.d = null;
                this.e = ojdVarA;
                this.f = obj2;
                this.v = 3;
                objAwait2 = pjdVar.await(this);
                if (objAwait2 != y5bVar) {
                    str2 = str;
                    list2 = list;
                    obj3 = ((zi50) objAwait2).a;
                    this.w = null;
                    this.a = null;
                    this.b = list2;
                    this.c = str2;
                    this.d = null;
                    this.e = null;
                    this.f = obj2;
                    this.i = obj3;
                    this.v = 4;
                    objAwait3 = ojdVarA.await(this);
                    if (objAwait3 != y5bVar) {
                        obj4 = obj2;
                        obj5 = obj3;
                        str3 = str2;
                    }
                }
                return y5bVar;
            }
            if (i == 3) {
                obj2 = this.f;
                ojd ojdVar2 = this.e;
                str2 = this.c;
                list2 = this.b;
                uj50.b(obj);
                wwd0Var = wwd0Var;
                ojdVarA = ojdVar2;
                objAwait2 = obj;
                obj3 = ((zi50) objAwait2).a;
                this.w = null;
                this.a = null;
                this.b = list2;
                this.c = str2;
                this.d = null;
                this.e = null;
                this.f = obj2;
                this.i = obj3;
                this.v = 4;
                objAwait3 = ojdVarA.await(this);
                if (objAwait3 != y5bVar) {
                    obj4 = obj2;
                    obj5 = obj3;
                    str3 = str2;
                }
                return y5bVar;
            }
            if (i != 4) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj5 = this.i;
            obj4 = this.f;
            str3 = this.c;
            List list6 = this.b;
            uj50.b(obj);
            list2 = list6;
            wwd0Var = wwd0Var;
            objAwait3 = obj;
        }
        obj6 = ((zi50) objAwait3).a;
        z = obj4 instanceof zi50.b;
        if (!z && (obj5 instanceof zi50.b) && (obj6 instanceof zi50.b)) {
            Boolean bool2 = Boolean.TRUE;
            wwd0Var3.getClass();
            wwd0Var3.k(null, bool2);
            return Unit.a;
        }
        zgh zghVar = s7f0Var.f;
        if (z) {
            obj4 = null;
        }
        hqzVar = (hqz) obj4;
        if (hqzVar != null) {
            list3 = hqzVar.a;
        } else {
            list3 = m2g.a;
        }
        zghVar.getClass();
        uf00VarA = zgh.a(list3);
        if (obj5 instanceof zi50.b) {
            obj5 = null;
        }
        hqzVar2 = (hqz) obj5;
        if (hqzVar2 != null) {
            list4 = hqzVar2.a;
        } else {
            list4 = m2g.a;
        }
        orgVar.getClass();
        list4.getClass();
        str4.getClass();
        uf00VarB = orgVar.b(str4, false, list4);
        if (obj6 instanceof zi50.b) {
            obj6 = null;
        }
        hqzVar3 = (hqz) obj6;
        if (hqzVar3 != null) {
            list5 = hqzVar3.a;
        } else {
            list5 = m2g.a;
        }
        uf00VarA2 = orgVar.a(str4, list5);
        if (!uf00VarA.isEmpty() && uf00VarB.isEmpty() && uf00VarA2.isEmpty()) {
            Boolean bool3 = Boolean.TRUE;
            wwd0Var2.getClass();
            wwd0Var2.k(null, bool3);
            return Unit.a;
        }
        s7f0Var.D.setValue(str3);
        s7f0Var.E.setValue(str3);
        q7f0 q7f0Var = new q7f0(uf00VarA, uf00VarB, uf00VarA2, a4h.f(list2));
        wwd0Var.getClass();
        wwd0Var.k(null, q7f0Var);
        return Unit.a;
        Object obj7 = ((zi50) objQ).a;
        if (obj7 instanceof zi50.b) {
            obj7 = null;
        }
        List list7 = (List) obj7;
        if (list7 == null) {
            list7 = m2g.a;
        }
        List list8 = list7;
        String strA0 = CollectionsKt.a0(list8, tYcQsJyaojE.xFwsO, null, null, new yjb0(1), 30);
        list = list8;
        a4g0 a4g0Var = (a4g0) CollectionsKt.firstOrNull(list);
        String str5 = a4g0Var != null ? a4g0Var.a : null;
        if (str5 == null) {
            str5 = "";
        }
        pjd pjdVarA3 = ej5.a(v5bVar, null, new c(s7f0Var, strA0, null), 3);
        ojdVarA = ej5.a(v5bVar, null, new a(s7f0Var, strA0, null), 3);
        this.w = null;
        this.a = null;
        this.b = list;
        this.c = str5;
        this.d = pjdVarA3;
        this.e = ojdVarA;
        this.v = 2;
        objAwait = pjdVarA.await(this);
        if (objAwait != y5bVar) {
            pjdVar = pjdVarA3;
            str = str5;
            obj2 = ((zi50) objAwait).a;
            this.w = null;
            this.a = null;
            this.b = list;
            this.c = str;
            this.d = null;
            this.e = ojdVarA;
            this.f = obj2;
            this.v = 3;
            objAwait2 = pjdVar.await(this);
            if (objAwait2 != y5bVar) {
                str2 = str;
                list2 = list;
                obj3 = ((zi50) objAwait2).a;
                this.w = null;
                this.a = null;
                this.b = list2;
                this.c = str2;
                this.d = null;
                this.e = null;
                this.f = obj2;
                this.i = obj3;
                this.v = 4;
                objAwait3 = ojdVarA.await(this);
                if (objAwait3 != y5bVar) {
                    obj4 = obj2;
                    obj5 = obj3;
                    str3 = str2;
                    obj6 = ((zi50) objAwait3).a;
                    z = obj4 instanceof zi50.b;
                    if (!z) {
                    }
                    zgh zghVar2 = s7f0Var.f;
                    if (z) {
                        obj4 = null;
                    }
                    hqzVar = (hqz) obj4;
                    if (hqzVar != null) {
                        list3 = hqzVar.a;
                    } else {
                        list3 = m2g.a;
                    }
                    zghVar2.getClass();
                    uf00VarA = zgh.a(list3);
                    if (obj5 instanceof zi50.b) {
                        obj5 = null;
                    }
                    hqzVar2 = (hqz) obj5;
                    if (hqzVar2 != null) {
                        list4 = hqzVar2.a;
                    } else {
                        list4 = m2g.a;
                    }
                    orgVar.getClass();
                    list4.getClass();
                    str4.getClass();
                    uf00VarB = orgVar.b(str4, false, list4);
                    if (obj6 instanceof zi50.b) {
                        obj6 = null;
                    }
                    hqzVar3 = (hqz) obj6;
                    if (hqzVar3 != null) {
                        list5 = hqzVar3.a;
                    } else {
                        list5 = m2g.a;
                    }
                    uf00VarA2 = orgVar.a(str4, list5);
                    if (!uf00VarA.isEmpty()) {
                    }
                    s7f0Var.D.setValue(str3);
                    s7f0Var.E.setValue(str3);
                    q7f0 q7f0Var2 = new q7f0(uf00VarA, uf00VarB, uf00VarA2, a4h.f(list2));
                    wwd0Var.getClass();
                    wwd0Var.k(null, q7f0Var2);
                    return Unit.a;
                }
            }
        }
        return y5bVar;
    }
}
