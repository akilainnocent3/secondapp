package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class q6f {
    public final a a;

    /* JADX INFO: loaded from: classes6.dex */
    public interface a {
        void a(Context context, int i, long j, long j2);

        void b(Context context, CharSequence charSequence);

        void e(Context context, CharSequence charSequence, Intent intent);

        void f(Context context);
    }

    public q6f() {
        this.a = Build.VERSION.SDK_INT >= 31 ? new s6f() : new r6f();
    }
}
