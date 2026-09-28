package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface hiw {

    public static final class a implements hiw {
        public final int a;
        public final int b;
        public final k980 c;
        public final boolean d;
        public final ArrayList<Selection> e;
        public final String f;
        public final String g;

        public a(int i, int i2, k980 k980Var, boolean z, ArrayList<Selection> arrayList, String str, String str2) {
            this.a = i;
            this.b = i2;
            this.c = k980Var;
            this.d = z;
            this.e = arrayList;
            this.f = str;
            this.g = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e.equals(aVar.e) && Intrinsics.g(this.f, aVar.f) && Intrinsics.g(this.g, aVar.g);
        }

        public final int hashCode() {
            int iA = nl.a(this.e, mtg0.a((this.c.hashCode() + gpp.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31, 31, this.d), 31);
            String str = this.f;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.g;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbA = dy5.a("BackToBetSlip(multiMakerAction=", this.a, this.b, ", codeProvider=", ", selectionSource=");
            sbA.append(this.c);
            sbA.append(", shouldShowReplaceHint=");
            sbA.append(this.d);
            sbA.append(", selectionsToKeep=");
            sbA.append(this.e);
            sbA.append(", codeSource=");
            sbA.append(this.f);
            sbA.append(", loadingShareCode=");
            return uf80.a(sbA, this.g, ")");
        }
    }

    public static final class b implements hiw {
        public final boolean a;
        public final iiw b;

        public b(boolean z, iiw iiwVar) {
            this.a = z;
            this.b = iiwVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.a == bVar.a && this.b == bVar.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "ShowAddToBetSlipOptions(isLockedSelectionsOnlyOptionEnabled=" + this.a + ", callback=" + this.b + ")";
        }
    }
}
