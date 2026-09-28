package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.service.CountryCodeName;

/* JADX INFO: loaded from: classes6.dex */
public final class ku0 implements iu0 {
    public final ta8 a;

    public ku0(ta8 ta8Var) {
        this.a = ta8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.iu0
    public final Object a(String str, CountryCodeName countryCodeName, x1b x1bVar) {
        ju0 ju0Var;
        if (x1bVar instanceof ju0) {
            ju0Var = (ju0) x1bVar;
            int i = ju0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ju0Var.c = i - Integer.MIN_VALUE;
            } else {
                ju0Var = new ju0(this, x1bVar);
            }
        } else {
            ju0Var = new ju0(this, x1bVar);
        }
        Object objH = ju0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = ju0Var.c;
        if (i2 == 0) {
            uj50.b(objH);
            String code = countryCodeName.getCode();
            ju0Var.c = 1;
            objH = this.a.h(str, code, ju0Var);
            if (objH == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objH);
        }
        return n52.b((BaseResponse) objH);
    }
}
