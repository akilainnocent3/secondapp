package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import com.sportybet.android.bookingcode.presentation.activity.NonUILoadCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.presentation.activity.NonUILoadCodeActivity$initViewModel$1", f = "NonUILoadCodeActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class txx extends tje0 implements Function2<a, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ NonUILoadCodeActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txx(NonUILoadCodeActivity nonUILoadCodeActivity, v1b<? super txx> v1bVar) {
        super(2, v1bVar);
        this.b = nonUILoadCodeActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        txx txxVar = new txx(this.b, v1bVar);
        txxVar.a = obj;
        return txxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, v1b<? super Unit> v1bVar) {
        return ((txx) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        a aVar = (a) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        NonUILoadCodeActivity nonUILoadCodeActivity = this.b;
        e eVar = nonUILoadCodeActivity.i;
        if (eVar == null) {
            Intrinsics.n("commonUiEventProcessor");
            throw null;
        }
        kc kcVar = nonUILoadCodeActivity.f;
        if (kcVar != null) {
            eVar.c(aVar, nonUILoadCodeActivity, kcVar.a, null);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
