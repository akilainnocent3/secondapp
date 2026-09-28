package defpackage;

import com.sporty.android.core.model.realsports.liabilitycheck.QuickLiabilityCheckResponseDto;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class sh30 {
    public static final uh30 a(QuickLiabilityCheckResponseDto quickLiabilityCheckResponseDto, ArrayList arrayList) {
        quickLiabilityCheckResponseDto.getClass();
        return Intrinsics.g(quickLiabilityCheckResponseDto.getBookingCodeBlocked(), Boolean.TRUE) ? new uh30.b(arrayList) : new uh30.a(0);
    }
}
