package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ou3 implements ut3 {
    public final String a;
    public final int b;
    public final qcn<a> c;

    public static final class a {
        public final UiText a;
        public final String b;
        public final String c;

        public a(UiText uiText, String str, String str2) {
            this.a = uiText;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            UiText uiText = this.a;
            return this.c.hashCode() + gmf0.a((uiText == null ? 0 : uiText.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Info(tagUiText=");
            sb.append(this.a);
            sb.append(", numberUrl=");
            sb.append(this.b);
            sb.append(", racerName=");
            return uf80.a(sb, this.c, ")");
        }
    }

    public ou3(int i, qcn qcnVar, String str) {
        str.getClass();
        qcnVar.getClass();
        this.a = str;
        this.b = i;
        this.c = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou3)) {
            return false;
        }
        ou3 ou3Var = (ou3) obj;
        return Intrinsics.g(this.a, ou3Var.a) && this.b == ou3Var.b && Intrinsics.g(this.c, ou3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return ts3.a(ml5.a(this.b, "BetslipSelectionRacingRacerContentState(oddsText=", this.a, ", oddsTextColorResId=", ", infos="), this.c, ")");
    }
}
