package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class in2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5 f150726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nn2 f150727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kn2 f150728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hn2 f150729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fn2 f150730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f150731f;

    public /* synthetic */ in2(Context context, e9 e9Var, v9 v9Var, d4 d4Var, lu2 lu2Var, va vaVar, f5 f5Var, nn2 nn2Var, kn2 kn2Var, List list) {
        this(e9Var, f5Var, nn2Var, kn2Var, new hn2(context, v9Var, d4Var, lu2Var, vaVar, list));
    }

    public in2(e9 e9Var, f5 f5Var, nn2 nn2Var, kn2 kn2Var, hn2 hn2Var) {
        this.f150726a = f5Var;
        this.f150727b = nn2Var;
        this.f150728c = kn2Var;
        this.f150729d = hn2Var;
        this.f150730e = new fn2(e9Var, this);
    }
}
