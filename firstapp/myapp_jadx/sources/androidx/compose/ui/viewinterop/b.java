package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.asr;
import defpackage.hlh0;
import defpackage.ibs;
import defpackage.ina;
import defpackage.j3c;
import defpackage.kna;
import defpackage.mma;
import defpackage.mmd;
import defpackage.mt60;
import defpackage.ndt;
import defpackage.ne00;
import defpackage.nv60;
import defpackage.pt60;
import defpackage.qj40;
import defpackage.qlr;
import defpackage.tsr;
import defpackage.udt;
import defpackage.uhc;
import defpackage.w20;
import defpackage.wgz;
import defpackage.yka;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final h a = h.a;

    public static final class a extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ Function1<Context, T> a;
        public final /* synthetic */ androidx.compose.ui.d b;
        public final /* synthetic */ Function1<T, Unit> c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Context, ? extends T> function1, androidx.compose.ui.d dVar, Function1<? super T, Unit> function2, int i, int i2) {
            super(2);
            this.a = function1;
            this.b = dVar;
            this.c = function2;
            this.d = i;
            this.e = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            b.a(this.a, this.b, this.c, aVar, qj40.a(this.d | 1), this.e);
            return Unit.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.b$b, reason: collision with other inner class name */
    public static final class C0050b<T> extends qlr implements Function2<tsr, Function1<? super T, ? extends Unit>, Unit> {
        public static final C0050b a = new C0050b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(tsr tsrVar, Object obj) {
            b.d(tsrVar).setResetBlock((Function1) obj);
            return Unit.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class c<T> extends qlr implements Function2<tsr, Function1<? super T, ? extends Unit>, Unit> {
        public static final c a = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(tsr tsrVar, Object obj) {
            b.d(tsrVar).setUpdateBlock((Function1) obj);
            return Unit.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class d<T> extends qlr implements Function2<tsr, Function1<? super T, ? extends Unit>, Unit> {
        public static final d a = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(tsr tsrVar, Object obj) {
            b.d(tsrVar).setReleaseBlock((Function1) obj);
            return Unit.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class e<T> extends qlr implements Function2<tsr, Function1<? super T, ? extends Unit>, Unit> {
        public static final e a = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(tsr tsrVar, Object obj) {
            b.d(tsrVar).setUpdateBlock((Function1) obj);
            return Unit.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class f<T> extends qlr implements Function2<tsr, Function1<? super T, ? extends Unit>, Unit> {
        public static final f a = new f(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(tsr tsrVar, Object obj) {
            b.d(tsrVar).setReleaseBlock((Function1) obj);
            return Unit.a;
        }
    }

    public static final class g extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ Function1<Context, T> a;
        public final /* synthetic */ androidx.compose.ui.d b;
        public final /* synthetic */ Function1<T, Unit> c;
        public final /* synthetic */ Function1<T, Unit> d;
        public final /* synthetic */ Function1<T, Unit> e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super Context, ? extends T> function1, androidx.compose.ui.d dVar, Function1<? super T, Unit> function2, Function1<? super T, Unit> function3, Function1<? super T, Unit> function4, int i, int i2) {
            super(2);
            this.a = function1;
            this.b = dVar;
            this.c = function2;
            this.d = function3;
            this.e = function4;
            this.f = i;
            this.i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            b.b(this.a, this.b, this.c, this.d, this.e, aVar, qj40.a(this.f | 1), this.i);
            return Unit.a;
        }
    }

    public static final class h extends qlr implements Function1<View, Unit> {
        public static final h a = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            return Unit.a;
        }
    }

    public static final class i extends qlr implements Function0<tsr> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Function1<Context, T> b;
        public final /* synthetic */ mma c;
        public final /* synthetic */ mt60 d;
        public final /* synthetic */ int e;
        public final /* synthetic */ View f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Context context, Function1<? super Context, ? extends T> function1, mma mmaVar, mt60 mt60Var, int i, View view) {
            super(0);
            this.a = context;
            this.b = function1;
            this.c = mmaVar;
            this.d = mt60Var;
            this.e = i;
            this.f = view;
        }

        @Override // kotlin.jvm.functions.Function0
        public final tsr invoke() {
            KeyEvent.Callback callback = this.f;
            callback.getClass();
            return new ViewFactoryHolder(this.a, this.b, this.c, this.d, this.e, (wgz) callback).getLayoutNode();
        }
    }

    public static final class j extends qlr implements Function2<tsr, androidx.compose.ui.d, Unit> {
        public static final j a = new j(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(tsr tsrVar, androidx.compose.ui.d dVar) {
            b.d(tsrVar).setModifier(dVar);
            return Unit.a;
        }
    }

    public static final class k extends qlr implements Function2<tsr, mmd, Unit> {
        public static final k a = new k(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(tsr tsrVar, mmd mmdVar) {
            b.d(tsrVar).setDensity(mmdVar);
            return Unit.a;
        }
    }

    public static final class l extends qlr implements Function2<tsr, ibs, Unit> {
        public static final l a = new l(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(tsr tsrVar, ibs ibsVar) {
            b.d(tsrVar).setLifecycleOwner(ibsVar);
            return Unit.a;
        }
    }

    public static final class m extends qlr implements Function2<tsr, nv60, Unit> {
        public static final m a = new m(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(tsr tsrVar, nv60 nv60Var) {
            b.d(tsrVar).setSavedStateRegistryOwner(nv60Var);
            return Unit.a;
        }
    }

    public static final class n extends qlr implements Function2<tsr, asr, Unit> {
        public static final n a = new n(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(tsr tsrVar, asr asrVar) {
            int i;
            ViewFactoryHolder viewFactoryHolderD = b.d(tsrVar);
            int iOrdinal = asrVar.ordinal();
            if (iOrdinal != 0) {
                i = 1;
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
            } else {
                i = 0;
            }
            viewFactoryHolderD.setLayoutDirection(i);
            return Unit.a;
        }
    }

    public static final <T extends View> void a(Function1<? super Context, ? extends T> function1, androidx.compose.ui.d dVar, Function1<? super T, Unit> function2, androidx.compose.runtime.a aVar, int i2, int i3) {
        int i4;
        Function1<? super Context, ? extends T> function3;
        Function1<? super T, Unit> function4;
        androidx.compose.ui.d dVar2;
        androidx.compose.runtime.b bVarI = aVar.i(-1783766393);
        if ((i2 & 6) == 0) {
            i4 = (bVarI.A(function1) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= bVarI.M(dVar) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= bVarI.A(function2) ? 256 : 128;
        }
        if (bVarI.q(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                dVar = androidx.compose.ui.d.a.b;
            }
            androidx.compose.ui.d dVar3 = dVar;
            h hVar = a;
            Function1<? super T, Unit> function5 = i6 != 0 ? hVar : function2;
            function3 = function1;
            b(function3, dVar3, null, hVar, function5, bVarI, (i4 & 14) | 3072 | (i4 & 112) | (57344 & (i4 << 6)), 4);
            dVar2 = dVar3;
            function4 = function5;
        } else {
            function3 = function1;
            bVarI.G();
            function4 = function2;
            dVar2 = dVar;
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new a(function3, dVar2, function4, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105  */
    /* JADX WARN: Code duplicated, block: B:61:0x0125  */
    /* JADX WARN: Code duplicated, block: B:62:0x0129  */
    /* JADX WARN: Code duplicated, block: B:64:0x0142  */
    /* JADX WARN: Code duplicated, block: B:67:0x014c  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final <T extends View> void b(Function1<? super Context, ? extends T> function1, androidx.compose.ui.d dVar, Function1<? super T, Unit> function2, Function1<? super T, Unit> function3, Function1<? super T, Unit> function4, androidx.compose.runtime.a aVar, int i2, int i3) {
        int i4;
        Function1<? super T, Unit> function5;
        boolean z;
        Function1<? super T, Unit> function6;
        androidx.compose.runtime.e eVarZ;
        int iHashCode;
        androidx.compose.ui.d dVarC;
        mmd mmdVar;
        asr asrVar;
        ne00 ne00VarS;
        ibs ibsVar;
        nv60 nv60Var;
        Function0<tsr> function0C;
        Function0<tsr> function0C2;
        int i5;
        int i6;
        androidx.compose.runtime.b bVarI = aVar.i(-180024211);
        if ((i2 & 6) == 0) {
            i4 = (bVarI.A(function1) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.M(dVar) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & 384) == 0) {
                function5 = function2;
                i4 |= bVarI.A(function5) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                if (bVarI.A(function3)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((i2 & 24576) == 0) {
                if (bVarI.A(function4)) {
                    i5 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i5 = 8192;
                }
                i4 |= i5;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i4 & 1, z)) {
                if (i7 != 0) {
                    function6 = null;
                } else {
                    function6 = function5;
                }
                iHashCode = Long.hashCode(bVarI.T);
                androidx.compose.ui.d dVarN = dVar.n(FocusGroupPropertiesElement.b);
                FocusTargetNode.FocusTargetElement focusTargetElement = FocusTargetNode.FocusTargetElement.b;
                dVarC = androidx.compose.ui.c.c(bVarI, dVarN.n(focusTargetElement).n(FocusTargetPropertiesElement.b).n(focusTargetElement));
                mmdVar = (mmd) bVarI.O(kna.h);
                asrVar = (asr) bVarI.O(kna.n);
                ne00VarS = bVarI.S();
                ibsVar = (ibs) bVarI.O(ndt.a);
                nv60Var = (nv60) bVarI.O(udt.a);
                if (function6 != null) {
                    bVarI.N(1313943160);
                    function0C2 = c(function1, bVarI, i4 & 14);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(function0C2);
                    } else {
                        bVarI.p();
                    }
                    e(bVarI, dVarC, iHashCode, mmdVar, ibsVar, nv60Var, asrVar, ne00VarS);
                    hlh0.a(bVarI, function6, C0050b.a);
                    hlh0.a(bVarI, function4, c.a);
                    hlh0.a(bVarI, function3, d.a);
                    bVarI.X(true);
                    bVarI.X(false);
                } else {
                    bVarI.N(1314800527);
                    function0C = c(function1, bVarI, i4 & 14);
                    bVarI.z0(null, 125, 1, null);
                    bVarI.r = true;
                    if (bVarI.S) {
                        bVarI.F(function0C);
                    } else {
                        bVarI.p();
                    }
                    e(bVarI, dVarC, iHashCode, mmdVar, ibsVar, nv60Var, asrVar, ne00VarS);
                    hlh0.a(bVarI, function4, e.a);
                    hlh0.a(bVarI, function3, f.a);
                    bVarI.X(true);
                    bVarI.X(false);
                }
            } else {
                bVarI.G();
                function6 = function5;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new g(function1, dVar, function6, function3, function4, i2, i3);
            }
        }
        i4 |= 384;
        function5 = function2;
        if ((i2 & 3072) == 0) {
            if (bVarI.A(function3)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i4 |= i6;
        }
        if ((i2 & 24576) == 0) {
            if (bVarI.A(function4)) {
                i5 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i5 = 8192;
            }
            i4 |= i5;
        }
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i4 & 1, z)) {
            if (i7 != 0) {
                function6 = null;
            } else {
                function6 = function5;
            }
            iHashCode = Long.hashCode(bVarI.T);
            androidx.compose.ui.d dVarN2 = dVar.n(FocusGroupPropertiesElement.b);
            FocusTargetNode.FocusTargetElement focusTargetElement2 = FocusTargetNode.FocusTargetElement.b;
            dVarC = androidx.compose.ui.c.c(bVarI, dVarN2.n(focusTargetElement2).n(FocusTargetPropertiesElement.b).n(focusTargetElement2));
            mmdVar = (mmd) bVarI.O(kna.h);
            asrVar = (asr) bVarI.O(kna.n);
            ne00VarS = bVarI.S();
            ibsVar = (ibs) bVarI.O(ndt.a);
            nv60Var = (nv60) bVarI.O(udt.a);
            if (function6 != null) {
                bVarI.N(1313943160);
                function0C2 = c(function1, bVarI, i4 & 14);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(function0C2);
                } else {
                    bVarI.p();
                }
                e(bVarI, dVarC, iHashCode, mmdVar, ibsVar, nv60Var, asrVar, ne00VarS);
                hlh0.a(bVarI, function6, C0050b.a);
                hlh0.a(bVarI, function4, c.a);
                hlh0.a(bVarI, function3, d.a);
                bVarI.X(true);
                bVarI.X(false);
            } else {
                bVarI.N(1314800527);
                function0C = c(function1, bVarI, i4 & 14);
                bVarI.z0(null, 125, 1, null);
                bVarI.r = true;
                if (bVarI.S) {
                    bVarI.F(function0C);
                } else {
                    bVarI.p();
                }
                e(bVarI, dVarC, iHashCode, mmdVar, ibsVar, nv60Var, asrVar, ne00VarS);
                hlh0.a(bVarI, function4, e.a);
                hlh0.a(bVarI, function3, f.a);
                bVarI.X(true);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
            function6 = function5;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new g(function1, dVar, function6, function3, function4, i2, i3);
        }
    }

    public static final <T extends View> Function0<tsr> c(Function1<? super Context, ? extends T> function1, androidx.compose.runtime.a aVar, int i2) {
        int iHashCode = Long.hashCode(aVar.m());
        Context context = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
        androidx.compose.runtime.b.C0043b c0043bJ = aVar.J();
        mt60 mt60Var = (mt60) aVar.O(pt60.a);
        View view = (View) aVar.O(AndroidCompositionLocals_androidKt.f);
        boolean zA = ((((i2 & 14) ^ 6) > 4 && aVar.M(function1)) || (i2 & 6) == 4) | aVar.A(context) | aVar.A(c0043bJ) | aVar.A(mt60Var) | aVar.d(iHashCode) | aVar.A(view);
        Object objY = aVar.y();
        if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
            Object iVar = new i(context, function1, c0043bJ, mt60Var, iHashCode, view);
            aVar.r(iVar);
            objY = iVar;
        }
        return (Function0) objY;
    }

    public static final <T extends View> ViewFactoryHolder<T> d(tsr tsrVar) {
        ViewFactoryHolder<T> viewFactoryHolder = tsrVar.D;
        if (viewFactoryHolder != null) {
            return viewFactoryHolder;
        }
        throw w20.a("Required value was null.");
    }

    public static final <T extends View> void e(androidx.compose.runtime.a aVar, androidx.compose.ui.d dVar, int i2, mmd mmdVar, ibs ibsVar, nv60 nv60Var, asr asrVar, ina inaVar) {
        yka.k.getClass();
        hlh0.a(aVar, inaVar, yka.a.e);
        hlh0.a(aVar, dVar, j.a);
        hlh0.a(aVar, mmdVar, k.a);
        hlh0.a(aVar, ibsVar, l.a);
        hlh0.a(aVar, nv60Var, m.a);
        hlh0.a(aVar, asrVar, n.a);
        yka.a.C1350a c1350a = yka.a.g;
        if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(i2))) {
            j3c.a(i2, aVar, i2, c1350a);
        }
    }
}
