package yads;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xo1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f157941g = fr.h0.Q(co2.f147827m, co2.f147828n);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f157942h = fr.h0.Q(co2.f147829o, co2.f147830p, co2.D, co2.E);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f157943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f157944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f157945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wo1 f157946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jr1 f157947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tq2 f157948f;

    public /* synthetic */ xo1(d4 d4Var, lu2 lu2Var, v9 v9Var) {
        this(d4Var, lu2Var, v9Var, new wo1(), new jr1(), new tq2());
    }

    public final void a(Context context, qq1 qq1Var, Map map) {
        a(context, co2.f147820f, qq1Var, null, map);
    }

    public final void a(Context context, co2 co2Var, qq1 qq1Var, String str, Map map) {
        fo2 fo2VarA;
        wo1 wo1Var = this.f157946d;
        v9 v9Var = this.f157945c;
        d4 d4Var = this.f157943a;
        wo1Var.getClass();
        if ((v9Var != null ? v9Var.f156834m : null) == sz.NATIVE) {
            Object obj = v9Var.f156841t;
            fo2VarA = wo1Var.f157460b.a(v9Var, d4Var, obj instanceof d12 ? (d12) obj : null);
        } else {
            fo2VarA = wo1Var.f157459a.a(v9Var, d4Var);
        }
        this.f157947e.getClass();
        fo2 fo2VarA2 = go2.a(fo2VarA, jr1.a(qq1Var));
        fo2VarA2.f149196a.putAll(map);
        Map map2 = fo2VarA2.f149196a;
        c cVar = fo2VarA2.f149197b;
        String str2 = co2Var.f147841b;
        Map mapJ0 = fr.n1.J0(map2);
        eo2 eo2Var = new eo2(str2, mapJ0, cVar);
        ((iu3) this.f157944b).getClass();
        pu3 pu3Var = pu3.f154142a;
        cf.a(context, new cq3(((iu3) this.f157944b).f150820a)).a(eo2Var);
        new we(context).a(co2Var, mapJ0, str, qq1Var.f154560g);
    }

    public xo1(d4 d4Var, lu2 lu2Var, v9 v9Var, wo1 wo1Var, jr1 jr1Var, tq2 tq2Var) {
        this.f157943a = d4Var;
        this.f157944b = lu2Var;
        this.f157945c = v9Var;
        this.f157946d = wo1Var;
        this.f157947e = jr1Var;
        this.f157948f = tq2Var;
    }
}
