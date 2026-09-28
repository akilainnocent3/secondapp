package defpackage;

import android.content.Context;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes6.dex */
public final class hke0 implements a5d {
    public static final fke0 g = new fke0();
    public final nbn a;
    public final u2z b;
    public final dke0 c;
    public final Function1<Context, Float> d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: loaded from: classes.dex */
    public static final class a implements a5d.a {
        public final dke0 a = dke0.a.a;
        public final Function1<Context, Float> b = hke0.g;
        public final boolean c = true;
        public final boolean d = true;

        public a(int i) {
        }

        @Override // a5d.a
        public final a5d a(aqa0 aqa0Var, u2z u2zVar, a840 a840Var) {
            if (!Intrinsics.g(aqa0Var.b, "image/svg+xml")) {
                cc5 cc5VarSource = aqa0Var.a.source();
                if (!cc5VarSource.y(0L, y4d.b) || cc5VarSource.K(RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE, y4d.a) == -1) {
                    return null;
                }
            }
            return new hke0(aqa0Var.a, u2zVar, this.a, this.b, this.c, this.d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hke0(nbn nbnVar, u2z u2zVar, dke0 dke0Var, Function1<? super Context, Float> function1, boolean z, boolean z2) {
        this.a = nbnVar;
        this.b = u2zVar;
        this.c = dke0Var;
        this.d = function1;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.a5d
    public final Object a(v1b<? super w4d> v1bVar) {
        return ej5.d(e.a, new izo(new oza0(this, 1), null), (x1b) v1bVar);
    }
}
