package yads;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class b63 extends hk3 {
    public b63(TextView textView) {
        super(textView);
    }

    @Override // yads.hk3
    public final void a(View view) {
        TextView textView = (TextView) view;
        textView.setText("");
        textView.setVisibility(8);
        textView.setOnClickListener(null);
        textView.setOnTouchListener(null);
        textView.setSelected(false);
    }

    @Override // yads.hk3
    public final void b(View view, Object obj) {
        ((TextView) view).setText((String) obj);
    }

    @Override // yads.hk3
    public final boolean a(View view, Object obj) {
        String str = (String) obj;
        CharSequence text = ((TextView) view).getText();
        if (text != null) {
            return cv.k0.c2(String.valueOf(text), str, true);
        }
        return false;
    }
}
