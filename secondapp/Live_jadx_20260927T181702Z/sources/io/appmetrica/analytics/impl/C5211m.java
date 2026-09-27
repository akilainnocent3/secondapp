package io.appmetrica.analytics.impl;

import android.app.Activity;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5211m implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f97860a = new HashSet();

    public C5211m(@NonNull C5261o c5261o) {
        c5261o.registerListener(this, new ActivityEvent[0]);
    }

    public final synchronized void a(@NonNull InterfaceC5186l interfaceC5186l) {
        this.f97860a.add(interfaceC5186l);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @k.j0
    public final void onEvent(@NonNull Activity activity, @NonNull ActivityEvent activityEvent) {
        C4959c4.l().f97038c.a().execute(new RunnableC5160k(this, activity));
    }

    public final void a(@NonNull Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f97860a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C4974cj) ((InterfaceC5186l) it.next())).a(activity);
        }
    }
}
