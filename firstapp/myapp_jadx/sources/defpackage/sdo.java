package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Overall;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.InstantWinConfigViewModel$fetchOverAllConfig$2", f = "InstantWinConfigViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class sdo extends tje0 implements gaj<myh<? super Overall>, Throwable, v1b<? super Unit>, Object> {
    public final /* synthetic */ wdo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdo(wdo wdoVar, v1b<? super sdo> v1bVar) {
        super(3, v1bVar);
        this.a = wdoVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Overall> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new sdo(this.a, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.w.setValue(kcz.b.a);
        return Unit.a;
    }
}
