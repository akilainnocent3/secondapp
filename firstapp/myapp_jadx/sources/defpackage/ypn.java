package defpackage;

import com.sporty.android.core.model.dispatcher.ApplicationScope;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class ypn {
    public final yqm a;
    public final mgb0 b;
    public final v5b c;
    public final wwd0 d;
    public jvd0 e;

    public ypn(yqm yqmVar, mgb0 mgb0Var, @ApplicationScope v5b v5bVar) {
        yqmVar.getClass();
        mgb0Var.getClass();
        v5bVar.getClass();
        this.a = yqmVar;
        this.b = mgb0Var;
        this.c = v5bVar;
        this.d = xwd0.a(null);
    }

    public final void a() {
        wwd0 wwd0Var;
        Object value;
        jvd0 jvd0Var = this.e;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.e = null;
        do {
            wwd0Var = this.d;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, null));
    }
}
