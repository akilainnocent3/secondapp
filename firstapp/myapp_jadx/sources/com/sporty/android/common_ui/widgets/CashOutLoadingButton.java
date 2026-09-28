package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.CashOutLoadingButton;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.c0d;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.h5e;
import defpackage.hkd;
import defpackage.hwr;
import defpackage.ib5;
import defpackage.ibs;
import defpackage.jvd0;
import defpackage.mpe0;
import defpackage.tje0;
import defpackage.tl6;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.wgd0;
import defpackage.wl6;
import defpackage.y5b;
import defpackage.zch0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010)\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u001d\u0010,\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u001d\u00101\u001a\u0004\u0018\u00010-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/sporty/android/common_ui/widgets/CashOutLoadingButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setEnabled", "(Z)V", "", "debounceMs", "Lkotlin/Function0;", "action", "setDisabledStyleClickable", "(JLkotlin/jvm/functions/Function0;)V", "setCashOutSmallSize", "()V", "", "t", "amount", "setCashOutText", "(Ljava/lang/String;Ljava/lang/String;)V", "setCashOutTextWithBg", "tRes", "(I)V", "setBtnClickedShowPopupListener", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/graphics/drawable/Drawable;", "G", "Lttr;", "getDefaultBg", "()Landroid/graphics/drawable/Drawable;", "defaultBg", "H", "getDarkGreen", "darkGreen", "I", "getDisabledStyleBg", "disabledStyleBg", "Libs;", "J", "getLifecycleOwner", "()Libs;", "lifecycleOwner", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CashOutLoadingButton extends ConstraintLayout {
    public static final /* synthetic */ int R = 0;
    public final wgd0 F;
    public final mpe0 G;
    public final mpe0 H;
    public final mpe0 I;
    public final mpe0 J;
    public jvd0 K;
    public String L;
    public boolean M;
    public Boolean N;
    public long O;
    public long P;
    public Function0<Unit> Q;

    @c0d(c = "com.sporty.android.common_ui.widgets.CashOutLoadingButton$setCashOutTextWithBg$1$2", f = "CashOutLoadingButton.kt", l = {112}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wgd0 b;
        public final /* synthetic */ CashOutLoadingButton c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wgd0 wgd0Var, CashOutLoadingButton cashOutLoadingButton, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = wgd0Var;
            this.c = cashOutLoadingButton;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            CashOutLoadingButton cashOutLoadingButton = this.c;
            wgd0 wgd0Var = this.b;
            if (i == 0) {
                uj50.b(obj);
                wgd0Var.a.setBackground(cashOutLoadingButton.getDarkGreen());
                this.a = 1;
                if (hkd.b(3000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            wgd0Var.a.setBackground(cashOutLoadingButton.getDefaultBg());
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashOutLoadingButton(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.spr_cash_out_loading_button, this);
        int i2 = R.id.cash_out_text;
        TextView textView = (TextView) h5e.a(R.id.cash_out_text, this);
        if (textView != null) {
            i2 = R.id.progress;
            ProgressBar progressBar = (ProgressBar) h5e.a(R.id.progress, this);
            if (progressBar != null) {
                this.F = new wgd0(this, textView, progressBar);
                this.G = hwr.b(new tl6(context, 0));
                this.H = hwr.b(new Function0() { // from class: ul6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = CashOutLoadingButton.R;
                        return context.getDrawable(R.drawable.spr_dark_green_btn_bg);
                    }
                });
                this.I = hwr.b(new Function0() { // from class: vl6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = CashOutLoadingButton.R;
                        return context.getDrawable(R.drawable.bg_filled_brand_secondary_disable_2_radius);
                    }
                });
                this.J = hwr.b(new wl6(this, context));
                this.P = 500L;
                setBackground(getDefaultBg());
                setOnClickListener(new View.OnClickListener() { // from class: xl6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CashOutLoadingButton cashOutLoadingButton = this.a;
                        long j = cashOutLoadingButton.M ? cashOutLoadingButton.P : 500L;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - cashOutLoadingButton.O < j) {
                            return;
                        }
                        cashOutLoadingButton.O = jCurrentTimeMillis;
                        Function0<Unit> function0 = cashOutLoadingButton.Q;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }
                });
                return;
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable getDarkGreen() {
        return (Drawable) this.H.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable getDefaultBg() {
        return (Drawable) this.G.getValue();
    }

    private final Drawable getDisabledStyleBg() {
        return (Drawable) this.I.getValue();
    }

    private final ibs getLifecycleOwner() {
        return (ibs) this.J.getValue();
    }

    public static /* synthetic */ void setCashOutText$default(CashOutLoadingButton cashOutLoadingButton, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        cashOutLoadingButton.setCashOutText(str, str2);
    }

    public static /* synthetic */ void setCashOutTextWithBg$default(CashOutLoadingButton cashOutLoadingButton, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        cashOutLoadingButton.setCashOutTextWithBg(str, str2);
    }

    public static /* synthetic */ void setDisabledStyleClickable$default(CashOutLoadingButton cashOutLoadingButton, long j, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        cashOutLoadingButton.setDisabledStyleClickable(j, function0);
    }

    public final void setBtnClickedShowPopupListener(Function0<Unit> action) {
        action.getClass();
        this.Q = action;
    }

    public final void setCashOutSmallSize() {
        wgd0 wgd0Var = this.F;
        wgd0Var.b.setTextSize(12.0f);
        ProgressBar progressBar = wgd0Var.c;
        ViewGroup.LayoutParams layoutParams = progressBar.getLayoutParams();
        int iA = zch0.a(getContext(), 16);
        layoutParams.height = iA;
        layoutParams.width = iA;
        progressBar.setLayoutParams(layoutParams);
    }

    public final void setCashOutText(String t, String amount) {
        t.getClass();
        this.L = amount;
        this.F.b.setText(t);
    }

    public final void setCashOutTextWithBg(String t, String amount) {
        t.getClass();
        String str = this.L;
        if (str == null || str.length() == 0 || Intrinsics.g(this.L, amount)) {
            setCashOutText(t, amount);
            return;
        }
        setCashOutText(t, amount);
        jvd0 jvd0Var = this.K;
        if (jvd0Var != null) {
            if (jvd0Var.isCancelled()) {
                jvd0Var = null;
            }
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
        }
        ibs lifecycleOwner = getLifecycleOwner();
        this.K = lifecycleOwner != null ? ej5.c(ebs.a(lifecycleOwner.getLifecycle()), null, null, new a(this.F, this, null), 3) : null;
    }

    public final void setDisabledStyleClickable(long debounceMs, Function0<Unit> action) {
        action.getClass();
        jvd0 jvd0Var = this.K;
        if (jvd0Var != null) {
            if (jvd0Var.isCancelled()) {
                jvd0Var = null;
            }
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
        }
        this.M = true;
        this.P = debounceMs;
        this.Q = action;
        super.setEnabled(true);
        wgd0 wgd0Var = this.F;
        wgd0Var.b.setEnabled(false);
        wgd0Var.a.setBackground(getDisabledStyleBg());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        boolean z;
        boolean z2 = this.M;
        wgd0 wgd0Var = this.F;
        if (z2 || !Intrinsics.g(this.N, Boolean.valueOf(enabled))) {
            jvd0 jvd0Var = this.K;
            if (jvd0Var != null) {
                z = jvd0Var.isActive();
            }
            if (!enabled || !z) {
                jvd0 jvd0Var2 = this.K;
                if (jvd0Var2 != null) {
                    if (jvd0Var2.isCancelled()) {
                        jvd0Var2 = null;
                    }
                    if (jvd0Var2 != null) {
                        jvd0Var2.cancel((CancellationException) null);
                    }
                }
                wgd0Var.a.setBackground(enabled ? getDefaultBg() : getDisabledStyleBg());
            }
            this.M = false;
            this.N = Boolean.valueOf(enabled);
        }
        super.setEnabled(enabled);
        wgd0Var.b.setEnabled(enabled);
    }

    public final void setCashOutText(int tRes) {
        this.L = null;
        this.F.b.setText(tRes);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashOutLoadingButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashOutLoadingButton(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ CashOutLoadingButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
