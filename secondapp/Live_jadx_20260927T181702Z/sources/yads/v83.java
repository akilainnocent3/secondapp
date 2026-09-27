package yads;

import android.util.Log;
import android.view.View;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class v83 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        x83 x83Var = x83.f157726g;
        x83Var.getClass();
        x83Var.f157732b.clear();
        Iterator it = Collections.unmodifiableCollection(nw3.f153242c.f153244b).iterator();
        while (it.hasNext()) {
            ((wv3) it.next()).getClass();
        }
        x83Var.f157736f = System.nanoTime();
        x83Var.f157734d.a();
        long jNanoTime = System.nanoTime();
        kw3 kw3Var = x83Var.f157733c.f147929b;
        if (x83Var.f157734d.f156089f.size() > 0) {
            for (String str : x83Var.f157734d.f156089f) {
                JSONObject jSONObjectA = kw3Var.a(null);
                View view = (View) x83Var.f157734d.f156086c.get(str);
                sw3 sw3Var = x83Var.f157733c.f147928a;
                String str2 = (String) x83Var.f157734d.f156090g.get(str);
                if (str2 != null) {
                    JSONObject jSONObjectA2 = sw3Var.a(view);
                    try {
                        jSONObjectA2.put("adSessionId", str);
                    } catch (JSONException e10) {
                        tw3.a("Error with setting ad session id", e10);
                    }
                    try {
                        jSONObjectA2.put("notVisibleReason", str2);
                    } catch (JSONException e11) {
                        Log.e("OMIDLIB", "Error with setting not visible reason", e11);
                    }
                    lw3.a(jSONObjectA, jSONObjectA2);
                }
                lw3.a(jSONObjectA);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                fw3 fw3Var = x83Var.f157735e;
                fw3Var.f149284b.a(new zw3(fw3Var, hashSet, jSONObjectA, jNanoTime));
            }
        }
        if (x83Var.f157734d.f156088e.size() > 0) {
            JSONObject jSONObjectA3 = kw3Var.a(null);
            kw3Var.a(null, jSONObjectA3, x83Var, true, false);
            lw3.a(jSONObjectA3);
            fw3 fw3Var2 = x83Var.f157735e;
            fw3Var2.f149284b.a(new cx3(fw3Var2, x83Var.f157734d.f156088e, jSONObjectA3, jNanoTime));
        } else {
            fw3 fw3Var3 = x83Var.f157735e;
            fw3Var3.f149284b.a(new uw3(fw3Var3));
        }
        tv3 tv3Var = x83Var.f157734d;
        tv3Var.f156084a.clear();
        tv3Var.f156085b.clear();
        tv3Var.f156086c.clear();
        tv3Var.f156087d.clear();
        tv3Var.f156088e.clear();
        tv3Var.f156089f.clear();
        tv3Var.f156090g.clear();
        tv3Var.f156093j = false;
        tv3Var.f156091h.clear();
        long jNanoTime2 = System.nanoTime() - x83Var.f157736f;
        if (x83Var.f157731a.size() > 0) {
            Iterator it2 = x83Var.f157731a.iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                throw null;
            }
        }
        lx3.f152212d.a();
    }
}
