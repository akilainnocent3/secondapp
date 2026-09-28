package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class awa0 implements Function0<Unit> {
    public final /* synthetic */ yva0 a;

    public awa0(yva0 yva0Var) {
        this.a = yva0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        azm azmVar = this.a.a0;
        if (azmVar != null) {
            azmVar.d(wae.CONTACT_US);
            return Unit.a;
        }
        Intrinsics.n("router");
        throw null;
    }
}
