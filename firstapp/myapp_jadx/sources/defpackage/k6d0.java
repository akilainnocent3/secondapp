package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.penalty.d;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class k6d0 implements lyh<b6d0> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ d b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.penalty.SportyPenaltyViewModel$special$$inlined$combine$1", f = "SportyPenaltyViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return k6d0.this.collect(null, this);
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

    @c0d(c = "com.sportybet.android.instantwin.presentation.penalty.SportyPenaltyViewModel$special$$inlined$combine$1$3", f = "SportyPenaltyViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super b6d0>, Object[], v1b<? super Unit>, Object> {
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
        public final Object invoke(myh<? super b6d0> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ResourceUiText resourceUiText;
            gwc0 cVar;
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
                q1d0 q1d0Var = (q1d0) obj3;
                f5d0 f5d0Var = (f5d0) objArr[2];
                Object obj4 = objArr[3];
                obj4.getClass();
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                viy viyVar = (viy) objArr[4];
                Object obj5 = objArr[5];
                obj5.getClass();
                String str = (String) obj5;
                Object obj6 = objArr[6];
                obj6.getClass();
                qcn qcnVar = (qcn) obj6;
                Object obj7 = objArr[7];
                obj7.getClass();
                qcn qcnVar2 = (qcn) obj7;
                ufo ufoVar = (ufo) objArr[8];
                Object obj8 = objArr[9];
                obj8.getClass();
                hm3 hm3Var = (hm3) obj8;
                yc30 yc30Var = (yc30) objArr[10];
                cw3 cw3Var = (cw3) objArr[11];
                ysa ysaVar = (ysa) objArr[12];
                Object obj9 = objArr[13];
                obj9.getClass();
                lni0 lni0Var = (lni0) obj9;
                Object obj10 = objArr[14];
                obj10.getClass();
                zs zsVar = (zs) obj10;
                Object obj11 = objArr[15];
                obj11.getClass();
                zs zsVar2 = (zs) obj11;
                Object obj12 = objArr[16];
                obj12.getClass();
                zs zsVar3 = (zs) obj12;
                Object obj13 = objArr[17];
                obj13.getClass();
                zs zsVar4 = (zs) obj13;
                Object obj14 = objArr[18];
                obj14.getClass();
                boolean zBooleanValue2 = ((Boolean) obj14).booleanValue();
                Object obj15 = objArr[19];
                obj15.getClass();
                ink inkVar = (ink) obj15;
                fqo.a.C0579a c0579a = fqo.a.C0579a.a;
                d dVar = this.d;
                Integer numC = dVar.c.c(dVar.y1());
                if (numC != null) {
                    int iIntValue = numC.intValue();
                    StringUiText stringUiText = vch0.a;
                    resourceUiText = new ResourceUiText(iIntValue);
                } else {
                    resourceUiText = null;
                }
                fqo fqoVar = new fqo(R.color.bg_brand_main_primary, c0579a, resourceUiText, cVar2);
                if (q1d0Var instanceof q1d0.b) {
                    cVar = gwc0.b.a;
                } else if (q1d0Var instanceof q1d0.a) {
                    cVar = gwc0.a.a;
                } else {
                    if (!(q1d0Var instanceof q1d0.c)) {
                        uhc.a();
                        return null;
                    }
                    lwc0 lwc0Var = (lwc0) CollectionsKt.firstOrNull(((q1d0.c) q1d0Var).a.d);
                    String str2 = lwc0Var != null ? lwc0Var.b.a : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = lwc0Var != null ? lwc0Var.b.b : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = lwc0Var != null ? lwc0Var.c.a : null;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = lwc0Var != null ? lwc0Var.c.b : null;
                    cVar = new gwc0.c(new fwc0(new l5d0(str2, str3, str4, str5 != null ? str5 : ""), f5d0Var, zBooleanValue, viyVar, str, qcnVar, qcnVar2, hm3Var, yc30Var, cw3Var));
                }
                b6d0 b6d0Var = new b6d0(fqoVar, cVar, ufoVar, ysaVar, lni0Var, zsVar, zsVar2, zsVar3, zsVar4, zBooleanValue2, inkVar);
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(b6d0Var, this) == y5bVar) {
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

    public k6d0(lyh[] lyhVarArr, d dVar) {
        this.a = lyhVarArr;
        this.b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super b6d0> myhVar, v1b v1bVar) {
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
