package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.component.SportyLegendsRunningPageEventScreenKt$ScoreAnimation$2$1", f = "SportyLegendsRunningPageEventScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class shc0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ fmt a;
    public final /* synthetic */ ytw<Boolean> b;
    public final /* synthetic */ osw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shc0(fmt fmtVar, ytw ytwVar, osw oswVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = fmtVar;
        this.b = ytwVar;
        this.c = oswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new shc0(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((shc0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a.getValue().floatValue() == 1.0f) {
            ytw<Boolean> ytwVar = this.b;
            if (ytwVar.getValue().booleanValue()) {
                ytwVar.setValue(Boolean.FALSE);
                this.c.k(0);
            }
        }
        return Unit.a;
    }
}
