package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes6.dex */
public final class g4q {
    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(-1701423803);
        if (bVarI.q(i & 1, i != 0)) {
            float f = ((cjb0) bVarI.O(ejb0.a)).h;
            d.a aVar2 = d.a.b;
            d dVarG = j.g(j.i(aVar2, f), 1.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
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
            c55.a.a(31.0f, 2.0f, 197046, 0, ((lib0) bVarI.O(oib0.a)).B, j060.c(100.0f), bVarI, j.A(aVar2, null, 1));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new q3q();
        }
    }

    public static final void b(int i, a aVar) {
        b bVarI = aVar.i(-1651097584);
        if (bVarI.q(i & 1, i != 0)) {
            View view = (View) bVarI.O(AndroidCompositionLocals_androidKt.f);
            boolean zA = bVarI.A(view);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new fh7(view, 1);
                bVarI.r(objY);
            }
            use useVar = xvf.a;
            bVarI.t((Function0) objY);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new i3q(i);
        }
    }

    public static final Unit c(View view) {
        Window window;
        ViewParent parent = view.getParent();
        eme emeVar = parent instanceof eme ? (eme) parent : null;
        if (emeVar != null && (window = emeVar.getWindow()) != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.clearFlags(2);
            window.clearFlags(201326592);
            window.addFlags(Integer.MIN_VALUE);
            window.setDimAmount(0.0f);
            window.setWindowAnimations(0);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            if (Build.VERSION.SDK_INT >= 29) {
                window.setNavigationBarContrastEnforced(false);
            }
            z7j0.a(window, false);
            window.getDecorView().setSystemUiVisibility(1792);
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:104:0x020b  */
    /* JADX WARN: Code duplicated, block: B:105:0x021e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0227  */
    /* JADX WARN: Code duplicated, block: B:111:0x0239  */
    /* JADX WARN: Code duplicated, block: B:114:0x0255  */
    /* JADX WARN: Code duplicated, block: B:115:0x025c  */
    /* JADX WARN: Code duplicated, block: B:126:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:128:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:131:0x0307  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00be  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x0106  */
    /* JADX WARN: Code duplicated, block: B:68:0x0117  */
    /* JADX WARN: Code duplicated, block: B:71:0x0126  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    /* JADX WARN: Code duplicated, block: B:76:0x013f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0185  */
    /* JADX WARN: Code duplicated, block: B:82:0x0187  */
    /* JADX WARN: Code duplicated, block: B:85:0x018e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0190  */
    /* JADX WARN: Code duplicated, block: B:90:0x019b  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ca  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final Object obj, final Function0 function0, d dVar, boolean z, final op8 op8Var, a aVar, final int i, final int i2) {
        final d dVar2;
        int i3;
        boolean z2;
        final int i4;
        boolean z3;
        b bVar;
        final boolean z4;
        e eVarZ;
        final d dVar3;
        boolean z5;
        final ytw ytwVarC;
        Object objY;
        a.C0041a.C0042a c0042a;
        v5b v5bVar;
        Object objY2;
        i20 i20Var;
        fkd0 fkd0VarD;
        Object objY3;
        float fC1;
        Object objY4;
        final ytw ytwVar;
        Object objY5;
        ytw ytwVar2;
        Object objY6;
        osw oswVar;
        Object objY7;
        final ytw ytwVar3;
        int i5;
        boolean z6;
        boolean zA;
        i20 i20Var2;
        Object y3qVar;
        int i6;
        osw oswVar2;
        ytw ytwVar4;
        Integer numValueOf;
        boolean z7;
        boolean z8;
        Object z3qVar;
        Integer num;
        boolean zM;
        Object objY8;
        final i20 i20Var3;
        Object objY9;
        final twd0 twd0Var;
        Object objY10;
        Object objY11;
        Object objY12;
        final Object value;
        b bVar2;
        final boolean z9;
        final v5b v5bVar2;
        boolean z10;
        function0.getClass();
        b bVarI = aVar.i(837225438);
        int i7 = (bVarI.M(obj) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i7 |= bVarI.A(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 = i7 | 384;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i3 = i7 | (bVarI.M(dVar2) ? 256 : 128);
        }
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= bVarI.b(z2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i4 & 1, z3)) {
                if (i8 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i9 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                ytwVarC = m.c(function0, bVarI);
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = xvf.i(kotlin.coroutines.e.a, bVarI);
                    bVarI.r(objY);
                }
                v5bVar = (v5b) objY;
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new i20(m4q.a);
                    bVarI.r(objY2);
                }
                i20Var = (i20) objY2;
                fkd0VarD = yi0.d(0.0f, 200.0f, null, 5);
                gzg0 gzg0Var = v00.a;
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new g3q();
                    bVarI.r(objY3);
                }
                final l5f0 l5f0VarA = v00.a(i20Var, (Function1) objY3, fkd0VarD, bVarI, 3510);
                fC1 = ((mmd) bVarI.O(kna.h)).C1(125.0f);
                objY4 = bVarI.y();
                if (objY4 == c0042a) {
                    objY4 = m.b(obj);
                    bVarI.r(objY4);
                }
                ytwVar = (ytw) objY4;
                objY5 = bVarI.y();
                if (objY5 == c0042a) {
                    if (obj != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objY5 = nvc.a(z10, bVarI);
                }
                ytwVar2 = (ytw) objY5;
                objY6 = bVarI.y();
                if (objY6 == c0042a) {
                    objY6 = k.a(0);
                    bVarI.r(objY6);
                }
                oswVar = (osw) objY6;
                objY7 = bVarI.y();
                if (objY7 == c0042a) {
                    objY7 = m.b(h4q.a);
                    bVarI.r(objY7);
                }
                ytwVar3 = (ytw) objY7;
                i5 = i4 & 14;
                if (i5 != 4) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                zA = z6 | bVarI.A(v5bVar) | bVarI.M(ytwVarC);
                Object objY13 = bVarI.y();
                if (!zA || objY13 == c0042a) {
                    i20Var2 = i20Var;
                    i6 = i5;
                    oswVar2 = oswVar;
                    ytwVar4 = ytwVar2;
                    y3qVar = new y3q(obj, ytwVar, ytwVar4, oswVar2, ytwVar3, v5bVar, i20Var2, ytwVarC, null);
                    bVarI.r(y3qVar);
                } else {
                    i20Var2 = i20Var;
                    y3qVar = objY13;
                    i6 = i5;
                    oswVar2 = oswVar;
                    ytwVar4 = ytwVar2;
                }
                xvf.e(bVarI, obj, (Function2) y3qVar);
                Boolean bool = (Boolean) ytwVar4.getValue();
                bool.getClass();
                numValueOf = Integer.valueOf(oswVar2.D());
                if (obj != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z7);
                if (i6 != 4) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                Object objY14 = bVarI.y();
                if (!z8 || objY14 == c0042a) {
                    num = numValueOf;
                    z3qVar = new z3q(obj, i20Var2, ytwVar4, oswVar2, ytwVar3, null);
                    bVarI.r(z3qVar);
                } else {
                    num = numValueOf;
                    z3qVar = objY14;
                }
                xvf.f(bool, num, boolValueOf, (Function2) z3qVar, bVarI);
                h4q h4qVar = (h4q) ytwVar3.getValue();
                zM = bVarI.M(ytwVarC);
                objY8 = bVarI.y();
                if (!zM || objY8 == c0042a) {
                    i20 i20Var4 = i20Var2;
                    objY8 = new a4q(ytwVar3, i20Var4, ytwVar4, ytwVar, oswVar2, ytwVarC, null);
                    i20Var3 = i20Var4;
                    ytwVar = ytwVar;
                    bVarI.r(objY8);
                } else {
                    i20Var3 = i20Var2;
                }
                xvf.g(i20Var3, h4qVar, (Function2) objY8, bVarI);
                objY9 = bVarI.y();
                if (objY9 == c0042a) {
                    final wh2 wh2Var = new wh2(oswVar2, 1);
                    objY9 = a6a0.b(new Function0() { // from class: x3q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            float fIntValue = ((Number) wh2Var.invoke()).intValue();
                            if (fIntValue != 0.0f) {
                                i20 i20Var5 = i20Var3;
                                if (!Float.isNaN(((t5a0) i20Var5.j).j())) {
                                    fIntValue = f.d(((t5a0) i20Var5.j).j(), 0.0f, fIntValue);
                                }
                            }
                            return Float.valueOf(fIntValue);
                        }
                    });
                    bVarI.r(objY9);
                }
                twd0Var = (twd0) objY9;
                objY10 = bVarI.y();
                if (objY10 == c0042a) {
                    final r3q r3qVar = new r3q(oswVar2, 0);
                    objY10 = a6a0.b(new Function0() { // from class: h3q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            float fIntValue = ((Number) r3qVar.invoke()).intValue();
                            n9f n9fVarB = i20Var3.b();
                            m4q m4qVar = m4q.b;
                            if (!n9fVarB.a(m4qVar)) {
                                m4qVar = m4q.c;
                            }
                            float fD = n9fVarB.d(m4qVar);
                            if (Float.isNaN(fD)) {
                                fD = 0.0f;
                            }
                            float f = fIntValue - fD;
                            if (f < 1.0f) {
                                f = 1.0f;
                            }
                            return Float.valueOf(fIntValue > 0.0f ? f.d((fIntValue - ((Number) twd0Var.getValue()).floatValue()) / f, 0.0f, 1.0f) : 0.0f);
                        }
                    });
                    bVarI.r(objY10);
                }
                final twd0 twd0Var2 = (twd0) objY10;
                objY11 = bVarI.y();
                if (objY11 == c0042a) {
                    objY11 = new l4q(twd0Var);
                    bVarI.r(objY11);
                }
                final l4q l4qVar = (l4q) objY11;
                objY12 = bVarI.y();
                if (objY12 == c0042a) {
                    f4q f4qVar = new f4q(new ohb(ytwVar3, 1), i20Var3, new s3q(v5bVar, i20Var3, fC1, fkd0VarD));
                    bVarI.r(f4qVar);
                    objY12 = f4qVar;
                }
                final flx flxVar = (flx) objY12;
                if (obj == null) {
                    value = ytwVar.getValue();
                } else {
                    value = obj;
                }
                if (((Boolean) ytwVar4.getValue()).booleanValue() || value == null) {
                    bVar2 = bVarI;
                    z9 = z5;
                    bVar2.N(915116676);
                    bVar2.X(false);
                } else {
                    bVarI.N(912113551);
                    boolean zA2 = bVarI.A(v5bVar) | bVarI.M(ytwVarC);
                    Object objY15 = bVarI.y();
                    if (zA2 || objY15 == c0042a) {
                        final i20 i20Var5 = i20Var3;
                        final ytw ytwVar5 = ytwVar4;
                        final osw oswVar3 = oswVar2;
                        v5bVar2 = v5bVar;
                        objY15 = new Function0() { // from class: t3q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                g4q.e(v5bVar2, ytwVar3, i20Var5, oswVar3, ytwVar5, ytwVar, ytwVarC, true);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY15);
                    } else {
                        v5bVar2 = v5bVar;
                    }
                    final osw oswVar4 = oswVar2;
                    z9 = z5;
                    final v5b v5bVar3 = v5bVar2;
                    final ytw ytwVar6 = ytwVar;
                    final i20 i20Var6 = i20Var3;
                    final ytw ytwVar7 = ytwVar4;
                    bVar2 = bVarI;
                    u60.a((Function0) objY15, new yle(37, false, false, false, false), pp8.b(-1767494512, new Function2() { // from class: u3q
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            a aVar2 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                g4q.b(0, aVar2);
                                t5q.a(0, aVar2);
                                d dVarE = j.e(d.a.b, 1.0f);
                                final boolean z11 = z9;
                                final v5b v5bVar4 = v5bVar3;
                                final ytw ytwVar8 = ytwVarC;
                                final d dVar4 = dVar3;
                                final flx flxVar2 = flxVar;
                                final i20 i20Var7 = i20Var6;
                                final l5f0 l5f0Var = l5f0VarA;
                                final osw oswVar5 = oswVar4;
                                final ytw ytwVar9 = ytwVar3;
                                final twd0 twd0Var3 = twd0Var2;
                                final ytw ytwVar10 = ytwVar7;
                                final ytw ytwVar11 = ytwVar6;
                                final twd0 twd0Var4 = twd0Var;
                                final op8 op8Var2 = op8Var;
                                final l4q l4qVar2 = l4qVar;
                                final Object obj4 = value;
                                final int i10 = i4;
                                q75.a(dVarE, null, false, pp8.b(-12941338, new gaj() { // from class: w3q
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                                        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v1 ??
                                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
                                        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:523)
                                        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
                                        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                                        */
                                    @Override // defpackage.gaj
                                    public final java.lang.Object invoke(java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
                                        /*
                                            Method dump skipped, instruction units count: 447
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.w3q.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                                    }
                                }, aVar2), aVar2, 3078, 6);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVar2, 432, 0);
                    bVar2.X(false);
                }
                bVar = bVar2;
                z4 = z9;
                dVar2 = dVar3;
            } else {
                bVarI.G();
                bVar = bVarI;
                z4 = z2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: v3q
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        g4q.d(obj, function0, dVar2, z4, op8Var, (a) obj2, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        z2 = z;
        i4 = i3;
        if ((i4 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i4 & 1, z3)) {
            if (i8 != 0) {
                dVar3 = d.a.b;
            } else {
                dVar3 = dVar2;
            }
            if (i9 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            ytwVarC = m.c(function0, bVarI);
            objY = bVarI.y();
            c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY);
            }
            v5bVar = (v5b) objY;
            objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new i20(m4q.a);
                bVarI.r(objY2);
            }
            i20Var = (i20) objY2;
            fkd0VarD = yi0.d(0.0f, 200.0f, null, 5);
            gzg0 gzg0Var2 = v00.a;
            objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new g3q();
                bVarI.r(objY3);
            }
            final l5f0 l5f0VarA2 = v00.a(i20Var, (Function1) objY3, fkd0VarD, bVarI, 3510);
            fC1 = ((mmd) bVarI.O(kna.h)).C1(125.0f);
            objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = m.b(obj);
                bVarI.r(objY4);
            }
            ytwVar = (ytw) objY4;
            objY5 = bVarI.y();
            if (objY5 == c0042a) {
                if (obj != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objY5 = nvc.a(z10, bVarI);
            }
            ytwVar2 = (ytw) objY5;
            objY6 = bVarI.y();
            if (objY6 == c0042a) {
                objY6 = k.a(0);
                bVarI.r(objY6);
            }
            oswVar = (osw) objY6;
            objY7 = bVarI.y();
            if (objY7 == c0042a) {
                objY7 = m.b(h4q.a);
                bVarI.r(objY7);
            }
            ytwVar3 = (ytw) objY7;
            i5 = i4 & 14;
            if (i5 != 4) {
                z6 = false;
            } else {
                z6 = true;
            }
            zA = z6 | bVarI.A(v5bVar) | bVarI.M(ytwVarC);
            Object objY16 = bVarI.y();
            if (zA) {
                i20Var2 = i20Var;
                i6 = i5;
                oswVar2 = oswVar;
                ytwVar4 = ytwVar2;
                y3qVar = new y3q(obj, ytwVar, ytwVar4, oswVar2, ytwVar3, v5bVar, i20Var2, ytwVarC, null);
                bVarI.r(y3qVar);
            } else {
                i20Var2 = i20Var;
                i6 = i5;
                oswVar2 = oswVar;
                ytwVar4 = ytwVar2;
                y3qVar = new y3q(obj, ytwVar, ytwVar4, oswVar2, ytwVar3, v5bVar, i20Var2, ytwVarC, null);
                bVarI.r(y3qVar);
            }
            xvf.e(bVarI, obj, (Function2) y3qVar);
            Boolean bool2 = (Boolean) ytwVar4.getValue();
            bool2.getClass();
            numValueOf = Integer.valueOf(oswVar2.D());
            if (obj != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            Boolean boolValueOf2 = Boolean.valueOf(z7);
            if (i6 != 4) {
                z8 = false;
            } else {
                z8 = true;
            }
            Object objY17 = bVarI.y();
            if (z8) {
                num = numValueOf;
                z3qVar = new z3q(obj, i20Var2, ytwVar4, oswVar2, ytwVar3, null);
                bVarI.r(z3qVar);
            } else {
                num = numValueOf;
                z3qVar = new z3q(obj, i20Var2, ytwVar4, oswVar2, ytwVar3, null);
                bVarI.r(z3qVar);
            }
            xvf.f(bool2, num, boolValueOf2, (Function2) z3qVar, bVarI);
            h4q h4qVar2 = (h4q) ytwVar3.getValue();
            zM = bVarI.M(ytwVarC);
            objY8 = bVarI.y();
            if (zM) {
                i20 i20Var7 = i20Var2;
                objY8 = new a4q(ytwVar3, i20Var7, ytwVar4, ytwVar, oswVar2, ytwVarC, null);
                i20Var3 = i20Var7;
                ytwVar = ytwVar;
                bVarI.r(objY8);
            } else {
                i20 i20Var8 = i20Var2;
                objY8 = new a4q(ytwVar3, i20Var8, ytwVar4, ytwVar, oswVar2, ytwVarC, null);
                i20Var3 = i20Var8;
                ytwVar = ytwVar;
                bVarI.r(objY8);
            }
            xvf.g(i20Var3, h4qVar2, (Function2) objY8, bVarI);
            objY9 = bVarI.y();
            if (objY9 == c0042a) {
                final wh2 wh2Var2 = new wh2(oswVar2, 1);
                objY9 = a6a0.b(new Function0() { // from class: x3q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float fIntValue = ((Number) wh2Var2.invoke()).intValue();
                        if (fIntValue != 0.0f) {
                            i20 i20Var9 = i20Var3;
                            if (!Float.isNaN(((t5a0) i20Var9.j).j())) {
                                fIntValue = f.d(((t5a0) i20Var9.j).j(), 0.0f, fIntValue);
                            }
                        }
                        return Float.valueOf(fIntValue);
                    }
                });
                bVarI.r(objY9);
            }
            twd0Var = (twd0) objY9;
            objY10 = bVarI.y();
            if (objY10 == c0042a) {
                final r3q r3qVar2 = new r3q(oswVar2, 0);
                objY10 = a6a0.b(new Function0() { // from class: h3q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float fIntValue = ((Number) r3qVar2.invoke()).intValue();
                        n9f n9fVarB = i20Var3.b();
                        m4q m4qVar = m4q.b;
                        if (!n9fVarB.a(m4qVar)) {
                            m4qVar = m4q.c;
                        }
                        float fD = n9fVarB.d(m4qVar);
                        if (Float.isNaN(fD)) {
                            fD = 0.0f;
                        }
                        float f = fIntValue - fD;
                        if (f < 1.0f) {
                            f = 1.0f;
                        }
                        return Float.valueOf(fIntValue > 0.0f ? f.d((fIntValue - ((Number) twd0Var.getValue()).floatValue()) / f, 0.0f, 1.0f) : 0.0f);
                    }
                });
                bVarI.r(objY10);
            }
            final twd0 twd0Var3 = (twd0) objY10;
            objY11 = bVarI.y();
            if (objY11 == c0042a) {
                objY11 = new l4q(twd0Var);
                bVarI.r(objY11);
            }
            final l4q l4qVar2 = (l4q) objY11;
            objY12 = bVarI.y();
            if (objY12 == c0042a) {
                f4q f4qVar2 = new f4q(new ohb(ytwVar3, 1), i20Var3, new s3q(v5bVar, i20Var3, fC1, fkd0VarD));
                bVarI.r(f4qVar2);
                objY12 = f4qVar2;
            }
            final flx flxVar2 = (flx) objY12;
            if (obj == null) {
                value = ytwVar.getValue();
            } else {
                value = obj;
            }
            if (((Boolean) ytwVar4.getValue()).booleanValue()) {
                bVar2 = bVarI;
                z9 = z5;
                bVar2.N(915116676);
                bVar2.X(false);
            } else {
                bVar2 = bVarI;
                z9 = z5;
                bVar2.N(915116676);
                bVar2.X(false);
            }
            bVar = bVar2;
            z4 = z9;
            dVar2 = dVar3;
        } else {
            bVarI.G();
            bVar = bVarI;
            z4 = z2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: v3q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    g4q.d(obj, function0, dVar2, z4, op8Var, (a) obj2, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(v5b v5bVar, ytw ytwVar, i20 i20Var, osw oswVar, ytw ytwVar2, ytw ytwVar3, ytw ytwVar4, boolean z) {
        h4q h4qVar = (h4q) ytwVar.getValue();
        h4q h4qVar2 = h4q.d;
        if (h4qVar == h4qVar2) {
            return;
        }
        ytwVar.setValue(h4qVar2);
        ej5.c(v5bVar, null, null, new c4q(i20Var, z, oswVar, ytwVar2, ytwVar3, ytwVar, ytwVar4, null), 3);
    }

    public static final void f(i20<m4q> i20Var, int i, final boolean z, ytw<h4q> ytwVar, int i2) {
        m4q m4qVar;
        h4q value = ytwVar.getValue();
        final float f = i2;
        final float f2 = f - (i * 0.5f);
        vbd vbdVarA = androidx.compose.foundation.gestures.a.a(new Function1() { // from class: o3q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                p9f p9fVar = (p9f) obj;
                p9fVar.getClass();
                p9fVar.a(m4q.c, 0.0f);
                if (!z) {
                    float f3 = f2;
                    if (f3 > 0.0f) {
                        p9fVar.a(m4q.b, f3);
                    }
                }
                p9fVar.a(m4q.a, f);
                return Unit.a;
            }
        });
        m4q m4qVar2 = (m4q) i20Var.i.getValue();
        int iOrdinal = value.ordinal();
        if (iOrdinal == 0) {
            m4qVar = m4q.a;
        } else if (iOrdinal == 1) {
            m4qVar = m4q.b;
            if (!vbdVarA.a(m4qVar)) {
                m4qVar = m4q.c;
            }
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                uhc.a();
                return;
            }
            m4qVar = m4q.a;
        } else {
            int iOrdinal2 = m4qVar2.ordinal();
            if (iOrdinal2 == 0) {
                m4qVar = m4q.a;
            } else if (iOrdinal2 == 1) {
                m4qVar = m4q.b;
                if (!vbdVarA.a(m4qVar)) {
                    m4qVar = m4q.c;
                }
            } else {
                if (iOrdinal2 != 2) {
                    uhc.a();
                    return;
                }
                m4qVar = m4q.c;
            }
        }
        i20Var.g(vbdVarA, m4qVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object g(i20 i20Var, float f, float f2, xi0 xi0Var, x1b x1bVar) {
        e4q e4qVar;
        boolean z;
        float f3;
        if (x1bVar instanceof e4q) {
            e4qVar = (e4q) x1bVar;
            int i = e4qVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                e4qVar.b = i - Integer.MIN_VALUE;
            } else {
                e4qVar = new e4q(x1bVar);
            }
        } else {
            e4qVar = new e4q(x1bVar);
        }
        e4q e4qVar2 = e4qVar;
        Object obj = e4qVar2.a;
        y5b y5bVar = y5b.a;
        int i2 = e4qVar2.b;
        m4q m4qVar = null;
        if (i2 == 0) {
            uj50.b(obj);
            isw iswVar = i20Var.j;
            if (Float.isNaN(((t5a0) iswVar).j())) {
                return Unit.a;
            }
            if (f <= (-f2)) {
                n9f n9fVarB = i20Var.b();
                m4q m4qVar2 = m4q.c;
                if (n9fVarB.a(m4qVar2)) {
                    m4qVar = m4qVar2;
                } else if (Math.abs(f) >= f2) {
                    if (f > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    n9f n9fVarB2 = i20Var.b();
                    float fJ = ((t5a0) iswVar).j();
                    if (z) {
                        f3 = 1.0f;
                    } else {
                        f3 = -1.0f;
                    }
                    m4qVar = (m4q) n9fVarB2.b(fJ + f3, z);
                }
            } else if (Math.abs(f) >= f2) {
                if (f > 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                n9f n9fVarB3 = i20Var.b();
                float fJ2 = ((t5a0) iswVar).j();
                if (z) {
                    f3 = 1.0f;
                } else {
                    f3 = -1.0f;
                }
                m4qVar = (m4q) n9fVarB3.b(fJ2 + f3, z);
            }
            if (m4qVar == null && (m4qVar = (m4q) i20Var.b().c(((t5a0) iswVar).j())) == null) {
                return Unit.a;
            }
            e4qVar2.b = 1;
            if (androidx.compose.foundation.gestures.a.g(i20Var, m4qVar, f, xi0Var, e4qVar2, 8) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
