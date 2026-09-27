package com.chartboost.sdk.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class n8 {
    public static final List a(JSONArray jSONArray) {
        kotlin.jvm.internal.m0.p(jSONArray, "<this>");
        ms.l lVarW1 = ms.u.W1(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(fr.i0.d0(lVarW1, 10));
        Iterator<Integer> it = lVarW1.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((fr.f1) it).nextInt()));
        }
        return arrayList;
    }

    public static final List b(JSONArray jSONArray) throws JSONException {
        kotlin.jvm.internal.m0.p(jSONArray, "<this>");
        ms.l lVarW1 = ms.u.W1(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = lVarW1.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((fr.f1) it).nextInt());
            if (obj == null) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final PackageInfo a(PackageManager packageManager, String packageName, int i10) throws PackageManager.NameNotFoundException {
        kotlin.jvm.internal.m0.p(packageManager, "<this>");
        kotlin.jvm.internal.m0.p(packageName, "packageName");
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(i10));
            kotlin.jvm.internal.m0.m(packageInfo);
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, i10);
        kotlin.jvm.internal.m0.m(packageInfo2);
        return packageInfo2;
    }

    public static final String a(PackageManager packageManager, String packageName) {
        kotlin.jvm.internal.m0.p(packageManager, "<this>");
        kotlin.jvm.internal.m0.p(packageName, "packageName");
        try {
            String str = m8.getPackageInfoCompat(packageManager, packageName, 128).versionName;
            return str == null ? "" : str;
        } catch (Exception e10) {
            sb.b("Exception raised getting package manager object", e10);
            return "";
        }
    }

    public static final nh a(mh mhVar) {
        kotlin.jvm.internal.m0.p(mhVar, "<this>");
        return new nh(mhVar.a(), mhVar.b(), mhVar.c());
    }

    public static final jf a(g3 g3Var) {
        kotlin.jvm.internal.m0.p(g3Var, "<this>");
        return new jf(Integer.valueOf(g3Var.a()), Integer.valueOf(g3Var.c().b()), g3Var.b(), g3Var.f());
    }
}
