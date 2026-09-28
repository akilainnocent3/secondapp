package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.rk30;
import defpackage.sn5;

/* JADX INFO: loaded from: classes7.dex */
public class GenericPairButton extends ConstraintLayout {
    public final Button F;
    public final Button G;
    public a H;

    public interface a {
    }

    public GenericPairButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R.layout.spr_generic_pair_button, this);
        this.F = (Button) findViewById(R.id.left_btn);
        this.G = (Button) findViewById(R.id.right_btn);
        this.F.setOnClickListener(new com.sporty.android.common_ui.widgets.a(this));
        this.G.setOnClickListener(new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.o, i, 0);
        try {
            String strA = sn5.a(0, context, typedArrayObtainStyledAttributes);
            String strA2 = sn5.a(1, context, typedArrayObtainStyledAttributes);
            if (!TextUtils.isEmpty(strA)) {
                this.F.setText(strA);
            }
            if (!TextUtils.isEmpty(strA2)) {
                this.G.setText(strA2);
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setButtonClickListener(a aVar) {
        this.H = aVar;
    }

    public GenericPairButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GenericPairButton(Context context) {
        this(context, null);
    }
}
