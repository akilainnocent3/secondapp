package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface u8u {

    public static final class a implements u8u {
        public final UiText a;
        public final UiText b;
        public final Function0<Unit> c;

        public a(UiText uiText, Function0 function0) {
            StringUiText stringUiText = vch0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.common_functions__error);
            uiText.getClass();
            this.a = resourceUiText;
            this.b = uiText;
            this.c = function0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + yvf.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbA = uh8.a(this.a, this.b, "ErrorDialog(title=", ", message=", ", action=");
            sbA.append(this.c);
            sbA.append(")");
            return sbA.toString();
        }
    }
}
