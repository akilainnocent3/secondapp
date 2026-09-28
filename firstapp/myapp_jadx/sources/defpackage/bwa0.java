package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bwa0 implements Function0<Unit> {
    public final /* synthetic */ yva0 a;

    public bwa0(yva0 yva0Var) {
        this.a = yva0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        azm azmVar = this.a.a0;
        if (azmVar != null) {
            azmVar.d(wae.ME_TRANSACTIONS);
            return Unit.a;
        }
        Intrinsics.n("router");
        throw null;
    }
}
