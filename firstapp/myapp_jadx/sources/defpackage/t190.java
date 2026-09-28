package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.social.ShareUrl;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class t190 {
    public final psm a;
    public final oia0 b;

    public t190(psm psmVar, oia0 oia0Var) {
        psmVar.getClass();
        this.a = psmVar;
        this.b = oia0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        s190 s190Var;
        if (x1bVar instanceof s190) {
            s190Var = (s190) x1bVar;
            int i = s190Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s190Var.c = i - Integer.MIN_VALUE;
            } else {
                s190Var = new s190(this, x1bVar);
            }
        } else {
            s190Var = new s190(this, x1bVar);
        }
        Object objA = s190Var.a;
        y5b y5bVar = y5b.a;
        int i2 = s190Var.c;
        if (i2 == 0) {
            uj50.b(objA);
            if (this.a.S() && str != null && str.length() != 0) {
                lyh<BaseResponse<ShareUrl>> lyhVarJ = this.b.b.j(str);
                s190Var.c = 1;
                objA = s0i.a(lyhVarJ, s190Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objA);
        String sth = ((ShareUrl) n52.b((BaseResponse) objA)).getSth();
        if (!StringsKt.U(sth)) {
            return new pvk("https://www.sportybet.com/ke/m/promotions/share_and_collect_gifts?giftId=".concat(sth), sth);
        }
        return null;
    }
}
