package com.ironsource;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class A8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static A8 f58373b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private O5 f58374a;

    private A8() {
    }

    private static A8 a() {
        if (f58373b == null) {
            f58373b = new A8();
        }
        return f58373b;
    }

    public static void a(I5 i10, C4608y8 c4608y8) {
        if (i10 != null) {
            try {
                a().f58374a = new O5(i10, c4608y8);
            } catch (Exception e10) {
                C4485r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    public static void a(C4281fe.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(C4281fe.a aVar, Map<String, Object> map) {
        O5 o10 = a().f58374a;
        if (o10 == null) {
            Log.d(G5.f59029a, G5.U);
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f61818b));
        }
        o10.a(aVar.f61817a, map);
    }
}
