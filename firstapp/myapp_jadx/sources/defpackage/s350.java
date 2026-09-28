package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import com.sportybet.feature.remixbet.presentation.RemixBetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.remixbet.presentation.RemixBetActivity$observeUiEvents$2", f = "RemixBetActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s350 extends tje0 implements Function2<a, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ RemixBetActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s350(RemixBetActivity remixBetActivity, v1b<? super s350> v1bVar) {
        super(2, v1bVar);
        this.b = remixBetActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s350 s350Var = new s350(this.b, v1bVar);
        s350Var.a = obj;
        return s350Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, v1b<? super Unit> v1bVar) {
        return ((s350) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        a aVar = (a) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        RemixBetActivity remixBetActivity = this.b;
        e eVar = remixBetActivity.c;
        if (eVar != null) {
            eVar.c(aVar, remixBetActivity, remixBetActivity.getWindow().getDecorView(), null);
            return Unit.a;
        }
        Intrinsics.n("commonUiEventProcessor");
        throw null;
    }
}
