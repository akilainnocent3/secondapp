package defpackage;

import com.sporty.android.core.model.bookingcode.BookingCodeInfoOutcomeDto;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iz4 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                BookingCodeInfoOutcomeDto bookingCodeInfoOutcomeDto = (BookingCodeInfoOutcomeDto) obj;
                bookingCodeInfoOutcomeDto.getClass();
                return bookingCodeInfoOutcomeDto.getStartTime();
            default:
                kme kmeVar = (kme) obj;
                kmeVar.getClass();
                return kme.a(kmeVar, null, null, false, false, false, false, false, false, null, 495);
        }
    }
}
