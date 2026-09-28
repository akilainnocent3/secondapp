package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.e;

/* JADX INFO: loaded from: classes5.dex */
public final class ddo implements lyh<tco> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ com.sportybet.android.instantwin.presentation.bethistory2.c b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.bethistory2.InstantWinBetHistoryViewModel$special$$inlined$combine$1", f = "InstantWinBetHistoryViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return ddo.this.collect(null, this);
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

    @c0d(c = "com.sportybet.android.instantwin.presentation.bethistory2.InstantWinBetHistoryViewModel$special$$inlined$combine$1$3", f = "InstantWinBetHistoryViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super tco>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ com.sportybet.android.instantwin.presentation.bethistory2.c d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, com.sportybet.android.instantwin.presentation.bethistory2.c cVar) {
            super(3, v1bVar);
            this.d = cVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super tco> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            fqo fqoVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Object[] objArr = this.c;
                Object obj2 = objArr[0];
                obj2.getClass();
                fqo.c cVar = (fqo.c) obj2;
                Object obj3 = objArr[1];
                obj3.getClass();
                qcn<qco> qcnVar = (qcn) obj3;
                Object obj4 = objArr[2];
                obj4.getClass();
                pco pcoVar = (pco) obj4;
                Object obj5 = objArr[3];
                obj5.getClass();
                boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                e eVar = (e) objArr[4];
                Object obj6 = objArr[5];
                obj6.getClass();
                y9o y9oVar = (y9o) obj6;
                Object obj7 = objArr[6];
                obj7.getClass();
                lni0 lni0Var = (lni0) obj7;
                Object obj8 = objArr[7];
                obj8.getClass();
                lni0 lni0Var2 = (lni0) obj8;
                Object obj9 = objArr[8];
                obj9.getClass();
                zs zsVar = (zs) obj9;
                rco rcoVar = (rco) objArr[9];
                com.sportybet.android.instantwin.presentation.bethistory2.c cVar2 = this.d;
                if (cVar2.e.e()) {
                    fqo.a.C0579a c0579a = fqo.a.C0579a.a;
                    StringUiText stringUiText = vch0.a;
                    fqoVar = new fqo(R.color.bg_brand_main_primary, c0579a, new ResourceUiText(R.string.common_functions__bet_history), cVar);
                } else {
                    fqoVar = null;
                }
                tco tcoVar = new tco(fqoVar, cVar2.x1(qcnVar, pcoVar, zBooleanValue, eVar), y9oVar, lni0Var, lni0Var2, zsVar, rcoVar);
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(tcoVar, this) == y5bVar) {
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

    public ddo(lyh[] lyhVarArr, com.sportybet.android.instantwin.presentation.bethistory2.c cVar) {
        this.a = lyhVarArr;
        this.b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super tco> myhVar, v1b v1bVar) {
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
