package defpackage;

import com.google.protobuf.Reader;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class mj90<T> {
    public final v5b a;
    public final prc b;
    public final tb5 c;
    public final s11 d;

    public mj90(v5b v5bVar, nrc nrcVar, Function2 function2, prc prcVar) {
        function2.getClass();
        this.a = v5bVar;
        this.b = prcVar;
        this.c = d77.b(Reader.READ_DONE, 6, null);
        this.d = new s11();
        c9p c9pVar = (c9p) v5bVar.getCoroutineContext().get(c9p.b.a);
        if (c9pVar != null) {
            c9pVar.invokeOnCompletion(new kj90(nrcVar, this, function2));
        }
    }
}
