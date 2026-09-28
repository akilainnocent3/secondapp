package defpackage;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m1h {
    public static final void a(boolean z, Function1 function1, d dVar, op8 op8Var, a aVar, final int i) {
        Function1 function2;
        op8 op8Var2;
        final d dVar2;
        int i2;
        final ytw ytwVar;
        final boolean z2 = z;
        b bVarI = aVar.i(1597265892);
        int i3 = i | (bVarI.b(z2) ? 4 : 2) | 384;
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            Configuration configuration = (Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a);
            View view = (View) bVarI.O(AndroidCompositionLocals_androidKt.f);
            boolean zM = bVarI.M(configuration) | bVarI.M(view);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new x7j0(view);
                bVarI.r(objY);
            }
            final x7j0 x7j0Var = (x7j0) objY;
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            final int iY0 = mmdVar.y0(48.0f);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(null);
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = k.a(0);
                bVarI.r(objY3);
            }
            final osw oswVar = (osw) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = k.a(0);
                bVarI.r(objY4);
            }
            final osw oswVar2 = (osw) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = new b5i();
                bVarI.r(objY5);
            }
            final b5i b5iVar = (b5i) objY5;
            ooa0 ooa0Var = (ooa0) bVarI.O(kna.p);
            String strA = xae0.a(R.string.m3c_dropdown_menu_expanded, bVarI);
            String strA2 = xae0.a(R.string.m3c_dropdown_menu_collapsed, bVarI);
            String strA3 = xae0.a(R.string.m3c_dropdown_menu_toggle, bVarI);
            Object objY6 = bVarI.y();
            if (objY6 == c0042a) {
                objY6 = m.b(new z0h());
                bVarI.r(objY6);
            }
            ytw ytwVar3 = (ytw) objY6;
            Object objY7 = bVarI.y();
            if (objY7 == c0042a) {
                objY7 = m.b(Boolean.FALSE);
                bVarI.r(objY7);
            }
            ytw ytwVar4 = (ytw) objY7;
            int i4 = i3 & 14;
            boolean zM2 = (i4 == 4) | bVarI.M(x7j0Var) | bVarI.M(mmdVar);
            Object objY8 = bVarI.y();
            if (zM2 || objY8 == c0042a) {
                i2 = i4;
                androidx.compose.material3.a aVar2 = new androidx.compose.material3.a(b5iVar, z, ytwVar4, strA, strA2, strA3, ooa0Var, ytwVar3, function1, oswVar, oswVar2);
                b5iVar = b5iVar;
                z2 = z;
                bVarI.r(aVar2);
                objY8 = aVar2;
            } else {
                z2 = z;
                i2 = i4;
            }
            androidx.compose.material3.a aVar3 = (androidx.compose.material3.a) objY8;
            boolean zA = bVarI.A(x7j0Var) | bVarI.d(iY0);
            Object objY9 = bVarI.y();
            if (zA || objY9 == c0042a) {
                ytwVar = ytwVar2;
                Function1 function3 = new Function1() { // from class: c1h
                    /* JADX WARN: Code duplicated, block: B:15:0x006a  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int iB;
                        urr urrVar = (urr) obj;
                        ytw ytwVar5 = ytwVar;
                        ytwVar5.setValue(urrVar);
                        oswVar.k((int) (urrVar.a() >> 32));
                        View view2 = x7j0Var.a;
                        Rect rect = new Rect();
                        view2.getWindowVisibleDisplayFrame(rect);
                        int i5 = rect.top;
                        int i6 = rect.bottom;
                        urr urrVar2 = (urr) ytwVar5.getValue();
                        lk40 lk40VarB = (urrVar2 == null || !urrVar2.e()) ? lk40.e : pk40.b(urrVar2.T(0L), kc6.d(urrVar2.a()));
                        int i7 = iY0;
                        int i8 = i5 + i7;
                        int i9 = i6 - i7;
                        float f = lk40VarB.b;
                        if (f <= i6) {
                            float f2 = lk40VarB.d;
                            if (f2 < i5) {
                                iB = i9 - i8;
                            } else {
                                iB = ycv.b(Math.max(f - i8, i9 - f2));
                            }
                        } else {
                            iB = i9 - i8;
                        }
                        oswVar2.k(Math.max(iB, 0));
                        return Unit.a;
                    }
                };
                bVarI.r(function3);
                objY9 = function3;
            } else {
                ytwVar = ytwVar2;
            }
            d.a aVar4 = d.a.b;
            d dVarA = v.a(aVar4, (Function1) objY9);
            aiv aivVarC = g75.c(ht.a.a, false);
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            op8Var2 = op8Var;
            op8Var2.invoke(aVar3, bVarI, 48);
            bVarI.X(true);
            if (z2) {
                bVarI.N(209894723);
                boolean zA2 = bVarI.A(x7j0Var) | bVarI.d(iY0);
                Object objY10 = bVarI.y();
                if (zA2 || objY10 == c0042a) {
                    objY10 = new Function0() { // from class: d1h
                        /* JADX WARN: Code duplicated, block: B:15:0x0058  */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int iB;
                            View view2 = x7j0Var.a;
                            Rect rect = new Rect();
                            view2.getWindowVisibleDisplayFrame(rect);
                            int i5 = rect.top;
                            int i6 = rect.bottom;
                            urr urrVar = (urr) ytwVar.getValue();
                            lk40 lk40VarB = (urrVar == null || !urrVar.e()) ? lk40.e : pk40.b(urrVar.T(0L), kc6.d(urrVar.a()));
                            int i7 = iY0;
                            int i8 = i5 + i7;
                            int i9 = i6 - i7;
                            float f = lk40VarB.b;
                            if (f <= i6) {
                                float f2 = lk40VarB.d;
                                if (f2 < i5) {
                                    iB = i9 - i8;
                                } else {
                                    iB = ycv.b(Math.max(f - i8, i9 - f2));
                                }
                            } else {
                                iB = i9 - i8;
                            }
                            oswVar2.k(Math.max(iB, 0));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY10);
                }
                q1h.a((Function0) objY10, bVarI, 0);
                bVarI.X(false);
            } else {
                bVarI.N(210228190);
                bVarI.X(false);
            }
            int i5 = i2;
            boolean z3 = i5 == 4;
            Object objY11 = bVarI.y();
            if (z3 || objY11 == c0042a) {
                objY11 = new Function0() { // from class: e1h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (z2) {
                            b5i.b(b5iVar);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY11);
            }
            use useVar = xvf.a;
            bVarI.t((Function0) objY11);
            Object objY12 = bVarI.y();
            if (objY12 == c0042a) {
                function2 = function1;
                objY12 = new f1h(0, function2);
                bVarI.r(objY12);
            } else {
                function2 = function1;
            }
            xr1.a(i5, bVarI, (Function0) objY12, z2);
            dVar2 = aVar4;
        } else {
            function2 = function1;
            op8Var2 = op8Var;
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final op8 op8Var3 = op8Var2;
            final Function1 function4 = function2;
            eVarZ.d = new Function2(z2, function4, dVar2, op8Var3, i) { // from class: g1h
                public final /* synthetic */ boolean a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ d c;
                public final /* synthetic */ op8 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(3121);
                    m1h.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
