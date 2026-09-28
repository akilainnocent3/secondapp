package defpackage;

import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.sporty.android.common.uievent.CustomAlertDialogCallbackType;
import com.sportybet.android.gp.tz.R;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class g6c extends ClickableSpan {
    public final /* synthetic */ f6c a;

    public g6c(f6c f6cVar) {
        this.a = f6cVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        view.invalidate();
        Bundle bundleA = vj5.a(new Pair("RESULT_KEY_SHOW_CUSTOM_ALERT_DIALOG", CustomAlertDialogCallbackType.HyperlinkInMessage.a));
        f6c f6cVar = this.a;
        f6cVar.getParentFragmentManager().m0("REQUEST_KEY_SHOW_CUSTOM_ALERT_DIALOG", bundleA);
        f6cVar.dismissAllowingStateLoss();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        super.updateDrawState(textPaint);
        textPaint.setColor(this.a.requireContext().getColor(R.color.brand_quaternary));
        textPaint.setUnderlineText(false);
    }
}
