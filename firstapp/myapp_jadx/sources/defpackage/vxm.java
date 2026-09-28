package defpackage;

import com.sportybet.android.account.international.data.model.INTVerifyData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvxm;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vxm extends j8i0 {
    public final lwm a;
    public final fe6 b;
    public final rdd0 c;
    public final mpe0 d;
    public INTVerifyData e;

    public vxm(lwm lwmVar, fe6 fe6Var, rdd0 rdd0Var) {
        lwmVar.getClass();
        fe6Var.getClass();
        rdd0Var.getClass();
        this.a = lwmVar;
        this.b = fe6Var;
        this.c = rdd0Var;
        this.d = hwr.b(new jxm());
    }

    public final INTVerifyData x1() {
        INTVerifyData iNTVerifyData = this.e;
        if (iNTVerifyData != null) {
            return iNTVerifyData;
        }
        Intrinsics.n("verifyData");
        throw null;
    }
}
