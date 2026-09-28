package defpackage;

import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class gi7 extends ClickableSpan {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ Pair<String, View.OnClickListener> b;

    /* JADX WARN: Multi-variable type inference failed */
    public gi7(TextView textView, Pair<String, ? extends View.OnClickListener> pair) {
        this.a = textView;
        this.b = pair;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        CharSequence text = ((TextView) view).getText();
        text.getClass();
        Selection.setSelection((Spannable) text, 0);
        view.invalidate();
        this.b.b.onClick(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setColor(this.a.getContext().getColor(R.color.brand_secondary));
        textPaint.setUnderlineText(true);
    }
}
