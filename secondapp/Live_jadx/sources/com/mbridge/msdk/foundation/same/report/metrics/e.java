package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f67301a = new HashMap();

    public void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            if (obj instanceof String) {
                if (TextUtils.isEmpty((String) obj)) {
                    return;
                }
                this.f67301a.put(str, (String) obj);
            } else {
                this.f67301a.put(str, obj + "");
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public Object b(String str) {
        return this.f67301a.get(str);
    }

    public void c(String str) {
        if (this.f67301a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f67301a.remove(str);
    }

    public boolean a(String str) {
        return this.f67301a.containsKey(str);
    }

    public Map<String, String> a() {
        return this.f67301a;
    }

    public void a(e eVar) {
        Map<String, String> map;
        Map<String, String> map2;
        if (eVar == null || (map = eVar.f67301a) == null || (map2 = this.f67301a) == null) {
            return;
        }
        map2.putAll(map);
    }
}
