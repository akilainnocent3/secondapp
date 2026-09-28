package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface dbi {

    public static final class a implements dbi {
        public final UiText a;

        public a(UiText uiText) {
            uiText.getClass();
            this.a = uiText;
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
            return xh8.a(this.a, "Error(errorMsg=", ")");
        }
    }

    public static final class b implements dbi {
        public final ebi a;

        public b(ebi ebiVar) {
            this.a = ebiVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            ebi ebiVar = this.a;
            if (ebiVar == null) {
                return 0;
            }
            return ebiVar.hashCode();
        }

        public final String toString() {
            return "NoError(event=" + this.a + ")";
        }

        public b() {
            this(null);
        }
    }
}
