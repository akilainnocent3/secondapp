package defpackage;

import com.appsflyer.internal.m;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface wr50 {

    public static final class a implements wr50 {
    }

    public static final class b implements wr50 {
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;

        public b(String str, String str2, String str3, boolean z, String str4) {
            m.a(str, str2, str3);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && this.d == bVar.d && Intrinsics.g(this.e, bVar.e);
        }

        public final int hashCode() {
            int iA = mtg0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            String str = this.e;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("FootballEvent(date=", this.a, ", reward=", this.b, ", batchId=");
            uts.b(this.c, ", isProcessing=", ", streakMultiplier=", sbA, this.d);
            return uf80.a(sbA, this.e, ")");
        }
    }

    public static final class c implements wr50 {
        public final String a;
        public final String b;
        public final String c;
        public final yij d;
        public final String e;

        public c(String str, String str2, String str3, yij yijVar, String str4) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            yijVar.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = yijVar;
            this.e = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && Intrinsics.g(this.e, cVar.e);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
            String str = this.e;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("GameEvent(date=", this.a, ", reward=", this.b, ", batchId=");
            sbA.append(this.c);
            sbA.append(", buttonStatus=");
            sbA.append(this.d);
            sbA.append(", streakMultiplier=");
            return uf80.a(sbA, this.e, ")");
        }
    }

    public static final class d implements wr50 {
        public final UiText a;
        public final UiText b;
        public final cgs c;
        public final wae d;
        public final UiText e;

        public d(UiText uiText, UiText uiText2, cgs cgsVar, wae waeVar, UiText uiText3) {
            uiText.getClass();
            this.a = uiText;
            this.b = uiText2;
            this.c = cgsVar;
            this.d = waeVar;
            this.e = uiText3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b) && Intrinsics.g(this.c, dVar.c) && this.d == dVar.d && Intrinsics.g(this.e, dVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + yvf.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = uh8.a(this.a, this.b, "LinkedReward(title=", ", subTitle=", ", button=");
            sbA.append(this.c);
            sbA.append(", destination=");
            sbA.append(this.d);
            sbA.append(", desc=");
            return plf.a(sbA, this.e, ")");
        }
    }

    public static final class e implements wr50 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -770096428;
        }

        public final String toString() {
            return "SkipBallFlickingCheckbox";
        }
    }
}
