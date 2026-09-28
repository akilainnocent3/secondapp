package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.r;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class pda {

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.crash.components.ComposeGameHeaderKt$CashAddRemoveAnimation$1$1", f = "ComposeGameHeader.kt", l = {467, 468}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public float a;
        public int b;
        public final /* synthetic */ double c;
        public final /* synthetic */ String d;
        public final /* synthetic */ wd0<Float, ij0> e;
        public final /* synthetic */ ytw<Boolean> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(double d, String str, wd0<Float, ij0> wd0Var, ytw<Boolean> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = d;
            this.d = str;
            this.e = wd0Var;
            this.f = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        
            if (defpackage.hkd.b(900, r10) == r0) goto L22;
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
                int r1 = r12.b
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L18
                if (r1 != r3) goto L12
                defpackage.uj50.b(r13)
                r10 = r12
                goto L67
            L12:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r12)
                return r2
            L18:
                float r1 = r12.a
                defpackage.uj50.b(r13)
                r10 = r12
                goto L5a
            L1f:
                defpackage.uj50.b(r13)
                double r5 = r12.c
                r7 = 0
                int r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r13 <= 0) goto L6e
                java.lang.String r13 = r12.d
                java.lang.String r1 = "up"
                boolean r13 = kotlin.jvm.internal.Intrinsics.g(r13, r1)
                if (r13 == 0) goto L38
                r13 = -1013579776(0xffffffffc3960000, float:-300.0)
            L36:
                r1 = r13
                goto L3b
            L38:
                r13 = 1133903872(0x43960000, float:300.0)
                goto L36
            L3b:
                java.lang.Float r6 = new java.lang.Float
                r6.<init>(r1)
                r13 = 0
                r5 = 6
                r7 = 2200(0x898, float:3.083E-42)
                gzg0 r7 = defpackage.yi0.e(r7, r13, r2, r5)
                r12.a = r1
                r12.b = r4
                wd0<java.lang.Float, ij0> r5 = r12.e
                r8 = 0
                r9 = 0
                r11 = 12
                r10 = r12
                java.lang.Object r12 = defpackage.wd0.a(r5, r6, r7, r8, r9, r10, r11)
                if (r12 != r0) goto L5a
                goto L66
            L5a:
                r10.a = r1
                r10.b = r3
                r12 = 900(0x384, double:4.447E-321)
                java.lang.Object r12 = defpackage.hkd.b(r12, r10)
                if (r12 != r0) goto L67
            L66:
                return r0
            L67:
                ytw<java.lang.Boolean> r12 = r10.f
                java.lang.Boolean r13 = java.lang.Boolean.FALSE
                r12.setValue(r13)
            L6e:
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: pda.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final double d, final int i, androidx.compose.runtime.a aVar, final String str) {
        b bVar;
        Object objConcat;
        Object aVar2;
        wd0 wd0Var;
        boolean z;
        b bVar2;
        int i2;
        str.getClass();
        b bVarI = aVar.i(1592380939);
        int i3 = (bVarI.f(d) ? 4 : 2) | i | (bVarI.M(str) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            Object objY = bVarI.y();
            Object obj = androidx.compose.runtime.a.C0041a.a;
            if (objY == obj) {
                objY = m.b(Boolean.TRUE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            twd0 twd0VarB = xe0.b(((Boolean) ytwVar.getValue()).booleanValue() ? 1.0f : 0.0f, null, null, null, bVarI, 0, 30);
            Object objY2 = bVarI.y();
            if (objY2 == obj) {
                objY2 = ee0.a(0.0f);
                bVarI.r(objY2);
            }
            wd0 wd0Var2 = (wd0) objY2;
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object objY3 = bVarI.y();
            if (z2 || objY3 == obj) {
                if (d < 1.0d) {
                    objConcat = inm.a(str.equals("up") ? "+ " : "- ", new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d));
                } else {
                    String str2 = str.equals("up") ? "+ " : "- ";
                    TreeMap treeMap = pw.a;
                    objConcat = str2.concat(pw.g(Double.valueOf(d)));
                }
                objY3 = objConcat;
                bVarI.r(objY3);
            }
            String str3 = (String) objY3;
            Double dValueOf = Double.valueOf(d);
            boolean zA = ((i3 & 112) == 32) | (i4 == 4) | bVarI.A(wd0Var2);
            Object objY4 = bVarI.y();
            if (zA || objY4 == obj) {
                wd0Var = wd0Var2;
                aVar2 = new a(d, str, wd0Var, ytwVar, null);
                bVarI.r(aVar2);
            } else {
                aVar2 = objY4;
                wd0Var = wd0Var2;
            }
            xvf.g(dValueOf, str, (Function2) aVar2, bVarI);
            d.a aVar3 = d.a.b;
            d dVarC = j.c(j.g(aVar3, 1.0f), 1.0f);
            aiv aivVarC = g75.c(str.equals("up") ? ht.a.g : ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarC);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            if (d <= 0.0d || !((Boolean) ytwVar.getValue()).booleanValue()) {
                z = 0;
                bVarI.N(-1246954595);
                bVar2 = bVarI;
            } else {
                bVarI.N(-1224886594);
                d dVarA = dw.a(aVar3, ((Number) twd0VarB.getValue()).floatValue());
                boolean zA2 = bVarI.A(wd0Var);
                Object objY5 = bVarI.y();
                if (zA2 || objY5 == obj) {
                    i2 = 0;
                    objY5 = new jda(wd0Var, i2);
                    bVarI.r(objY5);
                } else {
                    i2 = 0;
                }
                d dVarJ = h.j(g.b(dVarA, (Function1) objY5), 70.0f, 0.0f, 0.0f, 0.0f, 14);
                z = i2;
                lkf0.b(str3, dVarJ, str.equals("up") ? j58.h : j58.g, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVarI.O(ni60.b)).d, R.dimen._11ssp, bVarI), bVarI, 0, 0, 65528);
                bVar2 = bVarI;
            }
            bVar2.X(z);
            bVar2.X(true);
            bVar = bVar2;
        } else {
            bVarI.G();
            bVar = bVarI;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(d, i, str) { // from class: kda
                public final /* synthetic */ double a;
                public final /* synthetic */ String b;

                {
                    this.b = str;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(1);
                    pda.a(this.a, iA, (a) obj2, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, final String str2, final boolean z, final String str3, final String str4, final boolean z2, final Function0 function0, final Function0 function1, Function0 function2, final Function0 function3, final Function0 function4, final Function0 function5, final boolean z3, final boolean z4, final mz1 mz1Var, final cj5 cj5Var, final float f, final long j, final boolean z5, final boolean z6, final boolean z7, final boolean z8, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        Function0 function6;
        b bVar;
        float f2;
        hfs hfsVarH;
        d.a aVar2;
        String str5;
        boolean z9;
        boolean z10;
        float f3;
        n54 n54Var;
        n54.b bVar2;
        yka.a.c cVar;
        yka.a.C1350a c1350a;
        tsr.a aVar3;
        yka.a.b bVar3;
        float f4;
        float f5;
        float f6;
        tsr.a aVar4;
        yka.a.C1350a c1350a2;
        final boolean z11;
        boolean z12;
        String strG;
        b bVarA = v2g.a(function4, function5, aVar, -732561409);
        if ((i & 6) == 0) {
            i3 = i | (bVarA.M(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarA.M(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarA.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarA.M(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarA.M(str4) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= bVarA.b(z2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= bVarA.A(function0) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= bVarA.A(function1) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= bVarA.A(function2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= bVarA.A(function3) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (bVarA.A(function4) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarA.A(function5) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarA.b(z3) ? 256 : 128;
        }
        int i7 = i4 | 3072;
        if ((i2 & 24576) == 0) {
            i7 |= bVarA.b(z4) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i7 |= bVarA.A(mz1Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i7 |= bVarA.A(cj5Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i7 |= bVarA.c(f) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 = i7 | (bVarA.e(j) ? 67108864 : 33554432);
        } else {
            i5 = i7;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= bVarA.b(z5) ? 536870912 : 268435456;
        }
        int i8 = i5;
        if (bVarA.q(i6 & 1, ((i6 & 306783379) == 306783378 && (i8 & 306783379) == 306783378 && ((((bVarA.b(z6) ? (char) 4 : (char) 2) | (bVarA.b(z7) ? ' ' : (char) 16)) | (bVarA.b(z8) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            r8j0.c(q8j0.a.a(bVarA).c, bVarA);
            d.a aVar5 = d.a.b;
            d dVarA = s3w.a(j.e(aVar5, 1.0f), "gameheader");
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarA, 0);
            int iHashCode = Long.hashCode(l2a.a(bVarA));
            ne00 ne00VarO = bVarA.o();
            d dVarC = c.c(bVarA, dVarA);
            yka.k.getClass();
            tsr.a aVar6 = yka.a.b;
            bVarA.D();
            if (bVarA.g()) {
                bVarA.F(aVar6);
            } else {
                bVarA.p();
            }
            yka.a.b bVar4 = yka.a.f;
            hlh0.a(bVarA, i78VarA, bVar4);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarA, ne00VarO, dVar);
            yka.a.C1350a c1350a3 = yka.a.g;
            if (bVarA.g() || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarA, iHashCode, c1350a3);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarA, dVarC, cVar2);
            chf chfVar = AndroidCompositionLocals_androidKt.a;
            int i9 = ((Configuration) bVarA.O(chfVar)).screenWidthDp;
            Context context = (Context) bVarA.O(AndroidCompositionLocals_androidKt.b);
            qyd0 qyd0Var = kna.h;
            float density = i9 * ((mmd) bVarA.O(qyd0Var)).getDensity();
            hfs hfsVarI = ya5.a.i(new Pair[]{wxm.a(Float.valueOf(0.0f), j58.a(r58.d(4279771174L))), wxm.a(Float.valueOf(0.1f), j58.a(r58.d(4279771174L))), wxm.a(Float.valueOf(0.3f), j58.a(r58.d(3424133158L))), wxm.a(Float.valueOf(0.5f), j58.a(r58.d(2568495142L))), wxm.a(Float.valueOf(0.75f), j58.a(r58.b(1293426726))), wxm.a(Float.valueOf(0.9f), j58.a(r58.b(437788710))), wxm.a(Float.valueOf(1.0f), j58.a(j58.l))}, 14);
            String str6 = oAudzpbdOhCI.XyZVojrN;
            boolean zG = Intrinsics.g(str3, str6);
            ya5.a aVar7 = ya5.a;
            if (zG) {
                hfsVarH = hfsVarI;
                f2 = 0.0f;
            } else {
                f2 = 0.0f;
                hfsVarH = ya5.a.h(aVar7, kotlin.collections.b.k(j58.a(mz1Var.V()), j58.a(mz1Var.W())), 0.0f, 0.0f, 14);
            }
            d dVarH = h.h(androidx.compose.foundation.a.a(j.c(j.g(aVar5, 1.0f), 1.0f), hfsVarH, null, f2, 6).n(z8 ? v8j0.c(aVar5) : aVar5), 16.0f, f2, 2);
            kw0.j jVar = kw0.a;
            n54.b bVar5 = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar5, bVarA, 48);
            int iHashCode2 = Long.hashCode(l2a.a(bVarA));
            ne00 ne00VarO2 = bVarA.o();
            d dVarC2 = c.c(bVarA, dVarH);
            bVarA.D();
            if (bVarA.g()) {
                bVarA.F(aVar6);
            } else {
                bVarA.p();
            }
            hlh0.a(bVarA, d160VarA, bVar4);
            hlh0.a(bVarA, ne00VarO2, dVar);
            if (bVarA.g() || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarA, iHashCode2, c1350a3);
            }
            hlh0.a(bVarA, dVarC2, cVar2);
            if (z3) {
                bVarA.N(-831883708);
                crz crzVarA = erz.a(2131231010, 0, bVarA);
                long j2 = j58.f;
                f160 f160Var = f160.a;
                d dVarA2 = f160Var.a(0.1f, aVar5, true);
                Object objY = bVarA.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (objY == c0042a) {
                    objY = yxo.a();
                    bVarA.r(objY);
                }
                psw pswVar = (psw) objY;
                boolean z13 = (i6 & 3670016) == 1048576;
                Object objY2 = bVarA.y();
                if (z13 || objY2 == c0042a) {
                    objY2 = new i66(function0, 1);
                    bVarA.r(objY2);
                }
                h6n.b(crzVarA, "navigation_back_button", s3w.a(androidx.compose.foundation.d.b(dVarA2, pswVar, null, false, null, (Function0) objY2, 28), "navigation_back_button"), j2, bVarA, 3120, 0);
                b bVar6 = bVarA;
                float fB = lla.b(((((Configuration) bVar6.O(chfVar)).screenHeightDp * ((mmd) bVar6.O(qyd0Var)).getDensity()) * 0.09f) / 11.0f, bVar6);
                ya5 ya5VarH = ya5.a.h(aVar7, kotlin.collections.b.k(j58.a(r58.d(4279310365L)), j58.a(r58.d(4279771174L))), 0.0f, 0.0f, 14);
                if (Intrinsics.g(str3, "crazy-rider")) {
                    aVar2 = aVar5;
                    ya5VarH = new soa0(j);
                } else {
                    aVar2 = aVar5;
                    if (!Intrinsics.g(str3, str6)) {
                        ya5VarH = new soa0(mz1Var.T());
                    }
                }
                float f7 = ((Boolean) function4.invoke()).booleanValue() ? 1.3f : 0.8f;
                bVar6.C(388850461, Boolean.valueOf(z6));
                d.a aVar8 = aVar2;
                d dVarA3 = f160Var.a(f7, h.j(aVar2, 8.0f, 0.0f, 0.0f, 0.0f, 14), true);
                n54 n54Var2 = ht.a.e;
                aiv aivVarC = g75.c(z5 ? ht.a.d : n54Var2, false);
                int iHashCode3 = Long.hashCode(l2a.a(bVar6));
                ne00 ne00VarO3 = bVar6.o();
                d dVarC3 = c.c(bVar6, dVarA3);
                bVar6.D();
                if (bVar6.g()) {
                    bVar6.F(aVar6);
                } else {
                    bVar6.p();
                }
                hlh0.a(bVar6, aivVarC, bVar4);
                hlh0.a(bVar6, ne00VarO3, dVar);
                if (bVar6.g() || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVar6, iHashCode3, c1350a3);
                }
                hlh0.a(bVar6, dVarC3, cVar2);
                boolean zBooleanValue = ((Boolean) function4.invoke()).booleanValue();
                n54 n54Var3 = ht.a.b;
                if (zBooleanValue) {
                    bVar6.N(-121302019);
                    if (z5) {
                        bVar6.N(-121379364);
                        d dVarB = androidx.compose.foundation.a.b(j.g(j.c(aVar8, 0.54f), 0.7f), cj5Var.H, j060.c(5.0f));
                        boolean z14 = (i6 & 1879048192) == 536870912;
                        Object objY3 = bVar6.y();
                        if (z14 || objY3 == c0042a) {
                            objY3 = new Function0() { // from class: lda
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function3.invoke();
                                    return Unit.a;
                                }
                            };
                            bVar6.r(objY3);
                        }
                        d dVarF = h.f(androidx.compose.foundation.d.d(dVarB, false, null, null, (Function0) objY3, 15), 6.0f);
                        aiv aivVarC2 = g75.c(n54Var2, false);
                        int iHashCode4 = Long.hashCode(l2a.a(bVar6));
                        ne00 ne00VarO4 = bVar6.o();
                        d dVarC4 = c.c(bVar6, dVarF);
                        bVar6.D();
                        if (bVar6.g()) {
                            bVar6.F(aVar6);
                        } else {
                            bVar6.p();
                        }
                        hlh0.a(bVar6, aivVarC2, bVar4);
                        hlh0.a(bVar6, ne00VarO4, dVar);
                        if (bVar6.g() || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode4))) {
                            n30.a(iHashCode4, bVar6, iHashCode4, c1350a3);
                        }
                        hlh0.a(bVar6, dVarC4, cVar2);
                        wf1.a(pm5.ADD_MONEY.a(), null, imf0.b(imf0.d, 0L, 0L, t9i.E, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211), 0, 0L, null, 0, null, mz1Var.Z, bVar6, 0, r.d.DEFAULT_SWIPE_ANIMATION_DURATION);
                        bVar6.s();
                        bVar6.H();
                        str5 = "";
                        z9 = false;
                    } else {
                        bVar6.N(-119887272);
                        d dVarF2 = h.f(aVar8, fB);
                        str5 = "";
                        aiv aivVarC3 = g75.c(ht.a.a, false);
                        int iHashCode5 = Long.hashCode(l2a.a(bVar6));
                        ne00 ne00VarO5 = bVar6.o();
                        d dVarC5 = c.c(bVar6, dVarF2);
                        bVar6.D();
                        if (bVar6.g()) {
                            bVar6.F(aVar6);
                        } else {
                            bVar6.p();
                        }
                        hlh0.a(bVar6, aivVarC3, bVar4);
                        hlh0.a(bVar6, ne00VarO5, dVar);
                        if (bVar6.g() || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode5))) {
                            n30.a(iHashCode5, bVar6, iHashCode5, c1350a3);
                        }
                        hlh0.a(bVar6, dVarC5, cVar2);
                        d dVarG = h.g(androidx.compose.foundation.a.c(mz1Var.U(), j.a(d35.a(aVar8, 1.0f, mz1Var.N(), j060.c(6.0f)), 90.0f, 30.0f)), 10.0f, 6.0f);
                        aiv aivVarC4 = g75.c(n54Var2, false);
                        int iHashCode6 = Long.hashCode(l2a.a(bVar6));
                        ne00 ne00VarO6 = bVar6.o();
                        d dVarC6 = c.c(bVar6, dVarG);
                        bVar6.D();
                        if (bVar6.g()) {
                            bVar6.F(aVar6);
                        } else {
                            bVar6.p();
                        }
                        hlh0.a(bVar6, aivVarC4, bVar4);
                        hlh0.a(bVar6, ne00VarO6, dVar);
                        if (bVar6.g() || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode6))) {
                            n30.a(iHashCode6, bVar6, iHashCode6, c1350a3);
                        }
                        hlh0.a(bVar6, dVarC6, cVar2);
                        if (str.length() == 0) {
                            strG = str5;
                        } else {
                            TreeMap treeMap = pw.a;
                            strG = pw.g(Double.valueOf(Double.parseDouble(str)));
                        }
                        long jN = mz1Var.N();
                        qyd0 qyd0Var2 = ni60.b;
                        imf0 imf0VarG = ni60.g(((sfd0) bVar6.O(qyd0Var2)).d, R.dimen._11ssp, bVar6);
                        androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
                        lkf0.b(strG, s3w.a(dVar2.b(aVar8, n54Var2), "header_currency_balance"), jN, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, imf0VarG, bVar6, 0, 3120, 55288);
                        boolean z15 = (i8 & 7168) == 2048;
                        Object objY4 = bVar6.y();
                        if (z15 || objY4 == c0042a) {
                            objY4 = new mda();
                            bVar6.r(objY4);
                        }
                        androidx.compose.ui.viewinterop.b.a((Function1) objY4, null, null, bVar6, 0, 6);
                        bVar6.s();
                        bVar6.s();
                        d dVarB2 = dVar2.b(h.h(androidx.compose.foundation.a.a(j.C(aVar8, null, 3), ya5VarH, null, 0.0f, 6), 4.0f, 0.0f, 2), n54Var3);
                        z9 = false;
                        aiv aivVarC5 = g75.c(n54Var2, false);
                        int iHashCode7 = Long.hashCode(l2a.a(bVar6));
                        ne00 ne00VarO7 = bVar6.o();
                        d dVarC7 = c.c(bVar6, dVarB2);
                        bVar6.D();
                        if (bVar6.g()) {
                            bVar6.F(aVar6);
                        } else {
                            bVar6.p();
                        }
                        hlh0.a(bVar6, aivVarC5, bVar4);
                        hlh0.a(bVar6, ne00VarO7, dVar);
                        if (bVar6.g() || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode7))) {
                            n30.a(iHashCode7, bVar6, iHashCode7, c1350a3);
                        }
                        hlh0.a(bVar6, dVarC7, cVar2);
                        lkf0.b(str2, s3w.a(dVar2.b(aVar8, n54Var2), "header_currency"), mz1Var.N(), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVar6.O(qyd0Var2)).d, R.dimen._8ssp, bVar6), bVar6, (i6 >> 3) & 14, 0, 65528);
                        bVar6.s();
                        bVar6.H();
                    }
                } else {
                    str5 = "";
                    z9 = false;
                    bVar6.N(-129750015);
                }
                bVar6.H();
                bVar6.s();
                bVar6.K();
                try {
                    z10 = true;
                    try {
                        f3 = kotlin.text.c.l(context.getString(R.string.sporty_skills_id), str3 == null ? str5 : str3, true) ? 1.4f : 1.3f;
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    z10 = true;
                }
                d.a aVar9 = d.a.b;
                f160 f160Var2 = f160Var;
                d dVarA4 = f160Var2.a(f3, aVar9, true);
                d160 d160VarA2 = b160.a(kw0.e, bVar5, bVar6, 54);
                int iHashCode8 = Long.hashCode(l2a.a(bVar6));
                ne00 ne00VarO8 = bVar6.o();
                d dVarC8 = c.c(bVar6, dVarA4);
                yka.k.getClass();
                tsr.a aVar10 = yka.a.b;
                bVar6.D();
                if (bVar6.g()) {
                    bVar6.F(aVar10);
                } else {
                    bVar6.p();
                }
                yka.a.b bVar7 = yka.a.f;
                hlh0.a(bVar6, d160VarA2, bVar7);
                yka.a.d dVar3 = yka.a.e;
                hlh0.a(bVar6, ne00VarO8, dVar3);
                yka.a.C1350a c1350a4 = yka.a.g;
                if (bVar6.g() || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode8))) {
                    n30.a(iHashCode8, bVar6, iHashCode8, c1350a4);
                }
                yka.a.c cVar3 = yka.a.d;
                hlh0.a(bVar6, dVarC8, cVar3);
                if (str4 == null) {
                    bVar6.N(-873908179);
                    if (str3 == null) {
                        bVar6.N(-873908180);
                        bVar6.H();
                        n54Var = n54Var3;
                        bVar2 = bVar5;
                        cVar = cVar3;
                        c1350a = c1350a4;
                        aVar3 = aVar10;
                        bVar3 = bVar7;
                        f4 = 0.0f;
                        f5 = 0.1f;
                        f6 = 1.0f;
                    } else {
                        bVar6.N(-873908179);
                        bVar3 = bVar7;
                        aVar3 = aVar10;
                        n54Var = n54Var3;
                        cVar = cVar3;
                        c1350a = c1350a4;
                        bVar2 = bVar5;
                        f4 = 0.0f;
                        f5 = 0.1f;
                        f6 = 1.0f;
                        lkf0.b(str3, null, mz1Var.e0(), d2l.f(24), null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar6, 199680, 0, 131026);
                        bVar6 = bVar6;
                        Unit unit = Unit.a;
                        bVar6.H();
                    }
                    bVar6.H();
                } else {
                    boolean z16 = z10;
                    f160Var2 = f160Var2;
                    dVar3 = dVar3;
                    n54Var = n54Var3;
                    bVar2 = bVar5;
                    cVar = cVar3;
                    c1350a = c1350a4;
                    aVar3 = aVar10;
                    bVar3 = bVar7;
                    f4 = 0.0f;
                    f5 = 0.1f;
                    f6 = 1.0f;
                    bVar6.N(-873499940);
                    if ((kotlin.text.c.l(SportyGamesManager.getInstance().getCountry(), "ke", z16) || kotlin.text.c.l(SportyGamesManager.getInstance().getCountry(), "za", z16)) && str3 != null && StringsKt.M(str3, "skills", z16) == z16) {
                        bVar6.N(-872863479);
                        String strG2 = krh0.g(str3);
                        HashMap map = new HashMap();
                        op5 op5Var = op5.a;
                        String str7 = mn5.e("game_title_mc_webp") + ":sg_game_name";
                        op5Var.getClass();
                        fn80.a(op5.b(str7, strG2, map), "", s3w.a(bz60.a(j.e(aVar9, 1.0f), f, f), "header_game_image"), d0b.a.d, null, 0.0f, null, null, null, bVar6, 3120, 2032);
                        bVar6.H();
                    } else {
                        bVar6.N(-871999540);
                        String strG3 = krh0.g(str3);
                        HashMap map2 = new HashMap();
                        op5 op5Var2 = op5.a;
                        String str8 = mn5.e("game_title_webp") + ":sg_game_name";
                        op5Var2.getClass();
                        fn80.a(op5.b(str8, strG3, map2), "", s3w.a(bz60.a(j.e(aVar9, 1.0f), f, f), "header_game_image"), d0b.a.d, null, 0.0f, null, null, null, bVar6, 3120, 2032);
                        bVar6.H();
                    }
                    bVar6.H();
                    Unit unit2 = Unit.a;
                }
                bVar6.s();
                d dVarA5 = f160Var2.a(z7 ? f7 + f5 : f6, aVar9, true);
                d160 d160VarA3 = b160.a(kw0.b, bVar2, bVar6, 54);
                int iHashCode9 = Long.hashCode(l2a.a(bVar6));
                ne00 ne00VarO9 = bVar6.o();
                d dVarC9 = c.c(bVar6, dVarA5);
                bVar6.D();
                if (bVar6.g()) {
                    aVar4 = aVar3;
                    bVar6.F(aVar4);
                } else {
                    aVar4 = aVar3;
                    bVar6.p();
                }
                yka.a.b bVar8 = bVar3;
                hlh0.a(bVar6, d160VarA3, bVar8);
                yka.a.d dVar4 = dVar3;
                hlh0.a(bVar6, ne00VarO9, dVar4);
                if (bVar6.g() || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode9))) {
                    c1350a2 = c1350a;
                    n30.a(iHashCode9, bVar6, iHashCode9, c1350a2);
                } else {
                    c1350a2 = c1350a;
                }
                yka.a.c cVar4 = cVar;
                hlh0.a(bVar6, dVarC9, cVar4);
                yka.a.C1350a c1350a5 = c1350a2;
                d dVarC10 = androidx.compose.foundation.a.c(j58.l, h.j(aVar9, 0.0f, 0.0f, 16.0f, 0.0f, 11));
                aiv aivVarC6 = g75.c(n54Var, false);
                int iHashCode10 = Long.hashCode(l2a.a(bVar6));
                ne00 ne00VarO10 = bVar6.o();
                d dVarC11 = c.c(bVar6, dVarC10);
                bVar6.D();
                if (bVar6.g()) {
                    bVar6.F(aVar4);
                } else {
                    bVar6.p();
                }
                hlh0.a(bVar6, aivVarC6, bVar8);
                hlh0.a(bVar6, ne00VarO10, dVar4);
                if (bVar6.g() || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode10))) {
                    n30.a(iHashCode10, bVar6, iHashCode10, c1350a5);
                }
                hlh0.a(bVar6, dVarC11, cVar4);
                crz crzVarA2 = erz.a(R.drawable.chat_icon, 0, bVar6);
                long jG = mz1Var.G();
                float f8 = density / 15.0f;
                d dVarR = j.r(aVar9, lla.b(f8, bVar6));
                Object objY5 = bVar6.y();
                if (objY5 == c0042a) {
                    objY5 = yxo.a();
                    bVar6.r(objY5);
                }
                psw pswVar2 = (psw) objY5;
                boolean z17 = ((i8 & 112) == 32) | ((i8 & 14) == 4) | ((i6 & 896) == 256) | ((29360128 & i6) == 8388608);
                Object objY6 = bVar6.y();
                if (z17 || objY6 == c0042a) {
                    z11 = z;
                    objY6 = new Function0() { // from class: nda
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (!((Boolean) function4.invoke()).booleanValue()) {
                                function5.invoke();
                            } else if (z11) {
                                function1.invoke();
                            }
                            return Unit.a;
                        }
                    };
                    bVar6.r(objY6);
                } else {
                    z11 = z;
                }
                b bVar9 = bVar6;
                h6n.b(crzVarA2, "navigation_chat_button", s3w.a(dw.a(androidx.compose.foundation.d.b(dVarR, pswVar2, null, false, null, (Function0) objY6, 28), z11 ? f6 : f4), "navigation_chat_button"), jG, bVar9, 48, 0);
                if (z4) {
                    bVar9.N(-910717598);
                    z12 = false;
                    nia.a(0, bVar9);
                } else {
                    z12 = false;
                    bVar9.N(-929939923);
                }
                bVar9.H();
                bVar9.s();
                aiv aivVarC7 = g75.c(ht.a.c, z12);
                int iHashCode11 = Long.hashCode(l2a.a(bVar9));
                ne00 ne00VarO11 = bVar9.o();
                d dVarC12 = c.c(bVar9, aVar9);
                bVar9.D();
                if (bVar9.g()) {
                    bVar9.F(aVar4);
                } else {
                    bVar9.p();
                }
                hlh0.a(bVar9, aivVarC7, bVar8);
                hlh0.a(bVar9, ne00VarO11, dVar4);
                if (bVar9.g() || !Intrinsics.g(bVar9.y(), Integer.valueOf(iHashCode11))) {
                    n30.a(iHashCode11, bVar9, iHashCode11, c1350a5);
                }
                hlh0.a(bVar9, dVarC12, cVar4);
                crz crzVarA3 = erz.a(2131232020, 0, bVar9);
                long j3 = j58.f;
                d dVarF3 = h.f(j.r(aVar9, lla.b(f8, bVar9)), 2.0f);
                Object objY7 = bVar9.y();
                if (objY7 == c0042a) {
                    objY7 = yxo.a();
                    bVar9.r(objY7);
                }
                psw pswVar3 = (psw) objY7;
                boolean z18 = (i6 & 234881024) == 67108864;
                Object objY8 = bVar9.y();
                if (z18 || objY8 == c0042a) {
                    function6 = function2;
                    objY8 = new gtx(function6, 2);
                    bVar9.r(objY8);
                } else {
                    function6 = function2;
                }
                h6n.b(crzVarA3, "navigation_menu_button", s3w.a(androidx.compose.foundation.d.b(dVarF3, pswVar3, null, false, null, (Function0) objY8, 28), "navigation_menu_button"), j3, bVar9, 3120, 0);
                bVar = bVar9;
                if (((Boolean) function4.invoke()).booleanValue() && z2) {
                    bVar.N(600233613);
                    ty0.a(bVar, androidx.compose.foundation.a.c(j58.g, ls7.a(j.r(h.j(aVar9, 0.0f, 2.0f, 0.0f, 0.0f, 13), 8.0f), j060.a)));
                } else {
                    bVar.N(579956854);
                }
                bVar.H();
                bVar.s();
                bVar.s();
            } else {
                function6 = function2;
                bVar = bVarA;
                bVar.N(-838625495);
            }
            bVar.H();
            bVar.s();
            bVar.s();
        } else {
            function6 = function2;
            bVar = bVarA;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final Function0 function7 = function6;
            eVarZ.e(new Function2() { // from class: oda
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    pda.b(str, str2, z, str3, str4, z2, function0, function1, function7, function3, function4, function5, z3, z4, mz1Var, cj5Var, f, j, z5, z6, z7, z8, (a) obj, iA, iA2);
                    return Unit.a;
                }
            });
        }
    }
}
