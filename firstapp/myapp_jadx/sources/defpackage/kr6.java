package defpackage;

import androidx.compose.runtime.m;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kr6 implements Function0 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return m.b(t3g.a);
            default:
                throw new IllegalStateException("No LoyaltyColors provided. Make sure to wrap with LoyaltyTheme.");
        }
    }
}
