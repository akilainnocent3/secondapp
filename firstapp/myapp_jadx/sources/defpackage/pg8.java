package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.withdraw.momo.CommonMobileMoneyWithdrawViewModel$refreshAssetsInfo$1", f = "CommonMobileMoneyWithdrawViewModel.kt", l = {291}, m = "invokeSuspend", v = 2)
public final class pg8 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qg8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg8(qg8 qg8Var, v1b<? super pg8> v1bVar) {
        super(2, v1bVar);
        this.b = qg8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pg8(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pg8) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        i41 eVar;
        qg8 qg8Var = this.b;
        ssw<xu1> sswVar = qg8Var.P;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            sswVar.m(xu1.c);
            uy0 uy0Var = qg8Var.c;
            this.a = 1;
            obj = uy0Var.f(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ng50 ng50Var = (ng50) obj;
        if (ng50Var instanceof ng50.b) {
            AssetsInfo assetsInfo = (AssetsInfo) ((ng50.b) ng50Var).a;
            if (assetsInfo != null) {
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(assetsInfo.balance);
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(10000L);
                bigDecimalValueOf2.getClass();
                ssw<ct.a> sswVar2 = qg8Var.X;
                BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimalValueOf2);
                String strU = bjb0.U(assetsInfo.balance, Locale.US);
                bigDecimalDivide.getClass();
                sswVar.m(new xu1(bigDecimalDivide, strU));
                int i2 = assetsInfo.auditStatus;
                if (i2 != 0) {
                    switch (i2) {
                        case 11:
                            eVar = i41.a.a;
                            break;
                        case 12:
                            eVar = i41.c.a;
                            break;
                        case 13:
                            eVar = i41.b.a;
                            break;
                        default:
                            eVar = new i41.e();
                            break;
                    }
                } else {
                    eVar = i41.d.a;
                }
                qg8Var.f0 = eVar;
                boolean z = assetsInfo.skipAuditPopup;
                if (Intrinsics.g(eVar, i41.d.a)) {
                    sswVar2.m(null);
                } else if (Intrinsics.g(eVar, i41.a.a)) {
                    if (z) {
                        sswVar2.m(null);
                    } else {
                        sswVar2.m(new ct.a(m7l.a.a));
                    }
                } else if (Intrinsics.g(eVar, i41.c.a)) {
                    if (z) {
                        sswVar2.m(null);
                    } else {
                        sswVar2.m(new ct.a(m7l.i.a));
                    }
                } else if (!Intrinsics.g(eVar, i41.b.a)) {
                    sswVar2.m(new ct.a(m7l.c.a));
                } else if (z) {
                    sswVar2.m(null);
                } else {
                    sswVar2.m(new ct.a(m7l.h.a));
                }
            }
        } else {
            if (!(ng50Var instanceof ng50.a)) {
                uhc.a();
                return null;
            }
            sswVar.m(xu1.c);
        }
        return Unit.a;
    }
}
