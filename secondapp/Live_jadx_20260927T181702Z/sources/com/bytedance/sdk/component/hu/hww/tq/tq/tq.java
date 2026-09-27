package com.bytedance.sdk.component.hu.hww.tq.tq;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.hu.hww.hu;
import com.bytedance.sdk.component.hu.hww.hww.hww.vgm;
import com.bytedance.sdk.component.hu.hww.ok;
import com.bytedance.sdk.component.hu.hww.vy;
import com.ironsource.sdk.controller.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {
    public static hu hww;

    public static void tq() {
        if (ok.vgm().hu() == null) {
            return;
        }
        try {
            hu huVarHww = hww(ok.vgm().hu());
            if (huVarHww != null) {
                huVarHww.hww(Uri.parse(vy() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    private static String vy() {
        return vgm.f34548tq + "/ad_log_event/";
    }

    public int hww(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public String sd() {
        return "ad_log_event";
    }

    public int hww(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Cursor hww(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public Uri hww(Uri uri, ContentValues contentValues) {
        return null;
    }

    public static hu hww(Context context) {
        try {
            if (hww == null) {
                hww = ok.vgm().wgt().vhb();
            }
        } catch (Exception unused) {
        }
        return hww;
    }

    public static void hww() {
        if (ok.vgm().hu() == null) {
            return;
        }
        try {
            hu huVarHww = hww(ok.vgm().hu());
            if (huVarHww != null) {
                huVarHww.hww(Uri.parse(vy() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void hww(com.bytedance.sdk.component.hu.hww.vy.hww hwwVar) {
        if (hwwVar == null) {
            return;
        }
        try {
            hu huVarHww = hww(ok.vgm().hu());
            if (huVarHww != null) {
                huVarHww.hww(Uri.parse(vy() + "adLogDispatch?event=" + com.bytedance.sdk.component.hu.hww.hww.hww.hu.hww(hwwVar.hu())));
            }
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    public static void hww(String str, List<String> list, boolean z10, int i10, String str2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(com.bytedance.sdk.component.hu.hww.hww.hww.hu.hww(it.next()));
                sb2.append(",");
            }
            String str3 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(com.bytedance.sdk.component.hu.hww.hww.hww.hu.hww(sb2.toString())) + "&replace=" + String.valueOf(z10) + "&urlType=" + String.valueOf(i10) + "&adId=" + str2;
            hu huVarHww = hww(ok.vgm().hu());
            if (huVarHww != null) {
                huVarHww.hww(Uri.parse(vy() + "trackAdUrl" + str3));
            }
        } catch (Throwable unused) {
        }
    }

    public static void hww(String str, boolean z10) {
        if (ok.vgm().wgt().hu() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        try {
            hu huVarHww = hww(ok.vgm().hu());
            if (huVarHww != null) {
                huVarHww.hww(Uri.parse(vy() + "trackAdFailed?did=" + String.valueOf(str) + "&triggerOnInit=" + z10));
            }
        } catch (Throwable unused) {
        }
    }

    public String hww(Uri uri) {
        com.bytedance.sdk.component.hu.hww.vy.hww hwwVarSd;
        byte b10 = 2;
        String str = uri.getPath().split(c.userBaseDel)[2];
        str.getClass();
        int i10 = 0;
        switch (str.hashCode()) {
            case -482705237:
                b10 = str.equals("trackAdFailed") ? (byte) 0 : (byte) -1;
                break;
            case -171493183:
                b10 = str.equals("adLogStart") ? (byte) 1 : (byte) -1;
                break;
            case 964299715:
                if (!str.equals("adLogStop")) {
                    b10 = -1;
                }
                break;
            case 1025736635:
                b10 = str.equals("adLogDispatch") ? (byte) 3 : (byte) -1;
                break;
            case 1131732929:
                b10 = str.equals("trackAdUrl") ? (byte) 4 : (byte) -1;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                com.bytedance.sdk.component.hu.hww.hu.hww.hww().hww(uri.getQueryParameter("did"), uri.getBooleanQueryParameter("triggerOnInit", false));
                break;
            case 1:
                ok.vgm().rs();
                break;
            case 2:
                ok.vgm().vhb();
                break;
            case 3:
                String queryParameter = uri.getQueryParameter("event");
                if (!TextUtils.isEmpty(queryParameter) && (hwwVarSd = com.bytedance.sdk.component.hu.hww.vy.hww.hww.sd(com.bytedance.sdk.component.hu.hww.hww.hww.hu.tq(queryParameter))) != null) {
                    vy.hww.hww(hwwVarSd);
                    break;
                }
                break;
            case 4:
                try {
                    String queryParameter2 = uri.getQueryParameter("did");
                    boolean zBooleanValue = Boolean.valueOf(uri.getQueryParameter("replace")).booleanValue();
                    String queryParameter3 = uri.getQueryParameter("track");
                    String queryParameter4 = uri.getQueryParameter("urlType");
                    String queryParameter5 = uri.getQueryParameter(f.b.f63771c);
                    String[] strArrSplit = com.bytedance.sdk.component.hu.hww.hww.hww.hu.tq(queryParameter3).split(",");
                    if (strArrSplit.length > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : strArrSplit) {
                            String strTq = com.bytedance.sdk.component.hu.hww.hww.hww.hu.tq(str2);
                            if (!TextUtils.isEmpty(strTq)) {
                                arrayList.add(strTq);
                            }
                        }
                        try {
                            if (!TextUtils.isEmpty(queryParameter4)) {
                                i10 = Integer.parseInt(queryParameter4);
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        com.bytedance.sdk.component.hu.hww.hu.hww.hww().hww(queryParameter2, arrayList, zBooleanValue, null, i10, queryParameter5);
                    }
                } catch (Throwable unused2) {
                    return null;
                }
                break;
        }
        return null;
    }
}
