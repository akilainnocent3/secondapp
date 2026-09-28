package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.c;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class b1l0 extends dal0 {
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ u7l0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1l0(u7l0 u7l0Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.b = taskCompletionSource2;
        this.c = u7l0Var;
    }

    @Override // defpackage.dal0
    public final void a() {
        HashMap map;
        try {
            u7l0 u7l0Var = this.c;
            c1l0 c1l0Var = u7l0Var.a.m;
            String str = u7l0Var.b;
            Bundle bundle = new Bundle();
            HashMap map2 = mal0.a;
            synchronized (mal0.class) {
                map = mal0.a;
                map.put("java", 20002);
            }
            bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
            if (map.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
            }
            if (map.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
            }
            c1l0Var.e(str, bundle, new c(this.c, this.b));
        } catch (RemoteException e) {
            u7l0 u7l0Var2 = this.c;
            v7l0 v7l0Var = u7l0.c;
            Object[] objArr = {u7l0Var2.b};
            v7l0Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", v7l0.c(v7l0Var.a, "error requesting in-app review for %s", objArr), e);
            }
            this.b.trySetException(new RuntimeException(e));
        }
    }
}
