package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.BoostInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Levs;", "Lu22;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class evs extends u22 {
    public final h940 G;
    public String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evs(m2l m2lVar, h940 h940Var, v5k v5kVar, f1p f1pVar) {
        super(m2lVar, v5kVar, f1pVar);
        m2lVar.getClass();
        h940Var.getClass();
        this.G = h940Var;
    }

    @Override // defpackage.u22
    public final lyh A1(String str) {
        str.getClass();
        return this.G.r(str);
    }

    @Override // defpackage.u22
    public final lyh<BaseResponse<BoostInfo>> y1() {
        return this.G.b();
    }
}
