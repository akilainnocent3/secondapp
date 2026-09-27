package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
class K5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f59365a = "ironbeast";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f59366b = "outcome";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f59367c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f59368d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f59369e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f59370f = 0;

    public static AbstractC4248e a(String str, int i10) {
        if (f59365a.equals(str)) {
            return new C4366ka(i10);
        }
        if (f59366b.equals(str)) {
            return new Uc(i10);
        }
        if (i10 == 2) {
            return new C4366ka(i10);
        }
        if (i10 == 3) {
            return new Uc(i10);
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NATIVE, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i10 + gi.j.f86771d, 2);
        return null;
    }
}
