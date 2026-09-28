package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class bua0 {
    public final String a;
    public final float b;
    public final String c;
    public final boolean d;
    public final UiText e;
    public final a f;

    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + gpp.a(this.a, gpp.a(R.color.transparent, gpp.a(R.color.text_inverse_primary, Integer.hashCode(R.color.bg_brand_sub_primary_d_base) * 31, 31), 31), 31);
        }

        public final String toString() {
            return n36.a("Color(selectedBackgroundColorResId=2131099766, selectedTextColorResId=2131101781, unselectedBackgroundColorResId=2131101825, unselectedTextColorResId=", this.a, this.b, ", borderColorResId=", ")");
        }
    }

    public bua0(String str, float f, String str2, boolean z, UiText uiText, a aVar) {
        this.a = str;
        this.b = f;
        this.c = str2;
        this.d = z;
        this.e = uiText;
        this.f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bua0)) {
            return false;
        }
        bua0 bua0Var = (bua0) obj;
        return this.a.equals(bua0Var.a) && Float.compare(this.b, bua0Var.b) == 0 && this.c.equals(bua0Var.c) && this.d == bua0Var.d && this.e.equals(bua0Var.e) && this.f.equals(bua0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + yvf.a(mtg0.a(gmf0.a(tvh.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeedOptionState(resourceId=");
        sb.append(this.a);
        sb.append(", weight=");
        sb.append(this.b);
        sb.append(", speedOptionId=");
        uts.b(this.c, ", selected=", ", uiText=", sb, this.d);
        sb.append(this.e);
        sb.append(", color=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
