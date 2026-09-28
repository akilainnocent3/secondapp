package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ed7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ed7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((td7) obj).m0().A1();
                return Unit.a;
            case 1:
                azm azmVar = ((uxf) obj).f;
                if (azmVar != null) {
                    azmVar.d(wae.HOME);
                    return Unit.a;
                }
                Intrinsics.n("router");
                throw null;
            case 2:
                ((ccu) obj).y1(x8u.d.a);
                return Unit.a;
            default:
                ((ytw) obj).setValue(Boolean.FALSE);
                return Unit.a;
        }
    }
}
