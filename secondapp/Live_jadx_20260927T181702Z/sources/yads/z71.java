package yads;

import com.ironsource.C4235d4;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class z71 implements ag3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me3 f158643a;

    public /* synthetic */ z71(ua1 ua1Var) {
        this(new me3(ua1Var));
    }

    @Override // yads.ag3
    public final fo2 a() {
        fo2 fo2Var = new fo2(new LinkedHashMap(), 2);
        JSONObject jSONObject = this.f158643a.f152433a.f156336g;
        String str = null;
        String strOptString = jSONObject != null ? jSONObject.optString(C4235d4.i.f61426m) : null;
        if (strOptString != null && strOptString.length() > 0) {
            str = strOptString;
        }
        fo2Var.b(str, "product_type");
        return fo2Var;
    }

    public z71(me3 me3Var) {
        this.f158643a = me3Var;
    }
}
