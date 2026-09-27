package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class c02 {
    public static d02 a() {
        if (d02.f147981d == null) {
            synchronized (d02.f147980c) {
                try {
                    if (d02.f147981d == null) {
                        d02.f147981d = new d02(new Handler(Looper.getMainLooper()));
                    }
                    dr.w2 w2Var = dr.w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        d02 d02Var = d02.f147981d;
        if (d02Var != null) {
            return d02Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
