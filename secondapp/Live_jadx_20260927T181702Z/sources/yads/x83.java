package yads;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class x83 implements nv3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x83 f157726g = new x83();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Handler f157727h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Handler f157728i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v83 f157729j = new v83();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final w83 f157730k = new w83();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f157736f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f157731a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f157732b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tv3 f157734d = new tv3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cw3 f157733c = new cw3();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fw3 f157735e = new fw3(new mw3());

    public final void a(View view, qv3 qv3Var, JSONObject jSONObject, boolean z10) {
        char c10;
        Object obj;
        boolean z11;
        if (hx3.a(view) == null) {
            tv3 tv3Var = this.f157734d;
            if (tv3Var.f156087d.contains(view)) {
                c10 = 1;
            } else {
                c10 = tv3Var.f156093j ? (char) 2 : (char) 3;
            }
            if (c10 == 3) {
                return;
            }
            JSONObject jSONObjectA = qv3Var.a(view);
            lw3.a(jSONObject, jSONObjectA);
            tv3 tv3Var2 = this.f157734d;
            if (tv3Var2.f156084a.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) tv3Var2.f156084a.get(view);
                if (obj2 != null) {
                    tv3Var2.f156084a.remove(view);
                }
                obj = obj2;
            }
            boolean z12 = false;
            if (obj != null) {
                try {
                    jSONObjectA.put("adSessionId", obj);
                } catch (JSONException e10) {
                    tw3.a("Error with setting ad session id", e10);
                }
                tv3 tv3Var3 = this.f157734d;
                if (tv3Var3.f156092i.containsKey(view)) {
                    tv3Var3.f156092i.put(view, Boolean.TRUE);
                } else {
                    z12 = true;
                }
                try {
                    jSONObjectA.put("hasWindowFocus", Boolean.valueOf(z12));
                } catch (JSONException e11) {
                    Log.e("OMIDLIB", "Error with setting has window focus", e11);
                }
                boolean zContains = this.f157734d.f156091h.contains(obj);
                Object objValueOf = Boolean.valueOf(zContains);
                if (zContains) {
                    try {
                        jSONObjectA.put("isPipActive", objValueOf);
                    } catch (JSONException e12) {
                        Log.e("OMIDLIB", "Error with setting is picture-in-picture active", e12);
                    }
                }
                this.f157734d.f156093j = true;
                return;
            }
            tv3 tv3Var4 = this.f157734d;
            mv3 mv3Var = (mv3) tv3Var4.f156085b.get(view);
            if (mv3Var != null) {
                tv3Var4.f156085b.remove(view);
            }
            if (mv3Var != null) {
                xw3 xw3Var = mv3Var.f152701a;
                JSONArray jSONArray = new JSONArray();
                Iterator it = mv3Var.f152702b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                try {
                    jSONObjectA.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectA.put("friendlyObstructionClass", xw3Var.f158033b);
                    jSONObjectA.put("friendlyObstructionPurpose", xw3Var.f158034c);
                    jSONObjectA.put("friendlyObstructionReason", xw3Var.f158035d);
                } catch (JSONException e13) {
                    Log.e("OMIDLIB", "Error with setting friendly obstruction", e13);
                }
                z11 = true;
            } else {
                z11 = false;
            }
            qv3Var.a(view, jSONObjectA, this, c10 == 1, z10 || z11);
        }
    }
}
