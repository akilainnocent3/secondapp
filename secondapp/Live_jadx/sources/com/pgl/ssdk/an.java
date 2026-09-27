package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f72014a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f72015b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f72016c = "api16-access-ttp.tiktokpangle.us";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f72017d = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f72018e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f72019f = "";

    public static String a() {
        return f72014a == 1 ? "VA" : "SG";
    }

    public static String b() {
        return f72019f;
    }

    public static void a(int i10) {
        f72014a = i10;
    }

    public static void b(String str) {
        f72019f = str;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f72015b = str;
    }

    public static void b(Context context) {
        if (TextUtils.isEmpty(f72015b)) {
            au.a("updateIndex");
            int i10 = f72018e;
            if (i10 < Integer.MAX_VALUE) {
                int i11 = i10 + 1;
                f72018e = i11;
                ax.b(context, "domain_index", i11);
                return;
            }
            f72018e = 0;
        }
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f72015b)) {
            return f72015b;
        }
        try {
            if (f72018e == Integer.MIN_VALUE) {
                f72018e = ax.a(context, "domain_index", 0);
            }
            String[] strArr = f72017d;
            return strArr[f72018e % strArr.length];
        } catch (Throwable unused) {
            return f72016c;
        }
    }
}
