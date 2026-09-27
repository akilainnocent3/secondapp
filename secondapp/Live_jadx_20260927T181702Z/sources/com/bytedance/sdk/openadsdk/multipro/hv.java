package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv implements hww {
    private static volatile hv hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static final List<hww> f37500sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static WeakReference<Context> f37501tq;

    static {
        List<hww> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        f37500sd = listSynchronizedList;
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.vy.sd());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.hww.tq());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.sd.hww());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.vy.hww.sd(new com.bytedance.sdk.component.hu.hww.tq.tq.tq()));
        Iterator<hww> it = listSynchronizedList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private hv() {
    }

    public static hv hww(Context context) {
        if (context != null) {
            f37501tq = new WeakReference<>(context.getApplicationContext());
        }
        if (hww == null) {
            synchronized (hv.class) {
                try {
                    if (hww == null) {
                        hww = new hv();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hww;
    }

    private boolean sd(Uri uri) {
        return true;
    }

    private hww tq(Uri uri) {
        if (uri == null || !sd(uri)) {
            return null;
        }
        String[] strArrSplit = uri.getPath().split(c.userBaseDel);
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (hww hwwVar : f37500sd) {
            if (str.equals(hwwVar.hww())) {
                return hwwVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    @NonNull
    public String hww() {
        return "";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public Cursor hww(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        try {
            hww hwwVarTq = tq(uri);
            if (hwwVarTq != null) {
                return hwwVarTq.hww(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public String hww(@NonNull Uri uri) {
        try {
            hww hwwVarTq = tq(uri);
            if (hwwVarTq != null) {
                return hwwVarTq.hww(uri);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public Uri hww(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        try {
            hww hwwVarTq = tq(uri);
            if (hwwVarTq != null) {
                return hwwVarTq.hww(uri, contentValues);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public int hww(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        try {
            hww hwwVarTq = tq(uri);
            if (hwwVarTq != null) {
                return hwwVarTq.hww(uri, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.hww
    public int hww(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        try {
            hww hwwVarTq = tq(uri);
            if (hwwVarTq != null) {
                return hwwVarTq.hww(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
