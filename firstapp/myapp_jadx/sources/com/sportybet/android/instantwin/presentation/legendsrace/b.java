package com.sportybet.android.instantwin.presentation.legendsrace;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.instantwin.router.ticketdetail.InstantWinTicketDetailInput;
import defpackage.mtg0;
import defpackage.plf;
import defpackage.tug;
import defpackage.z620;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    public static final class a extends b {
        public final String a = "sr:sport:3";
        public final boolean b;
        public final UiText c;

        public a(UiText uiText, boolean z) {
            this.b = z;
            this.c = uiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b && Intrinsics.g(this.c, aVar.c);
        }

        public final int hashCode() {
            int iA = mtg0.a(this.a.hashCode() * 31, 31, this.b);
            UiText uiText = this.c;
            return iA + (uiText == null ? 0 : uiText.hashCode());
        }

        public final String toString() {
            return plf.a(z620.a("GoToTeamSelectPage(sportId=", this.a, ", isSportInBetBuilderMode=", ", snackbarUiText=", this.b), this.c, ")");
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.legendsrace.b$b, reason: collision with other inner class name */
    public static final class C0291b extends b {
    }

    public static final class c extends b {
        public final InstantWinTicketDetailInput a;

        public c(InstantWinTicketDetailInput instantWinTicketDetailInput) {
            this.a = instantWinTicketDetailInput;
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
            return "NavigateToTicketDetailPage(ticketDetailInput=" + this.a + ")";
        }
    }

    public static final class d extends b {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("PlayDoubleOrNothingAudio(url=", this.a, ")");
        }
    }
}
