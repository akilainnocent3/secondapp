package cj;

import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public final class a4<T> extends c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Queue<T> f23336d;

    public a4(Queue<T> queue) {
        this.f23336d = (Queue) zi.l0.E(queue);
    }

    @Override // cj.c
    @zq.a
    public T a() {
        return this.f23336d.isEmpty() ? b() : this.f23336d.remove();
    }
}
