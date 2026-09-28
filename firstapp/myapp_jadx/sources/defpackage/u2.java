package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u2 implements Callable {
    public final /* synthetic */ x2 a;
    public final /* synthetic */ String b;

    public /* synthetic */ u2(x2 x2Var, String str) {
        this.a = x2Var;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        x2 x2Var = this.a;
        if (x2Var.e() == null) {
            ib5.a("Not connected");
            return null;
        }
        StringBuilder sb = new StringBuilder("Send STOMP message: ");
        String str = this.b;
        sb.append(str);
        Log.d("x2", sb.toString());
        x2Var.h(str);
        return null;
    }
}
