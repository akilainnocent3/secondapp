package defpackage;

import android.widget.CheckedTextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class exf0 extends RecyclerView.d0 {
    public final pjd0 a;
    public final Function1<xvf0, Unit> b;

    /* JADX WARN: Illegal instructions before constructor call */
    public exf0(pjd0 pjd0Var, axf0 axf0Var) {
        CheckedTextView checkedTextView = pjd0Var.a;
        super(checkedTextView);
        this.a = pjd0Var;
        this.b = axf0Var;
        checkedTextView.setOnClickListener(new akg(this, 1));
    }
}
