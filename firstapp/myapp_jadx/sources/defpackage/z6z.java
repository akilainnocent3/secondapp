package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface z6z {

    public static final class a implements z6z {
        public final uf00<OtpSelection> a;
        public final uf00<OtpSelection> b;
        public final j7z<o6z> c;
        public final String d;
        public final UiText e;
        public final UiText f;
        public final boolean g;
        public final boolean h;
        public final nc4 i;
        public final boolean j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(uf00<? extends OtpSelection> uf00Var, uf00<? extends OtpSelection> uf00Var2, j7z<? extends o6z> j7zVar, String str, UiText uiText, UiText uiText2, boolean z, boolean z2, nc4 nc4Var, boolean z3) {
            uf00Var.getClass();
            uf00Var2.getClass();
            str.getClass();
            uiText.getClass();
            uiText2.getClass();
            this.a = uf00Var;
            this.b = uf00Var2;
            this.c = j7zVar;
            this.d = str;
            this.e = uiText;
            this.f = uiText2;
            this.g = z;
            this.h = z2;
            this.i = nc4Var;
            this.j = z3;
        }

        public static a a(a aVar, j7z j7zVar, nc4 nc4Var, boolean z, int i) {
            uf00<OtpSelection> uf00Var = aVar.a;
            uf00<OtpSelection> uf00Var2 = aVar.b;
            if ((i & 4) != 0) {
                j7zVar = aVar.c;
            }
            j7z j7zVar2 = j7zVar;
            String str = aVar.d;
            UiText uiText = aVar.e;
            UiText uiText2 = aVar.f;
            boolean z2 = (i & 64) != 0 ? aVar.g : true;
            boolean z3 = aVar.h;
            if ((i & 256) != 0) {
                nc4Var = aVar.i;
            }
            nc4 nc4Var2 = nc4Var;
            if ((i & 512) != 0) {
                z = aVar.j;
            }
            aVar.getClass();
            uf00Var.getClass();
            uf00Var2.getClass();
            j7zVar2.getClass();
            str.getClass();
            uiText.getClass();
            uiText2.getClass();
            return new a(uf00Var, uf00Var2, j7zVar2, str, uiText, uiText2, z2, z3, nc4Var2, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e) && Intrinsics.g(this.f, aVar.f) && this.g == aVar.g && this.h == aVar.h && Intrinsics.g(this.i, aVar.i) && this.j == aVar.j;
        }

        public final int hashCode() {
            int iA = mtg0.a(mtg0.a(yvf.a(yvf.a(gmf0.a((this.c.hashCode() + yvz.a(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
            nc4 nc4Var = this.i;
            return Boolean.hashCode(this.j) + ((iA + (nc4Var == null ? 0 : nc4Var.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AuthWithOtp(availableOtpList=");
            sb.append(this.a);
            sb.append(", prioritizedOtpList=");
            sb.append(this.b);
            sb.append(", otpApiState=");
            sb.append(this.c);
            sb.append(", imageUrl=");
            sb.append(this.d);
            sb.append(", title=");
            vh8.a(sb, this.e, ", subtitle=", this.f, ", isMoreOptionsShow=");
            nng.a(", hasTelegramAccount=", ", biometricAuthContext=", sb, this.g, this.h);
            sb.append(this.i);
            sb.append(", showLeaveDialog=");
            sb.append(this.j);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class c implements z6z {
        public final o6z a;

        public c(o6z o6zVar) {
            o6zVar.getClass();
            this.a = o6zVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Loaded(followingEvent=" + this.a + ")";
        }
    }

    public static final class d implements z6z {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 580020107;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class b implements z6z {
        public final UiText a;
        public final UiText b;

        public b(UiText uiText, UiText uiText2) {
            uiText.getClass();
            uiText2.getClass();
            this.a = uiText;
            this.b = uiText2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Error(title=" + this.a + ", message=" + this.b + ")";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(UiText uiText) {
            this(new ResourceUiText(R.string.common_functions__error), uiText);
            StringUiText stringUiText = vch0.a;
        }
    }
}
