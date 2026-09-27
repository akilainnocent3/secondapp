package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class uz1 implements um0, y51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wz1 f156685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f156686b;

    public /* synthetic */ uz1(Context context, d4 d4Var, lu2 lu2Var, v9 v9Var) {
        wz1 wz1Var = new wz1();
        this(wz1Var, new f1(context, d4Var, lu2Var, v9Var, wz1Var));
    }

    @Override // yads.um0
    public final void a() {
        this.f156685a.a();
    }

    @Override // yads.y51
    public final void a(j5 j5Var) {
        this.f156685a.a(j5Var);
    }

    public uz1(wz1 wz1Var, f1 f1Var) {
        this.f156685a = wz1Var;
        this.f156686b = f1Var;
    }
}
