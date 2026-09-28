package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class b9z {

    public static final class a extends b9z {
        public final bxz a;

        public a(bxz bxzVar) {
            this.a = bxzVar;
        }

        @Override // defpackage.b9z
        public final lk40 a() {
            return this.a.getBounds();
        }
    }

    public static final class b extends b9z {
        public final lk40 a;

        public b(lk40 lk40Var) {
            this.a = lk40Var;
        }

        @Override // defpackage.b9z
        public final lk40 a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return Intrinsics.g(this.a, ((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class c extends b9z {
        public final lz50 a;
        public final j90 b;

        public c(lz50 lz50Var) {
            j90 j90VarA;
            this.a = lz50Var;
            if (bys.f(lz50Var)) {
                j90VarA = null;
            } else {
                j90VarA = m90.a();
                bxz.s(j90VarA, lz50Var);
            }
            this.b = j90VarA;
        }

        @Override // defpackage.b9z
        public final lk40 a() {
            lz50 lz50Var = this.a;
            return new lk40(lz50Var.a, lz50Var.b, lz50Var.c, lz50Var.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return Intrinsics.g(this.a, ((c) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public abstract lk40 a();
}
