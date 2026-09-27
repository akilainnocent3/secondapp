package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f157205a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mc2 f157206b = new mc2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f157207c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f157208d = new ArrayList();

    public final void a() {
        synchronized (this.f157205a) {
            this.f157207c.clear();
            this.f157208d.clear();
            dr.w2 w2Var = dr.w2.f79517a;
        }
    }

    public final void b(v5 v5Var) {
        a(v5Var, null);
    }

    public final void a(v5 v5Var) {
        a(v5Var, this.f157206b, null);
    }

    public final void a(v5 v5Var, nc2 nc2Var, qc3 qc3Var) {
        Long l10;
        synchronized (this.f157205a) {
            try {
                Map map = (Map) this.f157207c.get(v5Var);
                Long lValueOf = (map == null || (l10 = (Long) map.get(qc3Var)) == null) ? null : Long.valueOf(SystemClock.elapsedRealtime() - l10.longValue());
                if (lValueOf != null) {
                    this.f157208d.add(new u5(v5Var, nc2Var.a(lValueOf.longValue())));
                }
                Map map2 = (Map) this.f157207c.get(v5Var);
                if (map2 != null) {
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(v5 v5Var, qc3 qc3Var) {
        synchronized (this.f157205a) {
            try {
                Map linkedHashMap = (Map) this.f157207c.get(v5Var);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                this.f157207c.put(v5Var, linkedHashMap);
                linkedHashMap.put(qc3Var, Long.valueOf(SystemClock.elapsedRealtime()));
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
