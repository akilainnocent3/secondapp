package defpackage;

import com.sportybet.android.instantwin.presentation.promotiondialog.model.InstantWinPromotionDialogInput;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.viewmodel.MatchEventViewModel$special$$inlined$flatMapLatest$2", f = "MatchEventViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class i6v extends tje0 implements gaj<myh<? super InstantWinPromotionDialogInput>, ctg.a, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z5v d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6v(v1b v1bVar, z5v z5vVar) {
        super(3, v1bVar);
        this.d = z5vVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super InstantWinPromotionDialogInput> myhVar, ctg.a aVar, v1b<? super Unit> v1bVar) {
        i6v i6vVar = new i6v(v1bVar, this.d);
        i6vVar.b = myhVar;
        i6vVar.c = aVar;
        return i6vVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            z5v z5vVar = this.d;
            lyh a6vVar = z5vVar.z.s() ? new a6v(z5vVar.H.v1()) : new gzh(null);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, a6vVar, this) == y5bVar) {
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
