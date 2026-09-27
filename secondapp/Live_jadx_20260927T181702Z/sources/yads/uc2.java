package yads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class uc2 {
    public final wc2 a(Context context) {
        wc2 wc2Var;
        wc2 wc2Var2 = wc2.f157284i;
        if (wc2Var2 != null) {
            return wc2Var2;
        }
        synchronized (this) {
            Context applicationContext = context.getApplicationContext();
            Object obj = og1.f153484d;
            Executor executorA = ng1.a().a();
            wc2Var = wc2.f157284i;
            if (wc2Var == null) {
                Object obj2 = dw2.f148384j;
                wc2 wc2Var3 = new wc2(applicationContext, executorA, cw2.a(), new tc2(applicationContext.getApplicationContext()), new sc2());
                wc2.f157284i = wc2Var3;
                wc2Var = wc2Var3;
            }
        }
        return wc2Var;
    }
}
