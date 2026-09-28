package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jey {
    public final i5u a;

    public static final class a {
        public boolean a;
        public final cm8<e8q> b;

        public a() {
            throw null;
        }

        public a(boolean z) {
            dm8 dm8VarA = em8.a();
            this.a = z;
            this.b = dm8VarA;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "ConfigRefreshCycle(isGlobal=" + this.a + ", result=" + this.b + ")";
        }
    }

    public jey(i5u i5uVar) {
        this.a = i5uVar;
    }
}
