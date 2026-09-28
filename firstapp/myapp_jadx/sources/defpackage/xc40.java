package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.recap.presentation.compose.screen.RecapAnalyzingScreenKt$RecapAnalyzingScreen$2$1", f = "RecapAnalyzingScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xc40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Function1<nc40, Unit> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc40(Function1 function1, boolean z, v1b v1bVar) {
        super(2, v1bVar);
        this.a = z;
        this.b = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xc40(this.b, this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xc40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a) {
            this.b.invoke(nc40.d.a);
        }
        return Unit.a;
    }
}
