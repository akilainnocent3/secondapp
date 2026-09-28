package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@fae
public final class vgb0 {
    public static f00 a;
    public static final List<zqm> b = b.k(uoh.a, xv0.a, x8j.a);

    public static void a(String str) {
        str.getClass();
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        c(str, o2gVar, false);
    }

    public static void b(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : bundle.keySet()) {
            linkedHashMap.put(str2, bundle.get(str2));
        }
        c(str, linkedHashMap, false);
    }

    public static void c(String str, Map map, boolean z) {
        str.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (z) {
            f00 f00Var = a;
            linkedHashMap.put(AnalyticsParam.EVENT_PARAM_DEVICE_ID, f00Var != null ? f00Var.d.c((3 & 1) != 0 ? "not_started" : "") : null);
        }
        boolean zEquals = str.equals(AnalyticsEvent.REGISTER_COMPLETED);
        List<zqm> list = b;
        if (zEquals) {
            f00 f00Var2 = a;
            if (f00Var2 == null) {
                return;
            }
            list.getClass();
            SharedPreferences sharedPreferences = f00Var2.a.getSharedPreferences("sportybet", 0);
            sharedPreferences.getClass();
            sharedPreferences.edit().putBoolean("has_registered", true).apply();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((zqm) it.next()).b(AnalyticsEvent.REGISTER_COMPLETED, map);
            }
            return;
        }
        if (!str.equals(AnalyticsEvent.DEPOSIT)) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                ((zqm) it2.next()).b(str, map);
            }
            return;
        }
        f00 f00Var3 = a;
        if (f00Var3 == null) {
            return;
        }
        list.getClass();
        SharedPreferences sharedPreferences2 = f00Var3.a.getSharedPreferences("sportybet", 0);
        sharedPreferences2.getClass();
        if (sharedPreferences2.getBoolean("has_registered", false)) {
            String str2 = f00Var3.b.getAccount().name;
            str2.getClass();
            String strConcat = "first_deposit_".concat(str2);
            if (!sharedPreferences2.getBoolean(strConcat, false)) {
                sharedPreferences2.edit().putBoolean(strConcat, true).apply();
                for (zqm zqmVar : list) {
                    o2g o2gVar = o2g.a;
                    o2gVar.getClass();
                    zqmVar.b(AnalyticsEvent.FIRST_DEPOSIT, o2gVar);
                }
            }
        }
        for (zqm zqmVar2 : list) {
            if ((zqmVar2 instanceof xv0) || Intrinsics.g(zqmVar2, uoh.a)) {
                o2g o2gVar2 = o2g.a;
                o2gVar2.getClass();
                zqmVar2.b(AnalyticsEvent.DEPOSIT, o2gVar2);
            }
        }
    }

    public static void d(Context context, String str) {
        Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            ((zqm) it.next()).c(context, str);
        }
    }
}
