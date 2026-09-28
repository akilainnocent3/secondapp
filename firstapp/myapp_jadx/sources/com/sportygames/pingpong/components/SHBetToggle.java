package com.sportygames.pingpong.components;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.button.MaterialButton;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.views.GameMainActivity;
import defpackage.bmy;
import defpackage.fcv;
import defpackage.h5e;
import defpackage.j820;
import defpackage.o0b;
import defpackage.rx80;
import defpackage.tk30;
import defpackage.vl60;
import defpackage.wl60;
import defpackage.yl60;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0016\u0010\u0011J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001d\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R.\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u0011¨\u0006-"}, d2 = {"Lcom/sportygames/pingpong/components/SHBetToggle;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/content/res/TypedArray;", "typedArray", "", "setThemeAttribute", "(Landroid/content/res/TypedArray;)V", "Lkotlin/Function1;", "", "statusChangeListener", "setup", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/app/Activity;", "activity", "setOnOffColor", "(Landroid/app/Activity;)V", "setOnStateChange", AnalyticsParam.EVENT_STATUS, "setStatus", "(Z)V", "Lkotlin/Function0;", "isNotLoggedIn", "openLoginDialog", "setLoginListeners", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lj820;", "E", "Lj820;", "getBinding", "()Lj820;", "setBinding", "(Lj820;)V", "binding", "L", "Lkotlin/jvm/functions/Function1;", "getStatusListener", "()Lkotlin/jvm/functions/Function1;", "setStatusListener", "statusListener", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SHBetToggle extends LinearLayoutCompat {
    public static final /* synthetic */ int S = 0;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public j820 binding;
    public Integer F;
    public Integer G;
    public int H;
    public boolean I;
    public GameMainActivity J;
    public a K;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public Function1<? super Boolean, Unit> statusListener;
    public Function0<Boolean> M;
    public Function0<Unit> N;
    public final fcv O;
    public SharedPreferences P;
    public SharedPreferences.Editor Q;
    public boolean R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SHBetToggle(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        context.getClass();
        int i = 0;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pp_toggle_button, (ViewGroup) this, false);
        addView(viewInflate);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
        int i2 = R.id.off_textview;
        TextView textView = (TextView) h5e.a(R.id.off_textview, viewInflate);
        if (textView != null) {
            i2 = R.id.on_textview;
            TextView textView2 = (TextView) h5e.a(R.id.on_textview, viewInflate);
            if (textView2 != null) {
                i2 = R.id.switch_circle;
                MaterialButton materialButton = (MaterialButton) h5e.a(R.id.switch_circle, viewInflate);
                if (materialButton != null) {
                    this.binding = new j820(linearLayoutCompat, linearLayoutCompat, textView, textView2, materialButton);
                    this.M = new vl60();
                    this.N = new wl60();
                    rx80.a aVarH = new rx80().h();
                    aVarH.c(rx80.m);
                    fcv fcvVar = new fcv(aVarH.a());
                    this.O = fcvVar;
                    if (attributeSet != null) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.k);
                        typedArrayObtainStyledAttributes.getClass();
                        setThemeAttribute(typedArrayObtainStyledAttributes);
                        typedArrayObtainStyledAttributes.recycle();
                    }
                    this.binding.b.setBackground(fcvVar);
                    this.binding.b.setOnClickListener(new yl60(i, this, context));
                    return;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void setThemeAttribute(TypedArray typedArray) {
        this.F = Integer.valueOf(typedArray.getResourceId(0, R.color.pp_toggle_off_color));
        this.G = Integer.valueOf(typedArray.getResourceId(2, R.color.pp_toggle_on_color));
    }

    public final j820 getBinding() {
        return this.binding;
    }

    public final Function1<Boolean, Unit> getStatusListener() {
        Function1 function1 = this.statusListener;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.n("statusListener");
        throw null;
    }

    public final void setBinding(j820 j820Var) {
        j820Var.getClass();
        this.binding = j820Var;
    }

    public final void setLoginListeners(Function0<Boolean> isNotLoggedIn, Function0<Unit> openLoginDialog) {
        isNotLoggedIn.getClass();
        openLoginDialog.getClass();
        this.M = isNotLoggedIn;
        this.N = openLoginDialog;
    }

    public final void setOnOffColor(Activity activity) {
        activity.getClass();
        this.J = (GameMainActivity) activity;
    }

    public final void setOnStateChange(Function1<? super Boolean, Unit> statusChangeListener) {
        statusChangeListener.getClass();
        setStatusListener(statusChangeListener);
    }

    public final void setStatus(boolean status) {
        this.I = status;
        j820 j820Var = this.binding;
        ColorStateList colorStateListB = null;
        fcv fcvVar = this.O;
        if (status) {
            j820Var.c.setVisibility(8);
            this.binding.d.setVisibility(0);
            this.binding.e.setBackgroundColor(getContext().getColor(R.color.white));
            Integer num = this.G;
            if (num != null) {
                colorStateListB = o0b.b(getContext(), num.intValue());
            }
            fcvVar.s(colorStateListB);
            return;
        }
        j820Var.c.setVisibility(0);
        this.binding.d.setVisibility(8);
        this.binding.e.setBackgroundColor(getContext().getColor(R.color.sh_switch));
        Integer num2 = this.F;
        if (num2 != null) {
            colorStateListB = o0b.b(getContext(), num2.intValue());
        }
        fcvVar.s(colorStateListB);
    }

    public final void setStatusListener(Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.statusListener = function1;
    }

    public final void setup(Function1<? super Boolean, Unit> statusChangeListener) {
        statusChangeListener.getClass();
        setStatusListener(statusChangeListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SHBetToggle(Context context) {
        this(context, null);
        context.getClass();
    }
}
