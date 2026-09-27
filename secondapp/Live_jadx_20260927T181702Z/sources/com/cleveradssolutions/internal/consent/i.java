package com.cleveradssolutions.internal.consent;

import android.view.View;
import f2.z1;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f43271b;

    public i(j jVar) {
        this.f43271b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f43271b;
        jVar.f43273b = false;
        androidx.customview.widget.d dVar = jVar.f43275d.A;
        if (dVar == null || !dVar.o(true)) {
            j jVar2 = this.f43271b;
            zm zmVar = jVar2.f43275d;
            if (zmVar.f43347z == 2) {
                zmVar.k(jVar2.f43272a);
                return;
            }
            return;
        }
        j jVar3 = this.f43271b;
        int i10 = jVar3.f43272a;
        WeakReference weakReference = jVar3.f43275d.H;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        jVar3.f43272a = i10;
        if (jVar3.f43273b) {
            return;
        }
        z1.u1((View) jVar3.f43275d.H.get(), jVar3.f43274c);
        jVar3.f43273b = true;
    }
}
