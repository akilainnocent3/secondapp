package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class qqp {
    public static final CopyOnWriteArrayList<pqp> a = new CopyOnWriteArrayList<>();

    public static pqp a(String str) throws GeneralSecurityException {
        for (pqp pqpVar : a) {
            if (pqpVar.a(str)) {
                return pqpVar;
            }
        }
        throw new GeneralSecurityException(inm.a("No KMS client does support: ", str));
    }
}
