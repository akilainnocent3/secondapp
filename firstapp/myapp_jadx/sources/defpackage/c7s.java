package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c7s {
    public static final void a(final String str, final File file, final File file2, String str2, final String str3, final float f, final boolean z, final int i, a aVar, final int i2) {
        final String str4;
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> function2;
        str.getClass();
        b bVarI = aVar.i(1517200335);
        int i3 = i2 | (bVarI.M(str) ? 4 : 2) | (bVarI.A(file) ? 32 : 16) | (bVarI.A(file2) ? 256 : 128) | 3072 | (bVarI.c(f) ? 131072 : 65536) | (bVarI.b(z) ? 1048576 : 524288) | (bVarI.d(i) ? 8388608 : 4194304);
        if (bVarI.q(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean z2 = (file == null || file2 == null || !file.exists() || !file2.exists() || str.equals("ROUND_WAITING")) ? false : true;
            final String str5 = "animation1";
            List listK = kotlin.collections.b.k("animation1", "animation2", "animation3");
            float density = ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenWidthDp * ((mmd) bVarI.O(kna.h)).getDensity();
            boolean zC = ((29360128 & i3) == 8388608) | bVarI.c(density);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zC || objY == c0042a) {
                objY = vi8.a(i, density);
                bVarI.r(objY);
            }
            fnb0 fnb0Var = (fnb0) objY;
            if (z2) {
                d.a aVar2 = d.a.b;
                d dVarA = abk0.a(j.e(aVar2, 1.0f), 6.0f);
                aiv aivVarC = g75.c(ht.a.e, false);
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
                Object objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new a7s();
                    bVarI.r(objY2);
                }
                d dVarA2 = androidx.compose.ui.graphics.a.a(aVar2, (Function1) objY2);
                aiv aivVarC2 = g75.c(ht.a.a, false);
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
                cnb0 cnb0Var = cnb0.e;
                fnb0Var.getClass();
                int i4 = i3 >> 3;
                umb0.c(file, file2, "animation1", true, str3, null, f, cnb0Var, z, listK, null, false, false, 300.0f, true, bVarI, (i4 & 112) | (i4 & 14) | 817892352 | 24960 | (3670016 & (i3 << 3)) | ((i3 << 6) & 234881024), 24576, 7200);
                bVarI.X(true);
                bVarI.X(true);
                str4 = "animation1";
            } else {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2(str, file, file2, str5, str3, f, z, i, i2) { // from class: z6s
                        public final /* synthetic */ String a;
                        public final /* synthetic */ File b;
                        public final /* synthetic */ File c;
                        public final /* synthetic */ String d;
                        public final /* synthetic */ String e;
                        public final /* synthetic */ float f;
                        public final /* synthetic */ boolean i;
                        public final /* synthetic */ int v;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(24577);
                            c7s.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                }
            }
            eVarZ.d = function2;
        }
        bVarI.G();
        str4 = str2;
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            function2 = new Function2(str, file, file2, str4, str3, f, z, i, i2) { // from class: b7s
                public final /* synthetic */ String a;
                public final /* synthetic */ File b;
                public final /* synthetic */ File c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ float f;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ int v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(24577);
                    c7s.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }
}
