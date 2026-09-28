package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ggf {
    public final ohe0 a;
    public final n26 b;
    public final n26 c;
    public c d;
    public ci1 e;

    public class a implements cbj<lhe0> {
        public final /* synthetic */ ehe0 a;

        public a(ehe0 ehe0Var) {
            this.a = ehe0Var;
        }

        @Override // defpackage.cbj
        public final void onFailure(Throwable th) {
            int i = this.a.f;
            if (i == 2 && (th instanceof CancellationException)) {
                pgt.a("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
            } else {
                pgt.j("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: ".concat(k570.a(i)), th);
            }
        }

        @Override // defpackage.cbj
        public final void onSuccess(lhe0 lhe0Var) {
            lhe0 lhe0Var2 = lhe0Var;
            lhe0Var2.getClass();
            ggf.this.a.a(lhe0Var2);
        }
    }

    public static abstract class b {
        public abstract List<vff> a();

        public abstract ehe0 b();

        public abstract ehe0 c();
    }

    public static class c extends HashMap<vff, ehe0> {
    }

    public ggf(n26 n26Var, n26 n26Var2, ohe0 ohe0Var) {
        this.b = n26Var;
        this.c = n26Var2;
        this.a = ohe0Var;
    }

    public final void a(n26 n26Var, n26 n26Var2, ehe0 ehe0Var, ehe0 ehe0Var2, Map.Entry<vff, ehe0> entry) {
        ehe0 value = entry.getValue();
        pgt.a("DualSurfaceProcessorNode", "     -> outputEdge = " + value);
        cl1 cl1Var = new cl1(ehe0Var.g.f(), entry.getKey().a().a(), ehe0Var.c ? n26Var : null, entry.getKey().a().c(), entry.getKey().a().g());
        cl1 cl1Var2 = new cl1(ehe0Var2.g.f(), entry.getKey().b().a(), ehe0Var2.c ? n26Var2 : null, entry.getKey().b().c(), entry.getKey().b().g());
        int iB = entry.getKey().a().b();
        value.getClass();
        kpf0.a();
        value.a();
        km20.g("Consumer can only be linked once.", !value.j);
        value.j = true;
        ehe0.a aVar = value.l;
        pw6 pw6VarG = obj.g(aVar.c(), new zge0(value, aVar, iB, cl1Var, cl1Var2), mku.a());
        pw6VarG.k(new obj.b(pw6VarG, new a(value)), mku.a());
    }

    public final c b(ci1 ci1Var) {
        ggf ggfVar = this;
        kpf0.a();
        StringBuilder sb = new StringBuilder("DualSurfaceProcessorNode Transform Processor = ");
        ohe0 ohe0Var = ggfVar.a;
        sb.append(ohe0Var);
        sb.append("\n   primary input = ");
        sb.append(ci1Var.a);
        sb.append("\n   secondary input = ");
        sb.append(ci1Var.b);
        pgt.a("DualSurfaceProcessorNode", sb.toString());
        Iterator<vff> it = ci1Var.c.iterator();
        while (it.hasNext()) {
            pgt.a("SurfaceProcessorNode", "   outputConfig = " + it.next());
        }
        ggfVar.e = ci1Var;
        ggfVar.d = new c();
        ci1 ci1Var2 = ggfVar.e;
        ehe0 ehe0Var = ci1Var2.a;
        final ehe0 ehe0Var2 = ci1Var2.b;
        for (vff vffVar : ci1Var2.c) {
            c cVar = ggfVar.d;
            v7z v7zVarA = vffVar.a();
            Rect rectA = v7zVarA.a();
            int iC = v7zVarA.c();
            boolean zG = v7zVarA.g();
            Matrix matrix = new Matrix(ehe0Var.b);
            matrix.postConcat(lsg0.a(new RectF(rectA), lsg0.i(v7zVarA.d()), iC, zG));
            km20.b(lsg0.e(lsg0.h(lsg0.g(rectA), iC), false, v7zVarA.d()));
            Size sizeD = v7zVarA.d();
            Rect rect = new Rect(0, 0, sizeD.getWidth(), sizeD.getHeight());
            xk1.a aVarI = ehe0Var.g.i();
            Size sizeD2 = v7zVarA.d();
            if (sizeD2 == null) {
                bmy.a("Null resolution");
                return null;
            }
            aVarI.a = sizeD2;
            cVar.put(vffVar, new ehe0(v7zVarA.e(), v7zVarA.b(), aVarI.a(), matrix, false, rect, ehe0Var.i - iC, -1, ehe0Var.e != zG));
        }
        ohe0Var.b(ehe0Var.c(ggfVar.b, true));
        ohe0Var.b(ehe0Var2.c(ggfVar.c, false));
        for (final Map.Entry<vff, ehe0> entry : ggfVar.d.entrySet()) {
            final n26 n26Var = ggfVar.b;
            final n26 n26Var2 = ggfVar.c;
            final ehe0 ehe0Var3 = ehe0Var;
            ehe0 ehe0Var4 = ehe0Var2;
            ggfVar.a(n26Var, n26Var2, ehe0Var3, ehe0Var4, entry);
            ehe0 value = entry.getValue();
            ehe0Var2 = ehe0Var4;
            Runnable runnable = new Runnable() { // from class: fgf
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a(n26Var, n26Var2, ehe0Var3, ehe0Var2, entry);
                }
            };
            ggfVar = this;
            value.getClass();
            kpf0.a();
            value.a();
            value.m.add(runnable);
            ehe0Var = ehe0Var3;
        }
        return ggfVar.d;
    }
}
