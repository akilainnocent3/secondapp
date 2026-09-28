package com.google.android.material.button;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialSplitButton;
import com.sportybet.android.gp.tz.R;
import defpackage.hb5;
import defpackage.tcv;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialSplitButton extends MaterialButtonGroup {
    public static final /* synthetic */ int A = 0;

    public MaterialSplitButton(Context context, AttributeSet attributeSet, int i) {
        super(tcv.a(context, attributeSet, i, R.style.Widget_Material3_MaterialSplitButton), attributeSet, i);
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            hb5.a("MaterialSplitButton can only hold MaterialButtons.");
            return;
        }
        if (getChildCount() > 2) {
            hb5.a("MaterialSplitButton can only hold two MaterialButtons.");
            return;
        }
        MaterialButton materialButton = (MaterialButton) view;
        super.addView(view, i, layoutParams);
        if (indexOfChild(view) == 1) {
            materialButton.setCheckable(true);
            materialButton.setA11yClassName(Button.class.getName());
            if (Build.VERSION.SDK_INT >= 30) {
                materialButton.setStateDescription(getResources().getString(materialButton.D ? R.string.mtrl_button_expanded_content_description : R.string.mtrl_button_collapsed_content_description));
                materialButton.e.add(new MaterialButton.b() { // from class: kcv
                    @Override // com.google.android.material.button.MaterialButton.b
                    public final void a(MaterialButton materialButton2, boolean z) {
                        int i2 = MaterialSplitButton.A;
                        this.a.f(materialButton2, z);
                    }
                });
            }
        }
    }

    public final /* synthetic */ void f(MaterialButton materialButton, boolean z) {
        materialButton.setStateDescription(getResources().getString(z ? R.string.mtrl_button_expanded_content_description : R.string.mtrl_button_collapsed_content_description));
    }

    public MaterialSplitButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSplitButtonStyle);
    }

    public MaterialSplitButton(Context context) {
        this(context, null);
    }
}
