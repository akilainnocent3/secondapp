package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class zy00 implements zde0<f1e0> {
    public final /* synthetic */ xyi0 a;
    public final /* synthetic */ bz00 b;
    public final /* synthetic */ String c;

    public zy00(xyi0 xyi0Var, bz00 bz00Var, String str) {
        this.a = xyi0Var;
        this.b = bz00Var;
        this.c = str;
    }

    @Override // defpackage.zde0
    public final void a(bee0 bee0Var) {
        if (bee0Var != null) {
            bee0Var.request(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.zde0
    public final void onError(Throwable th) {
        th.getClass();
        this.b.b.d(this.c, th);
    }

    @Override // defpackage.zde0
    public final void onNext(f1e0 f1e0Var) {
        f1e0 f1e0Var2 = f1e0Var;
        if (f1e0Var2 != null) {
            String str = f1e0Var2.c;
            bz00 bz00Var = this.b;
            eal ealVar = bz00Var.a;
            try {
                if (this.a == xyi0.b) {
                    str.getClass();
                    npj npjVarA = npj.a.a(str, ealVar);
                    if (npjVarA != null) {
                        bz00Var.d.a(npjVarA);
                        return;
                    }
                    return;
                }
                str.getClass();
                lav lavVarA = lav.a.a(str, ealVar);
                if (lavVarA != null) {
                    bz00Var.e.a(lavVarA);
                }
            } catch (Exception e) {
                bz00Var.b.e(e);
                Unit unit = Unit.a;
            }
        }
    }

    @Override // defpackage.zde0
    public final void onComplete() {
    }
}
