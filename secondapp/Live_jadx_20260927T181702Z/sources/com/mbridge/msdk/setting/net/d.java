package com.mbridge.msdk.setting.net;

import android.content.Context;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class d {
    public static void a(Context context, e eVar) {
        if (eVar == null) {
            return;
        }
        try {
            eVar.a(Q6.V0, g.d());
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("SettingRequestDiff", e10.getMessage());
            }
        }
    }
}
