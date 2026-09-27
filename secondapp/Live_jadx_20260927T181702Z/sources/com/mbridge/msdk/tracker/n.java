package com.mbridge.msdk.tracker;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class n implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, a> f70272a = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f70273a;

        public a(boolean z10) {
            this.f70273a = z10;
        }

        public boolean a() {
            return this.f70273a;
        }
    }

    @Override // com.mbridge.msdk.tracker.f
    public boolean a(e eVar) throws Exception {
        a aVar;
        if (eVar != null && !TextUtils.isEmpty(eVar.g())) {
            try {
                String strG = eVar.g();
                if (this.f70272a.containsKey(strG)) {
                    aVar = this.f70272a.get(strG);
                } else {
                    a aVar2 = new a(com.mbridge.msdk.foundation.same.report.c.a(strG));
                    this.f70272a.put(strG, aVar2);
                    aVar = aVar2;
                }
                return aVar != null && aVar.a();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("TrackManager", "apply", e10);
                }
            }
        }
        return false;
    }
}
