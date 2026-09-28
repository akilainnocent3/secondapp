package defpackage;

import com.sporty.android.core.model.EligibleActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.marketing.MarketingActivitiesCoordinator$fetchEligibleActivities$1", f = "MarketingActivitiesCoordinator.kt", l = {49}, m = "invokeSuspend", v = 2)
public final class yru extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zru b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yru(zru zruVar, v1b<? super yru> v1bVar) {
        super(2, v1bVar);
        this.b = zruVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yru(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yru) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object objA;
        y5b y5bVar = y5b.a;
        int i = this.a;
        zru zruVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            w5k w5kVar = zruVar.b;
            this.a = 1;
            objA = w5kVar.a(this);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        if (zi50.a(objA) != null) {
            zruVar.f.set(false);
        }
        if (!(objA instanceof zi50.b)) {
            for (EligibleActivity eligibleActivity : (List) objA) {
                if (!(eligibleActivity instanceof EligibleActivity.PaydayGift)) {
                    uhc.a();
                    return null;
                }
                rym rymVar = zruVar.d;
                h620 h620Var = h620.w;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("data", new JSONObject(zruVar.e.toJson((EligibleActivity.PaydayGift) eligibleActivity)));
                Unit unit = Unit.a;
                rymVar.i(new m420(h620Var, "PaydayGift", jSONObject));
            }
        }
        return Unit.a;
    }
}
