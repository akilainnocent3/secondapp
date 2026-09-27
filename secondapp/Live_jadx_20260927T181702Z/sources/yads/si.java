package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class si {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je3 f155441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oa2 f155442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yj3 f155443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final db1 f155444d = new db1(new c20());

    public si(je3 je3Var, oa2 oa2Var, yj3 yj3Var) {
        this.f155441a = je3Var;
        this.f155442b = oa2Var;
        this.f155443c = yj3Var;
    }

    public final void a(View view, oi oiVar) {
        String str;
        if (oiVar == null || !oiVar.f153505e || (str = this.f155444d.a(this.f155441a.f151061a, oiVar.f153501a).f147736b) == null) {
            return;
        }
        view.setOnClickListener(new fj(this.f155442b, str, oiVar.f153501a, this.f155443c));
    }
}
