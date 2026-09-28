package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ysa {
    public final String a;
    public final UiText b;
    public final dqk c;

    public ysa(String str, ResourceUiText resourceUiText, dqk dqkVar) {
        this.a = str;
        this.b = resourceUiText;
        this.c = dqkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysa)) {
            return false;
        }
        ysa ysaVar = (ysa) obj;
        return this.a.equals(ysaVar.a) && Intrinsics.g(this.b, ysaVar.b) && Intrinsics.g(this.c, ysaVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        UiText uiText = this.b;
        int iHashCode2 = (iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31;
        dqk dqkVar = this.c;
        return iHashCode2 + (dqkVar != null ? dqkVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = x45.a(this.b, "ConfirmDialogState(payAmountText=", this.a, ", payAmountDetailUiText=", ", giftPickerButtonState=");
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
