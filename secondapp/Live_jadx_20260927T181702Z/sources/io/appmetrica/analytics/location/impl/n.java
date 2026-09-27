package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class n implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f98777a;

    public n(p pVar) {
        this.f98777a = pVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            p pVar = this.f98777a;
            pVar.getClass();
            String provider = location.getProvider();
            t tVar = (t) pVar.f98783e.get(provider);
            if (tVar == null) {
                t tVar2 = new t(pVar.f98779a.f98756a);
                tVar2.f98790c.add(pVar.f98781c);
                Iterator it = pVar.f98782d.iterator();
                while (it.hasNext()) {
                    tVar2.f98790c.add((Consumer) it.next());
                }
                pVar.f98783e.put(provider, tVar2);
                tVar = tVar2;
            } else {
                tVar.f98788a = pVar.f98779a.f98756a;
            }
            if (tVar.f98791d != null) {
                boolean zDidTimePassMillis = tVar.f98789b.didTimePassMillis(tVar.f98792e, tVar.f98788a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z10 = location.distanceTo(tVar.f98791d) > tVar.f98788a.getUpdateDistanceInterval();
                boolean z11 = tVar.f98791d == null || location.getTime() - tVar.f98791d.getTime() >= 0;
                if ((!zDidTimePassMillis && !z10) || !z11) {
                    return;
                }
            }
            tVar.f98791d = location;
            tVar.f98792e = System.currentTimeMillis();
            Iterator it2 = tVar.f98790c.iterator();
            while (it2.hasNext()) {
                ((Consumer) it2.next()).consume(location);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
