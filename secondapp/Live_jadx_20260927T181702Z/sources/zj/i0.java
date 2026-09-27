package zj;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class i0<T> implements dl.b<T>, dl.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final dl.a.InterfaceC0773a<Object> f161941c = new dl.a.InterfaceC0773a() { // from class: zj.f0
        @Override // dl.a.InterfaceC0773a
        public final void a(dl.b bVar) {
            i0.d(bVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final dl.b<Object> f161942d = new dl.b() { // from class: zj.g0
        @Override // dl.b
        public final Object get() {
            return i0.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @k.a0("this")
    public dl.a.InterfaceC0773a<T> f161943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile dl.b<T> f161944b;

    public i0(dl.a.InterfaceC0773a<T> interfaceC0773a, dl.b<T> bVar) {
        this.f161943a = interfaceC0773a;
        this.f161944b = bVar;
    }

    public static /* synthetic */ Object b() {
        return null;
    }

    public static /* synthetic */ void c(dl.a.InterfaceC0773a interfaceC0773a, dl.a.InterfaceC0773a interfaceC0773a2, dl.b bVar) {
        interfaceC0773a.a(bVar);
        interfaceC0773a2.a(bVar);
    }

    public static <T> i0<T> e() {
        return new i0<>(f161941c, f161942d);
    }

    public static <T> i0<T> f(dl.b<T> bVar) {
        return new i0<>(null, bVar);
    }

    @Override // dl.a
    public void a(@NonNull final dl.a.InterfaceC0773a<T> interfaceC0773a) {
        dl.b<T> bVar;
        dl.b<T> bVar2;
        dl.b<T> bVar3 = this.f161944b;
        dl.b<Object> bVar4 = f161942d;
        if (bVar3 != bVar4) {
            interfaceC0773a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f161944b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final dl.a.InterfaceC0773a<T> interfaceC0773a2 = this.f161943a;
                this.f161943a = new dl.a.InterfaceC0773a() { // from class: zj.h0
                    @Override // dl.a.InterfaceC0773a
                    public final void a(dl.b bVar5) {
                        i0.c(interfaceC0773a2, interfaceC0773a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0773a.a(bVar);
        }
    }

    public void g(dl.b<T> bVar) {
        dl.a.InterfaceC0773a<T> interfaceC0773a;
        if (this.f161944b != f161942d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0773a = this.f161943a;
            this.f161943a = null;
            this.f161944b = bVar;
        }
        interfaceC0773a.a(bVar);
    }

    @Override // dl.b
    public T get() {
        return this.f161944b.get();
    }

    public static /* synthetic */ void d(dl.b bVar) {
    }
}
