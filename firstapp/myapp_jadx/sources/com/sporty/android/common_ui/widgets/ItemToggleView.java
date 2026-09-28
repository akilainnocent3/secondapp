package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ItemToggleView;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.g3p;
import defpackage.h5e;
import defpackage.i3p;
import defpackage.sk30;
import defpackage.sn5;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001!B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eR.\u0010\u0018\u001a\u0004\u0018\u00010\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/sporty/android/common_ui/widgets/ItemToggleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "value", "", "setChecked", "(Z)V", "isVisible", "setNewFlagVisibility", "", "G", "Ljava/lang/CharSequence;", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "title", "Lcom/sporty/android/common_ui/widgets/ItemToggleView$a;", "H", "Lcom/sporty/android/common_ui/widgets/ItemToggleView$a;", "getCheckedChangeListener", "()Lcom/sporty/android/common_ui/widgets/ItemToggleView$a;", "setCheckedChangeListener", "(Lcom/sporty/android/common_ui/widgets/ItemToggleView$a;)V", "checkedChangeListener", "a", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ItemToggleView extends ConstraintLayout {
    public static final /* synthetic */ int I = 0;
    public final i3p F;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public CharSequence title;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public a checkedChangeListener;

    public interface a {
        void a(boolean z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemToggleView(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.item_toggle_view, this);
        int i2 = R.id.container;
        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.container, this);
        if (constraintLayout != null) {
            i2 = R.id.new_flag;
            TextView textView = (TextView) h5e.a(R.id.new_flag, this);
            if (textView != null) {
                i2 = R.id.title;
                TextView textView2 = (TextView) h5e.a(R.id.title, this);
                if (textView2 != null) {
                    i2 = R.id.toggle_button;
                    ToggleButton toggleButton = (ToggleButton) h5e.a(R.id.toggle_button, this);
                    if (toggleButton != null) {
                        i3p i3pVar = new i3p(this, constraintLayout, textView, textView2, toggleButton);
                        this.F = i3pVar;
                        int i3 = 0;
                        if (attributeSet != null && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sk30.c)) != null) {
                            textView2.setText(sn5.a(0, context, typedArrayObtainStyledAttributes));
                            Unit unit = Unit.a;
                            typedArrayObtainStyledAttributes.recycle();
                        }
                        constraintLayout.setOnClickListener(new g3p(i3pVar, i3));
                        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: h3p
                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                int i4 = ItemToggleView.I;
                                compoundButton.getClass();
                                ItemToggleView.a aVar = this.a.checkedChangeListener;
                                if (aVar != null) {
                                    aVar.a(z);
                                }
                            }
                        });
                        return;
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final a getCheckedChangeListener() {
        return this.checkedChangeListener;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public final void setChecked(boolean value) {
        this.F.d.setChecked(value);
    }

    public final void setCheckedChangeListener(a aVar) {
        this.checkedChangeListener = aVar;
    }

    public final void setNewFlagVisibility(boolean isVisible) {
        this.F.b.setVisibility(isVisible ? 0 : 8);
    }

    public final void setTitle(CharSequence charSequence) {
        i3p i3pVar = this.F;
        if (charSequence != null) {
            i3pVar.c.setText(charSequence);
        } else {
            i3pVar.c.setText("");
        }
        this.title = charSequence;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ItemToggleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ItemToggleView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ ItemToggleView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
