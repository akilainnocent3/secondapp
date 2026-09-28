package defpackage;

import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class rfs implements nk0.a {

    public static final class a extends rfs {
        public final String a;
        public final jlf0 b;
        public final ufs c;

        public a(String str, jlf0 jlf0Var, ufs ufsVar) {
            this.a = str;
            this.b = jlf0Var;
            this.c = ufsVar;
        }

        @Override // defpackage.rfs
        public final ufs a() {
            return this.c;
        }

        @Override // defpackage.rfs
        public final jlf0 b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            jlf0 jlf0Var = this.b;
            int iHashCode2 = (iHashCode + (jlf0Var != null ? jlf0Var.hashCode() : 0)) * 31;
            ufs ufsVar = this.c;
            return iHashCode2 + (ufsVar != null ? ufsVar.hashCode() : 0);
        }

        public final String toString() {
            return j26.a(new StringBuilder("LinkAnnotation.Clickable(tag="), this.a, ')');
        }
    }

    public static final class b extends rfs {
        public final String a;
        public final jlf0 b;
        public final ufs c;

        public b(String str, jlf0 jlf0Var, ufs ufsVar) {
            this.a = str;
            this.b = jlf0Var;
            this.c = ufsVar;
        }

        @Override // defpackage.rfs
        public final ufs a() {
            return this.c;
        }

        @Override // defpackage.rfs
        public final jlf0 b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            jlf0 jlf0Var = this.b;
            int iHashCode2 = (iHashCode + (jlf0Var != null ? jlf0Var.hashCode() : 0)) * 31;
            ufs ufsVar = this.c;
            return iHashCode2 + (ufsVar != null ? ufsVar.hashCode() : 0);
        }

        public final String toString() {
            return j26.a(new StringBuilder(xOgHBQVl.RrFCkngCf), this.a, ')');
        }
    }

    public abstract ufs a();

    public abstract jlf0 b();
}
