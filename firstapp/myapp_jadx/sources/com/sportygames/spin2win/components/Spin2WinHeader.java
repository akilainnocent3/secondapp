package com.sportygames.spin2win.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.spin2win.components.Spin2WinHeader;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.iq80;
import defpackage.tk30;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0012J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/sportygames/spin2win/components/Spin2WinHeader;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/Function0;", "", "backListener", "setBackListener", "(Lkotlin/jvm/functions/Function0;)V", "navigationListener", "setNavigationListener", "", "value", "setListener", "(Z)V", "enabled", "setEnableDisableHamMenu", "visibility", "setChatVisibility", "", "setRedMarkVisibility", "(I)V", "", "amount", "currency", "setAmountToWallet", "(Ljava/lang/String;Ljava/lang/String;)V", "Liq80;", "a", "Liq80;", "getBinding", "()Liq80;", "setBinding", "(Liq80;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Spin2WinHeader extends LinearLayout {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public iq80 binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spin2WinHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sg_spin2win_header, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.amount;
        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.amount, viewInflate);
        if (appCompatTextView != null) {
            i = R.id.amount_frame;
            FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.amount_frame, viewInflate);
            if (frameLayout != null) {
                i = R.id.cash_add_text;
                TextView textView = (TextView) h5e.a(R.id.cash_add_text, viewInflate);
                if (textView != null) {
                    i = R.id.cash_minus_text;
                    TextView textView2 = (TextView) h5e.a(R.id.cash_minus_text, viewInflate);
                    if (textView2 != null) {
                        i = R.id.chat;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.chat, viewInflate);
                        if (appCompatImageView != null) {
                            i = R.id.currency_bg;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.currency_bg, viewInflate);
                            if (appCompatTextView2 != null) {
                                i = R.id.currency_code;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.currency_code, viewInflate);
                                if (appCompatTextView3 != null) {
                                    i = R.id.ic_back;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.ic_back, viewInflate);
                                    if (appCompatImageView2 != null) {
                                        i = R.id.main_title;
                                        if (((TextView) h5e.a(R.id.main_title, viewInflate)) != null) {
                                            i = R.id.navigation;
                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.navigation, viewInflate);
                                            if (appCompatImageView3 != null) {
                                                i = R.id.red_mark;
                                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.red_mark, viewInflate);
                                                if (appCompatImageView4 != null) {
                                                    i = R.id.spinKitLoader;
                                                    SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.spinKitLoader, viewInflate);
                                                    if (spinKitView != null) {
                                                        this.binding = new iq80((ConstraintLayout) viewInflate, appCompatTextView, frameLayout, textView, textView2, appCompatImageView, appCompatTextView2, appCompatTextView3, appCompatImageView2, appCompatImageView3, appCompatImageView4, spinKitView);
                                                        if (attributeSet != null) {
                                                            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.t);
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
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void a(boolean z) {
        iq80 iq80Var = this.binding;
        if (z) {
            if (iq80Var != null) {
                iq80Var.w.setVisibility(4);
            }
            iq80 iq80Var2 = this.binding;
            if (iq80Var2 != null) {
                iq80Var2.y.setVisibility(4);
            }
            iq80 iq80Var3 = this.binding;
            if (iq80Var3 != null) {
                iq80Var3.c.setVisibility(4);
                return;
            }
            return;
        }
        if (iq80Var != null) {
            iq80Var.w.setVisibility(0);
        }
        iq80 iq80Var4 = this.binding;
        if (iq80Var4 != null) {
            iq80Var4.y.setVisibility(0);
        }
        iq80 iq80Var5 = this.binding;
        if (iq80Var5 != null) {
            iq80Var5.c.setVisibility(0);
        }
    }

    public final iq80 getBinding() {
        return this.binding;
    }

    public final void setAmountToWallet(String amount, String currency) {
        amount.getClass();
        currency.getClass();
        iq80 iq80Var = this.binding;
        if (iq80Var != null) {
            iq80Var.b.setText(amount);
        }
        iq80 iq80Var2 = this.binding;
        if (iq80Var2 != null) {
            iq80Var2.v.setText(currency);
        }
        iq80 iq80Var3 = this.binding;
        if (iq80Var3 != null) {
            iq80Var3.i.setText(StringsKt.t0(currency).toString());
        }
    }

    public final void setBackListener(final Function0<Unit> backListener) {
        backListener.getClass();
        iq80 iq80Var = this.binding;
        if (iq80Var != null) {
            iq80Var.w.setOnClickListener(new View.OnClickListener() { // from class: q1b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = Spin2WinHeader.b;
                    backListener.invoke();
                }
            });
        }
    }

    public final void setBinding(iq80 iq80Var) {
        this.binding = iq80Var;
    }

    public final void setChatVisibility(boolean visibility) {
        iq80 iq80Var = this.binding;
        if (visibility) {
            if (iq80Var != null) {
                iq80Var.f.setVisibility(0);
            }
        } else if (iq80Var != null) {
            iq80Var.f.setVisibility(4);
        }
    }

    public final void setEnableDisableHamMenu(boolean enabled) {
        iq80 iq80Var = this.binding;
        if (iq80Var != null) {
            iq80Var.y.setEnabled(enabled);
        }
    }

    public final void setListener(boolean value) {
        iq80 iq80Var = this.binding;
        if (iq80Var != null) {
            iq80Var.w.setClickable(value);
        }
        iq80 iq80Var2 = this.binding;
        if (iq80Var2 != null) {
            iq80Var2.y.setClickable(value);
        }
        iq80 iq80Var3 = this.binding;
        if (iq80Var3 != null) {
            iq80Var3.f.setClickable(value);
        }
    }

    public final void setNavigationListener(final Function0<Unit> navigationListener) {
        navigationListener.getClass();
        iq80 iq80Var = this.binding;
        if (iq80Var != null) {
            iq80Var.y.setOnClickListener(new View.OnClickListener() { // from class: r1b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = Spin2WinHeader.b;
                    navigationListener.invoke();
                }
            });
        }
    }

    public final void setRedMarkVisibility(int visibility) {
        iq80 iq80Var = this.binding;
        if (iq80Var != null) {
            iq80Var.z.setVisibility(visibility);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Spin2WinHeader(Context context) {
        this(context, null);
        context.getClass();
    }
}
