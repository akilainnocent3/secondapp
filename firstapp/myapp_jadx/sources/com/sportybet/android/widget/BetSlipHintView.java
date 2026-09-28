package com.sportybet.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.rk30;
import defpackage.sn5;
import defpackage.t43;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/sportybet/android/widget/BetSlipHintView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "", "F", "Lkotlin/jvm/functions/Function0;", "getOnClickedClose", "()Lkotlin/jvm/functions/Function0;", "setOnClickedClose", "(Lkotlin/jvm/functions/Function0;)V", "onClickedClose", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BetSlipHintView extends ConstraintLayout {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public Function0<Unit> onClickedClose;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BetSlipHintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.bet_slip_hint_view, this);
        int i2 = R.id.bottom_container;
        if (((LinearLayout) h5e.a(R.id.bottom_container, this)) != null) {
            i2 = R.id.hint_barrier;
            if (((Barrier) h5e.a(R.id.hint_barrier, this)) != null) {
                i2 = R.id.hint_close;
                AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.hint_close, this);
                if (appCompatImageView != null) {
                    i2 = R.id.insure_arrow_up;
                    ImageView imageView = (ImageView) h5e.a(R.id.insure_arrow_up, this);
                    if (imageView != null) {
                        i2 = R.id.insure_arrow_up_right;
                        ImageView imageView2 = (ImageView) h5e.a(R.id.insure_arrow_up_right, this);
                        if (imageView2 != null) {
                            i2 = R.id.title;
                            TextView textView = (TextView) h5e.a(R.id.title, this);
                            if (textView != null) {
                                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.d, i, 0);
                                typedArrayObtainStyledAttributes.getClass();
                                textView.setText(sn5.a(2, context, typedArrayObtainStyledAttributes));
                                CharSequence text = textView.getText();
                                textView.setVisibility((text == null || text.length() == 0) ? 8 : 0);
                                appCompatImageView.setOnClickListener(new t43(this, 0));
                                imageView.setVisibility(typedArrayObtainStyledAttributes.getBoolean(0, false) ? 0 : 8);
                                imageView2.setVisibility(typedArrayObtainStyledAttributes.getBoolean(1, false) ? 0 : 8);
                                typedArrayObtainStyledAttributes.recycle();
                                return;
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final Function0<Unit> getOnClickedClose() {
        return this.onClickedClose;
    }

    public final void setOnClickedClose(Function0<Unit> function0) {
        this.onClickedClose = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BetSlipHintView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BetSlipHintView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ BetSlipHintView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
