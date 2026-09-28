package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.google.protobuf.DescriptorProtos;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class nia {

    @c0d(c = "com.sportygames.crash.components.ComposeRainBadgeKt$RainBadgeAnimated$1$1", f = "ComposeRainBadge.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 40}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wd0<Float, ij0> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wd0<Float, ij0> wd0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0031 A[PHI: r11
          0x0031: PHI (r11v1 'this' nia$a) = (r11v3 'this' nia$a), (r11v0 'this' nia$a A[IMMUTABLE_TYPE, THIS]) binds: [B:12:0x002e, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        
            if (defpackage.wd0.a(r11.b, r5, r6, null, null, r9, 12) == r0) goto L16;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004e -> B:17:0x0051). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r11.a
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1c
                if (r1 == r2) goto L18
                if (r1 != r3) goto L11
                defpackage.uj50.b(r12)
                r9 = r11
                goto L51
            L11:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r11)
                r11 = 0
                return r11
            L18:
                defpackage.uj50.b(r12)
                goto L31
            L1c:
                defpackage.uj50.b(r12)
            L1f:
                java.lang.Float r12 = new java.lang.Float
                r1 = -1090519040(0xffffffffbf000000, float:-0.5)
                r12.<init>(r1)
                r11.a = r2
                wd0<java.lang.Float, ij0> r1 = r11.b
                java.lang.Object r12 = r1.f(r11, r12)
                if (r12 != r0) goto L31
                goto L50
            L31:
                java.lang.Float r5 = new java.lang.Float
                r12 = 1069547520(0x3fc00000, float:1.5)
                r5.<init>(r12)
                r12 = 0
                wkf r1 = defpackage.xkf.d
                r4 = 2000(0x7d0, float:2.803E-42)
                gzg0 r6 = defpackage.yi0.e(r4, r12, r1, r3)
                r11.a = r3
                wd0<java.lang.Float, ij0> r4 = r11.b
                r7 = 0
                r8 = 0
                r10 = 12
                r9 = r11
                java.lang.Object r11 = defpackage.wd0.a(r4, r5, r6, r7, r8, r9, r10)
                if (r11 != r0) goto L51
            L50:
                return r0
            L51:
                r11 = r9
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: nia.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        b bVar;
        boolean z;
        b bVarI = aVar.i(-1112960651);
        if (bVarI.q(i & 1, i != 0)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = ee0.a(-0.5f);
                bVarI.r(objY);
            }
            wd0 wd0Var = (wd0) objY;
            Unit unit = Unit.a;
            boolean zA = bVarI.A(wd0Var);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new a(wd0Var, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, unit, (Function2) objY2);
            d.a aVar2 = d.a.b;
            d dVarA = ls7.a(g.d(aVar2, 0.0f, -3.0f, 1), j060.c(20.0f));
            List listK = kotlin.collections.b.k(new j58(r58.d(4292125751L)), new j58(r58.d(4290283019L)));
            float f = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            d dVarG = h.g(androidx.compose.foundation.a.a(dVarA, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), null, 0.0f, 6), 10.0f, 2.0f);
            n54 n54Var = ht.a.e;
            aiv aivVarC = g75.c(n54Var, false);
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
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarA2 = f.a(j.w(aVar2, 32.0f), pzo.a);
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
            hlh0.a(bVarI, aivVarC2, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            long j = j58.f;
            imf0 imf0VarB = ni60.b(((sfd0) bVarI.O(ni60.b)).e);
            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
            lkf0.b("RAIN", dVar2.b(aVar2, n54Var), j, 0L, new n9i(1), null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarB, bVarI, 390, 0, 65512);
            bVar = bVarI;
            d dVarC3 = androidx.compose.ui.graphics.a.c(dVar2.f(aVar2), 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0L, null, 524283);
            boolean zA2 = bVar.A(wd0Var);
            Object objY3 = bVar.y();
            if (zA2 || objY3 == c0042a) {
                z = true;
                objY3 = new md6(wd0Var, 1 == true ? 1 : 0);
                bVar.r(objY3);
            } else {
                z = true;
            }
            rxo.b(dVarC3, (Function1) objY3, bVar, 0);
            bVar.X(z);
            bVar.X(z);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new mia();
        }
    }
}
