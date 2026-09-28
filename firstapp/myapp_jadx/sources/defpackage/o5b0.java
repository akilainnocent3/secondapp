package defpackage;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import com.google.android.material.imageview.ShapeableImageView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.spin2win.components.Spin2WinWheel;
import com.sportygames.spin2win.model.response.Spin2WinPlaceBetResponse;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o5b0 implements Animation.AnimationListener {
    public final /* synthetic */ Spin2WinWheel a;
    public final /* synthetic */ Spin2WinPlaceBetResponse b;

    @c0d(c = "com.sportygames.spin2win.components.Spin2WinWheel$stopSpinningWheel$1$onAnimationEnd$1", f = "Spin2WinWheel.kt", l = {381}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Spin2WinWheel b;
        public final /* synthetic */ Spin2WinPlaceBetResponse c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Spin2WinWheel spin2WinWheel, Spin2WinPlaceBetResponse spin2WinPlaceBetResponse, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = spin2WinWheel;
            this.c = spin2WinPlaceBetResponse;
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
            ViewPropertyAnimator viewPropertyAnimatorAnimate;
            ViewPropertyAnimator viewPropertyAnimatorScaleX;
            ViewPropertyAnimator viewPropertyAnimatorScaleY;
            ViewPropertyAnimator duration;
            ViewPropertyAnimator viewPropertyAnimatorAnimate2;
            ViewPropertyAnimator viewPropertyAnimatorScaleX2;
            ViewPropertyAnimator viewPropertyAnimatorScaleY2;
            ViewPropertyAnimator duration2;
            int i;
            Double totalWinAmount;
            y5b y5bVar = y5b.a;
            int i2 = this.a;
            String lowerCase = null;
            if (i2 == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(1000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            final Spin2WinWheel spin2WinWheel = this.b;
            spin2WinWheel.setWheelSpinning(false);
            Context context = spin2WinWheel.getContext();
            if (context != null) {
                hq80 binding = spin2WinWheel.getBinding();
                if (binding != null) {
                    binding.v.setVisibility(8);
                }
                final Spin2WinPlaceBetResponse spin2WinPlaceBetResponse = this.c;
                final double dDoubleValue = (spin2WinPlaceBetResponse == null || (totalWinAmount = spin2WinPlaceBetResponse.getTotalWinAmount()) == null) ? 0.0d : totalWinAmount.doubleValue();
                hq80 binding2 = spin2WinWheel.getBinding();
                if (binding2 != null) {
                    binding2.y.setText(String.valueOf(spin2WinPlaceBetResponse != null ? spin2WinPlaceBetResponse.getHouseDraw() : null));
                }
                hq80 binding3 = spin2WinWheel.getBinding();
                if (binding3 != null) {
                    ShapeableImageView shapeableImageView = binding3.b;
                    String houseDrawColour = spin2WinPlaceBetResponse != null ? spin2WinPlaceBetResponse.getHouseDrawColour() : null;
                    if (houseDrawColour != null) {
                        lowerCase = houseDrawColour.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    }
                    if (Intrinsics.g(lowerCase, "red")) {
                        i = R.color.sg_color_e41826;
                    } else {
                        i = Intrinsics.g(lowerCase, "black") ? R.color.sg_color_1c1e25 : R.color.sg_color_109737;
                    }
                    shapeableImageView.setBackgroundColor(context.getColor(i));
                }
                hq80 binding4 = spin2WinWheel.getBinding();
                if (binding4 != null && (viewPropertyAnimatorAnimate2 = binding4.y.animate()) != null && (viewPropertyAnimatorScaleX2 = viewPropertyAnimatorAnimate2.scaleX(1.2f)) != null && (viewPropertyAnimatorScaleY2 = viewPropertyAnimatorScaleX2.scaleY(1.2f)) != null && (duration2 = viewPropertyAnimatorScaleY2.setDuration(75L)) != null) {
                    duration2.withEndAction(new Runnable() { // from class: l5b0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate3;
                            ViewPropertyAnimator viewPropertyAnimatorScaleX3;
                            ViewPropertyAnimator viewPropertyAnimatorScaleY3;
                            hq80 binding5 = spin2WinWheel.getBinding();
                            if (binding5 == null || (viewPropertyAnimatorAnimate3 = binding5.y.animate()) == null || (viewPropertyAnimatorScaleX3 = viewPropertyAnimatorAnimate3.scaleX(1.0f)) == null || (viewPropertyAnimatorScaleY3 = viewPropertyAnimatorScaleX3.scaleY(1.0f)) == null) {
                                return;
                            }
                            viewPropertyAnimatorScaleY3.setDuration(75L);
                        }
                    });
                }
                hq80 binding5 = spin2WinWheel.getBinding();
                if (binding5 != null && (viewPropertyAnimatorAnimate = binding5.b.animate()) != null && (viewPropertyAnimatorScaleX = viewPropertyAnimatorAnimate.scaleX(1.2f)) != null && (viewPropertyAnimatorScaleY = viewPropertyAnimatorScaleX.scaleY(1.2f)) != null && (duration = viewPropertyAnimatorScaleY.setDuration(75L)) != null) {
                    duration.withEndAction(new Runnable() { // from class: m5b0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate3;
                            ViewPropertyAnimator viewPropertyAnimatorScaleX3;
                            ViewPropertyAnimator viewPropertyAnimatorScaleY3;
                            ViewPropertyAnimator duration3;
                            final Spin2WinWheel spin2WinWheel2 = spin2WinWheel;
                            hq80 binding6 = spin2WinWheel2.getBinding();
                            if (binding6 == null || (viewPropertyAnimatorAnimate3 = binding6.b.animate()) == null || (viewPropertyAnimatorScaleX3 = viewPropertyAnimatorAnimate3.scaleX(1.0f)) == null || (viewPropertyAnimatorScaleY3 = viewPropertyAnimatorScaleX3.scaleY(1.0f)) == null || (duration3 = viewPropertyAnimatorScaleY3.setDuration(75L)) == null) {
                                return;
                            }
                            final double d = dDoubleValue;
                            final Spin2WinPlaceBetResponse spin2WinPlaceBetResponse2 = spin2WinPlaceBetResponse;
                            duration3.withEndAction(new Runnable() { // from class: n5b0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    double d2 = d;
                                    Spin2WinWheel spin2WinWheel3 = spin2WinWheel2;
                                    if (d2 > 0.0d) {
                                        int i3 = Spin2WinWheel.L;
                                        pfd pfdVar = fse.a;
                                        ej5.c(w5b.a(gku.a), null, null, new i5b0(spin2WinWheel3, spin2WinPlaceBetResponse2, null), 3);
                                    } else {
                                        int i4 = Spin2WinWheel.L;
                                        pfd pfdVar2 = fse.a;
                                        ej5.c(w5b.a(gku.a), null, null, new h5b0(spin2WinWheel3, null), 3);
                                    }
                                }
                            });
                        }
                    });
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.spin2win.components.Spin2WinWheel$stopSpinningWheel$1$onAnimationStart$1", f = "Spin2WinWheel.kt", l = {416, 419}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Spin2WinWheel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Spin2WinWheel spin2WinWheel, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = spin2WinWheel;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        
            if (defpackage.hkd.b(900, r10) == r0) goto L17;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r10.a
                r2 = 0
                java.lang.String r3 = "wheelAnimationState"
                r4 = 0
                r5 = 900(0x384, double:4.447E-321)
                r7 = 2
                r8 = 1
                com.sportygames.spin2win.components.Spin2WinWheel r9 = r10.b
                if (r1 == 0) goto L22
                if (r1 == r8) goto L1e
                if (r1 != r7) goto L18
                defpackage.uj50.b(r11)
                goto L43
            L18:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r10)
                return r2
            L1e:
                defpackage.uj50.b(r11)
                goto L2e
            L22:
                defpackage.uj50.b(r11)
                r10.a = r8
                java.lang.Object r11 = defpackage.hkd.b(r5, r10)
                if (r11 != r0) goto L2e
                goto L42
            L2e:
                r9.setWheelSpinning(r4)
                kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r11 = r9.H
                if (r11 == 0) goto L56
                java.lang.String r1 = "MIDDLE"
                r11.invoke(r1)
                r10.a = r7
                java.lang.Object r10 = defpackage.hkd.b(r5, r10)
                if (r10 != r0) goto L43
            L42:
                return r0
            L43:
                r9.setWheelSpinning(r4)
                kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r10 = r9.H
                if (r10 == 0) goto L52
                java.lang.String r11 = "END"
                r10.invoke(r11)
                kotlin.Unit r10 = kotlin.Unit.a
                return r10
            L52:
                kotlin.jvm.internal.Intrinsics.n(r3)
                throw r2
            L56:
                kotlin.jvm.internal.Intrinsics.n(r3)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o5b0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public o5b0(Spin2WinWheel spin2WinWheel, Spin2WinPlaceBetResponse spin2WinPlaceBetResponse) {
        this.a = spin2WinWheel;
        this.b = spin2WinPlaceBetResponse;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new a(this.a, this.b, null), 3);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new b(this.a, null), 3);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
