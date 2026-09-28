package defpackage;

import android.R;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class wnz extends gi6 {
    public final hhd0 b;
    public final zzy c;

    /* JADX WARN: Illegal instructions before constructor call */
    public wnz(hhd0 hhd0Var, ek6 ek6Var) {
        ek6Var.getClass();
        ConstraintLayout constraintLayout = hhd0Var.a;
        constraintLayout.getClass();
        super(constraintLayout, null);
        this.b = hhd0Var;
        this.c = ek6Var;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, iwh0.a(this.itemView.getContext(), com.sportybet.android.gp.tz.R.drawable.spr_ic_chevron_left_gray, this.itemView.getContext().getColor(com.sportybet.android.gp.tz.R.color.text_type1_tertiary)));
        int[] iArr = StateSet.WILD_CARD;
        stateListDrawable.addState(iArr, iwh0.a(this.itemView.getContext(), com.sportybet.android.gp.tz.R.drawable.spr_ic_chevron_left_gray, this.itemView.getContext().getColor(com.sportybet.android.gp.tz.R.color.text_type2_tertiary)));
        ImageButton imageButton = hhd0Var.e;
        imageButton.setImageDrawable(stateListDrawable);
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(new int[]{R.attr.state_enabled}, iwh0.a(this.itemView.getContext(), com.sportybet.android.gp.tz.R.drawable.spr_ic_chevron_right_gray, this.itemView.getContext().getColor(com.sportybet.android.gp.tz.R.color.text_type1_tertiary)));
        stateListDrawable2.addState(iArr, iwh0.a(this.itemView.getContext(), com.sportybet.android.gp.tz.R.drawable.spr_ic_chevron_right_gray, this.itemView.getContext().getColor(com.sportybet.android.gp.tz.R.color.text_type2_tertiary)));
        ImageButton imageButton2 = hhd0Var.d;
        imageButton2.setImageDrawable(stateListDrawable2);
        imageButton.setOnClickListener(new r23(this, 1));
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: vnz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c.i(zyy.d);
            }
        });
    }

    public final void c(int i, int i2, boolean z) {
        hhd0 hhd0Var = this.b;
        if (i2 != -1) {
            hhd0Var.f.setText(String.valueOf(i2));
            hhd0Var.c.setText(String.valueOf(i));
        }
        c8i0.o(hhd0Var.f, i2 != -1);
        c8i0.o(hhd0Var.c, i2 != -1);
        c8i0.o(hhd0Var.b, i2 != -1);
        hhd0Var.e.setEnabled(i != 1);
        hhd0Var.d.setEnabled(i2 > i || z);
    }

    @Override // defpackage.gi6
    public final void a(int i) {
    }
}
