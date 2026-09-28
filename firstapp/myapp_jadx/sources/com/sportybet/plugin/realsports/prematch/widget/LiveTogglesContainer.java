package com.sportybet.plugin.realsports.prematch.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.prematch.widget.LiveTogglesContainer;
import defpackage.bmy;
import defpackage.fco;
import defpackage.gco;
import defpackage.h3a;
import defpackage.h5e;
import defpackage.hwr;
import defpackage.kts;
import defpackage.mpe0;
import defpackage.sus;
import defpackage.tus;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010 \u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001f\u0010\u001cR\u001d\u0010#\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u001cR$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/widget/LiveTogglesContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isCheck", "", "setLiveBettingChecked", "(Z)V", "isVisible", "setLiveBettingVisible", "b", "Lttr;", "getGreen", "()I", "green", "c", "getWhite", "white", "Landroid/graphics/drawable/Drawable;", "d", "getArrowDown", "()Landroid/graphics/drawable/Drawable;", "arrowDown", "e", "getArrowRight", "arrowRight", "f", "getArrowDisable", "arrowDisable", "Lsus;", "i", "Lsus;", "getToggleContainerListener", "()Lsus;", "setToggleContainerListener", "(Lsus;)V", "toggleContainerListener", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LiveTogglesContainer extends LinearLayout {
    public static final /* synthetic */ int v = 0;
    public final kts a;
    public final mpe0 b;
    public final mpe0 c;
    public final mpe0 d;
    public final mpe0 e;
    public final mpe0 f;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public sus toggleContainerListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveTogglesContainer(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.live_section_toggle_container, this);
        int i2 = R.id.all_live_count;
        TextView textView = (TextView) h5e.a(R.id.all_live_count, this);
        if (textView != null) {
            i2 = R.id.live_all_container;
            LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.live_all_container, this);
            if (linearLayout != null) {
                i2 = R.id.live_betting_container;
                LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.live_betting_container, this);
                if (linearLayout2 != null) {
                    i2 = R.id.live_betting_count;
                    TextView textView2 = (TextView) h5e.a(R.id.live_betting_count, this);
                    if (textView2 != null) {
                        i2 = R.id.live_betting_toggle;
                        final AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) h5e.a(R.id.live_betting_toggle, this);
                        if (appCompatCheckBox != null) {
                            i2 = R.id.live_stub;
                            Space space = (Space) h5e.a(R.id.live_stub, this);
                            if (space != null) {
                                this.a = new kts(this, textView, linearLayout, linearLayout2, textView2, appCompatCheckBox, space);
                                this.b = hwr.b(new fco(context, 1));
                                this.c = hwr.b(new gco(context, 1));
                                this.d = hwr.b(new h3a(2, context, this));
                                this.e = hwr.b(new tus(0, context, this));
                                this.f = hwr.b(new Function0() { // from class: uus
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i3 = LiveTogglesContainer.v;
                                        Context context2 = context;
                                        Drawable drawable = context2.getDrawable(R.drawable.iwqk_more);
                                        if (drawable == null) {
                                            return null;
                                        }
                                        aef.b(drawable, context2, R.color.text_type2_tertiary);
                                        return drawable;
                                    }
                                });
                                appCompatCheckBox.setEnabled(false);
                                appCompatCheckBox.setButtonDrawable(getArrowRight());
                                appCompatCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vus
                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                        LiveTogglesContainer.c(appCompatCheckBox, this, compoundButton, z);
                                    }
                                });
                                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: wus
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        sus susVar = this.a.toggleContainerListener;
                                        if (susVar != null) {
                                            susVar.b();
                                        }
                                    }
                                });
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

    public static final Drawable a(Context context, LiveTogglesContainer liveTogglesContainer) {
        Drawable drawable = context.getDrawable(R.drawable.iwqk_less);
        if (drawable == null) {
            return null;
        }
        drawable.setTint(liveTogglesContainer.getGreen());
        return drawable;
    }

    public static final Drawable b(Context context, LiveTogglesContainer liveTogglesContainer) {
        Drawable drawable = context.getDrawable(R.drawable.iwqk_more);
        if (drawable == null) {
            return null;
        }
        drawable.setTint(liveTogglesContainer.getGreen());
        return drawable;
    }

    public static final void c(AppCompatCheckBox appCompatCheckBox, LiveTogglesContainer liveTogglesContainer, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        appCompatCheckBox.setButtonDrawable(z ? liveTogglesContainer.getArrowDown() : liveTogglesContainer.getArrowRight());
        sus susVar = liveTogglesContainer.toggleContainerListener;
        if (susVar != null) {
            susVar.a();
        }
    }

    private final Drawable getArrowDisable() {
        return (Drawable) this.f.getValue();
    }

    private final Drawable getArrowDown() {
        return (Drawable) this.d.getValue();
    }

    private final Drawable getArrowRight() {
        return (Drawable) this.e.getValue();
    }

    private final int getGreen() {
        return ((Number) this.b.getValue()).intValue();
    }

    private final int getWhite() {
        return ((Number) this.c.getValue()).intValue();
    }

    public final void d(int i) {
        kts ktsVar = this.a;
        ktsVar.d.setText(String.valueOf(i));
        ktsVar.d.setTextColor(i > 0 ? getGreen() : getWhite());
        AppCompatCheckBox appCompatCheckBox = ktsVar.e;
        if (i > 0) {
            appCompatCheckBox.setEnabled(true);
            appCompatCheckBox.setButtonDrawable(appCompatCheckBox.isChecked() ? getArrowDown() : getArrowRight());
        } else {
            appCompatCheckBox.setEnabled(false);
            appCompatCheckBox.setChecked(false);
            appCompatCheckBox.setButtonDrawable(getArrowDisable());
        }
    }

    public final sus getToggleContainerListener() {
        return this.toggleContainerListener;
    }

    public final void setLiveBettingChecked(boolean isCheck) {
        this.a.e.setChecked(isCheck);
    }

    public final void setLiveBettingVisible(boolean isVisible) {
        kts ktsVar = this.a;
        ktsVar.c.setVisibility(isVisible ? 0 : 8);
        ktsVar.f.setVisibility(isVisible ? 0 : 8);
    }

    public final void setToggleContainerListener(sus susVar) {
        this.toggleContainerListener = susVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveTogglesContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveTogglesContainer(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ LiveTogglesContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
