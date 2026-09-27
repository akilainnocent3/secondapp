package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Il f95872a;

    public Gl(Il il2) {
        this.f95872a = il2;
    }

    public final void a(String str, Kl kl2, C5080gm c5080gm) {
        ArrayList arrayList;
        synchronized (this.f95872a.f95953b) {
            try {
                Collection collection = (Collection) this.f95872a.f95952a.f98186a.get(str);
                arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Rl) it.next()).a(kl2, c5080gm);
        }
    }
}
