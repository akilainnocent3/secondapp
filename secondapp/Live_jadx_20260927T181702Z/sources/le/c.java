package le;

import ae.n;
import ee.j;
import ee.r;
import ee.w;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import me.y;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class c implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f103876f = Logger.getLogger(w.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f103877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f103878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fe.e f103879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ne.d f103880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oe.b f103881e;

    @cr.a
    public c(Executor executor, fe.e eVar, y yVar, ne.d dVar, oe.b bVar) {
        this.f103878b = executor;
        this.f103879c = eVar;
        this.f103877a = yVar;
        this.f103880d = dVar;
        this.f103881e = bVar;
    }

    public static /* synthetic */ Object b(c cVar, r rVar, j jVar) {
        cVar.f103880d.c1(rVar, jVar);
        cVar.f103877a.a(rVar, 1);
        return null;
    }

    public static /* synthetic */ void c(final c cVar, final r rVar, n nVar, j jVar) {
        cVar.getClass();
        try {
            fe.n nVar2 = cVar.f103879c.get(rVar.b());
            if (nVar2 == null) {
                String str = String.format("Transport backend '%s' is not registered", rVar.b());
                f103876f.warning(str);
                nVar.a(new IllegalArgumentException(str));
            } else {
                final j jVarB = nVar2.b(jVar);
                cVar.f103881e.a(new oe.b.a() { // from class: le.b
                    @Override // oe.b.a
                    public final Object execute() {
                        return c.b(this.f103873a, rVar, jVarB);
                    }
                });
                nVar.a(null);
            }
        } catch (Exception e10) {
            f103876f.warning("Error scheduling event " + e10.getMessage());
            nVar.a(e10);
        }
    }

    @Override // le.e
    public void a(final r rVar, final j jVar, final n nVar) {
        this.f103878b.execute(new Runnable() { // from class: le.a
            @Override // java.lang.Runnable
            public final void run() {
                c.c(this.f103869b, rVar, nVar, jVar);
            }
        });
    }
}
