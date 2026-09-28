package defpackage;

import com.sporty.android.core.model.pocket.withdraw.transfer.TransferStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class asg0 {
    public static final csg0 a(TransferStatus transferStatus) {
        transferStatus.getClass();
        if (Intrinsics.g(transferStatus.getEnableTransfer(), Boolean.TRUE)) {
            return new csg0.b(false);
        }
        Long enableTime = transferStatus.getEnableTime();
        if (!transferStatus.isVerificationAllPassed() || enableTime == null || enableTime.longValue() <= 0) {
            return csg0.c.a;
        }
        return enableTime.longValue() - System.currentTimeMillis() < 0 ? new csg0.b(true) : csg0.a.a;
    }
}
