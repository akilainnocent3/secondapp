package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class n0a0 implements PointerInputEventHandler {
    public final /* synthetic */ j040 a;
    public final /* synthetic */ psw b;
    public final /* synthetic */ psw c;

    @c0d(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", l = {2437}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ u020 c;
        public final /* synthetic */ j040 d;
        public final /* synthetic */ i040 e;

        /* JADX INFO: renamed from: n0a0$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", l = {2438, 2450, 2473}, m = "invokeSuspend")
        public static final class C0886a extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
            public Object b;
            public i9f.b c;
            public aq40 d;
            public yp40 e;
            public int f;
            public /* synthetic */ Object i;
            public final /* synthetic */ j040 v;
            public final /* synthetic */ i040 w;
            public final /* synthetic */ v5b y;

            /* JADX INFO: renamed from: n0a0$a$a$a, reason: collision with other inner class name */
            @c0d(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", l = {2493}, m = "invokeSuspend")
            public static final class C0887a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ i040 b;
                public final /* synthetic */ yp40 c;
                public final /* synthetic */ i9f d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0887a(i040 i040Var, yp40 yp40Var, i9f i9fVar, v1b<? super C0887a> v1bVar) {
                    super(2, v1bVar);
                    this.b = i040Var;
                    this.c = yp40Var;
                    this.d = i9fVar;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C0887a(this.b, this.c, this.d, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C0887a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    if (i == 0) {
                        uj50.b(obj);
                        boolean z = this.c.a;
                        i040 i040Var = this.b;
                        psw pswVar = z ? i040Var.b : i040Var.c;
                        this.a = 1;
                        if (pswVar.a(this.d, this) == y5bVar) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0886a(j040 j040Var, i040 i040Var, v5b v5bVar, v1b<? super C0886a> v1bVar) {
                super(2, v1bVar);
                this.v = j040Var;
                this.w = i040Var;
                this.y = v5bVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0886a c0886a = new C0886a(this.v, this.w, this.y, v1bVar);
                c0886a.i = obj;
                return c0886a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
                return ((C0886a) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:38:0x0119  */
            /* JADX WARN: Code duplicated, block: B:40:0x0123  */
            /* JADX WARN: Code duplicated, block: B:41:0x012b  */
            /* JADX WARN: Code duplicated, block: B:58:0x0198  */
            /* JADX WARN: Code duplicated, block: B:59:0x01a1  */
            /* JADX WARN: Code duplicated, block: B:64:0x01db  */
            /* JADX WARN: Code duplicated, block: B:67:0x01e4 A[Catch: all -> 0x0030, CancellationException -> 0x01ea, TryCatch #0 {all -> 0x0030, blocks: (B:8:0x0028, B:65:0x01dc, B:67:0x01e4, B:69:0x01ec, B:72:0x01fb, B:61:0x01b7), top: B:79:0x0018 }] */
            /* JADX WARN: Code duplicated, block: B:69:0x01ec A[Catch: all -> 0x0030, CancellationException -> 0x01ea, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:8:0x0028, B:65:0x01dc, B:67:0x01e4, B:69:0x01ec, B:72:0x01fb, B:61:0x01b7), top: B:79:0x0018 }] */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                char c;
                vp1 vp1Var;
                Object objB;
                m020 m020Var;
                i9f.b bVar;
                final yp40 yp40Var;
                int i;
                Object objI;
                aq40 aq40Var;
                vp1 vp1Var2;
                Pair pair;
                boolean z;
                float fJ;
                i9f.b bVar2;
                yp40 yp40Var2;
                Object objI2;
                z6i0 viewConfiguration;
                int i2;
                float fH;
                i9f aVar;
                i040 i040Var = this.w;
                j040 j040Var = i040Var.a;
                final j040 j040Var2 = this.v;
                isw iswVar = j040Var2.l;
                ytw ytwVar = j040Var2.o;
                ytw ytwVar2 = j040Var2.n;
                y5b y5bVar = y5b.a;
                int i3 = this.f;
                v5b v5bVar = this.y;
                try {
                    if (i3 == 0) {
                        c = ' ';
                        uj50.b(obj);
                        vp1Var = (vp1) this.i;
                        this.i = vp1Var;
                        this.f = 1;
                        objB = u4f0.b(vp1Var, this, 2);
                        if (objB != y5bVar) {
                        }
                        return y5bVar;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                ib5.a("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            yp40Var2 = (yp40) this.b;
                            bVar2 = (i9f.b) this.i;
                            try {
                                uj50.b(obj);
                                bVar = bVar2;
                                objI2 = obj;
                                try {
                                    if (((Boolean) objI2).booleanValue()) {
                                        aVar = new i9f.c(bVar);
                                    } else {
                                        aVar = new i9f.a(bVar);
                                    }
                                    ((x5a0) ytwVar2).setValue(Boolean.FALSE);
                                } catch (CancellationException unused) {
                                    bVar2 = bVar;
                                    i9f.a aVar2 = new i9f.a(bVar2);
                                    ((x5a0) ytwVar2).setValue(Boolean.FALSE);
                                    aVar = aVar2;
                                }
                            } catch (CancellationException unused2) {
                                i9f.a aVar3 = new i9f.a(bVar2);
                                ((x5a0) ytwVar2).setValue(Boolean.FALSE);
                                aVar = aVar3;
                                j040Var2.p.invoke(Boolean.valueOf(yp40Var2.a));
                                ej5.c(v5bVar, null, null, new C0887a(i040Var, yp40Var2, aVar, null), 3);
                                return Unit.a;
                            }
                            j040Var2.p.invoke(Boolean.valueOf(yp40Var2.a));
                            ej5.c(v5bVar, null, null, new C0887a(i040Var, yp40Var2, aVar, null), 3);
                            return Unit.a;
                        }
                        yp40 yp40Var3 = this.e;
                        c = ' ';
                        aq40Var = this.d;
                        i9f.b bVar3 = this.c;
                        m020Var = (m020) this.b;
                        vp1Var2 = (vp1) this.i;
                        uj50.b(obj);
                        yp40Var = yp40Var3;
                        bVar = bVar3;
                        i = 2;
                        objI = obj;
                        pair = (Pair) objI;
                        if (pair != null) {
                            viewConfiguration = vp1Var2.getViewConfiguration();
                            i2 = m020Var.i;
                            float f = x7f.a;
                            if (i2 == i) {
                                fH = viewConfiguration.h() * x7f.a;
                            } else {
                                fH = viewConfiguration.h();
                            }
                            if (Math.abs(((t5a0) j040Var2.m).j() - aq40Var.a) < fH && Math.abs(((t5a0) iswVar).j() - aq40Var.a) < fH) {
                                float fFloatValue = ((Number) pair.b).floatValue();
                                yp40Var.a = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue() ? fFloatValue < 0.0f : fFloatValue >= 0.0f;
                                aq40Var.a = Float.intBitsToFloat((int) (ovo.h((m020) pair.a, false) >> c)) + aq40Var.a;
                            }
                        }
                        z = yp40Var.a;
                        float f2 = aq40Var.a;
                        if (z) {
                            fJ = ((t5a0) j040Var.l).j();
                        } else {
                            fJ = ((t5a0) j040Var.m).j();
                        }
                        j040Var.e(f2 - fJ, z);
                        ej5.c(v5bVar, null, null, new h040(i040Var, z, bVar, null), 3);
                        try {
                            ((x5a0) ytwVar2).setValue(Boolean.TRUE);
                            long j = m020Var.a;
                            Function1 function1 = new Function1() { // from class: m0a0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (ovo.h((m020) obj2, false) >> 32));
                                    boolean z2 = yp40Var.a;
                                    j040 j040Var3 = j040Var2;
                                    if (((Boolean) ((x5a0) j040Var3.o).getValue()).booleanValue()) {
                                        fIntBitsToFloat = -fIntBitsToFloat;
                                    }
                                    j040Var3.e(fIntBitsToFloat, z2);
                                    return Unit.a;
                                }
                            };
                            this.i = bVar;
                            this.b = yp40Var;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.f = 3;
                            objI2 = y8f.i(vp1Var2, j, function1, this);
                            if (objI2 != y5bVar) {
                                yp40Var2 = yp40Var;
                                if (((Boolean) objI2).booleanValue()) {
                                    aVar = new i9f.c(bVar);
                                } else {
                                    aVar = new i9f.a(bVar);
                                }
                                ((x5a0) ytwVar2).setValue(Boolean.FALSE);
                                j040Var2.p.invoke(Boolean.valueOf(yp40Var2.a));
                                ej5.c(v5bVar, null, null, new C0887a(i040Var, yp40Var2, aVar, null), 3);
                                return Unit.a;
                            }
                            return y5bVar;
                        } catch (CancellationException unused3) {
                            bVar2 = bVar;
                            yp40Var2 = yp40Var;
                            i9f.a aVar4 = new i9f.a(bVar2);
                            ((x5a0) ytwVar2).setValue(Boolean.FALSE);
                            aVar = aVar4;
                            j040Var2.p.invoke(Boolean.valueOf(yp40Var2.a));
                            ej5.c(v5bVar, null, null, new C0887a(i040Var, yp40Var2, aVar, null), 3);
                            return Unit.a;
                        }
                    }
                    c = ' ';
                    vp1Var = (vp1) this.i;
                    uj50.b(obj);
                    objB = obj;
                    vp1 vp1Var3 = vp1Var;
                    m020Var = (m020) objB;
                    bVar = new i9f.b();
                    aq40 aq40Var2 = new aq40();
                    float fD = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue() ? ((u5a0) j040Var2.k).D() - Float.intBitsToFloat((int) (m020Var.c >> c)) : Float.intBitsToFloat((int) (m020Var.c >> c));
                    aq40Var2.a = fD;
                    int iCompare = Float.compare(Math.abs(((t5a0) j040Var.l).j() - fD), Math.abs(((t5a0) j040Var.m).j() - fD));
                    yp40Var = new yp40();
                    yp40Var.a = iCompare == 0 ? ((t5a0) iswVar).j() > aq40Var2.a : iCompare < 0;
                    long j2 = m020Var.a;
                    int i4 = m020Var.i;
                    this.i = vp1Var3;
                    this.b = m020Var;
                    this.c = bVar;
                    this.d = aq40Var2;
                    this.e = yp40Var;
                    i = 2;
                    this.f = 2;
                    objI = d0a0.i(vp1Var3, j2, i4, this);
                    if (objI != y5bVar) {
                        aq40Var = aq40Var2;
                        vp1Var2 = vp1Var3;
                        pair = (Pair) objI;
                        if (pair != null) {
                            viewConfiguration = vp1Var2.getViewConfiguration();
                            i2 = m020Var.i;
                            float f3 = x7f.a;
                            if (i2 == i) {
                                fH = viewConfiguration.h() * x7f.a;
                            } else {
                                fH = viewConfiguration.h();
                            }
                            if (Math.abs(((t5a0) j040Var2.m).j() - aq40Var.a) < fH) {
                                float fFloatValue2 = ((Number) pair.b).floatValue();
                                yp40Var.a = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue() ? fFloatValue2 < 0.0f : fFloatValue2 >= 0.0f;
                                aq40Var.a = Float.intBitsToFloat((int) (ovo.h((m020) pair.a, false) >> c)) + aq40Var.a;
                            }
                        }
                        z = yp40Var.a;
                        float f4 = aq40Var.a;
                        if (z) {
                            fJ = ((t5a0) j040Var.l).j();
                        } else {
                            fJ = ((t5a0) j040Var.m).j();
                        }
                        j040Var.e(f4 - fJ, z);
                        ej5.c(v5bVar, null, null, new h040(i040Var, z, bVar, null), 3);
                        ((x5a0) ytwVar2).setValue(Boolean.TRUE);
                        long j3 = m020Var.a;
                        Function1 function2 = new Function1() { // from class: m0a0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (ovo.h((m020) obj2, false) >> 32));
                                boolean z2 = yp40Var.a;
                                j040 j040Var3 = j040Var2;
                                if (((Boolean) ((x5a0) j040Var3.o).getValue()).booleanValue()) {
                                    fIntBitsToFloat = -fIntBitsToFloat;
                                }
                                j040Var3.e(fIntBitsToFloat, z2);
                                return Unit.a;
                            }
                        };
                        this.i = bVar;
                        this.b = yp40Var;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.f = 3;
                        objI2 = y8f.i(vp1Var2, j3, function2, this);
                        if (objI2 != y5bVar) {
                            yp40Var2 = yp40Var;
                            if (((Boolean) objI2).booleanValue()) {
                                aVar = new i9f.c(bVar);
                            } else {
                                aVar = new i9f.a(bVar);
                            }
                            ((x5a0) ytwVar2).setValue(Boolean.FALSE);
                            j040Var2.p.invoke(Boolean.valueOf(yp40Var2.a));
                            ej5.c(v5bVar, null, null, new C0887a(i040Var, yp40Var2, aVar, null), 3);
                            return Unit.a;
                        }
                    }
                    return y5bVar;
                } catch (Throwable th) {
                    ((x5a0) ytwVar2).setValue(Boolean.FALSE);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u020 u020Var, j040 j040Var, i040 i040Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = u020Var;
            this.d = j040Var;
            this.e = i040Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, this.e, v1bVar);
            aVar.b = obj;
            return aVar;
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
                C0886a c0886a = new C0886a(this.d, this.e, (v5b) this.b, null);
                this.a = 1;
                if (dqi.b(this.c, c0886a, this) == y5bVar) {
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

    public n0a0(j040 j040Var, psw pswVar, psw pswVar2) {
        this.a = j040Var;
        this.b = pswVar;
        this.c = pswVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        psw pswVar = this.b;
        psw pswVar2 = this.c;
        j040 j040Var = this.a;
        Object objD = w5b.d(new a(u020Var, j040Var, new i040(j040Var, pswVar, pswVar2), null), v1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }
}
