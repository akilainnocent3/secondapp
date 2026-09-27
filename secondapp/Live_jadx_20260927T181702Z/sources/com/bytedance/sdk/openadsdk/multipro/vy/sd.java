package com.bytedance.sdk.openadsdk.multipro.vy;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.bs;
import java.util.Map;
import n0.w;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd implements com.bytedance.sdk.openadsdk.multipro.hww {
    private Context hww;

    private Context tq() {
        Context context = this.hww;
        return context == null ? bs.hww() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    @NonNull
    public String hww() {
        return "t_sp";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public Cursor hww(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Map<String, ?> mapSd;
        if (!uri.getPath().split(c.userBaseDel)[2].equals("get_all") || (mapSd = tq.sd(tq(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String str3 : mapSd.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = str3;
            Object obj = mapSd.get(str3);
            objArr[2] = obj;
            if (obj instanceof Boolean) {
                objArr[1] = "boolean";
            } else if (obj instanceof String) {
                objArr[1] = "string";
            } else if (obj instanceof Integer) {
                objArr[1] = "int";
            } else if (obj instanceof Long) {
                objArr[1] = "long";
            } else if (obj instanceof Float) {
                objArr[1] = w.b.f115804c;
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public String hww(@NonNull Uri uri) {
        String[] strArrSplit = uri.getPath().split(c.userBaseDel);
        String str = strArrSplit[2];
        String str2 = strArrSplit[3];
        if (str.equals("contain")) {
            return String.valueOf(tq.hww(bs.hww(), uri.getQueryParameter("sp_file_name"), str2));
        }
        return tq.hww(tq(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public Uri hww(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String str = uri.getPath().split(c.userBaseDel)[3];
        Object obj = contentValues.get("value");
        if (obj != null) {
            tq.hww(tq(), uri.getQueryParameter("sp_file_name"), str, obj);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public int hww(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        String[] strArrSplit = uri.getPath().split(c.userBaseDel);
        if (strArrSplit[2].equals("clean")) {
            tq.tq(tq(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = strArrSplit[3];
        if (tq.hww(tq(), uri.getQueryParameter("sp_file_name"), str2)) {
            tq.tq(tq(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public int hww(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        hww(uri, contentValues);
        return 0;
    }
}
