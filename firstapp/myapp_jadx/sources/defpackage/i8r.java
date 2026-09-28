package defpackage;

import com.sportybet.android.router.Sender;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80
public final class i8r {
    public static final b Companion = new b();
    public static final ttr<php<Object>>[] c = {hwr.a(a1s.b, new ogm(1)), null};
    public final Sender a;
    public final String b;

    @fae
    public static final /* synthetic */ class a implements o1k<i8r> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.feature.luckynumber.shared.presentation.state.LNScreen.Lobby", aVar, 2);
            kr10Var.j("sender", false);
            kr10Var.j("initialTagApiName", true);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            return new php[]{hj5.a(i8r.c[0].getValue()), hj5.a(gae0.a)};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            ttr<php<Object>>[] ttrVarArr = i8r.c;
            boolean z = true;
            int i = 0;
            Sender sender = null;
            String str = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else if (iV == 0) {
                    sender = (Sender) dmaVarC.n(pd80Var, 0, ttrVarArr[0].getValue(), sender);
                    i |= 1;
                } else {
                    if (iV != 1) {
                        jtf0.a(iV);
                        return null;
                    }
                    str = (String) dmaVarC.n(pd80Var, 1, gae0.a, str);
                    i |= 2;
                }
            }
            dmaVarC.b(pd80Var);
            return new i8r(i, sender, str);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            i8r i8rVar = (i8r) obj;
            i8rVar.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            php<Object> value = i8r.c[0].getValue();
            Sender sender = i8rVar.a;
            String str = i8rVar.b;
            fmaVarC.D(pd80Var, 0, value, sender);
            if (fmaVarC.a(pd80Var) || str != null) {
                fmaVarC.D(pd80Var, 1, gae0.a, str);
            }
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<i8r> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ i8r(int i, Sender sender, String str) {
        if (1 != (i & 1)) {
            cgo.a(i, 1, a.a.getDescriptor());
            throw null;
        }
        this.a = sender;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8r)) {
            return false;
        }
        i8r i8rVar = (i8r) obj;
        return this.a == i8rVar.a && Intrinsics.g(this.b, i8rVar.b);
    }

    public final int hashCode() {
        Sender sender = this.a;
        int iHashCode = (sender == null ? 0 : sender.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Lobby(sender=" + this.a + ", initialTagApiName=" + this.b + ")";
    }

    public i8r(Sender sender, String str) {
        this.a = sender;
        this.b = str;
    }
}
