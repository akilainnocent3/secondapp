package com.sportybet.plugin.realsports.data;

import com.sporty.android.core.model.MyLog;
import defpackage.itf0;

/* JADX INFO: loaded from: classes7.dex */
public class ServerProductStatusHelper {
    public static ServerProductStatus getServerProductStatus(String str) {
        try {
            return new ServerProductStatus(str);
        } catch (IllegalArgumentException e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.p(e, "Failed to parse server product status", new Object[0]);
            return null;
        }
    }
}
