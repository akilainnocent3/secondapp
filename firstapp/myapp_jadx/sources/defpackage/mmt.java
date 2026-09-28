package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.compose.LottieAnimationSizeElement;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class mmt {

    public static final class a extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ d0b A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ Map<String, Typeface> D;
        public final /* synthetic */ b11 E;
        public final /* synthetic */ boolean F;
        public final /* synthetic */ int G;
        public final /* synthetic */ int H;
        public final /* synthetic */ int I;
        public final /* synthetic */ xmt a;
        public final /* synthetic */ Function0<Float> b;
        public final /* synthetic */ d c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ v750 v;
        public final /* synthetic */ boolean w;
        public final /* synthetic */ jot y;
        public final /* synthetic */ ht z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(xmt xmtVar, Function0<Float> function0, d dVar, boolean z, boolean z2, boolean z3, boolean z4, v750 v750Var, boolean z5, jot jotVar, ht htVar, d0b d0bVar, boolean z6, boolean z7, Map<String, ? extends Typeface> map, b11 b11Var, boolean z8, int i, int i2, int i3) {
            super(2);
            this.a = xmtVar;
            this.b = function0;
            this.c = dVar;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.i = z4;
            this.v = v750Var;
            this.w = z5;
            this.y = jotVar;
            this.z = htVar;
            this.A = d0bVar;
            this.B = z6;
            this.C = z7;
            this.D = map;
            this.E = b11Var;
            this.F = z8;
            this.G = i;
            this.H = i2;
            this.I = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int iA = qj40.a(this.G | 1);
            int iA2 = qj40.a(this.H);
            int i = this.I;
            mmt.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, aVar, iA, iA2, i);
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function1<tcf, Unit> {
        public final /* synthetic */ jot A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ boolean D;
        public final /* synthetic */ boolean E;
        public final /* synthetic */ boolean F;
        public final /* synthetic */ boolean G;
        public final /* synthetic */ Context H;
        public final /* synthetic */ Function0<Float> I;
        public final /* synthetic */ ytw<jot> J;
        public final /* synthetic */ Rect a;
        public final /* synthetic */ d0b b;
        public final /* synthetic */ ht c;
        public final /* synthetic */ Matrix d;
        public final /* synthetic */ iot e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ v750 v;
        public final /* synthetic */ b11 w;
        public final /* synthetic */ xmt y;
        public final /* synthetic */ Map<String, Typeface> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Rect rect, d0b d0bVar, ht htVar, Matrix matrix, iot iotVar, boolean z, boolean z2, v750 v750Var, b11 b11Var, xmt xmtVar, Map<String, ? extends Typeface> map, jot jotVar, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Context context, Function0<Float> function0, ytw<jot> ytwVar) {
            super(1);
            this.a = rect;
            this.b = d0bVar;
            this.c = htVar;
            this.d = matrix;
            this.e = iotVar;
            this.f = z;
            this.i = z2;
            this.v = v750Var;
            this.w = b11Var;
            this.y = xmtVar;
            this.z = map;
            this.A = jotVar;
            this.B = z3;
            this.C = z4;
            this.D = z5;
            this.E = z6;
            this.F = z7;
            this.G = z8;
            this.H = context;
            this.I = function0;
            this.J = ytwVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(tcf tcfVar) {
            tcf tcfVar2 = tcfVar;
            tcfVar2.getClass();
            lc6 lc6VarA = tcfVar2.F1().a();
            Rect rect = this.a;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(rect.height())) & 4294967295L) | (((long) Float.floatToRawIntBits(rect.width())) << 32);
            long jA = kc6.a(ycv.b(yw90.d(tcfVar2.d())), ycv.b(yw90.b(tcfVar2.d())));
            long jA2 = this.b.a(jFloatToRawIntBits, tcfVar2.d());
            float fD = yw90.d(jFloatToRawIntBits);
            int i = yy60.a;
            int i2 = (int) (jA2 >> 32);
            int i3 = (int) (jA2 & 4294967295L);
            long jA3 = this.c.a(kc6.a((int) (Float.intBitsToFloat(i2) * fD), (int) (Float.intBitsToFloat(i3) * yw90.b(jFloatToRawIntBits))), jA, tcfVar2.getLayoutDirection());
            Matrix matrix = this.d;
            matrix.reset();
            matrix.preTranslate((int) (jA3 >> 32), (int) (jA3 & 4294967295L));
            matrix.preScale(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
            iot iotVar = this.e;
            iotVar.h(this.f);
            iotVar.e = this.i;
            iotVar.L = this.v;
            iotVar.e();
            iotVar.b0 = this.w;
            iotVar.o(this.y);
            Map<String, Typeface> map = iotVar.z;
            Map<String, Typeface> map2 = this.z;
            if (map2 != map) {
                iotVar.z = map2;
                iotVar.invalidateSelf();
            }
            ytw<jot> ytwVar = this.J;
            jot value = ytwVar.getValue();
            jot jotVar = this.A;
            if (jotVar != value) {
                if (ytwVar.getValue() != null || jotVar != null) {
                    throw null;
                }
                ytwVar.setValue(jotVar);
            }
            boolean z = iotVar.H;
            boolean z2 = this.B;
            if (z != z2) {
                iotVar.H = z2;
                wma wmaVar = iotVar.E;
                if (wmaVar != null) {
                    wmaVar.s(z2);
                }
            }
            iotVar.I = this.C;
            iotVar.J = this.D;
            iotVar.C = this.E;
            boolean z3 = iotVar.D;
            boolean z4 = this.F;
            if (z4 != z3) {
                iotVar.D = z4;
                wma wmaVar2 = iotVar.E;
                if (wmaVar2 != null) {
                    wmaVar2.L = z4;
                }
                iotVar.invalidateSelf();
            }
            boolean z5 = iotVar.K;
            boolean z6 = this.G;
            if (z6 != z5) {
                iotVar.K = z6;
                iotVar.invalidateSelf();
            }
            Iterator<String> it = iot.i0.iterator();
            opu opuVarD = null;
            while (it.hasNext()) {
                opuVarD = iotVar.a.d(it.next());
                if (opuVarD != null) {
                    break;
                }
            }
            if (iotVar.b(this.H) || opuVarD == null) {
                iotVar.y(this.I.invoke().floatValue());
            } else {
                iotVar.y(opuVarD.b);
            }
            iotVar.setBounds(0, 0, rect.width(), rect.height());
            Canvas canvasC = i40.c(lc6VarA);
            eot eotVar = iotVar.f0;
            ThreadPoolExecutor threadPoolExecutor = iot.j0;
            bpt bptVar = iotVar.b;
            Semaphore semaphore = iotVar.c0;
            wma wmaVar3 = iotVar.E;
            xmt xmtVar = iotVar.a;
            if (wmaVar3 != null && xmtVar != null) {
                b11 b11Var = iotVar.b0;
                if (b11Var == null) {
                    b11Var = b11.a;
                }
                boolean z7 = b11Var == b11.b;
                if (z7) {
                    try {
                        semaphore.acquire();
                        if (iotVar.z()) {
                            iotVar.y(bptVar.d());
                        }
                    } catch (InterruptedException unused) {
                        if (z7) {
                            semaphore.release();
                            if (wmaVar3.K != bptVar.d()) {
                            }
                        }
                        return Unit.a;
                    } catch (Throwable th) {
                        if (z7) {
                            semaphore.release();
                            if (wmaVar3.K != bptVar.d()) {
                                threadPoolExecutor.execute(eotVar);
                            }
                        }
                        throw th;
                    }
                }
                boolean z8 = iotVar.e;
                int i4 = iotVar.F;
                boolean z9 = iotVar.M;
                if (z8) {
                    try {
                        if (z9) {
                            canvasC.save();
                            canvasC.concat(matrix);
                            iotVar.m(canvasC, wmaVar3);
                            canvasC.restore();
                        } else {
                            wmaVar3.j(canvasC, matrix, i4, null);
                        }
                    } catch (Throwable unused2) {
                        lgt.a.getClass();
                    }
                } else if (z9) {
                    canvasC.save();
                    canvasC.concat(matrix);
                    iotVar.m(canvasC, wmaVar3);
                    canvasC.restore();
                } else {
                    wmaVar3.j(canvasC, matrix, i4, null);
                }
                iotVar.a0 = false;
                if (z7) {
                    semaphore.release();
                    if (wmaVar3.K != bptVar.d()) {
                        threadPoolExecutor.execute(eotVar);
                    }
                }
            }
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ d0b A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ Map<String, Typeface> D;
        public final /* synthetic */ b11 E;
        public final /* synthetic */ boolean F;
        public final /* synthetic */ int G;
        public final /* synthetic */ int H;
        public final /* synthetic */ int I;
        public final /* synthetic */ xmt a;
        public final /* synthetic */ Function0<Float> b;
        public final /* synthetic */ d c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ v750 v;
        public final /* synthetic */ boolean w;
        public final /* synthetic */ jot y;
        public final /* synthetic */ ht z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(xmt xmtVar, Function0<Float> function0, d dVar, boolean z, boolean z2, boolean z3, boolean z4, v750 v750Var, boolean z5, jot jotVar, ht htVar, d0b d0bVar, boolean z6, boolean z7, Map<String, ? extends Typeface> map, b11 b11Var, boolean z8, int i, int i2, int i3) {
            super(2);
            this.a = xmtVar;
            this.b = function0;
            this.c = dVar;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.i = z4;
            this.v = v750Var;
            this.w = z5;
            this.y = jotVar;
            this.z = htVar;
            this.A = d0bVar;
            this.B = z6;
            this.C = z7;
            this.D = map;
            this.E = b11Var;
            this.F = z8;
            this.G = i;
            this.H = i2;
            this.I = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int iA = qj40.a(this.G | 1);
            int iA2 = qj40.a(this.H);
            int i = this.I;
            mmt.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, aVar, iA, iA2, i);
            return Unit.a;
        }
    }

    public static final void a(xmt xmtVar, d dVar, boolean z, boolean z2, int i, d0b d0bVar, androidx.compose.runtime.a aVar, int i2, int i3, int i4) {
        androidx.compose.runtime.b bVarI = aVar.i(1331239405);
        boolean z3 = (i4 & 4) != 0 ? true : z;
        boolean z4 = (i4 & 8) != 0 ? true : z2;
        d0b d0bVar2 = (i4 & 65536) != 0 ? d0b.a.b : d0bVar;
        boolean z5 = z3;
        boolean z6 = z4;
        fmt fmtVarA = bf0.a(xmtVar, z5, z6, 1.0f, i, bVarI, 896);
        bVarI.x(185157769);
        boolean zM = bVarI.M(fmtVarA);
        Object objY = bVarI.y();
        if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
            objY = new nmt(fmtVarA);
            bVarI.r(objY);
        }
        bVarI.X(false);
        b(xmtVar, (Function0) objY, dVar, false, false, true, false, v750.a, false, null, ht.a.e, d0bVar2, true, false, null, b11.a, false, bVarI, ((i2 << 3) & 896) | 1073741832, 32768 | ((i3 >> 15) & 112), 0);
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new omt(xmtVar, dVar, z5, z6, i, d0bVar2, i2, i3, i4);
        }
    }

    public static final void b(xmt xmtVar, Function0<Float> function0, d dVar, boolean z, boolean z2, boolean z3, boolean z4, v750 v750Var, boolean z5, jot jotVar, ht htVar, d0b d0bVar, boolean z6, boolean z7, Map<String, ? extends Typeface> map, b11 b11Var, boolean z8, androidx.compose.runtime.a aVar, int i, int i2, int i3) {
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(382909894);
        d dVar2 = (i3 & 4) != 0 ? d.a.b : dVar;
        boolean z9 = (i3 & 8) != 0 ? false : z;
        boolean z10 = (i3 & 16) != 0 ? false : z2;
        boolean z11 = (i3 & 32) != 0 ? true : z3;
        boolean z12 = (i3 & 64) != 0 ? false : z4;
        v750 v750Var2 = (i3 & 128) != 0 ? v750.a : v750Var;
        boolean z13 = (i3 & 256) != 0 ? false : z5;
        jot jotVar2 = (i3 & 512) != 0 ? null : jotVar;
        ht htVar2 = (i3 & 1024) != 0 ? ht.a.e : htVar;
        d0b d0bVar2 = (i3 & 2048) != 0 ? d0b.a.b : d0bVar;
        boolean z14 = (i3 & 4096) != 0 ? true : z6;
        boolean z15 = (i3 & 8192) != 0 ? false : z7;
        Map<String, ? extends Typeface> map2 = (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : map;
        b11 b11Var2 = (32768 & i3) != 0 ? b11.a : b11Var;
        boolean z16 = (i3 & 65536) != 0 ? false : z8;
        bVarI.x(185152185);
        Object objY = bVarI.y();
        androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
        if (objY == c0042a) {
            objY = new iot();
            bVarI.r(objY);
        }
        iot iotVar = (iot) objY;
        bVarI.X(false);
        bVarI.x(185152232);
        Object objY2 = bVarI.y();
        if (objY2 == c0042a) {
            objY2 = new Matrix();
            bVarI.r(objY2);
        }
        Matrix matrix = (Matrix) objY2;
        bVarI.X(false);
        bVarI.x(185152312);
        boolean zM = bVarI.M(xmtVar);
        Object objY3 = bVarI.y();
        if (zM || objY3 == c0042a) {
            objY3 = m.b(null);
            bVarI.r(objY3);
        }
        ytw ytwVar = (ytw) objY3;
        bVarI.X(false);
        bVarI.x(185152364);
        if (xmtVar == null || xmtVar.b() == 0.0f) {
            boolean z17 = z13;
            b11 b11Var3 = b11Var2;
            boolean z18 = z12;
            v750 v750Var3 = v750Var2;
            ht htVar3 = htVar2;
            boolean z19 = z10;
            boolean z20 = z15;
            jot jotVar3 = jotVar2;
            d0b d0bVar3 = d0bVar2;
            boolean z21 = z14;
            boolean z22 = z16;
            g75.a(dVar2, bVarI, (i >> 6) & 14);
            bVarI.X(false);
            e eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new a(xmtVar, function0, dVar2, z9, z19, z11, z18, v750Var3, z17, jotVar3, htVar3, d0bVar3, z21, z20, map2, b11Var3, z22, i, i2, i3);
                return;
            }
            return;
        }
        bVarI.X(false);
        ht htVar4 = htVar2;
        jot jotVar4 = jotVar2;
        Rect rect = xmtVar.k;
        Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
        int iWidth = rect.width();
        int iHeight = rect.height();
        dVar2.getClass();
        d dVarN = dVar2.n(new LottieAnimationSizeElement(iWidth, iHeight));
        d0b d0bVar4 = d0bVar2;
        d dVar3 = dVar2;
        boolean z23 = z9;
        Map<String, ? extends Typeface> map3 = map2;
        boolean z24 = z11;
        boolean z25 = z12;
        v750 v750Var4 = v750Var2;
        b11 b11Var4 = b11Var2;
        boolean z26 = z16;
        b bVar = new b(rect, d0bVar4, htVar4, matrix, iotVar, z25, z26, v750Var4, b11Var4, xmtVar, map3, jotVar4, z23, z10, z24, z13, z14, z15, context, function0, ytwVar);
        boolean z27 = z13;
        boolean z28 = z10;
        boolean z29 = z14;
        boolean z30 = z15;
        rxo.b(dVarN, bVar, bVarI, 0);
        e eVarZ2 = bVarI.Z();
        if (eVarZ2 != null) {
            eVarZ2.d = new c(xmtVar, function0, dVar3, z23, z28, z24, z25, v750Var4, z27, jotVar4, htVar4, d0bVar4, z29, z30, map3, b11Var4, z26, i, i2, i3);
        }
    }
}
