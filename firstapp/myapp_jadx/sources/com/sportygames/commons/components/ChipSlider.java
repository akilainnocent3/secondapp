package com.sportygames.commons.components;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import defpackage.jk2;
import defpackage.pw;
import defpackage.th50;
import defpackage.tk30;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013JS\u0010\u001a\u001a\u00020\f2\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u00142\u0014\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\f0\u00172\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\f0\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\"\u0010$\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010+\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'¨\u0006,"}, d2 = {"Lcom/sportygames/commons/components/ChipSlider;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "minAmount", "maxAmount", "betAmount", "", "setConfiguration", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "betChipList", "setBetAmount", "(DLjava/util/ArrayList;)V", "Lkotlin/Function2;", "", "onProgressChanged", "Lkotlin/Function1;", "onStartTrackingTouch", "onStopTrackingTouch", "setAmountChangeListener", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "setSeekMax", "()V", "", "drawable", "setTooltipColor", "(I)V", "v", "Z", "isListenerEnable", "()Z", "setListenerEnable", "(Z)V", "y", "getEnable", "setEnable", "enable", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChipSlider extends LinearLayout {
    public final SeekBar a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final ViewGroup.MarginLayoutParams e;
    public Double f;
    public final ArrayList<Double> i;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean isListenerEnable;
    public final DecimalFormat w;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public boolean enable;

    public static final class a implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ Function2<Double, Boolean, Unit> b;
        public final /* synthetic */ Function1<Double, Unit> c;
        public final /* synthetic */ Function1<Double, Unit> d;

        /* JADX INFO: renamed from: com.sportygames.commons.components.ChipSlider$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0436a implements Animation.AnimationListener {
            public final /* synthetic */ ChipSlider a;

            public AnimationAnimationListenerC0436a(ChipSlider chipSlider) {
                this.a = chipSlider;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                this.a.d.setVisibility(0);
            }
        }

        public static final class b implements Animation.AnimationListener {
            public final /* synthetic */ ChipSlider a;

            public b(ChipSlider chipSlider) {
                this.a = chipSlider;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                this.a.d.setVisibility(4);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                this.a.d.setVisibility(0);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super Double, ? super Boolean, Unit> function2, Function1<? super Double, Unit> function1, Function1<? super Double, Unit> function3) {
            this.b = function2;
            this.c = function1;
            this.d = function3;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            Double dA;
            ChipSlider chipSlider = ChipSlider.this;
            if (!chipSlider.getEnable() || (dA = chipSlider.a(Integer.valueOf(i))) == null) {
                return;
            }
            double dDoubleValue = dA.doubleValue();
            if (chipSlider.isListenerEnable) {
                this.b.invoke(Double.valueOf(dDoubleValue), Boolean.valueOf(z));
            }
            chipSlider.c(Double.valueOf(dDoubleValue));
            chipSlider.setListenerEnable(true);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            ChipSlider chipSlider = ChipSlider.this;
            if (chipSlider.getEnable()) {
                Double dA = chipSlider.a(seekBar != null ? Integer.valueOf(seekBar.getProgress()) : null);
                if (dA != null) {
                    double dDoubleValue = dA.doubleValue();
                    chipSlider.setListenerEnable(true);
                    this.c.invoke(Double.valueOf(dDoubleValue));
                    chipSlider.c(Double.valueOf(dDoubleValue));
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(chipSlider.getContext(), R.anim.sg_fade_in_tooltip);
                    chipSlider.d.startAnimation(animationLoadAnimation);
                    animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC0436a(chipSlider));
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            Integer numValueOf = seekBar != null ? Integer.valueOf(seekBar.getProgress()) : null;
            ChipSlider chipSlider = ChipSlider.this;
            Double dA = chipSlider.a(numValueOf);
            if (dA != null) {
                double dDoubleValue = dA.doubleValue();
                chipSlider.setListenerEnable(true);
                this.d.invoke(Double.valueOf(dDoubleValue));
                chipSlider.c(Double.valueOf(dDoubleValue));
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(chipSlider.getContext(), R.anim.sg_fade_out_tooltip);
                chipSlider.d.startAnimation(animationLoadAnimation);
                animationLoadAnimation.setAnimationListener(new b(chipSlider));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.i = new ArrayList<>();
        this.isListenerEnable = true;
        DecimalFormat decimalFormat = new DecimalFormat();
        this.w = decimalFormat;
        this.enable = true;
        View.inflate(context, R.layout.sg_betchip_slider, this);
        decimalFormat.setMaximumFractionDigits(2);
        decimalFormat.setDecimalFormatSymbols(SportyGamesManager.decimalFormatSymbols);
        View viewFindViewById = findViewById(R.id.seekbar);
        viewFindViewById.getClass();
        SeekBar seekBar = (SeekBar) viewFindViewById;
        this.a = seekBar;
        View viewFindViewById2 = findViewById(R.id.min_seek_bar);
        viewFindViewById2.getClass();
        this.b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.max_seek_bar);
        viewFindViewById3.getClass();
        this.c = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tooltip_seekbar);
        viewFindViewById4.getClass();
        TextView textView = (TextView) viewFindViewById4;
        this.d = textView;
        ViewGroup.LayoutParams layoutParams = seekBar.getLayoutParams();
        layoutParams.getClass();
        this.e = (ViewGroup.MarginLayoutParams) layoutParams;
        textView.setVisibility(4);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.b);
        typedArrayObtainStyledAttributes.getClass();
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = getResources();
            ThreadLocal<TypedValue> threadLocal = th50.a;
            seekBar.setProgressDrawable(resources.getDrawable(resourceId, null));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Double a(Integer num) {
        if (num == null) {
            return null;
        }
        ArrayList<Double> arrayList = this.i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.get(num.intValue());
    }

    public final void b(boolean z) {
        this.enable = z;
        SeekBar seekBar = this.a;
        seekBar.setClickable(z);
        seekBar.setFocusable(z);
        seekBar.setEnabled(z);
    }

    public final void c(Double d) {
        ArrayList<Double> arrayList = this.i;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        String str = Double.valueOf(d.doubleValue() % 1.0d).equals(Double.valueOf(0.0d)) ? String.format(SportyGamesManager.locale, "%.0f", Arrays.copyOf(new Object[]{d}, 1)) : String.format(SportyGamesManager.locale, "%.2f", Arrays.copyOf(new Object[]{d}, 1));
        TextView textView = this.d;
        textView.setText(str);
        int width = textView.getWidth();
        int i = this.e.leftMargin;
        SeekBar seekBar = this.a;
        textView.setX(this.b.getWidth() + (((seekBar.getPaddingLeft() + i) + seekBar.getThumb().getBounds().left) - (width / 2)));
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final void setAmountChangeListener(Function2<? super Double, ? super Boolean, Unit> onProgressChanged, Function1<? super Double, Unit> onStartTrackingTouch, Function1<? super Double, Unit> onStopTrackingTouch) {
        onProgressChanged.getClass();
        onStartTrackingTouch.getClass();
        onStopTrackingTouch.getClass();
        this.a.setOnSeekBarChangeListener(new a(onProgressChanged, onStartTrackingTouch, onStopTrackingTouch));
    }

    public final void setBetAmount(double betAmount, ArrayList<Double> betChipList) {
        Double d;
        ArrayList<Double> arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                d = null;
                break;
            } else {
                d = arrayList.get(i);
                i++;
            }
        } while (betAmount > d.doubleValue());
        Double d2 = d;
        if (betChipList != null) {
            int iIndexOf = arrayList.indexOf(d2);
            Integer num = jk2.b.get(jk2.a(betAmount, betChipList));
            Resources resources = getContext().getResources();
            ThreadLocal<TypedValue> threadLocal = th50.a;
            Drawable drawable = resources.getDrawable(R.drawable.seekbar_thumb_image, null);
            drawable.getClass();
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            SeekBar seekBar = this.a;
            if (num != null) {
                layerDrawable.setDrawableByLayerId(R.id.chip_thumb_item, getContext().getDrawable(num.intValue()));
                layerDrawable.invalidateSelf();
                seekBar.setThumb(layerDrawable);
            }
            this.isListenerEnable = false;
            Double d3 = this.f;
            if (betAmount > (d3 != null ? d3.doubleValue() : 0.0d)) {
                seekBar.setProgress(100);
            } else {
                seekBar.setProgress(iIndexOf);
            }
        }
    }

    public final void setConfiguration(Double minAmount, Double maxAmount, Double betAmount) {
        Double dValueOf = Double.valueOf(0.0d);
        TextView textView = this.c;
        TextView textView2 = this.b;
        if (minAmount == null || maxAmount == null) {
            textView2.setText("...");
            textView.setText("...");
            return;
        }
        boolean zEquals = Double.valueOf(minAmount.doubleValue() % 1.0d).equals(dValueOf);
        DecimalFormat decimalFormat = this.w;
        if (zEquals || minAmount.doubleValue() > 1000.0d) {
            TreeMap treeMap = pw.a;
            textView2.setText(pw.h((long) minAmount.doubleValue()));
        } else {
            textView2.setText(decimalFormat.format(minAmount.doubleValue()));
        }
        if (Double.valueOf(maxAmount.doubleValue() % 1.0d).equals(dValueOf) || maxAmount.doubleValue() > 1000.0d) {
            TreeMap treeMap2 = pw.a;
            textView.setText(pw.h((long) maxAmount.doubleValue()));
        } else {
            textView.setText(decimalFormat.format(maxAmount.doubleValue()));
        }
        this.f = maxAmount;
        if (betAmount == null) {
            return;
        }
        ArrayList<Double> arrayList = this.i;
        arrayList.clear();
        Map<Double, String> map = jk2.a;
        double dDoubleValue = minAmount.doubleValue();
        double dDoubleValue2 = maxAmount.doubleValue();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        double d = (dDoubleValue2 - dDoubleValue) / 100.0d;
        linkedHashSet.add(minAmount);
        linkedHashSet.add(maxAmount);
        linkedHashSet.add(betAmount);
        for (int i = 0; i < 100; i++) {
            double d2 = (((((double) i) * d) + dDoubleValue) / 5.0d) * 5.0d;
            if (d2 > dDoubleValue && d2 < dDoubleValue2) {
                linkedHashSet.add(Double.valueOf(d2));
            }
        }
        arrayList.addAll(CollectionsKt.q0(CollectionsKt.A0(linkedHashSet)));
        int i2 = Build.VERSION.SDK_INT;
        SeekBar seekBar = this.a;
        if (i2 >= 26) {
            seekBar.setMin(0);
        }
        seekBar.setMax(arrayList.size() - 1);
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setListenerEnable(boolean z) {
        this.isListenerEnable = z;
    }

    public final void setSeekMax() {
        Double d = this.f;
        this.a.setProgress(d != null ? (int) d.doubleValue() : 0);
    }

    public final void setTooltipColor(int drawable) {
        Drawable drawable2 = getContext().getDrawable(drawable);
        TextView textView = this.d;
        textView.setBackground(drawable2);
        textView.setPadding(12, 12, 12, 12);
    }
}
