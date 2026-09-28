package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class oph0 {
    public final tov a;
    public final mub b;
    public String c;
    public final a d = new a(false);
    public final a e = new a(true);
    public final wu50 f = new wu50();
    public final AtomicMarkableReference<String> g = new AtomicMarkableReference<>(null, false);

    public class a {
        public final AtomicMarkableReference<lpp> a;
        public final AtomicReference<Runnable> b = new AtomicReference<>(null);
        public final boolean c;

        public a(boolean z) {
            this.c = z;
            this.a = new AtomicMarkableReference<>(new lpp(z ? 8192 : 1024), false);
        }

        public final void a() {
            AtomicReference<Runnable> atomicReference;
            Runnable runnable = new Runnable() { // from class: nph0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    oph0.a aVar = this.a;
                    Map<String, String> mapUnmodifiableMap = null;
                    aVar.b.set(null);
                    synchronized (aVar) {
                        if (aVar.a.isMarked()) {
                            lpp reference = aVar.a.getReference();
                            synchronized (reference) {
                                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.a));
                            }
                            AtomicMarkableReference<lpp> atomicMarkableReference = aVar.a;
                            atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                        }
                    }
                    if (mapUnmodifiableMap != null) {
                        oph0 oph0Var = oph0.this;
                        oph0Var.a.h(oph0Var.c, mapUnmodifiableMap, aVar.c);
                    }
                }
            };
            do {
                atomicReference = this.b;
                if (atomicReference.compareAndSet(null, runnable)) {
                    oph0.this.b.b.a(runnable);
                    return;
                }
            } while (atomicReference.get() == null);
        }

        public final boolean b(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.a.getReference().b(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<lpp> atomicMarkableReference = this.a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    a();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public oph0(String str, xkh xkhVar, mub mubVar) {
        this.c = str;
        this.a = new tov(xkhVar);
        this.b = mubVar;
    }
}
