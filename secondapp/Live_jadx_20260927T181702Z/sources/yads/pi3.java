package yads;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pi3 implements t10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f153942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mh1 f153943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f153944c;

    public /* synthetic */ pi3() {
        this(new Object(), new mh1());
    }

    public static final void b(pi3 pi3Var) {
        Iterator it = pi3Var.a().iterator();
        while (it.hasNext()) {
            ((t10) it.next()).onVideoError();
        }
    }

    public static final void c(pi3 pi3Var) {
        Iterator it = pi3Var.a().iterator();
        while (it.hasNext()) {
            ((t10) it.next()).onVideoPaused();
        }
    }

    public static final void d(pi3 pi3Var) {
        Iterator it = pi3Var.a().iterator();
        while (it.hasNext()) {
            ((t10) it.next()).onVideoPrepared();
        }
    }

    public static final void e(pi3 pi3Var) {
        Iterator it = pi3Var.a().iterator();
        while (it.hasNext()) {
            ((t10) it.next()).onVideoResumed();
        }
    }

    public final HashSet a() {
        HashSet hashSet;
        synchronized (this.f153942a) {
            hashSet = new HashSet(this.f153944c);
        }
        return hashSet;
    }

    @Override // yads.t10
    public final void onVideoCompleted() {
        this.f153943b.a(new Runnable() { // from class: yads.j84
            @Override // java.lang.Runnable
            public final void run() {
                pi3.a(this.f150972b);
            }
        });
    }

    @Override // yads.t10
    public final void onVideoError() {
        this.f153943b.a(new Runnable() { // from class: yads.i84
            @Override // java.lang.Runnable
            public final void run() {
                pi3.b(this.f150478b);
            }
        });
    }

    @Override // yads.t10
    public final void onVideoPaused() {
        this.f153943b.a(new Runnable() { // from class: yads.h84
            @Override // java.lang.Runnable
            public final void run() {
                pi3.c(this.f149977b);
            }
        });
    }

    @Override // yads.t10
    public final void onVideoPrepared() {
        this.f153943b.a(new Runnable() { // from class: yads.g84
            @Override // java.lang.Runnable
            public final void run() {
                pi3.d(this.f149470b);
            }
        });
    }

    @Override // yads.t10
    public final void onVideoResumed() {
        this.f153943b.a(new Runnable() { // from class: yads.f84
            @Override // java.lang.Runnable
            public final void run() {
                pi3.e(this.f149022b);
            }
        });
    }

    public static final void a(pi3 pi3Var) {
        Iterator it = pi3Var.a().iterator();
        while (it.hasNext()) {
            ((t10) it.next()).onVideoCompleted();
        }
    }

    public pi3(Object obj, mh1 mh1Var) {
        this.f153942a = obj;
        this.f153943b = mh1Var;
        this.f153944c = new LinkedHashSet();
    }
}
