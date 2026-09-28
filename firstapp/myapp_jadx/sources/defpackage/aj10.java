package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class aj10 {
    public final xk10 a;

    public aj10() {
        this.a = Build.VERSION.SDK_INT >= 28 ? new zk10() : new al10();
    }
}
