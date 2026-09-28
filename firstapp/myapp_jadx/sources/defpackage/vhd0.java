package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class vhd0 implements g6i0 {
    public final TextView A;
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final EditText c;
    public final RadioGroup d;
    public final SwitchCompat e;
    public final TextView f;
    public final TextView i;
    public final TextView v;
    public final TextView w;
    public final TextView y;
    public final TextView z;

    public vhd0(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, EditText editText, RadioGroup radioGroup, SwitchCompat switchCompat, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = editText;
        this.d = radioGroup;
        this.e = switchCompat;
        this.f = textView;
        this.i = textView2;
        this.v = textView3;
        this.w = textView4;
        this.y = textView5;
        this.z = textView6;
        this.A = textView7;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
