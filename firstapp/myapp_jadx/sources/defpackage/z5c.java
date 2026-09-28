package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class z5c {
    public static final void a(final Function1<? super String, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function2, Function0<Unit> function3, final int i, a aVar, final int i2) {
        n54 n54Var;
        a.C0041a.C0042a c0042a;
        final Function0<Unit> function4 = function3;
        function1.getClass();
        function0.getClass();
        function2.getClass();
        function4.getClass();
        b bVarI = aVar.i(-251270603);
        int i3 = i2 | (bVarI.A(function1) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function4) ? 2048 : 1024) | (bVarI.d(i) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            List listK = kotlin.collections.b.k("1", "2", "3", "4", "5", "6");
            List listK2 = kotlin.collections.b.k("7", "8", "9", "0", ".", CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
            int i4 = ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
            qyd0 qyd0Var = kna.h;
            ((mmd) bVarI.O(qyd0Var)).getDensity();
            ((mmd) bVarI.O(qyd0Var)).C1(96.0f);
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            n54 n54Var2 = ht.a.h;
            aiv aivVarC = g75.c(n54Var2, false);
            int iHashCode = Long.hashCode(bVarI.m());
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            List list = listK2;
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
            mmd mmdVar = (mmd) bVarI.O(qyd0Var);
            bVarI.N(-798571969);
            float fU1 = mmdVar.u1((int) ((mmd) bVarI.O(qyd0Var)).C1(96.0f));
            bVarI.X(false);
            d dVarI = j.i(aVar2, fU1);
            long j = j58.i;
            zk40.a aVar4 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(dVarI, j, aVar4);
            aiv aivVarC2 = g75.c(n54Var2, false);
            int iHashCode2 = Long.hashCode(bVarI.m());
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarB);
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
            d dVarB2 = androidx.compose.foundation.a.b(aVar2, j, aVar4);
            kw0.b bVar2 = kw0.d;
            n54.a aVar5 = ht.a.m;
            i78 i78VarA = g78.a(bVar2, aVar5, bVarI, 6);
            int iHashCode3 = Long.hashCode(bVarI.m());
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarB2);
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
            d dVarB3 = androidx.compose.foundation.a.b(zqu.a(2.0f, j.g(aVar2, 1.0f), true), j, aVar4);
            n54.b bVar3 = ht.a.l;
            kw0.j jVar = kw0.a;
            d160 d160VarA = b160.a(jVar, bVar3, bVarI, 48);
            int iHashCode4 = Long.hashCode(bVarI.m());
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarB3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            f160 f160Var = f160.a;
            d dVarG = j.g(f160Var.a(8.0f, aVar2, true), 1.0f);
            i78 i78VarA2 = g78.a(kw0.c, aVar5, bVarI, 0);
            int iHashCode5 = Long.hashCode(bVarI.m());
            ne00 ne00VarS5 = bVarI.S();
            d dVarC5 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS5, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
            }
            hlh0.a(bVarI, dVarC5, cVar);
            d dVarI2 = j.i(androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), j58.g, aVar4), 48.0f);
            n54.b bVar4 = ht.a.j;
            d160 d160VarA2 = b160.a(jVar, bVar4, bVarI, 0);
            int iHashCode6 = Long.hashCode(bVarI.m());
            ne00 ne00VarS6 = bVarI.S();
            d dVarC6 = c.c(bVarI, dVarI2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS6, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
            }
            Iterator itA = yt1.a(bVarI, dVarC6, cVar, 1614983245, listK);
            while (true) {
                boolean zHasNext = itA.hasNext();
                n54Var = ht.a.e;
                c0042a = a.C0041a.a;
                if (!zHasNext) {
                    break;
                }
                final String str = (String) itA.next();
                d dVarB4 = androidx.compose.foundation.a.b(j.c(f160Var.a(1.0f, aVar2, true), 1.0f), r58.d(4284572001L), aVar4);
                Object objY = bVarI.y();
                if (objY == c0042a) {
                    objY = rzk.a(bVarI);
                }
                psw pswVar = (psw) objY;
                boolean zM = ((i3 & 14) == 4) | bVarI.M(str);
                Object objY2 = bVarI.y();
                if (zM || objY2 == c0042a) {
                    objY2 = new Function0() { // from class: s5c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(str);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                d dVarB5 = androidx.compose.foundation.d.b(dVarB4, pswVar, null, false, null, (Function0) objY2, 28);
                aiv aivVarC3 = g75.c(n54Var, false);
                int iHashCode7 = Long.hashCode(bVarI.m());
                ne00 ne00VarS7 = bVarI.S();
                d dVarC7 = c.c(bVarI, dVarB5);
                yka.k.getClass();
                tsr.a aVar6 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC3, yka.a.f);
                hlh0.a(bVarI, ne00VarS7, yka.a.e);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode7))) {
                    n30.a(iHashCode7, bVarI, iHashCode7, c1350a2);
                }
                hlh0.a(bVarI, dVarC7, yka.a.d);
                b bVar5 = bVarI;
                lkf0.b(str, null, j58.f, 0L, null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar5, 196992, 0, 131034);
                bVarI = bVar5;
                bVarI.X(true);
                b(0, bVarI);
                itA = itA;
                aVar2 = aVar2;
                list = list;
                aVar4 = aVar4;
                bVar4 = bVar4;
                jVar = jVar;
            }
            kw0.j jVar2 = jVar;
            d.a aVar7 = aVar2;
            n54.b bVar6 = bVar4;
            List list2 = list;
            char c = 0;
            bVarI.X(false);
            d dVarB6 = androidx.compose.foundation.a.b(j.c(f160Var.a(1.5f, aVar7, true), 1.0f), r58.d(4284572001L), aVar4);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = rzk.a(bVarI);
            }
            psw pswVar2 = (psw) objY3;
            boolean z = (i3 & 896) == 256;
            Object objY4 = bVarI.y();
            if (z || objY4 == c0042a) {
                objY4 = new t5c(0, function2);
                bVarI.r(objY4);
            }
            d dVarB7 = androidx.compose.foundation.d.b(dVarB6, pswVar2, null, false, null, (Function0) objY4, 28);
            aiv aivVarC4 = g75.c(n54Var, false);
            int iHashCode8 = Long.hashCode(bVarI.m());
            ne00 ne00VarS8 = bVarI.S();
            d dVarC8 = c.c(bVarI, dVarB7);
            yka.k.getClass();
            tsr.a aVar8 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar8);
            } else {
                bVarI.p();
            }
            yka.a.b bVar7 = yka.a.f;
            hlh0.a(bVarI, aivVarC4, bVar7);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS8, dVar2);
            yka.a.C1350a c1350a3 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode8))) {
                n30.a(iHashCode8, bVarI, iHashCode8, c1350a3);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC8, cVar2);
            b bVar8 = bVarI;
            n54 n54Var3 = n54Var;
            f160 f160Var2 = f160Var;
            a.C0041a.C0042a c0042a2 = c0042a;
            h6n.b(erz.a(R.drawable.backspace, 0, bVarI), "Backspace", j.r(aVar7, 20.0f), j58.f, bVar8, 3504, 0);
            b bVar9 = bVar8;
            bVar9.X(true);
            bVar9.X(true);
            ute.a(null, 0.5f, r58.d(4288585374L), bVar9, 432, 1);
            d dVarI3 = j.i(androidx.compose.foundation.a.b(j.g(aVar7, 1.0f), j58.g, aVar4), 48.0f);
            d160 d160VarA3 = b160.a(jVar2, bVar6, bVar9, 0);
            int iHashCode9 = Long.hashCode(bVar9.m());
            ne00 ne00VarS9 = bVar9.S();
            d dVarC9 = c.c(bVar9, dVarI3);
            bVar9.D();
            if (bVar9.S) {
                bVar9.F(aVar8);
            } else {
                bVar9.p();
            }
            hlh0.a(bVar9, d160VarA3, bVar7);
            hlh0.a(bVar9, ne00VarS9, dVar2);
            if (bVar9.S || !Intrinsics.g(bVar9.y(), Integer.valueOf(iHashCode9))) {
                n30.a(iHashCode9, bVar9, iHashCode9, c1350a3);
            }
            Iterator itA2 = yt1.a(bVar9, dVarC9, cVar2, -1268263717, list2);
            while (itA2.hasNext()) {
                final String str2 = (String) itA2.next();
                f160 f160Var3 = f160Var2;
                d dVarB8 = androidx.compose.foundation.a.b(j.c(f160Var3.a(1.0f, aVar7, true), 1.0f), r58.d(4284572001L), aVar4);
                Object objY5 = bVar9.y();
                a.C0041a.C0042a c0042a3 = c0042a2;
                if (objY5 == c0042a3) {
                    objY5 = rzk.a(bVar9);
                }
                psw pswVar3 = (psw) objY5;
                boolean zM2 = bVar9.M(str2) | ((i3 & 14) == 4);
                Object objY6 = bVar9.y();
                if (zM2 || objY6 == c0042a3) {
                    objY6 = new Function0() { // from class: u5c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(str2);
                            return Unit.a;
                        }
                    };
                    bVar9.r(objY6);
                }
                d dVarB9 = androidx.compose.foundation.d.b(dVarB8, pswVar3, null, false, null, (Function0) objY6, 28);
                n54 n54Var4 = n54Var3;
                aiv aivVarC5 = g75.c(n54Var4, false);
                int iHashCode10 = Long.hashCode(bVar9.m());
                ne00 ne00VarS10 = bVar9.S();
                d dVarC10 = c.c(bVar9, dVarB9);
                yka.k.getClass();
                tsr.a aVar9 = yka.a.b;
                bVar9.D();
                if (bVar9.S) {
                    bVar9.F(aVar9);
                } else {
                    bVar9.p();
                }
                hlh0.a(bVar9, aivVarC5, yka.a.f);
                hlh0.a(bVar9, ne00VarS10, yka.a.e);
                yka.a.C1350a c1350a4 = yka.a.g;
                if (bVar9.S || !Intrinsics.g(bVar9.y(), Integer.valueOf(iHashCode10))) {
                    n30.a(iHashCode10, bVar9, iHashCode10, c1350a4);
                }
                hlh0.a(bVar9, dVarC10, yka.a.d);
                b bVar10 = bVar9;
                lkf0.b(str2, null, j58.f, 0L, null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar10, 196992, 0, 131034);
                bVar9 = bVar10;
                bVar9.X(true);
                b(0, bVar9);
                itA2 = itA2;
                n54Var3 = n54Var4;
                f160Var2 = f160Var3;
                aVar4 = aVar4;
                c0042a2 = c0042a3;
                c = 0;
            }
            n54 n54Var5 = n54Var3;
            zk40.a aVar10 = aVar4;
            a.C0041a.C0042a c0042a4 = c0042a2;
            f160 f160Var4 = f160Var2;
            bVar9.X(false);
            d dVarB10 = androidx.compose.foundation.a.b(j.c(f160Var4.a(1.5f, aVar7, true), 1.0f), r58.d(4284572001L), aVar10);
            Object objY7 = bVar9.y();
            if (objY7 == c0042a4) {
                objY7 = rzk.a(bVar9);
            }
            psw pswVar4 = (psw) objY7;
            boolean z2 = (i3 & 112) == 32;
            Object objY8 = bVar9.y();
            if (z2 || objY8 == c0042a4) {
                objY8 = new Function0() { // from class: v5c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVar9.r(objY8);
            }
            d dVarB11 = androidx.compose.foundation.d.b(dVarB10, pswVar4, null, false, null, (Function0) objY8, 28);
            aiv aivVarC6 = g75.c(n54Var5, false);
            int iHashCode11 = Long.hashCode(bVar9.m());
            ne00 ne00VarS11 = bVar9.S();
            d dVarC11 = c.c(bVar9, dVarB11);
            yka.k.getClass();
            tsr.a aVar11 = yka.a.b;
            bVar9.D();
            if (bVar9.S) {
                bVar9.F(aVar11);
            } else {
                bVar9.p();
            }
            yka.a.b bVar11 = yka.a.f;
            hlh0.a(bVar9, aivVarC6, bVar11);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVar9, ne00VarS11, dVar3);
            yka.a.C1350a c1350a5 = yka.a.g;
            if (bVar9.S || !Intrinsics.g(bVar9.y(), Integer.valueOf(iHashCode11))) {
                n30.a(iHashCode11, bVar9, iHashCode11, c1350a5);
            }
            yka.a.c cVar3 = yka.a.d;
            hlh0.a(bVar9, dVarC11, cVar3);
            op5 op5Var = op5.a;
            String strC = op5.c(op5Var, pwo.e(R.string.clear_text_cms, bVar9), "Clear");
            long j2 = j58.f;
            b bVar12 = bVar9;
            lkf0.b(strC, null, j2, 0L, null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar12, 196992, 0, 131034);
            f30.a(bVar12, true, true, true);
            d dVarB12 = androidx.compose.foundation.a.b(j.i(f160Var4.a(2.0f, aVar7, true), 96.0f), c68.a(R.color.sh_keyBoard_done_btn_color, bVar12), aVar10);
            Object objY9 = bVar12.y();
            if (objY9 == c0042a4) {
                objY9 = rzk.a(bVar12);
            }
            psw pswVar5 = (psw) objY9;
            boolean z3 = (i3 & 7168) == 2048;
            Object objY10 = bVar12.y();
            if (z3 || objY10 == c0042a4) {
                function4 = function3;
                objY10 = new Function0() { // from class: w5c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function4.invoke();
                        return Unit.a;
                    }
                };
                bVar12.r(objY10);
            } else {
                function4 = function3;
            }
            d dVarB13 = androidx.compose.foundation.d.b(dVarB12, pswVar5, null, false, null, (Function0) objY10, 28);
            aiv aivVarC7 = g75.c(n54Var5, false);
            int iHashCode12 = Long.hashCode(bVar12.m());
            ne00 ne00VarS12 = bVar12.S();
            d dVarC12 = c.c(bVar12, dVarB13);
            bVar12.D();
            if (bVar12.S) {
                bVar12.F(aVar11);
            } else {
                bVar12.p();
            }
            hlh0.a(bVar12, aivVarC7, bVar11);
            hlh0.a(bVar12, ne00VarS12, dVar3);
            if (bVar12.S || !Intrinsics.g(bVar12.y(), Integer.valueOf(iHashCode12))) {
                n30.a(iHashCode12, bVar12, iHashCode12, c1350a5);
            }
            hlh0.a(bVar12, dVarC12, cVar3);
            wf1.a(op5.c(op5Var, pwo.e(R.string.done_text_cms, bVar12), pwo.e(R.string.done_txt, bVar12)), null, imf0.b(((eah0) bVar12.O(gah0.a)).b, ((th60) bVar12.O(vh60.a)).Y, d2l.f(16), null, null, null, 0L, null, null, null, 0, d2l.f(16), null, null, 16646140), 0, d2l.f(10), null, 0, null, j2, bVar12, 100687872, 234);
            bVarI = bVar12;
            mx4.a(bVarI, true, true, true, true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function2, function4, i, i2) { // from class: x5c
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ int e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    z5c.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(int i, a aVar) {
        b bVarI = aVar.i(1567296704);
        if (bVarI.q(i & 1, i != 0)) {
            ute.a(j.c(j.w(d.a.b, 0.5f), 1.0f), 0.0f, r58.d(4288585374L), bVarI, 390, 2);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new y5c();
        }
    }
}
