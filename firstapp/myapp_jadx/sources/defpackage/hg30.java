package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigParamDto;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hg30 {
    public final et7 a;
    public final hck b;
    public final ch30 c;
    public final wwd0 d;
    public qxd0<dh30> e;
    public fg30 f;
    public String g;

    public static final class a {
        public final hck a;
        public final ch30 b;

        static {
            BOConfigParamDto bOConfigParamDto = hck.c;
        }

        public a(hck hckVar, ch30 ch30Var) {
            ch30Var.getClass();
            this.a = hckVar;
            this.b = ch30Var;
        }
    }

    public hg30(et7 et7Var, hck hckVar, ch30 ch30Var) {
        ch30Var.getClass();
        this.a = et7Var;
        this.b = hckVar;
        this.c = ch30Var;
        this.d = xwd0.a(null);
    }

    public final jvd0 a(Function2 function2) {
        return ej5.c(this.a, null, null, new jg30(function2, null), 3);
    }

    public final void b(dh30 dh30Var) {
        qxd0<dh30> qxd0Var = this.e;
        if (qxd0Var == null) {
            Intrinsics.n("quickInputState");
            throw null;
        }
        qxd0Var.a(dh30Var);
        if (dh30Var instanceof dh30.c) {
            this.f = ((dh30.c) dh30Var).a;
            String str = this.g;
            if (str != null) {
                this.g = null;
                a(new ng30(str, this, null));
            }
        }
    }
}
