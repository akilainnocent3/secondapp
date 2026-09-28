package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.sportydesk.viewmodel.SportyDeskViewModel$fetchCachedBetTicketDetailAsJson$1", f = "SportyDeskViewModel.kt", l = {48}, m = "invokeSuspend", v = 2)
public final class vnb0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ynb0 b;
    public final /* synthetic */ nnb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnb0(ynb0 ynb0Var, nnb0 nnb0Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = ynb0Var;
        this.c = nnb0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vnb0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vnb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            ynb0 ynb0Var = this.b;
            obj = ej5.d(ynb0Var.d, new wnb0(ynb0Var, null), this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        this.c.invoke((JSONObject) obj);
        return Unit.a;
    }
}
