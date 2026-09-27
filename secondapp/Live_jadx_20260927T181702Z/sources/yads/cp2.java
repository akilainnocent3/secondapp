package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class cp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f147850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f147851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityBlockingQueue f147852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityBlockingQueue f147853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mr f147854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xo f147855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bq2 f147856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a82[] f147857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public tr f147858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f147859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f147860k;

    public cp2(mr mrVar, xo xoVar, int i10) {
        this(mrVar, xoVar, i10, new gn0(new Handler(Looper.getMainLooper())));
    }

    public final void a(po2 po2Var) {
        po2Var.f154026i = this;
        synchronized (this.f147851b) {
            this.f147851b.add(po2Var);
        }
        po2Var.f154025h = Integer.valueOf(this.f147850a.incrementAndGet());
        po2Var.a("add-to-queue");
        a(po2Var, 0);
        if (po2Var.f154027j) {
            this.f147852c.add(po2Var);
        } else {
            this.f147853d.add(po2Var);
        }
    }

    public cp2(mr mrVar, xo xoVar, int i10, gn0 gn0Var) {
        this.f147850a = new AtomicInteger();
        this.f147851b = new HashSet();
        this.f147852c = new PriorityBlockingQueue();
        this.f147853d = new PriorityBlockingQueue();
        this.f147859j = new ArrayList();
        this.f147860k = new ArrayList();
        this.f147854e = mrVar;
        this.f147855f = xoVar;
        this.f147857h = new a82[i10];
        this.f147856g = gn0Var;
    }

    public final void a(bp2 bp2Var) {
        synchronized (this.f147851b) {
            try {
                for (po2 po2Var : this.f147851b) {
                    if (bp2Var.a(po2Var)) {
                        po2Var.a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(po2 po2Var, int i10) {
        uo2 uo2Var;
        synchronized (this.f147860k) {
            try {
                Iterator it = this.f147860k.iterator();
                while (it.hasNext()) {
                    ((ro2) ((ap2) it.next())).getClass();
                    po poVar = po2Var instanceof po ? (po) po2Var : null;
                    if (poVar != null && i10 == 3 && (uo2Var = poVar.f154012u) != null) {
                        uo2Var.b();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        tr trVar = this.f147858i;
        if (trVar != null) {
            trVar.f156022f = true;
            trVar.interrupt();
        }
        for (a82 a82Var : this.f147857h) {
            if (a82Var != null) {
                a82Var.f146704f = true;
                a82Var.interrupt();
            }
        }
        tr trVar2 = new tr(this.f147852c, this.f147853d, this.f147854e, this.f147856g);
        this.f147858i = trVar2;
        trVar2.start();
        for (int i10 = 0; i10 < this.f147857h.length; i10++) {
            a82 a82Var2 = new a82(this.f147853d, this.f147855f, this.f147854e, this.f147856g);
            this.f147857h[i10] = a82Var2;
            a82Var2.start();
        }
    }
}
