package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class h070 implements lyh<cw3> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ q070 b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballBetslipHandlerImpl$init$$inlined$combine$1", f = "ScheduledFootballBetslipHandlerImpl.kt", l = {109}, m = "collect", v = 2)
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
            return h070.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Object[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            return new Object[8];
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballBetslipHandlerImpl$init$$inlined$combine$1$3", f = "ScheduledFootballBetslipHandlerImpl.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super cw3>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ q070 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, q070 q070Var) {
            super(3, v1bVar);
            this.d = q070Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super cw3> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x005b  */
        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object[], myh] */
        /* JADX WARN: Type inference failed for: r15v4 */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            uf00 uf00VarA;
            cw3 cw3Var;
            ?? r15;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Object[] objArr = this.c;
                Object obj2 = objArr[0];
                obj2.getClass();
                lni0 lni0Var = (lni0) obj2;
                Object obj3 = objArr[1];
                obj3.getClass();
                AssetsInfo assetsInfo = (AssetsInfo) obj3;
                Object obj4 = objArr[2];
                obj4.getClass();
                List list = (List) obj4;
                Object obj5 = objArr[3];
                obj5.getClass();
                ft90 ft90Var = (ft90) obj5;
                Object obj6 = objArr[4];
                obj6.getClass();
                nmw nmwVar = (nmw) obj6;
                Object obj7 = objArr[5];
                obj7.getClass();
                bz3 bz3Var = (bz3) obj7;
                km3 km3Var = (km3) objArr[6];
                km3 km3Var2 = (km3) objArr[7];
                if (lni0Var != lni0.a) {
                    int iOrdinal = bz3Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            km3Var = km3Var2;
                        } else {
                            if (iOrdinal != 2) {
                                uhc.a();
                                return null;
                            }
                            km3Var = null;
                        }
                    }
                    if (km3Var == null) {
                        cw3Var = null;
                        r15 = 0;
                    } else {
                        int size = list.size();
                        Object[] objArr2 = {this.d.b.B(), bjb0.U(assetsInfo.balance, Locale.US)};
                        StringUiText stringUiText = vch0.a;
                        zp3 zp3Var = new zp3(size, new ResourceUiText(R.string.app_common__var_var, ay0.S(objArr2)));
                        if (list.size() <= 1) {
                            uf00VarA = null;
                        } else {
                            bz3 bz3Var2 = bz3.SINGLE;
                            hw3 hw3Var = new hw3(bz3Var2, new ResourceUiText(R.string.component_betslip__singles), ft90Var.c, bz3Var == bz3Var2);
                            bz3 bz3Var3 = bz3.MULTIPLE;
                            uf00VarA = a4h.a(hw3Var, new hw3(bz3Var3, new ResourceUiText(R.string.component_betslip__multiple), nmwVar.d, bz3Var == bz3Var3));
                        }
                        cw3Var = new cw3(zp3Var, uf00VarA, km3Var);
                        r15 = 0;
                    }
                } else {
                    cw3Var = null;
                    r15 = 0;
                }
                this.b = r15;
                this.c = r15;
                this.a = 1;
                if (myhVar.emit(cw3Var, this) == y5bVar) {
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

    public h070(lyh[] lyhVarArr, q070 q070Var) {
        this.a = lyhVarArr;
        this.b = q070Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super cw3> myhVar, v1b v1bVar) {
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
