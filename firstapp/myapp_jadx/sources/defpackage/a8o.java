package defpackage;

import com.appsflyer.internal.v;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface a8o {

    public interface a extends a8o {

        /* JADX INFO: renamed from: a8o$a$a, reason: collision with other inner class name */
        public static final class C0009a implements a {
            public static final C0009a a = new C0009a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0009a);
            }

            public final int hashCode() {
                return -2090336375;
            }

            public final String toString() {
                return "Failure";
            }
        }

        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -667111621;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public static final class c implements a {
            public final w6o a;
            public final UiText b;
            public final Integer c;

            public c(w6o w6oVar, UiText uiText, Integer num) {
                uiText.getClass();
                this.a = w6oVar;
                this.b = uiText;
                this.c = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a.equals(cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c);
            }

            public final int hashCode() {
                int iA = yvf.a(this.a.hashCode() * 31, 31, this.b);
                Integer num = this.c;
                return iA + (num == null ? 0 : num.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("RoundShowOff(roundInfo=");
                sb.append(this.a);
                sb.append(", showOffTitleUiText=");
                sb.append(this.b);
                sb.append(", watermarkUrlResId=");
                return v.a(sb, this.c, ")");
            }
        }

        public static final class d implements a {
            public final n7o a;
            public final UiText b;
            public final Integer c;

            public d(n7o n7oVar, UiText uiText, Integer num) {
                uiText.getClass();
                this.a = n7oVar;
                this.b = uiText;
                this.c = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.a.equals(dVar.a) && Intrinsics.g(this.b, dVar.b) && Intrinsics.g(this.c, dVar.c);
            }

            public final int hashCode() {
                int iA = yvf.a(this.a.hashCode() * 31, 31, this.b);
                Integer num = this.c;
                return iA + (num == null ? 0 : num.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TicketShowOff(ticketInfo=");
                sb.append(this.a);
                sb.append(", showOffTitleUiText=");
                sb.append(this.b);
                sb.append(", watermarkUrlResId=");
                return v.a(sb, this.c, ")");
            }
        }
    }

    public static final class b implements a8o {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -491147111;
        }

        public final String toString() {
            return "ShowOffTypeNotFound";
        }
    }
}
