package defpackage;

import java.util.logging.Logger;
import okhttp3.Request;

/* JADX INFO: loaded from: classes8.dex */
public final class b260 {
    public static volatile b a;

    public static final class a<T, F> extends wei0<T, F> {
        public final jyi0 a = new jyi0();

        @Override // defpackage.wei0
        public final Object a(Request request) {
            hyi0.c cVar = this.a.a;
            h5.a();
            request.getClass();
            hyi0.b bVarB = cVar.b(request);
            try {
                return cVar.a.get(bVarB);
            } finally {
                cVar.c(bVarB);
            }
        }

        @Override // defpackage.wei0
        public final void b(Request request, m0b m0bVar) {
            jyi0 jyi0Var = this.a;
            if (m0bVar != null) {
                hyi0.c cVar = jyi0Var.a;
                h5.a();
                request.getClass();
                cVar.a.put(new h5.c(request, cVar.b), m0bVar);
                return;
            }
            hyi0.c cVar2 = jyi0Var.a;
            h5.a();
            request.getClass();
            hyi0.b bVarB = cVar2.b(request);
            try {
                cVar2.a.remove(bVarB);
            } finally {
                cVar2.c(bVarB);
            }
        }
    }

    public static final class b {
        public final jyi0 a = new jyi0();
    }

    static {
        Logger.getLogger(b260.class.getName());
        a = new b();
    }
}
