package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ba4 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g74 g74Var = (g74) obj;
        g74Var.getClass();
        int i = g74Var.a;
        String str = g74Var.b;
        str.getClass();
        if (i == 5 || i == 10 || i == 13) {
            itf0.a.g("operation is cancelled by user interaction", new Object[0]);
        } else {
            itf0.a.d("Error during biometric authentication: " + i + ", " + str, new Object[0]);
        }
        return Unit.a;
    }
}
