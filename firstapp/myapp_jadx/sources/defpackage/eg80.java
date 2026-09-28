package defpackage;

import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ae80
public final class eg80 {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    @fae
    public /* synthetic */ class a implements o1k<eg80> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.google.firebase.sessions.SessionDetails", aVar, 4);
            kr10Var.j("sessionId", false);
            kr10Var.j("firstSessionId", false);
            kr10Var.j("sessionIndex", false);
            kr10Var.j("sessionStartTimestampUs", false);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            gae0 gae0Var = gae0.a;
            return new php[]{gae0Var, gae0Var, hxo.a, okt.a};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            int i = 0;
            int iM = 0;
            String strJ = null;
            String strJ2 = null;
            long jR = 0;
            boolean z = true;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else if (iV == 0) {
                    strJ = dmaVarC.j(pd80Var, 0);
                    i |= 1;
                } else if (iV == 1) {
                    strJ2 = dmaVarC.j(pd80Var, 1);
                    i |= 2;
                } else if (iV == 2) {
                    iM = dmaVarC.m(pd80Var, 2);
                    i |= 4;
                } else {
                    if (iV != 3) {
                        jtf0.a(iV);
                        return null;
                    }
                    jR = dmaVarC.r(pd80Var, 3);
                    i |= 8;
                }
            }
            dmaVarC.b(pd80Var);
            return new eg80(i, iM, jR, strJ, strJ2);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            eg80 eg80Var = (eg80) obj;
            eg80Var.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            fmaVarC.o(pd80Var, 0, eg80Var.a);
            fmaVarC.o(pd80Var, 1, eg80Var.b);
            fmaVarC.A(2, eg80Var.c, pd80Var);
            fmaVarC.f(pd80Var, 3, eg80Var.d);
            fmaVarC.b(pd80Var);
        }

        @Override // defpackage.o1k
        public final php<?>[] typeParametersSerializers() {
            return mr10.a;
        }
    }

    public static final class b {
        public final php<eg80> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ eg80(int i, int i2, long j, String str, String str2) {
        if (15 != (i & 15)) {
            cgo.a(i, 15, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg80)) {
            return false;
        }
        eg80 eg80Var = (eg80) obj;
        return Intrinsics.g(this.a, eg80Var.a) && Intrinsics.g(this.b, eg80Var.b) && this.c == eg80Var.c && this.d == eg80Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(QQWMbKFOuTf.UETgghsIwsXwZUa);
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", sessionStartTimestampUs=");
        return uvh.a(sb, this.d, ')');
    }

    public eg80(String str, String str2, int i, long j) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}
