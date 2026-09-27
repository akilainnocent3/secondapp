package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f147387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final at1 f147388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f147389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f147390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f147391e;

    public bx1(Context context, v9 v9Var, lu2 lu2Var) {
        this.f147387a = v9Var;
        iu3 iu3Var = (iu3) lu2Var;
        iu3Var.d();
        pu3 pu3Var = pu3.f154142a;
        this.f147388b = cf.a(context, iu3Var.b());
        this.f147389c = true;
        this.f147390d = true;
        this.f147391e = true;
    }

    public final void a(String str) {
        co2 co2Var = co2.f147817c;
        this.f147388b.a(new eo2("multibanner_event", fr.n1.J0(fr.n1.M(dr.v1.a("event_type", str))), this.f147387a.f156830i));
    }
}
