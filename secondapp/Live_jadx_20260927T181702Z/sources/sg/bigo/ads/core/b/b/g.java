package sg.bigo.ads.core.b.b;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.common.utils.p;

/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final sg.bigo.ads.core.b.a.a f134568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.a> f134569b = p.a(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.a> f134570c = p.a(a());

    public g(@NonNull sg.bigo.ads.core.b.a.a aVar) {
        this.f134568a = aVar;
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.g.1
            @Override // java.lang.Runnable
            public final void run() {
                g.a(g.this);
            }
        });
    }

    public int a() {
        return this.f134568a.f134519a;
    }

    public List<sg.bigo.ads.common.g.b.a> b() {
        return sg.bigo.ads.common.g.c.a.a(this.f134568a.a());
    }

    public final synchronized List<sg.bigo.ads.common.g.b.a> c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.f134569b);
            Iterator<sg.bigo.ads.common.g.b.a> it = this.f134570c.iterator();
            while (it.hasNext()) {
                arrayList.remove(it.next());
            }
            this.f134569b.clear();
            this.f134570c.addAll(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized int d() {
        return this.f134569b.size();
    }

    public final synchronized boolean e() {
        return this.f134569b.isEmpty();
    }

    public final synchronized void f() {
        try {
            if (this.f134569b.isEmpty()) {
                List<sg.bigo.ads.common.g.b.a> listB = b();
                Iterator<sg.bigo.ads.common.g.b.a> it = this.f134570c.iterator();
                while (it.hasNext()) {
                    listB.remove(it.next());
                }
                this.f134569b.addAll(listB);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void g() {
        this.f134570c.clear();
        this.f134569b.clear();
    }

    public final synchronized void a(List<sg.bigo.ads.common.g.b.a> list, boolean z10) {
        try {
            this.f134570c.removeAll(list);
            if (!z10) {
                this.f134569b.addAll(list);
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
        this.f134569b.add(aVar);
        aVar.f133035a = sg.bigo.ads.common.g.c.a.a(aVar);
    }

    public static /* synthetic */ void a(g gVar) {
        sg.bigo.ads.common.g.c.a.a(System.currentTimeMillis() - ((long) gVar.f134568a.f134521c));
        gVar.f134569b.addAll(gVar.b());
    }
}
