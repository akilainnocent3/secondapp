package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fsd {
    public static final fsd d = new fsd(false, new ResourceUiText(R.string.common_functions__top_up_now), vch0.a);
    public final boolean a;
    public final ResourceUiText b;
    public final UiText c;

    public fsd(boolean z, ResourceUiText resourceUiText, UiText uiText) {
        uiText.getClass();
        this.a = z;
        this.b = resourceUiText;
        this.c = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsd)) {
            return false;
        }
        fsd fsdVar = (fsd) obj;
        return this.a == fsdVar.a && this.b.equals(fsdVar.b) && Intrinsics.g(this.c, fsdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wh8.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DepositButtonUiState(enabled=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", description=");
        return plf.a(sb, this.c, ")");
    }
}
