package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uo90 implements rn90 {
    public final zki a;
    public final UiText b;
    public final a c;
    public final b d;
    public final qcn<ao90> e;

    public static final class a {
        public final ResourceUiText a;
        public final ucn<String> b;

        public a(ResourceUiText resourceUiText, ucn ucnVar) {
            ucnVar.getClass();
            this.a = resourceUiText;
            this.b = ucnVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ExpansionButtonState(uiText=" + this.a + ", collapsedEventIds=" + this.b + ")";
        }
    }

    public static final class b {
        public final String a;
        public final String b;
        public final String c;

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return uf80.a(ux5.a("TicketPaginationState(titleText=", this.a, ", previousTicketId=", this.b, ", nextTicketId="), this.c, ")");
        }
    }

    public uo90(zki zkiVar, ResourceUiText resourceUiText, a aVar, b bVar, qcn qcnVar) {
        qcnVar.getClass();
        this.a = zkiVar;
        this.b = resourceUiText;
        this.c = aVar;
        this.d = bVar;
        this.e = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo90)) {
            return false;
        }
        uo90 uo90Var = (uo90) obj;
        return this.a.equals(uo90Var.a) && Intrinsics.g(this.b, uo90Var.b) && this.c.equals(uo90Var.c) && Intrinsics.g(this.d, uo90Var.d) && Intrinsics.g(this.e, uo90Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        UiText uiText = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31)) * 31;
        b bVar = this.d;
        return this.e.hashCode() + ((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimulationSettlementRunningContentState(footballLottieSimulationState=");
        sb.append(this.a);
        sb.append(", speedUiText=");
        sb.append(this.b);
        sb.append(", expansionButtonState=");
        sb.append(this.c);
        sb.append(", ticketPaginationState=");
        sb.append(this.d);
        sb.append(", eventStates=");
        return ts3.a(sb, this.e, ")");
    }
}
