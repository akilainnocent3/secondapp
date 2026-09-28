package defpackage;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class mmp {
    public static final Logger b = Logger.getLogger(mmp.class.getName());
    public final ConcurrentHashMap a;

    public interface a {
        Class<?> a();

        Set<Class<?>> b();

        kmp c(Class cls);

        kmp d();
    }

    public mmp(mmp mmpVar) {
        this.a = new ConcurrentHashMap(mmpVar.a);
    }

    public final synchronized a a(String str) {
        if (!this.a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (a) this.a.get(str);
    }

    public final synchronized <KeyProtoT extends wnv> void b(gnp<KeyProtoT> gnpVar) {
        if (!gnpVar.a().a()) {
            throw new GeneralSecurityException("failed to register key manager " + gnpVar.getClass() + " as it is not FIPS compatible.");
        }
        c(new lmp(gnpVar));
    }

    public final synchronized void c(lmp lmpVar) {
        String strB = lmpVar.d().a.b();
        a aVar = (a) this.a.get(strB);
        if (aVar != null && !aVar.a().equals(lmpVar.a.getClass())) {
            b.warning("Attempted overwrite of a registered key manager for key type ".concat(strB));
            throw new GeneralSecurityException("typeUrl (" + strB + ") is already registered with " + aVar.a().getName() + ", cannot be re-registered with " + lmpVar.a.getClass().getName());
        }
        this.a.putIfAbsent(strB, lmpVar);
    }

    public mmp() {
        this.a = new ConcurrentHashMap();
    }
}
