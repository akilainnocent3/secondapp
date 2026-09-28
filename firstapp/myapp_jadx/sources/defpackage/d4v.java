package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.handler.MatchEventLeagueTabHandlerImpl$initMatchEventLeagueTabHandler$4", f = "MatchEventLeagueTabHandlerImpl.kt", l = {55}, m = "invokeSuspend", v = 2)
public final class d4v extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e4v c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4v(e4v e4vVar, String str, v1b<? super d4v> v1bVar) {
        super(2, v1bVar);
        this.c = e4vVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        d4v d4vVar = new d4v(this.c, this.d, v1bVar);
        d4vVar.b = obj;
        return d4vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super Unit> v1bVar) {
        return ((d4v) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ymr ymrVar = this.c.a;
            this.b = null;
            this.a = 1;
            if (ymrVar.b(this.d, str, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
