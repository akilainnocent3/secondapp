package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.withdraw.momo.CommonWithdrawConfirmViewModel$retryBankTrade$1", f = "CommonWithdrawConfirmViewModel.kt", l = {251}, m = "invokeSuspend", v = 2)
public final class dl8 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ el8 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl8(el8 el8Var, String str, v1b<? super dl8> v1bVar) {
        super(2, v1bVar);
        this.c = el8Var;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dl8 dl8Var = new dl8(this.c, this.d, v1bVar);
        dl8Var.b = obj;
        return dl8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dl8) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.b = v5bVar;
            this.a = 1;
            if (hkd.b(2000L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        final el8 el8Var = this.c;
        ha00 ha00Var = el8Var.a;
        final String str = this.d;
        ha00Var.a(v5bVar, str, new Function1() { // from class: cl8
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                el8 el8Var2 = el8Var;
                ssw<vhg<unj0>> sswVar = el8Var2.F;
                ssw<Boolean> sswVar2 = el8Var2.B;
                lk50 lk50Var = (lk50) obj2;
                boolean z = lk50Var instanceof lk50.c;
                unj0.g gVar = unj0.g.b;
                if (z) {
                    BaseResponse baseResponse = (BaseResponse) ((lk50.c) lk50Var).a;
                    sswVar2.m(Boolean.FALSE);
                    if (baseResponse.hasData()) {
                        T t = baseResponse.data;
                        t.getClass();
                        int i2 = ((BankTradeData) t).status;
                        if (i2 == 10) {
                            String str2 = baseResponse.message;
                            sswVar.m(new vhg<>(new unj0.m(str2 != null ? str2 : "")));
                        } else if (i2 != 20) {
                            String str3 = baseResponse.message;
                            if (i2 != 30) {
                                sswVar.m(new vhg<>(new unj0.h(str3 != null ? str3 : "")));
                            } else {
                                sswVar.m(new vhg<>(new unj0.i(str3 != null ? str3 : "")));
                            }
                        } else {
                            BigDecimal bigDecimal = el8Var2.b;
                            if (bigDecimal == null) {
                                Intrinsics.n("amount");
                                throw null;
                            }
                            BigDecimal bigDecimalB = p54.b(bigDecimal);
                            String str4 = el8Var2.c;
                            if (str4 == null) {
                                Intrinsics.n("withdrawTo");
                                throw null;
                            }
                            String strD = el8Var2.i.d();
                            strD.getClass();
                            sswVar.m(new vhg<>(new unj0.n(bigDecimalB, str4, strD, str, 2)));
                        }
                    } else {
                        sswVar.m(new vhg<>(gVar));
                    }
                } else if (lk50Var instanceof lk50.a) {
                    sswVar2.m(Boolean.FALSE);
                    sswVar.m(new vhg<>(gVar));
                } else if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
            }
        });
        return Unit.a;
    }
}
