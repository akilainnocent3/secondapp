package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cr00 implements Function1 {
    public final /* synthetic */ kr00 a;
    public final /* synthetic */ mr00 b;

    public /* synthetic */ cr00(kr00 kr00Var, mr00 mr00Var) {
        this.a = kr00Var;
        this.b = mr00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.getClass();
        this.a.y.put(this.b, jSONObject);
        return Unit.a;
    }
}
