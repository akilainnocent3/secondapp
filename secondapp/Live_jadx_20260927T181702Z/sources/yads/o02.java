package yads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class o02 implements q02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f153289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f153290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e00 f153291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f153292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rh1 f153293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c10 f153294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public vt3 f153295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public nu3 f153296h;

    public /* synthetic */ o02(Context context, iu3 iu3Var, e00 e00Var) {
        this(context, iu3Var, e00Var, new CopyOnWriteArrayList(), new rh1(context), null, null, null);
    }

    public o02(Context context, iu3 iu3Var, e00 e00Var, List list, rh1 rh1Var, c10 c10Var, vt3 vt3Var, nu3 nu3Var) {
        this.f153289a = context;
        this.f153290b = iu3Var;
        this.f153291c = e00Var;
        this.f153292d = list;
        this.f153293e = rh1Var;
        this.f153294f = c10Var;
        this.f153295g = vt3Var;
        this.f153296h = nu3Var;
        rh1Var.a();
    }
}
