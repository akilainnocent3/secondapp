package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.g3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
class C4288g3 extends Q0 {
    public C4288g3(O0 o10, @oy.l Gb gb2) {
        super(o10, gb2);
    }

    private boolean n() {
        return b().b() > 0;
    }

    private boolean p() {
        return b().d() >= 0;
    }

    public void l() {
        if (o()) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    public void m() {
        if (o()) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    public boolean o() {
        return b().a() == O0.a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    public void q() {
        if (o() && d()) {
            IronLog.INTERNAL.verbose();
            a(b().c());
        }
    }

    public void r() {
        if (!n()) {
            IronLog.INTERNAL.verbose("banner reload interval is disabled");
        } else if (o() && p()) {
            IronLog.INTERNAL.verbose();
            a(b().d());
        }
    }
}
