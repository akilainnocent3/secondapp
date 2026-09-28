package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zur extends jvr {
    public final /* synthetic */ nvr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zur(nvr nvrVar, int i, int i2, yur yurVar, rvr rvrVar) {
        super(nvrVar, i, i2, yurVar, rvrVar);
        this.f = nvrVar;
    }

    @Override // defpackage.jvr
    public final ivr b(int i, hvr[] hvrVarArr, List<s7l> list, int i2) {
        return new ivr(i, hvrVarArr, this.f, list, i2);
    }
}
