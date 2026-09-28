package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes8.dex */
public final class gku {
    public static final wcl a;

    static {
        String property;
        int i = yqe0.a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = ld80.k(fd80.b(Arrays.asList(new z60()).iterator())).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    ((fku) next).getClass();
                    do {
                        ((fku) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            fku fkuVar = (fku) next;
            if (fkuVar != null) {
                a = fkuVar.a();
            } else {
                ib5.a("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
