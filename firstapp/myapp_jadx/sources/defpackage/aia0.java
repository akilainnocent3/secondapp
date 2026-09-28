package defpackage;

import com.sportybet.android.bookingcode.data.dto.BookingData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.usecase.SocialShareUseCase$addOrEditSocialShareCode$1", f = "SocialShareUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class aia0 extends tje0 implements Function2<BookingData, v1b<? super lyh<? extends a8a0>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ oia0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aia0(oia0 oia0Var, v1b<? super aia0> v1bVar) {
        super(2, v1bVar);
        this.b = oia0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        aia0 aia0Var = new aia0(this.b, v1bVar);
        aia0Var.a = obj;
        return aia0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BookingData bookingData, v1b<? super lyh<? extends a8a0>> v1bVar) {
        return ((aia0) create(bookingData, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BookingData bookingData = (BookingData) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new or60(new dia0(bookingData, this.b, null));
    }
}
