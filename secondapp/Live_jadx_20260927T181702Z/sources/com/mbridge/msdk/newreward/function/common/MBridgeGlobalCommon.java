package com.mbridge.msdk.newreward.function.common;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.video.bt.module.orglistener.h;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class MBridgeGlobalCommon {
    public static String SESSION_ID = "";
    public static Map<String, h> showRewardListenerMap = new HashMap();

    public static void setAlertDialogText(String str, String str2, String str3, String str4, String str5) {
        Context contextD = c.n().d();
        if (!TextUtils.isEmpty(str2)) {
            y0.b(contextD, "MBridge_ConfirmTitle" + str, str2.trim());
        }
        if (!TextUtils.isEmpty(str3)) {
            y0.b(contextD, "MBridge_ConfirmContent" + str, str3.trim());
        }
        if (!TextUtils.isEmpty(str5)) {
            y0.b(contextD, "MBridge_CancelText" + str, str5.trim());
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        y0.b(contextD, "MBridge_ConfirmText" + str, str4.trim());
    }
}
