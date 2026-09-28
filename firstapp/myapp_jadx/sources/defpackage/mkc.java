package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mkc {
    public final Function1<Boolean, Unit> a;
    public final Function1<Boolean, Unit> b;
    public final Function1<Float, Unit> c;
    public final Function0<Unit> d;
    public final Function0<Unit> e;
    public final Function1<Integer, Unit> f;
    public final Function0<Unit> g;

    public mkc(c4i0 c4i0Var, d4i0 d4i0Var, e4i0 e4i0Var, f4i0 f4i0Var, g4i0 g4i0Var, int i) {
        Function1<Boolean, Unit> tu3Var = (i & 1) != 0 ? new tu3(1) : c4i0Var;
        Function1<Boolean, Unit> hkcVar = (i & 2) != 0 ? new hkc() : d4i0Var;
        Function1<Float, Unit> ikcVar = (i & 4) != 0 ? new ikc(0) : e4i0Var;
        Function0<Unit> jkcVar = (i & 8) != 0 ? new jkc() : f4i0Var;
        Function0<Unit> kkcVar = (i & 16) != 0 ? new kkc() : g4i0Var;
        lkc lkcVar = new lkc(0);
        ax8 ax8Var = new ax8(1);
        this.a = tu3Var;
        this.b = hkcVar;
        this.c = ikcVar;
        this.d = jkcVar;
        this.e = kkcVar;
        this.f = lkcVar;
        this.g = ax8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkc)) {
            return false;
        }
        mkc mkcVar = (mkc) obj;
        return Intrinsics.g(this.a, mkcVar.a) && Intrinsics.g(this.b, mkcVar.b) && Intrinsics.g(this.c, mkcVar.c) && Intrinsics.g(this.d, mkcVar.d) && Intrinsics.g(this.e, mkcVar.e) && Intrinsics.g(this.f, mkcVar.f) && Intrinsics.g(this.g, mkcVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + w57.b(x7g.a(x7g.a(w57.b(w57.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "CustomVideoPlayerCallbacks(onFullscreenClick=" + this.a + ", onMuteSettingChange=" + this.b + ", onPlaybackSpeedChange=" + this.c + ", onPlayerUiCreated=" + this.d + ", onPlayerUiDestroyed=" + this.e + ", onPlaybackError=" + this.f + ", onVideoPlaybackStarted=" + this.g + ")";
    }

    public mkc() {
        this(null, null, null, null, null, 127);
    }
}
