package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class prb0 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ prb0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((String) obj).getClass();
                break;
            default:
                break;
        }
        return Unit.a;
    }
}
