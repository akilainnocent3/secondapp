package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements com.fyber.inneractive.sdk.flow.nativead.mainasset.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f44771m = IAlog.a(f.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f44772n = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.i f44775c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t0 f44777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f44778f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InneractiveAdRequest f44780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f44781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f44782j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.j f44783k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f44773a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f44774b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f44776d = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f44779g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f44784l = new e(this);

    public f(com.fyber.inneractive.sdk.config.global.r rVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.nativead.j jVar, com.fyber.inneractive.sdk.response.nativead.i iVar, d dVar, String str) {
        this.f44781i = rVar;
        this.f44783k = jVar;
        this.f44780h = inneractiveAdRequest;
        this.f44775c = iVar;
        this.f44778f = dVar;
        this.f44782j = str;
    }

    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError, String str) {
        IAlog.f("%sonMainAssetLoadFailed: %s", f44771m, str != null ? "Failed to load native main media with message ".concat(str) : "Failed to load native main media");
        for (c cVar : this.f44773a) {
            if (cVar.a()) {
                cVar.destroy();
            }
        }
        String strDescription = inneractiveInfrastructureError.description();
        if (this.f44779g.compareAndSet(false, true)) {
            InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, com.fyber.inneractive.sdk.flow.i.NATIVE_AD_EMPTY_CONTENT);
            inneractiveInfrastructureError2.setCause(new com.fyber.inneractive.sdk.flow.nativead.mainasset.a(strDescription));
            d dVar = this.f44778f;
            dVar.getClass();
            com.fyber.inneractive.sdk.util.r.f47891a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(dVar.f44749b, dVar.f44748a, "send_failed_native_creatives", dVar.f44754g.b()), inneractiveInfrastructureError2));
            dVar.b(inneractiveInfrastructureError2);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x02ec */
    /* JADX WARN: Code duplicated, block: B:131:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.nativead.f.a():void");
    }
}
