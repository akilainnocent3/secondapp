package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class c4x implements lyh<Map<f4x, ? extends Boolean>> {
    public final /* synthetic */ lyh[] a;

    @c0d(c = "com.sportybet.feature.notificationcenter.viewmodel.NCTabViewModel$special$$inlined$combine$1", f = "NCTabViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return c4x.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Boolean[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean[] invoke() {
            return new Boolean[this.a.length];
        }
    }

    @c0d(c = "com.sportybet.feature.notificationcenter.viewmodel.NCTabViewModel$special$$inlined$combine$1$3", f = "NCTabViewModel.kt", l = {288}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super Map<f4x, ? extends Boolean>>, Boolean[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super Map<f4x, ? extends Boolean>> myhVar, Boolean[] boolArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(3, v1bVar);
            cVar.b = myhVar;
            cVar.c = boolArr;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Boolean[] boolArr = (Boolean[]) this.c;
                uag uagVar = f4x.w;
                uagVar.getClass();
                boolArr.getClass();
                int length = boolArr.length;
                ArrayList arrayList = new ArrayList(Math.min(l48.r(uagVar, 10), length));
                q3.b bVar = new q3.b();
                int i2 = 0;
                while (bVar.hasNext()) {
                    Object next = bVar.next();
                    if (i2 >= length) {
                        break;
                    }
                    arrayList.add(new Pair(next, boolArr[i2]));
                    i2++;
                }
                Map mapK = kpu.k(arrayList);
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(mapK, this) == y5bVar) {
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

    public c4x(lyh[] lyhVarArr) {
        this.a = lyhVarArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Map<f4x, ? extends Boolean>> myhVar, v1b v1bVar) {
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
            c cVar = new c(3, null);
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
