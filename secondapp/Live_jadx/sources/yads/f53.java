package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class f53 implements xv {
    public final i53 a(Looper looper, Handler.Callback callback) {
        return new i53(new Handler(looper, callback));
    }
}
