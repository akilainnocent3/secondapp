package com.sportybet.plugin.realsports.results;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.sportybet.plugin.realsports.widget.ClearEditText;

/* JADX INFO: loaded from: classes7.dex */
public class ResultsClearEditText extends ClearEditText {
    public ResultsClearEditText(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            clearFocus();
            setCursorVisible(false);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public ResultsClearEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ResultsClearEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
