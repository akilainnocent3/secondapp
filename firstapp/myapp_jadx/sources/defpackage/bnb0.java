package defpackage;

import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.j;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.r;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class bnb0 {
    public static final void a(final int i, final String str, final long j, final boolean z, final File file, final File file2, final File file3, final File file4, String str2, final String str3, float f, final boolean z2, final boolean z3, a aVar, final int i2) {
        b bVar;
        final String str4;
        final float f2;
        Object anb0Var;
        isw iswVar;
        isw iswVar2;
        int i3;
        isw iswVar3;
        String str5;
        String str6;
        boolean z4;
        str.getClass();
        b bVarI = aVar.i(1500027363);
        int i4 = i2 | (bVarI.d(i) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.e(j) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | (bVarI.A(file) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(file2) ? 131072 : 65536) | (bVarI.A(file3) ? 1048576 : 524288) | (bVarI.A(file4) ? 8388608 : 4194304) | 100663296 | (bVarI.M(str3) ? 536870912 : 268435456);
        int i5 = (bVarI.b(z2) ? 32 : 16) | (bVarI.b(z3) ? 256 : 128);
        if (bVarI.q(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 145) == 144) ? false : true)) {
            boolean z5 = file != null && file2 != null && file.exists() && file2.exists();
            boolean z6 = file3 != null && file4 != null && file3.exists() && file4.exists();
            final float f3 = 5.5f;
            if (!z || !z5 || !z6) {
                e eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2(i, str, j, z, file, file2, file3, file4, str3, f3, z2, z3, i2) { // from class: xmb0
                        public final /* synthetic */ boolean A;
                        public final /* synthetic */ int a;
                        public final /* synthetic */ String b;
                        public final /* synthetic */ long c;
                        public final /* synthetic */ boolean d;
                        public final /* synthetic */ File e;
                        public final /* synthetic */ File f;
                        public final /* synthetic */ File i;
                        public final /* synthetic */ File v;
                        public final /* synthetic */ String w;
                        public final /* synthetic */ float y;
                        public final /* synthetic */ boolean z;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(1);
                            bnb0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, "animation", this.w, this.y, this.z, this.A, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            float density = ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenWidthDp * ((mmd) bVarI.O(kna.h)).getDensity();
            boolean zC = ((i4 & 14) == 4) | bVarI.c(density);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zC || objY == c0042a) {
                objY = vi8.a(i, density);
                bVarI.r(objY);
            }
            fnb0 fnb0Var = (fnb0) objY;
            float f4 = i;
            boolean zEquals = str.equals("ROUND_END_WAIT");
            bVarI.C(-1582670361, Long.valueOf(j));
            boolean z7 = (i4 & 896) == 256;
            Object objY2 = bVarI.y();
            if (z7 || objY2 == c0042a) {
                objY2 = Boolean.valueOf(str.equals("ROUND_ONGOING"));
                bVarI.r(objY2);
            }
            boolean zBooleanValue = ((Boolean) objY2).booleanValue();
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = j.a(zBooleanValue ? fnb0Var.b : f4);
                bVarI.r(objY3);
            }
            isw iswVar4 = (isw) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = j.a(zBooleanValue ? 1.0f : 1.8f);
                bVarI.r(objY4);
            }
            isw iswVar5 = (isw) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = j.a(zBooleanValue ? 1.0f : 0.0f);
                bVarI.r(objY5);
            }
            isw iswVar6 = (isw) objY5;
            boolean zM = ((i4 & 112) == 32) | bVarI.M(fnb0Var) | bVarI.c(f4);
            Object objY6 = bVarI.y();
            if (zM || objY6 == c0042a) {
                iswVar = iswVar6;
                iswVar2 = iswVar4;
                i3 = 2;
                iswVar3 = iswVar5;
                str5 = str;
                anb0Var = new anb0(str5, fnb0Var, f4, iswVar, iswVar2, iswVar3, null);
                bVarI.r(anb0Var);
            } else {
                iswVar3 = iswVar5;
                str5 = str;
                anb0Var = objY6;
                iswVar2 = iswVar4;
                iswVar = iswVar6;
                i3 = 2;
            }
            xvf.e(bVarI, str5, (Function2) anb0Var);
            gzg0 gzg0VarE = yi0.e(700, 0, xkf.b, i3);
            gzg0 gzg0VarE2 = yi0.e(1000, 0, xkf.a, i3);
            final twd0 twd0VarB = xe0.b(iswVar2.j(), zEquals ? gzg0VarE2 : gzg0VarE, "carPosY", null, bVarI, 3072, 20);
            final twd0 twd0VarB2 = xe0.b(iswVar3.j(), zEquals ? gzg0VarE2 : gzg0VarE, "carScale", null, bVarI, 3072, 20);
            final twd0 twd0VarB3 = xe0.b(iswVar.j(), zEquals ? yi0.e(500, 1000, null, 4) : yi0.e(r.d.DEFAULT_SWIPE_ANIMATION_DURATION, 0, null, 6), "carAlpha", null, bVarI, 3072, 20);
            bVar = bVarI;
            if (z3 || (((Number) twd0VarB3.getValue()).floatValue() <= 0.001f && !str5.equals("ROUND_PRE_START"))) {
                str6 = "animation";
                z4 = false;
                bVar.N(-1820687521);
                bVar.X(false);
            } else {
                bVar.N(-1815981752);
                d.a aVar2 = d.a.b;
                d dVarA = abk0.a(androidx.compose.foundation.layout.j.e(aVar2, 1.0f), 6.0f);
                aiv aivVarC = g75.c(ht.a.e, false);
                int iHashCode = Long.hashCode(bVar.T);
                ne00 ne00VarS = bVar.S();
                d dVarC = c.c(bVar, dVarA);
                yka.k.getClass();
                tsr.a aVar3 = yka.a.b;
                bVar.D();
                if (bVar.S) {
                    bVar.F(aVar3);
                } else {
                    bVar.p();
                }
                yka.a.b bVar2 = yka.a.f;
                hlh0.a(bVar, aivVarC, bVar2);
                yka.a.d dVar = yka.a.e;
                hlh0.a(bVar, ne00VarS, dVar);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVar, iHashCode, c1350a);
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVar, dVarC, cVar);
                boolean zM2 = bVar.M(twd0VarB3) | bVar.M(twd0VarB) | bVar.M(twd0VarB2);
                Object objY7 = bVar.y();
                if (zM2 || objY7 == c0042a) {
                    objY7 = new Function1() { // from class: ymb0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            a7l a7lVar = (a7l) obj;
                            a7lVar.getClass();
                            a7lVar.b(((Number) twd0VarB3.getValue()).floatValue());
                            a7lVar.f(((Number) twd0VarB.getValue()).floatValue());
                            twd0 twd0Var = twd0VarB2;
                            a7lVar.k(((Number) twd0Var.getValue()).floatValue());
                            a7lVar.v(((Number) twd0Var.getValue()).floatValue());
                            a7lVar.z0(n09.a(0.5f, 1.0f));
                            return Unit.a;
                        }
                    };
                    bVar.r(objY7);
                }
                d dVarA2 = androidx.compose.ui.graphics.a.a(aVar2, (Function1) objY7);
                aiv aivVarC2 = g75.c(ht.a.a, false);
                int iHashCode2 = Long.hashCode(bVar.T);
                ne00 ne00VarS2 = bVar.S();
                d dVarC2 = c.c(bVar, dVarA2);
                bVar.D();
                if (bVar.S) {
                    bVar.F(aVar3);
                } else {
                    bVar.p();
                }
                hlh0.a(bVar, aivVarC2, bVar2);
                hlh0.a(bVar, ne00VarS2, dVar);
                if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVar, iHashCode2, c1350a);
                }
                hlh0.a(bVar, dVarC2, cVar);
                int i6 = i4 >> 12;
                str6 = "animation";
                z4 = false;
                umb0.c(file, file2, str6, true, str3, null, fnb0Var.c, cnb0.e, z2, null, null, false, false, 0.0f, false, bVar, (i6 & 112) | (i6 & 14) | 12585984 | 384 | ((i4 >> 15) & 57344) | ((i5 << 21) & 234881024), 27648, 7712);
                bVar = bVar;
                f30.a(bVar, true, true, false);
            }
            bVar.X(z4);
            str4 = str6;
            f2 = 5.5f;
        } else {
            bVar = bVarI;
            bVar.G();
            str4 = str2;
            f2 = f;
        }
        e eVarZ2 = bVar.Z();
        if (eVarZ2 != null) {
            eVarZ2.d = new Function2(i, str, j, z, file, file2, file3, file4, str4, str3, f2, z2, z3, i2) { // from class: zmb0
                public final /* synthetic */ boolean A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ int a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ File e;
                public final /* synthetic */ File f;
                public final /* synthetic */ File i;
                public final /* synthetic */ File v;
                public final /* synthetic */ String w;
                public final /* synthetic */ String y;
                public final /* synthetic */ float z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    bnb0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
