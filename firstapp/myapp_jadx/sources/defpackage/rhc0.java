package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.component.SportyLegendsRunningPageEventScreenKt$ScoreAnimation$1$1", f = "SportyLegendsRunningPageEventScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rhc0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ osw c;
    public final /* synthetic */ osw d;
    public final /* synthetic */ osw e;
    public final /* synthetic */ ytw<Boolean> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhc0(int i, int i2, osw oswVar, osw oswVar2, osw oswVar3, ytw<Boolean> ytwVar, v1b<? super rhc0> v1bVar) {
        super(2, v1bVar);
        this.a = i;
        this.b = i2;
        this.c = oswVar;
        this.d = oswVar2;
        this.e = oswVar3;
        this.f = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rhc0(this.a, this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rhc0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        osw oswVar = this.c;
        int iD = oswVar.D();
        int i = this.a;
        boolean z = i > iD;
        osw oswVar2 = this.d;
        int iD2 = oswVar2.D();
        int i2 = this.b;
        boolean z2 = i2 > iD2;
        oswVar.k(i);
        oswVar2.k(i2);
        ytw<Boolean> ytwVar = this.f;
        osw oswVar3 = this.e;
        if (z) {
            oswVar3.k(-1);
            ytwVar.setValue(Boolean.TRUE);
        } else if (z2) {
            oswVar3.k(1);
            ytwVar.setValue(Boolean.TRUE);
        }
        return Unit.a;
    }
}
