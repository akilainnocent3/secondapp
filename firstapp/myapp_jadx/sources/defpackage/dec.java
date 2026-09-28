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
public final class dec {
    /* JADX WARN: Code duplicated, block: B:131:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:134:0x042c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0430  */
    /* JADX WARN: Code duplicated, block: B:140:0x0451  */
    /* JADX WARN: Code duplicated, block: B:156:0x050e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0546  */
    /* JADX WARN: Code duplicated, block: B:160:0x054a  */
    /* JADX WARN: Code duplicated, block: B:163:0x055f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0570  */
    /* JADX WARN: Code duplicated, block: B:170:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:171:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:174:0x060b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0619  */
    /* JADX WARN: Code duplicated, block: B:180:0x062d  */
    /* JADX WARN: Code duplicated, block: B:182:0x064e  */
    /* JADX WARN: Code duplicated, block: B:183:0x0650  */
    /* JADX WARN: Code duplicated, block: B:186:0x065c  */
    /* JADX WARN: Code duplicated, block: B:189:0x0661  */
    /* JADX WARN: Code duplicated, block: B:190:0x0664  */
    /* JADX WARN: Code duplicated, block: B:194:0x0687 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x0689  */
    /* JADX WARN: Code duplicated, block: B:198:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:199:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:202:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:204:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:208:0x075d  */
    /* JADX WARN: Code duplicated, block: B:209:0x075f  */
    /* JADX WARN: Code duplicated, block: B:212:0x0766 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:215:0x076c  */
    /* JADX WARN: Code duplicated, block: B:218:0x078a  */
    /* JADX WARN: Code duplicated, block: B:221:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:222:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:225:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:227:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:230:0x0878  */
    /* JADX WARN: Code duplicated, block: B:231:0x087a  */
    /* JADX WARN: Code duplicated, block: B:234:0x0881 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:237:0x0887  */
    /* JADX WARN: Code duplicated, block: B:240:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:243:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:244:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:247:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:249:0x08f6  */
    public static final void a(final Function1<? super String, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function2, Function0<Unit> function3, final Function0<Unit> function4, final int i, a aVar, final int i2) {
        Function0<Unit> function5;
        int i3;
        n54 n54Var;
        a.C0041a.C0042a c0042a;
        Object objY;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        int i4;
        String str;
        f160 f160Var;
        n54 n54Var2;
        a.C0041a.C0042a c0042a2;
        b bVar;
        int iHashCode2;
        Iterator itA;
        a.C0041a.C0042a c0042a3;
        boolean z;
        Object objY2;
        Object objY3;
        int iHashCode3;
        tsr.a aVar3;
        yka.a.C1350a c1350a2;
        b bVar2;
        boolean z2;
        Object objY4;
        Object objY5;
        int iHashCode4;
        final String str2;
        boolean z3;
        boolean zM;
        Object objY6;
        a.C0041a.C0042a c0042a4;
        boolean zM2;
        Object objY7;
        int iHashCode5;
        tsr.a aVar4;
        yka.a.C1350a c1350a3;
        a.C0041a.C0042a c0042a5;
        boolean zM3;
        Object objY8;
        int iHashCode6;
        tsr.a aVar5;
        yka.a.C1350a c1350a4;
        function1.getClass();
        function0.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        b bVarI = aVar.i(-257689687);
        int i5 = i2 | (bVarI.A(function1) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function3) ? 2048 : 1024) | (bVarI.A(function4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.d(i) ? 131072 : 65536);
        if (bVarI.q(i5 & 1, (74899 & i5) != 74898)) {
            List listK = kotlin.collections.b.k("1", "2", "3", "4", "5", "6");
            List listK2 = kotlin.collections.b.k("7", "8", "9", "0", ".", CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
            int i6 = ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
            ((mmd) bVarI.O(kna.h)).getDensity();
            d.a aVar6 = d.a.b;
            d dVarE = j.e(aVar6, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode7 = Long.hashCode(bVarI.m());
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar7 = yka.a.b;
            bVarI.D();
            List list = listK2;
            if (bVarI.S) {
                bVarI.F(aVar7);
            } else {
                bVarI.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar3);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a5 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode7))) {
                n30.a(iHashCode7, bVarI, iHashCode7, c1350a5);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            kw0.k kVar = kw0.c;
            n54.a aVar8 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar8, bVarI, 0);
            int iHashCode8 = Long.hashCode(bVarI.m());
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, aVar6);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar7);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar3);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode8))) {
                n30.a(iHashCode8, bVarI, iHashCode8, c1350a5);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d dVarI = j.i(j.g(aVar6, 1.0f), lla.b(i, bVarI) - 96.0f);
            Object objY9 = bVarI.y();
            a.C0041a.C0042a c0042a6 = a.C0041a.a;
            if (objY9 == c0042a6) {
                objY9 = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY9;
            boolean z4 = (i5 & 57344) == 16384;
            Object objY10 = bVarI.y();
            if (z4 || objY10 == c0042a6) {
                i3 = 0;
                objY10 = new qdc(function4, i3);
                bVarI.r(objY10);
            } else {
                i3 = 0;
            }
            g75.a(androidx.compose.foundation.d.b(dVarI, pswVar, null, false, null, (Function0) objY10, 28), bVarI, i3);
            d dVarI2 = j.i(j.g(aVar6, 1.0f), 96.0f);
            long j = j58.i;
            zk40.a aVar9 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(dVarI2, j, aVar9);
            Object objY11 = bVarI.y();
            if (objY11 == c0042a6) {
                objY11 = new ydc();
                bVarI.r(objY11);
            }
            d dVarA = androidx.compose.ui.platform.d.a(s3w.a(xa80.b(dVarB, false, (Function1) objY11), "keypad"), "keypad");
            aiv aivVarC2 = g75.c(ht.a.h, false);
            int iHashCode9 = Long.hashCode(bVarI.m());
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarA);
            bVarI.D();
            a.C0041a.C0042a c0042a7 = c0042a6;
            if (bVarI.S) {
                bVarI.F(aVar7);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar3);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode9))) {
                n30.a(iHashCode9, bVarI, iHashCode9, c1350a5);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            d dVarB2 = androidx.compose.foundation.a.b(aVar6, j, aVar9);
            i78 i78VarA2 = g78.a(kw0.d, aVar8, bVarI, 6);
            int iHashCode10 = Long.hashCode(bVarI.m());
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarB2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar7);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar3);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode10))) {
                n30.a(iHashCode10, bVarI, iHashCode10, c1350a5);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            d dVarB3 = androidx.compose.foundation.a.b(zqu.a(2.0f, j.g(aVar6, 1.0f), true), j, aVar9);
            n54.b bVar4 = ht.a.l;
            kw0.j jVar = kw0.a;
            d160 d160VarA = b160.a(jVar, bVar4, bVarI, 48);
            int iHashCode11 = Long.hashCode(bVarI.m());
            ne00 ne00VarS5 = bVarI.S();
            d dVarC5 = c.c(bVarI, dVarB3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar7);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar3);
            hlh0.a(bVarI, ne00VarS5, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode11))) {
                n30.a(iHashCode11, bVarI, iHashCode11, c1350a5);
            }
            hlh0.a(bVarI, dVarC5, cVar);
            f160 f160Var2 = f160.a;
            d dVarG = j.g(f160Var2.a(8.0f, aVar6, true), 1.0f);
            i78 i78VarA3 = g78.a(kVar, aVar8, bVarI, 0);
            int iHashCode12 = Long.hashCode(bVarI.m());
            ne00 ne00VarS6 = bVarI.S();
            d dVarC6 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar7);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA3, bVar3);
            hlh0.a(bVarI, ne00VarS6, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode12))) {
                n30.a(iHashCode12, bVarI, iHashCode12, c1350a5);
            }
            hlh0.a(bVarI, dVarC6, cVar);
            d dVarI3 = j.i(androidx.compose.foundation.a.b(j.g(aVar6, 1.0f), j58.g, aVar9), 48.0f);
            n54.b bVar5 = ht.a.j;
            d160 d160VarA2 = b160.a(jVar, bVar5, bVarI, 0);
            int iHashCode13 = Long.hashCode(bVarI.m());
            ne00 ne00VarS7 = bVarI.S();
            d dVarC7 = c.c(bVarI, dVarI3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar7);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar3);
            hlh0.a(bVarI, ne00VarS7, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode13))) {
                n30.a(iHashCode13, bVarI, iHashCode13, c1350a5);
            }
            Iterator itA2 = yt1.a(bVarI, dVarC7, cVar, -784866255, listK);
            while (true) {
                boolean zHasNext = itA2.hasNext();
                n54Var = ht.a.e;
                if (!zHasNext) {
                    break;
                }
                final String str3 = (String) itA2.next();
                d dVarB4 = androidx.compose.foundation.a.b(j.c(f160Var2.a(1.0f, aVar6, true), 1.0f), r58.d(4284572001L), aVar9);
                boolean zM4 = ((i5 & 14) == 4) | bVarI.M(str3);
                Object objY12 = bVarI.y();
                if (zM4) {
                    c0042a5 = c0042a7;
                } else {
                    c0042a5 = c0042a7;
                    if (objY12 == c0042a5) {
                    }
                    d dVarD = androidx.compose.foundation.d.d(dVarB4, false, null, null, (Function0) objY12, 15);
                    zM3 = bVarI.M(str3);
                    objY8 = bVarI.y();
                    if (zM3 || objY8 == c0042a5) {
                        objY8 = new il3(str3, 1);
                        bVarI.r(objY8);
                    }
                    d dVarA2 = s3w.a(xa80.b(dVarD, false, (Function1) objY8), "key_" + str3);
                    aiv aivVarC3 = g75.c(n54Var, false);
                    iHashCode6 = Long.hashCode(bVarI.m());
                    ne00 ne00VarS8 = bVarI.S();
                    d dVarC8 = c.c(bVarI, dVarA2);
                    yka.k.getClass();
                    aVar5 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar5);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC3, yka.a.f);
                    hlh0.a(bVarI, ne00VarS8, yka.a.e);
                    c1350a4 = yka.a.g;
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                        n30.a(iHashCode6, bVarI, iHashCode6, c1350a4);
                    }
                    hlh0.a(bVarI, dVarC8, yka.a.d);
                    c0042a7 = c0042a5;
                    b bVar6 = bVarI;
                    lkf0.b(str3, null, j58.f, 0L, null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar6, 196992, 0, 131034);
                    bVarI = bVar6;
                    bVarI.X(true);
                    b(0, bVarI);
                    itA2 = itA2;
                    aVar9 = aVar9;
                    aVar6 = aVar6;
                    list = list;
                }
                objY12 = new Function0() { // from class: zdc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(str3);
                        return Unit.a;
                    }
                };
                bVarI.r(objY12);
                d dVarD2 = androidx.compose.foundation.d.d(dVarB4, false, null, null, (Function0) objY12, 15);
                zM3 = bVarI.M(str3);
                objY8 = bVarI.y();
                if (zM3) {
                    objY8 = new il3(str3, 1);
                    bVarI.r(objY8);
                } else {
                    objY8 = new il3(str3, 1);
                    bVarI.r(objY8);
                }
                d dVarA3 = s3w.a(xa80.b(dVarD2, false, (Function1) objY8), "key_" + str3);
                aiv aivVarC4 = g75.c(n54Var, false);
                iHashCode6 = Long.hashCode(bVarI.m());
                ne00 ne00VarS9 = bVarI.S();
                d dVarC9 = c.c(bVarI, dVarA3);
                yka.k.getClass();
                aVar5 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar5);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC4, yka.a.f);
                hlh0.a(bVarI, ne00VarS9, yka.a.e);
                c1350a4 = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode6, bVarI, iHashCode6, c1350a4);
                } else {
                    n30.a(iHashCode6, bVarI, iHashCode6, c1350a4);
                }
                hlh0.a(bVarI, dVarC9, yka.a.d);
                c0042a7 = c0042a5;
                b bVar7 = bVarI;
                lkf0.b(str3, null, j58.f, 0L, null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar7, 196992, 0, 131034);
                bVarI = bVar7;
                bVarI.X(true);
                b(0, bVarI);
                itA2 = itA2;
                aVar9 = aVar9;
                aVar6 = aVar6;
                list = list;
            }
            d.a aVar10 = aVar6;
            zk40.a aVar11 = aVar9;
            a.C0041a.C0042a c0042a8 = c0042a7;
            bVarI.X(false);
            d dVarB5 = androidx.compose.foundation.a.b(j.c(f160Var2.a(1.5f, aVar10, true), 1.0f), r58.d(4284572001L), aVar11);
            boolean z5 = (i5 & 896) == 256;
            Object objY13 = bVarI.y();
            if (z5) {
                c0042a = c0042a8;
            } else {
                c0042a = c0042a8;
                if (objY13 == c0042a) {
                }
                d dVarD3 = androidx.compose.foundation.d.d(dVarB5, false, null, null, (Function0) objY13, 15);
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = new bec();
                    bVarI.r(objY);
                }
                d dVarA4 = s3w.a(xa80.b(dVarD3, false, (Function1) objY), "backspace");
                aiv aivVarC5 = g75.c(n54Var, false);
                iHashCode = Long.hashCode(bVarI.m());
                ne00 ne00VarS10 = bVarI.S();
                d dVarC10 = c.c(bVarI, dVarA4);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar8 = yka.a.f;
                hlh0.a(bVarI, aivVarC5, bVar8);
                yka.a.d dVar2 = yka.a.e;
                hlh0.a(bVarI, ne00VarS10, dVar2);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    i4 = i5;
                } else {
                    i4 = i5;
                    if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    }
                    yka.a.c cVar2 = yka.a.d;
                    hlh0.a(bVarI, dVarC10, cVar2);
                    b bVar9 = bVarI;
                    str = "key_";
                    f160Var = f160Var2;
                    n54Var2 = n54Var;
                    c0042a2 = c0042a;
                    h6n.b(erz.a(R.drawable.backspace, 0, bVarI), "Backspace", j.r(aVar10, 20.0f), j58.f, bVar9, 3504, 0);
                    bVar = bVar9;
                    bVar.X(true);
                    bVar.X(true);
                    ute.a(null, 0.5f, r58.d(4288585374L), bVar, 432, 1);
                    d dVarI4 = j.i(androidx.compose.foundation.a.b(j.g(aVar10, 1.0f), j58.g, aVar11), 48.0f);
                    d160 d160VarA3 = b160.a(jVar, bVar5, bVar, 0);
                    iHashCode2 = Long.hashCode(bVar.m());
                    ne00 ne00VarS11 = bVar.S();
                    d dVarC11 = c.c(bVar, dVarI4);
                    bVar.D();
                    if (bVar.S) {
                        bVar.F(aVar2);
                    } else {
                        bVar.p();
                    }
                    hlh0.a(bVar, d160VarA3, bVar8);
                    hlh0.a(bVar, ne00VarS11, dVar2);
                    if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode2))) {
                        n30.a(iHashCode2, bVar, iHashCode2, c1350a);
                    }
                    itA = yt1.a(bVar, dVarC11, cVar2, 402973107, list);
                    while (itA.hasNext()) {
                        str2 = (String) itA.next();
                        f160 f160Var3 = f160Var;
                        d dVarB6 = androidx.compose.foundation.a.b(j.c(f160Var3.a(1.0f, aVar10, true), 1.0f), r58.d(4284572001L), aVar11);
                        if ((i4 & 14) == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zM = bVar.M(str2) | z3;
                        objY6 = bVar.y();
                        if (zM) {
                            c0042a4 = c0042a2;
                        } else {
                            c0042a4 = c0042a2;
                            if (objY6 == c0042a4) {
                            }
                            d dVarD4 = androidx.compose.foundation.d.d(dVarB6, false, null, null, (Function0) objY6, 15);
                            zM2 = bVar.M(str2);
                            objY7 = bVar.y();
                            if (zM2 || objY7 == c0042a4) {
                                objY7 = new Function1() { // from class: rdc
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        pb80 pb80Var = (pb80) obj;
                                        pb80Var.getClass();
                                        lb80.c(pb80Var, "key_" + str2);
                                        return Unit.a;
                                    }
                                };
                                bVar.r(objY7);
                            }
                            d dVarB7 = xa80.b(dVarD4, false, (Function1) objY7);
                            String str4 = str;
                            d dVarA5 = s3w.a(dVarB7, str4 + str2);
                            n54 n54Var3 = n54Var2;
                            aiv aivVarC6 = g75.c(n54Var3, false);
                            iHashCode5 = Long.hashCode(bVar.m());
                            ne00 ne00VarS12 = bVar.S();
                            d dVarC12 = c.c(bVar, dVarA5);
                            yka.k.getClass();
                            aVar4 = yka.a.b;
                            bVar.D();
                            if (bVar.S) {
                                bVar.F(aVar4);
                            } else {
                                bVar.p();
                            }
                            hlh0.a(bVar, aivVarC6, yka.a.f);
                            hlh0.a(bVar, ne00VarS12, yka.a.e);
                            c1350a3 = yka.a.g;
                            if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode5))) {
                                n30.a(iHashCode5, bVar, iHashCode5, c1350a3);
                            }
                            hlh0.a(bVar, dVarC12, yka.a.d);
                            str = str4;
                            b bVar10 = bVar;
                            lkf0.b(str2, null, j58.f, 0L, null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar10, 196992, 0, 131034);
                            bVar = bVar10;
                            bVar.X(true);
                            b(0, bVar);
                            f160Var = f160Var3;
                            c0042a2 = c0042a4;
                            n54Var2 = n54Var3;
                        }
                        objY6 = new Function0() { // from class: cec
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(str2);
                                return Unit.a;
                            }
                        };
                        bVar.r(objY6);
                        d dVarD5 = androidx.compose.foundation.d.d(dVarB6, false, null, null, (Function0) objY6, 15);
                        zM2 = bVar.M(str2);
                        objY7 = bVar.y();
                        if (zM2) {
                            objY7 = new Function1() { // from class: rdc
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    pb80 pb80Var = (pb80) obj;
                                    pb80Var.getClass();
                                    lb80.c(pb80Var, "key_" + str2);
                                    return Unit.a;
                                }
                            };
                            bVar.r(objY7);
                        } else {
                            objY7 = new Function1() { // from class: rdc
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    pb80 pb80Var = (pb80) obj;
                                    pb80Var.getClass();
                                    lb80.c(pb80Var, "key_" + str2);
                                    return Unit.a;
                                }
                            };
                            bVar.r(objY7);
                        }
                        d dVarB8 = xa80.b(dVarD5, false, (Function1) objY7);
                        String str5 = str;
                        d dVarA6 = s3w.a(dVarB8, str5 + str2);
                        n54 n54Var4 = n54Var2;
                        aiv aivVarC7 = g75.c(n54Var4, false);
                        iHashCode5 = Long.hashCode(bVar.m());
                        ne00 ne00VarS13 = bVar.S();
                        d dVarC13 = c.c(bVar, dVarA6);
                        yka.k.getClass();
                        aVar4 = yka.a.b;
                        bVar.D();
                        if (bVar.S) {
                            bVar.F(aVar4);
                        } else {
                            bVar.p();
                        }
                        hlh0.a(bVar, aivVarC7, yka.a.f);
                        hlh0.a(bVar, ne00VarS13, yka.a.e);
                        c1350a3 = yka.a.g;
                        if (bVar.S) {
                            n30.a(iHashCode5, bVar, iHashCode5, c1350a3);
                        } else {
                            n30.a(iHashCode5, bVar, iHashCode5, c1350a3);
                        }
                        hlh0.a(bVar, dVarC13, yka.a.d);
                        str = str5;
                        b bVar11 = bVar;
                        lkf0.b(str2, null, j58.f, 0L, null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar11, 196992, 0, 131034);
                        bVar = bVar11;
                        bVar.X(true);
                        b(0, bVar);
                        f160Var = f160Var3;
                        c0042a2 = c0042a4;
                        n54Var2 = n54Var4;
                    }
                    n54 n54Var5 = n54Var2;
                    f160 f160Var4 = f160Var;
                    c0042a3 = c0042a2;
                    bVar.X(false);
                    d dVarB9 = androidx.compose.foundation.a.b(j.c(f160Var4.a(1.5f, aVar10, true), 1.0f), r58.d(4284572001L), aVar11);
                    if ((i4 & 112) == 32) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objY2 = bVar.y();
                    if (z || objY2 == c0042a3) {
                        objY2 = new sdc(function0, 0);
                        bVar.r(objY2);
                    }
                    d dVarD6 = androidx.compose.foundation.d.d(dVarB9, false, null, null, (Function0) objY2, 15);
                    objY3 = bVar.y();
                    if (objY3 == c0042a3) {
                        objY3 = new tdc();
                        bVar.r(objY3);
                    }
                    d dVarA7 = s3w.a(xa80.b(dVarD6, false, (Function1) objY3), "clear");
                    aiv aivVarC8 = g75.c(n54Var5, false);
                    iHashCode3 = Long.hashCode(bVar.m());
                    ne00 ne00VarS14 = bVar.S();
                    d dVarC14 = c.c(bVar, dVarA7);
                    yka.k.getClass();
                    aVar3 = yka.a.b;
                    bVar.D();
                    if (bVar.S) {
                        bVar.F(aVar3);
                    } else {
                        bVar.p();
                    }
                    yka.a.b bVar12 = yka.a.f;
                    hlh0.a(bVar, aivVarC8, bVar12);
                    yka.a.d dVar3 = yka.a.e;
                    hlh0.a(bVar, ne00VarS14, dVar3);
                    c1350a2 = yka.a.g;
                    if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode3))) {
                        n30.a(iHashCode3, bVar, iHashCode3, c1350a2);
                    }
                    yka.a.c cVar3 = yka.a.d;
                    hlh0.a(bVar, dVarC14, cVar3);
                    op5 op5Var = op5.a;
                    String strC = op5.c(op5Var, pwo.e(R.string.clear_text_cms, bVar), "Clear");
                    long j2 = j58.f;
                    bVar2 = bVar;
                    lkf0.b(strC, null, j2, 0L, null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar2, 196992, 0, 131034);
                    f30.a(bVar2, true, true, true);
                    d dVarB10 = androidx.compose.foundation.a.b(j.i(f160Var4.a(2.0f, aVar10, true), 96.0f), c68.a(R.color.sh_keyBoard_done_btn_color, bVar2), aVar11);
                    if ((i4 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objY4 = bVar2.y();
                    if (!z2 || objY4 == c0042a3) {
                        function5 = function3;
                        objY4 = new vdc(function5, 0);
                        bVar2.r(objY4);
                    } else {
                        function5 = function3;
                    }
                    d dVarD7 = androidx.compose.foundation.d.d(dVarB10, false, null, null, (Function0) objY4, 15);
                    objY5 = bVar2.y();
                    if (objY5 == c0042a3) {
                        objY5 = new wdc();
                        bVar2.r(objY5);
                    }
                    d dVarA8 = s3w.a(xa80.b(dVarD7, false, (Function1) objY5), "done");
                    aiv aivVarC9 = g75.c(n54Var5, false);
                    iHashCode4 = Long.hashCode(bVar2.m());
                    ne00 ne00VarS15 = bVar2.S();
                    d dVarC15 = c.c(bVar2, dVarA8);
                    bVar2.D();
                    if (bVar2.S) {
                        bVar2.F(aVar3);
                    } else {
                        bVar2.p();
                    }
                    hlh0.a(bVar2, aivVarC9, bVar12);
                    hlh0.a(bVar2, ne00VarS15, dVar3);
                    if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode4))) {
                        n30.a(iHashCode4, bVar2, iHashCode4, c1350a2);
                    }
                    hlh0.a(bVar2, dVarC15, cVar3);
                    wf1.a(op5.c(op5Var, pwo.e(R.string.done_text_cms, bVar2), pwo.e(R.string.done_txt, bVar2)), null, imf0.b(((eah0) bVar2.O(gah0.a)).b, ((th60) bVar2.O(vh60.a)).Y, d2l.f(16), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777212), 0, d2l.f(10), null, 0, null, j2, bVar2, 100687872, 234);
                    bVarI = bVar2;
                    mx4.a(bVarI, true, true, true, true);
                    bVarI.X(true);
                    bVarI.X(true);
                }
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                yka.a.c cVar4 = yka.a.d;
                hlh0.a(bVarI, dVarC10, cVar4);
                b bVar13 = bVarI;
                str = "key_";
                f160Var = f160Var2;
                n54Var2 = n54Var;
                c0042a2 = c0042a;
                h6n.b(erz.a(R.drawable.backspace, 0, bVarI), "Backspace", j.r(aVar10, 20.0f), j58.f, bVar13, 3504, 0);
                bVar = bVar13;
                bVar.X(true);
                bVar.X(true);
                ute.a(null, 0.5f, r58.d(4288585374L), bVar, 432, 1);
                d dVarI5 = j.i(androidx.compose.foundation.a.b(j.g(aVar10, 1.0f), j58.g, aVar11), 48.0f);
                d160 d160VarA4 = b160.a(jVar, bVar5, bVar, 0);
                iHashCode2 = Long.hashCode(bVar.m());
                ne00 ne00VarS16 = bVar.S();
                d dVarC16 = c.c(bVar, dVarI5);
                bVar.D();
                if (bVar.S) {
                    bVar.F(aVar2);
                } else {
                    bVar.p();
                }
                hlh0.a(bVar, d160VarA4, bVar8);
                hlh0.a(bVar, ne00VarS16, dVar2);
                if (bVar.S) {
                    n30.a(iHashCode2, bVar, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVar, iHashCode2, c1350a);
                }
                itA = yt1.a(bVar, dVarC16, cVar4, 402973107, list);
                while (itA.hasNext()) {
                    str2 = (String) itA.next();
                    f160 f160Var5 = f160Var;
                    d dVarB11 = androidx.compose.foundation.a.b(j.c(f160Var5.a(1.0f, aVar10, true), 1.0f), r58.d(4284572001L), aVar11);
                    if ((i4 & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zM = bVar.M(str2) | z3;
                    objY6 = bVar.y();
                    if (zM) {
                        c0042a4 = c0042a2;
                        if (objY6 == c0042a4) {
                        }
                        d dVarD8 = androidx.compose.foundation.d.d(dVarB11, false, null, null, (Function0) objY6, 15);
                        zM2 = bVar.M(str2);
                        objY7 = bVar.y();
                        if (zM2) {
                            objY7 = new Function1() { // from class: rdc
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    pb80 pb80Var = (pb80) obj;
                                    pb80Var.getClass();
                                    lb80.c(pb80Var, "key_" + str2);
                                    return Unit.a;
                                }
                            };
                            bVar.r(objY7);
                        } else {
                            objY7 = new Function1() { // from class: rdc
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    pb80 pb80Var = (pb80) obj;
                                    pb80Var.getClass();
                                    lb80.c(pb80Var, "key_" + str2);
                                    return Unit.a;
                                }
                            };
                            bVar.r(objY7);
                        }
                        d dVarB12 = xa80.b(dVarD8, false, (Function1) objY7);
                        String str6 = str;
                        d dVarA9 = s3w.a(dVarB12, str6 + str2);
                        n54 n54Var6 = n54Var2;
                        aiv aivVarC10 = g75.c(n54Var6, false);
                        iHashCode5 = Long.hashCode(bVar.m());
                        ne00 ne00VarS17 = bVar.S();
                        d dVarC17 = c.c(bVar, dVarA9);
                        yka.k.getClass();
                        aVar4 = yka.a.b;
                        bVar.D();
                        if (bVar.S) {
                            bVar.F(aVar4);
                        } else {
                            bVar.p();
                        }
                        hlh0.a(bVar, aivVarC10, yka.a.f);
                        hlh0.a(bVar, ne00VarS17, yka.a.e);
                        c1350a3 = yka.a.g;
                        if (bVar.S) {
                            n30.a(iHashCode5, bVar, iHashCode5, c1350a3);
                        } else {
                            n30.a(iHashCode5, bVar, iHashCode5, c1350a3);
                        }
                        hlh0.a(bVar, dVarC17, yka.a.d);
                        str = str6;
                        b bVar14 = bVar;
                        lkf0.b(str2, null, j58.f, 0L, null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar14, 196992, 0, 131034);
                        bVar = bVar14;
                        bVar.X(true);
                        b(0, bVar);
                        f160Var = f160Var5;
                        c0042a2 = c0042a4;
                        n54Var2 = n54Var6;
                    } else {
                        c0042a4 = c0042a2;
                    }
                    objY6 = new Function0() { // from class: cec
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(str2);
                            return Unit.a;
                        }
                    };
                    bVar.r(objY6);
                    d dVarD9 = androidx.compose.foundation.d.d(dVarB11, false, null, null, (Function0) objY6, 15);
                    zM2 = bVar.M(str2);
                    objY7 = bVar.y();
                    if (zM2) {
                        objY7 = new Function1() { // from class: rdc
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                pb80 pb80Var = (pb80) obj;
                                pb80Var.getClass();
                                lb80.c(pb80Var, "key_" + str2);
                                return Unit.a;
                            }
                        };
                        bVar.r(objY7);
                    } else {
                        objY7 = new Function1() { // from class: rdc
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                pb80 pb80Var = (pb80) obj;
                                pb80Var.getClass();
                                lb80.c(pb80Var, "key_" + str2);
                                return Unit.a;
                            }
                        };
                        bVar.r(objY7);
                    }
                    d dVarB13 = xa80.b(dVarD9, false, (Function1) objY7);
                    String str7 = str;
                    d dVarA10 = s3w.a(dVarB13, str7 + str2);
                    n54 n54Var7 = n54Var2;
                    aiv aivVarC11 = g75.c(n54Var7, false);
                    iHashCode5 = Long.hashCode(bVar.m());
                    ne00 ne00VarS18 = bVar.S();
                    d dVarC18 = c.c(bVar, dVarA10);
                    yka.k.getClass();
                    aVar4 = yka.a.b;
                    bVar.D();
                    if (bVar.S) {
                        bVar.F(aVar4);
                    } else {
                        bVar.p();
                    }
                    hlh0.a(bVar, aivVarC11, yka.a.f);
                    hlh0.a(bVar, ne00VarS18, yka.a.e);
                    c1350a3 = yka.a.g;
                    if (bVar.S) {
                        n30.a(iHashCode5, bVar, iHashCode5, c1350a3);
                    } else {
                        n30.a(iHashCode5, bVar, iHashCode5, c1350a3);
                    }
                    hlh0.a(bVar, dVarC18, yka.a.d);
                    str = str7;
                    b bVar15 = bVar;
                    lkf0.b(str2, null, j58.f, 0L, null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar15, 196992, 0, 131034);
                    bVar = bVar15;
                    bVar.X(true);
                    b(0, bVar);
                    f160Var = f160Var5;
                    c0042a2 = c0042a4;
                    n54Var2 = n54Var7;
                }
                n54 n54Var8 = n54Var2;
                f160 f160Var6 = f160Var;
                c0042a3 = c0042a2;
                bVar.X(false);
                d dVarB14 = androidx.compose.foundation.a.b(j.c(f160Var6.a(1.5f, aVar10, true), 1.0f), r58.d(4284572001L), aVar11);
                if ((i4 & 112) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                objY2 = bVar.y();
                if (z) {
                    objY2 = new sdc(function0, 0);
                    bVar.r(objY2);
                } else {
                    objY2 = new sdc(function0, 0);
                    bVar.r(objY2);
                }
                d dVarD10 = androidx.compose.foundation.d.d(dVarB14, false, null, null, (Function0) objY2, 15);
                objY3 = bVar.y();
                if (objY3 == c0042a3) {
                    objY3 = new tdc();
                    bVar.r(objY3);
                }
                d dVarA11 = s3w.a(xa80.b(dVarD10, false, (Function1) objY3), "clear");
                aiv aivVarC12 = g75.c(n54Var8, false);
                iHashCode3 = Long.hashCode(bVar.m());
                ne00 ne00VarS19 = bVar.S();
                d dVarC19 = c.c(bVar, dVarA11);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVar.D();
                if (bVar.S) {
                    bVar.F(aVar3);
                } else {
                    bVar.p();
                }
                yka.a.b bVar16 = yka.a.f;
                hlh0.a(bVar, aivVarC12, bVar16);
                yka.a.d dVar4 = yka.a.e;
                hlh0.a(bVar, ne00VarS19, dVar4);
                c1350a2 = yka.a.g;
                if (bVar.S) {
                    n30.a(iHashCode3, bVar, iHashCode3, c1350a2);
                } else {
                    n30.a(iHashCode3, bVar, iHashCode3, c1350a2);
                }
                yka.a.c cVar5 = yka.a.d;
                hlh0.a(bVar, dVarC19, cVar5);
                op5 op5Var2 = op5.a;
                String strC2 = op5.c(op5Var2, pwo.e(R.string.clear_text_cms, bVar), "Clear");
                long j3 = j58.f;
                bVar2 = bVar;
                lkf0.b(strC2, null, j3, 0L, null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar2, 196992, 0, 131034);
                f30.a(bVar2, true, true, true);
                d dVarB15 = androidx.compose.foundation.a.b(j.i(f160Var6.a(2.0f, aVar10, true), 96.0f), c68.a(R.color.sh_keyBoard_done_btn_color, bVar2), aVar11);
                if ((i4 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objY4 = bVar2.y();
                if (z2) {
                    function5 = function3;
                    objY4 = new vdc(function5, 0);
                    bVar2.r(objY4);
                } else {
                    function5 = function3;
                    objY4 = new vdc(function5, 0);
                    bVar2.r(objY4);
                }
                d dVarD11 = androidx.compose.foundation.d.d(dVarB15, false, null, null, (Function0) objY4, 15);
                objY5 = bVar2.y();
                if (objY5 == c0042a3) {
                    objY5 = new wdc();
                    bVar2.r(objY5);
                }
                d dVarA12 = s3w.a(xa80.b(dVarD11, false, (Function1) objY5), "done");
                aiv aivVarC13 = g75.c(n54Var8, false);
                iHashCode4 = Long.hashCode(bVar2.m());
                ne00 ne00VarS110 = bVar2.S();
                d dVarC110 = c.c(bVar2, dVarA12);
                bVar2.D();
                if (bVar2.S) {
                    bVar2.F(aVar3);
                } else {
                    bVar2.p();
                }
                hlh0.a(bVar2, aivVarC13, bVar16);
                hlh0.a(bVar2, ne00VarS110, dVar4);
                if (bVar2.S) {
                    n30.a(iHashCode4, bVar2, iHashCode4, c1350a2);
                } else {
                    n30.a(iHashCode4, bVar2, iHashCode4, c1350a2);
                }
                hlh0.a(bVar2, dVarC110, cVar5);
                wf1.a(op5.c(op5Var2, pwo.e(R.string.done_text_cms, bVar2), pwo.e(R.string.done_txt, bVar2)), null, imf0.b(((eah0) bVar2.O(gah0.a)).b, ((th60) bVar2.O(vh60.a)).Y, d2l.f(16), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777212), 0, d2l.f(10), null, 0, null, j3, bVar2, 100687872, 234);
                bVarI = bVar2;
                mx4.a(bVarI, true, true, true, true);
                bVarI.X(true);
                bVarI.X(true);
            }
            objY13 = new Function0() { // from class: aec
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    function2.invoke();
                    return Unit.a;
                }
            };
            bVarI.r(objY13);
            d dVarD12 = androidx.compose.foundation.d.d(dVarB5, false, null, null, (Function0) objY13, 15);
            objY = bVarI.y();
            if (objY == c0042a) {
                objY = new bec();
                bVarI.r(objY);
            }
            d dVarA13 = s3w.a(xa80.b(dVarD12, false, (Function1) objY), "backspace");
            aiv aivVarC14 = g75.c(n54Var, false);
            iHashCode = Long.hashCode(bVarI.m());
            ne00 ne00VarS111 = bVarI.S();
            d dVarC111 = c.c(bVarI, dVarA13);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar17 = yka.a.f;
            hlh0.a(bVarI, aivVarC14, bVar17);
            yka.a.d dVar5 = yka.a.e;
            hlh0.a(bVarI, ne00VarS111, dVar5);
            c1350a = yka.a.g;
            if (bVarI.S) {
                i4 = i5;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                }
                yka.a.c cVar6 = yka.a.d;
                hlh0.a(bVarI, dVarC111, cVar6);
                b bVar18 = bVarI;
                str = "key_";
                f160Var = f160Var2;
                n54Var2 = n54Var;
                c0042a2 = c0042a;
                h6n.b(erz.a(R.drawable.backspace, 0, bVarI), "Backspace", j.r(aVar10, 20.0f), j58.f, bVar18, 3504, 0);
                bVar = bVar18;
                bVar.X(true);
                bVar.X(true);
                ute.a(null, 0.5f, r58.d(4288585374L), bVar, 432, 1);
                d dVarI6 = j.i(androidx.compose.foundation.a.b(j.g(aVar10, 1.0f), j58.g, aVar11), 48.0f);
                d160 d160VarA5 = b160.a(jVar, bVar5, bVar, 0);
                iHashCode2 = Long.hashCode(bVar.m());
                ne00 ne00VarS112 = bVar.S();
                d dVarC112 = c.c(bVar, dVarI6);
                bVar.D();
                if (bVar.S) {
                    bVar.F(aVar2);
                } else {
                    bVar.p();
                }
                hlh0.a(bVar, d160VarA5, bVar17);
                hlh0.a(bVar, ne00VarS112, dVar5);
                if (bVar.S) {
                    n30.a(iHashCode2, bVar, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVar, iHashCode2, c1350a);
                }
                itA = yt1.a(bVar, dVarC112, cVar6, 402973107, list);
                while (itA.hasNext()) {
                    str2 = (String) itA.next();
                    f160 f160Var7 = f160Var;
                    d dVarB16 = androidx.compose.foundation.a.b(j.c(f160Var7.a(1.0f, aVar10, true), 1.0f), r58.d(4284572001L), aVar11);
                    if ((i4 & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zM = bVar.M(str2) | z3;
                    objY6 = bVar.y();
                    if (zM) {
                        c0042a4 = c0042a2;
                        if (objY6 == c0042a4) {
                        }
                        d dVarD13 = androidx.compose.foundation.d.d(dVarB16, false, null, null, (Function0) objY6, 15);
                        zM2 = bVar.M(str2);
                        objY7 = bVar.y();
                        if (zM2) {
                            objY7 = new Function1() { // from class: rdc
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    pb80 pb80Var = (pb80) obj;
                                    pb80Var.getClass();
                                    lb80.c(pb80Var, "key_" + str2);
                                    return Unit.a;
                                }
                            };
                            bVar.r(objY7);
                        } else {
                            objY7 = new Function1() { // from class: rdc
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    pb80 pb80Var = (pb80) obj;
                                    pb80Var.getClass();
                                    lb80.c(pb80Var, "key_" + str2);
                                    return Unit.a;
                                }
                            };
                            bVar.r(objY7);
                        }
                        d dVarB17 = xa80.b(dVarD13, false, (Function1) objY7);
                        String str8 = str;
                        d dVarA14 = s3w.a(dVarB17, str8 + str2);
                        n54 n54Var9 = n54Var2;
                        aiv aivVarC15 = g75.c(n54Var9, false);
                        iHashCode5 = Long.hashCode(bVar.m());
                        ne00 ne00VarS113 = bVar.S();
                        d dVarC113 = c.c(bVar, dVarA14);
                        yka.k.getClass();
                        aVar4 = yka.a.b;
                        bVar.D();
                        if (bVar.S) {
                            bVar.F(aVar4);
                        } else {
                            bVar.p();
                        }
                        hlh0.a(bVar, aivVarC15, yka.a.f);
                        hlh0.a(bVar, ne00VarS113, yka.a.e);
                        c1350a3 = yka.a.g;
                        if (bVar.S) {
                            n30.a(iHashCode5, bVar, iHashCode5, c1350a3);
                        } else {
                            n30.a(iHashCode5, bVar, iHashCode5, c1350a3);
                        }
                        hlh0.a(bVar, dVarC113, yka.a.d);
                        str = str8;
                        b bVar19 = bVar;
                        lkf0.b(str2, null, j58.f, 0L, null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar19, 196992, 0, 131034);
                        bVar = bVar19;
                        bVar.X(true);
                        b(0, bVar);
                        f160Var = f160Var7;
                        c0042a2 = c0042a4;
                        n54Var2 = n54Var9;
                    } else {
                        c0042a4 = c0042a2;
                    }
                    objY6 = new Function0() { // from class: cec
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(str2);
                            return Unit.a;
                        }
                    };
                    bVar.r(objY6);
                    d dVarD14 = androidx.compose.foundation.d.d(dVarB16, false, null, null, (Function0) objY6, 15);
                    zM2 = bVar.M(str2);
                    objY7 = bVar.y();
                    if (zM2) {
                        objY7 = new Function1() { // from class: rdc
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                pb80 pb80Var = (pb80) obj;
                                pb80Var.getClass();
                                lb80.c(pb80Var, "key_" + str2);
                                return Unit.a;
                            }
                        };
                        bVar.r(objY7);
                    } else {
                        objY7 = new Function1() { // from class: rdc
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                pb80 pb80Var = (pb80) obj;
                                pb80Var.getClass();
                                lb80.c(pb80Var, "key_" + str2);
                                return Unit.a;
                            }
                        };
                        bVar.r(objY7);
                    }
                    d dVarB18 = xa80.b(dVarD14, false, (Function1) objY7);
                    String str9 = str;
                    d dVarA15 = s3w.a(dVarB18, str9 + str2);
                    n54 n54Var10 = n54Var2;
                    aiv aivVarC16 = g75.c(n54Var10, false);
                    iHashCode5 = Long.hashCode(bVar.m());
                    ne00 ne00VarS114 = bVar.S();
                    d dVarC114 = c.c(bVar, dVarA15);
                    yka.k.getClass();
                    aVar4 = yka.a.b;
                    bVar.D();
                    if (bVar.S) {
                        bVar.F(aVar4);
                    } else {
                        bVar.p();
                    }
                    hlh0.a(bVar, aivVarC16, yka.a.f);
                    hlh0.a(bVar, ne00VarS114, yka.a.e);
                    c1350a3 = yka.a.g;
                    if (bVar.S) {
                        n30.a(iHashCode5, bVar, iHashCode5, c1350a3);
                    } else {
                        n30.a(iHashCode5, bVar, iHashCode5, c1350a3);
                    }
                    hlh0.a(bVar, dVarC114, yka.a.d);
                    str = str9;
                    b bVar110 = bVar;
                    lkf0.b(str2, null, j58.f, 0L, null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar110, 196992, 0, 131034);
                    bVar = bVar110;
                    bVar.X(true);
                    b(0, bVar);
                    f160Var = f160Var7;
                    c0042a2 = c0042a4;
                    n54Var2 = n54Var10;
                }
                n54 n54Var11 = n54Var2;
                f160 f160Var8 = f160Var;
                c0042a3 = c0042a2;
                bVar.X(false);
                d dVarB19 = androidx.compose.foundation.a.b(j.c(f160Var8.a(1.5f, aVar10, true), 1.0f), r58.d(4284572001L), aVar11);
                if ((i4 & 112) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                objY2 = bVar.y();
                if (z) {
                    objY2 = new sdc(function0, 0);
                    bVar.r(objY2);
                } else {
                    objY2 = new sdc(function0, 0);
                    bVar.r(objY2);
                }
                d dVarD15 = androidx.compose.foundation.d.d(dVarB19, false, null, null, (Function0) objY2, 15);
                objY3 = bVar.y();
                if (objY3 == c0042a3) {
                    objY3 = new tdc();
                    bVar.r(objY3);
                }
                d dVarA16 = s3w.a(xa80.b(dVarD15, false, (Function1) objY3), "clear");
                aiv aivVarC17 = g75.c(n54Var11, false);
                iHashCode3 = Long.hashCode(bVar.m());
                ne00 ne00VarS115 = bVar.S();
                d dVarC115 = c.c(bVar, dVarA16);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVar.D();
                if (bVar.S) {
                    bVar.F(aVar3);
                } else {
                    bVar.p();
                }
                yka.a.b bVar111 = yka.a.f;
                hlh0.a(bVar, aivVarC17, bVar111);
                yka.a.d dVar6 = yka.a.e;
                hlh0.a(bVar, ne00VarS115, dVar6);
                c1350a2 = yka.a.g;
                if (bVar.S) {
                    n30.a(iHashCode3, bVar, iHashCode3, c1350a2);
                } else {
                    n30.a(iHashCode3, bVar, iHashCode3, c1350a2);
                }
                yka.a.c cVar7 = yka.a.d;
                hlh0.a(bVar, dVarC115, cVar7);
                op5 op5Var3 = op5.a;
                String strC3 = op5.c(op5Var3, pwo.e(R.string.clear_text_cms, bVar), "Clear");
                long j4 = j58.f;
                bVar2 = bVar;
                lkf0.b(strC3, null, j4, 0L, null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar2, 196992, 0, 131034);
                f30.a(bVar2, true, true, true);
                d dVarB110 = androidx.compose.foundation.a.b(j.i(f160Var8.a(2.0f, aVar10, true), 96.0f), c68.a(R.color.sh_keyBoard_done_btn_color, bVar2), aVar11);
                if ((i4 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objY4 = bVar2.y();
                if (z2) {
                    function5 = function3;
                    objY4 = new vdc(function5, 0);
                    bVar2.r(objY4);
                } else {
                    function5 = function3;
                    objY4 = new vdc(function5, 0);
                    bVar2.r(objY4);
                }
                d dVarD16 = androidx.compose.foundation.d.d(dVarB110, false, null, null, (Function0) objY4, 15);
                objY5 = bVar2.y();
                if (objY5 == c0042a3) {
                    objY5 = new wdc();
                    bVar2.r(objY5);
                }
                d dVarA17 = s3w.a(xa80.b(dVarD16, false, (Function1) objY5), "done");
                aiv aivVarC18 = g75.c(n54Var11, false);
                iHashCode4 = Long.hashCode(bVar2.m());
                ne00 ne00VarS116 = bVar2.S();
                d dVarC116 = c.c(bVar2, dVarA17);
                bVar2.D();
                if (bVar2.S) {
                    bVar2.F(aVar3);
                } else {
                    bVar2.p();
                }
                hlh0.a(bVar2, aivVarC18, bVar111);
                hlh0.a(bVar2, ne00VarS116, dVar6);
                if (bVar2.S) {
                    n30.a(iHashCode4, bVar2, iHashCode4, c1350a2);
                } else {
                    n30.a(iHashCode4, bVar2, iHashCode4, c1350a2);
                }
                hlh0.a(bVar2, dVarC116, cVar7);
                wf1.a(op5.c(op5Var3, pwo.e(R.string.done_text_cms, bVar2), pwo.e(R.string.done_txt, bVar2)), null, imf0.b(((eah0) bVar2.O(gah0.a)).b, ((th60) bVar2.O(vh60.a)).Y, d2l.f(16), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777212), 0, d2l.f(10), null, 0, null, j4, bVar2, 100687872, 234);
                bVarI = bVar2;
                mx4.a(bVarI, true, true, true, true);
                bVarI.X(true);
                bVarI.X(true);
            } else {
                i4 = i5;
            }
            n30.a(iHashCode, bVarI, iHashCode, c1350a);
            yka.a.c cVar8 = yka.a.d;
            hlh0.a(bVarI, dVarC111, cVar8);
            b bVar112 = bVarI;
            str = "key_";
            f160Var = f160Var2;
            n54Var2 = n54Var;
            c0042a2 = c0042a;
            h6n.b(erz.a(R.drawable.backspace, 0, bVarI), "Backspace", j.r(aVar10, 20.0f), j58.f, bVar112, 3504, 0);
            bVar = bVar112;
            bVar.X(true);
            bVar.X(true);
            ute.a(null, 0.5f, r58.d(4288585374L), bVar, 432, 1);
            d dVarI7 = j.i(androidx.compose.foundation.a.b(j.g(aVar10, 1.0f), j58.g, aVar11), 48.0f);
            d160 d160VarA6 = b160.a(jVar, bVar5, bVar, 0);
            iHashCode2 = Long.hashCode(bVar.m());
            ne00 ne00VarS117 = bVar.S();
            d dVarC117 = c.c(bVar, dVarI7);
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar2);
            } else {
                bVar.p();
            }
            hlh0.a(bVar, d160VarA6, bVar17);
            hlh0.a(bVar, ne00VarS117, dVar5);
            if (bVar.S) {
                n30.a(iHashCode2, bVar, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVar, iHashCode2, c1350a);
            }
            itA = yt1.a(bVar, dVarC117, cVar8, 402973107, list);
            while (itA.hasNext()) {
                str2 = (String) itA.next();
                f160 f160Var9 = f160Var;
                d dVarB111 = androidx.compose.foundation.a.b(j.c(f160Var9.a(1.0f, aVar10, true), 1.0f), r58.d(4284572001L), aVar11);
                if ((i4 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zM = bVar.M(str2) | z3;
                objY6 = bVar.y();
                if (zM) {
                    c0042a4 = c0042a2;
                    if (objY6 == c0042a4) {
                    }
                    d dVarD17 = androidx.compose.foundation.d.d(dVarB111, false, null, null, (Function0) objY6, 15);
                    zM2 = bVar.M(str2);
                    objY7 = bVar.y();
                    if (zM2) {
                        objY7 = new Function1() { // from class: rdc
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                pb80 pb80Var = (pb80) obj;
                                pb80Var.getClass();
                                lb80.c(pb80Var, "key_" + str2);
                                return Unit.a;
                            }
                        };
                        bVar.r(objY7);
                    } else {
                        objY7 = new Function1() { // from class: rdc
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                pb80 pb80Var = (pb80) obj;
                                pb80Var.getClass();
                                lb80.c(pb80Var, "key_" + str2);
                                return Unit.a;
                            }
                        };
                        bVar.r(objY7);
                    }
                    d dVarB112 = xa80.b(dVarD17, false, (Function1) objY7);
                    String str10 = str;
                    d dVarA18 = s3w.a(dVarB112, str10 + str2);
                    n54 n54Var12 = n54Var2;
                    aiv aivVarC19 = g75.c(n54Var12, false);
                    iHashCode5 = Long.hashCode(bVar.m());
                    ne00 ne00VarS118 = bVar.S();
                    d dVarC118 = c.c(bVar, dVarA18);
                    yka.k.getClass();
                    aVar4 = yka.a.b;
                    bVar.D();
                    if (bVar.S) {
                        bVar.F(aVar4);
                    } else {
                        bVar.p();
                    }
                    hlh0.a(bVar, aivVarC19, yka.a.f);
                    hlh0.a(bVar, ne00VarS118, yka.a.e);
                    c1350a3 = yka.a.g;
                    if (bVar.S) {
                        n30.a(iHashCode5, bVar, iHashCode5, c1350a3);
                    } else {
                        n30.a(iHashCode5, bVar, iHashCode5, c1350a3);
                    }
                    hlh0.a(bVar, dVarC118, yka.a.d);
                    str = str10;
                    b bVar113 = bVar;
                    lkf0.b(str2, null, j58.f, 0L, null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar113, 196992, 0, 131034);
                    bVar = bVar113;
                    bVar.X(true);
                    b(0, bVar);
                    f160Var = f160Var9;
                    c0042a2 = c0042a4;
                    n54Var2 = n54Var12;
                } else {
                    c0042a4 = c0042a2;
                }
                objY6 = new Function0() { // from class: cec
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(str2);
                        return Unit.a;
                    }
                };
                bVar.r(objY6);
                d dVarD18 = androidx.compose.foundation.d.d(dVarB111, false, null, null, (Function0) objY6, 15);
                zM2 = bVar.M(str2);
                objY7 = bVar.y();
                if (zM2) {
                    objY7 = new Function1() { // from class: rdc
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            pb80 pb80Var = (pb80) obj;
                            pb80Var.getClass();
                            lb80.c(pb80Var, "key_" + str2);
                            return Unit.a;
                        }
                    };
                    bVar.r(objY7);
                } else {
                    objY7 = new Function1() { // from class: rdc
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            pb80 pb80Var = (pb80) obj;
                            pb80Var.getClass();
                            lb80.c(pb80Var, "key_" + str2);
                            return Unit.a;
                        }
                    };
                    bVar.r(objY7);
                }
                d dVarB113 = xa80.b(dVarD18, false, (Function1) objY7);
                String str11 = str;
                d dVarA19 = s3w.a(dVarB113, str11 + str2);
                n54 n54Var13 = n54Var2;
                aiv aivVarC110 = g75.c(n54Var13, false);
                iHashCode5 = Long.hashCode(bVar.m());
                ne00 ne00VarS119 = bVar.S();
                d dVarC119 = c.c(bVar, dVarA19);
                yka.k.getClass();
                aVar4 = yka.a.b;
                bVar.D();
                if (bVar.S) {
                    bVar.F(aVar4);
                } else {
                    bVar.p();
                }
                hlh0.a(bVar, aivVarC110, yka.a.f);
                hlh0.a(bVar, ne00VarS119, yka.a.e);
                c1350a3 = yka.a.g;
                if (bVar.S) {
                    n30.a(iHashCode5, bVar, iHashCode5, c1350a3);
                } else {
                    n30.a(iHashCode5, bVar, iHashCode5, c1350a3);
                }
                hlh0.a(bVar, dVarC119, yka.a.d);
                str = str11;
                b bVar114 = bVar;
                lkf0.b(str2, null, j58.f, 0L, null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar114, 196992, 0, 131034);
                bVar = bVar114;
                bVar.X(true);
                b(0, bVar);
                f160Var = f160Var9;
                c0042a2 = c0042a4;
                n54Var2 = n54Var13;
            }
            n54 n54Var14 = n54Var2;
            f160 f160Var10 = f160Var;
            c0042a3 = c0042a2;
            bVar.X(false);
            d dVarB114 = androidx.compose.foundation.a.b(j.c(f160Var10.a(1.5f, aVar10, true), 1.0f), r58.d(4284572001L), aVar11);
            if ((i4 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            objY2 = bVar.y();
            if (z) {
                objY2 = new sdc(function0, 0);
                bVar.r(objY2);
            } else {
                objY2 = new sdc(function0, 0);
                bVar.r(objY2);
            }
            d dVarD19 = androidx.compose.foundation.d.d(dVarB114, false, null, null, (Function0) objY2, 15);
            objY3 = bVar.y();
            if (objY3 == c0042a3) {
                objY3 = new tdc();
                bVar.r(objY3);
            }
            d dVarA110 = s3w.a(xa80.b(dVarD19, false, (Function1) objY3), "clear");
            aiv aivVarC111 = g75.c(n54Var14, false);
            iHashCode3 = Long.hashCode(bVar.m());
            ne00 ne00VarS1110 = bVar.S();
            d dVarC1110 = c.c(bVar, dVarA110);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar3);
            } else {
                bVar.p();
            }
            yka.a.b bVar115 = yka.a.f;
            hlh0.a(bVar, aivVarC111, bVar115);
            yka.a.d dVar7 = yka.a.e;
            hlh0.a(bVar, ne00VarS1110, dVar7);
            c1350a2 = yka.a.g;
            if (bVar.S) {
                n30.a(iHashCode3, bVar, iHashCode3, c1350a2);
            } else {
                n30.a(iHashCode3, bVar, iHashCode3, c1350a2);
            }
            yka.a.c cVar9 = yka.a.d;
            hlh0.a(bVar, dVarC1110, cVar9);
            op5 op5Var4 = op5.a;
            String strC4 = op5.c(op5Var4, pwo.e(R.string.clear_text_cms, bVar), "Clear");
            long j5 = j58.f;
            bVar2 = bVar;
            lkf0.b(strC4, null, j5, 0L, null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar2, 196992, 0, 131034);
            f30.a(bVar2, true, true, true);
            d dVarB115 = androidx.compose.foundation.a.b(j.i(f160Var10.a(2.0f, aVar10, true), 96.0f), c68.a(R.color.sh_keyBoard_done_btn_color, bVar2), aVar11);
            if ((i4 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            objY4 = bVar2.y();
            if (z2) {
                function5 = function3;
                objY4 = new vdc(function5, 0);
                bVar2.r(objY4);
            } else {
                function5 = function3;
                objY4 = new vdc(function5, 0);
                bVar2.r(objY4);
            }
            d dVarD110 = androidx.compose.foundation.d.d(dVarB115, false, null, null, (Function0) objY4, 15);
            objY5 = bVar2.y();
            if (objY5 == c0042a3) {
                objY5 = new wdc();
                bVar2.r(objY5);
            }
            d dVarA111 = s3w.a(xa80.b(dVarD110, false, (Function1) objY5), "done");
            aiv aivVarC112 = g75.c(n54Var14, false);
            iHashCode4 = Long.hashCode(bVar2.m());
            ne00 ne00VarS1111 = bVar2.S();
            d dVarC1111 = c.c(bVar2, dVarA111);
            bVar2.D();
            if (bVar2.S) {
                bVar2.F(aVar3);
            } else {
                bVar2.p();
            }
            hlh0.a(bVar2, aivVarC112, bVar115);
            hlh0.a(bVar2, ne00VarS1111, dVar7);
            if (bVar2.S) {
                n30.a(iHashCode4, bVar2, iHashCode4, c1350a2);
            } else {
                n30.a(iHashCode4, bVar2, iHashCode4, c1350a2);
            }
            hlh0.a(bVar2, dVarC1111, cVar9);
            wf1.a(op5.c(op5Var4, pwo.e(R.string.done_text_cms, bVar2), pwo.e(R.string.done_txt, bVar2)), null, imf0.b(((eah0) bVar2.O(gah0.a)).b, ((th60) bVar2.O(vh60.a)).Y, d2l.f(16), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777212), 0, d2l.f(10), null, 0, null, j5, bVar2, 100687872, 234);
            bVarI = bVar2;
            mx4.a(bVarI, true, true, true, true);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            function5 = function3;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function0<Unit> function6 = function5;
            eVarZ.d = new Function2(function0, function2, function6, function4, i, i2) { // from class: xdc
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ int f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    dec.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(int i, a aVar) {
        b bVarI = aVar.i(-130757976);
        if (bVarI.q(i & 1, i != 0)) {
            ute.a(j.c(j.w(d.a.b, 0.5f), 1.0f), 0.0f, r58.d(4288585374L), bVarI, 390, 2);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new udc();
        }
    }
}
