package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class koi {
    public final ResourceUiText a;
    public final String b;
    public final Function0<Unit> c;

    public koi(ResourceUiText resourceUiText, String str, Function0 function0) {
        function0.getClass();
        this.a = resourceUiText;
        this.b = str;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof koi)) {
            return false;
        }
        koi koiVar = (koi) obj;
        return this.a.equals(koiVar.a) && this.b.equals(koiVar.b) && Intrinsics.g(this.c, koiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "FooterButton(text=" + this.a + ", resourceId=" + this.b + ", onClick=" + this.c + ")";
    }
}
