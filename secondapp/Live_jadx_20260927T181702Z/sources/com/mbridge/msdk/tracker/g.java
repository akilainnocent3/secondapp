package com.mbridge.msdk.tracker;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f70234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f70235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicLong f70236c = new AtomicLong(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f70237d = new long[2];

    public g(c cVar, s sVar) {
        this.f70234a = cVar;
        this.f70235b = sVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        try {
            long jIncrementAndGet = this.f70236c.incrementAndGet();
            this.f70237d[0] = System.currentTimeMillis();
            this.f70237d[1] = jIncrementAndGet;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("TrackManager", "notice error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        try {
            i iVar = new i(eVar);
            iVar.a(1);
            iVar.b(0);
            iVar.a(System.currentTimeMillis() + eVar.k());
            this.f70234a.a(iVar);
            this.f70235b.k();
            this.f70235b.e();
            this.f70235b.a(eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("TrackManager", "process error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        long[] jArr = this.f70237d;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }
}
