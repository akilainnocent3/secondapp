package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f149202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f149203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rc3 f149204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fg3 f149205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f149206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f149207f;

    public fp3(Context context, d4 d4Var, lu2 lu2Var, rc3 rc3Var, fg3 fg3Var) {
        this.f149202a = d4Var;
        this.f149203b = lu2Var;
        this.f149204c = rc3Var;
        this.f149205d = fg3Var;
        this.f149206e = context.getApplicationContext();
    }

    public final void a(Context context, List list, to2 to2Var, Object obj) {
        int i10 = this.f149207f + 1;
        this.f149207f = i10;
        if (i10 > 5) {
            to2Var.a(new be3("Maximum count of VAST wrapper requests exceeded."));
            return;
        }
        new hp3(new cp3(this.f149206e, this.f149202a, this.f149203b, this.f149204c, this.f149205d)).a(context, list, to2Var, obj);
    }
}
