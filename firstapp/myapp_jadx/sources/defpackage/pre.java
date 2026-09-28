package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class pre implements fre {
    public final File b;
    public final long c;
    public nre e;
    public final ire d = new ire();
    public final rr60 a = new rr60();

    @Deprecated
    public pre(File file, long j) {
        this.b = file;
        this.c = j;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.fre
    public final void a(nlp nlpVar, poc pocVar) {
        ire.a aVar;
        String strA = this.a.a(nlpVar);
        ire ireVar = this.d;
        synchronized (ireVar) {
            aVar = (ire.a) ireVar.a.get(strA);
            if (aVar == null) {
                ire.b bVar = ireVar.b;
                synchronized (bVar.a) {
                    aVar = (ire.a) bVar.a.poll();
                }
                if (aVar == null) {
                    aVar = new ire.a();
                }
                ireVar.a.put(strA, aVar);
            }
            aVar.b++;
        }
        aVar.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strA + " for for Key: " + nlpVar);
            }
            try {
                nre nreVarC = c();
                if (nreVarC.o(strA) == null) {
                    nre.c cVarL = nreVarC.l(strA);
                    if (cVarL == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strA));
                    }
                    try {
                        if (pocVar.a.b(pocVar.b, cVarL.b(), pocVar.c)) {
                            nre.this.f(cVarL, true);
                            cVarL.c = true;
                        }
                        if (!cVarL.c) {
                            try {
                                cVarL.a();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (!cVarL.c) {
                            try {
                                cVarL.a();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            this.d.a(strA);
        } catch (Throwable th2) {
            this.d.a(strA);
            throw th2;
        }
    }

    @Override // defpackage.fre
    public final File b(nlp nlpVar) {
        String strA = this.a.a(nlpVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strA + " for for Key: " + nlpVar);
        }
        try {
            nre.e eVarO = c().o(strA);
            if (eVarO != null) {
                return eVarO.a[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    public final synchronized nre c() {
        nre nreVarF;
        nreVarF = this.e;
        if (nreVarF == null) {
            nreVarF = nre.F(this.b, this.c);
            this.e = nreVarF;
        }
        return nreVarF;
    }
}
