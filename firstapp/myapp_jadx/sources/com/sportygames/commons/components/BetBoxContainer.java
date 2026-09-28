package com.sportygames.commons.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.jk2;
import defpackage.pw;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/sportygames/commons/components/BetBoxContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "betAmount", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "betChipList", "", "setBetAmount", "(Ljava/lang/Double;Ljava/util/ArrayList;)V", "getBetAmount", "()D", "setErrorBetAmount", "()V", "setErrorBetAmountLayout", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "setTextView", "(Landroid/widget/TextView;)V", "textView", "b", "getBetText", "setBetText", "betText", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "getCrossFbg", "()Landroid/widget/ImageView;", "setCrossFbg", "(Landroid/widget/ImageView;)V", "crossFbg", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BetBoxContainer extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public TextView textView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView betText;
    public final ImageView c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ImageView crossFbg;
    public final ImageView e;
    public final ConstraintLayout f;
    public double i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BetBoxContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, R.layout.sg_bet_box_container_view, this);
        View viewFindViewById = findViewById(R.id.bet_amount);
        viewFindViewById.getClass();
        this.textView = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.bet_text);
        viewFindViewById2.getClass();
        this.betText = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.image);
        viewFindViewById3.getClass();
        this.c = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.bet_square_container);
        viewFindViewById4.getClass();
        this.f = (ConstraintLayout) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.fbg_cross);
        viewFindViewById5.getClass();
        this.crossFbg = (ImageView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.ic_fbg);
        viewFindViewById6.getClass();
        this.e = (ImageView) viewFindViewById6;
    }

    public final void a(int i) {
        this.crossFbg.setVisibility(i);
    }

    public final void b(int i, int i2) {
        this.e.setVisibility(i);
        this.c.setVisibility(i2);
    }

    /* JADX INFO: renamed from: getBetAmount, reason: from getter */
    public final double getI() {
        return this.i;
    }

    public final TextView getBetText() {
        return this.betText;
    }

    public final ImageView getCrossFbg() {
        return this.crossFbg;
    }

    public final TextView getTextView() {
        return this.textView;
    }

    public final void setBetAmount(Double betAmount, ArrayList<Double> betChipList) {
        String strA;
        if (betAmount == null) {
            return;
        }
        this.i = betAmount.doubleValue();
        TextView textView = this.textView;
        TreeMap treeMap = pw.a;
        textView.setText(pw.g(betAmount));
        if (betChipList != null) {
            Map<Double, String> map = jk2.a;
            strA = jk2.a(betAmount.doubleValue(), betChipList);
        } else {
            strA = null;
        }
        Integer num = jk2.b.get(strA);
        if (num != null) {
            int iIntValue = num.intValue();
            Context context = getContext();
            if (context != null) {
                this.c.setImageDrawable(context.getDrawable(iIntValue));
            }
        }
    }

    public final void setBetText(TextView textView) {
        textView.getClass();
        this.betText = textView;
    }

    public final void setCrossFbg(ImageView imageView) {
        imageView.getClass();
        this.crossFbg = imageView;
    }

    public final void setErrorBetAmount() {
        this.textView.setTextColor(getContext().getColor(R.color.error_red_clr));
        this.betText.setTextColor(getContext().getColor(R.color.error_red_clr));
        this.f.setBackground(getContext().getDrawable(R.drawable.bet_square_error));
    }

    public final void setErrorBetAmountLayout() {
        this.textView.setTextColor(getContext().getColor(R.color.white));
        this.betText.setTextColor(getContext().getColor(R.color.white));
        this.f.setBackground(getContext().getDrawable(R.drawable.bet_square));
    }

    public final void setTextView(TextView textView) {
        textView.getClass();
        this.textView = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BetBoxContainer(Context context) {
        this(context, null);
        context.getClass();
    }
}
