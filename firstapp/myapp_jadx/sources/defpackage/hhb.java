package defpackage;

import android.os.CountDownTimer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class hhb extends CountDownTimer {
    public final /* synthetic */ fgb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhb(long j, fgb fgbVar) {
        super(j, 1000L);
        this.a = fgbVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        ((x5a0) this.a.c1().d0).setValue("00:00");
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        long j2 = j / 1000;
        ((x5a0) this.a.c1().d0).setValue(String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf((j2 % 3600) / 60), Long.valueOf(j2 % 60)}, 2)));
    }
}
