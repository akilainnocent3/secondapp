package defpackage;

import android.webkit.WebView;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c0j0 {
    public static final List<nx90> a = kotlin.collections.b.k(new nx90(16, 0.5f), new nx90(12, 1.0f), new nx90(12, 0.85f), new nx90(12, 1.0f), new nx90(12, 0.7f));

    public static final class a implements tse {
        public final /* synthetic */ ibs a;
        public final /* synthetic */ b0j0 b;

        public a(ibs ibsVar, b0j0 b0j0Var) {
            this.a = ibsVar;
            this.b = b0j0Var;
        }

        @Override // defpackage.tse
        public final void dispose() {
            this.a.getLifecycle().d(this.b);
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s9s.a.values().length];
            try {
                iArr[s9s.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s9s.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s9s.a.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void a(final WebView webView, final Function0<Boolean> function0, androidx.compose.runtime.a aVar, final int i) {
        boolean z;
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-429809194);
        int i2 = 2;
        int i3 = (bVarI.A(webView) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (!bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            bVarI.G();
        } else if (webView != null) {
            bVarI.N(-1148051746);
            ibs ibsVar = (ibs) bVarI.O(ndt.a);
            boolean zA = bVarI.A(webView) | bVarI.A(ibsVar);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new cj60(ibsVar, webView, 1);
                bVarI.r(objY);
            }
            xvf.c(ibsVar, (Function1) objY, bVarI);
            boolean zBooleanValue = function0.invoke().booleanValue();
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
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
            d dVarC2 = androidx.compose.ui.graphics.a.c(j.g(aVar2, 1.0f), 0.0f, 0.0f, zBooleanValue ? 0.0f : 1.0f, 0.0f, 0.0f, 0.0f, 0L, null, 524283);
            boolean zA2 = bVarI.A(webView);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new qj6(webView, i2);
                bVarI.r(objY2);
            }
            androidx.compose.ui.viewinterop.b.a((Function1) objY2, dVarC2, null, bVarI, 0, 4);
            if (zBooleanValue) {
                bVarI.N(894018394);
                z = false;
                b(0, 0, 1, bVarI);
                bVarI.X(false);
            } else {
                z = false;
                bVarI.N(894065483);
                bVarI.X(false);
            }
            bVarI.X(true);
            bVarI.X(z);
        } else {
            bVarI.N(-1146931220);
            bVarI.X(false);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(webView, function0, i) { // from class: zzi0
                public final /* synthetic */ WebView a;
                public final /* synthetic */ Function0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    c0j0.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, final int i2, final int i3, androidx.compose.runtime.a aVar) {
        int i4;
        androidx.compose.runtime.b bVarI = aVar.i(1451962734);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (bVarI.d(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if (bVarI.q(i4 & 1, (i4 & 3) != 2)) {
            if (i5 != 0) {
                i = 5;
            }
            hfs hfsVarA = m590.a(null, bVarI, 3);
            i060 i060VarC = j060.c(4.0f);
            d.a aVar2 = d.a.b;
            d dVarF = h.f(j.g(aVar2, 1.0f), ((cjb0) bVarI.O(ejb0.a)).e);
            i78 i78VarA = g78.a(new kw0.i(12.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            bVarI.N(-1966944961);
            for (int i6 = 0; i6 < i; i6++) {
                bVarI.N(-1966943390);
                for (nx90 nx90Var : a) {
                    g75.a(androidx.compose.foundation.a.a(j.i(j.g(aVar2, nx90Var.a), nx90Var.b), hfsVarA, i060VarC, 0.0f, 4), bVarI, 0);
                }
                bVarI.X(false);
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: a0j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    c0j0.b(i, iA, i3, (a) obj);
                    return Unit.a;
                }
            };
        }
    }
}
