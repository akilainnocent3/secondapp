package defpackage;

import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wgj0 implements Function1<Throwable, Unit> {
    public final /* synthetic */ wcl a;
    public final /* synthetic */ s9s b;
    public final /* synthetic */ xgj0 c;

    public wgj0(wcl wclVar, s9s s9sVar, xgj0 xgj0Var) {
        this.a = wclVar;
        this.b = s9sVar;
        this.c = xgj0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        e eVar = e.a;
        wcl wclVar = this.a;
        boolean zF0 = wclVar.f0(eVar);
        xgj0 xgj0Var = this.c;
        s9s s9sVar = this.b;
        if (zF0) {
            wclVar.d0(eVar, new vgj0(s9sVar, xgj0Var));
        } else {
            s9sVar.d(xgj0Var);
        }
        return Unit.a;
    }
}
