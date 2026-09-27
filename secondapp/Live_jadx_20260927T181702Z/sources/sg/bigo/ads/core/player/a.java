package sg.bigo.ads.core.player;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c f135144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Map<String, b> f135145b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Map<String, RunnableC1385a> f135146c = new HashMap();

    /* JADX INFO: renamed from: sg.bigo.ads.core.player.a$a, reason: collision with other inner class name */
    public class RunnableC1385a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<sg.bigo.ads.common.h.a> f135147a;

        public RunnableC1385a(sg.bigo.ads.common.h.a aVar) {
            this.f135147a = new WeakReference<>(aVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    WeakReference<sg.bigo.ads.common.h.a> weakReference = RunnableC1385a.this.f135147a;
                    if (weakReference == null || weakReference.get() == null) {
                        return;
                    }
                    RunnableC1385a runnableC1385a = RunnableC1385a.this;
                    a.this.f135146c.remove(runnableC1385a.f135147a.get().f133057a);
                    RunnableC1385a runnableC1385a2 = RunnableC1385a.this;
                    a.this.f135144a.c(runnableC1385a2.f135147a.get());
                }
            });
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        sg.bigo.ads.common.h.a f135150a;

        public b(sg.bigo.ads.common.h.a aVar) {
            this.f135150a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    b bVar = b.this;
                    sg.bigo.ads.common.h.a aVar = bVar.f135150a;
                    if (aVar != null) {
                        a.this.f135145b.remove(aVar.f133057a);
                        b bVar2 = b.this;
                        a.this.f135144a.b(bVar2.f135150a);
                        str = "call onDownloadFillTime";
                    } else {
                        str = "downloadInfo is null, not call onDownloadFillTime";
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", str);
                }
            });
        }
    }

    public interface c {
        void b(sg.bigo.ads.common.h.a aVar);

        void c(sg.bigo.ads.common.h.a aVar);
    }

    public a(c cVar) {
        this.f135144a = cVar;
    }

    public final void a(sg.bigo.ads.common.h.a aVar) {
        if (aVar.c()) {
            if (aVar.e() > 0) {
                c(aVar);
            }
            if (aVar.f() > 0) {
                if (this.f135146c.containsKey(aVar.f133057a)) {
                    sg.bigo.ads.common.n.d.a(this.f135146c.remove(aVar.f133057a));
                }
                RunnableC1385a runnableC1385a = new RunnableC1385a(aVar);
                this.f135146c.put(aVar.f133057a, runnableC1385a);
                sg.bigo.ads.common.n.d.a(3, runnableC1385a, ((long) aVar.f()) * 1000);
            }
        }
    }

    public final void b(sg.bigo.ads.common.h.a aVar) {
        if (this.f135146c.containsKey(aVar.f133057a)) {
            sg.bigo.ads.common.n.d.a(this.f135146c.get(aVar.f133057a));
            this.f135146c.remove(aVar.f133057a);
        }
    }

    public final void c(sg.bigo.ads.common.h.a aVar) {
        if (this.f135145b.containsKey(aVar.f133057a)) {
            sg.bigo.ads.common.n.d.a(this.f135145b.remove(aVar.f133057a));
            sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", "fillTimeRunnableList.containsKey: " + aVar.f133057a);
        }
        b bVar = new b(aVar);
        this.f135145b.put(aVar.f133057a, bVar);
        sg.bigo.ads.common.n.d.a(3, bVar, ((long) aVar.e()) * 1000);
        sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", "startFillTimeRunnable at: " + aVar.e());
    }
}
