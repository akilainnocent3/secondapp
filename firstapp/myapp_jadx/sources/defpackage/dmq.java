package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dmq implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dmq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                cuw cuwVar = (cuw) obj;
                return Boolean.valueOf(cuwVar.n0() && ((Boolean) ((x5a0) cuwVar.b).getValue()).booleanValue());
            default:
                ((q1c0) obj).Z0();
                return Unit.a;
        }
    }
}
