package yads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f154958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fp3 f154959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pg3 f154960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f154961d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rg3(Context context, d4 d4Var, lu2 lu2Var, fg3 fg3Var, rc3 rc3Var) {
        Context applicationContext = context.getApplicationContext();
        this(applicationContext, new fp3(applicationContext, d4Var, lu2Var, rc3Var, fg3Var), new pg3());
    }

    public rg3(Context context, fp3 fp3Var, pg3 pg3Var) {
        this.f154958a = context;
        this.f154959b = fp3Var;
        this.f154960c = pg3Var;
        this.f154961d = new ArrayList();
    }
}
