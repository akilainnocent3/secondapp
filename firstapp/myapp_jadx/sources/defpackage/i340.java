package defpackage;

import java.util.Arrays;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes8.dex */
public final class i340 {
    public static final t0b[] a;

    static {
        try {
            a = (t0b[]) ld80.k(fd80.b(Arrays.asList(new t0b[0]).iterator())).toArray(new t0b[0]);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
