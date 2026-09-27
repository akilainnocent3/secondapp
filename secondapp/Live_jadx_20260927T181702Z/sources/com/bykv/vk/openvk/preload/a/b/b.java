package com.bykv.vk.openvk.preload.a.b;

import com.bykv.vk.openvk.preload.a.d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f31649a;

    public b(a... aVarArr) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f31649a = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(Arrays.asList(aVarArr));
    }

    public final void a(a aVar) {
        if (aVar == null) {
            return;
        }
        this.f31649a.add(aVar);
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
        for (a aVar : this.f31649a) {
            if (aVar != null) {
                aVar.b(bVar, dVar);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void c(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
        for (a aVar : this.f31649a) {
            if (aVar != null) {
                aVar.c(bVar, dVar);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar) {
        for (a aVar : this.f31649a) {
            if (aVar != null) {
                aVar.a(bVar, dVar);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void b(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar, Throwable th2) {
        for (a aVar : this.f31649a) {
            if (aVar != null) {
                aVar.b(bVar, dVar, th2);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void c(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar, Throwable th2) {
        for (a aVar : this.f31649a) {
            if (aVar != null) {
                aVar.c(bVar, dVar, th2);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b.a
    public final <T> void a(com.bykv.vk.openvk.preload.a.b<T> bVar, d dVar, Throwable th2) {
        for (a aVar : this.f31649a) {
            if (aVar != null) {
                aVar.a(bVar, dVar, th2);
            }
        }
    }
}
