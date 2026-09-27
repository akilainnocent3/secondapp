package com.iab.omid.library.prebidorg.walking.async;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zs implements zr.zz {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private final ThreadPoolExecutor f53777zr;

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    private final ArrayDeque f53778zs = new ArrayDeque();

    /* JADX INFO: renamed from: zt, reason: collision with root package name */
    private zr f53779zt = null;
    private final BlockingQueue zz;

    public zs() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zz = linkedBlockingQueue;
        this.f53777zr = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void zz() {
        zr zrVar = (zr) this.f53778zs.poll();
        this.f53779zt = zrVar;
        if (zrVar != null) {
            zrVar.zz(this.f53777zr);
        }
    }

    public void zr(zr zrVar) {
        zrVar.zz(this);
        this.f53778zs.add(zrVar);
        if (this.f53779zt == null) {
            zz();
        }
    }

    @Override // com.iab.omid.library.prebidorg.walking.async.zr.zz
    public void zz(zr zrVar) {
        this.f53779zt = null;
        zz();
    }
}
