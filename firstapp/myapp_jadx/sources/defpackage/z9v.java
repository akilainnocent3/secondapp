package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class z9v {

    public static final class a implements tse {
        public final /* synthetic */ ibs a;
        public final /* synthetic */ j9v b;

        public a(ibs ibsVar, j9v j9vVar) {
            this.a = ibsVar;
            this.b = j9vVar;
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
            a = iArr;
            int[] iArr2 = new int[o7v.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                o7v o7vVar = o7v.LIVE;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                o7v o7vVar2 = o7v.LIVE;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final void a(h8f0 h8f0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(638045622);
        int i2 = (bVarI.M(h8f0Var) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            final WebView webView = h8f0Var.a;
            final ibs ibsVar = (ibs) bVarI.O(ndt.a);
            boolean zA = bVarI.A(webView) | bVarI.A(ibsVar);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new Function1() { // from class: e9v
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v2, types: [hbs, j9v] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((use) obj).getClass();
                        final WebView webView2 = webView;
                        ?? r2 = new cbs() { // from class: j9v
                            @Override // defpackage.cbs
                            public final void F0(ibs ibsVar2, s9s.a aVar2) {
                                int i3 = z9v.b.a[aVar2.ordinal()];
                                WebView webView3 = webView2;
                                if (i3 == 1) {
                                    webView3.onResume();
                                } else {
                                    if (i3 != 2) {
                                        return;
                                    }
                                    webView3.onPause();
                                }
                            }
                        };
                        ibs ibsVar2 = ibsVar;
                        ibsVar2.getLifecycle().a(r2);
                        return new z9v.a(ibsVar2, r2);
                    }
                };
                bVarI.r(objY);
            }
            xvf.c(ibsVar, (Function1) objY, bVarI);
            boolean zBooleanValue = ((Boolean) ((x5a0) h8f0Var.b).getValue()).booleanValue();
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
                objY2 = new Function1() { // from class: f9v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((Context) obj).getClass();
                        WebView webView2 = webView;
                        ViewParent parent = webView2.getParent();
                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup != null) {
                            viewGroup.removeView(webView2);
                        }
                        return webView2;
                    }
                };
                bVarI.r(objY2);
            }
            androidx.compose.ui.viewinterop.b.a((Function1) objY2, dVarC2, null, bVarI, 0, 4);
            if (zBooleanValue) {
                bVarI.N(-1818636149);
                c0j0.b(2, 6, 0, bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(-1818579450);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new g9v(i, 0, h8f0Var);
        }
    }

    public static final void b(final o7v o7vVar, final boolean z, final boolean z2, final boolean z3, final prg prgVar, final mjs mjsVar, final h8f0 h8f0Var, final uf00 uf00Var, final uf00 uf00Var2, final r680 r680Var, final Function1 function1, final Function1 function2, final Function0 function0, final Function1 function3, final Function1 function4, final Function1 function5, final Function2 function6, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        Function1 function7;
        androidx.compose.runtime.b bVar;
        o7vVar.getClass();
        uf00Var.getClass();
        uf00Var2.getClass();
        r680Var.getClass();
        function1.getClass();
        function2.getClass();
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1902849175);
        int i4 = i | (bVarI.d(o7vVar.ordinal()) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.b(z2) ? 256 : 128) | (bVarI.b(z3) ? 2048 : 1024) | (bVarI.M(prgVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.d(mjsVar == null ? -1 : mjsVar.ordinal()) ? 131072 : 65536) | (bVarI.M(h8f0Var) ? 1048576 : 524288) | (bVarI.A(uf00Var) ? 8388608 : 4194304) | (bVarI.M(uf00Var2) ? 67108864 : 33554432) | (bVarI.M(r680Var) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i3 = i2 | (bVarI.A(function1) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.A(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.A(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.A(function3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            function7 = function4;
            i3 |= bVarI.A(function7) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            function7 = function4;
        }
        if ((i2 & 196608) == 0) {
            i3 |= bVarI.A(function5) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= bVarI.A(function6) ? 1048576 : 524288;
        }
        int i5 = i3;
        if (bVarI.q(i4 & 1, ((i4 & 306783379) == 306783378 && (599187 & i5) == 599186) ? false : true)) {
            final zzr zzrVarA = e0s.a(0, 3, bVarI);
            final ytw ytwVarC = m.c(Boolean.valueOf(z3), bVarI);
            final ytw ytwVarC2 = m.c(Boolean.valueOf(z2), bVarI);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = a6a0.b(new Function0() { // from class: c9v
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        zzr zzrVar = zzrVarA;
                        zyr zyrVar = (zyr) CollectionsKt.d0(zzrVar.j().k());
                        boolean z4 = false;
                        int index = zyrVar != null ? zyrVar.getIndex() : 0;
                        int i6 = zzrVar.j().i();
                        if (((Boolean) ytwVarC.getValue()).booleanValue() && !((Boolean) ytwVarC2.getValue()).booleanValue() && index >= i6 - 3) {
                            z4 = true;
                        }
                        return Boolean.valueOf(z4);
                    }
                });
                bVarI.r(objY);
            }
            twd0 twd0Var = (twd0) objY;
            Boolean bool = (Boolean) twd0Var.getValue();
            bool.getClass();
            boolean z4 = (i5 & 896) == 256;
            Object objY2 = bVarI.y();
            if (z4 || objY2 == c0042a) {
                objY2 = new aav(function0, twd0Var, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, bool, (Function2) objY2);
            d dVarE = j.e(d.a.b, 1.0f);
            umz umzVarA = h.a(2, 16.0f, 0.0f);
            boolean z5 = ((i5 & 458752) == 131072) | ((i4 & 14) == 4) | ((234881024 & i4) == 67108864) | ((1879048192 & i4) == 536870912) | ((i5 & 14) == 4) | ((i5 & 112) == 32) | ((i4 & 112) == 32) | ((i4 & 57344) == 16384) | ((i4 & 3670016) == 1048576) | ((i4 & 458752) == 131072) | ((i5 & 57344) == 16384) | ((i5 & 7168) == 2048) | ((i5 & 3670016) == 1048576) | ((29360128 & i4) == 8388608 || bVarI.A(uf00Var)) | ((i4 & 896) == 256);
            Object objY3 = bVarI.y();
            if (z5 || objY3 == c0042a) {
                final Function1 function8 = function7;
                Function1 function9 = new Function1() { // from class: k9v
                    /* JADX WARN: Code duplicated, block: B:30:0x00d3  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        final prg prgVar2;
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        final o7v o7vVar2 = o7vVar;
                        final uf00 uf00Var3 = uf00Var2;
                        final r680 r680Var2 = r680Var;
                        final Function1 function10 = function1;
                        final Function1 function11 = function2;
                        szr.h(szrVar, null, new op8(-455915486, new gaj() { // from class: o9v
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                a aVar2 = (a) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((gwr) obj2).getClass();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    s8v.b(o7vVar2, uf00Var3, r680Var2, function10, function11, aVar2, 0);
                                    ty0.a(aVar2, j.i(d.a.b, ((cjb0) aVar2.O(ejb0.a)).e));
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, true), 3);
                        if (z) {
                            gav.c(szrVar);
                        } else {
                            o7v o7vVar3 = o7v.LIVE;
                            final Function1 function12 = function8;
                            final Function2 function13 = function6;
                            if (o7vVar2 != o7vVar3 || (prgVar2 = prgVar) == null) {
                                int i6 = 0;
                                if (o7vVar2 != o7vVar3) {
                                    uf00<fpg> uf00Var4 = uf00Var;
                                    if (uf00Var4.isEmpty()) {
                                        szr.h(szrVar, null, new op8(-2101485534, new t9v(o7vVar2, i6), true), 3);
                                    } else {
                                        for (final fpg fpgVar : uf00Var4) {
                                            szr.h(szrVar, null, new op8(1797937503, new gaj() { // from class: v9v
                                                @Override // defpackage.gaj
                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    a aVar2 = (a) obj3;
                                                    int iIntValue = ((Integer) obj4).intValue();
                                                    ((gwr) obj2).getClass();
                                                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                        dng.b(fpgVar.a, o7vVar2 == o7v.RESULTED ? "FT" : null, aVar2, 0, 0);
                                                    } else {
                                                        aVar2.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, true), 3);
                                            ArrayList arrayList = fpgVar.b;
                                            int i7 = 0;
                                            final int i8 = 0;
                                            for (int size = arrayList.size(); i7 < size; size = size) {
                                                Object obj2 = arrayList.get(i7);
                                                int i9 = i7 + 1;
                                                int i10 = i8 + 1;
                                                if (i8 < 0) {
                                                    b.q();
                                                    throw null;
                                                }
                                                final prg prgVar3 = (prg) obj2;
                                                final Function1 function14 = function5;
                                                szr.h(szrVar, null, new op8(2108593179, new gaj() { // from class: x9v
                                                    @Override // defpackage.gaj
                                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                                        a aVar2 = (a) obj4;
                                                        int iIntValue = ((Integer) obj5).intValue();
                                                        ((gwr) obj3).getClass();
                                                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                            boolean z6 = i8 != fpgVar.b.size() - 1;
                                                            final Function1 function15 = function12;
                                                            boolean zM = aVar2.M(function15);
                                                            boolean z7 = z6;
                                                            final prg prgVar4 = prgVar3;
                                                            boolean zM2 = zM | aVar2.M(prgVar4);
                                                            Object objY4 = aVar2.y();
                                                            a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                                            if (zM2 || objY4 == c0042a2) {
                                                                objY4 = new Function0() { // from class: y9v
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        function15.invoke(prgVar4);
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar2.r(objY4);
                                                            }
                                                            Function0 function16 = (Function0) objY4;
                                                            Function1 function17 = function14;
                                                            boolean zM3 = aVar2.M(function17) | aVar2.M(prgVar4);
                                                            Object objY5 = aVar2.y();
                                                            if (zM3 || objY5 == c0042a2) {
                                                                objY5 = new r6c(1, function17, prgVar4);
                                                                aVar2.r(objY5);
                                                            }
                                                            dng.c(prgVar4, z7, null, function16, (Function0) objY5, null, function13, aVar2, 0, 36);
                                                        } else {
                                                            aVar2.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, true), 3);
                                                i7 = i9;
                                                i8 = i10;
                                            }
                                        }
                                        if (z2) {
                                            szr.h(szrVar, null, oe9.a, 3);
                                        }
                                    }
                                } else {
                                    szr.h(szrVar, null, new op8(-2101485534, new t9v(o7vVar2, i6), true), 3);
                                }
                            } else {
                                final h8f0 h8f0Var2 = h8f0Var;
                                final mjs mjsVar2 = mjsVar;
                                final Function1 function15 = function3;
                                szr.h(szrVar, null, new op8(-1514023263, new gaj() { // from class: q9v
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a aVar2 = (a) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        ((gwr) obj3).getClass();
                                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            mjs mjsVar3 = h8f0Var2 != null ? mjsVar2 : null;
                                            final Function1 function16 = function12;
                                            boolean zM = aVar2.M(function16);
                                            final prg prgVar4 = prgVar2;
                                            boolean zM2 = zM | aVar2.M(prgVar4);
                                            Object objY4 = aVar2.y();
                                            a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                            if (zM2 || objY4 == c0042a2) {
                                                objY4 = new Function0() { // from class: h9v
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        function16.invoke(prgVar4);
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar2.r(objY4);
                                            }
                                            Function0 function17 = (Function0) objY4;
                                            final Function1 function18 = function15;
                                            boolean zM3 = aVar2.M(function18);
                                            Object objY5 = aVar2.y();
                                            if (zM3 || objY5 == c0042a2) {
                                                objY5 = new y6c(function18, 1);
                                                aVar2.r(objY5);
                                            }
                                            Function0 function19 = (Function0) objY5;
                                            boolean zM4 = aVar2.M(function18);
                                            Object objY6 = aVar2.y();
                                            if (zM4 || objY6 == c0042a2) {
                                                objY6 = new Function0() { // from class: i9v
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        function18.invoke(mjs.a);
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar2.r(objY6);
                                            }
                                            dng.c(prgVar4, false, mjsVar3, function17, function19, (Function0) objY6, function13, aVar2, 48, 0);
                                        } else {
                                            aVar2.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true), 3);
                                if (h8f0Var2 != null) {
                                    szr.h(szrVar, null, new op8(1413388070, new gaj() { // from class: r9v
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            a aVar2 = (a) obj4;
                                            int iIntValue = ((Integer) obj5).intValue();
                                            ((gwr) obj3).getClass();
                                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                z9v.a(h8f0Var2, aVar2, 0);
                                            } else {
                                                aVar2.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true), 3);
                                }
                            }
                        }
                        return Unit.a;
                    }
                };
                bVar = bVarI;
                bVar.r(function9);
                objY3 = function9;
            } else {
                bVar = bVarI;
            }
            aur.a(dVarE, zzrVarA, umzVarA, false, null, null, null, false, null, (Function1) objY3, bVar, 390, 504);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, z2, z3, prgVar, mjsVar, h8f0Var, uf00Var, uf00Var2, r680Var, function1, function2, function0, function3, function4, function5, function6, i, i2) { // from class: m9v
                public final /* synthetic */ Function1 A;
                public final /* synthetic */ Function0 B;
                public final /* synthetic */ Function1 C;
                public final /* synthetic */ Function1 D;
                public final /* synthetic */ Function1 E;
                public final /* synthetic */ Function2 F;
                public final /* synthetic */ int G;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ prg e;
                public final /* synthetic */ mjs f;
                public final /* synthetic */ h8f0 i;
                public final /* synthetic */ uf00 v;
                public final /* synthetic */ uf00 w;
                public final /* synthetic */ r680 y;
                public final /* synthetic */ Function1 z;

                {
                    this.G = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(16777217);
                    int iA2 = qj40.a(this.G);
                    z9v.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final o7v o7vVar, androidx.compose.runtime.a aVar, final int i) {
        Pair pair;
        androidx.compose.runtime.b bVarI = aVar.i(-1695980486);
        int i2 = i | (bVarI.d(o7vVar.ordinal()) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            int iOrdinal = o7vVar.ordinal();
            if (iOrdinal == 0) {
                pair = new Pair(Integer.valueOf(R.string.dedicated_team_pages__no_live_match_title), Integer.valueOf(R.string.dedicated_team_pages__no_live_match_subtitle));
            } else if (iOrdinal == 1) {
                pair = new Pair(Integer.valueOf(R.string.dedicated_team_pages__no_fixtures_title), Integer.valueOf(R.string.dedicated_team_pages__no_fixtures_subtitle));
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return;
                }
                pair = new Pair(Integer.valueOf(R.string.dedicated_team_pages__no_recent_results_title), Integer.valueOf(R.string.dedicated_team_pages__no_recent_results_subtitle));
            }
            int iIntValue = ((Number) pair.a).intValue();
            int iIntValue2 = ((Number) pair.b).intValue();
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            qyd0 qyd0Var = ejb0.a;
            d dVarH = h.h(dVarG, 0.0f, ((cjb0) bVarI.O(qyd0Var)).g, 1);
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
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
            h9n.a(erz.a(R.drawable.no_events_available, 0, bVarI), null, j.r(aVar2, 180.0f), null, null, 0.0f, null, bVarI, 432, 120);
            ty0.a(bVarI, j.i(aVar2, ((cjb0) bVarI.O(qyd0Var)).e));
            String strA = cb40.a(iIntValue, new Object[0], bVarI);
            qyd0 qyd0Var2 = kjb0.a;
            imf0 imf0Var = ((ijb0) bVarI.O(qyd0Var2)).i;
            qyd0 qyd0Var3 = oib0.a;
            lkf0.d(strA, null, ((lib0) bVarI.O(qyd0Var3)).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 130042);
            ty0.a(bVarI, j.i(aVar2, ((cjb0) bVarI.O(qyd0Var)).d));
            lkf0.d(cb40.a(iIntValue2, new Object[0], bVarI), h.h(aVar2, ((cjb0) bVarI.O(qyd0Var)).g, 0.0f, 2), ((lib0) bVarI.O(qyd0Var3)).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).o, bVarI, 0, 0, 130040);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: d9v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    z9v.c(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
