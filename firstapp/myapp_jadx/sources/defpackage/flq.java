package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class flq {
    public static final void a(final boolean z, final String str, final long j, final long j2, final long j3, final int i, final long j4, final float f, final float f2, a aVar, final int i2) {
        b bVar;
        float fSqrt;
        Float fValueOf;
        b bVarI = aVar.i(-1398930778);
        int i3 = i2 | (bVarI.b(z) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.e(j) ? 256 : 128) | (bVarI.e(j2) ? 2048 : 1024) | (bVarI.e(j3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.d(i) ? 131072 : 65536) | (bVarI.e(j4) ? 1048576 : 524288) | (bVarI.c(f) ? 8388608 : 4194304) | (bVarI.c(f2) ? 67108864 : 33554432);
        if (bVarI.q(i3 & 1, (i3 & 38347923) != 38347922)) {
            qyd0 qyd0Var = kna.h;
            mmd mmdVar = (mmd) bVarI.O(qyd0Var);
            boolean zM = bVarI.M(mmdVar);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new rkm(mmdVar.C1(10.0f), mmdVar.C1(16.0f), mmdVar.C1(8.0f), mmdVar.C1(4.0f), mmdVar.C1(40.0f), mmdVar.C1(1.0f), mmdVar.C1(32.0f), mmdVar.C1(4.0f), mmdVar.C1(8.0f));
                bVarI.r(objY);
            }
            final rkm rkmVar = (rkm) objY;
            int i4 = i3 & 29360128;
            boolean zM2 = ((i3 & 14) == 4) | (i4 == 8388608) | ((i3 & 234881024) == 67108864) | bVarI.M(rkmVar);
            Object objY2 = bVarI.y();
            if (zM2 || objY2 == c0042a) {
                if (z) {
                    fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
                } else {
                    fSqrt = rkmVar.a;
                }
                objY2 = Float.valueOf(fSqrt);
                bVarI.r(objY2);
            }
            final twd0 twd0VarB = xe0.b(((Number) objY2).floatValue(), yi0.d(1.0f, 200.0f, null, 4), null, null, bVarI, 48, 28);
            final twd0 twd0VarA = hw90.a(z ? j2 : j, yi0.d(1.0f, 200.0f, null, 4), null, bVarI, 48, 12);
            b bVar2 = bVarI;
            imf0 imf0Var = ((ijb0) bVar2.O(kjb0.a)).n;
            mmd mmdVar2 = (mmd) bVar2.O(qyd0Var);
            f8i.a aVar2 = (f8i.a) bVar2.O(kna.k);
            boolean zM3 = bVar2.M(imf0Var) | bVar2.M(mmdVar2) | bVar2.M(aVar2);
            Object objY3 = bVar2.y();
            Object obj = objY3;
            if (zM3 || objY3 == c0042a) {
                TextPaint textPaint = new TextPaint();
                textPaint.setAntiAlias(true);
                long jC = imf0Var.c();
                ora0 ora0Var = imf0Var.a;
                if (jC != 16) {
                    textPaint.setColor(r58.l(imf0Var.c()));
                }
                long j5 = ora0Var.b;
                long j6 = ora0Var.h;
                if (omf0.e(j5)) {
                    textPaint.setTextSize(mmdVar2.D0(j5));
                }
                f8i f8iVar = ora0Var.f;
                t9i t9iVar = ora0Var.c;
                if (t9iVar == null) {
                    t9iVar = t9i.B;
                }
                t9i t9iVar2 = t9iVar;
                n9i n9iVar = ora0Var.d;
                Object value = f8i.a.a(aVar2, f8iVar, t9iVar2, n9iVar != null ? n9iVar.a : 0, 0, 8).getValue();
                value.getClass();
                textPaint.setTypeface((Typeface) value);
                if (omf0.e(j6) && omf0.e(j5) && omf0.c(j5) > 0.0f) {
                    textPaint.setLetterSpacing(omf0.c(j6) / omf0.c(j5));
                }
                ix80 ix80Var = ora0Var.n;
                if (ix80Var != null) {
                    long j7 = ix80Var.b;
                    textPaint.setShadowLayer(ix80Var.c, Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), r58.l(ix80Var.a));
                }
                bVar2.r(textPaint);
                obj = textPaint;
            }
            final TextPaint textPaint2 = (TextPaint) obj;
            qyd0 qyd0Var2 = oib0.a;
            long j8 = ((lib0) bVar2.O(qyd0Var2)).o;
            final long j9 = ((lib0) bVar2.O(qyd0Var2)).A;
            long j10 = ((lib0) bVar2.O(qyd0Var2)).o;
            long jC2 = j58.c(0.2f, ((lib0) bVar2.O(qyd0Var2)).o);
            final int iL = r58.l(j3);
            final int iL2 = r58.l(j8);
            int iL3 = r58.l(j10);
            int iL4 = r58.l(j4);
            int iL5 = r58.l(jC2);
            int i5 = (i3 >> 15) & 14;
            final Drawable drawableC = c(i, iL4, i5, bVar2);
            final Drawable drawableC2 = c(i, iL5, i5, bVar2);
            final Drawable drawableC3 = c(i, iL3, i5, bVar2);
            final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(f2 / 2.0f)) & 4294967295L);
            float fFloatValue = ((Number) twd0VarB.getValue()).floatValue() * 2.0f;
            float f3 = rkmVar.c;
            float f4 = rkmVar.e;
            float f5 = rkmVar.b;
            float fMin = Math.min(fFloatValue - f3, f5);
            if (fMin < 0.0f) {
                fMin = 0.0f;
            }
            final float f6 = (f5 - fMin) + rkmVar.d;
            boolean zC = (i4 == 8388608) | bVar2.c(f4);
            Object objY4 = bVar2.y();
            if (zC || objY4 == c0042a) {
                int i6 = (int) (f - f4);
                if (i6 < 1) {
                    i6 = 1;
                }
                objY4 = Integer.valueOf(i6);
                bVar2.r(objY4);
            }
            int iIntValue = ((Number) objY4).intValue();
            int i7 = i3 >> 3;
            boolean zM4 = ((((i7 & 14) ^ 6) > 4 && bVar2.M(str)) || (i7 & 6) == 4) | bVar2.M(textPaint2) | bVar2.d(iIntValue);
            Object objY5 = bVar2.y();
            if (zM4 || objY5 == c0042a) {
                StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint2, iIntValue).setAlignment(Layout.Alignment.ALIGN_NORMAL).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).build();
                staticLayoutBuild.getClass();
                Iterator<Integer> it = f.n(0, staticLayoutBuild.getLineCount()).iterator();
                mwo mwoVar = (mwo) it;
                if (mwoVar.c) {
                    zvo zvoVar = (zvo) it;
                    float lineWidth = staticLayoutBuild.getLineWidth(zvoVar.nextInt());
                    while (mwoVar.c) {
                        lineWidth = Math.max(lineWidth, staticLayoutBuild.getLineWidth(zvoVar.nextInt()));
                    }
                    fValueOf = Float.valueOf(lineWidth);
                } else {
                    fValueOf = null;
                }
                objY5 = new xex(staticLayoutBuild, fValueOf != null ? fValueOf.floatValue() : 0.0f);
                bVar2.r(objY5);
            }
            final xex xexVar = (xex) objY5;
            Object objY6 = bVar2.y();
            if (objY6 == c0042a) {
                objY6 = j060.b(50);
                bVar2.r(objY6);
            }
            i060 i060Var = (i060) objY6;
            Object objY7 = bVar2.y();
            if (objY7 == c0042a) {
                objY7 = m90.a();
                bVar2.r(objY7);
            }
            final bxz bxzVar = (bxz) objY7;
            Object objY8 = bVar2.y();
            if (objY8 == c0042a) {
                objY8 = m90.a();
                bVar2.r(objY8);
            }
            final bxz bxzVar2 = (bxz) objY8;
            Object objY9 = bVar2.y();
            if (objY9 == c0042a) {
                objY9 = c90.a();
                bVar2.r(objY9);
            }
            final zqz zqzVar = (zqz) objY9;
            d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), ((lib0) bVar2.O(oib0.a)).n0, i060Var);
            boolean zA = bVar2.A(xexVar) | bVar2.c(fMin) | bVar2.c(f6) | bVar2.e(jFloatToRawIntBits) | bVar2.A(bxzVar) | bVar2.M(twd0VarB) | bVar2.M(rkmVar) | bVar2.A(bxzVar2) | bVar2.A(zqzVar) | bVar2.e(j9) | bVar2.M(twd0VarA) | bVar2.A(textPaint2) | bVar2.A(drawableC) | bVar2.A(drawableC2) | bVar2.d(iL) | bVar2.d(iL2) | bVar2.A(drawableC3);
            Object objY10 = bVar2.y();
            if (zA || objY10 == c0042a) {
                final float f7 = fMin;
                objY10 = new Function1() { // from class: dlq
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v1, types: [qc6$b] */
                    /* JADX WARN: Type inference failed for: r3v3, types: [bxz] */
                    /* JADX WARN: Type inference failed for: r3v4 */
                    /* JADX WARN: Type inference failed for: r8v12, types: [android.graphics.drawable.Drawable] */
                    /* JADX WARN: Type inference failed for: r8v14, types: [lc6] */
                    /* JADX WARN: Type inference failed for: r8v17, types: [android.graphics.drawable.Drawable] */
                    /* JADX WARN: Type inference failed for: r8v8, types: [lc6] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) throws Throwable {
                        long jA;
                        Canvas canvas;
                        rkm rkmVar2 = rkmVar;
                        float f8 = rkmVar2.i;
                        zqz zqzVar2 = zqzVar;
                        long j11 = j9;
                        twd0 twd0Var = twd0VarA;
                        int i8 = iL;
                        TextPaint textPaint3 = textPaint2;
                        int i9 = iL2;
                        tcf tcfVar = (tcf) obj2;
                        tcfVar.getClass();
                        xex xexVar2 = xexVar;
                        StaticLayout staticLayout = xexVar2.a;
                        float f9 = f7;
                        float f10 = f6;
                        float f11 = f9 + f10 + xexVar2.b;
                        float fMax = Math.max(f9, staticLayout.getHeight());
                        long j12 = jFloatToRawIntBits;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) - (f11 / 2.0f);
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L)) - (fMax / 2.0f);
                        float fA = g70.a(fMax, f9, 2.0f, fIntBitsToFloat2);
                        float f12 = f9 / 2.0f;
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat + f12)) << 32) | (((long) Float.floatToRawIntBits(f12 + fA)) & 4294967295L);
                        float f13 = fIntBitsToFloat + f9;
                        float f14 = f10 + f13;
                        bxz bxzVar3 = bxzVar;
                        bxzVar3.reset();
                        twd0 twd0Var2 = twd0VarB;
                        bxzVar3.n(pk40.a(((Number) twd0Var2.getValue()).floatValue(), jFloatToRawIntBits2), bxz.a.a);
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                        float f15 = rkmVar2.f;
                        float f16 = f15 / 2.0f;
                        float f17 = fIntBitsToFloat4 - f15;
                        float f18 = f17 / 2.0f;
                        float f19 = rkmVar2.g;
                        float f20 = fIntBitsToFloat3 - (f19 - rkmVar2.h);
                        bxz bxzVar4 = bxzVar2;
                        bxzVar4.reset();
                        float f21 = fIntBitsToFloat4 / 2.0f;
                        float f22 = f17;
                        bxz.s(bxzVar4, bys.d(0.0f, 0.0f, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f21)) << 32) | (((long) Float.floatToRawIntBits(f21)) & 4294967295L)));
                        lc6 lc6VarA = tcfVar.F1().a();
                        Canvas canvasC = i40.c(lc6VarA);
                        try {
                            try {
                                lc6VarA.s(pk40.b(0L, tcfVar.d()), zqzVar2);
                                qc6.b bVarF1 = tcfVar.F1();
                                long jD = bVarF1.d();
                                bVarF1.a().p();
                                try {
                                    bVarF1.a.a(bxzVar4, 1);
                                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f16)) & 4294967295L) | (Float.floatToRawIntBits(f16) << 32);
                                    float f23 = fIntBitsToFloat3 - f15;
                                    if (f23 < 0.0f) {
                                        f23 = 0.0f;
                                    }
                                    if (f22 < 0.0f) {
                                        f22 = 0.0f;
                                    }
                                    try {
                                        bVarF1 = bxzVar3;
                                        try {
                                            tcf.d1(tcfVar, j11, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f23)) << 32) | (((long) Float.floatToRawIntBits(f22)) & 4294967295L), (((long) Float.floatToRawIntBits(f18)) << 32) | (((long) Float.floatToRawIntBits(f18)) & 4294967295L), new yae0(f15, 0.0f, 0, 0, null, 30), 0.0f, 224);
                                            tcf.n0(tcfVar, ((j58) twd0Var.getValue()).a, ((Number) twd0Var2.getValue()).floatValue(), jFloatToRawIntBits2, 0.0f, null, 120);
                                            qc6.b bVarF2 = tcfVar.F1();
                                            long jD2 = bVarF2.d();
                                            jA = bVarF2.a();
                                            jA.p();
                                            try {
                                                try {
                                                    bVarF2.a.a(bVarF1, 0);
                                                    jA = drawableC;
                                                    if (jA != 0) {
                                                        jA.setBounds((int) f20, (int) f8, (int) (f20 + f19), (int) (f8 + f19));
                                                        canvas = canvasC;
                                                        jA.draw(canvas);
                                                    } else {
                                                        canvas = canvasC;
                                                    }
                                                    bVarF2.a().f();
                                                    bVarF2.h(jD2);
                                                    qc6.b bVarF3 = tcfVar.F1();
                                                    long jD3 = bVarF3.d();
                                                    jA = bVarF3.a();
                                                    jA.p();
                                                    try {
                                                        bVarF3.a.a(bVarF1, 1);
                                                        jA = drawableC2;
                                                        if (jA != 0) {
                                                            jA.setBounds((int) f20, (int) f8, (int) (f20 + f19), (int) (f8 + f19));
                                                            jA.draw(canvas);
                                                        }
                                                        bVarF3.a().f();
                                                        bVarF3.h(jD3);
                                                        qc6.b bVarF4 = tcfVar.F1();
                                                        long jD4 = bVarF4.d();
                                                        bVarF4.a().p();
                                                        try {
                                                            bVarF4.a.a(bVarF1, 0);
                                                            textPaint3.setColor(i8);
                                                            int iSave = canvas.save();
                                                            try {
                                                                canvas.translate(f14, fIntBitsToFloat2);
                                                                staticLayout.draw(canvas);
                                                                canvas.restoreToCount(iSave);
                                                                bVarF4.a().f();
                                                                bVarF4.h(jD4);
                                                                qc6.b bVarF5 = tcfVar.F1();
                                                                long jD5 = bVarF5.d();
                                                                bVarF5.a().p();
                                                                try {
                                                                    bVarF5.a.a(bVarF1, 1);
                                                                    textPaint3.setColor(i9);
                                                                    int iSave2 = canvas.save();
                                                                    try {
                                                                        canvas.translate(f14, fIntBitsToFloat2);
                                                                        staticLayout.draw(canvas);
                                                                        canvas.restoreToCount(iSave2);
                                                                        bVarF5.a().f();
                                                                        bVarF5.h(jD5);
                                                                        Drawable drawable = drawableC3;
                                                                        if (drawable != null) {
                                                                            drawable.setBounds((int) fIntBitsToFloat, (int) fA, (int) f13, (int) (fA + f9));
                                                                            drawable.draw(canvas);
                                                                            Unit unit = Unit.a;
                                                                        }
                                                                        bVarF1.a().f();
                                                                        bVarF1.h(jD);
                                                                        lc6VarA.f();
                                                                        return Unit.a;
                                                                    } catch (Throwable th) {
                                                                        try {
                                                                            canvas.restoreToCount(iSave2);
                                                                            throw th;
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            bVarF5.a().f();
                                                                            bVarF5.h(jD5);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                }
                                                            } catch (Throwable th4) {
                                                                try {
                                                                    canvas.restoreToCount(iSave);
                                                                    throw th4;
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    bVarF4.a().f();
                                                                    bVarF4.h(jD4);
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                        }
                                                    } catch (Throwable th7) {
                                                        bVarF3.a().f();
                                                        bVarF3.h(jD3);
                                                        throw th7;
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    bVarF1.a().f();
                                                    bVarF1.h(jA);
                                                    throw th;
                                                }
                                            } catch (Throwable th9) {
                                                bVarF2.a().f();
                                                bVarF2.h(jD2);
                                                throw th9;
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            bVarF1 = bVarF1;
                                            jA = jD;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        jA = jD;
                                        bVarF1.a().f();
                                        bVarF1.h(jA);
                                        throw th;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                lc6VarA.f();
                                throw th;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            lc6VarA.f();
                            throw th;
                        }
                    }
                };
                bVar2.r(objY10);
            }
            rxo.b(dVarB, (Function1) objY10, bVar2, 0);
            bVar = bVar2;
        } else {
            b bVar3 = bVarI;
            bVar3.G();
            bVar = bVar3;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, str, j, j2, j3, i, j4, f, f2, i2) { // from class: elq
                public final /* synthetic */ boolean a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ int f;
                public final /* synthetic */ long i;
                public final /* synthetic */ float v;
                public final /* synthetic */ float w;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(1);
                    flq.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final boolean z, final String str, final long j, final long j2, final long j3, final int i, final long j4, final Function0<Unit> function0, a aVar, final int i2) {
        int i3;
        b bVar;
        dVar.getClass();
        function0.getClass();
        b bVarI = aVar.i(1325153495);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.M(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.e(j) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.e(j2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bVarI.e(j3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= bVarI.d(i) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= bVarI.e(j4) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= bVarI.A(function0) ? 67108864 : 33554432;
        }
        if (bVarI.q(i3 & 1, (i3 & 38347923) != 38347922)) {
            final mmd mmdVar = (mmd) bVarI.O(kna.h);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            d dVarB = androidx.compose.foundation.d.b(j.i(dVar, 36.0f), (psw) objY, null, false, new su50(0), function0, 12);
            boolean z2 = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new Function1() { // from class: alq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        pb80 pb80Var = (pb80) obj;
                        pb80Var.getClass();
                        lb80.c(pb80Var, str);
                        ob80<Boolean> ob80Var = hb80.H;
                        ohp<Object> ohpVar = lb80.a[21];
                        pb80Var.b(ob80Var, Boolean.valueOf(z));
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            bVar = bVarI;
            q75.a(xa80.b(dVarB, false, (Function1) objY2), null, false, pp8.b(-1452643775, new gaj() { // from class: blq
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fD = r75Var.d();
                        mmd mmdVar2 = mmdVar;
                        flq.a(z, str, j, j2, j3, i, j4, mmdVar2.C1(fD), mmdVar2.C1(r75Var.e()), aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 3072, 6);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: clq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    flq.b(dVar, z, str, j, j2, j3, i, j4, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final Drawable c(int i, int i2, int i3, a aVar) {
        Drawable drawableMutate;
        Context context = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
        boolean zM = aVar.M(context) | ((((i3 & 14) ^ 6) > 4 && aVar.d(i)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && aVar.d(i2)) || (i3 & 48) == 32);
        Object objY = aVar.y();
        if (zM || objY == a.C0041a.a) {
            Drawable drawable = context.getDrawable(i);
            if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
                drawableMutate = null;
            } else {
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawableMutate.setTintMode(mode);
                drawableMutate.setTint(i2);
                drawableMutate.setColorFilter(i2, mode);
            }
            objY = drawableMutate;
            aVar.r(objY);
        }
        return (Drawable) objY;
    }
}
