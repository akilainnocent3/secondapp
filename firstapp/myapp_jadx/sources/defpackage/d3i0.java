package defpackage;

import android.content.Context;
import android.os.Vibrator;

/* JADX INFO: loaded from: classes8.dex */
public final class d3i0 {
    public final boolean a;
    public final Vibrator b;

    public d3i0(Context context, boolean z) {
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        this.b = vibrator;
        this.a = !z || vibrator == null;
    }
}
