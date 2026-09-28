package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.precanned.PreMatchPreCannedBetBuilderViewModel$createBookingCode$2", f = "PreMatchPreCannedBetBuilderViewModel.kt", l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class bi20 extends tje0 implements Function2<myh<? super BookingData>, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ei20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi20(ei20 ei20Var, v1b<? super bi20> v1bVar) {
        super(2, v1bVar);
        this.b = ei20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bi20(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BookingData> myhVar, v1b<? super Unit> v1bVar) {
        return ((bi20) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = this.b.e;
            UIState.Loading loading = new UIState.Loading(null, 1, null);
            this.a = 1;
            wwd0Var.getClass();
            wwd0Var.k(null, loading);
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
