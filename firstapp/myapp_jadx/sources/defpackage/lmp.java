package defpackage;

import java.security.GeneralSecurityException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class lmp implements mmp.a {
    public final /* synthetic */ gnp a;

    public lmp(gnp gnpVar) {
        this.a = gnpVar;
    }

    @Override // mmp.a
    public final Class<?> a() {
        return this.a.getClass();
    }

    @Override // mmp.a
    public final Set<Class<?>> b() {
        return this.a.b.keySet();
    }

    @Override // mmp.a
    public final kmp c(Class cls) throws GeneralSecurityException {
        try {
            return new kmp(this.a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // mmp.a
    public final kmp d() {
        gnp gnpVar = this.a;
        return new kmp(gnpVar, gnpVar.c);
    }
}
