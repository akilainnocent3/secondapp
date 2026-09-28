package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dfw {
    public final UiText a;
    public final a b;
    public final boolean c;
    public final boolean d;

    public dfw(StringUiText stringUiText, a aVar, boolean z, boolean z2) {
        stringUiText.getClass();
        aVar.getClass();
        this.a = stringUiText;
        this.b = aVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfw)) {
            return false;
        }
        dfw dfwVar = (dfw) obj;
        return Intrinsics.g(this.a, dfwVar.a) && Intrinsics.g(this.b, dfwVar.b) && this.c == dfwVar.c && this.d == dfwVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + mtg0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiMakerAddSelectionsInputUiState(inputUiText=");
        sb.append(this.a);
        sb.append(", warningState=");
        sb.append(this.b);
        sb.append(", isEnabled=");
        return lng.a(", isFocused=", ")", sb, this.c, this.d);
    }

    public interface a {

        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1186935043;
            }

            public final String toString() {
                return "None";
            }
        }

        /* JADX INFO: renamed from: dfw$a$a, reason: collision with other inner class name */
        public static final class C0485a implements a {
            public final UiText a;

            public C0485a(UiText uiText) {
                uiText.getClass();
                this.a = uiText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0485a) && Intrinsics.g(this.a, ((C0485a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return xh8.a(this.a, "Minor(warningUiText=", ")");
            }

            public C0485a() {
                this(vch0.a);
            }
        }

        public static final class c implements a {
            public final UiText a;

            public c(UiText uiText) {
                uiText.getClass();
                this.a = uiText;
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
                return xh8.a(this.a, "Strong(warningUiText=", ")");
            }

            public c() {
                this(vch0.a);
            }
        }
    }
}
