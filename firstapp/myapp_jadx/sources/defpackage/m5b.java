package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes8.dex */
public final class m5b {
    public static final List a;

    static {
        try {
            a = ld80.k(fd80.b(Arrays.asList(new f70()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
