package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class ivk implements lyh<Unit> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ kvk b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.gift.handler.giftselector.GiftSelectorStateHandlerImpl$init$$inlined$combine$1", f = "GiftSelectorStateHandlerImpl.kt", l = {109}, m = "collect", v = 2)
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
            return ivk.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Object[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            return new Object[5];
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.gift.handler.giftselector.GiftSelectorStateHandlerImpl$init$$inlined$combine$1$3", f = "GiftSelectorStateHandlerImpl.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super Unit>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ kvk d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, kvk kvkVar) {
            super(3, v1bVar);
            this.d = kvkVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super Unit> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Object[] objArr = this.c;
                Object obj2 = objArr[0];
                obj2.getClass();
                List list = (List) obj2;
                Object obj3 = objArr[1];
                obj3.getClass();
                List list2 = (List) obj3;
                Object obj4 = objArr[2];
                obj4.getClass();
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                Object obj5 = objArr[3];
                obj5.getClass();
                boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                Object obj6 = objArr[4];
                obj6.getClass();
                ipk ipkVar = (ipk) obj6;
                wwd0 wwd0Var = this.d.d;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, new ovk(zBooleanValue, a4h.b(list), a4h.b(list2), !zBooleanValue2, ipkVar)));
                Unit unit = Unit.a;
                this.b = null;
                this.c = null;
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

    public ivk(lyh[] lyhVarArr, kvk kvkVar) {
        this.a = lyhVarArr;
        this.b = kvkVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
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
            c cVar = new c(null, this.b);
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
