package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.j;
import com.startapp.sdk.internal.o;
import com.startapp.sdk.internal.o6;
import com.startapp.sdk.internal.p;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f74312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o6 f74313b;

    public a(o6 o6Var, ArrayList arrayList) {
        this.f74313b = o6Var;
        this.f74312a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        j jVar = this.f74313b.f75284b;
        ArrayList<DiskAdCacheManager$DiskCacheKey> arrayList = this.f74312a;
        if (arrayList != null) {
            try {
                for (DiskAdCacheManager$DiskCacheKey diskAdCacheManager$DiskCacheKey : arrayList) {
                    jVar.f75014a.a(null, diskAdCacheManager$DiskCacheKey.placement, diskAdCacheManager$DiskCacheKey.adPreferences, true, diskAdCacheManager$DiskCacheKey.a(), null, null);
                }
            } catch (Throwable th2) {
                d9.a(th2);
            }
        }
        p pVar = jVar.f75014a;
        pVar.f75338c = false;
        for (o oVar : pVar.f75339d) {
            pVar.a(oVar.f75274a, oVar.f75275b, oVar.f75276c, false, 0, oVar.f75277d, null);
        }
        pVar.f75339d.clear();
    }
}
