package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bf60 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bf60(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(vc60.n.a);
                return Unit.a;
            default:
                yva0.a aVar = yva0.c0;
                azm azmVar = ((yva0) obj).a0;
                if (azmVar != null) {
                    azmVar.d(wae.HOME);
                    return Unit.a;
                }
                Intrinsics.n("router");
                throw null;
        }
    }
}
