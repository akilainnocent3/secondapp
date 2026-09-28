package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class kud implements lyh<Boolean> {
    public final /* synthetic */ lyh[] a;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$special$$inlined$combine$1", f = "DepositCardViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return kud.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Object[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            return new Object[this.a.length];
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$special$$inlined$combine$1$3", f = "DepositCardViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super Boolean>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super Boolean> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(3, v1bVar);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Object[] objArr = this.c;
                Object obj2 = objArr[0];
                obj2.getClass();
                Object obj3 = objArr[1];
                obj3.getClass();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Object obj4 = objArr[2];
                obj4.getClass();
                yyx yyxVar = (yyx) obj4;
                Object obj5 = objArr[3];
                obj5.getClass();
                boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                String str = (String) objArr[4];
                Object obj6 = objArr[5];
                obj6.getClass();
                lod lodVar = (lod) obj6;
                Object obj7 = objArr[6];
                obj7.getClass();
                Boolean bool = (((zyx) obj2).c.length() == 0 || zBooleanValue || yyxVar.a.length() == 0 || zBooleanValue2 || str == null || str.length() != 3 || !lodVar.equals(lod.e.a) || ((ncx) obj7).b) ? Boolean.FALSE : Boolean.TRUE;
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(bool, this) == y5bVar) {
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

    public kud(lyh[] lyhVarArr) {
        this.a = lyhVarArr;
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
