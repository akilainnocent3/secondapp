package defpackage;

import java.util.Arrays;
import java.util.ServiceConfigurationError;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cf80 implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            return h58.a(ld80.k(fd80.b(Arrays.asList(new shk(), new ike0()).iterator())));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
