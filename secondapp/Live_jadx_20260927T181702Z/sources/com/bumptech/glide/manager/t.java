package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<mc.p<?>> f31537b = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        this.f31537b.clear();
    }

    @NonNull
    public List<mc.p<?>> b() {
        return pc.o.l(this.f31537b);
    }

    public void c(@NonNull mc.p<?> pVar) {
        this.f31537b.add(pVar);
    }

    public void i(@NonNull mc.p<?> pVar) {
        this.f31537b.remove(pVar);
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
        Iterator it = pc.o.l(this.f31537b).iterator();
        while (it.hasNext()) {
            ((mc.p) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
        Iterator it = pc.o.l(this.f31537b).iterator();
        while (it.hasNext()) {
            ((mc.p) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.k
    public void onStop() {
        Iterator it = pc.o.l(this.f31537b).iterator();
        while (it.hasNext()) {
            ((mc.p) it.next()).onStop();
        }
    }
}
