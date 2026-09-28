package com.sportygames.commons.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.ln80;
import defpackage.tk30;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/sportygames/commons/components/SgCommonToastContainer;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lln80;", "E", "Lln80;", "getBinding", "()Lln80;", "setBinding", "(Lln80;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SgCommonToastContainer extends LinearLayoutCompat {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ln80 binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SgCommonToastContainer(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sg_common_toast_layout, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.actual_used_amount;
        TextView textView = (TextView) h5e.a(R.id.actual_used_amount, viewInflate);
        if (textView != null) {
            i = R.id.at;
            TextView textView2 = (TextView) h5e.a(R.id.at, viewInflate);
            if (textView2 != null) {
                i = R.id.card;
                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.card, viewInflate);
                if (constraintLayout != null) {
                    CardView cardView = (CardView) viewInflate;
                    i = R.id.coeff;
                    TextView textView3 = (TextView) h5e.a(R.id.coeff, viewInflate);
                    if (textView3 != null) {
                        i = R.id.currency;
                        TextView textView4 = (TextView) h5e.a(R.id.currency, viewInflate);
                        if (textView4 != null) {
                            i = R.id.gift_amount;
                            TextView textView5 = (TextView) h5e.a(R.id.gift_amount, viewInflate);
                            if (textView5 != null) {
                                i = R.id.image1;
                                if (((ImageView) h5e.a(R.id.image1, viewInflate)) != null) {
                                    i = R.id.image2;
                                    if (((ImageView) h5e.a(R.id.image2, viewInflate)) != null) {
                                        i = R.id.layout_gift_amt;
                                        LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.layout_gift_amt, viewInflate);
                                        if (linearLayout != null) {
                                            i = R.id.layoutText;
                                            if (((LinearLayout) h5e.a(R.id.layoutText, viewInflate)) != null) {
                                                i = R.id.message;
                                                TextView textView6 = (TextView) h5e.a(R.id.message, viewInflate);
                                                if (textView6 != null) {
                                                    this.binding = new ln80(cardView, textView, textView2, constraintLayout, textView3, textView4, textView5, linearLayout, textView6);
                                                    if (attributeSet != null) {
                                                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.m);
                                                        typedArrayObtainStyledAttributes.getClass();
                                                        typedArrayObtainStyledAttributes.recycle();
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final ln80 getBinding() {
        return this.binding;
    }

    public final void setBinding(ln80 ln80Var) {
        this.binding = ln80Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SgCommonToastContainer(Context context) {
        this(context, null);
        context.getClass();
    }
}
