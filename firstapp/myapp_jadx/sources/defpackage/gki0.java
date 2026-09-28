package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.loyalty.ParticipateMissionRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class gki0 {
    public final ixt a;
    public final etz b;
    public final lwv c;
    public final mgb0 d;
    public final yho e;
    public final wwd0 f;
    public final wwd0 g;
    public final wwd0 h;
    public final b390 i;
    public nli0 j;
    public final wwd0 k;
    public final v340 l;
    public final wwd0 m;
    public final v340 n;
    public final lyh<Set<Integer>> o;
    public final b77 p;

    @c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyMissionStatusHandlerImpl$missionDataFlow$2$1", f = "VirtualLobbyMissionStatusHandlerImpl.kt", l = {85}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super Unit>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super Unit> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = (myh) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                Unit unit = Unit.a;
                this.b = null;
                this.a = 1;
                if (myhVar.emit(unit, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyMissionStatusHandlerImpl$missionDataFlow$lambda$1$$inlined$flatMapLatest$1", f = "VirtualLobbyMissionStatusHandlerImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<myh<? super lk50<? extends List<? extends osv>>>, Unit, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ gki0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, gki0 gki0Var) {
            super(3, v1bVar);
            this.d = gki0Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super lk50<? extends List<? extends osv>>> myhVar, Unit unit, v1b<? super Unit> v1bVar) {
            b bVar = new b(v1bVar, this.d);
            bVar.b = myhVar;
            bVar.c = unit;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                yzh yzhVarE = this.d.a.e();
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, yzhVarE, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyMissionStatusHandlerImpl$special$$inlined$flatMapLatest$1", f = "VirtualLobbyMissionStatusHandlerImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super lk50<? extends List<? extends osv>>>, Boolean, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ gki0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, gki0 gki0Var) {
            super(3, v1bVar);
            this.d = gki0Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super lk50<? extends List<? extends osv>>> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = bool;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lyh lyhVarF;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                if (((Boolean) this.c).booleanValue()) {
                    gki0 gki0Var = this.d;
                    lyhVarF = r0i.f(new xzh(gki0Var.i, new a(2, null)), new b(null, gki0Var));
                } else {
                    lyhVarF = new gzh(lk50.b.a);
                }
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, lyhVarF, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final class d implements lyh<Set<? extends Integer>> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ gki0 b;

        @c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyMissionStatusHandlerImpl$special$$inlined$map$1", f = "VirtualLobbyMissionStatusHandlerImpl.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return d.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyMissionStatusHandlerImpl$special$$inlined$map$1$2", f = "VirtualLobbyMissionStatusHandlerImpl.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, gki0 gki0Var) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                Collection collectionE0;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    String str = (String) obj;
                    if (StringsKt.U(str)) {
                        collectionE0 = t3g.a;
                    } else {
                        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{","}, false, 0, 6, null);
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = listSplit$default.iterator();
                        while (it.hasNext()) {
                            Integer intOrNull = StringsKt.toIntOrNull(StringsKt.t0((String) it.next()).toString());
                            if (intOrNull != null) {
                                arrayList.add(intOrNull);
                            }
                        }
                        collectionE0 = CollectionsKt.E0(arrayList);
                    }
                    aVar.b = 1;
                    if (this.a.emit(collectionE0, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public d(lyh lyhVar, gki0 gki0Var) {
            this.a = lyhVar;
            this.b = gki0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Set<? extends Integer>> myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final class e implements lyh<Boolean> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyMissionStatusHandlerImpl$special$$inlined$map$2", f = "VirtualLobbyMissionStatusHandlerImpl.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyMissionStatusHandlerImpl$special$$inlined$map$2$2", f = "VirtualLobbyMissionStatusHandlerImpl.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((AccountInfo) obj) != null);
                    aVar.b = 1;
                    if (this.a.emit(boolValueOf, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public e(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public gki0(ixt ixtVar, etz etzVar, lwv lwvVar, mgb0 mgb0Var, yho yhoVar) {
        ixtVar.getClass();
        etzVar.getClass();
        lwvVar.getClass();
        mgb0Var.getClass();
        this.a = ixtVar;
        this.b = etzVar;
        this.c = lwvVar;
        this.d = mgb0Var;
        this.e = yhoVar;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.f = xwd0.a(o2gVar);
        t3g t3gVar = t3g.a;
        this.g = xwd0.a(t3gVar);
        this.h = xwd0.a(t3gVar);
        this.i = d390.b(1, 0, null, 6);
        wwd0 wwd0VarA = xwd0.a(vji0.b.a);
        this.k = wwd0VarA;
        this.l = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(Boolean.FALSE);
        this.m = wwd0VarA2;
        this.n = e1i.b(wwd0VarA2);
        this.o = uzh.b(new d(yhoVar.k.a(yhoVar, yho.o[10]).d(""), this));
        this.p = r0i.f(uzh.b(new e(mgb0Var.getAccountInfoFlow())), new c(null, this));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(lk50 lk50Var, Map map, Set set, Set set2, x1b x1bVar) {
        wji0 wji0Var;
        Set set3;
        int i;
        int i2;
        if (x1bVar instanceof wji0) {
            wji0Var = (wji0) x1bVar;
            int i3 = wji0Var.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wji0Var.e = i3 - Integer.MIN_VALUE;
            } else {
                wji0Var = new wji0(this, x1bVar);
            }
        } else {
            wji0Var = new wji0(this, x1bVar);
        }
        wji0 wji0Var2 = wji0Var;
        Object objA = wji0Var2.c;
        y5b y5bVar = y5b.a;
        int i4 = wji0Var2.e;
        if (i4 == 0) {
            uj50.b(objA);
            if (!this.d.isLogin()) {
                return vji0.c.a;
            }
            if (lk50Var instanceof lk50.b) {
                vji0 vji0Var = (vji0) this.k.getValue();
                vji0.d dVar = vji0Var instanceof vji0.d ? (vji0.d) vji0Var : null;
                return dVar != null ? dVar : vji0.b.a;
            }
            if (lk50Var instanceof lk50.a) {
                return new vji0.a(1, ((lk50.a) lk50Var).b);
            }
            if (!(lk50Var instanceof lk50.c)) {
                uhc.a();
                return null;
            }
            List list = (List) ((lk50.c) lk50Var).a;
            wji0Var2.a = set;
            wji0Var2.b = set2;
            wji0Var2.e = 1;
            objA = this.c.a(list, map, set2, true, wji0Var2);
            if (objA == y5bVar) {
                return y5bVar;
            }
            set3 = set2;
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set3 = wji0Var2.b;
            set = wji0Var2.a;
            uj50.b(objA);
        }
        uf00 uf00VarF = a4h.f((Iterable) objA);
        int i5 = 0;
        if (uf00VarF == null || !uf00VarF.isEmpty()) {
            Iterator<E> it = uf00VarF.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                if (((kwv) it.next()).i && (i6 = i6 + 1) < 0) {
                    kotlin.collections.b.p();
                    throw null;
                }
            }
            i = i6;
        } else {
            i = 0;
        }
        if (uf00VarF == null || !uf00VarF.isEmpty()) {
            Iterator<E> it2 = uf00VarF.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                if (((kwv) it2.next()).j && (i7 = i7 + 1) < 0) {
                    kotlin.collections.b.p();
                    throw null;
                }
            }
            i2 = i7;
        } else {
            i2 = 0;
        }
        wwd0 wwd0Var = this.h;
        if (i == 0) {
            wwd0Var.setValue(t3g.a);
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : uf00VarF) {
                if (((kwv) obj).i) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
            int size = arrayList.size();
            while (i5 < size) {
                Object obj2 = arrayList.get(i5);
                i5++;
                bki0.a(((kwv) obj2).a, arrayList2);
            }
            wwd0Var.setValue(CollectionsKt.E0(arrayList2));
        }
        return new vji0.d(new iki0(uf00VarF, a4h.h(set), a4h.h(set3), i, i2));
    }

    public final void b(yqv yqvVar, et7 et7Var) {
        wwd0 wwd0Var;
        Object value;
        if (yqvVar instanceof yqv.e) {
            int i = ((yqv.e) yqvVar).a;
            do {
                wwd0Var = this.h;
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, yi80.f((Set) value, Integer.valueOf(i))));
            ParticipateMissionRequest participateMissionRequest = new ParticipateMissionRequest(String.valueOf(i));
            etz etzVar = this.b;
            etzVar.getClass();
            kzh.d(new g1i(etzVar.a.b(participateMissionRequest), new hki0(this, i, et7Var, null)), et7Var);
            return;
        }
        if (yqvVar instanceof yqv.g) {
            int i2 = ((yqv.g) yqvVar).a;
            wwd0 wwd0Var2 = this.g;
            Set set = (Set) wwd0Var2.getValue();
            boolean zContains = set.contains(Integer.valueOf(i2));
            Integer numValueOf = Integer.valueOf(i2);
            wwd0Var2.k(null, zContains ? yi80.c(set, numValueOf) : yi80.f(set, numValueOf));
            return;
        }
        if (yqvVar instanceof yqv.f) {
            c(0, uxs.ENABLE);
        } else {
            if ((yqvVar instanceof yqv.b) || (yqvVar instanceof yqv.c) || yqvVar.equals(yqv.d.a) || (yqvVar instanceof yqv.a)) {
                return;
            }
            uhc.a();
        }
    }

    public final void c(int i, uxs uxsVar) {
        wwd0 wwd0Var = this.f;
        LinkedHashMap linkedHashMapM = kpu.m((Map) wwd0Var.getValue());
        linkedHashMapM.put(Integer.valueOf(i), uxsVar);
        wwd0Var.getClass();
        wwd0Var.k(null, linkedHashMapM);
    }
}
