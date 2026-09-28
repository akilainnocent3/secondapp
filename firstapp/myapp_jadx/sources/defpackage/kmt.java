package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", l = {}, m = "invokeSuspend")
public final class kmt extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public final /* synthetic */ jmt a;
    public final /* synthetic */ xmt b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmt(jmt jmtVar, xmt xmtVar, float f, int i, boolean z, v1b<? super kmt> v1bVar) {
        super(1, v1bVar);
        this.a = jmtVar;
        this.b = xmtVar;
        this.c = f;
        this.d = i;
        this.e = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new kmt(this.a, this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((kmt) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        jmt jmtVar = this.a;
        ((x5a0) jmtVar.w).setValue(this.b);
        jmtVar.f(this.c);
        jmtVar.c(this.d);
        jmtVar.d(false);
        if (this.e) {
            ((x5a0) jmtVar.A).setValue(Long.MIN_VALUE);
        }
        return Unit.a;
    }
}
