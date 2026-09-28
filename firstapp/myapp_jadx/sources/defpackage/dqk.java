package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class dqk {
    public final UiText a;
    public final a b;
    public final String c;

    public enum a {
        NONE(R.color.text_primary),
        SELECTED(R.color.text_brand_sub_primary_d_lighter);

        public final int a;

        a(int i) {
            this.a = i;
        }
    }

    public dqk(UiText uiText, a aVar, String str) {
        this.a = uiText;
        this.b = aVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqk)) {
            return false;
        }
        dqk dqkVar = (dqk) obj;
        return this.a.equals(dqkVar.a) && this.b == dqkVar.b && this.c.equals(dqkVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftPickerButtonState(uiText=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", resourceId=");
        return uf80.a(sb, this.c, ")");
    }
}
