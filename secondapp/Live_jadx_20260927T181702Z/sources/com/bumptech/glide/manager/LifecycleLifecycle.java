package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
final class LifecycleLifecycle implements j, a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Set<k> f31479b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final androidx.lifecycle.r f31480c;

    public LifecycleLifecycle(androidx.lifecycle.r rVar) {
        this.f31480c = rVar;
        rVar.addObserver(this);
    }

    @Override // com.bumptech.glide.manager.j
    public void a(@NonNull k kVar) {
        this.f31479b.remove(kVar);
    }

    @Override // com.bumptech.glide.manager.j
    public void d(@NonNull k kVar) {
        this.f31479b.add(kVar);
        if (this.f31480c.getCurrentState() == androidx.lifecycle.r.b.DESTROYED) {
            kVar.onDestroy();
        } else if (this.f31480c.getCurrentState().e(androidx.lifecycle.r.b.STARTED)) {
            kVar.onStart();
        } else {
            kVar.onStop();
        }
    }

    @n0(androidx.lifecycle.r.a.ON_DESTROY)
    public void onDestroy(@NonNull b0 b0Var) {
        Iterator it = pc.o.l(this.f31479b).iterator();
        while (it.hasNext()) {
            ((k) it.next()).onDestroy();
        }
        b0Var.getLifecycle().removeObserver(this);
    }

    @n0(androidx.lifecycle.r.a.ON_START)
    public void onStart(@NonNull b0 b0Var) {
        Iterator it = pc.o.l(this.f31479b).iterator();
        while (it.hasNext()) {
            ((k) it.next()).onStart();
        }
    }

    @n0(androidx.lifecycle.r.a.ON_STOP)
    public void onStop(@NonNull b0 b0Var) {
        Iterator it = pc.o.l(this.f31479b).iterator();
        while (it.hasNext()) {
            ((k) it.next()).onStop();
        }
    }
}
