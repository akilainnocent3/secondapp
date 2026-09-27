package yads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class h32 implements b02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f149913a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f149914b;

    @Override // yads.b02
    public final void a() {
        this.f149914b = false;
        Iterator it = this.f149913a.iterator();
        while (it.hasNext()) {
            ((b02) it.next()).a();
        }
    }

    @Override // yads.b02
    public final void b() {
        this.f149914b = true;
        Iterator it = this.f149913a.iterator();
        while (it.hasNext()) {
            ((b02) it.next()).b();
        }
    }
}
