package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.luckywheel.LuckyWheelColor;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class j9u {

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LuckyWheelColor.values().length];
            try {
                iArr[LuckyWheelColor.BLACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LuckyWheelColor.WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LuckyWheelColor.RED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LuckyWheelColor.GREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LuckyWheelColor.YELLOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LuckyWheelColor.BLUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    public static final void a(final d dVar, final q9u q9uVar, final ccb0 ccb0Var, final p9u p9uVar, final Function0 function0, androidx.compose.runtime.a aVar, final int i) {
        Object obj;
        wd0 wd0Var;
        v1b v1bVar;
        c8n c8nVar;
        ccb0 ccb0Var2;
        d dVar2;
        ytw ytwVar;
        List list;
        osw oswVar;
        q9uVar.getClass();
        List<p9u> list2 = q9uVar.a;
        ccb0Var.getClass();
        function0.getClass();
        b bVarI = aVar.i(119912915);
        int i2 = i | (bVarI.A(q9uVar) ? 32 : 16) | (bVarI.d(ccb0Var.ordinal()) ? 256 : 128) | (bVarI.M(p9uVar) ? 2048 : 1024) | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = ee0.a(0.0f);
                bVarI.r(objY);
            }
            wd0 wd0Var2 = (wd0) objY;
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            final mmd mmdVar = (mmd) bVarI.O(kna.h);
            final float fC1 = mmdVar.C1(fw20.a(R.dimen.lw_sector_border_width, bVarI));
            final float fA = fw20.a(2131166286, bVarI);
            final float fC2 = mmdVar.C1(fw20.a(R.dimen.lw_wheel_draw_text_width, bVarI));
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.TRUE);
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = k.a(0);
                bVarI.r(objY3);
            }
            osw oswVar2 = (osw) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                bVarI.r(options);
                obj = options;
            } else {
                obj = objY4;
            }
            BitmapFactory.Options options2 = (BitmapFactory.Options) obj;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                long j = s8u.a;
                objY5 = new hfs(kotlin.collections.b.k(new j58(j), new j58(j), new j58(s8u.b), new j58(s8u.c), new j58(j), new j58(j), new j58(j), new j58(j)), null, 0L, 9187343241974906880L, 1);
                bVarI.r(objY5);
            }
            final ya5 ya5Var = (ya5) objY5;
            olf0 olf0VarA = plf0.a(bVarI);
            Object objY6 = bVarI.y();
            if (objY6 == c0042a) {
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_dot_yellow);
                bitmapDecodeResource.getClass();
                t70 t70Var = new t70(bitmapDecodeResource);
                bVarI.r(t70Var);
                objY6 = t70Var;
            }
            c8n c8nVar2 = (c8n) objY6;
            Object objY7 = bVarI.y();
            if (objY7 == c0042a) {
                Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_dot_red, options2);
                bitmapDecodeResource2.getClass();
                t70 t70Var2 = new t70(bitmapDecodeResource2);
                bVarI.r(t70Var2);
                objY7 = t70Var2;
            }
            final c8n c8nVar3 = (c8n) objY7;
            Object objY8 = bVarI.y();
            if (objY8 == c0042a) {
                objY8 = new m6a0();
                bVarI.r(objY8);
            }
            final m6a0 m6a0Var = (m6a0) objY8;
            boolean zM = bVarI.M(list2);
            Object objY9 = bVarI.y();
            if (zM || objY9 == c0042a) {
                ArrayList arrayList = new ArrayList(l48.r(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((p9u) it.next()).a);
                }
                objY9 = CollectionsKt.A0(CollectionsKt.D0(arrayList));
                bVarI.r(objY9);
            }
            List list3 = (List) objY9;
            Object objY10 = bVarI.y();
            if (objY10 == c0042a) {
                objY10 = new f9u(oswVar2, ytwVar2, null);
                bVarI.r(objY10);
            }
            xvf.e(bVarI, list3, (Function2) objY10);
            bVarI.N(-727732384);
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                LuckyWheelColor luckyWheelColor = (LuckyWheelColor) it2.next();
                Iterator it3 = it2;
                olf0 olf0Var = olf0VarA;
                ytw ytwVarC = wyh.c(nw90.a(luckyWheelColor.getPath(), bVarI).K, bVarI, 0, 7);
                b01.b bVar = (b01.b) ytwVarC.getValue();
                boolean zD = bVarI.d(luckyWheelColor.ordinal()) | bVarI.M(ytwVarC) | bVarI.A(list3);
                Object objY11 = bVarI.y();
                if (zD || objY11 == c0042a) {
                    ytwVar = ytwVar2;
                    list = list3;
                    oswVar = oswVar2;
                    objY11 = new g9u(m6a0Var, luckyWheelColor, list, ytwVarC, oswVar, ytwVar, null);
                    bVarI.r(objY11);
                } else {
                    ytwVar = ytwVar2;
                    list = list3;
                    oswVar = oswVar2;
                }
                xvf.e(bVarI, bVar, (Function2) objY11);
                list3 = list;
                oswVar2 = oswVar;
                ytwVar2 = ytwVar;
                it2 = it3;
                olf0VarA = olf0Var;
            }
            final olf0 olf0Var2 = olf0VarA;
            final ytw ytwVar3 = ytwVar2;
            bVarI.X(false);
            int i3 = i2 & 896;
            boolean zA = (i3 == 256) | bVarI.A(wd0Var2) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
            Object objY12 = bVarI.y();
            if (zA || objY12 == c0042a) {
                wd0Var = wd0Var2;
                v1bVar = null;
                c8nVar = c8nVar2;
                ccb0Var2 = ccb0Var;
                h9u h9uVar = new h9u(ccb0Var2, wd0Var, p9uVar, function0, null);
                bVarI.r(h9uVar);
                objY12 = h9uVar;
            } else {
                ccb0Var2 = ccb0Var;
                v1bVar = null;
                c8nVar = c8nVar2;
                wd0Var = wd0Var2;
            }
            xvf.e(bVarI, ccb0Var2, (Function2) objY12);
            boolean zA2 = (i3 == 256) | bVarI.A(wd0Var);
            Object objY13 = bVarI.y();
            if (zA2 || objY13 == c0042a) {
                objY13 = new i9u(ccb0Var2, wd0Var, v1bVar);
                bVarI.r(objY13);
            }
            xvf.e(bVarI, ccb0Var2, (Function2) objY13);
            d dVarA = c.a(dVar, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            d dVarE = j.e(d.a.b, 1.0f);
            boolean zA3 = bVarI.A(wd0Var) | ((i2 & 112) == 32 || bVarI.A(q9uVar)) | bVarI.c(fC1) | bVarI.M(mmdVar) | bVarI.c(fA) | bVarI.c(fC2) | bVarI.M(olf0Var2) | bVarI.A(c8nVar) | bVarI.A(c8nVar3);
            Object objY14 = bVarI.y();
            if (zA3 || objY14 == c0042a) {
                dVar2 = dVarE;
                final wd0 wd0Var3 = wd0Var;
                final c8n c8nVar4 = c8nVar;
                Function1 function1 = new Function1() { // from class: d9u
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) throws Throwable {
                        qc6.b bVar2;
                        long j2;
                        long j3;
                        ya5 ya5Var2;
                        long j4;
                        qc6.b bVar3;
                        ya5 soa0Var;
                        float f;
                        q9u q9uVar2 = q9uVar;
                        wd0 wd0Var4 = wd0Var3;
                        m6a0 m6a0Var2 = m6a0Var;
                        float f2 = fC1;
                        ytw ytwVar4 = ytwVar3;
                        tcf tcfVar = (tcf) obj2;
                        tcfVar.getClass();
                        float fC = (yw90.c(tcfVar.d()) / 2.0f) * 0.95f;
                        long jR1 = tcfVar.R1();
                        qc6.b bVarF1 = tcfVar.F1();
                        long jD = bVarF1.d();
                        bVarF1.a().p();
                        try {
                            rc6 rc6Var = bVarF1.a;
                            rc6Var.f(((Number) wd0Var4.d()).floatValue(), jR1);
                            float f3 = q9uVar2.b;
                            List<p9u> list4 = q9uVar2.a;
                            rc6Var.f(-((f3 / 2.0f) + 90.0f), jR1);
                            Iterator<T> it4 = list4.iterator();
                            float f4 = 0.0f;
                            while (true) {
                                boolean zHasNext = it4.hasNext();
                                j3 = jR1;
                                ya5Var2 = ya5Var;
                                if (!zHasNext) {
                                    break;
                                }
                                p9u p9uVar2 = (p9u) it4.next();
                                if (((Boolean) ytwVar4.getValue()).booleanValue()) {
                                    try {
                                        bVar3 = bVarF1;
                                        f = f2;
                                        try {
                                            soa0Var = new soa0(j9u.b(p9uVar2.a));
                                        } catch (Throwable th) {
                                            th = th;
                                            bVar2 = bVar3;
                                            j2 = jD;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bVar3 = bVarF1;
                                    }
                                } else {
                                    bVar3 = bVarF1;
                                    f = f2;
                                    soa0Var = (ya5) m6a0Var2.get(p9uVar2.a);
                                    if (soa0Var == null) {
                                        soa0Var = new soa0(j9u.b(p9uVar2.a));
                                    }
                                }
                                float f5 = f3;
                                List<p9u> list5 = list4;
                                float f6 = f4;
                                tcf.P0(tcfVar, soa0Var, f6, q9uVar2.b, true, 0L, 0L, null, 1008);
                                float f7 = q9uVar2.b;
                                wd0 wd0Var5 = wd0Var4;
                                f2 = f;
                                q9u q9uVar3 = q9uVar2;
                                j2 = jD;
                                qc6.b bVar4 = bVar3;
                                try {
                                    bVar2 = bVar4;
                                    try {
                                        tcf.P0(tcfVar, ya5Var2, f6, f7, true, 0L, 0L, new yae0(f2, 0.0f, 0, 0, null, 30), 880);
                                        f4 = f6 + f5;
                                        jD = j2;
                                        bVarF1 = bVar2;
                                        jR1 = j3;
                                        q9uVar2 = q9uVar3;
                                        f3 = f5;
                                        list4 = list5;
                                        wd0Var4 = wd0Var5;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    bVar2 = bVar4;
                                }
                                j2 = jD;
                                hrh.a(bVar2, j2);
                                throw th;
                            }
                            wd0 wd0Var6 = wd0Var4;
                            float f8 = f3;
                            List<p9u> list6 = list4;
                            qc6.b bVar5 = bVarF1;
                            bVar5.a().f();
                            bVar5.h(jD);
                            long j5 = 4294967295L;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) / 4.0f;
                            Iterator it5 = list6.iterator();
                            float f9 = -90.0f;
                            while (it5.hasNext()) {
                                p9u p9uVar3 = (p9u) it5.next();
                                if (p9uVar3.b > 0) {
                                    long jN = mmdVar.N(fA);
                                    yae0 yae0Var = new yae0(fC2, 0.0f, 0, 0, null, 30);
                                    int i4 = j9u.a.a[p9uVar3.a.ordinal()];
                                    ukf0 ukf0VarA = olf0.a(olf0Var2, String.valueOf(p9uVar3.b), new imf0(i4 != 1 ? i4 != 2 ? new soa0(j58.f) : new soa0(j58.b) : ya5Var2, jN, null, null, null, yae0Var, 0L, 33521658), 0L, 1020);
                                    long j6 = ukf0VarA.c;
                                    float fFloatValue = ((Number) wd0Var6.d()).floatValue() + f9;
                                    j4 = j5;
                                    float f10 = ((int) (j6 >> 32)) / 2.0f;
                                    float f11 = f10 + fIntBitsToFloat;
                                    double radians = (float) Math.toRadians(fFloatValue);
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((((float) Math.cos(radians)) * f11) + Float.intBitsToFloat((int) (j3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits((f11 * ((float) Math.sin(radians))) + Float.intBitsToFloat((int) (j3 & j4)))) & j4);
                                    qc6.b bVarF2 = tcfVar.F1();
                                    long jD2 = bVarF2.d();
                                    bVarF2.a().p();
                                    try {
                                        bVarF2.a.f(fFloatValue, jFloatToRawIntBits);
                                        rlf0.a(tcfVar, ukf0VarA, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) - f10)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jFloatToRawIntBits & j4)) - (((int) (j6 & j4)) / 2.0f))) & j4));
                                        hrh.a(bVarF2, jD2);
                                    } catch (Throwable th5) {
                                        hrh.a(bVarF2, jD2);
                                        throw th5;
                                    }
                                } else {
                                    j4 = j5;
                                }
                                f9 += f8;
                                fIntBitsToFloat = fIntBitsToFloat;
                                it5 = it5;
                                j5 = j4;
                            }
                            long j7 = j5;
                            float f12 = fC * 1.02f;
                            int size = list6.size();
                            float f13 = -90.0f;
                            for (int i5 = 0; i5 < size; i5++) {
                                float fFloatValue2 = ((Number) wd0Var6.d()).floatValue() + f13;
                                c8n c8nVar5 = i5 % 2 == 0 ? c8nVar4 : c8nVar3;
                                double d = fFloatValue2;
                                tcf.b1(tcfVar, c8nVar5, (((long) Float.floatToRawIntBits(((((float) Math.cos(Math.toRadians(d))) * f12) + Float.intBitsToFloat((int) (j3 >> 32))) - (c8nVar5.c() / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(((((float) Math.sin(Math.toRadians(d))) * f12) + Float.intBitsToFloat((int) (j3 & j7))) - (c8nVar5.b() / 2.0f))) & j7), 0.0f, null, 0, 60);
                                f13 += f8;
                            }
                            return Unit.a;
                        } catch (Throwable th6) {
                            th = th6;
                            bVar2 = bVarF1;
                        }
                    }
                };
                bVarI.r(function1);
                objY14 = function1;
            } else {
                dVar2 = dVarE;
            }
            rxo.b(dVar2, (Function1) objY14, bVarI, 6);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(q9uVar, ccb0Var, p9uVar, function0, i) { // from class: e9u
                public final /* synthetic */ q9u b;
                public final /* synthetic */ ccb0 c;
                public final /* synthetic */ p9u d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(71);
                    j9u.a(this.a, this.b, this.c, this.d, this.e, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final long b(LuckyWheelColor luckyWheelColor) {
        switch (a.a[luckyWheelColor.ordinal()]) {
            case 1:
                return s8u.d;
            case 2:
                return s8u.i;
            case 3:
                return s8u.h;
            case 4:
                return s8u.f;
            case 5:
                return s8u.g;
            case 6:
                return s8u.e;
            default:
                uhc.a();
                return 0L;
        }
    }
}
