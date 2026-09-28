package com.sportybet.android.instantwin.presentation.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.CommonButton;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.PairButtonsLayout;

/* JADX INFO: loaded from: classes.dex */
public class PairButtonsLayout extends ConstraintLayout {
    public static final /* synthetic */ int H = 0;
    public final TextView F;
    public final CommonButton G;

    public interface a {
    }

    public PairButtonsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R.layout.iwqk_layout_pair_buttons, this);
        this.G = (CommonButton) findViewById(R.id.right_action_btn);
        this.F = (TextView) findViewById(R.id.left_action_label);
        this.G.setOnClickListener(new View.OnClickListener(this) { // from class: grz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = PairButtonsLayout.H;
            }
        });
        findViewById(R.id.left_action_btn).setOnClickListener(new View.OnClickListener(this) { // from class: grz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = PairButtonsLayout.H;
            }
        });
    }

    public void setData(String str, String str2, a aVar) {
        if (str == null) {
            str = "";
        }
        CommonButton commonButton = this.G;
        commonButton.setText(str);
        if (str2 == null) {
            str2 = "";
        }
        commonButton.setDescriptionText(str2);
    }

    public void setLeftButtonLabel(String str) {
        this.F.setText(str);
    }

    public PairButtonsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PairButtonsLayout(Context context) {
        this(context, null);
    }
}
