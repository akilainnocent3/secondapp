package com.sportybet.plugin.myfavorite.widget.item;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.widget.QuickAddStakeLayout;
import com.sportybet.plugin.myfavorite.widget.item.QuickAddStakeItem;
import defpackage.a8b;
import defpackage.b6y;
import defpackage.bmy;
import defpackage.gbq;
import defpackage.h5e;
import defpackage.hrd0;
import defpackage.hwr;
import defpackage.jmb;
import defpackage.m4d;
import defpackage.mpe0;
import defpackage.sn5;
import defpackage.txw;
import defpackage.uoy;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010 \u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/sportybet/plugin/myfavorite/widget/item/QuickAddStakeItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "title", "", "setupTitle", "(I)V", "", "stake", "setupStake", "(Ljava/lang/Double;)V", "", "getStake", "()Ljava/lang/String;", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "Landroid/graphics/drawable/Drawable;", "I", "Lttr;", "getBgNormal", "()Landroid/graphics/drawable/Drawable;", "bgNormal", "J", "getBgError", "bgError", "Lhrd0;", "K", "Lhrd0;", "getStakeConfigRepository", "()Lhrd0;", "setStakeConfigRepository", "(Lhrd0;)V", "stakeConfigRepository", "Luoy;", "L", "Luoy;", "getListener", "()Luoy;", "setListener", "(Luoy;)V", "listener", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class QuickAddStakeItem extends Hilt_QuickAddStakeItem {
    public static final /* synthetic */ int M = 0;
    public final txw H;
    public final mpe0 I;
    public final mpe0 J;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public hrd0 stakeConfigRepository;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public uoy listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickAddStakeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.my_favorite_quick_add_stake_edit_item, this);
        int i2 = R.id.bg;
        View viewA = h5e.a(R.id.bg, this);
        if (viewA != null) {
            i2 = R.id.currency;
            TextView textView = (TextView) h5e.a(R.id.currency, this);
            if (textView != null) {
                i2 = R.id.edit_stake;
                final EditText editText = (EditText) h5e.a(R.id.edit_stake, this);
                if (editText != null) {
                    i2 = R.id.err_msg;
                    TextView textView2 = (TextView) h5e.a(R.id.err_msg, this);
                    if (textView2 != null) {
                        i2 = R.id.title;
                        TextView textView3 = (TextView) h5e.a(R.id.title, this);
                        if (textView3 != null) {
                            this.H = new txw(this, viewA, textView, editText, textView2, textView3);
                            this.I = hwr.b(new gbq(context, 1));
                            this.J = hwr.b(new jmb(context, 3));
                            Context context2 = getContext();
                            context2.getClass();
                            textView.setText(sn5.b(context2, R.string.my_favourites_settings__my_quick_add_currency, a8b.e()));
                            Context context3 = editText.getContext();
                            context3.getClass();
                            BigDecimal bigDecimal = new BigDecimal("0.01");
                            DecimalFormat decimalFormat = b6y.a;
                            editText.setHint(sn5.b(context3, R.string.component_betslip__min_vstake, b6y.b.format(bigDecimal.doubleValue())));
                            editText.setShowSoftInputOnFocus(false);
                            editText.setFilters(new m4d[]{new m4d(getStakeConfigRepository().y().getMaxStake().toPlainString().length())});
                            editText.setOnTouchListener(new View.OnTouchListener() { // from class: yb30
                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    int i3 = QuickAddStakeItem.M;
                                    editText.requestFocus();
                                    QuickAddStakeItem quickAddStakeItem = this;
                                    uoy uoyVar = quickAddStakeItem.listener;
                                    if (uoyVar == null) {
                                        return false;
                                    }
                                    QuickAddStakeLayout quickAddStakeLayout = ((ac30) uoyVar).a;
                                    quickAddStakeLayout.K = quickAddStakeItem;
                                    quickAddStakeLayout.H.b.L(quickAddStakeItem.getEditText(), 2);
                                    return false;
                                }
                            });
                            return;
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final Drawable getBgError() {
        return (Drawable) this.J.getValue();
    }

    private final Drawable getBgNormal() {
        return (Drawable) this.I.getValue();
    }

    public final void E(String str, boolean z) {
        txw txwVar = this.H;
        View view = txwVar.b;
        TextView textView = txwVar.d;
        view.setBackground(z ? getBgError() : getBgNormal());
        textView.setText(str);
        textView.setVisibility(z ? 0 : 8);
    }

    public final EditText getEditText() {
        return this.H.c;
    }

    public final uoy getListener() {
        return this.listener;
    }

    public final String getStake() {
        return this.H.c.getText().toString();
    }

    public final hrd0 getStakeConfigRepository() {
        hrd0 hrd0Var = this.stakeConfigRepository;
        if (hrd0Var != null) {
            return hrd0Var;
        }
        Intrinsics.n("stakeConfigRepository");
        throw null;
    }

    public final void setListener(uoy uoyVar) {
        this.listener = uoyVar;
    }

    public final void setStakeConfigRepository(hrd0 hrd0Var) {
        hrd0Var.getClass();
        this.stakeConfigRepository = hrd0Var;
    }

    public final void setupStake(Double stake) {
        if (stake != null) {
            this.H.c.setText(b6y.b.format(stake.doubleValue()));
        }
    }

    public final void setupTitle(int title) {
        this.H.e.setText(sn5.c(this, title, new Object[0]));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickAddStakeItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickAddStakeItem(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ QuickAddStakeItem(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
