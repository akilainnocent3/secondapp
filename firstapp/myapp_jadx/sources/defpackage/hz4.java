package defpackage;

import com.sporty.android.core.model.bookingcode.BookingCodeInfoOutcomeDto;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hz4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hz4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                BookingCodeInfoOutcomeDto bookingCodeInfoOutcomeDto = (BookingCodeInfoOutcomeDto) obj;
                bookingCodeInfoOutcomeDto.getClass();
                return Boolean.valueOf(!Intrinsics.g(bookingCodeInfoOutcomeDto.getEventId(), (String) obj2));
            case 1:
                jc50 jc50Var = (jc50) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                jc50Var.b = OtpData.RestPassword.a((OtpData.RestPassword) jc50Var.B1(), oTPResult);
                return Unit.a;
            default:
                vad0 vad0Var = (vad0) obj2;
                cgb.a(vad0Var.e1(), (String) ((x5a0) vad0Var.c1().v).getValue(), "placeBet", (String) obj);
                return Unit.a;
        }
    }
}
