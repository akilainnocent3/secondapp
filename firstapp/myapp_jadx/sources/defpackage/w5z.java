package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w5z implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;

    public /* synthetic */ w5z(haj hajVar, int i) {
        this.a = i;
        this.b = hajVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                ((Function1) hajVar).invoke(q5z.r.a);
                break;
            case 1:
                ((Function1) hajVar).invoke(hz20.b.a);
                break;
            default:
                ((Function0) hajVar).invoke();
                break;
        }
        return Unit.a;
    }
}
