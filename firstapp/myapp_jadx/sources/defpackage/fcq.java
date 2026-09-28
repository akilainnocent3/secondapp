package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class fcq implements lyh<uf00<? extends String>> {
    public final /* synthetic */ b77 a;

    @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGetFavoriteLotteryIdUseCase$invoke$$inlined$map$1", f = "LNGetFavoriteLotteryIdUseCase.kt", l = {109}, m = "collect", v = 2)
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
            return fcq.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGetFavoriteLotteryIdUseCase$invoke$$inlined$map$1$2", f = "LNGetFavoriteLotteryIdUseCase.kt", l = {50}, m = "emit", v = 2)
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
                qcn qcnVar = (qcn) obj;
                qcnVar.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : qcnVar) {
                    if (obj3 instanceof g7q.a) {
                        arrayList.add(obj3);
                    }
                }
                List listR0 = CollectionsKt.r0(arrayList, new h7q());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : qcnVar) {
                    if (obj4 instanceof g7q.b) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayListI0 = CollectionsKt.i0(listR0, CollectionsKt.r0(arrayList2, new i7q()));
                ArrayList arrayList3 = new ArrayList(l48.r(arrayListI0, 10));
                int size = arrayListI0.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj5 = arrayListI0.get(i3);
                    i3++;
                    arrayList3.add(((g7q) obj5).a());
                }
                uf00 uf00VarF = a4h.f(arrayList3);
                aVar.b = 1;
                if (this.a.emit(uf00VarF, aVar) == y5bVar) {
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

    public fcq(b77 b77Var) {
        this.a = b77Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super uf00<? extends String>> myhVar, v1b v1bVar) {
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
