package defpackage;

import com.sporty.android.platform.features.account.verifiedemailchange.model.EmailChangeFlowArgs;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ae80
public final class pxf {
    public static final b Companion = new b();
    public final EmailChangeFlowArgs a;

    @fae
    public static final /* synthetic */ class a implements o1k<pxf> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sporty.android.platform.features.account.verifiedemailchange.notice.navigation.EmailChangeNotice", aVar, 1);
            kr10Var.j("args", false);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            return new php[]{EmailChangeFlowArgs.a.a};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            boolean z = true;
            int i = 0;
            EmailChangeFlowArgs emailChangeFlowArgs = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else {
                    if (iV != 0) {
                        jtf0.a(iV);
                        return null;
                    }
                    emailChangeFlowArgs = (EmailChangeFlowArgs) dmaVarC.y(pd80Var, 0, EmailChangeFlowArgs.a.a, emailChangeFlowArgs);
                    i = 1;
                }
            }
            dmaVarC.b(pd80Var);
            return new pxf(i, emailChangeFlowArgs);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            pxf pxfVar = (pxf) obj;
            pxfVar.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            fmaVarC.q(pd80Var, 0, EmailChangeFlowArgs.a.a, pxfVar.a);
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<pxf> serializer() {
            return a.a;
        }
    }

    static {
        EmailChangeFlowArgs.Companion companion = EmailChangeFlowArgs.INSTANCE;
    }

    public /* synthetic */ pxf(int i, EmailChangeFlowArgs emailChangeFlowArgs) {
        if (1 == (i & 1)) {
            this.a = emailChangeFlowArgs;
        } else {
            cgo.a(i, 1, a.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pxf) && Intrinsics.g(this.a, ((pxf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EmailChangeNotice(args=" + this.a + ")";
    }

    public pxf(EmailChangeFlowArgs emailChangeFlowArgs) {
        this.a = emailChangeFlowArgs;
    }
}
