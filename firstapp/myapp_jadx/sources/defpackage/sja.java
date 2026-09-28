package defpackage;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportygames.crash.remote.models.Coefficients;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class sja {

    public static final class a implements PointerInputEventHandler {
        public static final a a = new a();

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
            Object objD = u4f0.d(u020Var, null, new rja(0), v1bVar, 7);
            return objD == y5b.a ? objD : Unit.a;
        }
    }

    public static final class b implements PointerInputEventHandler {
        public static final b a = new b();

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
            Object objD = u4f0.d(u020Var, null, new tja(), v1bVar, 7);
            return objD == y5b.a ? objD : Unit.a;
        }
    }

    public static final void a(final boolean z, final Function0 function0, final List list, final m28 m28Var, final mz1 mz1Var, final cj5 cj5Var, final String str, final String str2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        function0.getClass();
        list.getClass();
        m28Var.getClass();
        mz1Var.getClass();
        cj5Var.getClass();
        str2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-2056438701);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(m28Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(mz1Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(cj5Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.M(str) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.M(str2) ? 8388608 : 4194304;
        }
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            u60.a(function0, new yle(true, false, false), pp8.b(1649176682, new Function2() { // from class: mja
                /* JADX WARN: Code duplicated, block: B:16:0x003c  */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Window window;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ViewParent parent = ((View) aVar2.O(AndroidCompositionLocals_androidKt.f)).getParent();
                        if (parent == null) {
                            window = null;
                        } else {
                            eme emeVar = parent instanceof eme ? (eme) parent : null;
                            if (emeVar != null) {
                                window = emeVar.getWindow();
                            } else {
                                window = null;
                            }
                        }
                        boolean zA = aVar2.A(window);
                        Object objY = aVar2.y();
                        if (zA || objY == a.C0041a.a) {
                            objY = new aye(window, 2);
                            aVar2.r(objY);
                        }
                        use useVar = xvf.a;
                        aVar2.t((Function0) objY);
                        d dVarF = h.f(j.A(j.g(d.a.b, 1.0f), null, 3), 16.0f);
                        i060 i060VarC = j060.c(12.0f);
                        long j = j58.b;
                        final boolean z2 = z;
                        final Function0 function1 = function0;
                        final List list2 = list;
                        final m28 m28Var2 = m28Var;
                        final mz1 mz1Var2 = mz1Var;
                        final cj5 cj5Var2 = cj5Var;
                        final String str3 = str;
                        final String str4 = str2;
                        ihe0.a(dVarF, i060VarC, j, 0L, 0.0f, 0.0f, null, pp8.b(-1265325947, new Function2() { // from class: oja
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar3 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    Function0 function2 = function1;
                                    boolean zM = aVar3.M(function2);
                                    Object objY2 = aVar3.y();
                                    if (zM || objY2 == a.C0041a.a) {
                                        objY2 = new pja(function2, 0);
                                        aVar3.r(objY2);
                                    }
                                    sja.b(z2, (Function0) objY2, list2, m28Var2, mz1Var2, cj5Var2, str3, str4, aVar3, 0);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 12583302, 120);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 3) & 14) | 432, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: nja
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sja.a(z, function0, list, m28Var, mz1Var, cj5Var, str, str2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final Function0<Unit> function0, final List<Coefficients> list, final m28 m28Var, final mz1 mz1Var, final cj5 cj5Var, final String str, final String str2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-1729225052);
        int i2 = i | (bVarI.b(z) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(list) ? 256 : 128) | (bVarI.A(m28Var) ? 2048 : 1024) | (bVarI.A(mz1Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(cj5Var) ? 131072 : 65536) | (bVarI.M(str) ? 1048576 : 524288) | (bVarI.M(str2) ? 8388608 : 4194304);
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            double d = ((double) ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenWidthDp) * 0.9d;
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), j58.c(0.9f, j58.b), zk40.a);
            Unit unit = Unit.a;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = a.a;
                bVarI.r(objY);
            }
            d dVarA = wje0.a(dVarB, unit, (PointerInputEventHandler) objY);
            n54 n54Var = ht.a.e;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarW = j.w(aVar2, (float) d);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = b.a;
                bVarI.r(objY2);
            }
            d dVarA2 = wje0.a(dVarW, unit, (PointerInputEventHandler) objY2);
            aiv aivVarC2 = g75.c(n54Var, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            fh4.a(z, function0, list, m28Var, mz1Var, cj5Var, str, str2, bVarI, i2 & 33554430);
            f30.a(bVarI, true, true, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, function0, list, m28Var, mz1Var, cj5Var, str, str2, i) { // from class: qja
                public final /* synthetic */ boolean a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ List c;
                public final /* synthetic */ m28 d;
                public final /* synthetic */ mz1 e;
                public final /* synthetic */ cj5 f;
                public final /* synthetic */ String i;
                public final /* synthetic */ String v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    sja.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
