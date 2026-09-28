package defpackage;

import com.twilio.voice.EventKeys;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ae80
public final class hwe {
    public static final b Companion = new b();
    public final boolean a;
    public final String b;

    @fae
    public static final /* synthetic */ class a implements o1k<hwe> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sporty.android.platform.features.dateofbirth.ui.navigation.DobSuccess", aVar, 2);
            kr10Var.j("qualifiedForGift", false);
            kr10Var.j(EventKeys.ERROR_MESSAGE, false);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            return new php[]{x15.a, gae0.a};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            boolean z = true;
            int i = 0;
            boolean zE = false;
            String strJ = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else if (iV == 0) {
                    zE = dmaVarC.E(pd80Var, 0);
                    i |= 1;
                } else {
                    if (iV != 1) {
                        jtf0.a(iV);
                        return null;
                    }
                    strJ = dmaVarC.j(pd80Var, 1);
                    i |= 2;
                }
            }
            dmaVarC.b(pd80Var);
            return new hwe(i, zE, strJ);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            hwe hweVar = (hwe) obj;
            hweVar.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            fmaVarC.i(pd80Var, 0, hweVar.a);
            fmaVarC.o(pd80Var, 1, hweVar.b);
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<hwe> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ hwe(int i, boolean z, String str) {
        if (3 != (i & 3)) {
            cgo.a(i, 3, a.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwe)) {
            return false;
        }
        hwe hweVar = (hwe) obj;
        return this.a == hweVar.a && Intrinsics.g(this.b, hweVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DobSuccess(qualifiedForGift=" + this.a + ", message=" + this.b + ")";
    }

    public hwe(boolean z, String str) {
        str.getClass();
        this.a = z;
        this.b = str;
    }
}
