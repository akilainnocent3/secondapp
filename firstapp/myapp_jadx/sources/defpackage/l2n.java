package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.kickoff.matchtracker.component.IbLottiePlayerKt$LottiePlayerInternal$1$1", f = "IbLottiePlayer.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l2n extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ont a;
    public final /* synthetic */ fmt b;
    public final /* synthetic */ isw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2n(ont ontVar, fmt fmtVar, isw iswVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = ontVar;
        this.b = fmtVar;
        this.c = iswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new l2n(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l2n) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a.getValue() != null) {
            fmt fmtVar = this.b;
            if (fmtVar.getValue().floatValue() > 0.0f) {
                this.c.A(fmtVar.getValue().floatValue());
            }
        }
        return Unit.a;
    }
}
