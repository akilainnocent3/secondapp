package yads;

import android.util.LruCache;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class so0 extends LruCache {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e71 f155507c = new e71();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ri3 f155508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Queue f155509b;

    public so0(int i10, ri3 ri3Var) {
        super(i10);
        this.f155508a = ri3Var;
        this.f155509b = new ArrayDeque(i10);
    }

    public final ji3 a(nf0 nf0Var) {
        ji3 fp0Var;
        ji3 ji3Var = (ji3) get(nf0Var);
        if (ji3Var != null) {
            return ji3Var;
        }
        ji3 ji3Var2 = (ji3) ((ArrayDeque) this.f155509b).poll();
        if (ji3Var2 == null) {
            ri3 ri3Var = this.f155508a;
            if (ri3Var.f154982b) {
                d5.h hVar = new d5.h(ri3Var.f154981a);
                hVar.B(2);
                fp0Var = new nj1(new ExoPlayer.b(ri3Var.f154981a).V(hVar).w());
            } else {
                pe0 pe0Var = new pe0(ri3Var.f154981a);
                pe0Var.f153903c = 2;
                rn0 rn0Var = new rn0(ri3Var.f154981a, pe0Var);
                if (rn0Var.f155050r) {
                    throw new IllegalStateException();
                }
                rn0Var.f155050r = true;
                fp0Var = new fp0(new zn0(rn0Var));
            }
            ji3Var2 = fp0Var;
        }
        put(nf0Var, ji3Var2);
        ji3Var2.setVolume(1.0f);
        return ji3Var2;
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        nf0 nf0Var = (nf0) obj;
        ji3 ji3Var = (ji3) obj2;
        ji3Var.b(nf0Var.f153042g);
        nf0Var.a();
        t00 t00Var = nf0Var.f153044i;
        if (t00Var != null) {
            t00Var.i(nf0Var.f153036a);
        }
        ji3Var.clearMediaItems();
        ji3Var.stop();
        ((ArrayDeque) this.f155509b).add(ji3Var);
    }
}
