package com.sportygames.commons.components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.components.SGToggle;
import com.sportygames.commons.components.a;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.commons.views.NavigationActivity;
import defpackage.bmy;
import defpackage.fcv;
import defpackage.h5e;
import defpackage.nq80;
import defpackage.o0b;
import defpackage.rx80;
import defpackage.tk30;
import defpackage.vs50;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R.\u00101\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u001d¨\u00062"}, d2 = {"Lcom/sportygames/commons/components/SGToggle;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/content/res/TypedArray;", "typedArray", "", "setThemeAttribute", "(Landroid/content/res/TypedArray;)V", "", AnalyticsParam.EVENT_STATUS, "setCircleColor", "(Z)V", "Lkotlin/Function1;", "statusChangeListener", "setup", "(ZLkotlin/jvm/functions/Function1;)V", "", "onColorResource", "offColorResource", "Landroid/app/Activity;", "activity", "setOnOffColor", "(IILandroid/app/Activity;)V", "setOnStateChange", "(Lkotlin/jvm/functions/Function1;)V", "", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "setStatus", "(ZLjava/lang/String;)V", "setGameName", "(Ljava/lang/String;)V", "Lnq80;", "E", "Lnq80;", "getBinding", "()Lnq80;", "setBinding", "(Lnq80;)V", "binding", "M", "Lkotlin/jvm/functions/Function1;", "getStatusListener", "()Lkotlin/jvm/functions/Function1;", "setStatusListener", "statusListener", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SGToggle extends LinearLayoutCompat {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public nq80 binding;
    public Integer F;
    public Activity G;
    public Integer H;
    public boolean I;
    public String J;
    public NavigationActivity K;
    public GameMainActivity L;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public Function1<? super Boolean, Unit> statusListener;
    public final fcv N;

    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ TextView b;
        public final /* synthetic */ TextView c;

        public a(TextView textView, TextView textView2) {
            this.b = textView;
            this.c = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            animator.getClass();
            SGToggle sGToggle = SGToggle.this;
            sGToggle.getBinding().e.animate().translationX(0.0f).setDuration(0L);
            this.b.setVisibility(8);
            TextView textView = this.c;
            textView.setVisibility(0);
            textView.setAlpha(1.0f);
            sGToggle.getBinding().b.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SGToggle(final Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sg_toggle_button, (ViewGroup) this, false);
        addView(viewInflate);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.off_textview;
        TextView textView = (TextView) h5e.a(R.id.off_textview, viewInflate);
        if (textView != null) {
            i = R.id.on_textview;
            TextView textView2 = (TextView) h5e.a(R.id.on_textview, viewInflate);
            if (textView2 != null) {
                i = R.id.switch_circle;
                MaterialButton materialButton = (MaterialButton) h5e.a(R.id.switch_circle, viewInflate);
                if (materialButton != null) {
                    this.binding = new nq80(constraintLayout, constraintLayout, textView, textView2, materialButton);
                    this.J = "";
                    rx80.a aVarH = new rx80().h();
                    aVarH.c(rx80.m);
                    fcv fcvVar = new fcv(aVarH.a());
                    this.N = fcvVar;
                    if (attributeSet != null) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.k);
                        typedArrayObtainStyledAttributes.getClass();
                        setThemeAttribute(typedArrayObtainStyledAttributes);
                        typedArrayObtainStyledAttributes.recycle();
                    }
                    this.binding.b.setBackground(fcvVar);
                    this.binding.b.setOnClickListener(new View.OnClickListener(context) { // from class: dl60
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            SGToggle sGToggle = this.a;
                            Activity activity = sGToggle.G;
                            if (activity == null) {
                                Intrinsics.n("activity");
                                throw null;
                            }
                            boolean zEquals = activity.getClass().getSimpleName().equals("NavigationActivity");
                            Activity activity2 = sGToggle.G;
                            if (zEquals) {
                                if (activity2 == null) {
                                    Intrinsics.n("activity");
                                    throw null;
                                }
                                NavigationActivity navigationActivity = (NavigationActivity) activity2;
                                sGToggle.K = navigationActivity;
                                navigationActivity.getSupportFragmentManager().getClass();
                            } else {
                                if (activity2 == null) {
                                    Intrinsics.n("activity");
                                    throw null;
                                }
                                GameMainActivity gameMainActivity = (GameMainActivity) activity2;
                                sGToggle.L = gameMainActivity;
                                gameMainActivity.getSupportFragmentManager().getClass();
                            }
                            GameMainActivity gameMainActivity2 = sGToggle.L;
                            if (gameMainActivity2 == null) {
                                NavigationActivity navigationActivity2 = sGToggle.K;
                                if (navigationActivity2 == null) {
                                    Intrinsics.n("navigationActivity");
                                    throw null;
                                }
                                if (navigationActivity2.getSupportFragmentManager().G(R.id.flContent) instanceof a) {
                                    return;
                                }
                                sGToggle.setStatus(!sGToggle.I, sGToggle.J);
                                sGToggle.getStatusListener().invoke(Boolean.valueOf(sGToggle.I));
                                return;
                            }
                            Fragment fragmentG = gameMainActivity2.getSupportFragmentManager().G(R.id.main_game_container);
                            if (!(fragmentG instanceof q1c0)) {
                                boolean z = fragmentG instanceof m410;
                            }
                            GameMainActivity gameMainActivity3 = sGToggle.L;
                            if (gameMainActivity3 == null) {
                                Intrinsics.n("gameMainActivity");
                                throw null;
                            }
                            if (gameMainActivity3.getSupportFragmentManager().G(R.id.main_game_container) instanceof a) {
                                return;
                            }
                            sGToggle.setStatus(!sGToggle.I, sGToggle.J);
                            sGToggle.getStatusListener().invoke(Boolean.valueOf(sGToggle.I));
                        }
                    });
                    return;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    private final void setCircleColor(boolean status) {
        this.binding.e.setBackgroundColor(getContext().getColor(status ? R.color.white : R.color.sh_valentine));
    }

    private final void setThemeAttribute(TypedArray typedArray) {
        this.F = Integer.valueOf(typedArray.getResourceId(0, android.R.color.background_dark));
        this.H = Integer.valueOf(typedArray.getResourceId(2, android.R.color.background_light));
    }

    public final nq80 getBinding() {
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

    public final void j(Integer num, TextView textView, TextView textView2, int i) {
        ColorStateList colorStateListB;
        long j = this.binding.b.getVisibility() == 0 ? 200L : 20L;
        textView2.setAlpha(0.0f);
        if (num != null) {
            colorStateListB = o0b.b(getContext(), num.intValue());
        } else {
            colorStateListB = null;
        }
        this.N.s(colorStateListB);
        this.binding.e.animate().translationX(vs50.a(this.binding.e.getWidth(), 3.5f, this.binding.b.getWidth(), i)).alpha(1.0f).setListener(new a(textView2, textView)).setDuration(j);
    }

    public final void setBinding(nq80 nq80Var) {
        nq80Var.getClass();
        this.binding = nq80Var;
    }

    public final void setGameName(String gameName) {
        gameName.getClass();
        this.J = gameName;
    }

    public final void setOnOffColor(int onColorResource, int offColorResource, Activity activity) {
        activity.getClass();
        this.H = Integer.valueOf(onColorResource);
        this.F = Integer.valueOf(offColorResource);
        this.G = activity;
    }

    public final void setOnStateChange(Function1<? super Boolean, Unit> statusChangeListener) {
        statusChangeListener.getClass();
        setStatusListener(statusChangeListener);
    }

    public final void setStatus(boolean status, String gameName) {
        gameName.getClass();
        this.I = status;
        if (status) {
            Integer num = this.H;
            nq80 nq80Var = this.binding;
            j(num, nq80Var.d, nq80Var.c, 1);
        } else {
            Integer num2 = this.F;
            nq80 nq80Var2 = this.binding;
            j(num2, nq80Var2.c, nq80Var2.d, -1);
        }
        if (gameName.equals("Crazy-Rider")) {
            this.binding.e.setBackgroundColor(getContext().getColor(R.color.white));
        } else {
            setCircleColor(status);
        }
    }

    public final void setStatusListener(Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.statusListener = function1;
    }

    public final void setup(boolean status, Function1<? super Boolean, Unit> statusChangeListener) {
        statusChangeListener.getClass();
        setStatus(status, this.J);
        setStatusListener(statusChangeListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SGToggle(Context context) {
        this(context, null);
        context.getClass();
    }
}
