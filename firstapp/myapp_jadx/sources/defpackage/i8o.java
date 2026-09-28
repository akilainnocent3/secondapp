package defpackage;

import com.sportybet.android.instantwin.presentation.instantwin.view.InstantWinActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.instantwin.view.InstantWinActivity$initViewModel$2", f = "InstantWinActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i8o extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public final /* synthetic */ InstantWinActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8o(InstantWinActivity instantWinActivity, v1b<? super i8o> v1bVar) {
        super(2, v1bVar);
        this.a = instantWinActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        i8o i8oVar = new i8o(this.a, v1bVar);
        ((Boolean) obj).booleanValue();
        return i8oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((i8o) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a.E != null) {
            return Unit.a;
        }
        Intrinsics.n("sharedConfig");
        throw null;
    }
}
