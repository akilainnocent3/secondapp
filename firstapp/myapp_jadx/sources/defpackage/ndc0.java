package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.instantwin.router.ticketdetail.InstantWinTicketDetailInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface ndc0 {

    public static final class a implements ndc0 {
        public final boolean a;
        public final UiText b;

        public a(UiText uiText, boolean z) {
            this.a = z;
            this.b = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            int iA = mtg0.a(-709302610, 31, this.a);
            UiText uiText = this.b;
            return iA + (uiText == null ? 0 : uiText.hashCode());
        }

        public final String toString() {
            return "GoToTeamSelectPage(sportId=sr:sport:3, isSportInBetBuilderMode=" + this.a + ", snackbarUiText=" + this.b + ")";
        }
    }

    public static final class b implements ndc0 {
        public final InstantWinTicketDetailInput a;

        public b(InstantWinTicketDetailInput instantWinTicketDetailInput) {
            this.a = instantWinTicketDetailInput;
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
            return "NavigateToTicketDetailPage(ticketDetailInput=" + this.a + ")";
        }
    }

    public static final class c implements ndc0 {
        public final String a;

        public c(String str) {
            this.a = str;
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
            return tug.a("PlayDoubleOrNothingAudio(url=", this.a, ")");
        }
    }
}
