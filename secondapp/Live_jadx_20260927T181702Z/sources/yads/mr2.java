package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mr2 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f152621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f152622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kz f152623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cz1 f152624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d42 f152625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k63 f152626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gi0 f152627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jw f152628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ay0 f152629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public kr2 f152630j;

    public mr2(v9 v9Var, b2 b2Var, kz kzVar, ez1 ez1Var, d42 d42Var, k63 k63Var, gi0 gi0Var, jw jwVar) {
        this.f152621a = v9Var;
        this.f152622b = b2Var;
        this.f152623c = kzVar;
        this.f152624d = ez1Var;
        this.f152625e = d42Var;
        this.f152626f = k63Var;
        this.f152627g = gi0Var;
        this.f152628h = jwVar;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        ay0 a32Var;
        View viewC = this.f152624d.c(viewGroup);
        if (viewC != null) {
            kr2 kr2Var = new kr2(this);
            this.f152622b.f147017b.add(kr2Var);
            this.f152630j = kr2Var;
            Context context = viewC.getContext();
            Object obj = dw2.f148384j;
            nt2 nt2VarA = cw2.a().a(context);
            boolean z10 = false;
            boolean z11 = nt2VarA != null && nt2VarA.D;
            eg0[] eg0VarArr = eg0.f148690b;
            if (kotlin.jvm.internal.m0.g("divkit", this.f152621a.f156832k) && z11) {
                z10 = true;
            }
            if (!z10) {
                viewC.setOnClickListener(new jr2(this.f152623c));
            }
            viewC.setVisibility(8);
            lr2 lr2Var = new lr2(new WeakReference(viewC));
            jw jwVar = this.f152628h;
            v9 v9Var = this.f152621a;
            d42 d42Var = this.f152625e;
            k63 k63Var = this.f152626f;
            gi0 gi0Var = this.f152627g;
            jwVar.getClass();
            d62 d62Var = d42Var.f148070a;
            o72 o72Var = d42Var.f148071b;
            ay0 ay0Var = null;
            String str = gi0Var != null ? gi0Var.f149619a : null;
            fg0[] fg0VarArr = fg0.f149100b;
            if (kotlin.jvm.internal.m0.g(str, "pack_shot") && k63Var.f151413d.a()) {
                a32Var = new a32(v9Var, lr2Var, k63Var);
            } else if (d62Var != null) {
                a32Var = new b62(d62Var, lr2Var, v9Var.f156831j, k63Var.f151414e, k63Var.f151413d);
            } else if (o72Var != null) {
                a32Var = new m72(o72Var, lr2Var);
            } else {
                a32Var = k63Var.f151413d.a() ? new a32(v9Var, lr2Var, k63Var) : null;
            }
            if (a32Var != null) {
                a32Var.start();
                ay0Var = a32Var;
            }
            this.f152629i = ay0Var;
        }
    }

    @Override // yads.zf0
    public final void c() {
        kr2 kr2Var = this.f152630j;
        if (kr2Var != null) {
            this.f152622b.f147017b.remove(kr2Var);
        }
        ay0 ay0Var = this.f152629i;
        if (ay0Var != null) {
            ay0Var.invalidate();
        }
    }
}
