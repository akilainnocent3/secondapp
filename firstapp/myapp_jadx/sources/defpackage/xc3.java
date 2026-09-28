package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView;

/* JADX INFO: loaded from: classes7.dex */
public final class xc3 extends c63 {
    public final qhd0 a;
    public final a63 b;
    public final y8k c;
    public final p8k d;

    /* JADX WARN: Illegal instructions before constructor call */
    public xc3(qhd0 qhd0Var, a63 a63Var, y8k y8kVar, p8k p8kVar) {
        y8kVar.getClass();
        p8kVar.getClass();
        LinearLayout linearLayout = qhd0Var.a;
        linearLayout.getClass();
        super(linearLayout);
        this.a = qhd0Var;
        this.b = a63Var;
        this.c = y8kVar;
        this.d = p8kVar;
        int i = 0;
        this.itemView.setOnClickListener(new qc3(this, i));
        KeyboardView keyboardView = qhd0Var.c;
        keyboardView.setOnValueChangeListener(new vc3(this));
        keyboardView.setOnDoneButtonClickListener(new View.OnClickListener() { // from class: rc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xc3 xc3Var = this.a;
                xc3Var.b.invoke(new y43.b.f(xc3Var.getBindingAdapterPosition()));
            }
        });
        EditText editText = qhd0Var.d;
        editText.setOnClickListener(new sc3(this, i));
        editText.setOnTouchListener(new View.OnTouchListener() { // from class: tc3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                xc3 xc3Var = this.a;
                xc3Var.b.invoke(new y43.b.e(xc3Var.getBindingAdapterPosition()));
                return false;
            }
        });
        qhd0Var.e.setOnClickListener(new uc3(this, i));
    }

    public static final void a(xc3 xc3Var) {
        xc3Var.b.invoke(new y43.b.c(xc3Var.getBindingAdapterPosition(), xc3Var.a.d.getText().toString()));
    }
}
