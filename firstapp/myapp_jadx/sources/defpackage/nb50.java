package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class nb50 extends upv {
    public final Context c;

    public nb50(Context context, int i, int i2) {
        super(i, i2);
        this.c = context;
    }

    @Override // defpackage.upv
    public final void a(vfe0 vfe0Var) {
        vfe0Var.getClass();
        if (this.b >= 10) {
            vfe0Var.U0(new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
