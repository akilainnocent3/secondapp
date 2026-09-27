package com.bytedance.sdk.openadsdk.multipro.hww;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.hu.hww.hu;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.hv;
import com.bytedance.sdk.openadsdk.multipro.vy;
import com.bytedance.sdk.openadsdk.utils.qt;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    public static hu hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static final ConcurrentHashMap<String, Object> f37502tq = new ConcurrentHashMap<>();

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x000f A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x001f A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    public static hu hww(Context context) {
        if (context == null) {
            try {
                bs.hww();
                if (hww == null) {
                    if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
                        hww = hu.hww.hww(com.bytedance.sdk.openadsdk.multipro.aidl.hww.hww().hww(5));
                    } else {
                        hww = com.bytedance.sdk.openadsdk.multipro.aidl.hww.hu.tq();
                    }
                }
            } catch (Throwable unused) {
                qt.ok("binder error");
            }
        } else if (hww == null) {
            if (com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
                hww = hu.hww.hww(com.bytedance.sdk.openadsdk.multipro.aidl.hww.hww().hww(5));
            } else {
                hww = com.bytedance.sdk.openadsdk.multipro.aidl.hww.hu.tq();
            }
        }
        return hww;
    }

    private static String hww() {
        return vy.f37509tq + "/t_db/ttopensdk.db/";
    }

    public static void hww(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (hww(str)) {
            try {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
                        hv.hww(context).hww().hww(str, (String) null, contentValues);
                        return;
                    }
                    hu huVarHww = hww(context);
                    if (huVarHww != null) {
                        huVarHww.hww(Uri.parse(hww() + str), contentValues);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static int hww(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (hww(str)) {
            try {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
                        return hv.hww(context).hww().hww(str, str2, strArr);
                    }
                    hu huVarHww = hww(context);
                    if (huVarHww != null) {
                        return huVarHww.hww(Uri.parse(hww() + str), str2, strArr);
                    }
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static int hww(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (hww(str)) {
                try {
                    try {
                        if (!com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
                            return hv.hww(context).hww().hww(str, contentValues, str2, strArr);
                        }
                        hu huVarHww = hww(context);
                        if (huVarHww != null) {
                            return huVarHww.hww(Uri.parse(hww() + str), contentValues, str2, strArr);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return 0;
    }

    public static Map<String, List<String>> hww(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (hww(str)) {
            try {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.tq.sd()) {
                        return hww(hv.hww(context).hww().hww(str, strArr, str2, strArr2, str3, str4, str5));
                    }
                    hu huVarHww = hww(context);
                    if (huVarHww != null) {
                        return huVarHww.hww(Uri.parse(hww() + str), strArr, str2, strArr2, str5);
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static Map<String, List<String>> hww(Cursor cursor) {
        HashMap map = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!map.containsKey(str)) {
                            map.put(str, new LinkedList());
                        }
                        ((List) map.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
                cursor.close();
                return map;
            } catch (Throwable unused) {
                cursor.close();
            }
        }
        return map;
    }

    private static Object hww(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = f37502tq;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (hww.class) {
            try {
                obj = concurrentHashMap.get(str);
                if (obj == null) {
                    obj = new Object();
                    concurrentHashMap.put(str, obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
