package defpackage;

import com.sporty.android.core.model.security.biometric.BiometricAuthStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c74 extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object value;
        wwd0 wwd0Var = ((e74) this.receiver).b;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, BiometricAuthStatus.NotAvailable));
        return Unit.a;
    }
}
