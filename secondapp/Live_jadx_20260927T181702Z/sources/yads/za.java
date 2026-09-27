package yads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class za {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ExecutorService f158673d = Executors.newCachedThreadPool(new ey1(ey1.f148878b));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f158674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f158675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f158676c;

    public za(Context context, lu2 lu2Var, d4 d4Var) {
        this.f158674a = d4Var;
        this.f158675b = lu2Var;
        this.f158676c = context.getApplicationContext();
    }

    public static void a(za zaVar, String str, k83 k83Var) {
        Map mapZ = fr.n1.z();
        dd2 dd2Var = new dd2(zaVar.f158676c, zaVar.f158674a, zaVar.f158675b, k83Var);
        if (str.length() > 0) {
            f158673d.execute(new ya(str, dd2Var, mapZ));
        }
    }
}
