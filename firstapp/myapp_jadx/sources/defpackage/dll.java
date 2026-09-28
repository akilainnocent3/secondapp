package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.d;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class dll extends bjb0 {
    public final Map<String, m730<sxj0<? extends d>>> b;

    public dll(d150 d150Var) {
        this.b = d150Var;
    }

    @Override // defpackage.bjb0
    public final d H(Context context, String str, WorkerParameters workerParameters) {
        m730<sxj0<? extends d>> m730Var = this.b.get(str);
        if (m730Var == null) {
            return null;
        }
        return m730Var.get().a(context, workerParameters);
    }
}
