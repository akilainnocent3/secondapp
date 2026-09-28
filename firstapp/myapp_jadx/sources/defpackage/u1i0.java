package defpackage;

import com.sporty.android.core.model.security.sportypin.SportyPinStatus;
import com.sporty.android.core.model.security.sportypin.SportyPinUsage;
import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class u1i0 {
    public final lyz a;

    public u1i0(lyz lyzVar) {
        lyzVar.getClass();
        this.a = lyzVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(boolean z, lv20 lv20Var, x1b x1bVar) throws Throwable {
        t1i0 t1i0Var;
        Function1 function1;
        WithdrawalPinStatusInfo withdrawalPinStatusInfo;
        if (x1bVar instanceof t1i0) {
            t1i0Var = (t1i0) x1bVar;
            int i = t1i0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                t1i0Var.e = i - Integer.MIN_VALUE;
            } else {
                t1i0Var = new t1i0(this, x1bVar);
            }
        } else {
            t1i0Var = new t1i0(this, x1bVar);
        }
        Object objP = t1i0Var.c;
        y5b y5bVar = y5b.a;
        int i2 = t1i0Var.e;
        if (i2 == 0) {
            uj50.b(objP);
            lyh<lk50<WithdrawalPinStatusInfo>> lyhVarI0 = this.a.i0(new pu0.a(0));
            t1i0Var.b = lv20Var;
            t1i0Var.a = z;
            t1i0Var.e = 1;
            objP = bm50.p(lyhVarI0, t1i0Var);
            if (objP != y5bVar) {
            }
            function1 = lv20Var;
            return y5bVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objP);
                return objP;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = t1i0Var.a;
        Function1 function2 = t1i0Var.b;
        uj50.b(objP);
        function1 = function2;
        function1 = lv20Var;
        lk50 lk50Var = (lk50) objP;
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        if (cVar == null || (withdrawalPinStatusInfo = (WithdrawalPinStatusInfo) cVar.a) == null) {
            return v1i0.b.a;
        }
        if ((withdrawalPinStatusInfo.getSportyPinStatus() != SportyPinStatus.Enabled || withdrawalPinStatusInfo.getUsage() != SportyPinUsage.SELECT_NEW_ACCOUNT.getUsageCode() || !z) && withdrawalPinStatusInfo.getSportyPinUsage() != SportyPinUsage.SELECT_EVERY_WITHDRAW && withdrawalPinStatusInfo.getSportyPinStatus() != SportyPinStatus.Blocked) {
            return v1i0.e.a;
        }
        t1i0Var.b = function1;
        t1i0Var.a = z;
        t1i0Var.e = 2;
        bc6 bc6Var = new bc6(1, yzo.b(t1i0Var));
        bc6Var.q();
        function1.invoke(new m480.k(new s8d0.c(withdrawalPinStatusInfo), bc6Var));
        Object objO = bc6Var.o();
        if (objO != y5bVar) {
            return objO;
        }
        function1 = lv20Var;
        return y5bVar;
    }
}
