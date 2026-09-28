package defpackage;

import com.appsflyer.internal.p;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface nj40 {

    public static final class a implements nj40 {
        public final List<gz4> a;

        public a(List<gz4> list) {
            list.getClass();
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return p.a("Content(codeUiStates=", ")", this.a);
        }
    }

    public static final class b implements nj40 {
        public final List<gz4> a;
        public final UiText b;

        public b(Object obj) {
            m2g m2gVar = m2g.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.common_feedback__something_went_wrong_tip);
            m2gVar.getClass();
            this.a = m2gVar;
            this.b = resourceUiText;
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
            return "Empty(codeUiStates=" + this.a + ", emptyText=" + this.b + ")";
        }
    }

    public static final class c implements nj40 {
        public final List<gz4> a;
        public final Throwable b;

        public c(m2g m2gVar, Throwable th) {
            m2gVar.getClass();
            this.a = m2gVar;
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b.equals(cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Error(codeUiStates=" + this.a + ", error=" + this.b + ")";
        }
    }

    public static final class d implements nj40 {
        public final List<gz4> a;
        public final boolean b;

        public d(m2g m2gVar, boolean z) {
            m2gVar.getClass();
            this.a = m2gVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Loading(codeUiStates=" + this.a + ", isShowLoading=" + this.b + ")";
        }
    }
}
