package yads;

import android.content.Context;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sq0 implements tq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f155527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg2 f155528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tg2 f155529c;

    public sq0(Context context, sg2 sg2Var, tg2 tg2Var) {
        this.f155527a = context;
        this.f155528b = sg2Var;
        this.f155529c = tg2Var;
    }

    @Override // yads.tq0
    public final Parcelable getValue() {
        tg2 tg2Var = this.f155529c;
        Context context = this.f155527a;
        sg2 sg2Var = this.f155528b;
        tg2Var.getClass();
        return tg2.a(context, sg2Var);
    }
}
