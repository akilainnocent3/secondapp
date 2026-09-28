package com.sportybet.android.instantwin.presentation.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.ActionBar;
import defpackage.bjb0;
import defpackage.bmy;
import defpackage.bqe;
import defpackage.gr0;
import defpackage.h5e;
import defpackage.q4p;
import defpackage.s0b;
import defpackage.sn5;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0014J!\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u000b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/widget/ActionBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "resId", "", "setTitle", "(I)V", "", "title", "(Ljava/lang/CharSequence;)V", "Landroid/view/View$OnClickListener;", "onClickListener", "setBackButton", "(Landroid/view/View$OnClickListener;)V", "setHistoryButton", "setSportsIcon", "setUserInfoButton", "onRegisterListener", "onLoginListener", "setLoginListeners", "(Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V", "Lkotlin/Function0;", "listener", "setBalanceListener", "(Lkotlin/jvm/functions/Function0;)V", "", "text", "setBalanceText", "(Ljava/lang/String;)V", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ActionBar extends ConstraintLayout {
    public static final /* synthetic */ int G = 0;
    public final q4p F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.iwqk_layout_action_bar, this);
        int i2 = R.id.back_btn;
        ImageButton imageButton = (ImageButton) h5e.a(R.id.back_btn, this);
        if (imageButton != null) {
            i2 = R.id.divide_line;
            View viewA = h5e.a(R.id.divide_line, this);
            if (viewA != null) {
                i2 = R.id.home_btn;
                ImageView imageView = (ImageView) h5e.a(R.id.home_btn, this);
                if (imageView != null) {
                    i2 = R.id.login_btn;
                    TextView textView = (TextView) h5e.a(R.id.login_btn, this);
                    if (textView != null) {
                        i2 = R.id.register_btn;
                        TextView textView2 = (TextView) h5e.a(R.id.register_btn, this);
                        if (textView2 != null) {
                            i2 = R.id.right_layout;
                            if (((ConstraintLayout) h5e.a(R.id.right_layout, this)) != null) {
                                i2 = R.id.ticket_history_btn;
                                ImageView imageView2 = (ImageView) h5e.a(R.id.ticket_history_btn, this);
                                if (imageView2 != null) {
                                    i2 = R.id.title;
                                    TextView textView3 = (TextView) h5e.a(R.id.title, this);
                                    if (textView3 != null) {
                                        i2 = R.id.user_balance;
                                        TextView textView4 = (TextView) h5e.a(R.id.user_balance, this);
                                        if (textView4 != null) {
                                            i2 = R.id.user_info_container;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.user_info_container, this);
                                            if (constraintLayout != null) {
                                                this.F = new q4p(this, imageButton, viewA, imageView, textView, textView2, imageView2, textView3, textView4, constraintLayout);
                                                setBackgroundColor(getContext().getColor(R.color.brand_primary));
                                                imageButton.setImageDrawable(gr0.a(getContext(), R.drawable.ic_action_bar_back));
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
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void E() {
        q4p q4pVar = this.F;
        q4pVar.c.setVisibility(8);
        q4pVar.f.setVisibility(8);
        q4pVar.e.setVisibility(8);
    }

    public final void F(AssetsInfo assetsInfo, String str) {
        str.getClass();
        q4p q4pVar = this.F;
        if (assetsInfo == null) {
            q4pVar.w.setVisibility(8);
        } else {
            q4pVar.w.setText(sn5.c(this, R.string.app_common__var_var, str, bjb0.U(assetsInfo.balance, Locale.US)));
            q4pVar.w.setVisibility(0);
        }
    }

    public final void G(boolean z) {
        TextView textView = this.F.w;
        if (z) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    public final void setBackButton(View.OnClickListener onClickListener) {
        this.F.b.setOnClickListener(onClickListener);
    }

    public final void setBalanceListener(final Function0<Unit> listener) {
        this.F.w.setOnClickListener(new View.OnClickListener() { // from class: jb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActionBar.G;
                Function0 function0 = listener;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
    }

    public final void setBalanceText(String text) {
        this.F.w.setText(text);
    }

    public final void setHistoryButton(View.OnClickListener onClickListener) {
        this.F.i.setOnClickListener(onClickListener);
    }

    public final void setLoginListeners(View.OnClickListener onRegisterListener, View.OnClickListener onLoginListener) {
        q4p q4pVar = this.F;
        q4pVar.f.setOnClickListener(onRegisterListener);
        q4pVar.e.setOnClickListener(onLoginListener);
    }

    public final void setSportsIcon(int resId) {
        ImageButton imageButton = this.F.b;
        imageButton.setPadding(0, 0, bqe.a(4.0f), 0);
        imageButton.setColorFilter(imageButton.getContext().getColor(R.color.white));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setAdjustViewBounds(true);
        ViewGroup.LayoutParams layoutParams = imageButton.getLayoutParams();
        if (layoutParams == null) {
            bmy.a("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = bqe.a(24.0f);
        marginLayoutParams.height = bqe.a(24.0f);
        marginLayoutParams.setMarginStart(bqe.a(16.0f));
        imageButton.setLayoutParams(marginLayoutParams);
        Context context = imageButton.getContext();
        context.getClass();
        imageButton.setImageDrawable(s0b.c(context, resId, null, null, 6));
    }

    public final void setTitle(int resId) {
        setTitle(sn5.c(this, resId, new Object[0]));
    }

    public final void setUserInfoButton(View.OnClickListener onClickListener) {
        this.F.y.setOnClickListener(onClickListener);
    }

    public final void setTitle(CharSequence title) {
        this.F.v.setText(title);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionBar(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ ActionBar(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
