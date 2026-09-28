package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ych0 extends ClickableSpan {
    public final /* synthetic */ Pair a;
    public final /* synthetic */ TextView b;

    public ych0(Pair pair, TextView textView) {
        this.a = pair;
        this.b = textView;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.invalidate();
        ((View.OnClickListener) this.a.second).onClick(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.b.getContext().getColor(R.color.brand_quaternary));
        textPaint.setUnderlineText(false);
    }
}
