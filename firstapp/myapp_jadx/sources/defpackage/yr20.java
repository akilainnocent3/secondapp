package defpackage;

import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.primaryphone.instructions.PrimaryPhoneInstructionsViewModel$fetchWithdrawPinStatus$1", f = "PrimaryPhoneInstructionsViewModel.kt", l = {53}, m = "invokeSuspend", v = 2)
public final class yr20 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zr20 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ zr20 a;

        public a(zr20 zr20Var) {
            this.a = zr20Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            Object value2;
            Object value3;
            WithdrawalPinStatusInfo withdrawalPinStatusInfo;
            lk50 lk50Var = (lk50) obj;
            boolean z = lk50Var instanceof lk50.c;
            zr20 zr20Var = this.a;
            if (z) {
                wwd0 wwd0Var = zr20Var.b;
                do {
                    value3 = wwd0Var.getValue();
                    withdrawalPinStatusInfo = (WithdrawalPinStatusInfo) ((lk50.c) lk50Var).a;
                } while (!wwd0Var.g(value3, gso.a((gso) value3, withdrawalPinStatusInfo.getStatus(), false, false, 3)));
                return zr20Var.e.emit(withdrawalPinStatusInfo.getStatus(), v1bVar);
            }
            if (lk50Var instanceof lk50.a) {
                wwd0 wwd0Var2 = zr20Var.b;
                do {
                    value2 = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value2, gso.a((gso) value2, null, true, false, 7)));
            } else {
                wwd0 wwd0Var3 = zr20Var.b;
                do {
                    value = wwd0Var3.getValue();
                } while (!wwd0Var3.g(value, gso.a((gso) value, null, false, true, 15)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr20(zr20 zr20Var, v1b<? super yr20> v1bVar) {
        super(2, v1bVar);
        this.b = zr20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yr20(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yr20) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            zr20 zr20Var = this.b;
            yzh yzhVarB = bm50.b(zr20Var.a.B0(), vch0.b);
            a aVar = new a(zr20Var);
            this.a = 1;
            if (yzhVarB.collect(aVar, this) == y5bVar) {
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
