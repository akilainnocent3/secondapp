package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.eventdetails.component.MatchEventDetailEventSwitcherBottomSheetKt$MatchEventDetailEventSwitcherBottomSheet$1$1$1$1", f = "MatchEventDetailEventSwitcherBottomSheet.kt", l = {124}, m = "invokeSuspend", v = 2)
public final class k1v extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ j590 b;
    public final /* synthetic */ wyu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1v(j590 j590Var, wyu wyuVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = j590Var;
        this.c = wyuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k1v(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k1v) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (this.b.d(this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        this.c.invoke();
        return Unit.a;
    }
}
