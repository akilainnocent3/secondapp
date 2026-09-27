package yads;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mz implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f152770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f152771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z3 f152772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d42 f152773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k63 f152774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gi0 f152775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nz f152776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hf1 f152777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ay0 f152778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public lz f152779j;

    public /* synthetic */ mz(v9 v9Var, b2 b2Var, z3 z3Var, d42 d42Var, k63 k63Var, gi0 gi0Var) {
        this(v9Var, b2Var, z3Var, d42Var, k63Var, gi0Var, new nz(), new hf1());
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        ay0 n72Var;
        lz lzVar = new lz(this);
        this.f152771b.f147017b.add(lzVar);
        this.f152779j = lzVar;
        hf1 hf1Var = this.f152777h;
        hf1Var.f150104a.getClass();
        View viewFindViewWithTag = viewGroup.findViewWithTag("linear_progress_view");
        ProgressBar progressBar = viewFindViewWithTag instanceof ProgressBar ? (ProgressBar) viewFindViewWithTag : null;
        lm2 lm2Var = hf1Var.f150106c;
        ns.o oVar = hf1.f150103d[0];
        lm2Var.getClass();
        lm2Var.f152056a = new WeakReference(progressBar);
        nz nzVar = this.f152776g;
        v9 v9Var = this.f152770a;
        z3 z3Var = this.f152772c;
        d42 d42Var = this.f152773d;
        k63 k63Var = this.f152774e;
        gi0 gi0Var = this.f152775f;
        hf1 hf1Var2 = this.f152777h;
        nzVar.getClass();
        d62 d62Var = d42Var.f148070a;
        o72 o72Var = d42Var.f148071b;
        String str = gi0Var != null ? gi0Var.f149619a : null;
        fg0[] fg0VarArr = fg0.f149100b;
        if (kotlin.jvm.internal.m0.g(str, "pack_shot")) {
            n72Var = new e32(z3Var, k63Var, hf1Var2);
        } else if (d62Var != null) {
            n72Var = new c62(d62Var, z3Var, hf1Var2, v9Var.f156840s);
        } else {
            n72Var = o72Var != null ? new n72(o72Var, z3Var) : new e32(z3Var, k63Var, hf1Var2);
        }
        n72Var.start();
        this.f152778i = n72Var;
    }

    @Override // yads.zf0
    public final void c() {
        lz lzVar = this.f152779j;
        if (lzVar != null) {
            this.f152771b.f147017b.remove(lzVar);
        }
        ay0 ay0Var = this.f152778i;
        if (ay0Var != null) {
            ay0Var.invalidate();
        }
        lm2 lm2Var = this.f152777h.f150106c;
        ns.o oVar = hf1.f150103d[0];
        lm2Var.getClass();
        lm2Var.f152056a = new WeakReference(null);
    }

    public mz(v9 v9Var, b2 b2Var, z3 z3Var, d42 d42Var, k63 k63Var, gi0 gi0Var, nz nzVar, hf1 hf1Var) {
        this.f152770a = v9Var;
        this.f152771b = b2Var;
        this.f152772c = z3Var;
        this.f152773d = d42Var;
        this.f152774e = k63Var;
        this.f152775f = gi0Var;
        this.f152776g = nzVar;
        this.f152777h = hf1Var;
    }
}
