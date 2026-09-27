package yads;

import android.view.View;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class l12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iv f151833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yf0 f151834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y12 f151835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f151836d;

    public l12(yf0 yf0Var, y12 y12Var, Map map) {
        this.f151833a = iv.f150821a;
        this.f151834b = yf0Var;
        this.f151835c = y12Var;
        this.f151836d = map;
    }

    public final void a() {
        for (pi piVar : this.f151836d.values()) {
            if (piVar != null) {
                piVar.a();
            }
        }
    }

    public final View b() {
        return this.f151835c.a();
    }

    public final pi a(oi oiVar) {
        if (oiVar != null) {
            return (pi) this.f151836d.get(oiVar.f153501a);
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l12(z12 z12Var, d4 d4Var, lu2 lu2Var, mi2 mi2Var, x51 x51Var, xz1 xz1Var, cj cjVar, d42 d42Var, h32 h32Var, v9 v9Var, l72 l72Var, fz1 fz1Var, ao1 ao1Var, my2 my2Var, t20 t20Var, yf0 yf0Var) {
        y12 y12VarA = z12Var.a();
        this(yf0Var, y12VarA, new ri(y12VarA, mi2Var, new tn1(cjVar, d4Var, x51Var, xz1Var.c(), fz1Var, ao1Var, new qn3(y12VarA), my2Var), d42Var, h32Var, v9Var, l72Var, ((iu3) lu2Var).a(), t20Var).a());
    }
}
