package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.domain.UpdateStreamUseCase$invoke$2$updateStreamFromApi$1", f = "UpdateStreamUseCase.kt", l = {69}, m = "invokeSuspend", v = 2)
public final class dlh0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wkh0 b;
    public final /* synthetic */ wkh0.b c;
    public final /* synthetic */ quw d;
    public final /* synthetic */ Set<String> e;
    public final /* synthetic */ Map<wkh0.b, wkh0.c> f;

    public static final class a<T> implements myh {
        public final /* synthetic */ quw a;
        public final /* synthetic */ Set<String> b;
        public final /* synthetic */ wkh0.b c;
        public final /* synthetic */ Map<wkh0.b, wkh0.c> d;

        /* JADX INFO: renamed from: dlh0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.UpdateStreamUseCase$invoke$2$updateStreamFromApi$1$2", f = "UpdateStreamUseCase.kt", l = {213, 239}, m = "emit", v = 2)
        public static final class C0490a extends x1b {
            public quw a;
            public Set b;
            public Object c;
            public Object d;
            public Set e;
            public wkh0.b f;
            public Map i;
            public /* synthetic */ Object v;
            public final /* synthetic */ a<T> w;
            public int y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0490a(a<? super T> aVar, v1b<? super C0490a> v1bVar) {
                super(v1bVar);
                this.w = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.v = obj;
                this.y |= Integer.MIN_VALUE;
                return this.w.emit(null, this);
            }
        }

        public a(quw quwVar, Set<String> set, wkh0.b bVar, Map<wkh0.b, wkh0.c> map) {
            this.a = quwVar;
            this.b = set;
            this.c = bVar;
            this.d = map;
        }

        /* JADX WARN: Code duplicated, block: B:53:0x0199 A[Catch: all -> 0x019d, TRY_ENTER, TryCatch #1 {all -> 0x019d, blocks: (B:50:0x0189, B:53:0x0199, B:57:0x01a3, B:56:0x01a0), top: B:67:0x0189 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x01a0 A[Catch: all -> 0x019d, TryCatch #1 {all -> 0x019d, blocks: (B:50:0x0189, B:53:0x0199, B:57:0x01a3, B:56:0x01a0), top: B:67:0x0189 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(lk50<? extends uf00<esq>> lk50Var, v1b<? super Unit> v1bVar) {
            C0490a c0490a;
            Set setE0;
            Set set;
            Set<String> set2;
            wkh0.b bVar;
            Map<wkh0.b, wkh0.c> map;
            quw quwVar;
            wkh0.b bVar2;
            Map<wkh0.b, wkh0.c> map2;
            Set<String> set3;
            quw quwVar2;
            boolean zIsEmpty;
            String str;
            if (v1bVar instanceof C0490a) {
                c0490a = (C0490a) v1bVar;
                int i = c0490a.y;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0490a.y = i - Integer.MIN_VALUE;
                } else {
                    c0490a = new C0490a(this, v1bVar);
                }
            } else {
                c0490a = new C0490a(this, v1bVar);
            }
            Object obj = c0490a.v;
            y5b y5bVar = y5b.a;
            int i2 = c0490a.y;
            if (i2 == 0) {
                uj50.b(obj);
                if (!Intrinsics.g(lk50Var, lk50.b.a)) {
                    boolean z = lk50Var instanceof lk50.a;
                    Map<wkh0.b, wkh0.c> map3 = this.d;
                    Set<String> set4 = this.b;
                    quw quwVar3 = this.a;
                    wkh0.b bVar3 = this.c;
                    if (z) {
                        c0490a.a = quwVar3;
                        c0490a.b = set4;
                        c0490a.c = bVar3;
                        c0490a.d = map3;
                        c0490a.y = 1;
                        if (quwVar3.d(c0490a) != y5bVar) {
                            bVar2 = bVar3;
                            map2 = map3;
                            set3 = set4;
                            quwVar2 = quwVar3;
                            set3.remove(bVar2.a);
                            zkh0.n(bVar2.a, map2);
                            Unit unit = Unit.a;
                        }
                    } else {
                        if (!(lk50Var instanceof lk50.c)) {
                            uhc.a();
                            return null;
                        }
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        Iterable<esq> iterable = (Iterable) ((lk50.c) lk50Var).a;
                        ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
                        for (esq esqVar : iterable) {
                            String str2 = bVar3.a;
                            String str3 = esqVar.a;
                            lhr lhrVar = esqVar.d;
                            arrayList.add(new Pair(new wkh0.b(lhrVar.a, str2, str3), new Long(lhrVar.b)));
                            set4 = set4;
                        }
                        Set<String> set5 = set4;
                        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                        int size = arrayList.size();
                        int i3 = 0;
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj2 = arrayList.get(i4);
                            i4++;
                            arrayList2.add((wkh0.b) ((Pair) obj2).a);
                        }
                        Set setE1 = CollectionsKt.E0(arrayList2);
                        ArrayList arrayList3 = new ArrayList();
                        int size2 = arrayList.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj3 = arrayList.get(i5);
                            i5++;
                            if (((Number) ((Pair) obj3).b).longValue() > jElapsedRealtime) {
                                arrayList3.add(obj3);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(l48.r(arrayList3, 10));
                        int size3 = arrayList3.size();
                        while (i3 < size3) {
                            Object obj4 = arrayList3.get(i3);
                            i3++;
                            arrayList4.add((wkh0.b) ((Pair) obj4).a);
                        }
                        setE0 = CollectionsKt.E0(arrayList4);
                        c0490a.a = null;
                        c0490a.b = setE1;
                        c0490a.c = setE0;
                        c0490a.d = quwVar3;
                        c0490a.e = set5;
                        c0490a.f = bVar3;
                        c0490a.i = map3;
                        c0490a.y = 2;
                        if (quwVar3.d(c0490a) != y5bVar) {
                            set = setE1;
                            set2 = set5;
                            bVar = bVar3;
                            map = map3;
                            quwVar = quwVar3;
                            set2.remove(bVar.a);
                            zIsEmpty = setE0.isEmpty();
                            str = bVar.a;
                            if (zIsEmpty) {
                                zkh0.n(str, map);
                            } else {
                                zkh0.o(map, str, set, setE0);
                            }
                            Unit unit2 = Unit.a;
                            Object obj5 = null;
                        }
                    }
                    return y5bVar;
                }
            } else if (i2 == 1) {
                map2 = (Map) c0490a.d;
                bVar2 = (wkh0.b) c0490a.c;
                set3 = c0490a.b;
                quwVar2 = c0490a.a;
                uj50.b(obj);
                try {
                    set3.remove(bVar2.a);
                    zkh0.n(bVar2.a, map2);
                    Unit unit3 = Unit.a;
                } finally {
                    quwVar2.f(null);
                }
            } else {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                map = c0490a.i;
                bVar = c0490a.f;
                set2 = c0490a.e;
                quwVar = (quw) c0490a.d;
                setE0 = (Set) c0490a.c;
                set = c0490a.b;
                uj50.b(obj);
                try {
                    set2.remove(bVar.a);
                    zIsEmpty = setE0.isEmpty();
                    str = bVar.a;
                    if (zIsEmpty) {
                        zkh0.o(map, str, set, setE0);
                    } else {
                        zkh0.n(str, map);
                    }
                    Unit unit4 = Unit.a;
                    Object obj6 = null;
                } finally {
                    quwVar.f(null);
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.UpdateStreamUseCase$invoke$2$updateStreamFromApi$1$invokeSuspend$$inlined$flatMapLatest$1", f = "UpdateStreamUseCase.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<myh<? super uf00<? extends esq>>, qcn<? extends dsq>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ wkh0 d;
        public final /* synthetic */ wkh0.b e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, wkh0 wkh0Var, wkh0.b bVar) {
            super(3, v1bVar);
            this.d = wkh0Var;
            this.e = bVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super uf00<? extends esq>> myhVar, qcn<? extends dsq> qcnVar, v1b<? super Unit> v1bVar) {
            b bVar = new b(v1bVar, this.d, this.e);
            bVar.b = myhVar;
            bVar.c = qcnVar;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                i6u i6uVar = this.d.a;
                String str = this.e.a;
                i6uVar.getClass();
                str.getClass();
                or60 or60VarC = i6uVar.c(new q6u(i6uVar, str, null));
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, or60VarC, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlh0(wkh0 wkh0Var, wkh0.b bVar, quw quwVar, Set<String> set, Map<wkh0.b, wkh0.c> map, v1b<? super dlh0> v1bVar) {
        super(2, v1bVar);
        this.b = wkh0Var;
        this.c = bVar;
        this.d = quwVar;
        this.e = set;
        this.f = map;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dlh0(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dlh0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wkh0 wkh0Var = this.b;
            or60 or60VarA = wkh0Var.a.k.a();
            wkh0.b bVar = this.c;
            yzh yzhVarA = bm50.a(r0i.f(or60VarA, new b(null, wkh0Var, bVar)));
            a aVar = new a(this.d, this.e, bVar, this.f);
            this.a = 1;
            if (yzhVarA.collect(aVar, this) == y5bVar) {
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
