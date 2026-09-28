package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.recyclerview.widget.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
public final class em3 implements PointerInputEventHandler {
    public final /* synthetic */ xsw a;
    public final /* synthetic */ ytw<Boolean> b;
    public final /* synthetic */ gm3 c;
    public final /* synthetic */ wd0<Float, ij0> d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ zdl g;
    public final /* synthetic */ v5b h;
    public final /* synthetic */ float i;
    public final /* synthetic */ wd0<Float, ij0> j;
    public final /* synthetic */ float k;
    public final /* synthetic */ float l;
    public final /* synthetic */ float m;
    public final /* synthetic */ isw n;
    public final /* synthetic */ ytw<g7f> o;

    @c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetslipButtonOverlayKt$BetslipButtonOverlay$1$dragModifier$1$1$4$1", f = "BetslipButtonOverlay.kt", l = {335}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wd0<Float, ij0> wd0Var, float f, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = f;
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
            if (i == 0) {
                uj50.b(obj);
                Float f = new Float(this.c);
                this.a = 1;
                if (this.b.f(this, f) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetslipButtonOverlayKt$BetslipButtonOverlay$1$dragModifier$1$1$4$2", f = "BetslipButtonOverlay.kt", l = {340}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wd0<Float, ij0> wd0Var, float f, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = f;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                Float f = new Float(this.c);
                this.a = 1;
                if (this.b.f(this, f) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetslipButtonOverlayKt$BetslipButtonOverlay$1$dragModifier$1$1$snapToNearest$1", f = "BetslipButtonOverlay.kt", l = {310, 312}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ gm3 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wd0<Float, ij0> wd0Var, float f, float f2, gm3 gm3Var, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = f;
            this.d = f2;
            this.e = gm3Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
        
            if (defpackage.wd0.a(r6, r2, r0, null, null, r13, 12) == r7) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
        
            if (r6.f(r13, r3) == r7) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
        
            return r7;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                y5b r7 = defpackage.y5b.a
                int r0 = r13.a
                r1 = 0
                r8 = 1056964608(0x3f000000, float:0.5)
                float r9 = r13.d
                r2 = 2
                r3 = 1
                float r10 = r13.c
                wd0<java.lang.Float, ij0> r11 = r13.b
                if (r0 == 0) goto L1f
                if (r0 == r3) goto L15
                if (r0 != r2) goto L19
            L15:
                defpackage.uj50.b(r14)
                goto L73
            L19:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r0)
                return r1
            L1f:
                defpackage.uj50.b(r14)
                java.lang.Object r0 = r11.d()
                java.lang.Number r0 = (java.lang.Number) r0
                float r0 = r0.floatValue()
                float r0 = kotlin.ranges.f.d(r0, r10, r9)
                java.lang.Object r4 = r11.d()
                java.lang.Number r4 = (java.lang.Number) r4
                float r4 = r4.floatValue()
                float r4 = r0 - r4
                float r4 = java.lang.Math.abs(r4)
                int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                wd0<java.lang.Float, ij0> r6 = r13.b
                if (r4 <= 0) goto L64
                java.lang.Float r2 = new java.lang.Float
                r2.<init>(r0)
                r0 = 0
                r4 = 6
                r12 = 200(0xc8, float:2.8E-43)
                gzg0 r0 = defpackage.yi0.e(r12, r0, r1, r4)
                r13.a = r3
                r3 = 0
                r4 = 0
                r1 = r2
                r2 = r0
                r0 = r6
                r6 = 12
                r5 = r13
                java.lang.Object r0 = defpackage.wd0.a(r0, r1, r2, r3, r4, r5, r6)
                if (r0 != r7) goto L73
                goto L72
            L64:
                r1 = r6
                java.lang.Float r3 = new java.lang.Float
                r3.<init>(r0)
                r13.a = r2
                java.lang.Object r0 = r1.f(r13, r3)
                if (r0 != r7) goto L73
            L72:
                return r7
            L73:
                float r9 = r9 - r10
                r0 = 0
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r1 <= 0) goto L8b
                java.lang.Object r1 = r11.d()
                java.lang.Number r1 = (java.lang.Number) r1
                float r1 = r1.floatValue()
                float r1 = r1 - r10
                float r1 = r1 / r9
                r2 = 1065353216(0x3f800000, float:1.0)
                float r8 = kotlin.ranges.f.d(r1, r0, r2)
            L8b:
                gm3 r0 = r13.e
                isw r0 = r0.k
                t5a0 r0 = (defpackage.t5a0) r0
                r0.A(r8)
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: em3.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetslipButtonOverlayKt$BetslipButtonOverlay$1$dragModifier$1$1$snapToNearest$2", f = "BetslipButtonOverlay.kt", l = {323}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ float b;
        public final /* synthetic */ wd0<Float, ij0> c;
        public final /* synthetic */ xsw d;
        public final /* synthetic */ isw e;
        public final /* synthetic */ ytw<g7f> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f, wd0<Float, ij0> wd0Var, xsw xswVar, isw iswVar, ytw<g7f> ytwVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = f;
            this.c = wd0Var;
            this.d = xswVar;
            this.e = iswVar;
            this.f = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.b, this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (fm3.b(this.c, this.d, this.e, this.f, this.b, r.d.DEFAULT_DRAG_ANIMATION_DURATION, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public em3(xsw xswVar, ytw<Boolean> ytwVar, gm3 gm3Var, wd0<Float, ij0> wd0Var, float f, float f2, zdl zdlVar, v5b v5bVar, float f3, wd0<Float, ij0> wd0Var2, float f4, float f5, float f6, isw iswVar, ytw<g7f> ytwVar2) {
        this.a = xswVar;
        this.b = ytwVar;
        this.c = gm3Var;
        this.d = wd0Var;
        this.e = f;
        this.f = f2;
        this.g = zdlVar;
        this.h = v5bVar;
        this.i = f3;
        this.j = wd0Var2;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = iswVar;
        this.o = ytwVar2;
    }

    public static final void a(float f, float f2, float f3, float f4, float f5, wd0 wd0Var, wd0 wd0Var2, gm3 gm3Var, v5b v5bVar, zdl zdlVar, isw iswVar, xsw xswVar, ytw ytwVar, ytw ytwVar2) {
        ykf ykfVar = (f / 2.0f) + ((Number) wd0Var.d()).floatValue() > f2 / 2.0f ? ykf.b : ykf.a;
        if (ykfVar != gm3Var.b()) {
            zdlVar.a(9);
        } else {
            zdlVar.a(0);
        }
        ej5.c(v5bVar, null, null, new c(wd0Var2, f4, f5, gm3Var, null), 3);
        ((x5a0) gm3Var.j).setValue(ykfVar);
        if (ykfVar != ykf.a) {
            f3 = (f2 - f) - f3;
        }
        float f6 = f3;
        ytwVar.setValue(Boolean.FALSE);
        ej5.c(v5bVar, null, null, new d(f6, wd0Var, xswVar, iswVar, ytwVar2, null), 3);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        final xsw xswVar = this.a;
        final ytw<Boolean> ytwVar = this.b;
        am3 am3Var = new am3(xswVar, (ytw) ytwVar);
        final float f = this.e;
        final float f2 = this.f;
        final float f3 = this.i;
        final float f4 = this.k;
        final float f5 = this.l;
        final wd0<Float, ij0> wd0Var = this.d;
        final wd0<Float, ij0> wd0Var2 = this.j;
        final gm3 gm3Var = this.c;
        final v5b v5bVar = this.h;
        final zdl zdlVar = this.g;
        final isw iswVar = this.n;
        final ytw<g7f> ytwVar2 = this.o;
        Function0 function0 = new Function0() { // from class: bm3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                gm3 gm3Var2 = gm3Var;
                lq3 lq3Var = gm3Var2.d;
                if (lq3Var != null) {
                    lq3Var.invoke();
                }
                em3.a(f, f2, f3, f4, f5, wd0Var, wd0Var2, gm3Var2, v5bVar, zdlVar, iswVar, xswVar, ytwVar, ytwVar2);
                return Unit.a;
            }
        };
        Function0 function1 = new Function0() { // from class: cm3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                em3.a(f, f2, f3, f4, f5, wd0Var, wd0Var2, gm3Var, v5bVar, zdlVar, iswVar, xswVar, ytwVar, ytwVar2);
                return Unit.a;
            }
        };
        final float f6 = this.m;
        return y8f.e(u020Var, am3Var, function0, function1, new Function2() { // from class: dm3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                m020 m020Var = (m020) obj;
                m020Var.getClass();
                m020Var.a();
                wd0 wd0Var3 = wd0Var2;
                float fFloatValue = ((Number) wd0Var3.d()).floatValue();
                long j = ((gly) obj2).a;
                int i = (int) (4294967295L & j);
                float fIntBitsToFloat = Float.intBitsToFloat(i) + fFloatValue;
                float f7 = f6;
                float f8 = f;
                float f9 = f7 - f8;
                if (f9 < 0.0f) {
                    f9 = 0.0f;
                }
                em3.a aVar = new em3.a(wd0Var3, f.d(fIntBitsToFloat, 0.0f, f9), null);
                v5b v5bVar2 = v5bVar;
                ej5.c(v5bVar2, null, null, aVar, 3);
                float f10 = f2 - f8;
                float f11 = f3;
                float f12 = f10 - f11;
                if (f12 < f11) {
                    f12 = f11;
                }
                wd0 wd0Var4 = wd0Var;
                int i2 = (int) (j >> 32);
                ej5.c(v5bVar2, null, null, new em3.b(wd0Var4, f.d(Float.intBitsToFloat(i2) + ((Number) wd0Var4.d()).floatValue(), f11, f12), null), 3);
                fm3.c(xswVar, iswVar, ytwVar2, Float.intBitsToFloat(i2), Float.intBitsToFloat(i));
                return Unit.a;
            }
        }, v1bVar);
    }
}
