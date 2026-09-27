package com.bytedance.sdk.component.hu.hww.hww.hww;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd {
    public static void hww(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            hww.hww(context).hww().hww(str, (String) null, contentValues);
        } catch (Throwable unused) {
        }
    }

    public static void hww(Context context, String str, List<com.bytedance.sdk.component.hu.hww.vy.hww> list) {
        if (list == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            hww.hww(context).hww().hww(str, (String) null, list);
        } catch (Throwable unused) {
        }
    }

    public static int hww(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return hww.hww(context).hww().hww(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int hww(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            try {
                return hww.hww(context).hww().hww(str, contentValues, str2, strArr);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public static Cursor hww(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return hww.hww(context).hww().hww(str, strArr, str2, strArr2, null, null, str5);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void hww(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            hww.hww(context).hww().hww(Uri.decode(str));
        } catch (Throwable unused) {
        }
    }
}
