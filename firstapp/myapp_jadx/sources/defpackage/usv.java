package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.win.MissionInvitationObserver$resetForNewLogin$1", f = "MissionInvitationObserver.kt", l = {116}, m = "invokeSuspend", v = 2)
public final class usv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tsv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usv(tsv tsvVar, v1b<? super usv> v1bVar) {
        super(2, v1bVar);
        this.b = tsvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new usv(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((usv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        tsv tsvVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            zed.d0 d0Var = (zed.d0) tsvVar.a.c.getStringByFlow("key_loyalty_unread", "");
            this.a = 1;
            obj = s0i.a(d0Var, this);
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
        tsvVar.a((String) obj);
        return Unit.a;
    }
}
