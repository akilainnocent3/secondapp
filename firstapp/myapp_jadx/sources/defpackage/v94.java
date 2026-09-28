package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v94 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v94(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                azm azmVar = ((y94) obj).f;
                if (azmVar != null) {
                    azmVar.d(wae.HOME);
                    return Unit.a;
                }
                Intrinsics.n("router");
                throw null;
            default:
                return Float.valueOf(((fmt) obj).getValue().floatValue());
        }
    }
}
