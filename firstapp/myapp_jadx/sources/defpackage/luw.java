package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class luw {
    public final AtomicReference<a> a = new AtomicReference<>(null);
    public final tuw b = uuw.a();

    public static final class a {
        public final c9p a;

        public a(c9p c9pVar) {
            iuw iuwVar = iuw.a;
            this.a = c9pVar;
        }
    }

    public static Object a(luw luwVar, Function1 function1, v1b v1bVar) {
        iuw iuwVar = iuw.a;
        luwVar.getClass();
        return w5b.d(new nuw(luwVar, function1, null), v1bVar);
    }
}
