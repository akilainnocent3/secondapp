package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.InstantVirtualResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.viewmodel.MatchEventViewModel$fetchListEventData$1", f = "MatchEventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s5v extends tje0 implements Function2<lk50<? extends InstantVirtualResponse>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ z5v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5v(v1b v1bVar, z5v z5vVar) {
        super(2, v1bVar);
        this.b = z5vVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s5v s5vVar = new s5v(v1bVar, this.b);
        s5vVar.a = obj;
        return s5vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends InstantVirtualResponse> lk50Var, v1b<? super Unit> v1bVar) {
        return ((s5v) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        z5v z5vVar = this.b;
        try {
            zi50.a aVar = zi50.b;
            InstantVirtualResponse instantVirtualResponse = (InstantVirtualResponse) bm50.i(lk50Var);
            if (instantVirtualResponse != null) {
                z5vVar.F1(instantVirtualResponse);
                Unit unit = Unit.a;
            }
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
        z5vVar.Q.setValue(lk50Var);
        return Unit.a;
    }
}
