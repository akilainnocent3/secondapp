package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.instantwin.router.ticketdetail.InstantWinTicketDetailInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface x5f {

    public static final class a implements x5f {
        public final UiText a;

        public a(UiText uiText) {
            this.a = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            UiText uiText = this.a;
            if (uiText == null) {
                return 0;
            }
            return uiText.hashCode();
        }

        public final String toString() {
            return xh8.a(this.a, "NavigateToHostGame(snackbarUiText=", ")");
        }
    }

    public static final class b implements x5f {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("PlayAudio(url=", this.a, ")");
        }
    }

    public static final class c implements x5f {
        public final InstantWinTicketDetailInput a;

        public c(InstantWinTicketDetailInput instantWinTicketDetailInput) {
            this.a = instantWinTicketDetailInput;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ViewDetails(ticketDetailInput=" + this.a + ")";
        }
    }
}
