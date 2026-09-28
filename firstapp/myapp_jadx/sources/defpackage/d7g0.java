package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportygames.campaign.data.model.TournamentJoinConfirmationData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class d7g0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final String str2, final long j, final boolean z, final String str3, final String str4, final String str5, final String str6, final ArrayList arrayList, final List list, final Function0 function0, final Function1 function1, Function1 function2, final String str7, final String str8, final String str9, final String str10, final String str11, b5 b5Var, Double d, long j2, Function0 function3, Function0 function4, final Function0 function5, final Function0 function6, final aig0 aig0Var, final boolean z2, a aVar, final int i, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        final Function1 function7;
        final b5 b5Var2;
        final Double d2;
        final long j3;
        final Function0 function8;
        b bVar;
        final Function0 function9;
        Double dValueOf;
        Function0 function10;
        int i7;
        Function0 function11;
        long j4;
        Object objB;
        final Function0 function12;
        str4.getClass();
        str6.getClass();
        list.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(-2032269380);
        int i8 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.e(j) ? 256 : 128) | (bVarI.M(str3) ? 16384 : 8192) | (bVarI.M(str4) ? 131072 : 65536) | (bVarI.M(str5) ? 1048576 : 524288) | (bVarI.M(str6) ? 8388608 : 4194304) | (bVarI.A(arrayList) ? 67108864 : 33554432) | (bVarI.A(list) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i5 = i2 | (bVarI.A(function0) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= bVarI.A(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= bVarI.M(str7) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= bVarI.M(str8) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= bVarI.M(str9) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= bVarI.M(str10) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= bVarI.M(str11) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= 33554432;
        }
        int i9 = i4 & 524288;
        if (i9 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i5 |= bVarI.M(d) ? 536870912 : 268435456;
        }
        int i10 = i4 & 1048576;
        if (i10 != 0) {
            i6 = i3 | 6;
        } else {
            i6 = i3 | (bVarI.e(j2) ? 4 : 2);
        }
        int i11 = i6 | (bVarI.A(function5) ? 2048 : 1024) | (bVarI.A(function6) ? 16384 : 8192) | (bVarI.A(aig0Var) ? 131072 : 65536) | (bVarI.b(z2) ? 1048576 : 524288);
        if (bVarI.q(i8 & 1, ((i8 & 306783379) == 306783378 && (i5 & 306783379) == 306783378 && (i11 & 599043) == 599042) ? false : true)) {
            bVarI.A0();
            int i12 = i & 1;
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (i12 == 0 || bVarI.h0()) {
                qn70 qn70VarA = c7g0.a(-1168520582, -1633490746, bVarI, bVarI);
                boolean zM = bVarI.M(null) | bVarI.M(qn70VarA);
                Object objY = bVarI.y();
                if (zM || objY == c0042a) {
                    objY = qn70VarA.a(jq40.a(b5.class), null, null);
                    bVarI.r(objY);
                }
                bVarI.X(false);
                bVarI.X(false);
                b5 b5Var3 = (b5) objY;
                int i13 = i5 & (-234881025);
                dValueOf = i9 != 0 ? Double.valueOf(0.0d) : d;
                long j5 = i10 != 0 ? j58.l : j2;
                b5Var = b5Var3;
                Object objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new y6g0();
                    bVarI.r(objY2);
                }
                Function0 function13 = (Function0) objY2;
                Object objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new z2c(1);
                    bVarI.r(objY3);
                }
                function10 = function13;
                i7 = i13;
                function11 = (Function0) objY3;
                j4 = j5;
            } else {
                bVarI.G();
                dValueOf = d;
                j4 = j2;
                function10 = function3;
                function11 = function4;
                i7 = i5 & (-234881025);
            }
            b5 b5Var4 = b5Var;
            bVarI.Y();
            Pair pairA = z5g0.a(dValueOf, j4, bVarI, ((i7 >> 27) & 14) | ((i11 << 3) & 112));
            String str12 = (String) pairA.a;
            j58 j58Var = (j58) pairA.b;
            long j6 = j4;
            long j7 = j58Var.a;
            ytw ytwVarA = n95.a(aig0Var.w, new com.sportygames.newcms.b(0), null, bVarI, 0, 2);
            boolean zM2 = bVarI.M((com.sportygames.newcms.b) ytwVarA.getValue()) | ((i8 & 3670016) == 1048576);
            Object objY4 = bVarI.y();
            if (zM2 || objY4 == c0042a) {
                com.sportygames.newcms.b bVar2 = (com.sportygames.newcms.b) ytwVarA.getValue();
                bVar2.getClass();
                Long lC = scg0.c(System.currentTimeMillis(), str5);
                objB = (lC == null || lC.longValue() <= 0 || lC.longValue() / 1000 <= 0) ? bVar2.b(v5g0.Z.y, "Now") : scg0.d(str5, bVar2, System.currentTimeMillis());
                bVarI.r(objB);
            } else {
                objB = objY4;
            }
            String str13 = (String) objB;
            ytw<Boolean> ytwVar = wag0.h;
            isw iswVar = wag0.j;
            ytw<Integer> ytwVar2 = wag0.k;
            Double d3 = dValueOf;
            TournamentJoinConfirmationData tournamentJoinConfirmationData = new TournamentJoinConfirmationData(str.concat("!"), str2, z, str3, str4, str13, str6, str7, t69.b(str8), t69.b(str9), str10, str11, phg0.a(arrayList, b5Var4));
            boolean zBooleanValue = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
            float fFloatValue = iswVar.getValue().floatValue();
            int iIntValue = ((Number) ((x5a0) ytwVar2).getValue()).intValue();
            int i14 = i8 & 896;
            boolean z3 = ((i7 & 112) == 32) | (i14 == 256);
            Object objY5 = bVarI.y();
            if (z3 || objY5 == c0042a) {
                objY5 = new Function0() { // from class: z6g0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(Long.valueOf(j));
                        return Unit.a;
                    }
                };
                bVarI.r(objY5);
            }
            Function0 function14 = (Function0) objY5;
            boolean z4 = ((i7 & 896) == 256) | (i14 == 256) | ((i7 & 14) == 4);
            Object objY6 = bVarI.y();
            if (z4 || objY6 == c0042a) {
                function12 = function0;
                function7 = function2;
                objY6 = new Function0() { // from class: a7g0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function7.invoke(Long.valueOf(j));
                        function12.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY6);
            } else {
                function12 = function0;
                function7 = function2;
            }
            int i15 = ((i7 << 3) & 112) | ((i8 >> 9) & 3670016);
            int i16 = i11 << 12;
            k8g0.c(tournamentJoinConfirmationData, function12, function14, (Function0) objY6, str12, j58Var, list, function5, function6, zBooleanValue, fFloatValue, iIntValue, aig0Var, z2, bVarI, i15 | (29360128 & i16) | (i16 & 234881024), (i11 >> 9) & 8064);
            b5Var2 = b5Var4;
            bVar = bVarI;
            function8 = function10;
            function9 = function11;
            j3 = j6;
            d2 = d3;
        } else {
            function7 = function2;
            bVarI.G();
            b5Var2 = b5Var;
            d2 = d;
            j3 = j2;
            function8 = function3;
            bVar = bVarI;
            function9 = function4;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final Function1 function15 = function7;
            eVarZ.d = new Function2(str, str2, j, z, str3, str4, str5, str6, arrayList, list, function0, function1, function15, str7, str8, str9, str10, str11, b5Var2, d2, j3, function8, function9, function5, function6, aig0Var, z2, i, i2, i3, i4) { // from class: b7g0
                public final /* synthetic */ Function1 A;
                public final /* synthetic */ Function1 B;
                public final /* synthetic */ String C;
                public final /* synthetic */ String D;
                public final /* synthetic */ String E;
                public final /* synthetic */ String F;
                public final /* synthetic */ String G;
                public final /* synthetic */ b5 H;
                public final /* synthetic */ Double I;
                public final /* synthetic */ long J;
                public final /* synthetic */ Function0 K;
                public final /* synthetic */ Function0 L;
                public final /* synthetic */ Function0 M;
                public final /* synthetic */ Function0 N;
                public final /* synthetic */ aig0 O;
                public final /* synthetic */ boolean P;
                public final /* synthetic */ int Q;
                public final /* synthetic */ int R;
                public final /* synthetic */ int S;
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ String e;
                public final /* synthetic */ String f;
                public final /* synthetic */ String i;
                public final /* synthetic */ String v;
                public final /* synthetic */ ArrayList w;
                public final /* synthetic */ List y;
                public final /* synthetic */ Function0 z;

                {
                    this.Q = i2;
                    this.R = i3;
                    this.S = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(3073);
                    int iA2 = qj40.a(this.Q);
                    int iA3 = qj40.a(this.R);
                    d7g0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (a) obj, iA, iA2, iA3, this.S);
                    return Unit.a;
                }
            };
        }
    }
}
