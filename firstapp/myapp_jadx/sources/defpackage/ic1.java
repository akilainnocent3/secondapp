package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.crash.remote.models.DetailResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class ic1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z, final boolean z2, final boolean z3, final ytw ytwVar, final ytw ytwVar2, final ytw ytwVar3, final mz1 mz1Var, final cj5 cj5Var, final t290 t290Var, final fsw fswVar, final ytw ytwVar4, final ytw ytwVar5, final DetailResponse detailResponse, final Function2 function2, final Function1 function1, final String str, final int i, final boolean z4, final boolean z5, a aVar, final int i2) {
        b bVar;
        boolean z6;
        int i3;
        ytwVar2.getClass();
        mz1Var.getClass();
        cj5Var.getClass();
        t290Var.getClass();
        fswVar.getClass();
        ytwVar4.getClass();
        ytwVar5.getClass();
        function2.getClass();
        function1.getClass();
        str.getClass();
        b bVarI = aVar.i(-2115734068);
        int i4 = i2 | (bVarI.b(z) ? 4 : 2) | (bVarI.b(z2) ? 32 : 16) | (bVarI.b(z3) ? 256 : 128) | (bVarI.M(ytwVar) ? 2048 : 1024) | (bVarI.M(ytwVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(ytwVar3) ? 131072 : 65536) | (bVarI.A(mz1Var) ? 1048576 : 524288) | (bVarI.A(cj5Var) ? 8388608 : 4194304) | (bVarI.A(t290Var) ? 67108864 : 33554432) | (bVarI.M(fswVar) ? 536870912 : 268435456);
        int i5 = (bVarI.M(ytwVar4) ? 4 : 2) | (bVarI.M(ytwVar5) ? 32 : 16) | (bVarI.A(detailResponse) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(str) ? 131072 : 65536) | (bVarI.d(i) ? 1048576 : 524288) | (bVarI.b(z4) ? 8388608 : 4194304) | (bVarI.b(z5) ? 67108864 : 33554432);
        if (bVarI.q(i4 & 1, ((i4 & 306783379) == 306783378 && (38347923 & i5) == 38347922) ? false : true)) {
            op5 op5Var = op5.a;
            final String strC = op5.c(op5Var, pwo.e(R.string.modify_auto_cash_out_message_cms, bVarI), pwo.e(R.string.turn_off, bVarI));
            final String strC2 = op5.c(op5Var, pwo.e(R.string.turn_on_off_auto_cashout_cms, bVarI), pwo.e(R.string.auto_cashout_on_off, bVarI));
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
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
            imf0 imf0VarF = ni60.f(((eah0) bVarI.O(gah0.a)).h);
            if (z4) {
                z6 = true;
                imf0VarF = imf0.b(imf0VarF, 0L, 0L, null, new n9i(1), null, 0L, null, null, null, 0, 0L, null, null, 16777207);
            } else {
                z6 = true;
            }
            wf1.b(op5.c(op5Var, pwo.e(R.string.auto_cashout_cms, bVarI), "Auto Cashout"), s3w.a(aVar2, "autocashout_text"), imf0VarF, 0, 0L, null, 0, null, z5 ? r58.d(4294967295L) : mz1Var.H0(), bVarI, 0);
            ty0.a(bVarI, j.i(aVar2, 4.0f));
            boolean zBooleanValue = ((Boolean) ytwVar2.getValue()).booleanValue();
            boolean z7 = (((Boolean) ytwVar3.getValue()).booleanValue() || z || z2 || z3) ? z6 : false;
            float f = ((g7f) ytwVar.getValue()).a;
            d dVarA = s3w.a(aVar2, "autocashout_toggle");
            boolean zM = ((458752 & i5) == 131072 ? z6 : false) | ((i4 & 458752) == 131072 ? z6 : false) | ((i4 & 14) == 4 ? z6 : false) | ((i5 & 7168) == 2048 ? z6 : false) | bVarI.M(strC) | bVarI.A(mz1Var) | ((i4 & 112) == 32 ? z6 : false) | bVarI.M(strC2) | ((i4 & 57344) == 16384 ? z6 : false) | bVarI.A(detailResponse) | ((i4 & 1879048192) == 536870912 ? z6 : false) | ((i5 & 14) == 4 ? z6 : false) | ((i5 & 112) == 32 ? z6 : false) | ((i5 & 57344) == 16384 ? z6 : false) | ((3670016 & i5) == 1048576 ? z6 : false);
            Object objY = bVarI.y();
            if (zM || objY == a.C0041a.a) {
                i3 = i5;
                Function1 function3 = new Function1() { // from class: gc1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Boolean bool = (Boolean) obj;
                        boolean zBooleanValue2 = bool.booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ytwVar3.getValue()).booleanValue();
                        boolean z8 = z;
                        Function2 function4 = function2;
                        mz1 mz1Var2 = mz1Var;
                        if (zBooleanValue3 && z8) {
                            function4.invoke(strC, new j58(mz1Var2.L0()));
                        } else if (z8 || z2) {
                            function4.invoke(strC2, new j58(mz1Var2.L0()));
                        } else {
                            ytw ytwVar6 = ytwVar2;
                            ytwVar6.setValue(bool);
                            lla.a(detailResponse, fswVar, ytwVar4, ytwVar5, true);
                            function1.invoke(ytwVar6.getValue());
                            if (zBooleanValue2) {
                                wz.a("AutoCashoutOn", str, String.valueOf(i));
                            }
                        }
                        return Unit.a;
                    }
                };
                bVar = bVarI;
                bVar.r(function3);
                objY = function3;
            } else {
                i3 = i5;
                bVar = bVarI;
            }
            xka.a(zBooleanValue, (Function1) objY, t290Var, z7, cj5Var, f, 0.0f, dVarA, null, false, false, z5, false, bVar, ((i4 >> 18) & 896) | ((i4 >> 9) & 57344), (i3 >> 21) & 112, 5952);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, z2, z3, ytwVar, ytwVar2, ytwVar3, mz1Var, cj5Var, t290Var, fswVar, ytwVar4, ytwVar5, detailResponse, function2, function1, str, i, z4, z5, i2) { // from class: hc1
                public final /* synthetic */ ytw A;
                public final /* synthetic */ DetailResponse B;
                public final /* synthetic */ Function2 C;
                public final /* synthetic */ Function1 D;
                public final /* synthetic */ String E;
                public final /* synthetic */ int F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ ytw d;
                public final /* synthetic */ ytw e;
                public final /* synthetic */ ytw f;
                public final /* synthetic */ mz1 i;
                public final /* synthetic */ cj5 v;
                public final /* synthetic */ t290 w;
                public final /* synthetic */ fsw y;
                public final /* synthetic */ ytw z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ic1.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
