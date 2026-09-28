package com.sportybet.plugin.realsports.betslip.virtualkeyboard;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import defpackage.g93;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements View.OnTouchListener {
    public final /* synthetic */ EditTextWithKeyBoard a;

    /* JADX INFO: renamed from: com.sportybet.plugin.realsports.betslip.virtualkeyboard.a$a, reason: collision with other inner class name */
    public class RunnableC0423a implements Runnable {
        public RunnableC0423a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            EditText editText = a.this.a.z;
            editText.setSelection(editText.getText().length());
        }
    }

    public a(EditTextWithKeyBoard editTextWithKeyBoard) {
        this.a = editTextWithKeyBoard;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        EditTextWithKeyBoard editTextWithKeyBoard = this.a;
        if (!editTextWithKeyBoard.A.F()) {
            editTextWithKeyBoard.A.L(editTextWithKeyBoard.z, editTextWithKeyBoard.G);
            EditTextWithKeyBoard.a aVar = editTextWithKeyBoard.F;
            if (aVar != null) {
                aVar.f();
                editTextWithKeyBoard.F.a();
            }
        }
        editTextWithKeyBoard.z.requestFocus();
        editTextWithKeyBoard.z.setCursorVisible(true);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            g93.a().r(editTextWithKeyBoard);
            return false;
        }
        if (actionMasked != 1) {
            return false;
        }
        editTextWithKeyBoard.z.post(new RunnableC0423a());
        return false;
    }
}
