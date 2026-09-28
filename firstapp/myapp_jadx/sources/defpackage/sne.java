package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sne implements Function1 {
    public final /* synthetic */ float a;
    public final /* synthetic */ long b;

    public /* synthetic */ sne(float f, long j) {
        this.a = f;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        long j;
        lza lzaVar = (lza) obj;
        lzaVar.getClass();
        float fC1 = lzaVar.C1(20.0f);
        float fC2 = lzaVar.C1(22.0f);
        lc6 lc6VarA = lzaVar.F1().a();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        long j2 = this.b;
        paint.setColor(r58.l(j2));
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint.setMaskFilter(new BlurMaskFilter(fC1, blur));
        Path path = new Path();
        path.moveTo(Float.intBitsToFloat((int) (lzaVar.d() >> 32)), Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)));
        path.lineTo(Float.intBitsToFloat((int) (lzaVar.d() >> 32)), Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - fC2);
        float f = 0.24f * fC2;
        path.cubicTo(Float.intBitsToFloat((int) (lzaVar.d() >> 32)), Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - fC2, 0.95f * Float.intBitsToFloat((int) (lzaVar.d() >> 32)), Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f, Float.intBitsToFloat((int) (lzaVar.d() >> 32)) * 0.5f, Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f);
        path.cubicTo(Float.intBitsToFloat((int) (lzaVar.d() >> 32)) * 0.05f, Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f, 0.0f, Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - fC2, 0.0f, Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - fC2);
        path.lineTo(0.0f, Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)));
        path.close();
        i40.c(lc6VarA).drawPath(path, paint);
        lzaVar.b2();
        float fC3 = lzaVar.C1(5.0f);
        float fC4 = lzaVar.C1(this.a);
        lc6 lc6VarA2 = lzaVar.F1().a();
        b90 b90VarA = c90.a();
        Paint paint2 = b90VarA.a;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(fC3);
        paint2.setColor(r58.l(j2));
        paint2.setMaskFilter(new BlurMaskFilter(fC3, blur));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L));
        qc6.b bVarF1 = lzaVar.F1();
        long jD = bVarF1.d();
        bVarF1.a().p();
        try {
            bVarF1.a.b(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
            j = jD;
            try {
                lc6VarA2.l(0.0f, 0.0f, Float.intBitsToFloat((int) (lzaVar.d() >> 32)), Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)), fC4, fC4, b90VarA);
                hrh.a(bVarF1, j);
                return Unit.a;
            } catch (Throwable th) {
                th = th;
                hrh.a(bVarF1, j);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j = jD;
        }
    }
}
