package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80
public final class e04 {
    public static final b Companion = new b();
    public final Boolean a;

    @fae
    public static final /* synthetic */ class a implements o1k<e04> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.feature.loyalty.impl.bettingstreak.presentation.navigation.BettingStreak", aVar, 1);
            kr10Var.j("showNewBadgeOnAlert", true);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            return new php[]{hj5.a(x15.a)};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            boolean z = true;
            int i = 0;
            Boolean bool = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else {
                    if (iV != 0) {
                        jtf0.a(iV);
                        return null;
                    }
                    bool = (Boolean) dmaVarC.n(pd80Var, 0, x15.a, bool);
                    i = 1;
                }
            }
            dmaVarC.b(pd80Var);
            return new e04(i, bool);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            e04 e04Var = (e04) obj;
            e04Var.getClass();
            Boolean bool = e04Var.a;
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            if (fmaVarC.a(pd80Var) || bool != null) {
                fmaVarC.D(pd80Var, 0, x15.a, bool);
            }
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<e04> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ e04(int i, Boolean bool) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e04) && Intrinsics.g(this.a, ((e04) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "BettingStreak(showNewBadgeOnAlert=" + this.a + ")";
    }

    public e04(Boolean bool) {
        this.a = bool;
    }

    public e04() {
        this(null);
    }
}
