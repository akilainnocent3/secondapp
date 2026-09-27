package yads;

import android.content.Context;
import com.ironsource.C4563ve;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rg1 f150227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fr0 f150228b;

    public hr0(Context context) {
        this(ug1.a(context, "FalseClickDataStorage"));
    }

    public final void a(long j10) {
        ((tg1) this.f150227a).d(String.valueOf(j10));
    }

    public /* synthetic */ hr0(rg1 rg1Var) {
        this(rg1Var, new fr0());
    }

    public final void a(er0 er0Var) throws JSONException {
        String string;
        String strValueOf = String.valueOf(er0Var.f148820b);
        fr0 fr0Var = this.f150228b;
        fr0Var.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ad_type", er0Var.f148819a.f148441b);
        jSONObject.put("start_time", er0Var.f148820b);
        jSONObject.put("type", er0Var.f148821c.f149863b);
        ir0 ir0Var = fr0Var.f149214a;
        dr0 dr0Var = er0Var.f148822d;
        ir0Var.getClass();
        String string2 = null;
        if (dr0Var != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("interval", dr0Var.f148327c);
            jSONObject2.put("url", dr0Var.f148326b);
            string = jSONObject2.toString();
        } else {
            string = null;
        }
        jSONObject.put("false_click", string);
        jSONObject.put("report_data", new JSONObject(er0Var.f148823e));
        d dVar = fr0Var.f149215b;
        c cVar = er0Var.f148824f;
        dVar.getClass();
        if (cVar != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C4563ve.f64327d, cVar.f147461a);
            jSONObject3.put("test_ids", cVar.f147462b);
            string2 = jSONObject3.toString();
        }
        jSONObject.put("ab_experiments", string2);
        ((tg1) this.f150227a).a(strValueOf, jSONObject.toString());
    }

    public hr0(rg1 rg1Var, fr0 fr0Var) {
        this.f150227a = rg1Var;
        this.f150228b = fr0Var;
    }
}
