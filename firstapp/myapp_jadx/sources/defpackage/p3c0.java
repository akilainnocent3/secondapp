package defpackage;

import android.os.CountDownTimer;
import android.widget.TextView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class p3c0 extends CountDownTimer {
    public final /* synthetic */ TextView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3c0(long j, TextView textView) {
        super(j, 1000L);
        this.a = textView;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        TextView textView = this.a;
        if (textView != null) {
            textView.setText("00:00");
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        long j2 = j / 1000;
        String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf((j2 % 3600) / 60), Long.valueOf(j2 % 60)}, 2));
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
