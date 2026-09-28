package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xj5 implements k430 {
    public final o4h a;
    public k4h b;
    public jcd c;

    public xj5(o4h o4hVar) {
        this.a = o4hVar;
    }

    public final long a() {
        jcd jcdVar = this.c;
        if (jcdVar != null) {
            return jcdVar.d;
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    public final void b(zpc zpcVar, Uri uri, Map map, long j, long j2, q430 q430Var) throws pgh0 {
        k4h k4hVar;
        jcd jcdVar = new jcd(zpcVar, j, j2);
        this.c = jcdVar;
        if (this.b != null) {
            return;
        }
        k4h[] k4hVarArrA = this.a.a(uri, map);
        int length = k4hVarArrA.length;
        pcn.b bVar = pcn.b;
        s38.b(length, "expectedSize");
        pcn.a aVar = new pcn.a(length);
        boolean z = true;
        if (k4hVarArrA.length == 1) {
            k4hVar = k4hVarArrA[0];
            this.b = k4hVar;
        } else {
            for (k4h k4hVar2 : k4hVarArrA) {
                try {
                    if (k4hVar2.b(jcdVar)) {
                        this.b = k4hVar2;
                        jcdVar.f = 0;
                        break;
                    }
                    aVar.e(k4hVar2.i());
                    boolean z2 = this.b != null || jcdVar.d == j;
                    ly0.f(z2);
                    jcdVar.f = 0;
                } catch (EOFException unused) {
                    if (this.b != null || jcdVar.d == j) {
                    }
                } catch (Throwable th) {
                    if (this.b == null && jcdVar.d != j) {
                        z = false;
                    }
                    ly0.f(z);
                    jcdVar.f = 0;
                    throw th;
                }
                ly0.f(z2);
                jcdVar.f = 0;
            }
            k4h k4hVar3 = this.b;
            if (k4hVar3 == null) {
                String str = "None of the available extractors (" + new w9p(", ").b(cjs.a(pcn.k(k4hVarArrA), new wj5())) + ") could read the stream.";
                uri.getClass();
                c150 c150VarG = aVar.g();
                pgh0 pgh0Var = new pgh0(str, null, false, 1);
                pcn.j(c150VarG);
                throw pgh0Var;
            }
            k4hVar = k4hVar3;
        }
        k4hVar.l(q430Var);
    }
}
