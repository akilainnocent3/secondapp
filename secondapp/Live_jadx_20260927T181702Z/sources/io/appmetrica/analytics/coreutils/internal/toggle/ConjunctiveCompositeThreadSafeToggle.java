package io.appmetrica.analytics.coreutils.internal.toggle;

import dr.i1;
import dr.j1;
import dr.w2;
import fw.b;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.m1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class ConjunctiveCompositeThreadSafeToggle implements Toggle {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f95372c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f95374e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f95370a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f95371b = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReentrantLock f95373d = new ReentrantLock();

    public ConjunctiveCompositeThreadSafeToggle(@l List<? extends Toggle> list, @l String str) {
        this.f95372c = "[ConjunctiveCompositeToggle-" + str + b.f85385l;
        try {
            access$acquireLock(this);
            for (final Toggle toggle : list) {
                ToggleObserver toggleObserver = new ToggleObserver() { // from class: io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle$1$1$observer$1
                    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
                    public void onStateChanged(boolean z10) {
                        ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle = this.f95375a;
                        Toggle toggle2 = toggle;
                        try {
                            ConjunctiveCompositeThreadSafeToggle.access$acquireLock(conjunctiveCompositeThreadSafeToggle);
                            ConjunctiveCompositeThreadSafeToggle.access$updateState(conjunctiveCompositeThreadSafeToggle, this, z10, String.valueOf(m1.d(toggle2.getClass()).K()));
                        } finally {
                            ConjunctiveCompositeThreadSafeToggle.access$releaseLock(conjunctiveCompositeThreadSafeToggle);
                        }
                    }
                };
                this.f95371b.put(toggleObserver, Boolean.valueOf(toggle.getActualState()));
                toggle.registerObserver(toggleObserver, false);
            }
            setActualState(a(this.f95371b.values()));
        } finally {
            access$releaseLock(this);
        }
    }

    private static boolean a(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!((Boolean) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final void access$acquireLock(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle) {
        conjunctiveCompositeThreadSafeToggle.getClass();
        boolean zTryLock = false;
        while (!zTryLock) {
            try {
                i1.a aVar = i1.f79460c;
                zTryLock = conjunctiveCompositeThreadSafeToggle.f95373d.tryLock(100L, TimeUnit.MILLISECONDS);
                i1.b(w2.f79517a);
            } catch (Throwable th2) {
                i1.a aVar2 = i1.f79460c;
                i1.b(j1.a(th2));
            }
            if (!zTryLock) {
                try {
                    i1.a aVar3 = i1.f79460c;
                    Thread.sleep(100L);
                    i1.b(w2.f79517a);
                } catch (Throwable th3) {
                    i1.a aVar4 = i1.f79460c;
                    i1.b(j1.a(th3));
                }
            }
        }
    }

    public static final void access$releaseLock(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle) {
        conjunctiveCompositeThreadSafeToggle.f95373d.unlock();
    }

    public static final void access$updateState(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle, ToggleObserver toggleObserver, boolean z10, String str) {
        conjunctiveCompositeThreadSafeToggle.f95371b.put(toggleObserver, Boolean.valueOf(z10));
        boolean zA = a(conjunctiveCompositeThreadSafeToggle.f95371b.values());
        if (zA != conjunctiveCompositeThreadSafeToggle.getActualState()) {
            conjunctiveCompositeThreadSafeToggle.setActualState(zA);
            Iterator it = conjunctiveCompositeThreadSafeToggle.f95370a.iterator();
            while (it.hasNext()) {
                ((ToggleObserver) it.next()).onStateChanged(zA);
            }
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public boolean getActualState() {
        return this.f95374e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public void registerObserver(@l ToggleObserver toggleObserver, boolean z10) {
        try {
            access$acquireLock(this);
            this.f95370a.add(toggleObserver);
            if (z10) {
                toggleObserver.onStateChanged(getActualState());
            }
        } finally {
            access$releaseLock(this);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public void removeObserver(@l ToggleObserver toggleObserver) {
        try {
            access$acquireLock(this);
            this.f95370a.remove(toggleObserver);
        } finally {
            access$releaseLock(this);
        }
    }

    public void setActualState(boolean z10) {
        this.f95374e = z10;
    }

    @l
    public String toString() {
        return "ConjunctiveCompositeThreadSafeToggle(toggleStates=" + this.f95371b + ", tag='" + this.f95372c + "', actualState=" + getActualState() + ')';
    }
}
