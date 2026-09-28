package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wkc0 implements vkc0 {
    public final UiText a;
    public final ConcatUiText b;
    public final ArrayList c;

    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("Selection(marketTitle=", this.a, ", outcomeDesc=", this.b, ")");
        }
    }

    public wkc0(UiText uiText, ConcatUiText concatUiText, ArrayList arrayList) {
        uiText.getClass();
        this.a = uiText;
        this.b = concatUiText;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkc0)) {
            return false;
        }
        wkc0 wkc0Var = (wkc0) obj;
        return Intrinsics.g(this.a, wkc0Var.a) && this.b.equals(wkc0Var.b) && this.c.equals(wkc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SportyLegendsSettlementBetOddsStateBetBuilder(outcomeTitle=" + this.a + ", outcomeDesc=" + this.b + ", selections=" + this.c + ")";
    }
}
