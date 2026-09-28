package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class sa8 {
    public static String a(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || str.endsWith(":") || (iLastIndexOf = str.lastIndexOf(":")) <= -1) ? "" : str.substring(iLastIndexOf + 1);
    }
}
