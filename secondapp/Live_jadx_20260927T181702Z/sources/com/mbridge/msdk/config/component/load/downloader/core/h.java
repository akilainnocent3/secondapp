package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.config.component.load.downloader.c f65426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f65427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile d f65428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f65429d;

    public h(d<?> dVar) {
        this.f65428c = dVar;
        this.f65426a = dVar.e();
        this.f65427b = dVar.i();
    }

    @Override // java.lang.Runnable
    public void run() {
        q0.a(IDownloadTask.TAG, "开始下载任务");
        if (this.f65428c.j() != com.mbridge.msdk.config.component.load.downloader.e.RETRY) {
            this.f65428c.d(this.f65428c.d());
        }
        this.f65428c.a(com.mbridge.msdk.config.component.load.downloader.e.RUNNING);
        this.f65429d = this.f65428c.d();
        q0.a(IDownloadTask.TAG, "filePath ： " + this.f65429d.e());
        com.mbridge.msdk.config.component.load.downloader.d dVarRun = g.a(this.f65428c, this.f65429d, l.c().b()).run();
        if (dVarRun.c()) {
            this.f65428c.e(this.f65429d);
        } else if (dVarRun.a() != null) {
            this.f65428c.a(this.f65429d, dVarRun.a());
        } else if (dVarRun.b()) {
            this.f65428c.b(this.f65429d);
        }
    }
}
