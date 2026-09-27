package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qg3 implements to2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to2 f154462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f154463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rg3 f154464c;

    public qg3(rg3 rg3Var, to2 to2Var, Object obj) {
        this.f154464c = rg3Var;
        this.f154462a = to2Var;
        this.f154463b = obj;
    }

    public final void a() {
        if (!this.f154464c.f154961d.isEmpty()) {
            this.f154462a.onSuccess(this.f154464c.f154961d);
            return;
        }
        zl0 zl0Var = new zl0();
        to2 to2Var = this.f154462a;
        String message = zl0Var.getMessage();
        if (message == null) {
            message = "Ad request completed successfully, but there are no ads available.";
        }
        to2Var.a(new be3(message));
    }

    @Override // yads.to2
    public final void onSuccess(Object obj) {
        this.f154464c.f154960c.getClass();
        og3 og3VarA = pg3.a((List) obj);
        this.f154464c.f154961d.addAll(og3VarA.f153489a);
        List list = og3VarA.f153490b;
        if (list.isEmpty()) {
            a();
        } else {
            rg3 rg3Var = this.f154464c;
            rg3Var.f154959b.a(rg3Var.f154958a, list, this, this.f154463b);
        }
    }

    @Override // yads.to2
    public final void a(be3 be3Var) {
        a();
    }
}
