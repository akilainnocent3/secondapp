package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.precanned.PreMatchPreCannedBetBuilderViewModel$createBookingCode$3", f = "PreMatchPreCannedBetBuilderViewModel.kt", l = {46}, m = "invokeSuspend", v = 2)
public final class ci20 extends tje0 implements Function2<BookingData, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ei20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci20(ei20 ei20Var, v1b<? super ci20> v1bVar) {
        super(2, v1bVar);
        this.c = ei20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ci20 ci20Var = new ci20(this.c, v1bVar);
        ci20Var.b = obj;
        return ci20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BookingData bookingData, v1b<? super Unit> v1bVar) {
        return ((ci20) create(bookingData, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BookingData bookingData = (BookingData) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = this.c.e;
            UIState.Success success = new UIState.Success(bookingData);
            this.b = null;
            this.a = 1;
            wwd0Var.getClass();
            wwd0Var.k(null, success);
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
