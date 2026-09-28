package defpackage;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.viewmodel.MatchEventViewModel$special$$inlined$flatMapLatest$1", f = "MatchEventViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class h6v extends tje0 implements gaj<myh<? super lk50<? extends Unit>>, Pair<? extends String, ? extends String>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z5v d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6v(v1b v1bVar, z5v z5vVar) {
        super(3, v1bVar);
        this.d = z5vVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends Unit>> myhVar, Pair<? extends String, ? extends String> pair, v1b<? super Unit> v1bVar) {
        h6v h6vVar = new h6v(v1bVar, this.d);
        h6vVar.b = myhVar;
        h6vVar.c = pair;
        return h6vVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            Pair pair = (Pair) this.c;
            yzh yzhVar = new yzh(new or60(new b6v(this.d, (String) pair.a, (String) pair.b, null)), new c6v(3, null));
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, yzhVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
