package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetEntrance;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zrq {

    @c0d(c = "com.sportybet.feature.luckynumber.lotteryresult.presentation.LNLotteryResultScreenKt$LNLotteryResultScreen$1$1", f = "LNLotteryResultScreen.kt", l = {74}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ csq c;
        public final /* synthetic */ Function1<nvp, Unit> d;
        public final /* synthetic */ zzr e;

        /* JADX INFO: renamed from: zrq$a$a, reason: collision with other inner class name */
        public static final class C1421a<T> implements myh {
            public final /* synthetic */ Function1<nvp, Unit> a;
            public final /* synthetic */ v5b b;
            public final /* synthetic */ zzr c;

            /* JADX WARN: Multi-variable type inference failed */
            public C1421a(Function1<? super nvp, Unit> function1, v5b v5bVar, zzr zzrVar) {
                this.a = function1;
                this.b = v5bVar;
                this.c = zzrVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                lrq lrqVar = (lrq) obj;
                if (lrqVar instanceof lrq.a) {
                    this.a.invoke(((lrq.a) lrqVar).a);
                } else {
                    if (!Intrinsics.g(lrqVar, lrq.b.a)) {
                        uhc.a();
                        return null;
                    }
                    ej5.c(this.b, null, null, new yrq(this.c, null), 3);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(csq csqVar, Function1<? super nvp, Unit> function1, zzr zzrVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = csqVar;
            this.d = function1;
            this.e = zzrVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, this.e, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    throw l80.a(obj);
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            ku90<lrq> ku90Var = this.c.e;
            C1421a c1421a = new C1421a(this.d, v5bVar, this.e);
            this.b = null;
            this.a = 1;
            ku90Var.collect(c1421a, this);
            return y5bVar;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<krq, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(krq krqVar) {
            krq krqVar2 = krqVar;
            krqVar2.getClass();
            csq csqVar = (csq) this.receiver;
            ku90<lrq> ku90Var = csqVar.e;
            if (krqVar2 instanceof krq.c) {
                csqVar.c.a(Unit.a);
            } else if (krqVar2.equals(krq.a.a)) {
                ku90Var.a(new lrq.a(new nvp.f(3, (uf00) null)));
            } else if (krqVar2.equals(krq.d.a)) {
                csqVar.b.a(Unit.a);
                ku90Var.a(lrq.b.a);
            } else {
                if (!krqVar2.equals(krq.b.a)) {
                    uhc.a();
                    return null;
                }
                ku90Var.a(new lrq.a(new nvp.c(new q8r(csqVar.a.a, LNPlaceBetEntrance.SEARCH, null, null, null, null, 124))));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.lotteryresult.presentation.LNLotteryResultScreenKt$ResultList$1$1$2$1$1", f = "LNLotteryResultScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Function1<krq, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super krq, Unit> function1, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.a = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.invoke(krq.c.a);
            return Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:57:0x012e  */
    /* JADX WARN: Code duplicated, block: B:59:0x013c  */
    /* JADX WARN: Code duplicated, block: B:60:0x013e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0149  */
    /* JADX WARN: Code duplicated, block: B:68:0x016c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0176  */
    /* JADX WARN: Code duplicated, block: B:71:0x0187  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void a(final asq asqVar, zzr zzrVar, final Function1<? super krq, Unit> function1, androidx.compose.runtime.a aVar, final int i, final int i2) {
        zzr zzrVarA;
        int i3;
        boolean z;
        androidx.compose.runtime.b bVar;
        final zzr zzrVar2;
        e eVarZ;
        zzr zzrVar3;
        int i4;
        d.a aVar2;
        int iHashCode;
        tsr.a aVar3;
        yka.a.C1350a c1350a;
        a7r a7rVar;
        int i5;
        boolean z2;
        Object objY;
        boolean zG;
        l78 l78Var;
        boolean z3;
        zzr zzrVar4;
        boolean z4;
        Object objY2;
        int i6;
        androidx.compose.runtime.b bVarI = aVar.i(1152338684);
        int i7 = (bVarI.M(asqVar) ? 4 : 2) | i;
        if ((i2 & 2) == 0) {
            zzrVarA = zzrVar;
            int i8 = bVarI.M(zzrVarA) ? 32 : 16;
            i3 = i7 | i8;
            if ((i & 384) == 0) {
                if (bVarI.A(function1)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i3 |= i6;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                bVarI.A0();
                if ((i & 1) == 0 && !bVarI.h0()) {
                    bVarI.G();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                } else if ((i2 & 2) != 0) {
                    zzrVarA = e0s.a(0, 3, bVarI);
                    i3 &= -113;
                }
                zzrVar3 = zzrVarA;
                i4 = i3;
                bVarI.Y();
                aVar2 = d.a.b;
                d dVarB = androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), ((lib0) bVarI.O(oib0.a)).q0, zk40.a);
                i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                String str = asqVar.a;
                a7rVar = asqVar.b;
                i5 = i4 & 896;
                if (i5 == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objY = bVarI.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (z2 || objY == c0042a) {
                    objY = new Function0() { // from class: wrq
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(krq.a.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                e5u.a(null, null, str, (Function0) objY, null, bVarI, 0, 19);
                bVar = bVarI;
                zG = Intrinsics.g(a7rVar, a7r.a.a);
                l78Var = l78.a;
                if (zG) {
                    bVar.N(-1119250449);
                    d dVarA = l78Var.a(1.0f, aVar2, true);
                    if (i5 == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objY2 = bVar.y();
                    if (z4 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: xrq
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(krq.d.a);
                                return Unit.a;
                            }
                        };
                        bVar.r(objY2);
                    }
                    e7q.a(dVarA, 0L, 0L, 0L, 0L, (Function0) objY2, bVar, 0, 30);
                    bVar = bVar;
                    bVar.X(false);
                    z3 = true;
                } else {
                    z3 = true;
                    if (Intrinsics.g(a7rVar, a7r.b.a)) {
                        bVar.N(-1119043121);
                        imq.a(l78Var.a(1.0f, aVar2, true), bVar, 0);
                        bVar.X(false);
                    } else {
                        if (a7rVar instanceof a7r.c) {
                            throw igf0.a(bVar, 240988310, false);
                        }
                        bVar.N(-1118919617);
                        zzrVar4 = zzrVar3;
                        e(l78Var.a(1.0f, aVar2, true), zzrVar4, (a7r.c) a7rVar, function1, bVar, ((i4 << 3) & 7168) | (i4 & 112));
                        bVar.X(false);
                    }
                    bVar.X(z3);
                    zzrVar2 = zzrVar4;
                }
                zzrVar4 = zzrVar3;
                bVar.X(z3);
                zzrVar2 = zzrVar4;
            } else {
                bVar = bVarI;
                bVar.G();
                zzrVar2 = zzrVarA;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: nrq
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        zrq.a(asqVar, zzrVar2, function1, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        zzrVarA = zzrVar;
        i3 = i7 | i8;
        if ((i & 384) == 0) {
            if (bVarI.A(function1)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            bVarI.A0();
            if ((i & 1) == 0) {
                if ((i2 & 2) != 0) {
                    zzrVarA = e0s.a(0, 3, bVarI);
                    i3 &= -113;
                }
            } else if ((i2 & 2) != 0) {
                zzrVarA = e0s.a(0, 3, bVarI);
                i3 &= -113;
            }
            zzrVar3 = zzrVarA;
            i4 = i3;
            bVarI.Y();
            aVar2 = d.a.b;
            d dVarB2 = androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), ((lib0) bVarI.O(oib0.a)).q0, zk40.a);
            i78 i78VarA2 = g78.a(kw0.c, ht.a.m, bVarI, 0);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarB2);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            String str2 = asqVar.a;
            a7rVar = asqVar.b;
            i5 = i4 & 896;
            if (i5 == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
            if (z2) {
                objY = new Function0() { // from class: wrq
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(krq.a.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            } else {
                objY = new Function0() { // from class: wrq
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(krq.a.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            e5u.a(null, null, str2, (Function0) objY, null, bVarI, 0, 19);
            bVar = bVarI;
            zG = Intrinsics.g(a7rVar, a7r.a.a);
            l78Var = l78.a;
            if (zG) {
                bVar.N(-1119250449);
                d dVarA2 = l78Var.a(1.0f, aVar2, true);
                if (i5 == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objY2 = bVar.y();
                if (z4) {
                    objY2 = new Function0() { // from class: xrq
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(krq.d.a);
                            return Unit.a;
                        }
                    };
                    bVar.r(objY2);
                } else {
                    objY2 = new Function0() { // from class: xrq
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(krq.d.a);
                            return Unit.a;
                        }
                    };
                    bVar.r(objY2);
                }
                e7q.a(dVarA2, 0L, 0L, 0L, 0L, (Function0) objY2, bVar, 0, 30);
                bVar = bVar;
                bVar.X(false);
                z3 = true;
            } else {
                z3 = true;
                if (Intrinsics.g(a7rVar, a7r.b.a)) {
                    bVar.N(-1119043121);
                    imq.a(l78Var.a(1.0f, aVar2, true), bVar, 0);
                    bVar.X(false);
                } else {
                    if (a7rVar instanceof a7r.c) {
                        throw igf0.a(bVar, 240988310, false);
                    }
                    bVar.N(-1118919617);
                    zzrVar4 = zzrVar3;
                    e(l78Var.a(1.0f, aVar2, true), zzrVar4, (a7r.c) a7rVar, function1, bVar, ((i4 << 3) & 7168) | (i4 & 112));
                    bVar.X(false);
                }
                bVar.X(z3);
                zzrVar2 = zzrVar4;
            }
            zzrVar4 = zzrVar3;
            bVar.X(z3);
            zzrVar2 = zzrVar4;
        } else {
            bVar = bVarI;
            bVar.G();
            zzrVar2 = zzrVarA;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: nrq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zrq.a(asqVar, zzrVar2, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Function1<? super nvp, Unit> function1, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVar;
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(778199845);
        int i2 = (bVarI.A(function1) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            csq csqVar = (csq) p8i0.a(jq40.a(csq.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            ytw ytwVarC = wyh.c(csqVar.d, bVarI, 0, 7);
            zzr zzrVarA = e0s.a(0, 3, bVarI);
            Unit unit = Unit.a;
            boolean zA = bVarI.A(csqVar) | ((i2 & 14) == 4) | bVarI.M(zzrVarA);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new a(csqVar, function1, zzrVarA, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, unit, (Function2) objY);
            asq asqVar = (asq) ytwVarC.getValue();
            boolean zA2 = bVarI.A(csqVar);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                b bVar2 = new b(1, csqVar, csq.class, "handleAction", "handleAction(Lcom/sportybet/feature/luckynumber/lotteryresult/presentation/LNLotteryResultAction;)V", 0);
                bVarI.r(bVar2);
                objY2 = bVar2;
            }
            a(asqVar, zzrVarA, (Function1) ((chp) objY2), bVarI, 0, 0);
            bVar = bVarI;
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new xf8(i, function1);
        }
    }

    public static final void c(final LayoutWeightElement layoutWeightElement, final String str, final String str2, final l6r l6rVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-1345957104);
        int i2 = i | (bVarI.M(layoutWeightElement) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128) | (bVarI.M(l6rVar) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            i78 i78VarA = g78.a(new kw0.i(4.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, layoutWeightElement);
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
            d.a aVar3 = d.a.b;
            d dVarG = j.g(aVar3, 1.0f);
            qyd0 qyd0Var = kjb0.a;
            imf0 imf0Var = ((ijb0) bVarI.O(qyd0Var)).i;
            qyd0 qyd0Var2 = oib0.a;
            lkf0.d(str, dVarG, ((lib0) bVarI.O(qyd0Var2)).a, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, imf0Var, bVarI, ((i2 >> 3) & 14) | 48, 24960, 110584);
            lkf0.d(str2, j.g(aVar3, 1.0f), ((lib0) bVarI.O(qyd0Var2)).b, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ijb0) bVarI.O(qyd0Var)).o, bVarI, ((i2 >> 6) & 14) | 48, 24960, 110584);
            bVar = bVarI;
            p6r.b(l6rVar, null, bVar, (i2 >> 9) & 14);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, l6rVar, i) { // from class: vrq
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ l6r d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    zrq.c(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final c7r c7rVar, twd0 twd0Var, final Function0 function0, androidx.compose.runtime.a aVar, final int i) {
        final twd0 twd0Var2;
        int i2;
        twd0 twd0VarA;
        androidx.compose.runtime.b bVarI = aVar.i(-1195193600);
        int i3 = (bVarI.M(c7rVar) ? 4 : 2) | i | 16;
        if ((i & 384) == 0) {
            i3 |= bVarI.A(function0) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                i2 = i3 & (-113);
                twd0VarA = oer.a(c7rVar.h, bVarI);
            } else {
                bVarI.G();
                i2 = i3 & (-113);
                twd0VarA = twd0Var;
            }
            bVarI.Y();
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarG2 = j.g(aVar2, 1.0f);
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).n0;
            zk40.a aVar4 = zk40.a;
            d dVarD = androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(dVarG2, j, aVar4), false, null, null, mla.d(function0, bVarI, (i2 >> 3) & 112), 15);
            qyd0 qyd0Var2 = ejb0.a;
            d dVarF = h.f(dVarD, ((cjb0) bVarI.O(qyd0Var2)).d);
            twd0 twd0Var3 = twd0VarA;
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarF);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            dcq.a(h.j(aVar2, 0.0f, 0.0f, ((cjb0) bVarI.O(qyd0Var2)).d, 0.0f, 11), c7rVar.e, false, bVarI, 0, 4);
            c(new LayoutWeightElement(1.0f, true), c7rVar.c, c7rVar.f, c7rVar.g, bVarI, 0);
            ty0.a(bVarI, j.w(aVar2, ((cjb0) bVarI.O(qyd0Var2)).f));
            rer.a(h.j(aVar2, 0.0f, 0.0f, 4.0f, 0.0f, 11), (mer) twd0Var3.getValue(), bVarI, 6);
            h9n.a(erz.a(R.drawable.ic_arrow_right, 0, bVarI), "right_icon", j.r(aVar2, 12.0f), null, null, 0.0f, new gf4(((lib0) bVarI.O(qyd0Var)).O, 5), bVarI, 432, 56);
            bVarI.X(true);
            bVarI.X(true);
            g75.a(androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 0.5f), ((lib0) bVarI.O(qyd0Var)).A, aVar4), bVarI, 0);
            twd0Var2 = twd0Var3;
        } else {
            bVarI.G();
            twd0Var2 = twd0Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: urq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    zrq.d(c7rVar, twd0Var2, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final d dVar, final zzr zzrVar, final a7r.c cVar, final Function1<? super krq, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(1286379551);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(zzrVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(cVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d dVarG = j.g(dVar, 1.0f);
            boolean z = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: orq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        final Function1 function2;
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        a7r.c cVar2 = cVar;
                        Iterator<c7r> it = cVar2.a.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            function2 = function1;
                            if (!zHasNext) {
                                break;
                            }
                            final c7r next = it.next();
                            szrVar.i(inm.a("result_", next.a), "result_item", new op8(-389814789, new gaj() { // from class: mrq
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    a aVar2 = (a) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    ((gwr) obj2).getClass();
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        final Function1 function3 = function2;
                                        boolean zM = aVar2.M(function3);
                                        Object objY2 = aVar2.y();
                                        if (zM || objY2 == a.C0041a.a) {
                                            objY2 = new Function0() { // from class: trq
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    function3.invoke(krq.b.a);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar2.r(objY2);
                                        }
                                        zrq.d(next, null, (Function0) objY2, aVar2, 0);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, true));
                        }
                        int iOrdinal = cVar2.b.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                szrVar.i("loading", "loading", new op8(-869783851, new qrq(function2, 0), true));
                            } else {
                                if (iOrdinal != 2) {
                                    uhc.a();
                                    return null;
                                }
                                szrVar.i("errorLoadMore", "errorLoadMore", new op8(-1757821388, new gaj() { // from class: rrq
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        a aVar2 = (a) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((gwr) obj2).getClass();
                                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            final Function1 function3 = function2;
                                            boolean zM = aVar2.M(function3);
                                            Object objY2 = aVar2.y();
                                            if (zM || objY2 == a.C0041a.a) {
                                                objY2 = new Function0() { // from class: srq
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        function3.invoke(krq.d.a);
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar2.r(objY2);
                                            }
                                            fmq.a(0, aVar2, null, (Function0) objY2);
                                        } else {
                                            aVar2.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true));
                            }
                        }
                        szrVar.i("footer_space", "footer_space", ca9.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            bVar = bVarI;
            aur.a(dVarG, zzrVar, null, false, null, null, null, false, null, (Function1) objY, bVar, i2 & 112, 508);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: prq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zrq.e(dVar, zzrVar, cVar, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
