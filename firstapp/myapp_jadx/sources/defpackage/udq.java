package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.domain.LNGiftManager", f = "LNGiftManager.kt", l = {78, 79, 81}, m = "reset-qAEAa6o", v = 2)
public final class udq extends x1b {
    public BigDecimal a;
    public ocq b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vdq d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udq(vdq vdqVar, x1b x1bVar) {
        super(x1bVar);
        this.d = vdqVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
