package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.precanned.PreMatchPreCannedBetBuilderViewModel$createBookingCode$4", f = "PreMatchPreCannedBetBuilderViewModel.kt", l = {47}, m = "invokeSuspend", v = 2)
public final class di20 extends tje0 implements gaj<myh<? super BookingData>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ ei20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di20(ei20 ei20Var, v1b<? super di20> v1bVar) {
        super(3, v1bVar);
        this.c = ei20Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super BookingData> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        di20 di20Var = new di20(this.c, v1bVar);
        di20Var.b = th;
        return di20Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = this.c.e;
            UIState.Error error = new UIState.Error(th, null, 2, null);
            this.b = null;
            this.a = 1;
            wwd0Var.getClass();
            wwd0Var.k(null, error);
            if (Unit.a == y5bVar) {
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
