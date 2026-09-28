package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.extensions.CrashlyticsHelperExtKt$reportFailureAsNonFatalEvent$1", f = "CrashlyticsHelperExt.kt", l = {}, m = "invokeSuspend", v = 2)
public final class atb extends tje0 implements Function2<lk50<Object>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ wsm b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atb(wsm wsmVar, String str, String str2, v1b v1bVar) {
        super(2, v1bVar);
        this.b = wsmVar;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        atb atbVar = new atb(this.b, this.c, this.d, v1bVar);
        atbVar.a = obj;
        return atbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<Object> lk50Var, v1b<? super Unit> v1bVar) {
        return ((atb) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.a) {
            ctb.a(this.b, this.c, this.d, null, ((lk50.a) lk50Var).a);
        }
        return Unit.a;
    }
}
