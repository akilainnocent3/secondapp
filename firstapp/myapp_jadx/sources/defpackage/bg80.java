package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ae80
public final class bg80 {
    public static final b Companion = new b();
    public static final php<Object>[] d = {null, null, new yfs(gae0.a, xw20.a.a)};
    public final eg80 a;
    public final ktf0 b;
    public final Map<String, xw20> c;

    @fae
    public /* synthetic */ class a implements o1k<bg80> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.google.firebase.sessions.SessionData", aVar, 3);
            kr10Var.j("sessionDetails", false);
            kr10Var.j("backgroundTime", true);
            kr10Var.j("processDataMap", true);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            return new php[]{eg80.a.a, hj5.a(ktf0.a.a), hj5.a(bg80.d[2])};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            php<Object>[] phpVarArr = bg80.d;
            boolean z = true;
            int i = 0;
            eg80 eg80Var = null;
            ktf0 ktf0Var = null;
            Map map = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else if (iV == 0) {
                    eg80Var = (eg80) dmaVarC.y(pd80Var, 0, eg80.a.a, eg80Var);
                    i |= 1;
                } else if (iV == 1) {
                    ktf0Var = (ktf0) dmaVarC.n(pd80Var, 1, ktf0.a.a, ktf0Var);
                    i |= 2;
                } else {
                    if (iV != 2) {
                        jtf0.a(iV);
                        return null;
                    }
                    map = (Map) dmaVarC.n(pd80Var, 2, phpVarArr[2], map);
                    i |= 4;
                }
            }
            dmaVarC.b(pd80Var);
            return new bg80(i, eg80Var, ktf0Var, map);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            bg80 bg80Var = (bg80) obj;
            bg80Var.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            php<Object>[] phpVarArr = bg80.d;
            eg80.a aVar = eg80.a.a;
            eg80 eg80Var = bg80Var.a;
            Map<String, xw20> map = bg80Var.c;
            ktf0 ktf0Var = bg80Var.b;
            fmaVarC.q(pd80Var, 0, aVar, eg80Var);
            if (fmaVarC.a(pd80Var) || ktf0Var != null) {
                fmaVarC.D(pd80Var, 1, ktf0.a.a, ktf0Var);
            }
            if (fmaVarC.a(pd80Var) || map != null) {
                fmaVarC.D(pd80Var, 2, phpVarArr[2], map);
            }
            fmaVarC.b(pd80Var);
        }

        @Override // defpackage.o1k
        public final php<?>[] typeParametersSerializers() {
            return mr10.a;
        }
    }

    public static final class b {
        public final php<bg80> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ bg80(int i, eg80 eg80Var, ktf0 ktf0Var, Map map) {
        if (1 != (i & 1)) {
            cgo.a(i, 1, a.a.getDescriptor());
            throw null;
        }
        this.a = eg80Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ktf0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public static bg80 a(bg80 bg80Var, eg80 eg80Var, ktf0 ktf0Var, Map map, int i) {
        if ((i & 1) != 0) {
            eg80Var = bg80Var.a;
        }
        if ((i & 2) != 0) {
            ktf0Var = bg80Var.b;
        }
        if ((i & 4) != 0) {
            map = bg80Var.c;
        }
        bg80Var.getClass();
        eg80Var.getClass();
        return new bg80(eg80Var, ktf0Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg80)) {
            return false;
        }
        bg80 bg80Var = (bg80) obj;
        return Intrinsics.g(this.a, bg80Var.a) && Intrinsics.g(this.b, bg80Var.b) && Intrinsics.g(this.c, bg80Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ktf0 ktf0Var = this.b;
        int iHashCode2 = (iHashCode + (ktf0Var == null ? 0 : Long.hashCode(ktf0Var.a))) * 31;
        Map<String, xw20> map = this.c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.a + ", backgroundTime=" + this.b + ", processDataMap=" + this.c + ')';
    }

    public bg80(eg80 eg80Var, ktf0 ktf0Var, Map<String, xw20> map) {
        eg80Var.getClass();
        this.a = eg80Var;
        this.b = ktf0Var;
        this.c = map;
    }
}
