package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w3k0 {
    public final a a;
    public final r3k0 b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final UiText g;
    public final boolean h;

    public interface a {

        /* JADX INFO: renamed from: w3k0$a$a, reason: collision with other inner class name */
        public static final class C1238a implements a {
            public final UiText a;

            public C1238a(UiText uiText) {
                uiText.getClass();
                this.a = uiText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1238a) && Intrinsics.g(this.a, ((C1238a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return xh8.a(this.a, "Error(message=", ")");
            }
        }

        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 158586313;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -2045234032;
            }

            public final String toString() {
                return "Success";
            }
        }
    }

    public w3k0(a aVar, r3k0 r3k0Var, String str, String str2, boolean z, boolean z2, UiText uiText, boolean z3) {
        aVar.getClass();
        this.a = aVar;
        this.b = r3k0Var;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = uiText;
        this.h = z3;
    }

    public static w3k0 a(w3k0 w3k0Var, a aVar, r3k0 r3k0Var, String str, String str2, boolean z, boolean z2, UiText uiText, boolean z3, int i) {
        if ((i & 1) != 0) {
            aVar = w3k0Var.a;
        }
        a aVar2 = aVar;
        if ((i & 2) != 0) {
            r3k0Var = w3k0Var.b;
        }
        r3k0 r3k0Var2 = r3k0Var;
        if ((i & 4) != 0) {
            str = w3k0Var.c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = w3k0Var.d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            z = w3k0Var.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z2 = w3k0Var.f;
        }
        boolean z5 = z2;
        UiText uiText2 = (i & 64) != 0 ? w3k0Var.g : uiText;
        boolean z6 = (i & 128) != 0 ? w3k0Var.h : z3;
        w3k0Var.getClass();
        aVar2.getClass();
        str3.getClass();
        str4.getClass();
        return new w3k0(aVar2, r3k0Var2, str3, str4, z4, z5, uiText2, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3k0)) {
            return false;
        }
        w3k0 w3k0Var = (w3k0) obj;
        return Intrinsics.g(this.a, w3k0Var.a) && Intrinsics.g(this.b, w3k0Var.b) && Intrinsics.g(this.c, w3k0Var.c) && Intrinsics.g(this.d, w3k0Var.d) && this.e == w3k0Var.e && this.f == w3k0Var.f && Intrinsics.g(this.g, w3k0Var.g) && this.h == w3k0Var.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        r3k0 r3k0Var = this.b;
        int iA = mtg0.a(mtg0.a(gmf0.a(gmf0.a((iHashCode + (r3k0Var == null ? 0 : r3k0Var.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        UiText uiText = this.g;
        return Boolean.hashCode(this.h) + ((iA + (uiText != null ? uiText.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorldCupPassUiState(loadState=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", price=");
        hxa.c(sb, this.c, ", freeBetGiftAmount=", this.d, ", isPurchasing=");
        nng.a(", isInsufficientBalanceSheetVisible=", ", errorDialogMessage=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", hasPerformedBalancePreCheck=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public w3k0() {
        this(0);
    }

    public /* synthetic */ w3k0(int i) {
        this(a.b.a, null, "", "", false, false, null, false);
    }
}
