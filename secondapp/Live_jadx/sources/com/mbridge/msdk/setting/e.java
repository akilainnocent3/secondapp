package com.mbridge.msdk.setting;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f69014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, f> f69015b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final e f69016a = new e();
    }

    public static e a() {
        return b.f69016a;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f69015b == null) {
                this.f69015b = new HashMap<>();
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.getString(next);
                f fVar = new f();
                fVar.a(next);
                fVar.b(string);
                this.f69015b.put(next, fVar);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private e() {
        this.f69014a = 6;
        this.f69015b = new HashMap<>();
    }

    public int a(String str) {
        HashMap<String, f> map;
        f fVar;
        int i10;
        if (TextUtils.isEmpty(str) || (map = this.f69015b) == null || !map.containsKey(str) || (fVar = this.f69015b.get(str)) == null) {
            return 0;
        }
        if (fVar.b()) {
            i10 = 1;
        } else {
            i10 = fVar.a() >= this.f69014a ? 2 : 0;
        }
        fVar.a(false);
        return i10;
    }
}
