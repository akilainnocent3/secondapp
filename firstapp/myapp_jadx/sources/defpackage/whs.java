package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class whs {
    public static Bundle a(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        bundle.putString(str3, str4);
        return bundle;
    }

    public static String b(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }
}
