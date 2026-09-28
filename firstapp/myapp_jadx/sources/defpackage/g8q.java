package defpackage;

import com.google.protobuf.Reader;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public final class g8q {
    public final tb5 a;
    public final AtomicLong b;
    public final t340 c;

    public g8q(v5b v5bVar, jey jeyVar) {
        v5bVar.getClass();
        tb5 tb5VarB = d77.b(Reader.READ_DONE, 6, null);
        this.a = tb5VarB;
        this.b = new AtomicLong(0L);
        this.c = e1i.d(hzh.b(new key(izh.c(tb5VarB), jeyVar, null)), v5bVar, q490.a.a, 0);
    }
}
