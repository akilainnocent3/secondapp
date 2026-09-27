package com.bytedance.sdk.component.hu.hww.tq.tq;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.hu.hww.hww.hww.hu;
import com.bytedance.sdk.component.hu.hww.hww.hww.vgm;
import com.bytedance.sdk.component.hu.hww.ok;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    public static void hww() {
        if (ok.vgm().hu() == null) {
            return;
        }
        try {
            ContentResolver contentResolverSd = sd();
            if (contentResolverSd != null) {
                contentResolverSd.getType(Uri.parse(vy() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    private static ContentResolver sd() {
        try {
            if (ok.vgm().hu() != null) {
                return ok.vgm().hu().getContentResolver();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void tq() {
        if (ok.vgm().hu() == null) {
            return;
        }
        try {
            ContentResolver contentResolverSd = sd();
            if (contentResolverSd != null) {
                contentResolverSd.getType(Uri.parse(vy() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    private static String vy() {
        return vgm.f34548tq + "/ad_log_event/";
    }

    public static void hww(com.bytedance.sdk.component.hu.hww.vy.hww hwwVar) {
        if (hwwVar == null) {
            return;
        }
        try {
            ContentResolver contentResolverSd = sd();
            if (contentResolverSd != null) {
                contentResolverSd.getType(Uri.parse(vy() + "adLogDispatch?event=" + hu.hww(hwwVar.hu())));
            }
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    public static void hww(String str, List<String> list, boolean z10) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(hu.hww(it.next()));
                sb2.append(",");
            }
            String str2 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(hu.hww(sb2.toString())) + "&replace=" + String.valueOf(z10);
            ContentResolver contentResolverSd = sd();
            if (contentResolverSd != null) {
                contentResolverSd.getType(Uri.parse(vy() + "trackAdUrl" + str2));
            }
        } catch (Throwable unused) {
        }
    }

    public static void hww(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentResolver contentResolverSd = sd();
            if (contentResolverSd != null) {
                contentResolverSd.getType(Uri.parse(vy() + "trackAdFailed?did=" + String.valueOf(str)));
            }
        } catch (Throwable unused) {
        }
    }
}
