package defpackage;

import com.sporty.android.platform.features.account.verifiedemailchange.verifyidentity.model.EmailChangeVerifyIdentityArgs;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ae80
public final class ozf {
    public static final b Companion = new b();
    public final EmailChangeVerifyIdentityArgs a;

    @fae
    public static final /* synthetic */ class a implements o1k<ozf> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sporty.android.platform.features.account.verifiedemailchange.verifyidentity.navigation.EmailChangeVerifyIdentity", aVar, 1);
            kr10Var.j("args", false);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            return new php[]{EmailChangeVerifyIdentityArgs.a.a};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            boolean z = true;
            int i = 0;
            EmailChangeVerifyIdentityArgs emailChangeVerifyIdentityArgs = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else {
                    if (iV != 0) {
                        jtf0.a(iV);
                        return null;
                    }
                    emailChangeVerifyIdentityArgs = (EmailChangeVerifyIdentityArgs) dmaVarC.y(pd80Var, 0, EmailChangeVerifyIdentityArgs.a.a, emailChangeVerifyIdentityArgs);
                    i = 1;
                }
            }
            dmaVarC.b(pd80Var);
            return new ozf(i, emailChangeVerifyIdentityArgs);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            ozf ozfVar = (ozf) obj;
            ozfVar.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            fmaVarC.q(pd80Var, 0, EmailChangeVerifyIdentityArgs.a.a, ozfVar.a);
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<ozf> serializer() {
            return a.a;
        }
    }

    static {
        EmailChangeVerifyIdentityArgs.Companion companion = EmailChangeVerifyIdentityArgs.INSTANCE;
    }

    public /* synthetic */ ozf(int i, EmailChangeVerifyIdentityArgs emailChangeVerifyIdentityArgs) {
        if (1 == (i & 1)) {
            this.a = emailChangeVerifyIdentityArgs;
        } else {
            cgo.a(i, 1, a.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ozf) && Intrinsics.g(this.a, ((ozf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EmailChangeVerifyIdentity(args=" + this.a + ")";
    }

    public ozf(EmailChangeVerifyIdentityArgs emailChangeVerifyIdentityArgs) {
        this.a = emailChangeVerifyIdentityArgs;
    }
}
