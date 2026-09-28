package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i810 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i810(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                kme kmeVar = (kme) obj;
                kmeVar.getClass();
                return kme.a(kmeVar, (sb00) ((oe10) obj2).invoke(kmeVar.a), null, false, false, false, false, false, false, null, 510);
            default:
                vad0 vad0Var = (vad0) obj2;
                z83 z83Var = (z83) obj;
                z83Var.getClass();
                vad0Var.r2(z83Var, vad0Var.S0());
                return Unit.a;
        }
    }
}
