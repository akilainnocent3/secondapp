package yads;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ps0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f154098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z00 f154099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lh3 f154100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hs0 f154101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public cn f154102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f154103f;

    public ps0(ViewGroup viewGroup, sr0 sr0Var, lh3 lh3Var, hs0 hs0Var) {
        this.f154098a = viewGroup;
        this.f154099b = sr0Var;
        this.f154100c = lh3Var;
        this.f154101d = hs0Var;
        this.f154103f = new ViewTreeObserver.OnPreDrawListener() { // from class: yads.s84
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return ps0.a();
            }
        };
    }

    public static final boolean a() {
        return true;
    }

    public /* synthetic */ ps0(d4 d4Var, lu2 lu2Var, ViewGroup viewGroup, sr0 sr0Var, lh3 lh3Var) {
        this(viewGroup, sr0Var, lh3Var, new hs0(d4Var, lu2Var));
    }
}
