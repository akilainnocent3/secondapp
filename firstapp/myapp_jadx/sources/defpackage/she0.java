package defpackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class she0 {
    public final jhd a;
    public final n26 b;
    public c c;

    public class a implements cbj<lhe0> {
        public final /* synthetic */ ehe0 a;

        public a(ehe0 ehe0Var) {
            this.a = ehe0Var;
        }

        @Override // defpackage.cbj
        public final void onFailure(Throwable th) {
            int i = this.a.f;
            if (i == 2 && (th instanceof CancellationException)) {
                pgt.a("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
            } else {
                pgt.j("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: ".concat(k570.a(i)), th);
            }
        }

        @Override // defpackage.cbj
        public final void onSuccess(lhe0 lhe0Var) throws IOException {
            lhe0 lhe0Var2 = lhe0Var;
            lhe0Var2.getClass();
            she0.this.a.a(lhe0Var2);
        }
    }

    public static abstract class b {
        public abstract List<v7z> a();

        public abstract ehe0 b();
    }

    public static class c extends HashMap<v7z, ehe0> {
    }

    public she0(n26 n26Var, jhd jhdVar) {
        this.b = n26Var;
        this.a = jhdVar;
    }

    public final void a(ehe0 ehe0Var, Map.Entry<v7z, ehe0> entry) {
        ehe0 value = entry.getValue();
        pgt.a("SurfaceProcessorNode", "     -> outputEdge = " + value);
        lhe0.a aVar = null;
        cl1 cl1Var = new cl1(ehe0Var.g.f(), entry.getKey().a(), ehe0Var.c ? this.b : null, entry.getKey().c(), entry.getKey().g());
        int iB = entry.getKey().b();
        value.getClass();
        kpf0.a();
        value.a();
        km20.g("Consumer can only be linked once.", !value.j);
        value.j = true;
        ehe0.a aVar2 = value.l;
        pw6 pw6VarG = obj.g(aVar2.c(), new zge0(value, aVar2, iB, cl1Var, aVar), mku.a());
        pw6VarG.k(new obj.b(pw6VarG, new a(value)), mku.a());
    }
}
