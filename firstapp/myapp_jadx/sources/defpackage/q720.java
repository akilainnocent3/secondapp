package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderInRound;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class q720 {
    public static final void a(final d dVar, final String str, final String str2, final String str3, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(-1488926301);
        int i2 = i | (bVarI.M(str) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128) | (bVarI.M(str3) ? 2048 : 1024);
        int i3 = 1;
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new mrj(i3);
                bVarI.r(objY);
            }
            d dVarG = j.g(xa80.b(dVar, false, (Function1) objY), 1.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).d;
            qyd0 qyd0Var2 = kjb0.a;
            lkf0.d(str, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).n, bVarI, (i2 >> 3) & 14, 0, 131066);
            lkf0.d(str2, g3w.h(h.j(d.a.b, 16.0f, 0.0f, 0.0f, 0.0f, 14), str3), ((lib0) bVarI.O(qyd0Var)).d, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).n, bVarI, (i2 >> 6) & 14, 0, 131064);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, str3, i) { // from class: f720
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    q720.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final boolean z, final String str, final long j, final long j2, final BetBuilderInRound betBuilderInRound, final d dVar, final Function1 function1, final ytw ytwVar, final ytw ytwVar2, a aVar, final int i) {
        int i2;
        boolean z2;
        uf00 uf00VarA;
        b bVarI = aVar.i(2141888148);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.e(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.e(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? bVarI.M(betBuilderInRound) : bVarI.A(betBuilderInRound) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.M(dVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.M(ytwVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= bVarI.M(ytwVar2) ? 67108864 : 33554432;
        }
        if (bVarI.q(i2 & 1, (38347923 & i2) != 38347922)) {
            boolean zA = doc.a(bVarI);
            final View view = (View) bVarI.O(AndroidCompositionLocals_androidKt.f);
            ytw ytwVarB = n95.b(((ibs) bVarI.O(ndt.a)).getLifecycle().c(), bVarI);
            boolean zM = bVarI.M(view);
            Object objY = bVarI.y();
            int i3 = i2;
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = m.b(Boolean.valueOf(view.isShown()));
                bVarI.r(objY);
            }
            final ytw ytwVar3 = (ytw) objY;
            boolean zA2 = bVarI.A(view) | bVarI.M(ytwVar3);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new Function1() { // from class: l720
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, m720] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((use) obj).getClass();
                        final View view2 = view;
                        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                        final ytw ytwVar4 = ytwVar3;
                        ?? r1 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: m720
                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public final void onGlobalLayout() {
                                ytwVar4.setValue(Boolean.valueOf(view2.isShown()));
                            }
                        };
                        viewTreeObserver.addOnGlobalLayoutListener(r1);
                        ytwVar4.setValue(Boolean.valueOf(view2.isShown()));
                        return new o720(viewTreeObserver, r1);
                    }
                };
                bVarI.r(objY2);
            }
            xvf.c(view, (Function1) objY2, bVarI);
            boolean z3 = ((Boolean) ytwVar3.getValue()).booleanValue() && ((s9s.b) ytwVarB.getValue()).compareTo(s9s.b.e) >= 0;
            boolean zB = bVarI.b(zA);
            Object objY3 = bVarI.y();
            if (zB || objY3 == c0042a) {
                if (zA) {
                    uf00VarA = a4h.a(new j58(j58.c(0.0f, r58.d(4280926097L))), new j58(j58.c(0.4f, r58.d(4281519714L))), new j58(j58.c(0.0f, r58.d(4280926097L))));
                    z2 = z3;
                } else {
                    long j3 = j58.f;
                    z2 = z3;
                    uf00VarA = a4h.a(new j58(j58.c(0.0f, j3)), new j58(j58.c(0.4f, j3)), new j58(j58.c(0.0f, j3)));
                }
                objY3 = uf00VarA;
                bVarI.r(objY3);
            } else {
                z2 = z3;
            }
            final uf00 uf00Var = (uf00) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new g720();
                bVarI.r(objY4);
            }
            d dVarB = androidx.compose.foundation.a.b(g3w.h(xa80.b(dVar, false, (Function1) objY4), "place_bet_button"), j, j060.c(((zib0) bVarI.O(ajb0.a)).a));
            final boolean z4 = z && z2;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = ee0.a(-1.0f);
                bVarI.r(objY5);
            }
            final wd0 wd0Var = (wd0) objY5;
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolean zA3 = bVarI.A(wd0Var) | bVarI.b(z4);
            Object objY6 = bVarI.y();
            if (zA3 || objY6 == c0042a) {
                objY6 = new p720(wd0Var, null, z4);
                bVarI.r(objY6);
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY6);
            boolean zM2 = bVarI.M(uf00Var) | bVarI.b(z4) | bVarI.A(wd0Var);
            Object objY7 = bVarI.y();
            if (zM2 || objY7 == c0042a) {
                objY7 = new Function1() { // from class: k720
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        mr5 mr5Var = (mr5) obj;
                        mr5Var.getClass();
                        final hfs hfsVar = new hfs(uf00Var, null, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (mr5Var.a.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0);
                        final boolean z5 = z4;
                        final wd0 wd0Var2 = wd0Var;
                        return mr5Var.g(new Function1() { // from class: n720
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                hfs hfsVar2 = hfsVar;
                                lza lzaVar = (lza) obj2;
                                lzaVar.getClass();
                                lzaVar.b2();
                                if (!z5) {
                                    return Unit.a;
                                }
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32)) * ((Number) wd0Var2.d()).floatValue();
                                lzaVar.F1().a.i(fIntBitsToFloat, 0.0f);
                                float f = -fIntBitsToFloat;
                                try {
                                    tcf.V1(lzaVar, hfsVar2, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), lzaVar.d(), 0.0f, null, null, 0, 120);
                                    return Unit.a;
                                } finally {
                                    lzaVar.F1().a.i(f, -0.0f);
                                }
                            }
                        });
                    }
                };
                bVarI.r(objY7);
            }
            d dVarB2 = androidx.compose.ui.draw.a.b(dVarB, (Function1) objY7);
            boolean z5 = ((i3 & 3670016) == 1048576) | ((i3 & 14) == 4) | ((i3 & 57344) == 16384 || ((i3 & 32768) != 0 && bVarI.A(betBuilderInRound)));
            Object objY8 = bVarI.y();
            if (z5 || objY8 == c0042a) {
                objY8 = new Function0() { // from class: h720
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (z) {
                            function1.invoke(betBuilderInRound);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY8);
            }
            d dVarF = g3w.f(dVarB2, true, (Function0) objY8);
            boolean z6 = ((i3 & 29360128) == 8388608) | ((i3 & 234881024) == 67108864);
            Object objY9 = bVarI.y();
            if (z6 || objY9 == c0042a) {
                objY9 = new Function1() { // from class: i720
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        urr urrVar = (urr) obj;
                        urrVar.getClass();
                        ytw ytwVar4 = ytwVar;
                        if (ytwVar4 != null) {
                            ytwVar4.setValue(new gly(urrVar.w(0L)));
                        }
                        ytw ytwVar5 = ytwVar2;
                        if (ytwVar5 != null) {
                            ytwVar5.setValue(new jxo(urrVar.a()));
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY9);
            }
            d dVarA = v.a(dVarF, (Function1) objY9);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
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
            lkf0.d(str, null, j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).n, bVarI, (i3 >> 3) & 910, 0, 131066);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: j720
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q720.b(z, str, j, j2, betBuilderInRound, dVar, function1, ytwVar, ytwVar2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02a6 A[LOOP:0: B:101:0x02a0->B:103:0x02a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0271  */
    /* JADX WARN: Code duplicated, block: B:94:0x0275  */
    /* JADX WARN: Code duplicated, block: B:99:0x0290  */
    public static final void c(final ec5 ec5Var, final boolean z, final Function1 function1, final BetBuilderInRound betBuilderInRound, final ytw ytwVar, final ytw ytwVar2, a aVar, final int i) {
        long j;
        long j2;
        g7f g7fVar;
        boolean z2;
        int i2;
        int iHashCode;
        ec5Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(-2077277266);
        int i3 = (i & 6) == 0 ? (bVarI.M(ec5Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? bVarI.M(betBuilderInRound) : bVarI.A(betBuilderInRound) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.M(ytwVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= bVarI.M(ytwVar2) ? 131072 : 65536;
        }
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            if (z) {
                bVarI.N(896350209);
                j = fjb0.b(bVarI).Z0;
            } else {
                bVarI.N(896351224);
                j = fjb0.b(bVarI).s0;
            }
            bVarI.X(false);
            long j3 = j;
            if (z) {
                bVarI.N(896353056);
                j2 = fjb0.b(bVarI).o;
            } else {
                bVarI.N(896354043);
                j2 = fjb0.b(bVarI).b;
            }
            bVarI.X(false);
            long j4 = j2;
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            olf0 olf0VarA = plf0.a(bVarI);
            imf0 imf0Var = fjb0.e(bVarI).n;
            qcn<dc5> qcnVar = ec5Var.a;
            bVarI.N(896360930);
            bVarI.N(896361939);
            Iterator<dc5> it = qcnVar.iterator();
            if (it.hasNext()) {
                dc5 next = it.next();
                ResourceUiText resourceUiText = next.a;
                qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                g7fVar = new g7f(mmdVar.u1(mmdVar.y0(16.0f) + ((int) (olf0.a(olf0VarA, resourceUiText.g((Context) bVarI.O(qyd0Var)), imf0Var, 0L, 1020).c >> 32)) + ((int) (olf0.a(olf0VarA, next.b.g((Context) bVarI.O(qyd0Var)), imf0Var, 0L, 1020).c >> 32))));
                while (it.hasNext()) {
                    dc5 next2 = it.next();
                    ResourceUiText resourceUiText2 = next2.a;
                    qyd0 qyd0Var2 = AndroidCompositionLocals_androidKt.b;
                    g7f g7fVar2 = new g7f(mmdVar.u1(mmdVar.y0(16.0f) + ((int) (olf0.a(olf0VarA, resourceUiText2.g((Context) bVarI.O(qyd0Var2)), imf0Var, 0L, 1020).c >> 32)) + ((int) (olf0.a(olf0VarA, next2.b.g((Context) bVarI.O(qyd0Var2)), imf0Var, 0L, 1020).c >> 32))));
                    if (g7fVar.compareTo(g7fVar2) < 0) {
                        g7fVar = g7fVar2;
                    }
                }
                z2 = false;
            } else {
                z2 = false;
                g7fVar = null;
            }
            bVarI.X(z2);
            float f = g7fVar != null ? g7fVar.a : 0.0f;
            bVarI.X(z2);
            d.a aVar2 = d.a.b;
            d dVarI = j.i(aVar2, 31.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                i2 = i3;
            } else {
                i2 = i3;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                d dVarW = j.w(h.g(androidx.compose.foundation.a.b(j.c(j.D(aVar2, null, 3), 1.0f), ((lib0) bVarI.O(oib0.a)).q0, zk40.a), 8.0f, 2.0f), f);
                i78 i78VarA = g78.a(kw0.f, ht.a.m, bVarI, 6);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarW);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                bVarI.N(-301101269);
                for (dc5 dc5Var : qcnVar) {
                    d dVarG = j.g(aVar2, 1.0f);
                    ResourceUiText resourceUiText3 = dc5Var.a;
                    qyd0 qyd0Var3 = AndroidCompositionLocals_androidKt.b;
                    a(dVarG, resourceUiText3.g((Context) bVarI.O(qyd0Var3)), dc5Var.b.g((Context) bVarI.O(qyd0Var3)), dc5Var.c, bVarI, 6);
                }
                bVarI.X(false);
                bVarI.X(true);
                int i4 = i2 << 9;
                b(z, ec5Var.b.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), j3, j4, betBuilderInRound, zqu.a(1.0f, j.c(aVar2, 1.0f), true), function1, ytwVar, ytwVar2, bVarI, ((i2 >> 3) & 14) | (BetBuilderInRound.$stable << 12) | ((i2 << 3) & 57344) | ((i2 << 12) & 3670016) | (29360128 & i4) | (i4 & 234881024));
                bVarI.X(true);
            }
            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            d dVarW2 = j.w(h.g(androidx.compose.foundation.a.b(j.c(j.D(aVar2, null, 3), 1.0f), ((lib0) bVarI.O(oib0.a)).q0, zk40.a), 8.0f, 2.0f), f);
            i78 i78VarA2 = g78.a(kw0.f, ht.a.m, bVarI, 6);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarW2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar2);
            bVarI.N(-301101269);
            while (r0.hasNext()) {
                d dVarG2 = j.g(aVar2, 1.0f);
                ResourceUiText resourceUiText4 = dc5Var.a;
                qyd0 qyd0Var4 = AndroidCompositionLocals_androidKt.b;
                a(dVarG2, resourceUiText4.g((Context) bVarI.O(qyd0Var4)), dc5Var.b.g((Context) bVarI.O(qyd0Var4)), dc5Var.c, bVarI, 6);
            }
            bVarI.X(false);
            bVarI.X(true);
            int i5 = i2 << 9;
            b(z, ec5Var.b.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), j3, j4, betBuilderInRound, zqu.a(1.0f, j.c(aVar2, 1.0f), true), function1, ytwVar, ytwVar2, bVarI, ((i2 >> 3) & 14) | (BetBuilderInRound.$stable << 12) | ((i2 << 3) & 57344) | ((i2 << 12) & 3670016) | (29360128 & i5) | (i5 & 234881024));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: e720
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q720.c(ec5Var, z, function1, betBuilderInRound, ytwVar, ytwVar2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
