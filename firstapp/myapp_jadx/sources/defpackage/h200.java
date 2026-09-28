package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes6.dex */
public final class h200 implements lyh<HashMap<String, Integer>> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ List b;

    @c0d(c = "com.sportybet.feature.payment.impl.common.data.repository.PayConfigRepositoryImpl$getTradeLocalFlow$$inlined$combine$1", f = "PayConfigRepositoryImpl.kt", l = {109}, m = "collect", v = 2)
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
            return h200.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Integer[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer[] invoke() {
            return new Integer[this.a.length];
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.common.data.repository.PayConfigRepositoryImpl$getTradeLocalFlow$$inlined$combine$1$3", f = "PayConfigRepositoryImpl.kt", l = {288}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super HashMap<String, Integer>>, Integer[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ List d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, v1b v1bVar) {
            super(3, v1bVar);
            this.d = list;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super HashMap<String, Integer>> myhVar, Integer[] numArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(this.d, v1bVar);
            cVar.b = myhVar;
            cVar.c = numArr;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Integer[] numArr = (Integer[]) this.c;
                HashMap map = new HashMap();
                numArr.getClass();
                Iterator<Integer> it = new IntRange(0, ay0.A(numArr), 1).iterator();
                while (((mwo) it).c) {
                    int iNextInt = ((zvo) it).nextInt();
                    map.put(this.d.get(iNextInt), numArr[iNextInt]);
                }
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(map, this) == y5bVar) {
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

    public h200(lyh[] lyhVarArr, List list) {
        this.a = lyhVarArr;
        this.b = list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super HashMap<String, Integer>> myhVar, v1b v1bVar) {
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
            lyh[] lyhVarArr = this.a;
            b bVar = new b(lyhVarArr);
            c cVar = new c(this.b, null);
            aVar.b = 1;
            if (r78.a(aVar, myhVar, cVar, bVar, lyhVarArr) == y5bVar) {
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
