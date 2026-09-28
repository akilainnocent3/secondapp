package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface j7z<ActionType> {

    public static final class a<T> implements j7z<T> {
        public final ResourceUiText a;
        public final q5z.h b;
        public final String c;

        public a(ResourceUiText resourceUiText, q5z.h hVar, String str) {
            this.a = resourceUiText;
            this.b = hVar;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && Intrinsics.g(this.c, aVar.c);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            String str = this.c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CustomServiceError(title=");
            sb.append(this.a);
            sb.append(", onDismissAction=");
            sb.append(this.b);
            sb.append(", fullStoryAttributeValue=");
            return uf80.a(sb, this.c, ")");
        }
    }

    public static final class d implements j7z {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1714242106;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c<T> implements j7z<T> {
        public final T a;

        public c(T t) {
            this.a = t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            T t = this.a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public final String toString() {
            return aya.b(this.a, "Loaded(followingAction=", ")");
        }

        public c() {
            this(null);
        }
    }

    public static final class b<T> implements j7z<T> {
        public final UiText a;
        public final UiText b;
        public final T c;
        public final String d;
        public final boolean e;

        public b(UiText uiText, UiText uiText2, T t, String str, boolean z) {
            uiText2.getClass();
            this.a = uiText;
            this.b = uiText2;
            this.c = t;
            this.d = str;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d) && this.e == bVar.e;
        }

        public final int hashCode() {
            int iA = yvf.a(this.a.hashCode() * 31, 31, this.b);
            T t = this.c;
            int iHashCode = (iA + (t == null ? 0 : t.hashCode())) * 31;
            String str = this.d;
            return Boolean.hashCode(this.e) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = uh8.a(this.a, this.b, "Error(title=", ", message=", ", onDismissAction=");
            sbA.append(this.c);
            sbA.append(", fullStoryAttributeValue=");
            sbA.append(this.d);
            sbA.append(", displayInline=");
            return mq0.a(sbA, this.e, ")");
        }

        public /* synthetic */ b(UiText uiText, UiText uiText2, Object obj, String str, int i) {
            this(uiText, uiText2, obj, (i & 8) != 0 ? null : str, false);
        }
    }
}
