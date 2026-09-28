package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.ui.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j7a0 {
    public static final void a(final d dVar, final int i, int i2, int i3, int i4, final float f, final float f2, final float f3, final float f4, final float f5, a aVar, final int i5) {
        final int i6;
        final int i7;
        final int i8;
        b bVarI = aVar.i(1383286339);
        int i9 = i5 | 224256;
        if (bVarI.q(i9 & 1, (306783251 & i9) != 306783250)) {
            final mmd mmdVar = (mmd) bVarI.O(kna.h);
            q75.a(dVar, null, false, pp8.b(-2146029671, new gaj() { // from class: e7a0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a.C0041a.C0042a c0042a;
                    v1b v1bVar;
                    List list;
                    float f6;
                    int i10;
                    Pair pair;
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    int i11 = 0;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fI = kxa.i(r75Var.c());
                        float fH = kxa.h(r75Var.c());
                        mmd mmdVar2 = mmdVar;
                        float fC1 = mmdVar2.C1(f3);
                        float fC2 = mmdVar2.C1(f4);
                        float f7 = (fC1 + fC2) / 2.0f;
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (objY == c0042a2) {
                            objY = new bxg0(j7a0.b(fC1), j7a0.b(f7), j7a0.b(fC2));
                            aVar2.r(objY);
                        }
                        bxg0 bxg0Var = (bxg0) objY;
                        c8n c8nVar = (c8n) bxg0Var.a;
                        c8n c8nVar2 = (c8n) bxg0Var.b;
                        c8n c8nVar3 = (c8n) bxg0Var.c;
                        boolean zM = aVar2.M(c8nVar) | aVar2.M(c8nVar2) | aVar2.M(c8nVar3);
                        Object objY2 = aVar2.y();
                        if (zM || objY2 == c0042a2) {
                            objY2 = kotlin.collections.b.k(c8nVar, c8nVar2, c8nVar3);
                            aVar2.r(objY2);
                        }
                        List list2 = (List) objY2;
                        boolean zC = aVar2.c(fI) | aVar2.c(fH);
                        Object objY3 = aVar2.y();
                        if (zC || objY3 == c0042a2) {
                            int i12 = i;
                            ArrayList arrayList = new ArrayList(i12);
                            while (i11 < i12) {
                                lx30.Companion companion = lx30.INSTANCE;
                                companion.getClass();
                                float f8 = fC1;
                                float f9 = fC2;
                                l7a0 l7a0Var = lx30.b.i() ? l7a0.a : l7a0.b;
                                l7a0 l7a0Var2 = l7a0.b;
                                c8n c8nVar4 = l7a0Var == l7a0Var2 ? (c8n) CollectionsKt.k0(list2, companion) : null;
                                if (Intrinsics.g(c8nVar4, c8nVar)) {
                                    list = list2;
                                    f6 = f7;
                                    i10 = i11;
                                    pair = new Pair(Float.valueOf(f8), Float.valueOf(f6));
                                } else {
                                    list = list2;
                                    f6 = f7;
                                    i10 = i11;
                                    pair = Intrinsics.g(c8nVar4, c8nVar2) ? new Pair(Float.valueOf(f6), Float.valueOf(f9)) : new Pair(Float.valueOf(f8), Float.valueOf(f9));
                                }
                                float fFloatValue = ((Number) pair.a).floatValue();
                                float fFloatValue2 = ((Number) pair.b).floatValue();
                                if (l7a0Var != l7a0Var2) {
                                    c8nVar4 = null;
                                }
                                a.C0041a.C0042a c0042a3 = c0042a2;
                                z6a0 z6a0Var = new z6a0(new d7a0(fI, fH, c8nVar4, mmdVar2.y0(f), mmdVar2.y0(f2), (int) fFloatValue, (int) fFloatValue2, f5), l7a0Var);
                                z6a0Var.a(null);
                                arrayList.add(z6a0Var);
                                c8nVar = c8nVar;
                                i11 = i10 + 1;
                                c8nVar2 = c8nVar2;
                                i12 = i12;
                                c0042a2 = c0042a3;
                                fC2 = f9;
                                list2 = list;
                                f7 = f6;
                                mmdVar2 = mmdVar2;
                                fC1 = f8;
                            }
                            c0042a = c0042a2;
                            v1bVar = null;
                            aVar2.r(arrayList);
                            objY3 = arrayList;
                        } else {
                            c0042a = c0042a2;
                            v1bVar = null;
                        }
                        final List list3 = (List) objY3;
                        Object objY4 = aVar2.y();
                        if (objY4 == c0042a) {
                            objY4 = k.a(0);
                            aVar2.r(objY4);
                        }
                        final osw oswVar = (osw) objY4;
                        Unit unit = Unit.a;
                        boolean zA = aVar2.A(list3);
                        Object objY5 = aVar2.y();
                        if (zA || objY5 == c0042a) {
                            objY5 = new i7a0(list3, oswVar, v1bVar);
                            aVar2.r(objY5);
                        }
                        xvf.e(aVar2, unit, (Function2) objY5);
                        d dVarE = j.e(d.a.b, 1.0f);
                        boolean zA2 = aVar2.A(list3);
                        Object objY6 = aVar2.y();
                        if (zA2 || objY6 == c0042a) {
                            objY6 = new Function1() { // from class: g7a0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    tcf tcfVar = (tcf) obj4;
                                    tcfVar.getClass();
                                    oswVar.D();
                                    for (z6a0 z6a0Var2 : list3) {
                                        z6a0Var2.getClass();
                                        int iOrdinal = z6a0Var2.b.ordinal();
                                        if (iOrdinal == 0) {
                                            tcf.n0(tcfVar, j58.c(z6a0Var2.d, j58.f), z6a0Var2.c / 2.0f, (((long) Float.floatToRawIntBits(z6a0Var2.e)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(z6a0Var2.f))), 0.0f, null, 120);
                                        } else {
                                            if (iOrdinal != 1) {
                                                uhc.a();
                                                return null;
                                            }
                                            c8n c8nVar5 = z6a0Var2.a.c;
                                            if (c8nVar5 != null) {
                                                float f10 = z6a0Var2.c / 2.0f;
                                                float f11 = z6a0Var2.e - f10;
                                                tcf.b1(tcfVar, c8nVar5, (4294967295L & ((long) Float.floatToRawIntBits(z6a0Var2.f - f10))) | (Float.floatToRawIntBits(f11) << 32), z6a0Var2.d, null, 0, 56);
                                            }
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY6);
                        }
                        rxo.b(dVarE, (Function1) objY6, aVar2, 6);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3078, 6);
            i6 = 150;
            i7 = 255;
            i8 = 15;
        } else {
            bVarI.G();
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i6, i7, i8, f, f2, f3, f4, f5, i5) { // from class: f7a0
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ float f;
                public final /* synthetic */ float i;
                public final /* synthetic */ float v;
                public final /* synthetic */ float w;
                public final /* synthetic */ float y;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(920125495);
                    j7a0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final t70 b(float f) {
        int i = (int) f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setTextSize(f);
        paint.setTextAlign(Paint.Align.LEFT);
        canvas.drawText("❄", 0.0f, f - paint.descent(), paint);
        return new t70(bitmapCreateBitmap);
    }
}
