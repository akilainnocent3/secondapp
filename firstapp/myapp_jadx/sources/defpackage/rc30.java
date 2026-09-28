package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rc30 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;

    public /* synthetic */ rc30(haj hajVar, int i) {
        this.a = i;
        this.b = hajVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) hajVar;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                ((Function1) hajVar).invoke(g1k0.a.a);
                break;
        }
        return Unit.a;
    }
}
