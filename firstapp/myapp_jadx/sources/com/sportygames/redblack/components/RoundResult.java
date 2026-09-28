package com.sportygames.redblack.components;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.gp.tz.R;
import com.sportygames.redblack.remote.models.PlaceBetResponse;
import com.sportygames.redblack.remote.models.enums.BetCardDecision;
import defpackage.bmy;
import defpackage.c0d;
import defpackage.ej5;
import defpackage.fse;
import defpackage.gku;
import defpackage.h5e;
import defpackage.hu1;
import defpackage.op5;
import defpackage.pfd;
import defpackage.pw;
import defpackage.tje0;
import defpackage.tug;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.w5b;
import defpackage.yo40;
import java.util.HashMap;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/sportygames/redblack/components/RoundResult;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lyo40;", "a", "Lyo40;", "getBinding", "()Lyo40;", "setBinding", "(Lyo40;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RoundResult extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public yo40 binding;

    @c0d(c = "com.sportygames.redblack.components.RoundResult$showLost$1", f = "RoundResult.kt", l = {123, 128, 133}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ BetCardDecision b;
        public final /* synthetic */ RoundResult c;

        /* JADX INFO: renamed from: com.sportygames.redblack.components.RoundResult$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0445a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[BetCardDecision.values().length];
                try {
                    iArr[BetCardDecision.RED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BetCardDecision.BLACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BetCardDecision betCardDecision, RoundResult roundResult, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = betCardDecision;
            this.c = roundResult;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        
            if (r7 == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        
            if (r7 == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
        
            if (r7 == r0) goto L25;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r6.a
                r2 = 3
                r3 = 2
                r4 = 1
                com.sportygames.redblack.components.RoundResult r5 = r6.c
                if (r1 == 0) goto L24
                if (r1 == r4) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L15
                defpackage.uj50.b(r7)
                goto L52
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                r6 = 0
                return r6
            L1c:
                defpackage.uj50.b(r7)
                goto L72
            L20:
                defpackage.uj50.b(r7)
                goto L92
            L24:
                defpackage.uj50.b(r7)
                int[] r7 = com.sportygames.redblack.components.RoundResult.a.C0445a.a
                com.sportygames.redblack.remote.models.enums.BetCardDecision r1 = r6.b
                int r1 = r1.ordinal()
                r7 = r7[r1]
                if (r7 == r4) goto L75
                if (r7 == r3) goto L55
                s4u<java.lang.String, android.graphics.Bitmap> r7 = defpackage.r9n.a
                android.content.Context r7 = r5.getContext()
                android.content.Context r1 = r5.getContext()
                r3 = 2132020799(0x7f140e3f, float:1.9679971E38)
                java.lang.String r1 = r1.getString(r3)
                r1.getClass()
                r6.a = r2
                java.lang.Object r7 = defpackage.r9n.b(r7, r1, r6)
                if (r7 != r0) goto L52
                goto L91
            L52:
                android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
                goto L94
            L55:
                s4u<java.lang.String, android.graphics.Bitmap> r7 = defpackage.r9n.a
                android.content.Context r7 = r5.getContext()
                android.content.Context r1 = r5.getContext()
                r2 = 2132020797(0x7f140e3d, float:1.9679967E38)
                java.lang.String r1 = r1.getString(r2)
                r1.getClass()
                r6.a = r3
                java.lang.Object r7 = defpackage.r9n.b(r7, r1, r6)
                if (r7 != r0) goto L72
                goto L91
            L72:
                android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
                goto L94
            L75:
                s4u<java.lang.String, android.graphics.Bitmap> r7 = defpackage.r9n.a
                android.content.Context r7 = r5.getContext()
                android.content.Context r1 = r5.getContext()
                r2 = 2132020800(0x7f140e40, float:1.9679973E38)
                java.lang.String r1 = r1.getString(r2)
                r1.getClass()
                r6.a = r4
                java.lang.Object r7 = defpackage.r9n.b(r7, r1, r6)
                if (r7 != r0) goto L92
            L91:
                return r0
            L92:
                android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            L94:
                yo40 r6 = r5.getBinding()
                androidx.constraintlayout.widget.ConstraintLayout r6 = r6.v
                r6.setBackground(r7)
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportygames.redblack.components.RoundResult.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @c0d(c = "com.sportygames.redblack.components.RoundResult$showWin$1", f = "RoundResult.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 49}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ BetCardDecision b;
        public final /* synthetic */ RoundResult c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BetCardDecision betCardDecision, RoundResult roundResult, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = betCardDecision;
            this.c = roundResult;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            if (r6 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        
            if (r6 == r0) goto L18;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.a
                r2 = 2
                r3 = 1
                com.sportygames.redblack.components.RoundResult r4 = r5.c
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                defpackage.uj50.b(r6)
                goto L64
            L12:
                r5 = 0
                java.lang.String r5 = com.google.android.gms.recaptchabase.WnDZ.CaxEybC.BvWlSYZEHQic
                defpackage.ib5.a(r5)
                r5 = 0
                return r5
            L1a:
                defpackage.uj50.b(r6)
                goto L44
            L1e:
                defpackage.uj50.b(r6)
                com.sportygames.redblack.remote.models.enums.BetCardDecision r6 = r5.b
                com.sportygames.redblack.remote.models.enums.BetCardDecision r1 = com.sportygames.redblack.remote.models.enums.BetCardDecision.RED
                if (r6 != r1) goto L47
                s4u<java.lang.String, android.graphics.Bitmap> r6 = defpackage.r9n.a
                android.content.Context r6 = r4.getContext()
                android.content.Context r1 = r4.getContext()
                r2 = 2132020837(0x7f140e65, float:1.9680048E38)
                java.lang.String r1 = r1.getString(r2)
                r1.getClass()
                r5.a = r3
                java.lang.Object r6 = defpackage.r9n.b(r6, r1, r5)
                if (r6 != r0) goto L44
                goto L63
            L44:
                android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
                goto L66
            L47:
                s4u<java.lang.String, android.graphics.Bitmap> r6 = defpackage.r9n.a
                android.content.Context r6 = r4.getContext()
                android.content.Context r1 = r4.getContext()
                r3 = 2132020835(0x7f140e63, float:1.9680044E38)
                java.lang.String r1 = r1.getString(r3)
                r1.getClass()
                r5.a = r2
                java.lang.Object r6 = defpackage.r9n.b(r6, r1, r5)
                if (r6 != r0) goto L64
            L63:
                return r0
            L64:
                android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            L66:
                yo40 r5 = r4.getBinding()
                androidx.constraintlayout.widget.ConstraintLayout r5 = r5.v
                r5.setBackground(r6)
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportygames.redblack.components.RoundResult.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundResult(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.redblack_round_result, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.blank_view;
        View viewA = h5e.a(R.id.blank_view, viewInflate);
        if (viewA != null) {
            i = R.id.bottom_glow;
            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.bottom_glow, viewInflate);
            if (appCompatImageView != null) {
                i = R.id.gift_amount;
                TextView textView = (TextView) h5e.a(R.id.gift_amount, viewInflate);
                if (textView != null) {
                    i = R.id.gift_icon;
                    if (((AppCompatImageView) h5e.a(R.id.gift_icon, viewInflate)) != null) {
                        i = R.id.gift_minus_saperator_tv;
                        if (((TextView) h5e.a(R.id.gift_minus_saperator_tv, viewInflate)) != null) {
                            i = R.id.gift_round_detail;
                            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.gift_round_detail, viewInflate);
                            if (constraintLayout != null) {
                                i = R.id.message;
                                TextView textView2 = (TextView) h5e.a(R.id.message, viewInflate);
                                if (textView2 != null) {
                                    i = R.id.message_win;
                                    TextView textView3 = (TextView) h5e.a(R.id.message_win, viewInflate);
                                    if (textView3 != null) {
                                        i = R.id.redblack_result_big_box;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.redblack_result_big_box, viewInflate);
                                        if (constraintLayout2 != null) {
                                            i = R.id.result_card_name;
                                            TextView textView4 = (TextView) h5e.a(R.id.result_card_name, viewInflate);
                                            if (textView4 != null) {
                                                i = R.id.round_you_win_message;
                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.round_you_win_message, viewInflate);
                                                if (constraintLayout3 != null) {
                                                    i = R.id.space;
                                                    View viewA2 = h5e.a(R.id.space, viewInflate);
                                                    if (viewA2 != null) {
                                                        i = R.id.top_glow;
                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.top_glow, viewInflate);
                                                        if (appCompatImageView2 != null) {
                                                            i = R.id.total_win_amount;
                                                            TextView textView5 = (TextView) h5e.a(R.id.total_win_amount, viewInflate);
                                                            if (textView5 != null) {
                                                                i = R.id.total_win_icon;
                                                                if (((AppCompatImageView) h5e.a(R.id.total_win_icon, viewInflate)) != null) {
                                                                    i = R.id.view1;
                                                                    View viewA3 = h5e.a(R.id.view1, viewInflate);
                                                                    if (viewA3 != null) {
                                                                        i = R.id.view4;
                                                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.view4, viewInflate);
                                                                        if (appCompatImageView3 != null) {
                                                                            i = R.id.view6;
                                                                            if (((TextView) h5e.a(R.id.view6, viewInflate)) != null) {
                                                                                i = R.id.win_amount;
                                                                                TextView textView6 = (TextView) h5e.a(R.id.win_amount, viewInflate);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.win_trophy;
                                                                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.win_trophy, viewInflate);
                                                                                    if (appCompatImageView4 != null) {
                                                                                        this.binding = new yo40((ConstraintLayout) viewInflate, viewA, appCompatImageView, textView, constraintLayout, textView2, textView3, constraintLayout2, textView4, constraintLayout3, viewA2, appCompatImageView2, textView5, viewA3, appCompatImageView3, textView6, appCompatImageView4);
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
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void a(BetCardDecision betCardDecision, BetCardDecision betCardDecision2) {
        this.binding.C.setVisibility(0);
        this.binding.e.setVisibility(4);
        this.binding.z.setVisibility(0);
        this.binding.D.setVisibility(0);
        this.binding.b.setVisibility(0);
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new a(betCardDecision, this, null), 3);
        this.binding.F.setVisibility(8);
        this.binding.E.setVisibility(8);
        this.binding.A.setVisibility(8);
        this.binding.c.setVisibility(4);
        this.binding.c.clearAnimation();
        this.binding.A.clearAnimation();
        TextView textView = this.binding.w;
        String color = betCardDecision.getColor();
        Locale locale = Locale.ROOT;
        String upperCase = color.toUpperCase(locale);
        upperCase.getClass();
        textView.setText(upperCase);
        this.binding.w.setTextColor(getContext().getColor(R.color.off_white));
        this.binding.e.setVisibility(4);
        TextView textView2 = this.binding.f;
        Context context = getContext();
        String upperCase2 = betCardDecision2.getColor().toUpperCase(locale);
        upperCase2.getClass();
        textView2.setText(context.getString(R.string.redblack_lost_msg, upperCase2));
        if (Build.VERSION.SDK_INT <= 25) {
            this.binding.w.setTextSize(30.0f);
            this.binding.f.setTextSize(16.0f);
        }
        this.binding.f.setVisibility(0);
        this.binding.i.setVisibility(8);
        this.binding.F.setVisibility(8);
        this.binding.E.setVisibility(8);
        this.binding.A.setVisibility(8);
        this.binding.c.setVisibility(8);
        HashMap map = new HashMap();
        String upperCase3 = betCardDecision2.getColor().toUpperCase(locale);
        upperCase3.getClass();
        if (upperCase3.equals(getContext().getString(R.string.red))) {
            String string = getContext().getString(R.string.pick_cms);
            op5 op5Var = op5.a;
            String string2 = getContext().getString(R.string.red_cms);
            string2.getClass();
            String color2 = betCardDecision2.getColor();
            op5Var.getClass();
            map.put(string, op5.b(string2, color2, null));
        } else {
            String upperCase4 = betCardDecision2.getColor().toUpperCase(locale);
            upperCase4.getClass();
            if (upperCase4.equals(getContext().getString(R.string.black))) {
                String string3 = getContext().getString(R.string.pick_cms);
                op5 op5Var2 = op5.a;
                String string4 = getContext().getString(R.string.black_cms);
                string4.getClass();
                String color3 = betCardDecision2.getColor();
                op5Var2.getClass();
                map.put(string3, op5.b(string4, color3, null));
            }
        }
        op5 op5Var3 = op5.a;
        yo40 yo40Var = this.binding;
        op5.r(op5Var3, kotlin.collections.b.f(yo40Var.f, yo40Var.w), map, 4);
    }

    public final void b(BetCardDecision betCardDecision, String str, PlaceBetResponse placeBetResponse) {
        this.binding.C.setVisibility(0);
        this.binding.e.setVisibility(4);
        this.binding.z.setVisibility(8);
        this.binding.D.setVisibility(8);
        this.binding.b.setVisibility(8);
        this.binding.w.setTextColor(getContext().getColor(R.color.white));
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new b(betCardDecision, this, null), 3);
        TextView textView = this.binding.i;
        op5 op5Var = op5.a;
        String string = textView.getTag().toString();
        String string2 = getContext().getString(R.string.redblack_win_msg);
        string2.getClass();
        textView.setText(op5.c(op5Var, string, string2));
        this.binding.i.setVisibility(0);
        this.binding.F.setVisibility(0);
        String strI = op5.i(str);
        Locale locale = Locale.ROOT;
        String upperCase = strI.toUpperCase(locale);
        upperCase.getClass();
        TreeMap treeMap = pw.a;
        Double actualCreditedAmt = placeBetResponse.getActualCreditedAmt();
        this.binding.E.setText(tug.a(upperCase, " ", pw.d(actualCreditedAmt != null ? actualCreditedAmt.doubleValue() : 0.0d)));
        this.binding.E.setVisibility(0);
        this.binding.f.setVisibility(8);
        this.binding.A.setVisibility(0);
        this.binding.c.setVisibility(0);
        TextView textView2 = this.binding.w;
        String upperCase2 = betCardDecision.getColor().toUpperCase(locale);
        upperCase2.getClass();
        textView2.setText(upperCase2);
        if (Build.VERSION.SDK_INT <= 25) {
            this.binding.w.setTextSize(30.0f);
        }
        if (placeBetResponse.getGiftAmount() == null || placeBetResponse.getGiftAmount().doubleValue() <= 0.0d) {
            int iApplyDimension = (int) TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics());
            ViewGroup.LayoutParams layoutParams = this.binding.y.getLayoutParams();
            layoutParams.getClass();
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, iApplyDimension, 0, 0);
            this.binding.e.setVisibility(4);
        } else {
            this.binding.e.setVisibility(0);
            TextView textView3 = this.binding.B;
            String upperCase3 = op5.i(str).toUpperCase(locale);
            upperCase3.getClass();
            Double payoutAmount = placeBetResponse.getPayoutAmount();
            hu1.b(upperCase3, " ", payoutAmount != null ? pw.d(payoutAmount.doubleValue()) : null, textView3);
            TextView textView4 = this.binding.d;
            String upperCase4 = op5.i(str).toUpperCase(locale);
            upperCase4.getClass();
            hu1.b(upperCase4, " ", pw.d(placeBetResponse.getGiftAmount().doubleValue()), textView4);
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.animation_left);
        animationLoadAnimation.getClass();
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.animation_right);
        animationLoadAnimation2.getClass();
        this.binding.A.startAnimation(animationLoadAnimation);
        this.binding.c.startAnimation(animationLoadAnimation2);
        op5.r(op5Var, kotlin.collections.b.f(this.binding.w), null, 4);
    }

    public final yo40 getBinding() {
        return this.binding;
    }

    public final void setBinding(yo40 yo40Var) {
        yo40Var.getClass();
        this.binding = yo40Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoundResult(Context context) {
        this(context, null);
        context.getClass();
    }
}
