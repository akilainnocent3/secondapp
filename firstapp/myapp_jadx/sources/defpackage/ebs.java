package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class ebs {
    public static final nas a(s9s s9sVar) {
        s9sVar.getClass();
        x11<Object> x11Var = s9sVar.a;
        while (true) {
            nas nasVar = (nas) x11Var.a.get();
            if (nasVar != null) {
                return nasVar;
            }
            kfe0 kfe0VarA = lfe0.a();
            pfd pfdVar = fse.a;
            nas nasVar2 = new nas(s9sVar, CoroutineContext.Element.a.d(kfe0VarA, gku.a.h0()));
            AtomicReference<Object> atomicReference = x11Var.a;
            do {
                if (atomicReference.compareAndSet(null, nasVar2)) {
                    pfd pfdVar2 = fse.a;
                    ej5.c(nasVar2, gku.a.h0(), null, new mas(nasVar2, null), 2);
                    return nasVar2;
                }
            } while (atomicReference.get() == null);
        }
    }
}
