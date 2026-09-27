package sg.bigo.ads.core.b.b;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.common.utils.p;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.a> f134547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.a> f134548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sg.bigo.ads.core.b.a.a f134549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f134550d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f134551e;

    public b(@NonNull sg.bigo.ads.core.b.a.a aVar) {
        this.f134549c = aVar;
        this.f134547a = p.a(aVar.f134519a);
        this.f134548b = p.a(aVar.f134519a);
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.b.1
            @Override // java.lang.Runnable
            public final void run() {
                b.a(b.this);
            }
        });
    }

    private void f() {
        c cVar = this.f134551e;
        if (cVar == null || cVar.b()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f134550d;
        if (jCurrentTimeMillis - j10 >= 300000) {
            c cVar2 = this.f134551e;
            sg.bigo.ads.core.d.b.a(j10, cVar2.f134553a, cVar2.f134554b, cVar2.f134555c, cVar2.f134556d);
            this.f134550d = jCurrentTimeMillis;
            sg.bigo.ads.common.x.a.d(jCurrentTimeMillis);
            this.f134551e.c();
        }
    }

    private List<sg.bigo.ads.common.g.b.a> g() {
        return sg.bigo.ads.common.g.c.a.a(this.f134549c.a());
    }

    public final synchronized List<sg.bigo.ads.common.g.b.a> a() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.f134547a);
            Iterator<sg.bigo.ads.common.g.b.a> it = this.f134548b.iterator();
            while (it.hasNext()) {
                arrayList.remove(it.next());
            }
            this.f134547a.clear();
            this.f134548b.addAll(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized int b() {
        return this.f134547a.size();
    }

    public final synchronized boolean c() {
        return this.f134547a.isEmpty();
    }

    public final synchronized void d() {
        try {
            if (this.f134547a.isEmpty()) {
                List<sg.bigo.ads.common.g.b.a> listG = g();
                Iterator<sg.bigo.ads.common.g.b.a> it = this.f134548b.iterator();
                while (it.hasNext()) {
                    listG.remove(it.next());
                }
                this.f134547a.addAll(listG);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e() {
        this.f134548b.clear();
        this.f134547a.clear();
    }

    public final synchronized void a(List<sg.bigo.ads.common.g.b.a> list, boolean z10) {
        try {
            this.f134548b.removeAll(list);
            if (!z10) {
                this.f134547a.addAll(list);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<sg.bigo.ads.common.g.b.a> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(it.next().f133035a));
            }
            sg.bigo.ads.common.g.c.a.a(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(sg.bigo.ads.common.g.b.a aVar) {
        this.f134547a.add(aVar);
        aVar.f133035a = sg.bigo.ads.common.g.c.a.a(aVar);
        f();
        this.f134551e.a(aVar.f133036b);
    }

    public static /* synthetic */ void a(b bVar) {
        sg.bigo.ads.common.g.c.a.a(System.currentTimeMillis() - ((long) bVar.f134549c.f134521c));
        bVar.f134547a.addAll(bVar.g());
        long j10 = sg.bigo.ads.common.x.a.j();
        bVar.f134550d = j10;
        if (j10 == 0) {
            bVar.f134550d = System.currentTimeMillis();
        }
        bVar.f134551e = c.a();
        bVar.f();
    }
}
