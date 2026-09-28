package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.eventdetails.MatchEventDetailViewModel$special$$inlined$flatMapLatest$1", f = "MatchEventDetailViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class k3v extends tje0 implements gaj<myh<? super ink>, nqc<?>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ m3v d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3v(v1b v1bVar, m3v m3vVar) {
        super(3, v1bVar);
        this.d = m3vVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super ink> myhVar, nqc<?> nqcVar, v1b<? super Unit> v1bVar) {
        k3v k3vVar = new k3v(v1bVar, this.d);
        k3vVar.b = myhVar;
        k3vVar.c = nqcVar;
        return k3vVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            m3v m3vVar = this.d;
            lyh gzhVar = m3vVar.i.H() ? m3vVar.B.h : new gzh(ink.b.a);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, gzhVar, this) == y5bVar) {
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
