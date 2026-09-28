package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import com.sportybet.android.choosebet.presentation.ChooseBetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.choosebet.presentation.ChooseBetActivity$initViewModel$4", f = "ChooseBetActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mm7 extends tje0 implements Function2<a, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChooseBetActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm7(ChooseBetActivity chooseBetActivity, v1b<? super mm7> v1bVar) {
        super(2, v1bVar);
        this.b = chooseBetActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mm7 mm7Var = new mm7(this.b, v1bVar);
        mm7Var.a = obj;
        return mm7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, v1b<? super Unit> v1bVar) {
        return ((mm7) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        a aVar = (a) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ChooseBetActivity chooseBetActivity = this.b;
        e eVar = chooseBetActivity.i;
        if (eVar == null) {
            Intrinsics.n("commonUiEventProcessor");
            throw null;
        }
        zfd0 zfd0Var = chooseBetActivity.b;
        if (zfd0Var != null) {
            eVar.c(aVar, chooseBetActivity, zfd0Var.a, null);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
