package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g7f0 {

    public static final class a extends g7f0 {
        public final o7v a;
        public final boolean b;
        public final boolean c;
        public final uf00<fpg> d;
        public final uf00<fpg> e;
        public final boolean f;
        public final boolean g;
        public final prg h;
        public final mjs i;
        public final uf00<r680> j;
        public final r680 k;

        public a(o7v o7vVar, boolean z, boolean z2, uf00<fpg> uf00Var, uf00<fpg> uf00Var2, boolean z3, boolean z4, prg prgVar, mjs mjsVar, uf00<r680> uf00Var3, r680 r680Var) {
            o7vVar.getClass();
            uf00Var.getClass();
            uf00Var2.getClass();
            mjsVar.getClass();
            uf00Var3.getClass();
            r680Var.getClass();
            this.a = o7vVar;
            this.b = z;
            this.c = z2;
            this.d = uf00Var;
            this.e = uf00Var2;
            this.f = z3;
            this.g = z4;
            this.h = prgVar;
            this.i = mjsVar;
            this.j = uf00Var3;
            this.k = r680Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && Intrinsics.g(this.h, aVar.h) && this.i == aVar.i && Intrinsics.g(this.j, aVar.j) && Intrinsics.g(this.k, aVar.k);
        }

        public final int hashCode() {
            int iA = mtg0.a(mtg0.a(yvz.a(this.e, yvz.a(this.d, mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g);
            prg prgVar = this.h;
            return this.k.hashCode() + yvz.a(this.j, (this.i.hashCode() + ((iA + (prgVar == null ? 0 : prgVar.hashCode())) * 31)) * 31, 31);
        }

        public final String toString() {
            return "Content(selectedTab=" + this.a + ", isLoadingEvents=" + this.b + ", isLoadingMore=" + this.c + ", fixtures=" + this.d + ", results=" + this.e + ", hasNextFixturesPage=" + this.f + ", hasNextResultsPage=" + this.g + ", liveEvent=" + this.h + ", liveContentMode=" + this.i + ", tournaments=" + this.j + ", selectedTournament=" + this.k + ")";
        }
    }

    public static final class b extends g7f0 {
        public final String a;

        public b(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("Error(errorMessage=", this.a, ")");
        }
    }

    public static final class c extends g7f0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1945021457;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
