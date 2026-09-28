package androidx.compose.animation;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.ay0;
import defpackage.dtg0;
import defpackage.dxd0;
import defpackage.f0b;
import defpackage.fz60;
import defpackage.gjs;
import defpackage.hlh0;
import defpackage.ht;
import defpackage.iaj;
import defpackage.ix90;
import defpackage.jx90;
import defpackage.ls7;
import defpackage.n30;
import defpackage.ne00;
import defpackage.nf0;
import defpackage.of0;
import defpackage.pf0;
import defpackage.pp8;
import defpackage.qj40;
import defpackage.qlr;
import defpackage.rtw;
import defpackage.s9g;
import defpackage.tsr;
import defpackage.vtg0;
import defpackage.x5a0;
import defpackage.yi0;
import defpackage.yka;
import defpackage.ytw;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: androidx.compose.animation.a$a, reason: collision with other inner class name */
    public static final class C0035a<S> extends qlr implements Function1<d<S>, f0b> {
        public static final C0035a a = new C0035a(1);

        @Override // kotlin.jvm.functions.Function1
        public final f0b invoke(Object obj) {
            return a.d(f.f(yi0.e(220, 90, null, 4), 2).b(f.h(yi0.e(220, 90, null, 4), 0.92f, 0L, 4)), f.g(yi0.e(90, 0, null, 6), 2));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    public static final class b<S> extends qlr implements Function1<S, S> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final S invoke(S s) {
            return s;
        }
    }

    public static final class c extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ S a;
        public final /* synthetic */ androidx.compose.ui.d b;
        public final /* synthetic */ Function1<d<S>, f0b> c;
        public final /* synthetic */ ht d;
        public final /* synthetic */ String e;
        public final /* synthetic */ Function1<S, Object> f;
        public final /* synthetic */ iaj<pf0, S, androidx.compose.runtime.a, Integer, Unit> i;
        public final /* synthetic */ int v;
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(S s, androidx.compose.ui.d dVar, Function1<? super d<S>, f0b> function1, ht htVar, String str, Function1<? super S, ? extends Object> function2, iaj<? super pf0, ? super S, ? super androidx.compose.runtime.a, ? super Integer, Unit> iajVar, int i, int i2) {
            super(2);
            this.a = s;
            this.b = dVar;
            this.c = function1;
            this.d = htVar;
            this.e = str;
            this.f = function2;
            this.i = iajVar;
            this.v = i;
            this.w = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            a.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, aVar, qj40.a(this.v | 1), this.w);
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(dtg0 dtg0Var, androidx.compose.ui.d dVar, Function1 function1, ht htVar, Function1 function2, iaj iajVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.b bVar;
        defpackage.o oVar;
        Function1 function3;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl;
        SnapshotStateList snapshotStateList;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2;
        dtg0.a aVarC;
        androidx.compose.runtime.b bVar2;
        boolean z;
        Function1 function4 = function1;
        androidx.compose.runtime.b bVarI = aVar.i(511725103);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dtg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(htVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        iaj iajVar2 = iajVar;
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(iajVar2) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z2 || objY == c0042a) {
                objY = new AnimatedContentTransitionScopeImpl(dtg0Var, htVar);
                bVarI.r(objY);
            }
            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl3 = (AnimatedContentTransitionScopeImpl) objY;
            boolean z3 = i3 == 4;
            Object objY2 = bVarI.y();
            Object obj = objY2;
            if (z3 || objY2 == c0042a) {
                Object[] objArr = {dtg0Var.a.V()};
                SnapshotStateList snapshotStateList2 = new SnapshotStateList();
                snapshotStateList2.addAll(ay0.S(objArr));
                bVarI.r(snapshotStateList2);
                obj = snapshotStateList2;
            }
            SnapshotStateList snapshotStateList3 = (SnapshotStateList) obj;
            boolean z4 = i3 == 4;
            Object objY3 = bVarI.y();
            if (z4 || objY3 == c0042a) {
                objY3 = fz60.b();
                bVarI.r(objY3);
            }
            rtw rtwVar = (rtw) objY3;
            defpackage.o oVar2 = dtg0Var.a;
            ytw ytwVar = dtg0Var.d;
            if (!snapshotStateList3.contains(oVar2.V())) {
                snapshotStateList3.clear();
                snapshotStateList3.add(oVar2.V());
            }
            x5a0 x5a0Var = (x5a0) ytwVar;
            if (Intrinsics.g(oVar2.V(), x5a0Var.getValue())) {
                if (snapshotStateList3.size() != 1 || !Intrinsics.g(snapshotStateList3.get(0), oVar2.V())) {
                    snapshotStateList3.clear();
                    snapshotStateList3.add(oVar2.V());
                }
                if (rtwVar.e != 1 || rtwVar.b(oVar2.V())) {
                    rtwVar.g();
                }
                animatedContentTransitionScopeImpl3.b = htVar;
            }
            if (Intrinsics.g(oVar2.V(), x5a0Var.getValue()) || snapshotStateList3.contains(x5a0Var.getValue())) {
                oVar = oVar2;
            } else {
                ListIterator listIterator = snapshotStateList3.listIterator();
                int i4 = 0;
                while (true) {
                    dxd0 dxd0Var = (dxd0) listIterator;
                    oVar = oVar2;
                    if (!dxd0Var.hasNext()) {
                        i4 = -1;
                        break;
                    } else {
                        if (Intrinsics.g(function2.invoke(dxd0Var.next()), function2.invoke(x5a0Var.getValue()))) {
                            break;
                        }
                        i4++;
                        oVar2 = oVar;
                    }
                }
                if (i4 == -1) {
                    snapshotStateList3.add(x5a0Var.getValue());
                } else {
                    snapshotStateList3.set(i4, x5a0Var.getValue());
                    Unit unit = Unit.a;
                }
            }
            if (rtwVar.b(x5a0Var.getValue()) && rtwVar.b(oVar.V())) {
                bVarI.N(1969054067);
                bVarI.X(false);
                function3 = function4;
                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl3;
            } else {
                bVarI.N(1966468977);
                rtwVar.g();
                int size = snapshotStateList3.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = snapshotStateList3.get(i5);
                    rtwVar.m(obj2, pp8.b(-23915175, new androidx.compose.animation.b(dtg0Var, obj2, function4, animatedContentTransitionScopeImpl3, snapshotStateList3, iajVar2), bVarI));
                    i5++;
                    iajVar2 = iajVar;
                    function4 = function4;
                    animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl3;
                }
                function3 = function4;
                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl3;
                bVarI.X(false);
            }
            boolean zM = bVarI.M(dtg0Var.f()) | bVarI.M(animatedContentTransitionScopeImpl);
            Object objY4 = bVarI.y();
            if (zM || objY4 == c0042a) {
                objY4 = (f0b) function3.invoke(animatedContentTransitionScopeImpl);
                bVarI.r(objY4);
            }
            f0b f0bVar = (f0b) objY4;
            dtg0<S> dtg0Var2 = animatedContentTransitionScopeImpl.a;
            boolean zM2 = bVarI.M(animatedContentTransitionScopeImpl);
            Object objY5 = bVarI.y();
            if (zM2 || objY5 == c0042a) {
                objY5 = androidx.compose.runtime.m.b(Boolean.FALSE);
                bVarI.r(objY5);
            }
            ytw ytwVar2 = (ytw) objY5;
            ytw ytwVarC = androidx.compose.runtime.m.c(f0bVar.d, bVarI);
            if (Intrinsics.g(dtg0Var2.a.V(), ((x5a0) dtg0Var2.d).getValue())) {
                ytwVar2.setValue(Boolean.FALSE);
            } else if (ytwVarC.getValue() != 0) {
                ytwVar2.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) ytwVar2.getValue()).booleanValue();
            androidx.compose.ui.d dVarB = androidx.compose.ui.d.a.b;
            if (zBooleanValue) {
                bVarI.N(1353180665);
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl4 = animatedContentTransitionScopeImpl;
                snapshotStateList = snapshotStateList3;
                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl4;
                androidx.compose.runtime.b bVar3 = bVarI;
                aVarC = vtg0.c(animatedContentTransitionScopeImpl4.a, gjs.i, null, bVar3, 0, 2);
                boolean zM3 = bVar3.M(aVarC);
                Object objY6 = bVar3.y();
                if (zM3 || objY6 == c0042a) {
                    ix90 ix90Var = (ix90) ytwVarC.getValue();
                    if (ix90Var == null || ix90Var.a()) {
                        dVarB = ls7.b(dVarB);
                    }
                    bVar3.r(dVarB);
                    objY6 = dVarB;
                }
                dVarB = (androidx.compose.ui.d) objY6;
                bVar3.X(false);
                bVar2 = bVar3;
            } else {
                snapshotStateList = snapshotStateList3;
                androidx.compose.runtime.b bVar4 = bVarI;
                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                bVar4.N(1353446707);
                bVar4.X(false);
                aVarC = null;
                bVar2 = bVar4;
            }
            androidx.compose.ui.d dVarN = dVar.n(dVarB.n(new AnimatedContentTransitionScopeImpl.SizeModifierElement(aVarC, ytwVarC, animatedContentTransitionScopeImpl2)));
            Object objY7 = bVar2.y();
            if (objY7 == c0042a) {
                objY7 = new androidx.compose.animation.c(animatedContentTransitionScopeImpl2);
                bVar2.r(objY7);
            }
            androidx.compose.animation.c cVar = (androidx.compose.animation.c) objY7;
            int iHashCode = Long.hashCode(bVar2.T);
            ne00 ne00VarS = bVar2.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVar2, dVarN);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVar2.D();
            if (bVar2.S) {
                bVar2.F(aVar2);
            } else {
                bVar2.p();
            }
            hlh0.a(bVar2, cVar, yka.a.f);
            hlh0.a(bVar2, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVar2, iHashCode, c1350a);
            }
            hlh0.a(bVar2, dVarC, yka.a.d);
            bVar2.N(-860173498);
            int size2 = snapshotStateList.size();
            int i6 = 0;
            while (i6 < size2) {
                SnapshotStateList snapshotStateList4 = snapshotStateList;
                Object obj3 = snapshotStateList4.get(i6);
                bVar2.C(-2026002954, function2.invoke(obj3));
                Function2 function5 = (Function2) rtwVar.d(obj3);
                if (function5 == null) {
                    bVar2.N(1618454323);
                    z = false;
                    bVar2.X(false);
                } else {
                    z = false;
                    bVar2.N(-2026001778);
                    function5.invoke(bVar2, 0);
                    bVar2.X(false);
                    Unit unit2 = Unit.a;
                }
                bVar2.X(z);
                i6++;
                snapshotStateList = snapshotStateList4;
            }
            bVar2.X(false);
            bVar2.X(true);
            bVar = bVar2;
        } else {
            androidx.compose.runtime.b bVar5 = bVarI;
            bVar5.G();
            bVar = bVar5;
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new nf0(dtg0Var, dVar, function1, htVar, function2, iajVar, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0118  */
    /* JADX WARN: Code duplicated, block: B:104:0x013b  */
    /* JADX WARN: Code duplicated, block: B:107:0x014c  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x009f  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0101  */
    /* JADX WARN: Code duplicated, block: B:96:0x0104  */
    /* JADX WARN: Code duplicated, block: B:98:0x0108  */
    public static final <S> void b(S s, androidx.compose.ui.d dVar, Function1<? super d<S>, f0b> function1, ht htVar, String str, Function1<? super S, ? extends Object> function2, iaj<? super pf0, ? super S, ? super androidx.compose.runtime.a, ? super Integer, Unit> iajVar, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        int i4;
        Function1<? super d<S>, f0b> function3;
        int i5;
        int i6;
        ht htVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        androidx.compose.ui.d dVar2;
        Function1<? super S, ? extends Object> function4;
        Function1<? super d<S>, f0b> function5;
        ht htVar3;
        String str2;
        androidx.compose.runtime.e eVarZ;
        androidx.compose.ui.d dVar3;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        int i12;
        Function1<? super d<S>, f0b> function6;
        ht htVar4;
        Function1<? super S, ? extends Object> function7;
        Object objY;
        Object objY2;
        int i13;
        androidx.compose.runtime.b bVarI = aVar.i(1501828832);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? bVarI.M(s) : bVarI.A(s) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 == 0) {
            if ((i & 48) == 0) {
                i3 |= bVarI.M(dVar) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function3 = function1;
                    if (bVarI.A(function3)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        htVar2 = htVar;
                        if (bVarI.M(htVar2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            if (bVarI.M(str)) {
                                i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 32;
                        if (i10 != 0) {
                            if ((196608 & i) == 0) {
                                if (bVarI.A(function2)) {
                                    i11 = 131072;
                                } else {
                                    i11 = 65536;
                                }
                                i3 |= i11;
                            }
                            if ((1572864 & i) == 0) {
                                if (bVarI.A(iajVar)) {
                                    i13 = 1048576;
                                } else {
                                    i13 = 524288;
                                }
                                i3 |= i13;
                            }
                            if ((599187 & i3) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (bVarI.q(i3 & 1, z)) {
                                if (i14 != 0) {
                                    dVar3 = androidx.compose.ui.d.a.b;
                                } else {
                                    dVar3 = dVar;
                                }
                                c0042a = androidx.compose.runtime.a.C0041a.a;
                                if (i4 != 0) {
                                    objY2 = bVarI.y();
                                    if (objY2 == c0042a) {
                                        objY2 = C0035a.a;
                                        bVarI.r(objY2);
                                    }
                                    function6 = (Function1) objY2;
                                    i12 = i10;
                                } else {
                                    i12 = i10;
                                    function6 = function3;
                                }
                                if (i6 != 0) {
                                    htVar4 = ht.a.a;
                                } else {
                                    htVar4 = htVar2;
                                }
                                if (i8 != 0) {
                                    str2 = "AnimatedContent";
                                } else {
                                    str2 = str;
                                }
                                if (i12 != 0) {
                                    objY = bVarI.y();
                                    if (objY == c0042a) {
                                        objY = b.a;
                                        bVarI.r(objY);
                                    }
                                    function7 = (Function1) objY;
                                } else {
                                    function7 = function2;
                                }
                                dtg0 dtg0VarF = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                                int i15 = i3 & 8176;
                                int i16 = i3 >> 3;
                                a(dtg0VarF, dVar3, function6, htVar4, function7, iajVar, bVarI, i15 | (57344 & i16) | (i16 & 458752));
                                dVar2 = dVar3;
                                function5 = function6;
                                htVar3 = htVar4;
                                function4 = function7;
                            } else {
                                bVarI.G();
                                dVar2 = dVar;
                                function4 = function2;
                                function5 = function3;
                                htVar3 = htVar2;
                                str2 = str;
                            }
                            eVarZ = bVarI.Z();
                            if (eVarZ != null) {
                                eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                            }
                        }
                        i3 |= 196608;
                        if ((1572864 & i) == 0) {
                            if (bVarI.A(iajVar)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i3 |= i13;
                        }
                        if ((599187 & i3) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bVarI.q(i3 & 1, z)) {
                            if (i14 != 0) {
                                dVar3 = androidx.compose.ui.d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            c0042a = androidx.compose.runtime.a.C0041a.a;
                            if (i4 != 0) {
                                objY2 = bVarI.y();
                                if (objY2 == c0042a) {
                                    objY2 = C0035a.a;
                                    bVarI.r(objY2);
                                }
                                function6 = (Function1) objY2;
                                i12 = i10;
                            } else {
                                i12 = i10;
                                function6 = function3;
                            }
                            if (i6 != 0) {
                                htVar4 = ht.a.a;
                            } else {
                                htVar4 = htVar2;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedContent";
                            } else {
                                str2 = str;
                            }
                            if (i12 != 0) {
                                objY = bVarI.y();
                                if (objY == c0042a) {
                                    objY = b.a;
                                    bVarI.r(objY);
                                }
                                function7 = (Function1) objY;
                            } else {
                                function7 = function2;
                            }
                            dtg0 dtg0VarF2 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            int i17 = i3 & 8176;
                            int i18 = i3 >> 3;
                            a(dtg0VarF2, dVar3, function6, htVar4, function7, iajVar, bVarI, i17 | (57344 & i18) | (i18 & 458752));
                            dVar2 = dVar3;
                            function5 = function6;
                            htVar3 = htVar4;
                            function4 = function7;
                        } else {
                            bVarI.G();
                            dVar2 = dVar;
                            function4 = function2;
                            function5 = function3;
                            htVar3 = htVar2;
                            str2 = str;
                        }
                        eVarZ = bVarI.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                        }
                    }
                    i3 |= 24576;
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            if (bVarI.A(function2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            if (bVarI.A(iajVar)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i3 |= i13;
                        }
                        if ((599187 & i3) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bVarI.q(i3 & 1, z)) {
                            if (i14 != 0) {
                                dVar3 = androidx.compose.ui.d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            c0042a = androidx.compose.runtime.a.C0041a.a;
                            if (i4 != 0) {
                                objY2 = bVarI.y();
                                if (objY2 == c0042a) {
                                    objY2 = C0035a.a;
                                    bVarI.r(objY2);
                                }
                                function6 = (Function1) objY2;
                                i12 = i10;
                            } else {
                                i12 = i10;
                                function6 = function3;
                            }
                            if (i6 != 0) {
                                htVar4 = ht.a.a;
                            } else {
                                htVar4 = htVar2;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedContent";
                            } else {
                                str2 = str;
                            }
                            if (i12 != 0) {
                                objY = bVarI.y();
                                if (objY == c0042a) {
                                    objY = b.a;
                                    bVarI.r(objY);
                                }
                                function7 = (Function1) objY;
                            } else {
                                function7 = function2;
                            }
                            dtg0 dtg0VarF3 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            int i19 = i3 & 8176;
                            int i110 = i3 >> 3;
                            a(dtg0VarF3, dVar3, function6, htVar4, function7, iajVar, bVarI, i19 | (57344 & i110) | (i110 & 458752));
                            dVar2 = dVar3;
                            function5 = function6;
                            htVar3 = htVar4;
                            function4 = function7;
                        } else {
                            bVarI.G();
                            dVar2 = dVar;
                            function4 = function2;
                            function5 = function3;
                            htVar3 = htVar2;
                            str2 = str;
                        }
                        eVarZ = bVarI.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                        }
                    }
                    i3 |= 196608;
                    if ((1572864 & i) == 0) {
                        if (bVarI.A(iajVar)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i3 & 1, z)) {
                        if (i14 != 0) {
                            dVar3 = androidx.compose.ui.d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (i4 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = C0035a.a;
                                bVarI.r(objY2);
                            }
                            function6 = (Function1) objY2;
                            i12 = i10;
                        } else {
                            i12 = i10;
                            function6 = function3;
                        }
                        if (i6 != 0) {
                            htVar4 = ht.a.a;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i12 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = b.a;
                                bVarI.r(objY);
                            }
                            function7 = (Function1) objY;
                        } else {
                            function7 = function2;
                        }
                        dtg0 dtg0VarF4 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i111 = i3 & 8176;
                        int i112 = i3 >> 3;
                        a(dtg0VarF4, dVar3, function6, htVar4, function7, iajVar, bVarI, i111 | (57344 & i112) | (i112 & 458752));
                        dVar2 = dVar3;
                        function5 = function6;
                        htVar3 = htVar4;
                        function4 = function7;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        function4 = function2;
                        function5 = function3;
                        htVar3 = htVar2;
                        str2 = str;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                    }
                }
                i3 |= 3072;
                htVar2 = htVar;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (bVarI.M(str)) {
                            i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            if (bVarI.A(function2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            if (bVarI.A(iajVar)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i3 |= i13;
                        }
                        if ((599187 & i3) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bVarI.q(i3 & 1, z)) {
                            if (i14 != 0) {
                                dVar3 = androidx.compose.ui.d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            c0042a = androidx.compose.runtime.a.C0041a.a;
                            if (i4 != 0) {
                                objY2 = bVarI.y();
                                if (objY2 == c0042a) {
                                    objY2 = C0035a.a;
                                    bVarI.r(objY2);
                                }
                                function6 = (Function1) objY2;
                                i12 = i10;
                            } else {
                                i12 = i10;
                                function6 = function3;
                            }
                            if (i6 != 0) {
                                htVar4 = ht.a.a;
                            } else {
                                htVar4 = htVar2;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedContent";
                            } else {
                                str2 = str;
                            }
                            if (i12 != 0) {
                                objY = bVarI.y();
                                if (objY == c0042a) {
                                    objY = b.a;
                                    bVarI.r(objY);
                                }
                                function7 = (Function1) objY;
                            } else {
                                function7 = function2;
                            }
                            dtg0 dtg0VarF5 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            int i113 = i3 & 8176;
                            int i114 = i3 >> 3;
                            a(dtg0VarF5, dVar3, function6, htVar4, function7, iajVar, bVarI, i113 | (57344 & i114) | (i114 & 458752));
                            dVar2 = dVar3;
                            function5 = function6;
                            htVar3 = htVar4;
                            function4 = function7;
                        } else {
                            bVarI.G();
                            dVar2 = dVar;
                            function4 = function2;
                            function5 = function3;
                            htVar3 = htVar2;
                            str2 = str;
                        }
                        eVarZ = bVarI.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                        }
                    }
                    i3 |= 196608;
                    if ((1572864 & i) == 0) {
                        if (bVarI.A(iajVar)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i3 & 1, z)) {
                        if (i14 != 0) {
                            dVar3 = androidx.compose.ui.d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (i4 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = C0035a.a;
                                bVarI.r(objY2);
                            }
                            function6 = (Function1) objY2;
                            i12 = i10;
                        } else {
                            i12 = i10;
                            function6 = function3;
                        }
                        if (i6 != 0) {
                            htVar4 = ht.a.a;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i12 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = b.a;
                                bVarI.r(objY);
                            }
                            function7 = (Function1) objY;
                        } else {
                            function7 = function2;
                        }
                        dtg0 dtg0VarF6 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i115 = i3 & 8176;
                        int i116 = i3 >> 3;
                        a(dtg0VarF6, dVar3, function6, htVar4, function7, iajVar, bVarI, i115 | (57344 & i116) | (i116 & 458752));
                        dVar2 = dVar3;
                        function5 = function6;
                        htVar3 = htVar4;
                        function4 = function7;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        function4 = function2;
                        function5 = function3;
                        htVar3 = htVar2;
                        str2 = str;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                    }
                }
                i3 |= 24576;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        if (bVarI.A(function2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        if (bVarI.A(iajVar)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i3 & 1, z)) {
                        if (i14 != 0) {
                            dVar3 = androidx.compose.ui.d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (i4 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = C0035a.a;
                                bVarI.r(objY2);
                            }
                            function6 = (Function1) objY2;
                            i12 = i10;
                        } else {
                            i12 = i10;
                            function6 = function3;
                        }
                        if (i6 != 0) {
                            htVar4 = ht.a.a;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i12 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = b.a;
                                bVarI.r(objY);
                            }
                            function7 = (Function1) objY;
                        } else {
                            function7 = function2;
                        }
                        dtg0 dtg0VarF7 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i117 = i3 & 8176;
                        int i118 = i3 >> 3;
                        a(dtg0VarF7, dVar3, function6, htVar4, function7, iajVar, bVarI, i117 | (57344 & i118) | (i118 & 458752));
                        dVar2 = dVar3;
                        function5 = function6;
                        htVar3 = htVar4;
                        function4 = function7;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        function4 = function2;
                        function5 = function3;
                        htVar3 = htVar2;
                        str2 = str;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) == 0) {
                    if (bVarI.A(iajVar)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i3 & 1, z)) {
                    if (i14 != 0) {
                        dVar3 = androidx.compose.ui.d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (i4 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = C0035a.a;
                            bVarI.r(objY2);
                        }
                        function6 = (Function1) objY2;
                        i12 = i10;
                    } else {
                        i12 = i10;
                        function6 = function3;
                    }
                    if (i6 != 0) {
                        htVar4 = ht.a.a;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i12 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = b.a;
                            bVarI.r(objY);
                        }
                        function7 = (Function1) objY;
                    } else {
                        function7 = function2;
                    }
                    dtg0 dtg0VarF8 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i119 = i3 & 8176;
                    int i1110 = i3 >> 3;
                    a(dtg0VarF8, dVar3, function6, htVar4, function7, iajVar, bVarI, i119 | (57344 & i1110) | (i1110 & 458752));
                    dVar2 = dVar3;
                    function5 = function6;
                    htVar3 = htVar4;
                    function4 = function7;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    function4 = function2;
                    function5 = function3;
                    htVar3 = htVar2;
                    str2 = str;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                }
            }
            i3 |= 384;
            function3 = function1;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    htVar2 = htVar;
                    if (bVarI.M(htVar2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (bVarI.M(str)) {
                            i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            if (bVarI.A(function2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            if (bVarI.A(iajVar)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i3 |= i13;
                        }
                        if ((599187 & i3) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bVarI.q(i3 & 1, z)) {
                            if (i14 != 0) {
                                dVar3 = androidx.compose.ui.d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            c0042a = androidx.compose.runtime.a.C0041a.a;
                            if (i4 != 0) {
                                objY2 = bVarI.y();
                                if (objY2 == c0042a) {
                                    objY2 = C0035a.a;
                                    bVarI.r(objY2);
                                }
                                function6 = (Function1) objY2;
                                i12 = i10;
                            } else {
                                i12 = i10;
                                function6 = function3;
                            }
                            if (i6 != 0) {
                                htVar4 = ht.a.a;
                            } else {
                                htVar4 = htVar2;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedContent";
                            } else {
                                str2 = str;
                            }
                            if (i12 != 0) {
                                objY = bVarI.y();
                                if (objY == c0042a) {
                                    objY = b.a;
                                    bVarI.r(objY);
                                }
                                function7 = (Function1) objY;
                            } else {
                                function7 = function2;
                            }
                            dtg0 dtg0VarF9 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            int i1111 = i3 & 8176;
                            int i1112 = i3 >> 3;
                            a(dtg0VarF9, dVar3, function6, htVar4, function7, iajVar, bVarI, i1111 | (57344 & i1112) | (i1112 & 458752));
                            dVar2 = dVar3;
                            function5 = function6;
                            htVar3 = htVar4;
                            function4 = function7;
                        } else {
                            bVarI.G();
                            dVar2 = dVar;
                            function4 = function2;
                            function5 = function3;
                            htVar3 = htVar2;
                            str2 = str;
                        }
                        eVarZ = bVarI.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                        }
                    }
                    i3 |= 196608;
                    if ((1572864 & i) == 0) {
                        if (bVarI.A(iajVar)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i3 & 1, z)) {
                        if (i14 != 0) {
                            dVar3 = androidx.compose.ui.d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (i4 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = C0035a.a;
                                bVarI.r(objY2);
                            }
                            function6 = (Function1) objY2;
                            i12 = i10;
                        } else {
                            i12 = i10;
                            function6 = function3;
                        }
                        if (i6 != 0) {
                            htVar4 = ht.a.a;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i12 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = b.a;
                                bVarI.r(objY);
                            }
                            function7 = (Function1) objY;
                        } else {
                            function7 = function2;
                        }
                        dtg0 dtg0VarF10 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i1113 = i3 & 8176;
                        int i1114 = i3 >> 3;
                        a(dtg0VarF10, dVar3, function6, htVar4, function7, iajVar, bVarI, i1113 | (57344 & i1114) | (i1114 & 458752));
                        dVar2 = dVar3;
                        function5 = function6;
                        htVar3 = htVar4;
                        function4 = function7;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        function4 = function2;
                        function5 = function3;
                        htVar3 = htVar2;
                        str2 = str;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                    }
                }
                i3 |= 24576;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        if (bVarI.A(function2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        if (bVarI.A(iajVar)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i3 & 1, z)) {
                        if (i14 != 0) {
                            dVar3 = androidx.compose.ui.d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (i4 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = C0035a.a;
                                bVarI.r(objY2);
                            }
                            function6 = (Function1) objY2;
                            i12 = i10;
                        } else {
                            i12 = i10;
                            function6 = function3;
                        }
                        if (i6 != 0) {
                            htVar4 = ht.a.a;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i12 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = b.a;
                                bVarI.r(objY);
                            }
                            function7 = (Function1) objY;
                        } else {
                            function7 = function2;
                        }
                        dtg0 dtg0VarF11 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i1115 = i3 & 8176;
                        int i1116 = i3 >> 3;
                        a(dtg0VarF11, dVar3, function6, htVar4, function7, iajVar, bVarI, i1115 | (57344 & i1116) | (i1116 & 458752));
                        dVar2 = dVar3;
                        function5 = function6;
                        htVar3 = htVar4;
                        function4 = function7;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        function4 = function2;
                        function5 = function3;
                        htVar3 = htVar2;
                        str2 = str;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) == 0) {
                    if (bVarI.A(iajVar)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i3 & 1, z)) {
                    if (i14 != 0) {
                        dVar3 = androidx.compose.ui.d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (i4 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = C0035a.a;
                            bVarI.r(objY2);
                        }
                        function6 = (Function1) objY2;
                        i12 = i10;
                    } else {
                        i12 = i10;
                        function6 = function3;
                    }
                    if (i6 != 0) {
                        htVar4 = ht.a.a;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i12 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = b.a;
                            bVarI.r(objY);
                        }
                        function7 = (Function1) objY;
                    } else {
                        function7 = function2;
                    }
                    dtg0 dtg0VarF12 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i1117 = i3 & 8176;
                    int i1118 = i3 >> 3;
                    a(dtg0VarF12, dVar3, function6, htVar4, function7, iajVar, bVarI, i1117 | (57344 & i1118) | (i1118 & 458752));
                    dVar2 = dVar3;
                    function5 = function6;
                    htVar3 = htVar4;
                    function4 = function7;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    function4 = function2;
                    function5 = function3;
                    htVar3 = htVar2;
                    str2 = str;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                }
            }
            i3 |= 3072;
            htVar2 = htVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (bVarI.M(str)) {
                        i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        if (bVarI.A(function2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        if (bVarI.A(iajVar)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i3 & 1, z)) {
                        if (i14 != 0) {
                            dVar3 = androidx.compose.ui.d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (i4 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = C0035a.a;
                                bVarI.r(objY2);
                            }
                            function6 = (Function1) objY2;
                            i12 = i10;
                        } else {
                            i12 = i10;
                            function6 = function3;
                        }
                        if (i6 != 0) {
                            htVar4 = ht.a.a;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i12 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = b.a;
                                bVarI.r(objY);
                            }
                            function7 = (Function1) objY;
                        } else {
                            function7 = function2;
                        }
                        dtg0 dtg0VarF13 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i1119 = i3 & 8176;
                        int i11110 = i3 >> 3;
                        a(dtg0VarF13, dVar3, function6, htVar4, function7, iajVar, bVarI, i1119 | (57344 & i11110) | (i11110 & 458752));
                        dVar2 = dVar3;
                        function5 = function6;
                        htVar3 = htVar4;
                        function4 = function7;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        function4 = function2;
                        function5 = function3;
                        htVar3 = htVar2;
                        str2 = str;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) == 0) {
                    if (bVarI.A(iajVar)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i3 & 1, z)) {
                    if (i14 != 0) {
                        dVar3 = androidx.compose.ui.d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (i4 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = C0035a.a;
                            bVarI.r(objY2);
                        }
                        function6 = (Function1) objY2;
                        i12 = i10;
                    } else {
                        i12 = i10;
                        function6 = function3;
                    }
                    if (i6 != 0) {
                        htVar4 = ht.a.a;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i12 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = b.a;
                            bVarI.r(objY);
                        }
                        function7 = (Function1) objY;
                    } else {
                        function7 = function2;
                    }
                    dtg0 dtg0VarF14 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i11111 = i3 & 8176;
                    int i11112 = i3 >> 3;
                    a(dtg0VarF14, dVar3, function6, htVar4, function7, iajVar, bVarI, i11111 | (57344 & i11112) | (i11112 & 458752));
                    dVar2 = dVar3;
                    function5 = function6;
                    htVar3 = htVar4;
                    function4 = function7;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    function4 = function2;
                    function5 = function3;
                    htVar3 = htVar2;
                    str2 = str;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                }
            }
            i3 |= 24576;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    if (bVarI.A(function2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    if (bVarI.A(iajVar)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i3 & 1, z)) {
                    if (i14 != 0) {
                        dVar3 = androidx.compose.ui.d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (i4 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = C0035a.a;
                            bVarI.r(objY2);
                        }
                        function6 = (Function1) objY2;
                        i12 = i10;
                    } else {
                        i12 = i10;
                        function6 = function3;
                    }
                    if (i6 != 0) {
                        htVar4 = ht.a.a;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i12 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = b.a;
                            bVarI.r(objY);
                        }
                        function7 = (Function1) objY;
                    } else {
                        function7 = function2;
                    }
                    dtg0 dtg0VarF15 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i11113 = i3 & 8176;
                    int i11114 = i3 >> 3;
                    a(dtg0VarF15, dVar3, function6, htVar4, function7, iajVar, bVarI, i11113 | (57344 & i11114) | (i11114 & 458752));
                    dVar2 = dVar3;
                    function5 = function6;
                    htVar3 = htVar4;
                    function4 = function7;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    function4 = function2;
                    function5 = function3;
                    htVar3 = htVar2;
                    str2 = str;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                }
            }
            i3 |= 196608;
            if ((1572864 & i) == 0) {
                if (bVarI.A(iajVar)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                if (i14 != 0) {
                    dVar3 = androidx.compose.ui.d.a.b;
                } else {
                    dVar3 = dVar;
                }
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (i4 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = C0035a.a;
                        bVarI.r(objY2);
                    }
                    function6 = (Function1) objY2;
                    i12 = i10;
                } else {
                    i12 = i10;
                    function6 = function3;
                }
                if (i6 != 0) {
                    htVar4 = ht.a.a;
                } else {
                    htVar4 = htVar2;
                }
                if (i8 != 0) {
                    str2 = "AnimatedContent";
                } else {
                    str2 = str;
                }
                if (i12 != 0) {
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = b.a;
                        bVarI.r(objY);
                    }
                    function7 = (Function1) objY;
                } else {
                    function7 = function2;
                }
                dtg0 dtg0VarF16 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                int i11115 = i3 & 8176;
                int i11116 = i3 >> 3;
                a(dtg0VarF16, dVar3, function6, htVar4, function7, iajVar, bVarI, i11115 | (57344 & i11116) | (i11116 & 458752));
                dVar2 = dVar3;
                function5 = function6;
                htVar3 = htVar4;
                function4 = function7;
            } else {
                bVarI.G();
                dVar2 = dVar;
                function4 = function2;
                function5 = function3;
                htVar3 = htVar2;
                str2 = str;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
            }
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                function3 = function1;
                if (bVarI.A(function3)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    htVar2 = htVar;
                    if (bVarI.M(htVar2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (bVarI.M(str)) {
                            i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            if (bVarI.A(function2)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((1572864 & i) == 0) {
                            if (bVarI.A(iajVar)) {
                                i13 = 1048576;
                            } else {
                                i13 = 524288;
                            }
                            i3 |= i13;
                        }
                        if ((599187 & i3) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bVarI.q(i3 & 1, z)) {
                            if (i14 != 0) {
                                dVar3 = androidx.compose.ui.d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            c0042a = androidx.compose.runtime.a.C0041a.a;
                            if (i4 != 0) {
                                objY2 = bVarI.y();
                                if (objY2 == c0042a) {
                                    objY2 = C0035a.a;
                                    bVarI.r(objY2);
                                }
                                function6 = (Function1) objY2;
                                i12 = i10;
                            } else {
                                i12 = i10;
                                function6 = function3;
                            }
                            if (i6 != 0) {
                                htVar4 = ht.a.a;
                            } else {
                                htVar4 = htVar2;
                            }
                            if (i8 != 0) {
                                str2 = "AnimatedContent";
                            } else {
                                str2 = str;
                            }
                            if (i12 != 0) {
                                objY = bVarI.y();
                                if (objY == c0042a) {
                                    objY = b.a;
                                    bVarI.r(objY);
                                }
                                function7 = (Function1) objY;
                            } else {
                                function7 = function2;
                            }
                            dtg0 dtg0VarF17 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            int i11117 = i3 & 8176;
                            int i11118 = i3 >> 3;
                            a(dtg0VarF17, dVar3, function6, htVar4, function7, iajVar, bVarI, i11117 | (57344 & i11118) | (i11118 & 458752));
                            dVar2 = dVar3;
                            function5 = function6;
                            htVar3 = htVar4;
                            function4 = function7;
                        } else {
                            bVarI.G();
                            dVar2 = dVar;
                            function4 = function2;
                            function5 = function3;
                            htVar3 = htVar2;
                            str2 = str;
                        }
                        eVarZ = bVarI.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                        }
                    }
                    i3 |= 196608;
                    if ((1572864 & i) == 0) {
                        if (bVarI.A(iajVar)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i3 & 1, z)) {
                        if (i14 != 0) {
                            dVar3 = androidx.compose.ui.d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (i4 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = C0035a.a;
                                bVarI.r(objY2);
                            }
                            function6 = (Function1) objY2;
                            i12 = i10;
                        } else {
                            i12 = i10;
                            function6 = function3;
                        }
                        if (i6 != 0) {
                            htVar4 = ht.a.a;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i12 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = b.a;
                                bVarI.r(objY);
                            }
                            function7 = (Function1) objY;
                        } else {
                            function7 = function2;
                        }
                        dtg0 dtg0VarF18 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i11119 = i3 & 8176;
                        int i111110 = i3 >> 3;
                        a(dtg0VarF18, dVar3, function6, htVar4, function7, iajVar, bVarI, i11119 | (57344 & i111110) | (i111110 & 458752));
                        dVar2 = dVar3;
                        function5 = function6;
                        htVar3 = htVar4;
                        function4 = function7;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        function4 = function2;
                        function5 = function3;
                        htVar3 = htVar2;
                        str2 = str;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                    }
                }
                i3 |= 24576;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        if (bVarI.A(function2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        if (bVarI.A(iajVar)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i3 & 1, z)) {
                        if (i14 != 0) {
                            dVar3 = androidx.compose.ui.d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (i4 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = C0035a.a;
                                bVarI.r(objY2);
                            }
                            function6 = (Function1) objY2;
                            i12 = i10;
                        } else {
                            i12 = i10;
                            function6 = function3;
                        }
                        if (i6 != 0) {
                            htVar4 = ht.a.a;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i12 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = b.a;
                                bVarI.r(objY);
                            }
                            function7 = (Function1) objY;
                        } else {
                            function7 = function2;
                        }
                        dtg0 dtg0VarF19 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i111111 = i3 & 8176;
                        int i111112 = i3 >> 3;
                        a(dtg0VarF19, dVar3, function6, htVar4, function7, iajVar, bVarI, i111111 | (57344 & i111112) | (i111112 & 458752));
                        dVar2 = dVar3;
                        function5 = function6;
                        htVar3 = htVar4;
                        function4 = function7;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        function4 = function2;
                        function5 = function3;
                        htVar3 = htVar2;
                        str2 = str;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) == 0) {
                    if (bVarI.A(iajVar)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i3 & 1, z)) {
                    if (i14 != 0) {
                        dVar3 = androidx.compose.ui.d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (i4 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = C0035a.a;
                            bVarI.r(objY2);
                        }
                        function6 = (Function1) objY2;
                        i12 = i10;
                    } else {
                        i12 = i10;
                        function6 = function3;
                    }
                    if (i6 != 0) {
                        htVar4 = ht.a.a;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i12 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = b.a;
                            bVarI.r(objY);
                        }
                        function7 = (Function1) objY;
                    } else {
                        function7 = function2;
                    }
                    dtg0 dtg0VarF110 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i111113 = i3 & 8176;
                    int i111114 = i3 >> 3;
                    a(dtg0VarF110, dVar3, function6, htVar4, function7, iajVar, bVarI, i111113 | (57344 & i111114) | (i111114 & 458752));
                    dVar2 = dVar3;
                    function5 = function6;
                    htVar3 = htVar4;
                    function4 = function7;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    function4 = function2;
                    function5 = function3;
                    htVar3 = htVar2;
                    str2 = str;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                }
            }
            i3 |= 3072;
            htVar2 = htVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (bVarI.M(str)) {
                        i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        if (bVarI.A(function2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        if (bVarI.A(iajVar)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i3 & 1, z)) {
                        if (i14 != 0) {
                            dVar3 = androidx.compose.ui.d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (i4 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = C0035a.a;
                                bVarI.r(objY2);
                            }
                            function6 = (Function1) objY2;
                            i12 = i10;
                        } else {
                            i12 = i10;
                            function6 = function3;
                        }
                        if (i6 != 0) {
                            htVar4 = ht.a.a;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i12 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = b.a;
                                bVarI.r(objY);
                            }
                            function7 = (Function1) objY;
                        } else {
                            function7 = function2;
                        }
                        dtg0 dtg0VarF111 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i111115 = i3 & 8176;
                        int i111116 = i3 >> 3;
                        a(dtg0VarF111, dVar3, function6, htVar4, function7, iajVar, bVarI, i111115 | (57344 & i111116) | (i111116 & 458752));
                        dVar2 = dVar3;
                        function5 = function6;
                        htVar3 = htVar4;
                        function4 = function7;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        function4 = function2;
                        function5 = function3;
                        htVar3 = htVar2;
                        str2 = str;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) == 0) {
                    if (bVarI.A(iajVar)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i3 & 1, z)) {
                    if (i14 != 0) {
                        dVar3 = androidx.compose.ui.d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (i4 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = C0035a.a;
                            bVarI.r(objY2);
                        }
                        function6 = (Function1) objY2;
                        i12 = i10;
                    } else {
                        i12 = i10;
                        function6 = function3;
                    }
                    if (i6 != 0) {
                        htVar4 = ht.a.a;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i12 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = b.a;
                            bVarI.r(objY);
                        }
                        function7 = (Function1) objY;
                    } else {
                        function7 = function2;
                    }
                    dtg0 dtg0VarF112 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i111117 = i3 & 8176;
                    int i111118 = i3 >> 3;
                    a(dtg0VarF112, dVar3, function6, htVar4, function7, iajVar, bVarI, i111117 | (57344 & i111118) | (i111118 & 458752));
                    dVar2 = dVar3;
                    function5 = function6;
                    htVar3 = htVar4;
                    function4 = function7;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    function4 = function2;
                    function5 = function3;
                    htVar3 = htVar2;
                    str2 = str;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                }
            }
            i3 |= 24576;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    if (bVarI.A(function2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    if (bVarI.A(iajVar)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i3 & 1, z)) {
                    if (i14 != 0) {
                        dVar3 = androidx.compose.ui.d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (i4 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = C0035a.a;
                            bVarI.r(objY2);
                        }
                        function6 = (Function1) objY2;
                        i12 = i10;
                    } else {
                        i12 = i10;
                        function6 = function3;
                    }
                    if (i6 != 0) {
                        htVar4 = ht.a.a;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i12 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = b.a;
                            bVarI.r(objY);
                        }
                        function7 = (Function1) objY;
                    } else {
                        function7 = function2;
                    }
                    dtg0 dtg0VarF113 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i111119 = i3 & 8176;
                    int i1111110 = i3 >> 3;
                    a(dtg0VarF113, dVar3, function6, htVar4, function7, iajVar, bVarI, i111119 | (57344 & i1111110) | (i1111110 & 458752));
                    dVar2 = dVar3;
                    function5 = function6;
                    htVar3 = htVar4;
                    function4 = function7;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    function4 = function2;
                    function5 = function3;
                    htVar3 = htVar2;
                    str2 = str;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                }
            }
            i3 |= 196608;
            if ((1572864 & i) == 0) {
                if (bVarI.A(iajVar)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                if (i14 != 0) {
                    dVar3 = androidx.compose.ui.d.a.b;
                } else {
                    dVar3 = dVar;
                }
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (i4 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = C0035a.a;
                        bVarI.r(objY2);
                    }
                    function6 = (Function1) objY2;
                    i12 = i10;
                } else {
                    i12 = i10;
                    function6 = function3;
                }
                if (i6 != 0) {
                    htVar4 = ht.a.a;
                } else {
                    htVar4 = htVar2;
                }
                if (i8 != 0) {
                    str2 = "AnimatedContent";
                } else {
                    str2 = str;
                }
                if (i12 != 0) {
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = b.a;
                        bVarI.r(objY);
                    }
                    function7 = (Function1) objY;
                } else {
                    function7 = function2;
                }
                dtg0 dtg0VarF114 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                int i1111111 = i3 & 8176;
                int i1111112 = i3 >> 3;
                a(dtg0VarF114, dVar3, function6, htVar4, function7, iajVar, bVarI, i1111111 | (57344 & i1111112) | (i1111112 & 458752));
                dVar2 = dVar3;
                function5 = function6;
                htVar3 = htVar4;
                function4 = function7;
            } else {
                bVarI.G();
                dVar2 = dVar;
                function4 = function2;
                function5 = function3;
                htVar3 = htVar2;
                str2 = str;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
            }
        }
        i3 |= 384;
        function3 = function1;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                htVar2 = htVar;
                if (bVarI.M(htVar2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (bVarI.M(str)) {
                        i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        if (bVarI.A(function2)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((1572864 & i) == 0) {
                        if (bVarI.A(iajVar)) {
                            i13 = 1048576;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i3 & 1, z)) {
                        if (i14 != 0) {
                            dVar3 = androidx.compose.ui.d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (i4 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = C0035a.a;
                                bVarI.r(objY2);
                            }
                            function6 = (Function1) objY2;
                            i12 = i10;
                        } else {
                            i12 = i10;
                            function6 = function3;
                        }
                        if (i6 != 0) {
                            htVar4 = ht.a.a;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i8 != 0) {
                            str2 = "AnimatedContent";
                        } else {
                            str2 = str;
                        }
                        if (i12 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = b.a;
                                bVarI.r(objY);
                            }
                            function7 = (Function1) objY;
                        } else {
                            function7 = function2;
                        }
                        dtg0 dtg0VarF115 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i1111113 = i3 & 8176;
                        int i1111114 = i3 >> 3;
                        a(dtg0VarF115, dVar3, function6, htVar4, function7, iajVar, bVarI, i1111113 | (57344 & i1111114) | (i1111114 & 458752));
                        dVar2 = dVar3;
                        function5 = function6;
                        htVar3 = htVar4;
                        function4 = function7;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        function4 = function2;
                        function5 = function3;
                        htVar3 = htVar2;
                        str2 = str;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                    }
                }
                i3 |= 196608;
                if ((1572864 & i) == 0) {
                    if (bVarI.A(iajVar)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i3 & 1, z)) {
                    if (i14 != 0) {
                        dVar3 = androidx.compose.ui.d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (i4 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = C0035a.a;
                            bVarI.r(objY2);
                        }
                        function6 = (Function1) objY2;
                        i12 = i10;
                    } else {
                        i12 = i10;
                        function6 = function3;
                    }
                    if (i6 != 0) {
                        htVar4 = ht.a.a;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i12 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = b.a;
                            bVarI.r(objY);
                        }
                        function7 = (Function1) objY;
                    } else {
                        function7 = function2;
                    }
                    dtg0 dtg0VarF116 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i1111115 = i3 & 8176;
                    int i1111116 = i3 >> 3;
                    a(dtg0VarF116, dVar3, function6, htVar4, function7, iajVar, bVarI, i1111115 | (57344 & i1111116) | (i1111116 & 458752));
                    dVar2 = dVar3;
                    function5 = function6;
                    htVar3 = htVar4;
                    function4 = function7;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    function4 = function2;
                    function5 = function3;
                    htVar3 = htVar2;
                    str2 = str;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                }
            }
            i3 |= 24576;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    if (bVarI.A(function2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    if (bVarI.A(iajVar)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i3 & 1, z)) {
                    if (i14 != 0) {
                        dVar3 = androidx.compose.ui.d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (i4 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = C0035a.a;
                            bVarI.r(objY2);
                        }
                        function6 = (Function1) objY2;
                        i12 = i10;
                    } else {
                        i12 = i10;
                        function6 = function3;
                    }
                    if (i6 != 0) {
                        htVar4 = ht.a.a;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i12 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = b.a;
                            bVarI.r(objY);
                        }
                        function7 = (Function1) objY;
                    } else {
                        function7 = function2;
                    }
                    dtg0 dtg0VarF117 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i1111117 = i3 & 8176;
                    int i1111118 = i3 >> 3;
                    a(dtg0VarF117, dVar3, function6, htVar4, function7, iajVar, bVarI, i1111117 | (57344 & i1111118) | (i1111118 & 458752));
                    dVar2 = dVar3;
                    function5 = function6;
                    htVar3 = htVar4;
                    function4 = function7;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    function4 = function2;
                    function5 = function3;
                    htVar3 = htVar2;
                    str2 = str;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                }
            }
            i3 |= 196608;
            if ((1572864 & i) == 0) {
                if (bVarI.A(iajVar)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                if (i14 != 0) {
                    dVar3 = androidx.compose.ui.d.a.b;
                } else {
                    dVar3 = dVar;
                }
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (i4 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = C0035a.a;
                        bVarI.r(objY2);
                    }
                    function6 = (Function1) objY2;
                    i12 = i10;
                } else {
                    i12 = i10;
                    function6 = function3;
                }
                if (i6 != 0) {
                    htVar4 = ht.a.a;
                } else {
                    htVar4 = htVar2;
                }
                if (i8 != 0) {
                    str2 = "AnimatedContent";
                } else {
                    str2 = str;
                }
                if (i12 != 0) {
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = b.a;
                        bVarI.r(objY);
                    }
                    function7 = (Function1) objY;
                } else {
                    function7 = function2;
                }
                dtg0 dtg0VarF118 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                int i1111119 = i3 & 8176;
                int i11111110 = i3 >> 3;
                a(dtg0VarF118, dVar3, function6, htVar4, function7, iajVar, bVarI, i1111119 | (57344 & i11111110) | (i11111110 & 458752));
                dVar2 = dVar3;
                function5 = function6;
                htVar3 = htVar4;
                function4 = function7;
            } else {
                bVarI.G();
                dVar2 = dVar;
                function4 = function2;
                function5 = function3;
                htVar3 = htVar2;
                str2 = str;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
            }
        }
        i3 |= 3072;
        htVar2 = htVar;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                if (bVarI.M(str)) {
                    i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    if (bVarI.A(function2)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((1572864 & i) == 0) {
                    if (bVarI.A(iajVar)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i3 & 1, z)) {
                    if (i14 != 0) {
                        dVar3 = androidx.compose.ui.d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (i4 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = C0035a.a;
                            bVarI.r(objY2);
                        }
                        function6 = (Function1) objY2;
                        i12 = i10;
                    } else {
                        i12 = i10;
                        function6 = function3;
                    }
                    if (i6 != 0) {
                        htVar4 = ht.a.a;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i8 != 0) {
                        str2 = "AnimatedContent";
                    } else {
                        str2 = str;
                    }
                    if (i12 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = b.a;
                            bVarI.r(objY);
                        }
                        function7 = (Function1) objY;
                    } else {
                        function7 = function2;
                    }
                    dtg0 dtg0VarF119 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i11111111 = i3 & 8176;
                    int i11111112 = i3 >> 3;
                    a(dtg0VarF119, dVar3, function6, htVar4, function7, iajVar, bVarI, i11111111 | (57344 & i11111112) | (i11111112 & 458752));
                    dVar2 = dVar3;
                    function5 = function6;
                    htVar3 = htVar4;
                    function4 = function7;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    function4 = function2;
                    function5 = function3;
                    htVar3 = htVar2;
                    str2 = str;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
                }
            }
            i3 |= 196608;
            if ((1572864 & i) == 0) {
                if (bVarI.A(iajVar)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                if (i14 != 0) {
                    dVar3 = androidx.compose.ui.d.a.b;
                } else {
                    dVar3 = dVar;
                }
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (i4 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = C0035a.a;
                        bVarI.r(objY2);
                    }
                    function6 = (Function1) objY2;
                    i12 = i10;
                } else {
                    i12 = i10;
                    function6 = function3;
                }
                if (i6 != 0) {
                    htVar4 = ht.a.a;
                } else {
                    htVar4 = htVar2;
                }
                if (i8 != 0) {
                    str2 = "AnimatedContent";
                } else {
                    str2 = str;
                }
                if (i12 != 0) {
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = b.a;
                        bVarI.r(objY);
                    }
                    function7 = (Function1) objY;
                } else {
                    function7 = function2;
                }
                dtg0 dtg0VarF1110 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                int i11111113 = i3 & 8176;
                int i11111114 = i3 >> 3;
                a(dtg0VarF1110, dVar3, function6, htVar4, function7, iajVar, bVarI, i11111113 | (57344 & i11111114) | (i11111114 & 458752));
                dVar2 = dVar3;
                function5 = function6;
                htVar3 = htVar4;
                function4 = function7;
            } else {
                bVarI.G();
                dVar2 = dVar;
                function4 = function2;
                function5 = function3;
                htVar3 = htVar2;
                str2 = str;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
            }
        }
        i3 |= 24576;
        i10 = i2 & 32;
        if (i10 != 0) {
            if ((196608 & i) == 0) {
                if (bVarI.A(function2)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((1572864 & i) == 0) {
                if (bVarI.A(iajVar)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                if (i14 != 0) {
                    dVar3 = androidx.compose.ui.d.a.b;
                } else {
                    dVar3 = dVar;
                }
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (i4 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = C0035a.a;
                        bVarI.r(objY2);
                    }
                    function6 = (Function1) objY2;
                    i12 = i10;
                } else {
                    i12 = i10;
                    function6 = function3;
                }
                if (i6 != 0) {
                    htVar4 = ht.a.a;
                } else {
                    htVar4 = htVar2;
                }
                if (i8 != 0) {
                    str2 = "AnimatedContent";
                } else {
                    str2 = str;
                }
                if (i12 != 0) {
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = b.a;
                        bVarI.r(objY);
                    }
                    function7 = (Function1) objY;
                } else {
                    function7 = function2;
                }
                dtg0 dtg0VarF1111 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                int i11111115 = i3 & 8176;
                int i11111116 = i3 >> 3;
                a(dtg0VarF1111, dVar3, function6, htVar4, function7, iajVar, bVarI, i11111115 | (57344 & i11111116) | (i11111116 & 458752));
                dVar2 = dVar3;
                function5 = function6;
                htVar3 = htVar4;
                function4 = function7;
            } else {
                bVarI.G();
                dVar2 = dVar;
                function4 = function2;
                function5 = function3;
                htVar3 = htVar2;
                str2 = str;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
            }
        }
        i3 |= 196608;
        if ((1572864 & i) == 0) {
            if (bVarI.A(iajVar)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i3 |= i13;
        }
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            if (i14 != 0) {
                dVar3 = androidx.compose.ui.d.a.b;
            } else {
                dVar3 = dVar;
            }
            c0042a = androidx.compose.runtime.a.C0041a.a;
            if (i4 != 0) {
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = C0035a.a;
                    bVarI.r(objY2);
                }
                function6 = (Function1) objY2;
                i12 = i10;
            } else {
                i12 = i10;
                function6 = function3;
            }
            if (i6 != 0) {
                htVar4 = ht.a.a;
            } else {
                htVar4 = htVar2;
            }
            if (i8 != 0) {
                str2 = "AnimatedContent";
            } else {
                str2 = str;
            }
            if (i12 != 0) {
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = b.a;
                    bVarI.r(objY);
                }
                function7 = (Function1) objY;
            } else {
                function7 = function2;
            }
            dtg0 dtg0VarF1112 = vtg0.f(s, str2, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
            int i11111117 = i3 & 8176;
            int i11111118 = i3 >> 3;
            a(dtg0VarF1112, dVar3, function6, htVar4, function7, iajVar, bVarI, i11111117 | (57344 & i11111118) | (i11111118 & 458752));
            dVar2 = dVar3;
            function5 = function6;
            htVar3 = htVar4;
            function4 = function7;
        } else {
            bVarI.G();
            dVar2 = dVar;
            function4 = function2;
            function5 = function3;
            htVar3 = htVar2;
            str2 = str;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new c(s, dVar2, function5, htVar3, str2, function4, iajVar, i, i2);
        }
    }

    public static jx90 c(int i) {
        return new jx90((i & 1) != 0, of0.a);
    }

    public static final f0b d(s9g s9gVar, g gVar) {
        return new f0b(s9gVar, gVar, (jx90) null, 12);
    }
}
