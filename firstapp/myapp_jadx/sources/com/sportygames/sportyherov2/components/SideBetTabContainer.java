package com.sportygames.sportyherov2.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.utils.LineAnimationView;
import defpackage.bmy;
import defpackage.fse;
import defpackage.gku;
import defpackage.h5e;
import defpackage.j1b;
import defpackage.kfe0;
import defpackage.lfe0;
import defpackage.op5;
import defpackage.pfd;
import defpackage.rs80;
import defpackage.w5b;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/sportygames/sportyherov2/components/SideBetTabContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "isVip", "showVipBorder", "", "setDividerColor", "(ZZ)V", "setBg", "setCountFont", "(Z)V", "Lrs80;", "a", "Lrs80;", "getBinding", "()Lrs80;", "setBinding", "(Lrs80;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SideBetTabContainer extends LinearLayout {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public rs80 binding;
    public final j1b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SideBetTabContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sh_categories_tab_v2, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.clasic_button;
        TextView textView = (TextView) h5e.a(R.id.clasic_button, viewInflate);
        if (textView != null) {
            i = R.id.classic_bet_count;
            TextView textView2 = (TextView) h5e.a(R.id.classic_bet_count, viewInflate);
            if (textView2 != null) {
                i = R.id.classic_glow;
                ImageView imageView = (ImageView) h5e.a(R.id.classic_glow, viewInflate);
                if (imageView != null) {
                    i = R.id.classic_line;
                    LineAnimationView lineAnimationView = (LineAnimationView) h5e.a(R.id.classic_line, viewInflate);
                    if (lineAnimationView != null) {
                        i = R.id.classic_tab;
                        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.classic_tab, viewInflate);
                        if (constraintLayout != null) {
                            i = R.id.divider_1;
                            View viewA = h5e.a(R.id.divider_1, viewInflate);
                            if (viewA != null) {
                                i = R.id.divider_2;
                                View viewA2 = h5e.a(R.id.divider_2, viewInflate);
                                if (viewA2 != null) {
                                    i = R.id.ou_bet_count;
                                    TextView textView3 = (TextView) h5e.a(R.id.ou_bet_count, viewInflate);
                                    if (textView3 != null) {
                                        i = R.id.ou_button;
                                        TextView textView4 = (TextView) h5e.a(R.id.ou_button, viewInflate);
                                        if (textView4 != null) {
                                            i = R.id.ou_glow;
                                            ImageView imageView2 = (ImageView) h5e.a(R.id.ou_glow, viewInflate);
                                            if (imageView2 != null) {
                                                i = R.id.ou_line;
                                                LineAnimationView lineAnimationView2 = (LineAnimationView) h5e.a(R.id.ou_line, viewInflate);
                                                if (lineAnimationView2 != null) {
                                                    i = R.id.ou_tab;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.ou_tab, viewInflate);
                                                    if (constraintLayout2 != null) {
                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate;
                                                        i = R.id.range_bet_count;
                                                        TextView textView5 = (TextView) h5e.a(R.id.range_bet_count, viewInflate);
                                                        if (textView5 != null) {
                                                            i = R.id.range_button;
                                                            TextView textView6 = (TextView) h5e.a(R.id.range_button, viewInflate);
                                                            if (textView6 != null) {
                                                                i = R.id.range_glow;
                                                                ImageView imageView3 = (ImageView) h5e.a(R.id.range_glow, viewInflate);
                                                                if (imageView3 != null) {
                                                                    i = R.id.range_line;
                                                                    LineAnimationView lineAnimationView3 = (LineAnimationView) h5e.a(R.id.range_line, viewInflate);
                                                                    if (lineAnimationView3 != null) {
                                                                        i = R.id.range_tab;
                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.range_tab, viewInflate);
                                                                        if (constraintLayout4 != null) {
                                                                            this.binding = new rs80(constraintLayout3, textView, textView2, imageView, lineAnimationView, constraintLayout, viewA, viewA2, textView3, textView4, imageView2, lineAnimationView2, constraintLayout2, constraintLayout3, textView5, textView6, imageView3, lineAnimationView3, constraintLayout4);
                                                                            kfe0 kfe0VarA = lfe0.a();
                                                                            pfd pfdVar = fse.a;
                                                                            this.b = w5b.a(CoroutineContext.Element.a.d(kfe0VarA, gku.a));
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
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void a() {
        op5 op5Var = op5.a;
        rs80 rs80Var = this.binding;
        op5.r(op5Var, b.f(rs80Var != null ? rs80Var.b : null, rs80Var != null ? rs80Var.y : null, rs80Var != null ? rs80Var.E : null), null, 6);
    }

    public final void b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (z4 && z5) {
            rs80 rs80Var = this.binding;
            if (rs80Var != null) {
                rs80Var.d.setImageResource(R.drawable.sb_glow_vip);
            }
            rs80 rs80Var2 = this.binding;
            if (rs80Var2 != null) {
                rs80Var2.z.setImageResource(R.drawable.sb_glow_vip);
            }
            rs80 rs80Var3 = this.binding;
            if (rs80Var3 != null) {
                rs80Var3.F.setImageResource(R.drawable.sb_glow_vip);
            }
            rs80 rs80Var4 = this.binding;
            if (rs80Var4 != null) {
                rs80Var4.d.setScaleX(1.3f);
            }
            rs80 rs80Var5 = this.binding;
            if (rs80Var5 != null) {
                rs80Var5.z.setScaleX(1.1f);
            }
            rs80 rs80Var6 = this.binding;
            if (rs80Var6 != null) {
                rs80Var6.F.setScaleX(1.3f);
            }
        } else {
            rs80 rs80Var7 = this.binding;
            if (rs80Var7 != null) {
                rs80Var7.d.setImageResource(R.drawable.sb_glow);
            }
            rs80 rs80Var8 = this.binding;
            if (rs80Var8 != null) {
                rs80Var8.z.setImageResource(R.drawable.sb_glow);
            }
            rs80 rs80Var9 = this.binding;
            if (rs80Var9 != null) {
                rs80Var9.F.setImageResource(R.drawable.sb_glow);
            }
            rs80 rs80Var10 = this.binding;
            if (rs80Var10 != null) {
                rs80Var10.d.setScaleX(1.5f);
            }
            rs80 rs80Var11 = this.binding;
            if (rs80Var11 != null) {
                rs80Var11.z.setScaleX(1.5f);
            }
            rs80 rs80Var12 = this.binding;
            if (rs80Var12 != null) {
                rs80Var12.F.setScaleX(1.5f);
            }
        }
        rs80 rs80Var13 = this.binding;
        if (rs80Var13 != null) {
            rs80Var13.d.setVisibility(z ? 0 : 8);
        }
        rs80 rs80Var14 = this.binding;
        if (rs80Var14 != null) {
            rs80Var14.z.setVisibility(z2 ? 0 : 8);
        }
        rs80 rs80Var15 = this.binding;
        if (rs80Var15 != null) {
            rs80Var15.F.setVisibility(z3 ? 0 : 8);
        }
    }

    public final rs80 getBinding() {
        return this.binding;
    }

    public final void setBg(boolean isVip, boolean showVipBorder) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        if (getContext() != null) {
            if (isVip && showVipBorder) {
                rs80 rs80Var = this.binding;
                if (rs80Var == null || (constraintLayout2 = rs80Var.C) == null) {
                    return;
                }
                constraintLayout2.setBackground(null);
                return;
            }
            rs80 rs80Var2 = this.binding;
            if (rs80Var2 == null || (constraintLayout = rs80Var2.C) == null) {
                return;
            }
            constraintLayout.setBackgroundResource(R.drawable.sh_sidebet_bg);
        }
    }

    public final void setBinding(rs80 rs80Var) {
        this.binding = rs80Var;
    }

    public final void setCountFont(boolean isVip) {
        if (getContext() != null) {
            rs80 rs80Var = this.binding;
            if (isVip) {
                if (rs80Var != null) {
                    rs80Var.w.setTextSize(0, getResources().getDimension(R.dimen._5ssp));
                }
                rs80 rs80Var2 = this.binding;
                if (rs80Var2 != null) {
                    rs80Var2.D.setTextSize(0, getResources().getDimension(R.dimen._5ssp));
                    return;
                }
                return;
            }
            if (rs80Var != null) {
                rs80Var.w.setTextSize(0, getResources().getDimension(R.dimen._9ssp));
            }
            rs80 rs80Var3 = this.binding;
            if (rs80Var3 != null) {
                rs80Var3.D.setTextSize(0, getResources().getDimension(R.dimen._9ssp));
            }
        }
    }

    public final void setDividerColor(boolean isVip, boolean showVipBorder) {
        Context context = getContext();
        if (context != null) {
            if (isVip && showVipBorder) {
                rs80 rs80Var = this.binding;
                if (rs80Var != null) {
                    rs80Var.i.setBackgroundColor(context.getColor(R.color.color_927112));
                }
                rs80 rs80Var2 = this.binding;
                if (rs80Var2 != null) {
                    rs80Var2.v.setBackgroundColor(context.getColor(R.color.color_927112));
                    return;
                }
                return;
            }
            rs80 rs80Var3 = this.binding;
            if (rs80Var3 != null) {
                rs80Var3.i.setBackgroundColor(context.getColor(R.color.color_CCCCCC));
            }
            rs80 rs80Var4 = this.binding;
            if (rs80Var4 != null) {
                rs80Var4.v.setBackgroundColor(context.getColor(R.color.color_CCCCCC));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SideBetTabContainer(Context context) {
        this(context, null);
        context.getClass();
    }
}
