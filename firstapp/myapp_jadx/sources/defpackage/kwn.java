package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class kwn implements lyh<bwn> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ com.sportybet.android.instantwin.presentation.racingevent.b b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.InstantRacingEventViewModel$special$$inlined$combine$1", f = "InstantRacingEventViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return kwn.this.collect(null, this);
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

    @c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.InstantRacingEventViewModel$special$$inlined$combine$1$3", f = "InstantRacingEventViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super bwn>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ com.sportybet.android.instantwin.presentation.racingevent.b d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, com.sportybet.android.instantwin.presentation.racingevent.b bVar) {
            super(3, v1bVar);
            this.d = bVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super bwn> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            aun cVar;
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
                t3o t3oVar = (t3o) obj3;
                Object obj4 = objArr[2];
                obj4.getClass();
                int iIntValue = ((Integer) obj4).intValue();
                Object obj5 = objArr[3];
                obj5.getClass();
                u2o u2oVar = (u2o) obj5;
                Object obj6 = objArr[4];
                obj6.getClass();
                String str = (String) obj6;
                Object obj7 = objArr[5];
                obj7.getClass();
                qcn qcnVar = (qcn) obj7;
                Object obj8 = objArr[6];
                obj8.getClass();
                qcn qcnVar2 = (qcn) obj8;
                Object obj9 = objArr[7];
                obj9.getClass();
                hm3 hm3Var = (hm3) obj9;
                yc30 yc30Var = (yc30) objArr[8];
                cw3 cw3Var = (cw3) objArr[9];
                ysa ysaVar = (ysa) objArr[10];
                Object obj10 = objArr[11];
                obj10.getClass();
                lni0 lni0Var = (lni0) obj10;
                Object obj11 = objArr[12];
                obj11.getClass();
                zs zsVar = (zs) obj11;
                Object obj12 = objArr[13];
                obj12.getClass();
                zs zsVar2 = (zs) obj12;
                Object obj13 = objArr[14];
                obj13.getClass();
                zs zsVar3 = (zs) obj13;
                Object obj14 = objArr[15];
                obj14.getClass();
                zs zsVar4 = (zs) obj14;
                Object obj15 = objArr[16];
                obj15.getClass();
                boolean zBooleanValue = ((Boolean) obj15).booleanValue();
                Object obj16 = objArr[17];
                obj16.getClass();
                ink inkVar = (ink) obj16;
                fqo fqoVarY1 = this.d.y1((fqo.c) obj2);
                if (t3oVar instanceof t3o.b) {
                    cVar = aun.b.a;
                } else if (t3oVar instanceof t3o.a) {
                    cVar = aun.a.a;
                } else {
                    if (!(t3oVar instanceof t3o.c)) {
                        uhc.a();
                        return null;
                    }
                    cVar = new aun.c(new ztn(iIntValue, u2oVar, str, qcnVar, qcnVar2, hm3Var, yc30Var, cw3Var));
                }
                aun aunVar = cVar;
                if (!(t3oVar instanceof t3o.c)) {
                    inkVar = ink.b.a;
                }
                bwn bwnVar = new bwn(fqoVarY1, aunVar, ysaVar, lni0Var, zsVar, zsVar2, zsVar3, zsVar4, zBooleanValue, inkVar);
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(bwnVar, this) == y5bVar) {
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

    public kwn(lyh[] lyhVarArr, com.sportybet.android.instantwin.presentation.racingevent.b bVar) {
        this.a = lyhVarArr;
        this.b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super bwn> myhVar, v1b v1bVar) {
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
