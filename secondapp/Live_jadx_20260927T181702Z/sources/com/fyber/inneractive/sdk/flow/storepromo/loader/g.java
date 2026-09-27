package com.fyber.inneractive.sdk.flow.storepromo.loader;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.model.vast.v;
import com.fyber.inneractive.sdk.network.l0;
import com.fyber.inneractive.sdk.network.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f44911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CountDownLatch f44912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.b f44913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.model.c f44914d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f44916f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f44915e = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44917g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f44918h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f44919i = false;

    public g(v vVar, com.fyber.inneractive.sdk.flow.storepromo.b bVar) {
        this.f44911a = vVar;
        this.f44916f = vVar.f45236f.size();
        this.f44913c = bVar;
        this.f44914d = new com.fyber.inneractive.sdk.flow.storepromo.model.c(vVar);
    }

    public final void a(com.fyber.inneractive.sdk.flow.storepromo.events.a aVar, boolean z10, String str, String str2) {
        f fVar;
        this.f44912b.countDown();
        if (this.f44919i) {
            return;
        }
        if (z10) {
            this.f44919i = true;
            this.f44918h = true;
            a();
            if (TextUtils.isEmpty(str)) {
                str = "Something went wrong during promo's resources download";
            }
            com.fyber.inneractive.sdk.flow.storepromo.b bVar = this.f44913c;
            if (bVar != null) {
                if (aVar == null) {
                    aVar = com.fyber.inneractive.sdk.flow.storepromo.events.a.DOWNLOAD_RESOURCE_ERROR;
                }
                bVar.a(aVar.name(), str, str2);
                return;
            }
            return;
        }
        if (this.f44912b.getCount() != 0 || this.f44918h) {
            return;
        }
        this.f44919i = true;
        Collections.sort(this.f44914d.f44953a);
        this.f44915e.clear();
        com.fyber.inneractive.sdk.flow.storepromo.b bVar2 = this.f44913c;
        if (bVar2 != null) {
            com.fyber.inneractive.sdk.flow.storepromo.model.c cVar = this.f44914d;
            IAlog.a("StorePromoManager : onPromoLoadSucceed", new Object[0]);
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar3 = new com.fyber.inneractive.sdk.flow.storepromo.controller.b(cVar, bVar2, bVar2, bVar2, bVar2.f44870b, bVar2.f44871c);
            bVar2.f44872d = bVar3;
            bVar2.f44875g = cVar.f44961i;
            com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar2 = bVar3.f44881c;
            if (cVar2 == null || (fVar = cVar2.f44891d) == null) {
                return;
            }
            r.f47891a.execute(new e(fVar, new d(fVar)));
        }
    }

    public final void a() {
        for (t0 t0Var : this.f44915e) {
            l0 l0Var = IAConfigManager.O.f44309s;
            String str = t0Var.f45376g;
            l0Var.getClass();
            t0Var.c();
        }
        this.f44915e.clear();
    }
}
