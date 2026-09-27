package com.bytedance.sdk.openadsdk.multipro.aidl.hww;

import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.sdk.openadsdk.core.bs;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu extends com.bytedance.sdk.component.hu.hww.hu.hww {
    private static volatile hu hww;

    public static hu tq() {
        if (hww == null) {
            synchronized (hu.class) {
                try {
                    if (hww == null) {
                        hww = new hu();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hww;
    }

    @Override // com.bytedance.sdk.component.hu.hww.hu
    public Map hww(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!com.bytedance.sdk.openadsdk.core.settings.vgm.hww()) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.hww.hww.hww(com.bytedance.sdk.openadsdk.multipro.hv.hww(bs.hww()).hww(uri, strArr, str, strArr2, str2));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.hu.hww.hu
    public String hww(Uri uri) {
        if (com.bytedance.sdk.openadsdk.core.settings.vgm.hww()) {
            return com.bytedance.sdk.openadsdk.multipro.hv.hww(bs.hww()).hww(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.hu.hww.hu
    public String hww(Uri uri, ContentValues contentValues) {
        Uri uriHww;
        if (com.bytedance.sdk.openadsdk.core.settings.vgm.hww() && (uriHww = com.bytedance.sdk.openadsdk.multipro.hv.hww(bs.hww()).hww(uri, contentValues)) != null) {
            return uriHww.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.hu.hww.hu
    public int hww(Uri uri, String str, String[] strArr) {
        if (com.bytedance.sdk.openadsdk.core.settings.vgm.hww()) {
            return com.bytedance.sdk.openadsdk.multipro.hv.hww(bs.hww()).hww(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.component.hu.hww.hu
    public int hww(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (com.bytedance.sdk.openadsdk.core.settings.vgm.hww()) {
            return com.bytedance.sdk.openadsdk.multipro.hv.hww(bs.hww()).hww(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
