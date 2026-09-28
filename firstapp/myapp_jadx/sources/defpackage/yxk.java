package defpackage;

import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class yxk {

    public static final class a extends yxk {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("OnAddToStakeChanged(isChecked=", ")", this.a);
        }
    }

    public static final class b extends yxk {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1724988902;
        }

        public final String toString() {
            return "OnAllOptionClicked";
        }
    }

    public static final class c extends yxk {
        public static final c a = new c();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class d extends yxk {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1803743674;
        }

        public final String toString() {
            return dLRYz.YxilqbLDBT;
        }
    }

    public static final class e extends yxk {
        public final String a;
        public final String b;
        public final boolean c;
        public final boolean d;

        public e(String str, String str2, boolean z, boolean z2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b) && this.c == eVar.c && this.d == eVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + mtg0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return lng.a(", isOneCutSelected=", ")", ux5.a("OnShow(totalOdds=", this.a, ", bonusRate=", this.b, ", isFlexiSelected="), this.c, this.d);
        }
    }

    public static final class f extends yxk {
        public static final f a = new f();
    }

    public static final class g extends yxk {
        public static final g a = new g();
    }

    public static final class h extends yxk {
        public final ijf0 a;

        public h(ijf0 ijf0Var) {
            this.a = ijf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.g(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return vwz.a("OnValueChange(textFieldValue=", this.a, ")");
        }
    }
}
