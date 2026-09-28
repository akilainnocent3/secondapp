package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;
import com.sportybet.android.activity.BirthVerifyActivity;

/* JADX INFO: loaded from: classes4.dex */
public class BankVerifyNumberEditText extends AppCompatEditText {
    public a i;

    public interface a {
    }

    public BankVerifyNumberEditText(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            ((BirthVerifyActivity) this.i).A1();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public void setImeListener(a aVar) {
        this.i = aVar;
    }

    public BankVerifyNumberEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BankVerifyNumberEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
