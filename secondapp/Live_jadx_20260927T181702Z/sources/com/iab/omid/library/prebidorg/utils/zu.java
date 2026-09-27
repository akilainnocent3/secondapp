package com.iab.omid.library.prebidorg.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.iab.omid.library.prebidorg.adsession.zb;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zu {
    private static zb zz = zb.UNKNOWN;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class zz extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            zb zbVar;
            if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                if (intExtra == 0) {
                    zbVar = zb.NOT_DETECTED;
                } else if (intExtra != 1) {
                    return;
                } else {
                    zbVar = zb.UNKNOWN;
                }
                zb unused = zu.zz = zbVar;
            }
        }
    }

    public static zb zz() {
        return com.iab.omid.library.prebidorg.utils.zz.zz() != com.iab.omid.library.prebidorg.adsession.zw.CTV ? zb.UNKNOWN : zz;
    }

    public static void zz(Context context) {
        context.registerReceiver(new zz(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
