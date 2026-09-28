package com.sportybet.feature.payment.impl.common.presentation.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.sportybet.android.gp.tz.R;
import defpackage.oy0;
import defpackage.sn5;
import defpackage.uhc;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sportybet/feature/payment/impl/common/presentation/widget/AssetLabelTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AssetLabelTextView extends AppCompatTextView {
    public Integer A;
    public Integer B;
    public Integer v;
    public Integer w;
    public Integer y;
    public Integer z;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[oy0.values().length];
            try {
                oy0 oy0Var = oy0.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                oy0 oy0Var2 = oy0.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                oy0 oy0Var3 = oy0.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                oy0 oy0Var4 = oy0.a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                oy0 oy0Var5 = oy0.a;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                oy0 oy0Var6 = oy0.a;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssetLabelTextView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public final void g() {
        Integer num = this.w;
        if (num != null) {
            setBackgroundResource(num.intValue());
        }
        Integer num2 = this.y;
        if (num2 != null) {
            setTextColor(getContext().getColor(num2.intValue()));
        }
        Integer num3 = this.A;
        if (num3 != null) {
            Drawable drawable = getContext().getDrawable(num3.intValue());
            if (drawable != null) {
                Integer num4 = this.B;
                if (num4 != null) {
                    drawable.setTint(getContext().getColor(num4.intValue()));
                }
                setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            }
        }
        Integer num5 = this.z;
        if (num5 != null) {
            setTextAppearance(getContext(), num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            setText(sn5.c(this, num6.intValue(), new Object[0]));
        }
    }

    public final void h(boolean z) {
        Integer numValueOf = Integer.valueOf(R.style.C1_R);
        if (z) {
            this.w = Integer.valueOf(R.drawable.border_tertiary_b1_r2);
            this.y = Integer.valueOf(R.color.text_type1_primary);
            this.z = numValueOf;
        } else {
            this.w = Integer.valueOf(R.drawable.border_secondary_b1_r2);
            this.y = Integer.valueOf(R.color.text_disable_type1_primary);
            this.z = numValueOf;
        }
    }

    public final void i(oy0 oy0Var) {
        Integer numValueOf = Integer.valueOf(R.drawable.icon_arrow1_right);
        Integer numValueOf2 = Integer.valueOf(R.style.B2_M);
        Integer numValueOf3 = Integer.valueOf(R.color.brand_secondary);
        switch (a.a[oy0Var.ordinal()]) {
            case -1:
                setVisibility(8);
                break;
            case 0:
            default:
                uhc.a();
                break;
            case 1:
                h(true);
                this.v = Integer.valueOf(R.string.common_functions__default);
                g();
                setVisibility(0);
                break;
            case 2:
                h(false);
                this.v = Integer.valueOf(R.string.common_functions__unsupported);
                g();
                setVisibility(0);
                break;
            case 3:
                h(false);
                this.v = Integer.valueOf(R.string.gift__expired);
                g();
                setVisibility(0);
                break;
            case 4:
                this.w = Integer.valueOf(R.drawable.border_secondary_b1_r2);
                this.y = Integer.valueOf(R.color.text_type1_secondary);
                this.z = Integer.valueOf(R.style.C1_R);
                this.v = Integer.valueOf(R.string.common_functions__in_review);
                g();
                setVisibility(0);
                break;
            case 5:
                this.y = numValueOf3;
                this.z = numValueOf2;
                this.v = Integer.valueOf(R.string.common_functions__verify);
                this.A = numValueOf;
                this.B = numValueOf3;
                g();
                setVisibility(0);
                break;
            case 6:
                this.y = numValueOf3;
                this.z = numValueOf2;
                this.v = Integer.valueOf(R.string.common_functions__re_submit);
                this.A = numValueOf;
                this.B = numValueOf3;
                g();
                setVisibility(0);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssetLabelTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetLabelTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    public /* synthetic */ AssetLabelTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
