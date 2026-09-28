package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i6z {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a extends i6z {
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
            return xh8.a(this.a, gvQvkPPtA.FZaJxQYSZdnqU, ")");
        }
    }

    public static final class b extends i6z {
        public static final b a = new b();
    }
}
