package defpackage;

import com.sportybet.android.bookingcode.data.dto.BookingData;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.usecase.SocialShareUseCase$getSocialShareCode$1", f = "SocialShareUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hia0 extends tje0 implements Function2<BookingData, v1b<? super lyh<? extends Pair<? extends BookingData, ? extends Boolean>>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ oia0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hia0(oia0 oia0Var, v1b<? super hia0> v1bVar) {
        super(2, v1bVar);
        this.b = oia0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hia0 hia0Var = new hia0(this.b, v1bVar);
        hia0Var.a = obj;
        return hia0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BookingData bookingData, v1b<? super lyh<? extends Pair<? extends BookingData, ? extends Boolean>>> v1bVar) {
        return ((hia0) create(bookingData, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BookingData bookingData = (BookingData) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = bookingData.shareCode;
        str.getClass();
        return new nia0(new mia0(this.b.d(str)), bookingData);
    }
}
