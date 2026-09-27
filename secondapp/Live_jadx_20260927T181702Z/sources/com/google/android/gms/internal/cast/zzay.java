package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.cast.CastMediaControlIntent;
import com.google.android.gms.cast.internal.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r7.h1;
import r7.i1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzay extends i1.a {
    private static final Logger zzb = new Logger("MRDiscoveryCallback");
    private final zzbg zzf;
    private final Map zzd = Collections.synchronizedMap(new HashMap());
    private final LinkedHashSet zze = new LinkedHashSet();
    private final Set zzc = Collections.synchronizedSet(new LinkedHashSet());
    public final zzax zza = new zzax(this);

    public zzay(Context context) {
        this.zzf = new zzbg(context);
    }

    @Override // r7.i1.a
    public final void onRouteAdded(i1 i1Var, i1.h hVar) {
        zzb.d("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        zzf(hVar, true);
    }

    @Override // r7.i1.a
    public final void onRouteChanged(i1 i1Var, i1.h hVar) {
        zzb.d("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        zzf(hVar, true);
    }

    @Override // r7.i1.a
    public final void onRouteRemoved(i1 i1Var, i1.h hVar) {
        zzb.d("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        zzf(hVar, false);
    }

    public final void zza(List list) {
        zzb.d("SetRouteDiscovery for " + list.size() + " IDs", new Object[0]);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(zzes.zza((String) it.next()));
        }
        zzb.d("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
        HashMap map = new HashMap();
        synchronized (this.zzd) {
            try {
                for (String str : linkedHashSet) {
                    zzaw zzawVar = (zzaw) this.zzd.get(zzes.zza(str));
                    if (zzawVar != null) {
                        map.put(str, zzawVar);
                    }
                }
                this.zzd.clear();
                this.zzd.putAll(map);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzb.d("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
        synchronized (this.zze) {
            this.zze.clear();
            this.zze.addAll(linkedHashSet);
        }
        zzb();
    }

    public final void zzb() {
        LinkedHashSet linkedHashSet = this.zze;
        Logger logger = zzb;
        logger.d("Starting RouteDiscovery with " + linkedHashSet.size() + " IDs", new Object[0]);
        logger.d("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzc();
        } else {
            new zzed(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzav
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc();
                }
            });
        }
    }

    public final void zzc() {
        this.zzf.zzb(this);
        synchronized (this.zze) {
            try {
                for (String str : this.zze) {
                    h1 h1VarD = new h1.a().b(CastMediaControlIntent.categoryForCast(str)).d();
                    if (((zzaw) this.zzd.get(str)) == null) {
                        this.zzd.put(str, new zzaw(h1VarD));
                    }
                    zzb.d("Adding mediaRouter callback for control category " + CastMediaControlIntent.categoryForCast(str), new Object[0]);
                    this.zzf.zza().b(h1VarD, this, 4);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzb.d("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
    }

    public final void zzd() {
        zzb.d("Stopping RouteDiscovery.", new Object[0]);
        this.zzd.clear();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.zzf.zzb(this);
        } else {
            new zzed(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzau
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze();
                }
            });
        }
    }

    public final void zze() {
        this.zzf.zzb(this);
    }

    @k.h1
    public final void zzf(i1.h hVar, boolean z10) {
        boolean z11;
        boolean zRemove;
        Logger logger = zzb;
        logger.d("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z10), hVar);
        synchronized (this.zzd) {
            try {
                logger.d("appIdToRouteInfo has these appId route keys: " + String.valueOf(this.zzd.keySet()), new Object[0]);
                z11 = false;
                for (Map.Entry entry : this.zzd.entrySet()) {
                    String str = (String) entry.getKey();
                    zzaw zzawVar = (zzaw) entry.getValue();
                    if (hVar.K(zzawVar.zzb)) {
                        if (z10) {
                            Logger logger2 = zzb;
                            logger2.d("Adding/updating route for appId " + str, new Object[0]);
                            zRemove = zzawVar.zza.add(hVar);
                            if (!zRemove) {
                                logger2.w("Route " + String.valueOf(hVar) + " already exists for appId " + str, new Object[0]);
                            }
                        } else {
                            Logger logger3 = zzb;
                            logger3.d("Removing route for appId " + str, new Object[0]);
                            zRemove = zzawVar.zza.remove(hVar);
                            if (!zRemove) {
                                logger3.w("Route " + String.valueOf(hVar) + " already removed from appId " + str, new Object[0]);
                            }
                        }
                        z11 = zRemove;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            zzb.d("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.zzc) {
                try {
                    HashMap map = new HashMap();
                    synchronized (this.zzd) {
                        try {
                            for (String str2 : this.zzd.keySet()) {
                                zzaw zzawVar2 = (zzaw) this.zzd.get(zzes.zza(str2));
                                zzfu zzfuVarZzk = zzawVar2 == null ? zzfu.zzk() : zzfu.zzj(zzawVar2.zza);
                                if (!zzfuVarZzk.isEmpty()) {
                                    map.put(str2, zzfuVarZzk);
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    zzft.zzc(map.entrySet());
                    Iterator it = this.zzc.iterator();
                    while (it.hasNext()) {
                        ((com.google.android.gms.cast.framework.zzbg) it.next()).zza();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }
}
