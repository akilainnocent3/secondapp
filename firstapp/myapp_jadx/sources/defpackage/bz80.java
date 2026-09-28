package defpackage;

import com.sportybet.plugin.realsports.data.RTicket;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.event.comment.ShareBetViewEntity", f = "ShareBetViewEntity.kt", l = {114}, m = "updateData", v = 2)
public final class bz80 extends x1b {
    public RTicket a;
    public BigDecimal b;
    public BigDecimal c;
    public BigDecimal d;
    public BigDecimal e;
    public BigDecimal f;
    public /* synthetic */ Object i;
    public final /* synthetic */ zy80 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz80(zy80 zy80Var, x1b x1bVar) {
        super(x1bVar);
        this.v = zy80Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.i(null, this);
    }
}
