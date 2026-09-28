package defpackage;

import com.sportybet.android.instantwin.presentation.footballfamilysettlement.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.footballfamilysettlement.FootballFamilySettlementViewModel$startEventScoreSimulation$3", f = "FootballFamilySettlementViewModel.kt", l = {263}, m = "invokeSuspend", v = 2)
public final class bgi extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c b;

    public static final class a<T> implements myh {
        public final /* synthetic */ c a;

        /* JADX INFO: renamed from: bgi$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.instantwin.presentation.footballfamilysettlement.FootballFamilySettlementViewModel$startEventScoreSimulation$3$2", f = "FootballFamilySettlementViewModel.kt", l = {524}, m = "emit", v = 2)
        public static final class C0124a extends x1b {
            public fci a;
            public tuw b;
            public c c;
            public /* synthetic */ Object d;
            public final /* synthetic */ a<T> e;
            public int f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0124a(a<? super T> aVar, v1b<? super C0124a> v1bVar) {
                super(v1bVar);
                this.e = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.d = obj;
                this.f |= Integer.MIN_VALUE;
                return this.e.emit(null, this);
            }
        }

        public a(c cVar) {
            this.a = cVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(fci fciVar, v1b<? super Unit> v1bVar) {
            C0124a c0124a;
            c cVar;
            fci fciVar2;
            tuw tuwVar;
            Object value;
            ArrayList arrayList;
            if (v1bVar instanceof C0124a) {
                c0124a = (C0124a) v1bVar;
                int i = c0124a.f;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0124a.f = i - Integer.MIN_VALUE;
                } else {
                    c0124a = new C0124a(this, v1bVar);
                }
            } else {
                c0124a = new C0124a(this, v1bVar);
            }
            Object obj = c0124a.d;
            y5b y5bVar = y5b.a;
            int i2 = c0124a.f;
            if (i2 == 0) {
                uj50.b(obj);
                cVar = this.a;
                tuw tuwVar2 = cVar.C;
                c0124a.a = fciVar;
                c0124a.b = tuwVar2;
                c0124a.c = cVar;
                c0124a.f = 1;
                if (tuwVar2.d(c0124a) == y5bVar) {
                    return y5bVar;
                }
                fciVar2 = fciVar;
                tuwVar = tuwVar2;
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = c0124a.c;
                tuwVar = c0124a.b;
                fciVar2 = c0124a.a;
                uj50.b(obj);
            }
            try {
                wwd0 wwd0Var = cVar.A;
                do {
                    value = wwd0Var.getValue();
                    arrayList = new ArrayList();
                    for (T t : (List) value) {
                        if (!((fci) t).a.equals(fciVar2.a)) {
                            arrayList.add(t);
                        }
                    }
                } while (!wwd0Var.g(value, CollectionsKt.j0(arrayList, fciVar2)));
                Unit unit = Unit.a;
                return Unit.a;
            } finally {
                tuwVar.f(null);
            }
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.footballfamilysettlement.FootballFamilySettlementViewModel$startEventScoreSimulation$3$invokeSuspend$$inlined$flatMapLatest$1", f = "FootballFamilySettlementViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<myh<? super fci>, nbi, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ c d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, c cVar) {
            super(3, v1bVar);
            this.d = cVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super fci> myhVar, nbi nbiVar, v1b<? super Unit> v1bVar) {
            b bVar = new b(v1bVar, this.d);
            bVar.b = myhVar;
            bVar.c = nbiVar;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar;
            lyh lyhVarC;
            float f;
            int i;
            long j;
            pbi pbiVar;
            y5b y5bVar = y5b.a;
            int i2 = this.a;
            if (i2 == 0) {
                uj50.b(obj);
                myh myhVar2 = this.b;
                nbi nbiVar = (nbi) this.c;
                if (nbiVar instanceof nbi.a) {
                    c cVar = this.d;
                    List<tci> listC = cVar.I.c();
                    zta0.a aVar = ((nbi.a) nbiVar).a;
                    if (Intrinsics.g(aVar, zta0.a.C1422a.a)) {
                        f = 1.0f;
                    } else {
                        if (!Intrinsics.g(aVar, zta0.a.b.a)) {
                            uhc.a();
                            return null;
                        }
                        f = 0.5f;
                    }
                    long j2 = (long) (12159.0f * f);
                    long j3 = (2 * j2) + 5835;
                    long j4 = (long) (1000.0f * f);
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = listC.iterator();
                    while (true) {
                        i = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        tci tciVar = (tci) it.next();
                        List listF0 = StringsKt.f0(tciVar.b, new char[]{'H'});
                        if (listF0.size() != 2) {
                            j = j4;
                            pbiVar = null;
                        } else {
                            j = j4;
                            Pair pairX1 = c.x1(1945L, (1945 + j2) - j4, j, j6f0.a((String) listF0.get(0)));
                            Pair pairX2 = c.x1(3890 + j2, j3 - j, j, j6f0.a((String) listF0.get(1)));
                            pbiVar = new pbi(tciVar.a, j3, CollectionsKt.i0((Iterable) pairX2.a, (Collection) pairX1.a), CollectionsKt.i0((Iterable) pairX2.b, (Collection) pairX1.b));
                        }
                        if (pbiVar != null) {
                            arrayList.add(pbiVar);
                        }
                        j4 = j;
                    }
                    ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        arrayList2.add(uzh.b(new or60(new wfi((pbi) obj2, cVar, null))));
                    }
                    lyhVarC = r0i.c(new ezh(arrayList2), r0i.a);
                    myhVar = null;
                } else {
                    myhVar = null;
                    lyhVarC = i2g.a;
                }
                this.b = myhVar;
                this.c = myhVar;
                this.a = 1;
                if (kzh.c(myhVar2, lyhVarC, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgi(v1b v1bVar, c cVar) {
        super(2, v1bVar);
        this.b = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bgi(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bgi) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            c cVar = this.b;
            b77 b77VarF = r0i.f(cVar.i, new b(null, cVar));
            a aVar = new a(cVar);
            this.a = 1;
            if (b77VarF.collect(aVar, this) == y5bVar) {
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
