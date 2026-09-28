package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.scheduledfootball.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class fm70 implements lyh<zk70> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ d b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.ScheduledFootballViewModel$special$$inlined$combine$1", f = "ScheduledFootballViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return fm70.this.collect(null, this);
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

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.ScheduledFootballViewModel$special$$inlined$combine$1$3", f = "ScheduledFootballViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super zk70>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ d d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, d dVar) {
            super(3, v1bVar);
            this.d = dVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super zk70> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0148 A[RETURN] */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ResourceUiText resourceUiText;
            i370 cVar;
            i370 i370Var;
            zk70 zk70Var;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Object[] objArr = this.c;
                Object obj2 = objArr[0];
                obj2.getClass();
                fqo.c cVar2 = (fqo.c) obj2;
                Object obj3 = objArr[1];
                obj3.getClass();
                rj70 rj70Var = (rj70) obj3;
                Object obj4 = objArr[2];
                obj4.getClass();
                qcn qcnVar = (qcn) obj4;
                Object obj5 = objArr[3];
                obj5.getClass();
                zs zsVar = (zs) obj5;
                Object obj6 = objArr[4];
                obj6.getClass();
                qcn qcnVar2 = (qcn) obj6;
                Object obj7 = objArr[5];
                obj7.getClass();
                String str = (String) obj7;
                kd70 kd70Var = (kd70) objArr[6];
                qcn qcnVar3 = (qcn) objArr[7];
                ufo ufoVar = (ufo) objArr[8];
                al70 al70Var = (al70) objArr[9];
                String str2 = (String) objArr[10];
                Object obj8 = objArr[11];
                obj8.getClass();
                hm3 hm3Var = (hm3) obj8;
                yc30 yc30Var = (yc30) objArr[12];
                ysa ysaVar = (ysa) objArr[13];
                cw3 cw3Var = (cw3) objArr[14];
                Object obj9 = objArr[15];
                obj9.getClass();
                zs zsVar2 = (zs) obj9;
                Object obj10 = objArr[16];
                obj10.getClass();
                zs zsVar3 = (zs) obj10;
                Object obj11 = objArr[17];
                obj11.getClass();
                lni0 lni0Var = (lni0) obj11;
                Object obj12 = objArr[18];
                obj12.getClass();
                lni0 lni0Var2 = (lni0) obj12;
                Object obj13 = objArr[19];
                obj13.getClass();
                zs zsVar4 = (zs) obj13;
                xro xroVar = (xro) objArr[20];
                fqo.a.C0579a c0579a = fqo.a.C0579a.a;
                d dVar = this.d;
                Integer numC = dVar.b.c(dVar.y1());
                if (numC != null) {
                    int iIntValue = numC.intValue();
                    StringUiText stringUiText = vch0.a;
                    resourceUiText = new ResourceUiText(iIntValue);
                } else {
                    resourceUiText = null;
                }
                fqo fqoVar = new fqo(R.color.bg_brand_main_primary, c0579a, resourceUiText, cVar2);
                if (rj70Var instanceof rj70.b) {
                    i370Var = i370.b.a;
                } else {
                    if (rj70Var instanceof rj70.a) {
                        i370Var = i370.a.a;
                    } else {
                        if (!(rj70Var instanceof rj70.c)) {
                            uhc.a();
                            return null;
                        }
                        cVar = new i370.c(new h370(qcnVar, qcnVar2, str, ((rj70.c) rj70Var).a.a.h, qcnVar3, str2, hm3Var, yc30Var, cw3Var, lni0Var2));
                    }
                    zk70Var = new zk70(fqoVar, cVar, zsVar, kd70Var, ufoVar, al70Var, ysaVar, lni0Var, zsVar4, zsVar2, zsVar3, xroVar);
                    this.b = null;
                    this.c = null;
                    this.a = 1;
                    if (myhVar.emit(zk70Var, this) == y5bVar) {
                        return y5bVar;
                    }
                }
                cVar = i370Var;
                zk70Var = new zk70(fqoVar, cVar, zsVar, kd70Var, ufoVar, al70Var, ysaVar, lni0Var, zsVar4, zsVar2, zsVar3, xroVar);
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(zk70Var, this) == y5bVar) {
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

    public fm70(lyh[] lyhVarArr, d dVar) {
        this.a = lyhVarArr;
        this.b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super zk70> myhVar, v1b v1bVar) {
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
