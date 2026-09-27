package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fj implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa2 f149128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f149130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yj3 f149131d;

    public fj(oa2 oa2Var, String str, String str2, yj3 yj3Var) {
        this.f149128a = oa2Var;
        this.f149129b = str;
        this.f149130c = str2;
        this.f149131d = yj3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f149131d.a(this.f149130c);
        this.f149128a.a(this.f149129b);
    }
}
