package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes5.dex */
public final class c2f {
    public final long a;
    public final wwd0 b;
    public final ku90<Unit> c;
    public final wwd0 d;
    public final wwd0 e;
    public et7 f;
    public jvd0 g;

    public c2f(bre0 bre0Var) {
        b.a aVar = b.b;
        this.a = c.h(100, rgf.MILLISECONDS);
        this.b = xwd0.a(q5f.c);
        this.c = new ku90<>();
        this.d = xwd0.a(Boolean.FALSE);
        this.e = xwd0.a(Float.valueOf(1.0f));
    }

    public final void a() {
        wwd0 wwd0Var;
        Object value;
        jvd0 jvd0Var = this.g;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.g = null;
        do {
            wwd0Var = this.d;
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.FALSE));
    }
}
