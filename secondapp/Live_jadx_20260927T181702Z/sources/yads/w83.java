package yads;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class w83 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = x83.f157728i;
        if (handler != null) {
            handler.post(x83.f157729j);
            x83.f157728i.postDelayed(x83.f157730k, 200L);
        }
    }
}
