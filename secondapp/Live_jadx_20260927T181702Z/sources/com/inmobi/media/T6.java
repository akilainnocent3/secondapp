package com.inmobi.media;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class T6 {
    public static final void a(Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        ConcurrentHashMap concurrentHashMap = Ea.f54559b;
        List<String> listQ = fr.h0.Q(Da.a("carb_store"), Da.a("aes_key_store"), Da.a("mraid_js_store"), Da.a("omid_js_store"), Da.a("user_info_store"), Da.a("coppa_store"), Da.a("gesture_info_store"), Da.a("display_info_store"), Da.a("unified_id_info_store"), Da.a("app_bundle_store"), Da.a("pub_signals_store"), Da.a("CrashSession-store"));
        if (Build.VERSION.SDK_INT >= 24) {
            Iterator it = listQ.iterator();
            while (it.hasNext()) {
                context.deleteSharedPreferences((String) it.next());
            }
            return;
        }
        for (String str : listQ) {
            File file = new File("/data/data/" + context.getPackageName() + "/shared_prefs/" + str + androidx.appcompat.widget.c.f6977y);
            if (file.exists() && file.delete()) {
                kotlin.jvm.internal.m0.o("T6", "TAG");
                file.getName();
            }
        }
    }

    public static final void a(File path) {
        kotlin.jvm.internal.m0.p(path, "path");
        try {
            if (path.exists()) {
                File[] fileArrListFiles = path.listFiles();
                if (fileArrListFiles != null) {
                    Iterator itA = kotlin.jvm.internal.i.a(fileArrListFiles);
                    while (itA.hasNext()) {
                        File file = (File) itA.next();
                        if (file.isDirectory()) {
                            kotlin.jvm.internal.m0.m(file);
                            a(file);
                        } else if (file.delete()) {
                            kotlin.jvm.internal.m0.o("T6", "TAG");
                            file.getName();
                        }
                    }
                }
                if (path.delete()) {
                    kotlin.jvm.internal.m0.o("T6", "TAG");
                    path.getName();
                }
            }
        } catch (Exception e10) {
            kotlin.jvm.internal.m0.o("T6", "TAG");
            e10.getMessage();
        }
    }
}
