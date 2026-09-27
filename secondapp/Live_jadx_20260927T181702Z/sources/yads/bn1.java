package yads;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ym1 f147286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f147287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f147288d;

    public bn1() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public final void a(Handler handler, cn1 cn1Var) {
        cn1Var.getClass();
        this.f147287c.add(new an1(handler, cn1Var));
    }

    public final /* synthetic */ void b(cn1 cn1Var, vf1 vf1Var, hm1 hm1Var) {
        cn1Var.a(this.f147285a, this.f147286b, vf1Var, hm1Var);
    }

    public final /* synthetic */ void c(cn1 cn1Var, vf1 vf1Var, hm1 hm1Var) {
        cn1Var.b(this.f147285a, this.f147286b, vf1Var, hm1Var);
    }

    public bn1(CopyOnWriteArrayList copyOnWriteArrayList, int i10, ym1 ym1Var, long j10) {
        this.f147287c = copyOnWriteArrayList;
        this.f147285a = i10;
        this.f147286b = ym1Var;
        this.f147288d = j10;
    }

    public final void b(final vf1 vf1Var, final hm1 hm1Var) {
        for (an1 an1Var : this.f147287c) {
            final cn1 cn1Var = an1Var.f146872b;
            ib3.a(an1Var.f146871a, new Runnable() { // from class: yads.zx3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f159090b.b(cn1Var, vf1Var, hm1Var);
                }
            });
        }
    }

    public final void c(final vf1 vf1Var, final hm1 hm1Var) {
        for (an1 an1Var : this.f147287c) {
            final cn1 cn1Var = an1Var.f146872b;
            ib3.a(an1Var.f146871a, new Runnable() { // from class: yads.ey3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f148882b.c(cn1Var, vf1Var, hm1Var);
                }
            });
        }
    }

    public final long a(long j10) {
        long jB = ib3.b(j10);
        if (jB == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f147288d + jB;
    }

    public final void a(final hm1 hm1Var) {
        for (an1 an1Var : this.f147287c) {
            final cn1 cn1Var = an1Var.f146872b;
            ib3.a(an1Var.f146871a, new Runnable() { // from class: yads.by3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f147400b.a(cn1Var, hm1Var);
                }
            });
        }
    }

    public final void b(final hm1 hm1Var) {
        final ym1 ym1Var = this.f147286b;
        ym1Var.getClass();
        for (an1 an1Var : this.f147287c) {
            final cn1 cn1Var = an1Var.f146872b;
            ib3.a(an1Var.f146871a, new Runnable() { // from class: yads.cy3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f147961b.a(cn1Var, ym1Var, hm1Var);
                }
            });
        }
    }

    public final /* synthetic */ void a(cn1 cn1Var, hm1 hm1Var) {
        cn1Var.b(this.f147285a, this.f147286b, hm1Var);
    }

    public final /* synthetic */ void a(cn1 cn1Var, vf1 vf1Var, hm1 hm1Var) {
        cn1Var.c(this.f147285a, this.f147286b, vf1Var, hm1Var);
    }

    public final /* synthetic */ void a(cn1 cn1Var, vf1 vf1Var, hm1 hm1Var, IOException iOException, boolean z10) {
        cn1Var.a(this.f147285a, this.f147286b, vf1Var, hm1Var, iOException, z10);
    }

    public final /* synthetic */ void a(cn1 cn1Var, ym1 ym1Var, hm1 hm1Var) {
        cn1Var.a(this.f147285a, ym1Var, hm1Var);
    }

    public final void a(final vf1 vf1Var, final hm1 hm1Var) {
        for (an1 an1Var : this.f147287c) {
            final cn1 cn1Var = an1Var.f146872b;
            ib3.a(an1Var.f146871a, new Runnable() { // from class: yads.dy3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f148415b.a(cn1Var, vf1Var, hm1Var);
                }
            });
        }
    }

    public final void a(final vf1 vf1Var, final hm1 hm1Var, final IOException iOException, final boolean z10) {
        for (an1 an1Var : this.f147287c) {
            final cn1 cn1Var = an1Var.f146872b;
            ib3.a(an1Var.f146871a, new Runnable() { // from class: yads.ay3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f146969b.a(cn1Var, vf1Var, hm1Var, iOException, z10);
                }
            });
        }
    }
}
