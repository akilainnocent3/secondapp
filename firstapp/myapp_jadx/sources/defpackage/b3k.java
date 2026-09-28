package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sporty.android.core.model.pocket.globalpay.AvailableChannel;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.instantwin.newtork.model.error.ErrorCode;
import com.sportybet.android.kepay.withdraw.KeWithdrawActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class b3k implements gv5 {
    public final Object a;
    public final Object b;

    public b3k(psm psmVar, sr10 sr10Var) {
        psmVar.getClass();
        sr10Var.getClass();
        this.a = psmVar;
        this.b = sr10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object a(f600 f600Var, x1b x1bVar) {
        a3k a3kVar;
        psm psmVar = (psm) this.a;
        if (x1bVar instanceof a3k) {
            a3kVar = (a3k) x1bVar;
            int i = a3kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a3kVar.c = i - Integer.MIN_VALUE;
            } else {
                a3kVar = new a3k(this, x1bVar);
            }
        } else {
            a3kVar = new a3k(this, x1bVar);
        }
        Object objP = a3kVar.a;
        y5b y5bVar = y5b.a;
        int i2 = a3kVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objP);
                zi50.a aVar = zi50.b;
                sr10 sr10Var = (sr10) this.b;
                String strF = psmVar.f();
                CountryCodeName countryCode = psmVar.getCountryCode();
                String str = f600Var.a;
                a3kVar.c = 1;
                objP = sr10Var.P(strF, countryCode, str, a3kVar);
                if (objP == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objP);
            }
            AvailableChannel availableChannelB = fdv.b((AvailableChannel) objP);
            zi50.a aVar2 = zi50.b;
            return availableChannelB;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    @Override // defpackage.gv5
    public void onFailure(su5 su5Var, Throwable th) {
        KeWithdrawActivity keWithdrawActivity = (KeWithdrawActivity) this.b;
        if (keWithdrawActivity.isFinishing() || su5Var.isCanceled()) {
            return;
        }
        int i = KeWithdrawActivity.Z;
        keWithdrawActivity.z1(0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gv5
    public void onResponse(su5 su5Var, bi50 bi50Var) {
        KeWithdrawActivity keWithdrawActivity = (KeWithdrawActivity) this.b;
        if (keWithdrawActivity.isFinishing() || su5Var.isCanceled()) {
            return;
        }
        BaseResponse baseResponse = (BaseResponse) bi50Var.b;
        if (!bi50Var.a.getIsSuccessful() || baseResponse == null || !baseResponse.hasData()) {
            int i = KeWithdrawActivity.Z;
            keWithdrawActivity.z1(ErrorCode.FAIL, null);
            return;
        }
        int i2 = ((BankTradeData) baseResponse.data).status;
        if (i2 == 10) {
            int i3 = KeWithdrawActivity.Z;
            keWithdrawActivity.z1(0, null);
        } else if (i2 == 20) {
            keWithdrawActivity.E.dismiss();
            keWithdrawActivity.A1((String) this.a);
        } else {
            String str = baseResponse.message;
            int i4 = KeWithdrawActivity.Z;
            keWithdrawActivity.z1(ErrorCode.FAIL, str);
        }
    }

    public b3k(KeWithdrawActivity keWithdrawActivity, String str) {
        this.b = keWithdrawActivity;
        this.a = str;
    }
}
