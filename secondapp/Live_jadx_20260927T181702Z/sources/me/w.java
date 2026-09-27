package me;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f107327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne.d f107328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f107329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oe.b f107330d;

    @cr.a
    public w(Executor executor, ne.d dVar, y yVar, oe.b bVar) {
        this.f107327a = executor;
        this.f107328b = dVar;
        this.f107329c = yVar;
        this.f107330d = bVar;
    }

    public static /* synthetic */ Object a(w wVar) {
        Iterator<ee.r> it = wVar.f107328b.M0().iterator();
        while (it.hasNext()) {
            wVar.f107329c.a(it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f107327a.execute(new Runnable() { // from class: me.u
            @Override // java.lang.Runnable
            public final void run() {
                w wVar = this.f107325b;
                wVar.f107330d.a(new oe.b.a() { // from class: me.v
                    @Override // oe.b.a
                    public final Object execute() {
                        return w.a(wVar);
                    }
                });
            }
        });
    }
}
