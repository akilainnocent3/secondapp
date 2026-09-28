package defpackage;

import com.sportybet.plugin.realsports.data.RTicket;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.sportydesk.viewmodel.SportyDeskViewModel$getCachedBetTicketDetailAsJson$2", f = "SportyDeskViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wnb0 extends tje0 implements Function2<v5b, v1b<? super JSONObject>, Object> {
    public final /* synthetic */ ynb0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnb0(ynb0 ynb0Var, v1b<? super wnb0> v1bVar) {
        super(2, v1bVar);
        this.a = ynb0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wnb0(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super JSONObject> v1bVar) {
        return ((wnb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ynb0 ynb0Var = this.a;
        RTicket rTicketY = ynb0Var.b.y();
        if (rTicketY == null) {
            return null;
        }
        try {
            return new JSONObject(ynb0Var.c.toJson(rTicketY));
        } catch (Exception unused) {
            return new JSONObject();
        }
    }
}
