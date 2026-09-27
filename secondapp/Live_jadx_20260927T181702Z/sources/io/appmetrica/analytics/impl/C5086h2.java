package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5086h2 implements InterfaceC5232mk, ApplicationStateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f97482a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f97483b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile ApplicationState f97484c = ApplicationState.UNKNOWN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f97485d = new CopyOnWriteArraySet();

    public final void a(int i10) {
        this.f97482a.remove(Integer.valueOf(i10));
        a();
    }

    public final void b(int i10) {
        this.f97483b.add(Integer.valueOf(i10));
        this.f97482a.remove(Integer.valueOf(i10));
        a();
    }

    public final void c(int i10) {
        this.f97482a.add(Integer.valueOf(i10));
        this.f97483b.remove(Integer.valueOf(i10));
        a();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    @NonNull
    public final ApplicationState getCurrentState() {
        return this.f97484c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5232mk
    public final void onCreate() {
        a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5232mk
    public final void onDestroy() {
        if (this.f97484c == ApplicationState.VISIBLE) {
            this.f97484c = ApplicationState.BACKGROUND;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    @NonNull
    public final ApplicationState registerStickyObserver(@Nullable ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.f97485d.add(applicationStateObserver);
        }
        return this.f97484c;
    }

    public final void a() {
        ApplicationState applicationState = ApplicationState.UNKNOWN;
        if (!this.f97482a.isEmpty()) {
            applicationState = ApplicationState.VISIBLE;
        } else if (!this.f97483b.isEmpty()) {
            applicationState = ApplicationState.BACKGROUND;
        }
        if (this.f97484c != applicationState) {
            this.f97484c = applicationState;
            Iterator it = this.f97485d.iterator();
            while (it.hasNext()) {
                ((ApplicationStateObserver) it.next()).onApplicationStateChanged(this.f97484c);
            }
        }
    }
}
