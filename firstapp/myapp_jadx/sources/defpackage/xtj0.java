package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxtj0;", "Lihb0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xtj0 extends ihb0 {
    public final vu90 A;
    public final fe6 d;
    public final xxz e;
    public final oyf f;
    public final rdd0 i;
    public final String v;
    public final ssw<bi50<BaseResponse<xdp>>> w;
    public final ssw y;
    public final vu90<myf> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtj0(fe6 fe6Var, xxz xxzVar, oyf oyfVar, vu60 vu60Var, rdd0 rdd0Var) {
        super(0);
        fe6Var.getClass();
        xxzVar.getClass();
        oyfVar.getClass();
        vu60Var.getClass();
        rdd0Var.getClass();
        this.d = fe6Var;
        this.e = xxzVar;
        this.f = oyfVar;
        this.i = rdd0Var;
        this.v = (String) vu60Var.b("email_change_pin_check_token");
        ssw<bi50<BaseResponse<xdp>>> sswVar = new ssw<>();
        this.w = sswVar;
        this.y = sswVar;
        vu90<myf> vu90Var = new vu90<>();
        this.z = vu90Var;
        this.A = vu90Var;
    }
}
