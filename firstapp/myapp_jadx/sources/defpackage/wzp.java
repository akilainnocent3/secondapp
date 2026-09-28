package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.j;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.layout.w;
import androidx.compose.ui.layout.y;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class wzp {
    public static final i060 a = j060.e(0.0f, 0.0f, 8.0f, 8.0f, 3);
    public static final hfs b = ya5.a.a(0.0f, 0.0f, 14, kotlin.collections.b.k(new j58(r58.d(4280625199L)), new j58(r58.d(4278651409L))));
    public static final chf c = new chf(new rb2(1));

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNBetListViewKt$AutoScrollForClickedItemEffect$1$1", f = "LNBetListView.kt", l = {235}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ af1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(af1 af1Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = af1Var;
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
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(500L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ((x5a0) this.b.a).setValue(null);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNBetListViewKt$AutoScrollForClickedItemEffect$2$1", f = "LNBetListView.kt", l = {259}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public float a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ af1 d;
        public final /* synthetic */ mmd e;
        public final /* synthetic */ float f;
        public final /* synthetic */ int i;
        public final /* synthetic */ l38 v;
        public final /* synthetic */ ytw<Boolean> w;
        public final /* synthetic */ isw y;
        public final /* synthetic */ float z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(af1 af1Var, mmd mmdVar, float f, int i, l38 l38Var, ytw<Boolean> ytwVar, isw iswVar, float f2, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.d = af1Var;
            this.e = mmdVar;
            this.f = f;
            this.i = i;
            this.v = l38Var;
            this.w = ytwVar;
            this.y = iswVar;
            this.z = f2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            float fC1;
            float f;
            y5b y5bVar = y5b.a;
            int i = this.b;
            isw iswVar = this.y;
            if (i == 0) {
                uj50.b(obj);
                af1 af1Var = this.d;
                dp70 dp70Var = (dp70) ((x5a0) af1Var.a).getValue();
                ytw<Boolean> ytwVar = this.w;
                if (dp70Var == null) {
                    i060 i060Var = wzp.a;
                    ytwVar.setValue(Boolean.TRUE);
                    iswVar.A(0.0f);
                    return Unit.a;
                }
                fC1 = this.e.C1(this.z);
                i060 i060Var2 = wzp.a;
                float fJ = fC1 - iswVar.j();
                float f2 = ((this.i - (dp70Var.a - this.f)) - dp70Var.b) - dp70Var.c;
                if (fJ > 0.0f) {
                    if (fC1 > f2) {
                        float fMin = Math.min(fC1 - f2, fJ);
                        if (ytwVar.getValue().booleanValue()) {
                            float f3 = f2 * (-1.0f);
                            fMin += f3 >= 0.0f ? f3 : 0.0f;
                            ytwVar.setValue(Boolean.FALSE);
                        }
                        this.c = null;
                        this.a = fC1;
                        this.b = 1;
                        if (this.v.c(fMin, this) == y5bVar) {
                            return y5bVar;
                        }
                        f = fC1;
                    }
                } else if (!ytwVar.getValue().booleanValue()) {
                    ((x5a0) af1Var.a).setValue(null);
                    ytwVar.setValue(Boolean.TRUE);
                }
                i060 i060Var3 = wzp.a;
                iswVar.A(fC1);
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = this.a;
            uj50.b(obj);
            fC1 = f;
            i060 i060Var4 = wzp.a;
            iswVar.A(fC1);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNBetListViewKt$CollapsibleContentPaddingSyncEffect$1$1", f = "LNBetListView.kt", l = {198}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zzr b;
        public final /* synthetic */ l38 c;

        public static final class a<T> implements myh {
            public final /* synthetic */ dq40<cis> a;
            public final /* synthetic */ zzr b;
            public final /* synthetic */ l38 c;

            public a(dq40<cis> dq40Var, zzr zzrVar, l38 l38Var) {
                this.a = dq40Var;
                this.b = zzrVar;
                this.c = l38Var;
            }

            /* JADX WARN: Code duplicated, block: B:29:0x0063 A[PHI: r1
              0x0063: PHI (r1v5 dza) = (r1v4 dza), (r1v7 dza) binds: [B:18:0x0042, B:27:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Type inference failed for: r6v1, types: [T, cis] */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                dza dzaVar;
                T next;
                T next2;
                ?? r6 = (T) ((cis) obj);
                dq40<cis> dq40Var = this.a;
                cis cisVar = dq40Var.a;
                dq40Var.a = r6;
                if (cisVar != null) {
                    i060 i060Var = wzp.a;
                    int i = r6.a;
                    List<dza> list = r6.b;
                    Integer numValueOf = null;
                    if (i < cisVar.a && (dzaVar = (dza) CollectionsKt.d0(cisVar.b)) != null) {
                        Iterator<T> it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.g(((dza) next).a, dzaVar.a));
                        dza dzaVar2 = next;
                        if (dzaVar2 == null) {
                            Iterator<T> it2 = list.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = (T) null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (((dza) next2).b != dzaVar.b);
                            dzaVar2 = next2;
                            if (dzaVar2 != null) {
                                numValueOf = Integer.valueOf(dzaVar2.c - dzaVar.c);
                            }
                        } else {
                            numValueOf = Integer.valueOf(dzaVar2.c - dzaVar.c);
                        }
                    }
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        if (iIntValue > 0 && !this.b.i.c()) {
                            l38 l38Var = this.c;
                            l38Var.d(((t5a0) l38Var.c).j() + iIntValue, false);
                        }
                        return Unit.a;
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(zzr zzrVar, l38 l38Var, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = zzrVar;
            this.c = l38Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                dq40 dq40VarA = j6w.a(obj);
                final zzr zzrVar = this.b;
                or60 or60VarC = n95.c(new Function0() { // from class: xzp
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        kzr kzrVarJ = zzrVar.j();
                        i060 i060Var = wzp.a;
                        return new cis(kzrVarJ.e(), ld80.k(new ysg0(ld80.d(CollectionsKt.K(kzrVarJ.k()), new czp(0)), new dzp())));
                    }
                });
                a aVar = new a(dq40VarA, zzrVar, this.c);
                this.a = 1;
                if (or60VarC.collect(aVar, this) == y5bVar) {
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

    public static final void a(final af1 af1Var, final l38 l38Var, final float f, final int i, final float f2, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVarI = aVar.i(-1413189328);
        int i3 = i2 | (bVarI.M(l38Var) ? 32 : 16) | (bVarI.c(f) ? 256 : 128) | (bVarI.d(i) ? 2048 : 1024) | (bVarI.c(f2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = j.a(0.0f);
                bVarI.r(objY);
            }
            isw iswVar = (isw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.TRUE);
                bVarI.r(objY2);
            }
            ytw ytwVar = (ytw) objY2;
            ytw<dp70> ytwVar2 = af1Var.a;
            g7f g7fVar = new g7f(f);
            dp70 dp70Var = (dp70) ((x5a0) ytwVar2).getValue();
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new a(af1Var, null);
                bVarI.r(objY3);
            }
            xvf.g(g7fVar, dp70Var, (Function2) objY3, bVarI);
            g7f g7fVar2 = new g7f(f);
            boolean zM = bVarI.M(mmdVar) | ((i3 & 896) == 256) | ((57344 & i3) == 16384) | ((i3 & 7168) == 2048) | ((i3 & 112) == 32);
            Object objY4 = bVarI.y();
            if (zM || objY4 == c0042a) {
                b bVar = new b(af1Var, mmdVar, f2, i, l38Var, ytwVar, iswVar, f, null);
                bVarI.r(bVar);
                objY4 = bVar;
            }
            xvf.e(bVarI, g7fVar2, (Function2) objY4);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(l38Var, f, i, f2, i2) { // from class: bzp
                public final /* synthetic */ l38 b;
                public final /* synthetic */ float c;
                public final /* synthetic */ int d;
                public final /* synthetic */ float e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    wzp.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final zzr zzrVar, final l38 l38Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(911370590);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(zzrVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(l38Var) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new c(zzrVar, l38Var, null);
                bVarI.r(objY);
            }
            xvf.g(zzrVar, l38Var, (Function2) objY, bVarI);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: tzp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    wzp.b(zzrVar, l38Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final d dVar, final umz umzVar, final float f, final glq glqVar, final zzr zzrVar, final op8 op8Var, final op8 op8Var2, final op8 op8Var3, final yyp yypVar, final String str, final Function1 function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final glq glqVar2;
        op8 op8Var4;
        androidx.compose.runtime.b bVar;
        dVar.getClass();
        yypVar.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(46605268);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(umzVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.c(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            glqVar2 = glqVar;
            i2 |= bVarI.M(glqVar2) ? 2048 : 1024;
        } else {
            glqVar2 = glqVar;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(zzrVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(op8Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            op8Var4 = op8Var2;
            i2 |= bVarI.A(op8Var4) ? 1048576 : 524288;
        } else {
            op8Var4 = op8Var2;
        }
        if ((i & 12582912) == 0) {
            i2 |= bVarI.A(op8Var3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= bVarI.M(yypVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= bVarI.A(str) ? 536870912 : 268435456;
        }
        if (bVarI.q(i2 & 1, ((i2 & 306783379) == 306783378 && ((bVarI.A(function1) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new af1();
                bVarI.r(objY);
            }
            final af1 af1Var = (af1) objY;
            asr asrVar = (asr) bVarI.O(kna.n);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = k.a(0);
                bVarI.r(objY2);
            }
            final osw oswVar = (osw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = j.a(0.0f);
                bVarI.r(objY3);
            }
            final isw iswVar = (isw) objY3;
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            float fA = r8j0.c(q8j0.a.a(bVarI).e, bVarI).a();
            boolean zD = ((i2 & 112) == 32) | ((i2 & 896) == 256) | bVarI.d(asrVar.ordinal());
            Object objY4 = bVarI.y();
            if (zD || objY4 == c0042a) {
                umz umzVar2 = new umz(h.d(umzVar, asrVar), umzVar.b, h.c(umzVar, asrVar), Math.max(f, fA) + umzVar.d);
                bVarI.r(umzVar2);
                objY4 = umzVar2;
            }
            final tmz tmzVar = (tmz) objY4;
            boolean z = (((57344 & i2) ^ 24576) > 16384 && bVarI.M(zzrVar)) || (i2 & 24576) == 16384;
            Object objY5 = bVarI.y();
            if (z || objY5 == c0042a) {
                objY5 = new l38(zzrVar);
                bVarI.r(objY5);
            }
            final l38 l38Var = (l38) objY5;
            boolean zM = ((234881024 & i2) == 67108864) | bVarI.M(l38Var);
            Object objY6 = bVarI.y();
            if (zM || objY6 == c0042a) {
                objY6 = new jzp(0, yypVar, l38Var);
                bVarI.r(objY6);
            }
            bVarI.t((Function0) objY6);
            Integer numValueOf = Integer.valueOf(((u5a0) l38Var.b).D());
            boolean zM2 = bVarI.M(l38Var);
            Object objY7 = bVarI.y();
            if (zM2 || objY7 == c0042a) {
                objY7 = new zzp(l38Var, null);
                bVarI.r(objY7);
            }
            xvf.e(bVarI, numValueOf, (Function2) objY7);
            b(zzrVar, l38Var, bVarI, (i2 >> 12) & 14);
            j730 j730VarA = c.a(af1Var);
            bVar = bVarI;
            final op8 op8Var5 = op8Var4;
            hna.a(j730VarA, pp8.b(1181021972, new Function2() { // from class: ozp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarG = androidx.compose.foundation.layout.j.g(dVar, 1.0f);
                        final l38 l38Var2 = l38Var;
                        d dVarA = androidx.compose.ui.input.nestedscroll.a.a(dVarG, l38Var2.e, null);
                        Object objY8 = aVar2.y();
                        final osw oswVar2 = oswVar;
                        final isw iswVar2 = iswVar;
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (objY8 == c0042a2) {
                            objY8 = new Function1() { // from class: qzp
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    urr urrVar = (urr) obj3;
                                    urrVar.getClass();
                                    oswVar2.k((int) (urrVar.a() & 4294967295L));
                                    iswVar2.A(Float.intBitsToFloat((int) (urrVar.T(0L) & 4294967295L)));
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY8);
                        }
                        d dVarA2 = v.a(dVarA, (Function1) objY8);
                        final op8 op8Var6 = op8Var;
                        boolean zM3 = aVar2.M(op8Var6);
                        final String str2 = str;
                        boolean zA = zM3 | aVar2.A(str2);
                        final glq glqVar3 = glqVar2;
                        boolean zM4 = zA | aVar2.M(glqVar3) | aVar2.M(l38Var2);
                        final op8 op8Var7 = op8Var5;
                        boolean zM5 = zM4 | aVar2.M(op8Var7);
                        final op8 op8Var8 = op8Var3;
                        boolean zM6 = zM5 | aVar2.M(op8Var8);
                        final Function1 function2 = function1;
                        boolean zM7 = zM6 | aVar2.M(function2);
                        Object objY9 = aVar2.y();
                        if (zM7 || objY9 == c0042a2) {
                            Function1 function3 = new Function1() { // from class: rzp
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    szr szrVar = (szr) obj3;
                                    szrVar.getClass();
                                    final op8 op8Var9 = op8Var6;
                                    szrVar.i("layer1", "layer1", new op8(-2144052257, new gaj() { // from class: zyp
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            a aVar3 = (a) obj5;
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            ((gwr) obj4).getClass();
                                            if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                op8Var9.invoke(aVar3, 0);
                                            } else {
                                                aVar3.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true));
                                    final glq glqVar4 = glqVar3;
                                    final l38 l38Var3 = l38Var2;
                                    final op8 op8Var10 = op8Var7;
                                    final op8 op8Var11 = op8Var8;
                                    szrVar.b(str2, "stickyHeaderItem", new op8(950421843, new iaj() { // from class: azp
                                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                         */
                                        @Override // defpackage.iaj
                                        public final Object d(Object obj4, Object obj5, Object obj6, Object obj7) {
                                            ((Integer) obj5).getClass();
                                            a aVar3 = (a) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            ((gwr) obj4).getClass();
                                            if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 129) != 128)) {
                                                d.a aVar4 = d.a.b;
                                                d dVarG2 = androidx.compose.foundation.layout.j.g(aVar4, 1.0f);
                                                i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar3, 0);
                                                int iHashCode = Long.hashCode(aVar3.m());
                                                ne00 ne00VarO = aVar3.o();
                                                d dVarC = c.c(aVar3, dVarG2);
                                                yka.k.getClass();
                                                tsr.a aVar5 = yka.a.b;
                                                if (aVar3.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar3.D();
                                                if (aVar3.g()) {
                                                    aVar3.F(aVar5);
                                                } else {
                                                    aVar3.p();
                                                }
                                                yka.a.b bVar2 = yka.a.f;
                                                hlh0.a(aVar3, i78VarA, bVar2);
                                                yka.a.d dVar2 = yka.a.e;
                                                hlh0.a(aVar3, ne00VarO, dVar2);
                                                yka.a.C1350a c1350a = yka.a.g;
                                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                                    j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                                }
                                                yka.a.c cVar = yka.a.d;
                                                hlh0.a(aVar3, dVarC, cVar);
                                                final l38 l38Var4 = l38Var3;
                                                osw oswVar3 = l38Var4.b;
                                                t5a0 t5a0Var = (t5a0) l38Var4.c;
                                                float fJ = t5a0Var.j() + ((u5a0) oswVar3).D();
                                                if (fJ < 0.0f) {
                                                    fJ = 0.0f;
                                                }
                                                wzp.e(glqVar4, ycv.b(fJ), op8Var10, null, aVar3, 0);
                                                d dVarB = ls7.b(androidx.compose.foundation.layout.j.g(aVar4, 1.0f));
                                                final float fJ2 = t5a0Var.j();
                                                d dVarA3 = androidx.compose.ui.layout.j.a(dVarB, new gaj() { // from class: hzp
                                                    @Override // defpackage.gaj
                                                    public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                        t tVar = (t) obj8;
                                                        vhv vhvVar = (vhv) obj9;
                                                        tVar.getClass();
                                                        vhvVar.getClass();
                                                        final y yVarD0 = vhvVar.d0(((kxa) obj10).a);
                                                        final int iB = ycv.b(f.d(fJ2, -yVarD0.b, 0.0f));
                                                        int i3 = yVarD0.b + iB;
                                                        if (i3 < 0) {
                                                            i3 = 0;
                                                        }
                                                        return t.z1(tVar, yVarD0.a, i3, new Function1() { // from class: izp
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj11) {
                                                                y.a aVar6 = (y.a) obj11;
                                                                aVar6.getClass();
                                                                y.a.A(aVar6, yVarD0, 0, iB);
                                                                return Unit.a;
                                                            }
                                                        });
                                                    }
                                                });
                                                n54 n54Var = ht.a.a;
                                                aiv aivVarC = g75.c(n54Var, false);
                                                int iHashCode2 = Long.hashCode(aVar3.m());
                                                ne00 ne00VarO2 = aVar3.o();
                                                d dVarC2 = c.c(aVar3, dVarA3);
                                                if (aVar3.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar3.D();
                                                if (aVar3.g()) {
                                                    aVar3.F(aVar5);
                                                } else {
                                                    aVar3.p();
                                                }
                                                hlh0.a(aVar3, aivVarC, bVar2);
                                                hlh0.a(aVar3, ne00VarO2, dVar2);
                                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                                    j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                                                }
                                                hlh0.a(aVar3, dVarC2, cVar);
                                                boolean zM8 = aVar3.M(l38Var4);
                                                Object objY10 = aVar3.y();
                                                if (zM8 || objY10 == a.C0041a.a) {
                                                    objY10 = new Function1() { // from class: ezp
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj8) {
                                                            ((u5a0) l38Var4.b).k((int) (((jxo) obj8).a & 4294967295L));
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar3.r(objY10);
                                                }
                                                d dVarA4 = w.a(aVar4, (Function1) objY10);
                                                aiv aivVarC2 = g75.c(n54Var, false);
                                                int iHashCode3 = Long.hashCode(aVar3.m());
                                                ne00 ne00VarO3 = aVar3.o();
                                                d dVarC3 = c.c(aVar3, dVarA4);
                                                if (aVar3.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar3.D();
                                                if (aVar3.g()) {
                                                    aVar3.F(aVar5);
                                                } else {
                                                    aVar3.p();
                                                }
                                                hlh0.a(aVar3, aivVarC2, bVar2);
                                                hlh0.a(aVar3, ne00VarO3, dVar2);
                                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode3))) {
                                                    j3c.a(iHashCode3, aVar3, iHashCode3, c1350a);
                                                }
                                                hlh0.a(aVar3, dVarC3, cVar);
                                                op8Var11.invoke(aVar3, 0);
                                                aVar3.s();
                                                aVar3.s();
                                                aVar3.s();
                                            } else {
                                                aVar3.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true));
                                    function2.invoke(szrVar);
                                    return Unit.a;
                                }
                            };
                            aVar2.r(function3);
                            objY9 = function3;
                        }
                        aur.a(dVarA2, zzrVar, tmzVar, false, null, null, null, false, null, (Function1) objY9, aVar2, 0, 504);
                        wzp.a(af1Var, l38Var2, f, oswVar2.D(), iswVar2.j(), aVar2, 6);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVar), bVar, 56);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pzp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wzp.c(dVar, umzVar, f, glqVar, zzrVar, op8Var, op8Var2, op8Var3, yypVar, str, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final glq glqVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(281796859);
        int i2 = (bVarI.M(glqVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarA = androidx.compose.foundation.a.a(ls7.a(androidx.compose.foundation.layout.j.e(aVar2, 1.0f), a), b, null, 0.0f, 6);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new mzp();
                bVarI.r(objY);
            }
            d dVarF = g3w.f(dVarA, true, (Function0) objY);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            if (glqVar instanceof glq.b) {
                bVarI.N(-696317414);
                Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                String str = ((glq.b) glqVar).a;
                boolean zM = bVarI.M(context) | bVarI.M(str);
                Object objY2 = bVarI.y();
                if (zM || objY2 == c0042a) {
                    nan.a aVar4 = new nan.a(context);
                    aVar4.c = str;
                    p4h.b<ltg0.a> bVar = abn.a;
                    aVar4.c().a(abn.a, new s3c.a(500));
                    objY2 = aVar4.a();
                    bVarI.r(objY2);
                }
                mw90.a((nan) objY2, null, androidx.compose.foundation.layout.j.e(aVar2, 1.0f), null, n54Var, d0b.a.d, null, bVarI, 1769904, 1944);
                bVarI.X(false);
            } else {
                bVarI.N(-695726399);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: nzp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    wzp.d(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final glq glqVar, final int i, final op8 op8Var, d dVar, androidx.compose.runtime.a aVar, final int i2) {
        final d dVar2;
        androidx.compose.runtime.b bVarI = aVar.i(900250506);
        int i3 = i2 | (bVarI.M(glqVar) ? 4 : 2) | (bVarI.d(i) ? 32 : 16) | (bVarI.A(op8Var) ? 256 : 128) | 3072;
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function2() { // from class: fzp
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Integer numValueOf;
                        rce0 rce0Var = (rce0) obj;
                        kxa kxaVar = (kxa) obj2;
                        rce0Var.getClass();
                        List<vhv> listK = rce0Var.K("stickyHeaderContent", op8Var);
                        ArrayList arrayList = new ArrayList(l48.r(listK, 10));
                        Iterator<T> it = listK.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((vhv) it.next()).d0(kxaVar.a));
                        }
                        Iterator it2 = arrayList.iterator();
                        Integer numValueOf2 = null;
                        if (it2.hasNext()) {
                            numValueOf = Integer.valueOf(((y) it2.next()).a);
                            while (it2.hasNext()) {
                                Integer numValueOf3 = Integer.valueOf(((y) it2.next()).a);
                                if (numValueOf.compareTo(numValueOf3) < 0) {
                                    numValueOf = numValueOf3;
                                }
                            }
                        } else {
                            numValueOf = null;
                        }
                        int iIntValue = numValueOf != null ? numValueOf.intValue() : kxa.k(kxaVar.a);
                        Iterator it3 = arrayList.iterator();
                        if (it3.hasNext()) {
                            numValueOf2 = Integer.valueOf(((y) it3.next()).b);
                            while (it3.hasNext()) {
                                Integer numValueOf4 = Integer.valueOf(((y) it3.next()).b);
                                if (numValueOf2.compareTo(numValueOf4) < 0) {
                                    numValueOf2 = numValueOf4;
                                }
                            }
                        }
                        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
                        int i4 = i + iIntValue2;
                        if (i4 < iIntValue2) {
                            i4 = iIntValue2;
                        }
                        final glq glqVar2 = glqVar;
                        List<vhv> listK2 = rce0Var.K("stickyHeaderBackground", new op8(-1751658691, new Function2() { // from class: kzp
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar2 = (a) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                if (aVar2.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    wzp.d(glqVar2, aVar2, 0);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, true));
                        ArrayList arrayList2 = new ArrayList(l48.r(listK2, 10));
                        for (vhv vhvVar : listK2) {
                            long j = kxaVar.a;
                            arrayList2.add(vhvVar.d0(kxa.a(iIntValue, iIntValue, i4, i4)));
                        }
                        return t.z1(rce0Var, iIntValue, iIntValue2, new lzp(0, arrayList2, arrayList));
                    }
                };
                bVarI.r(objY);
            }
            d.a aVar2 = d.a.b;
            f0.a(aVar2, (Function2) objY, bVarI, 6, 0);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, op8Var, dVar2, i2) { // from class: gzp
                public final /* synthetic */ int b;
                public final /* synthetic */ op8 c;
                public final /* synthetic */ d d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    wzp.e(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
