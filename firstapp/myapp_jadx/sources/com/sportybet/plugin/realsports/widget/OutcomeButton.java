package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatToggleButton;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import defpackage.b8z;
import defpackage.fae;
import defpackage.g9i0;
import defpackage.gky;
import defpackage.gr0;
import defpackage.hwr;
import defpackage.inm;
import defpackage.itf0;
import defpackage.iu2;
import defpackage.ku1;
import defpackage.mpe0;
import defpackage.q5n;
import defpackage.r6i0;
import defpackage.t5n;
import defpackage.zch0;
import defpackage.zi50;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0013J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0013J!\u0010\u001d\u001a\u00020\f2\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"R\u001c\u0010'\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b#\u0010$\u0012\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/sportybet/plugin/realsports/widget/OutcomeButton;", "Landroidx/appcompat/widget/AppCompatToggleButton;", "Ljava/lang/Runnable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "", "activated", "", "setActivated", "(Z)V", "setForceActivated", "", "textOn", "setTextOn", "(Ljava/lang/CharSequence;)V", "textOff", "setTextOff", "text", "setTextOnAndOff", "odds", "setOdds", "", "resId", "matchImageWithTextColor", "setImage", "(IZ)V", "boostedOdds", "oldOdds", "setBoostedOdds", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "w", "I", "getOddsFlag$annotations", "()V", "oddsFlag", "", "F", "Lttr;", "getBaseTextSizePx", "()F", "baseTextSizePx", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OutcomeButton extends AppCompatToggleButton implements Runnable {
    public static final /* synthetic */ int H = 0;
    public q5n A;
    public FlashBoostBadgeView B;
    public Drawable C;
    public boolean D;
    public boolean E;
    public final mpe0 F;
    public boolean G;
    public final int d;
    public final int e;
    public Drawable f;
    public boolean i;
    public final int v;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public int oddsFlag;
    public final Drawable y;
    public final Drawable z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.v = zch0.a(getContext(), 24);
        this.F = hwr.b(new b8z(this, 0));
        setGravity(17);
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.l(this, 0.0f);
        setStateListAnimator(null);
        setMinHeight(0);
        setMinimumHeight(0);
        this.d = getResources().getDimensionPixelSize(R.dimen.spr_odds_change_arrow_size);
        this.e = getResources().getDimensionPixelSize(R.dimen.spr_odds_change_arrow_padding);
        setTransformationMethod(null);
        Drawable drawableA = gr0.a(getContext(), R.drawable.spr_ic_arrow_upward_black_24dp);
        this.y = drawableA != null ? drawableA.mutate() : null;
        Drawable drawableA2 = gr0.a(getContext(), R.drawable.spr_ic_arrow_downward_black_24dp);
        this.z = drawableA2 != null ? drawableA2.mutate() : null;
    }

    private final float getBaseTextSizePx() {
        return ((Number) this.F.getValue()).floatValue();
    }

    private static /* synthetic */ void getOddsFlag$annotations() {
    }

    public static /* synthetic */ void setImage$default(OutcomeButton outcomeButton, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        outcomeButton.setImage(i, z);
    }

    public final void a() {
        this.oddsFlag = 0;
        b();
        e();
        removeCallbacks(this);
    }

    public final void b() {
        q5n q5nVar = this.A;
        if (q5nVar != null) {
            q5nVar.a();
        }
        this.A = null;
        e();
    }

    public final void c() {
        this.oddsFlag = 2;
        invalidate();
        removeCallbacks(this);
        postDelayed(this, 5000L);
    }

    public final void d() {
        Object bVar;
        Object tag = getTag();
        Selection selection = tag instanceof Selection ? (Selection) tag : null;
        if (selection == null) {
            return;
        }
        try {
            zi50.a aVar = zi50.b;
            Event event = selection.a;
            event.getClass();
            Market market = selection.b;
            market.getClass();
            Outcome outcome = selection.c;
            outcome.getClass();
            setChecked(iu2.n(event, market, outcome));
            bVar = Unit.a;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.d(inm.a("OutcomeButton - refreshCheckStatus: ", thA.getMessage()), new Object[0]);
        }
    }

    public final void e() {
        if (this.D) {
            setBackground(this.C);
            this.C = null;
            this.D = false;
            this.E = false;
        }
    }

    public final void f(ViewGroup viewGroup, ku1 ku1Var, boolean z) {
        FlashBoostBadgeView flashBoostBadgeView;
        q5n q5nVar = this.A;
        if (q5nVar != null && this.D && this.E == z) {
            FlashBoostBadgeView flashBoostBadgeView2 = q5nVar.b;
            if (flashBoostBadgeView2 != null) {
                flashBoostBadgeView2.setVisibility(0);
                return;
            }
            return;
        }
        if (q5nVar != null) {
            q5nVar.a();
        }
        this.E = z;
        if (!this.D) {
            this.C = getBackground();
            this.D = true;
        }
        setBackgroundResource(z ? R.drawable.bg_outcome_boosted_selector_dark : R.drawable.bg_outcome_boosted_selector);
        FlashBoostBadgeView flashBoostBadgeView3 = this.B;
        if (flashBoostBadgeView3 == null) {
            int i = FlashBoostBadgeView.b;
            Context context = getContext();
            context.getClass();
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_flash_boost_badge, viewGroup, false);
            viewInflate.getClass();
            flashBoostBadgeView3 = (FlashBoostBadgeView) viewInflate;
            this.B = flashBoostBadgeView3;
        }
        flashBoostBadgeView3.a(ku1Var, z);
        q5n q5nVarA = t5n.a(this, flashBoostBadgeView3, viewGroup, ku1Var);
        this.A = q5nVarA;
        if (q5nVarA == null || (flashBoostBadgeView = q5nVarA.b) == null) {
            return;
        }
        flashBoostBadgeView.setVisibility(0);
    }

    public final void g() {
        this.oddsFlag = 1;
        invalidate();
        removeCallbacks(this);
        postDelayed(this, 5000L);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        int paddingLeft;
        int i;
        int paddingLeft2;
        int paddingTop;
        int i2;
        int paddingTop2;
        canvas.getClass();
        super.onDraw(canvas);
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            if (this.i) {
                drawable2.setTint(getCurrentTextColor());
            }
            int gravity = getGravity() & 112;
            int gravity2 = getGravity() & 7;
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int i3 = this.v;
            if (gravity2 != 1) {
                if (gravity2 == 3) {
                    paddingLeft2 = getPaddingLeft();
                } else if (gravity2 != 5) {
                    paddingLeft = getPaddingLeft();
                    i = (width - i3) / 2;
                } else {
                    paddingLeft2 = (getWidth() - getPaddingRight()) - i3;
                }
                if (gravity != 16) {
                    if (gravity != 48) {
                        paddingTop2 = getPaddingTop();
                    } else if (gravity != 80) {
                        paddingTop = getPaddingTop();
                        i2 = (height - i3) / 2;
                    } else {
                        paddingTop2 = (getHeight() - getPaddingBottom()) - i3;
                    }
                    drawable2.setBounds(paddingLeft2, paddingTop2, paddingLeft2 + i3, i3 + paddingTop2);
                    drawable2.draw(canvas);
                } else {
                    paddingTop = getPaddingTop();
                    i2 = (height - i3) / 2;
                }
                paddingTop2 = i2 + paddingTop;
                drawable2.setBounds(paddingLeft2, paddingTop2, paddingLeft2 + i3, i3 + paddingTop2);
                drawable2.draw(canvas);
            } else {
                paddingLeft = getPaddingLeft();
                i = (width - i3) / 2;
            }
            paddingLeft2 = i + paddingLeft;
            if (gravity != 16) {
                if (gravity != 48) {
                    paddingTop2 = getPaddingTop();
                } else if (gravity != 80) {
                    paddingTop = getPaddingTop();
                    i2 = (height - i3) / 2;
                } else {
                    paddingTop2 = (getHeight() - getPaddingBottom()) - i3;
                }
                drawable2.setBounds(paddingLeft2, paddingTop2, paddingLeft2 + i3, i3 + paddingTop2);
                drawable2.draw(canvas);
            } else {
                paddingTop = getPaddingTop();
                i2 = (height - i3) / 2;
            }
            paddingTop2 = i2 + paddingTop;
            drawable2.setBounds(paddingLeft2, paddingTop2, paddingLeft2 + i3, i3 + paddingTop2);
            drawable2.draw(canvas);
        }
        if (isEnabled()) {
            int i4 = this.oddsFlag;
            if (i4 != 1) {
                drawable = i4 != 2 ? null : this.z;
            } else {
                drawable = this.y;
            }
            if (drawable != null) {
                drawable.setTint(getCurrentTextColor());
                int i5 = this.d;
                drawable.setBounds(0, 0, i5, i5);
                int iSave = canvas.save();
                try {
                    int i6 = this.oddsFlag;
                    int i7 = this.e;
                    if (i6 == 1) {
                        canvas.translate((canvas.getWidth() - i5) - i7, i7);
                    } else {
                        canvas.translate((canvas.getWidth() - i5) - i7, (canvas.getHeight() - i5) - i7);
                    }
                    drawable.draw(canvas);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.oddsFlag = 0;
        invalidate();
    }

    @Override // android.view.View
    public void setActivated(boolean activated) {
        if (this.G) {
            return;
        }
        super.setActivated(activated);
    }

    public final void setBoostedOdds(CharSequence boostedOdds, CharSequence oldOdds) {
        boostedOdds.getClass();
        oldOdds.getClass();
        this.f = null;
        this.i = false;
        String strA = gky.a(boostedOdds.toString());
        String strA2 = gky.a(oldOdds.toString());
        int color = getContext().getColor(R.color.text_inverse_secondary);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strA);
        spannableStringBuilder.append('\n');
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) strA2);
        spannableStringBuilder.setSpan(new StrikethroughSpan(), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(color), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(R.dimen.flash_boost_old_odds_text_size)), length, spannableStringBuilder.length(), 33);
        setMaxLines(2);
        super.setTextOn(spannableStringBuilder);
        super.setTextOff(spannableStringBuilder);
        setText(spannableStringBuilder);
    }

    public final void setForceActivated(boolean activated) {
        super.setActivated(activated);
    }

    public final void setImage(int resId, boolean matchImageWithTextColor) {
        b();
        e();
        Drawable drawableA = gr0.a(getContext(), resId);
        this.f = drawableA != null ? drawableA.mutate() : null;
        this.i = matchImageWithTextColor;
        super.setTextOn("");
        super.setTextOff("");
    }

    public final void setOdds(CharSequence odds) {
        odds.getClass();
        b();
        e();
        this.f = null;
        if (Build.VERSION.SDK_INT >= 26) {
            setMaxLines(1);
            int baseTextSizePx = (int) getBaseTextSizePx();
            int i = baseTextSizePx - 4;
            if (i < 8) {
                i = 8;
            }
            if (baseTextSizePx > i) {
                setAutoSizeTextTypeUniformWithConfiguration(i, baseTextSizePx, 1, 0);
            }
        }
        String strA = gky.a(odds.toString());
        super.setTextOn(strA);
        super.setTextOff(strA);
    }

    @Override // android.widget.ToggleButton
    @fae
    public void setTextOff(CharSequence textOff) {
        super.setTextOff(textOff);
    }

    @Override // android.widget.ToggleButton
    @fae
    public void setTextOn(CharSequence textOn) {
        super.setTextOn(textOn);
    }

    public final void setTextOnAndOff(CharSequence text) {
        b();
        e();
        this.f = null;
        super.setTextOn(text);
        super.setTextOff(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeButton(Context context) {
        super(context);
        context.getClass();
        this.v = zch0.a(getContext(), 24);
        this.F = hwr.b(new b8z(this, 0));
        setGravity(17);
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.l(this, 0.0f);
        setStateListAnimator(null);
        setMinHeight(0);
        setMinimumHeight(0);
        this.d = getResources().getDimensionPixelSize(R.dimen.spr_odds_change_arrow_size);
        this.e = getResources().getDimensionPixelSize(R.dimen.spr_odds_change_arrow_padding);
        setTransformationMethod(null);
        Drawable drawableA = gr0.a(getContext(), R.drawable.spr_ic_arrow_upward_black_24dp);
        this.y = drawableA != null ? drawableA.mutate() : null;
        Drawable drawableA2 = gr0.a(getContext(), R.drawable.spr_ic_arrow_downward_black_24dp);
        this.z = drawableA2 != null ? drawableA2.mutate() : null;
    }
}
