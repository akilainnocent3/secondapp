package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class SimpleThreadSafeToggle implements Toggle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f95379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f95380c;

    public SimpleThreadSafeToggle(boolean z10, @l String str) {
        this.f95378a = str;
        this.f95379b = z10;
        this.f95380c = new ArrayList();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized boolean getActualState() {
        return this.f95379b;
    }

    @l
    public final String getTag() {
        return this.f95378a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void registerObserver(@l ToggleObserver toggleObserver, boolean z10) {
        this.f95380c.add(toggleObserver);
        if (z10) {
            toggleObserver.onStateChanged(getActualState());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void removeObserver(@l ToggleObserver toggleObserver) {
        this.f95380c.remove(toggleObserver);
    }

    public final synchronized void updateState(boolean z10) {
        if (z10 != getActualState()) {
            this.f95379b = z10;
            Iterator it = this.f95380c.iterator();
            while (it.hasNext()) {
                ((ToggleObserver) it.next()).onStateChanged(z10);
            }
        }
    }

    public /* synthetic */ SimpleThreadSafeToggle(boolean z10, String str, int i10, x xVar) {
        this((i10 & 1) != 0 ? false : z10, str);
    }
}
