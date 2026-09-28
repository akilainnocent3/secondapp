package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class vtu {
    public static final /* synthetic */ int a = 0;

    public static String a(String str) {
        str.getClass();
        return (!TextUtils.isDigitsOnly(str) || str.length() <= 5) ? str : fu5.a("(?<=\\d{2})\\d(?=\\d{3})", str, "*");
    }
}
