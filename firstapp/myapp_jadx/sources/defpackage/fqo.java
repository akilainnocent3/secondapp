package defpackage;

import com.appsflyer.internal.b0;
import com.appsflyer.internal.w;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fqo {
    public final int a;
    public final a b;
    public final UiText c;
    public final c d;

    public interface a {

        /* JADX INFO: renamed from: fqo$a$a, reason: collision with other inner class name */
        public static final class C0579a implements a {
            public static final C0579a a = new C0579a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0579a);
            }

            public final int hashCode() {
                return -872131043;
            }

            public final String toString() {
                return "Back";
            }
        }

        public static final class b implements a {
            public final Integer a;

            public b(Integer num) {
                this.a = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                Integer num = this.a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final String toString() {
                return "Sport(drawableResId=" + this.a + ")";
            }
        }
    }

    public interface b {

        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1005500864;
            }

            public final String toString() {
                return "Guest";
            }
        }

        /* JADX INFO: renamed from: fqo$b$b, reason: collision with other inner class name */
        public static final class C0580b implements b {
            public final long a;
            public final String b;
            public final boolean c;

            public C0580b(long j, String str, boolean z) {
                str.getClass();
                this.a = j;
                this.b = str;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0580b)) {
                    return false;
                }
                C0580b c0580b = (C0580b) obj;
                return this.a == c0580b.a && Intrinsics.g(this.b, c0580b.b) && this.c == c0580b.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + gmf0.a(Long.hashCode(this.a) * 31, 31, this.b);
            }

            public final String toString() {
                return w.a(b0.a(this.a, "Member(balance=", ", currency=", this.b), ", displayBetHistoryIcon=", this.c, ")");
            }
        }
    }

    public interface c {

        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -397533948;
            }

            public final String toString() {
                return "Failure";
            }
        }

        public static final class b implements c {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1025690806;
            }

            public final String toString() {
                return "Loading";
            }
        }

        /* JADX INFO: renamed from: fqo$c$c, reason: collision with other inner class name */
        public static final class C0581c implements c {
            public final b a;

            public C0581c(b bVar) {
                bVar.getClass();
                this.a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0581c) && Intrinsics.g(this.a, ((C0581c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Success(user=" + this.a + ")";
            }
        }
    }

    public fqo(int i, a aVar, UiText uiText, c cVar) {
        aVar.getClass();
        this.a = i;
        this.b = aVar;
        this.c = uiText;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqo)) {
            return false;
        }
        fqo fqoVar = (fqo) obj;
        return this.a == fqoVar.a && Intrinsics.g(this.b, fqoVar.b) && Intrinsics.g(this.c, fqoVar.c) && Intrinsics.g(this.d, fqoVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        UiText uiText = this.c;
        int iHashCode2 = (iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31;
        c cVar = this.d;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "InstantWinTopAppBarState(backgroundColorResId=" + this.a + ", navigationIcon=" + this.b + ", titleUiText=" + this.c + ", userStatus=" + this.d + ")";
    }

    public /* synthetic */ fqo(a.b bVar, UiText uiText) {
        this(R.color.bg_brand_main_primary, bVar, uiText, null);
    }
}
