package defpackage;

import androidx.compose.animation.f;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.media3.ui.PlayerView;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class sir {
    public static final el10 a = new el10(kotlin.collections.b.k(new fl10(6.0f, 3.0f), new fl10(11.7f, 6.664f), new fl10(11.7f, 17.336f), new fl10(6.0f, 21.0f)), kotlin.collections.b.k(new fl10(4.5f, 3.5f), new fl10(9.5f, 3.5f), new fl10(9.5f, 20.5f), new fl10(4.5f, 20.5f)));
    public static final el10 b = new el10(kotlin.collections.b.k(new fl10(11.7f, 6.664f), new fl10(20.0f, 12.0f), new fl10(20.0f, 12.0f), new fl10(11.7f, 17.336f)), kotlin.collections.b.k(new fl10(14.5f, 3.5f), new fl10(19.5f, 3.5f), new fl10(19.5f, 20.5f), new fl10(14.5f, 20.5f)));

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamViewKt$Controller$1$1", f = "LNStreamView.kt", l = {272}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ytw<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ytw<Boolean> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            ytw<Boolean> ytwVar = this.b;
            if (i == 0) {
                uj50.b(obj);
                el10 el10Var = sir.a;
                if (ytwVar.getValue().booleanValue()) {
                    this.a = 1;
                    if (hkd.b(3000L, this) == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            el10 el10Var2 = sir.a;
            ytwVar.setValue(Boolean.FALSE);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function0<Unit> {
        public final /* synthetic */ ytw<Boolean> a;
        public final /* synthetic */ ytw<Integer> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ytw<Boolean> ytwVar, ytw<Integer> ytwVar2) {
            super(0, Intrinsics.a.class, "keepControllerVisible", "Controller$keepControllerVisible(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
            this.a = ytwVar;
            this.b = ytwVar2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.a.setValue(Boolean.TRUE);
            ytw<Integer> ytwVar = this.b;
            ytwVar.setValue(Integer.valueOf(ytwVar.getValue().intValue() + 1));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamViewKt$ControllerLayer$1$1", f = "LNStreamView.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ x3r a;
        public final /* synthetic */ ytw<x3r> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x3r x3rVar, ytw<x3r> ytwVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.a = x3rVar;
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            x3r x3rVar = this.a;
            if (!(x3rVar instanceof x3r.a)) {
                el10 el10Var = sir.a;
                this.b.setValue(x3rVar);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamViewKt$PlayPauseView$1$1", f = "LNStreamView.kt", l = {560, 562}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ x3r b;
        public final /* synthetic */ wd0<Float, ij0> c;
        public final /* synthetic */ twd0<Float> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(x3r x3rVar, wd0<Float, ij0> wd0Var, twd0<Float> twd0Var, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = x3rVar;
            this.c = wd0Var;
            this.d = twd0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (r5.f(r12, r1) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        
            if (defpackage.wd0.a(r5, r6, r7, null, null, r12, 12) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
        
            return r0;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r12.a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L17
                if (r1 == r4) goto Ld
                if (r1 != r3) goto L11
            Ld:
                defpackage.uj50.b(r13)
                goto L64
            L11:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r12)
                return r2
            L17:
                defpackage.uj50.b(r13)
                x3r r13 = r12.b
                java.lang.Float r13 = defpackage.sir.n(r13)
                if (r13 == 0) goto L67
                float r13 = r13.floatValue()
                twd0<java.lang.Float> r1 = r12.d
                java.lang.Object r1 = r1.getValue()
                java.lang.Number r1 = (java.lang.Number) r1
                float r1 = r1.floatValue()
                r5 = 981668463(0x3a83126f, float:0.001)
                int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                wd0<java.lang.Float, ij0> r5 = r12.c
                if (r1 > 0) goto L49
                java.lang.Float r1 = new java.lang.Float
                r1.<init>(r13)
                r12.a = r4
                java.lang.Object r12 = r5.f(r12, r1)
                if (r12 != r0) goto L64
                goto L63
            L49:
                java.lang.Float r6 = new java.lang.Float
                r6.<init>(r13)
                r13 = 0
                r1 = 6
                r4 = 180(0xb4, float:2.52E-43)
                gzg0 r7 = defpackage.yi0.e(r4, r13, r2, r1)
                r12.a = r3
                r8 = 0
                r9 = 0
                r11 = 12
                r10 = r12
                java.lang.Object r12 = defpackage.wd0.a(r5, r6, r7, r8, r9, r10, r11)
                if (r12 != r0) goto L64
            L63:
                return r0
            L64:
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            L67:
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: sir.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamViewKt$StatusLayer$1$1", f = "LNStreamView.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ a4r a;
        public final /* synthetic */ ytw<a4r> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a4r a4rVar, ytw<a4r> ytwVar, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.a = a4rVar;
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            a4r.c cVar = a4r.c.a;
            a4r a4rVar = this.a;
            if (!Intrinsics.g(a4rVar, cVar)) {
                el10 el10Var = sir.a;
                this.b.setValue(a4rVar);
            }
            return Unit.a;
        }
    }

    public static final void a(z3r.b bVar, final float f, Function1 function1, final Function0 function0, androidx.compose.ui.d dVar, androidx.compose.runtime.a aVar, final int i) {
        final Function1 function2;
        final androidx.compose.ui.d dVar2;
        final Function1 function3;
        crz crzVarA;
        crz crzVarA2;
        final z3r.b bVar2 = bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-334502700);
        int i2 = i | (bVarI.M(bVar2) ? 4 : 2) | (bVarI.c(f) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | 24576;
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(aVar2, 1.0f);
            List listK = kotlin.collections.b.k(new j58(r58.b(1777189)), new j58(r58.d(2988121637L)));
            float f2 = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            androidx.compose.ui.d dVarA = androidx.compose.foundation.a.a(dVarG, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), null, 0.0f, 6);
            qyd0 qyd0Var = ejb0.a;
            androidx.compose.ui.d dVarI = h.i(dVarA, f, ((cjb0) bVarI.O(qyd0Var)).d, f, ((cjb0) bVarI.O(qyd0Var)).d);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY;
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new cir(function0, 0);
                bVarI.r(objY2);
            }
            androidx.compose.ui.d dVarB = androidx.compose.foundation.d.b(dVarI, pswVar, null, false, null, mla.d((Function0) objY2, bVarI, 0), 28);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            LayoutWeightElement layoutWeightElementA = yy.a(bVarI, dVarC, yka.a.d, 1.0f, true);
            String strA = cb40.a(R.string.common_functions__live, new Object[0], bVarI);
            imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).j;
            qyd0 qyd0Var2 = oib0.a;
            lkf0.d(strA, layoutWeightElementA, ((lib0) bVarI.O(qyd0Var2)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 131064);
            bVarI = bVarI;
            androidx.compose.ui.d dVarR = j.r(aVar2, 20.0f);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = rzk.a(bVarI);
            }
            psw pswVar2 = (psw) objY3;
            long j = j58.f;
            xt50 xt50VarA = ut50.a(21.0f, j, false);
            int i4 = i2 & 896;
            boolean z2 = (i3 == 2048) | (i4 == 256);
            Object objY4 = bVarI.y();
            if (z2 || objY4 == c0042a) {
                function3 = function1;
                objY4 = new Function0() { // from class: dir
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        function3.invoke(ler.n.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            } else {
                function3 = function1;
            }
            androidx.compose.ui.d dVarF = h.f(androidx.compose.foundation.d.b(dVarR, pswVar2, xt50VarA, false, null, mla.d((Function0) objY4, bVarI, 0), 28), 3.0f);
            if (bVar.e) {
                bVarI.N(-235958588);
                crzVarA = erz.a(R.drawable.ic__sound_off, 0, bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(-235875291);
                crzVarA = erz.a(R.drawable.ic__sound_on, 0, bVarI);
                bVarI.X(false);
            }
            function2 = function3;
            h6n.b(crzVarA, "mute", dVarF, ((lib0) bVarI.O(qyd0Var2)).b0, bVarI, 48, 0);
            bVar2 = bVar;
            androidx.compose.ui.d dVarR2 = j.r(h.j(aVar2, ((cjb0) bVarI.O(qyd0Var)).f, 0.0f, 0.0f, 0.0f, 14), 20.0f);
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = rzk.a(bVarI);
            }
            psw pswVar3 = (psw) objY5;
            xt50 xt50VarA2 = ut50.a(21.0f, j, false);
            boolean z3 = (i4 == 256) | (i3 == 2048);
            Object objY6 = bVarI.y();
            if (z3 || objY6 == c0042a) {
                objY6 = new Function0() { // from class: eir
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        function2.invoke(ler.m.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY6);
            }
            androidx.compose.ui.d dVarF2 = h.f(androidx.compose.foundation.d.b(dVarR2, pswVar3, xt50VarA2, false, null, mla.d((Function0) objY6, bVarI, 0), 28), 3.0f);
            if (bVar2.d) {
                bVarI.N(-234990179);
                crzVarA2 = erz.a(R.drawable.icon_exit_fullscreen, 0, bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(-234900093);
                crzVarA2 = erz.a(R.drawable.ic_full_screen, 0, bVarI);
                bVarI.X(false);
            }
            h6n.b(crzVarA2, "fullscreen", dVarF2, ((lib0) bVarI.O(qyd0Var2)).b0, bVarI, 48, 0);
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            function2 = function1;
            bVarI.G();
            dVar2 = dVar;
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function1 function4 = function2;
            eVarZ.d = new Function2(f, function4, function0, dVar2, i) { // from class: fir
                public final /* synthetic */ float b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ d e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    sir.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final x3r x3rVar, final Function1<? super ler, Unit> function1, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.e eVarZ;
        Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2;
        final ler lerVar;
        androidx.compose.runtime.b bVarI = aVar.i(-1040074872);
        int i2 = (bVarI.M(x3rVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            if (x3rVar instanceof x3r.a) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2(function1, function0, i) { // from class: whr
                        public final /* synthetic */ Function1 b;
                        public final /* synthetic */ Function0 c;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(1);
                            sir.b(this.a, this.b, this.c, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                }
            } else {
                if (Intrinsics.g(x3rVar, x3r.c.a)) {
                    lerVar = ler.d.a;
                } else if (Intrinsics.g(x3rVar, x3r.b.a)) {
                    lerVar = ler.c.a;
                } else if (Intrinsics.g(x3rVar, x3r.d.a)) {
                    lerVar = ler.f.a;
                } else {
                    if (!Intrinsics.g(x3rVar, x3r.a.a)) {
                        uhc.a();
                        return;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ == null) {
                        return;
                    } else {
                        function2 = new Function2(function1, function0, i) { // from class: xhr
                            public final /* synthetic */ Function1 b;
                            public final /* synthetic */ Function0 c;

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = qj40.a(1);
                                sir.b(this.a, this.b, this.c, (a) obj, iA);
                                return Unit.a;
                            }
                        };
                    }
                }
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(ls7.a(j.r(androidx.compose.ui.d.a.b, 48.0f), j060.a), r58.d(3426040389L), zk40.a);
                Object objY = bVarI.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (objY == c0042a) {
                    objY = rzk.a(bVarI);
                }
                psw pswVar = (psw) objY;
                xt50 xt50VarA = ut50.a(28.0f, j58.f, false);
                boolean zM = ((i2 & 112) == 32) | ((i2 & 896) == 256) | bVarI.M(lerVar);
                Object objY2 = bVarI.y();
                if (zM || objY2 == c0042a) {
                    objY2 = new Function0() { // from class: zhr
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function0.invoke();
                            function1.invoke(lerVar);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                androidx.compose.ui.d dVarB2 = androidx.compose.foundation.d.b(dVarB, pswVar, xt50VarA, false, null, mla.d((Function0) objY2, bVarI, 0), 28);
                aiv aivVarC = g75.c(ht.a.e, false);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB2);
                yka.k.getClass();
                tsr.a aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                int i3 = i2 & 14;
                k(x3rVar, bVarI, i3);
                i(x3rVar, bVarI, i3);
                bVarI.X(true);
            }
            eVarZ.d = function2;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            function2 = new Function2(function1, function0, i) { // from class: air
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    sir.b(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final int i, final z3r.b bVar, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar, final String str, final Function1 function1, final boolean z) {
        int i2;
        float f;
        androidx.compose.runtime.b bVarI = aVar.i(-1037452122);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(bVar) : bVarI.A(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.b(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            y3r y3rVar = bVar.b;
            boolean z2 = bVar.d;
            ier ierVar = bVar.a;
            boolean zM = bVarI.M(ierVar.a);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            boolean zM2 = bVarI.M(ierVar.a);
            Object objY2 = bVarI.y();
            if (zM2 || objY2 == c0042a) {
                objY2 = m.b(0);
                bVarI.r(objY2);
            }
            final ytw ytwVar2 = (ytw) objY2;
            if (z2) {
                bVarI.N(-150937401);
                bVarI.X(false);
                f = 40.0f;
            } else {
                bVarI.N(-150910214);
                f = ((cjb0) bVarI.O(ejb0.a)).e;
                bVarI.X(false);
            }
            float f2 = f;
            Boolean bool = (Boolean) ytwVar.getValue();
            bool.getClass();
            Integer numValueOf = Integer.valueOf(((Number) ytwVar2.getValue()).intValue());
            boolean zM3 = bVarI.M(ytwVar);
            Object objY3 = bVarI.y();
            if (zM3 || objY3 == c0042a) {
                objY3 = new a(ytwVar, null);
                bVarI.r(objY3);
            }
            xvf.g(bool, numValueOf, (Function2) objY3, bVarI);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY4;
            boolean zM4 = bVarI.M(ytwVar) | bVarI.M(ytwVar2);
            Object objY5 = bVarI.y();
            if (zM4 || objY5 == c0042a) {
                objY5 = new Function0() { // from class: iir
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ytw ytwVar3 = ytwVar;
                        if (((Boolean) ytwVar3.getValue()).booleanValue()) {
                            ytwVar3.setValue(Boolean.FALSE);
                        } else {
                            ytwVar3.setValue(Boolean.TRUE);
                            ytw ytwVar4 = ytwVar2;
                            ytwVar4.setValue(Integer.valueOf(((Number) ytwVar4.getValue()).intValue() + 1));
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY5);
            }
            androidx.compose.ui.d dVarB = androidx.compose.foundation.d.b(dVar, pswVar, null, false, null, mla.d((Function0) objY5, bVarI, 0), 28);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            l(bVar.c, bVarI, 0);
            n54 n54Var = ht.a.b;
            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarB2 = dVar2.b(aVar3, n54Var);
            int i3 = i2;
            m(dVarB2, str, z2 && ((Boolean) ytwVar.getValue()).booleanValue(), z, bVar.g, f2, function1, bVarI, ((i2 >> 3) & 112) | (i2 & 7168) | (3670016 & (i2 << 6)));
            bVarI = bVarI;
            androidx.compose.ui.d dVarF = dVar2.f(aVar3);
            boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
            boolean zM5 = bVarI.M(ytwVar) | bVarI.M(ytwVar2);
            Object objY6 = bVarI.y();
            if (zM5 || objY6 == c0042a) {
                objY6 = new b(ytwVar, ytwVar2);
                bVarI.r(objY6);
            }
            d(dVarF, zBooleanValue, f2, y3rVar, bVar, function1, (Function0) ((chp) objY6), bVarI, ((i3 << 9) & 57344) | (458752 & (i3 << 3)));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: lir
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sir.c(qj40.a(i | 1), bVar, (a) obj, dVar, str, function1, z);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final androidx.compose.ui.d dVar, final boolean z, final float f, final y3r y3rVar, final z3r.b bVar, final Function1<? super ler, Unit> function1, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final x3r x3rVar;
        androidx.compose.runtime.b bVarI = aVar.i(-1897378082);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.c(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(y3rVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? bVarI.M(bVar) : bVarI.A(bVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function0) ? 1048576 : 524288;
        }
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            y3r.b bVar2 = y3rVar instanceof y3r.b ? (y3r.b) y3rVar : null;
            if (bVar2 == null || (x3rVar = bVar2.a) == null) {
                x3rVar = x3r.a.a;
            }
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(x3rVar);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            boolean zM = bVarI.M(x3rVar);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                objY2 = new c(x3rVar, ytwVar, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, x3rVar, (Function2) objY2);
            boolean z2 = x3rVar instanceof x3r.a;
            if (z2) {
                x3rVar = null;
            }
            if (x3rVar == null) {
                x3rVar = (x3r) ytwVar.getValue();
            }
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            hh0.e(z && !z2, null, f.f(yi0.e(180, 0, null, 6), 2), f.g(yi0.e(180, 0, null, 6), 2), null, pp8.b(435054140, new gaj() { // from class: rhr
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        sir.b(x3rVar, function1, function0, aVar3, 0);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 200064, 18);
            androidx.compose.ui.d dVarB = androidx.compose.foundation.layout.d.a.b(androidx.compose.ui.d.a.b, ht.a.h);
            gzg0 gzg0VarE = yi0.e(180, 0, null, 6);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new qoz();
                bVarI.r(objY3);
            }
            t9g t9gVarB = f.p(gzg0VarE, (Function1) objY3).b(f.f(yi0.e(180, 0, null, 6), 2));
            gzg0 gzg0VarE2 = yi0.e(180, 0, null, 6);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new qoz();
                bVarI.r(objY4);
            }
            hh0.e(z, dVarB, t9gVarB, f.t(gzg0VarE2, (Function1) objY4).b(f.g(yi0.e(180, 0, null, 6), 2)), null, pp8.b(1754748531, new gaj() { // from class: shr
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        sir.a(bVar, f, function1, function0, null, aVar3, 0);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 3) & 14) | 200064, 16);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: thr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    sir.d(dVar, z, f, y3rVar, bVar, function1, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-727635090);
        if (bVarI.q(i & 1, i != 0)) {
            qyd0 qyd0Var = ejb0.a;
            float f = ((cjb0) bVarI.O(qyd0Var)).g;
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarH = h.h(aVar2, f, 0.0f, 2);
            i78 i78VarA = g78.a(new kw0.i(((cjb0) bVarI.O(qyd0Var)).d, true, new hw0()), ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            h9n.a(erz.a(R.drawable.ic_alert_filled, 0, bVarI), "alert", j.r(aVar2, 48.0f), null, null, 0.0f, null, bVarI, 432, 120);
            String strA = cb40.a(R.string.page_lucky_numbers__temporary_unavailable, new Object[0], bVarI);
            qyd0 qyd0Var2 = kjb0.a;
            imf0 imf0Var = ((ijb0) bVarI.O(qyd0Var2)).d;
            qyd0 qyd0Var3 = oib0.a;
            lkf0.d(strA, null, ((lib0) bVarI.O(qyd0Var3)).o, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 130042);
            lkf0.d(cb40.a(R.string.page_lucky_numbers__please_refresh_or_try_again_shortly, new Object[0], bVarI), null, ((lib0) bVarI.O(qyd0Var3)).q, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).o, bVarI, 0, 0, 130042);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new bir();
        }
    }

    public static final void f(final int i, z3r.b bVar, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar, final String str, final Function1 function1, final boolean z) {
        int i2;
        final z3r.b bVar2;
        androidx.compose.ui.d dVarA;
        bVar.getClass();
        str.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(339935433);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(bVar) : bVarI.A(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(dVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            final ytw ytwVarC = m.c(function1, bVarI);
            androidx.media3.exoplayer.d dVar2 = bVar.a.a;
            boolean zM = bVarI.M(ytwVarC);
            Object objY = bVarI.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: nhr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((use) obj).getClass();
                        ytw ytwVar = ytwVarC;
                        ((Function1) ytwVar.getValue()).invoke(new ler.j(true));
                        return new tir(ytwVar);
                    }
                };
                bVarI.r(objY);
            }
            xvf.c(dVar2, (Function1) objY, bVarI);
            if (bVar.d) {
                dVarA = j.e(dVar, 1.0f);
            } else {
                androidx.compose.ui.d dVarA2 = androidx.compose.animation.e.a(j.g(dVar, 1.0f));
                Float f = bVar.f;
                dVarA = androidx.compose.foundation.layout.c.a(dVarA2, f != null ? f.floatValue() : 1.7777778f);
            }
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarA, j58.b, zk40.a);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            int i3 = i2 << 3;
            j(j.e(aVar3, 1.0f), bVar, bVarI, (i3 & 112) | 6);
            c(i3 & 65520, bVar, bVarI, androidx.compose.foundation.layout.d.a.f(aVar3), str, function1, z);
            bVar2 = bVar;
            bVarI.X(true);
        } else {
            bVar2 = bVar;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: yhr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sir.f(qj40.a(i | 1), bVar2, (a) obj, dVar, str, function1, z);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(1289400610);
        if (bVarI.q(i & 1, i != 0)) {
            q330.a(j.r(androidx.compose.ui.d.a.b, 39.0f), ((lib0) bVarI.O(oib0.a)).c0, 4.5f, 0L, 0, 0.0f, bVarI, 390, 56);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new m29(i);
        }
    }

    public static final void h(final float f, final int i, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-854759115);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.c(f) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            final long j = ((lib0) bVarI.O(oib0.a)).a0;
            boolean zE = bVarI.e(j) | ((i2 & 112) == 32);
            Object objY = bVarI.y();
            if (zE || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: jir
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 24.0f;
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) / 24.0f;
                        el10 el10Var = sir.a;
                        float f2 = f;
                        j90 j90VarO = sir.o(el10Var, f2, fIntBitsToFloat, fIntBitsToFloat2);
                        long j2 = j;
                        tcf.Q1(tcfVar, j90VarO, j2, 0.0f, null, 60);
                        tcf.Q1(tcfVar, sir.o(sir.b, f2, fIntBitsToFloat, fIntBitsToFloat2), j2, 0.0f, null, 60);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            rxo.b(dVar, (Function1) objY, bVarI, i2 & 14);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, i, dVar) { // from class: kir
                public final /* synthetic */ d a;
                public final /* synthetic */ float b;

                {
                    this.a = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    sir.h(this.b, iA, (a) obj, this.a);
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(x3r x3rVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(1595080413);
        int i2 = (bVarI.M(x3rVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            twd0 twd0VarB = xe0.b(n(x3rVar) != null ? 1.0f : 0.0f, yi0.e(120, 0, null, 6), "stream_play_pause_alpha", null, bVarI, 3120, 20);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                Float fN = n(x3rVar);
                objY = ee0.a(fN != null ? fN.floatValue() : 0.0f);
                bVarI.r(objY);
            }
            wd0 wd0Var = (wd0) objY;
            boolean zM = bVarI.M(twd0VarB) | ((i2 & 14) == 4) | bVarI.A(wd0Var);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                objY2 = new d(x3rVar, wd0Var, twd0VarB, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, x3rVar, (Function2) objY2);
            h(((Number) wd0Var.d()).floatValue(), 0, bVarI, dw.a(j.r(androidx.compose.ui.d.a.b, 24.0f), ((Number) twd0VarB.getValue()).floatValue()));
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new hir(i, 0, x3rVar);
        }
    }

    public static final void j(final androidx.compose.ui.d dVar, final z3r.b bVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final androidx.compose.ui.d dVar2;
        androidx.compose.runtime.b bVarI = aVar.i(384815421);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(bVar) : bVarI.A(bVar) ? 32 : 16;
        }
        int i3 = 0;
        if (!bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            dVar2 = dVar;
            bVarI.G();
        } else {
            if (((Boolean) bVarI.O(hnn.a)).booleanValue()) {
                bVarI.N(768610518);
                g75.a(androidx.compose.foundation.a.b(dVar, j58.b, zk40.a), bVarI, 0);
                bVarI.X(false);
                androidx.compose.runtime.e eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: mir
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int iA = qj40.a(i | 1);
                            sir.j(dVar, bVar, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            bVarI.N(768686437);
            bVarI.X(false);
            int i4 = i2 & 112;
            boolean z = i4 == 32 || ((i2 & 64) != 0 && bVarI.A(bVar));
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new nir(bVar, i3);
                bVarI.r(objY);
            }
            Function1 function1 = (Function1) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new oir();
                bVarI.r(objY2);
            }
            Function1 function2 = (Function1) objY2;
            if (i4 == 32 || ((i2 & 64) != 0 && bVarI.A(bVar))) {
                i3 = 1;
            }
            Object objY3 = bVarI.y();
            if (i3 != 0 || objY3 == c0042a) {
                objY3 = new Function1() { // from class: pir
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        PlayerView playerView = (PlayerView) obj;
                        playerView.getClass();
                        so10 player = playerView.getPlayer();
                        androidx.media3.exoplayer.d dVar3 = bVar.a.a;
                        if (player != dVar3) {
                            playerView.setPlayer(dVar3);
                        }
                        playerView.setResizeMode(0);
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            dVar2 = dVar;
            androidx.compose.ui.viewinterop.b.b(function1, dVar2, null, function2, (Function1) objY3, bVarI, ((i2 << 3) & 112) | 3072, 4);
        }
        androidx.compose.runtime.e eVarZ2 = bVarI.Z();
        if (eVarZ2 != null) {
            eVarZ2.d = new Function2() { // from class: qir
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    sir.j(dVar2, bVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void k(x3r x3rVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-526833316);
        int i2 = (bVarI.M(x3rVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            h6n.b(erz.a(R.drawable.spr_ic_refresh, 0, bVarI), "retry", dw.a(j.r(androidx.compose.ui.d.a.b, 24.0f), ((Number) xe0.b(x3rVar instanceof x3r.d ? 1.0f : 0.0f, yi0.e(120, 0, null, 6), "stream_retry_alpha", null, bVarI, 3120, 20).getValue()).floatValue()), ((lib0) bVarI.O(oib0.a)).a0, bVarI, 48, 0);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new gir(i, 0, x3rVar);
        }
    }

    public static final void l(a4r a4rVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-966810400);
        int i2 = (bVarI.M(a4rVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                a4r a4rVar2 = !Intrinsics.g(a4rVar, a4r.c.a) ? a4rVar : null;
                if (a4rVar2 == null) {
                    a4rVar2 = a4r.b.a;
                }
                objY = m.b(a4rVar2);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            boolean z = (i2 & 14) == 4;
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new e(a4rVar, ytwVar, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, a4rVar, (Function2) objY2);
            a4r.c cVar = a4r.c.a;
            final a4r a4rVar3 = !Intrinsics.g(a4rVar, cVar) ? a4rVar : null;
            if (a4rVar3 == null) {
                a4rVar3 = (a4r) ytwVar.getValue();
            }
            hh0.e(!Intrinsics.g(a4rVar, cVar), null, f.f(yi0.e(180, 0, null, 6), 2), f.g(yi0.e(180, 0, null, 6), 2), null, pp8.b(231981832, new gaj() { // from class: uhr
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), j58.c(0.7f, j58.b), zk40.a);
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarB);
                        yka.k.getClass();
                        tsr.a aVar3 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar3);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        a4r.b bVar = a4r.b.a;
                        a4r a4rVar4 = a4rVar3;
                        if (Intrinsics.g(a4rVar4, bVar)) {
                            aVar2.N(2055997871);
                            sir.g(0, aVar2);
                            aVar2.H();
                        } else if (Intrinsics.g(a4rVar4, a4r.a.a)) {
                            aVar2.N(2055999565);
                            sir.e(0, aVar2);
                            aVar2.H();
                        } else {
                            if (!Intrinsics.g(a4rVar4, a4r.c.a)) {
                                throw rg.a(2055995840, aVar2);
                            }
                            aVar2.N(-688471618);
                            aVar2.H();
                        }
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 200064, 18);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new vhr(a4rVar, i);
        }
    }

    public static final void m(final androidx.compose.ui.d dVar, final String str, final boolean z, final boolean z2, final khr khrVar, final float f, final Function1<? super ler, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(1684254564);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.b(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(khrVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.c(f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function1) ? 1048576 : 524288;
        }
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            androidx.compose.ui.d dVarG = j.g(dVar, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new rir();
                bVarI.r(objY);
            }
            t9g t9gVarQ = f.q((Function1) objY);
            n54.b bVar2 = ht.a.j;
            t9g t9gVarB = t9gVarQ.b(f.e(null, bVar2, 13));
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new ohr(0);
                bVarI.r(objY2);
            }
            hh0.b(l78.a, z, null, t9gVarB, f.u((Function1) objY2).b(f.m(null, bVar2, 13)), null, pp8.b(-2143184078, new gaj() { // from class: phr
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d dVarB = androidx.compose.foundation.a.b(j.g(d.a.b, 1.0f), r58.d(3426040389L), zk40.a);
                        qyd0 qyd0Var = ejb0.a;
                        d dVarG2 = h.g(dVarB, f, ((cjb0) aVar3.O(qyd0Var)).c);
                        d160 d160VarA = b160.a(new kw0.i(((cjb0) aVar3.O(qyd0Var)).c, true, new hw0()), ht.a.k, aVar3, 48);
                        int iHashCode2 = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC2 = c.c(aVar3, dVarG2);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar4);
                        } else {
                            aVar3.p();
                        }
                        hlh0.a(aVar3, d160VarA, yka.a.f);
                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                        }
                        hlh0.a(aVar3, dVarC2, yka.a.d);
                        gfr.a(z2, aVar3, 0);
                        lkf0.d(str, null, ((lib0) aVar3.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar3.O(kjb0.a)).m, aVar3, 0, 0, 131066);
                        aVar3.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 1600518 | ((i2 >> 3) & 112), 18);
            bVar = bVarI;
            int i3 = i2 >> 9;
            jhr.d(khrVar, f, function1, bVar, (i3 & 7168) | (i3 & 112) | 6 | (i3 & 896));
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qhr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sir.m(dVar, str, z, z2, khrVar, f, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final Float n(x3r x3rVar) {
        if (Intrinsics.g(x3rVar, x3r.c.a)) {
            return Float.valueOf(0.0f);
        }
        if (Intrinsics.g(x3rVar, x3r.b.a)) {
            return Float.valueOf(1.0f);
        }
        if (!Intrinsics.g(x3rVar, x3r.d.a) && !Intrinsics.g(x3rVar, x3r.a.a)) {
            uhc.a();
        }
        return null;
    }

    public static final j90 o(el10 el10Var, float f, float f2, float f3) {
        float fD = kotlin.ranges.f.d(f, 0.0f, 1.0f);
        j90 j90VarA = m90.a();
        int i = 0;
        for (Object obj : el10Var.a) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.b.q();
                throw null;
            }
            fl10 fl10Var = (fl10) obj;
            fl10 fl10Var2 = el10Var.b.get(i);
            float f4 = fl10Var.a;
            float fA = hxa.a(fl10Var2.a, f4, fD, f4);
            float f5 = fl10Var.b;
            float fA2 = hxa.a(fl10Var2.b, f5, fD, f5);
            if (i == 0) {
                j90VarA.a(fA * f2, fA2 * f3);
            } else {
                j90VarA.c(fA * f2, fA2 * f3);
            }
            i = i2;
        }
        j90VarA.close();
        return j90VarA;
    }
}
