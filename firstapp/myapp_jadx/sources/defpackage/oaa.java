package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class oaa extends View.DragShadowBuilder {
    public final nmd a;
    public final long b;
    public final Function1<tcf, Unit> c;

    public oaa(nmd nmdVar, long j, Function1 function1) {
        this.a = nmdVar;
        this.b = j;
        this.c = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        qc6 qc6Var = new qc6();
        asr asrVar = asr.a;
        h40 h40VarB = i40.b(canvas);
        qc6.a aVar = qc6Var.a;
        mmd mmdVar = aVar.a;
        asr asrVar2 = aVar.b;
        lc6 lc6Var = aVar.c;
        long j = aVar.d;
        aVar.a = this.a;
        aVar.b = asrVar;
        aVar.c = h40VarB;
        aVar.d = this.b;
        h40VarB.p();
        this.c.invoke(qc6Var);
        h40VarB.f();
        aVar.a = mmdVar;
        aVar.b = asrVar2;
        aVar.c = lc6Var;
        aVar.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        nmd nmdVar = this.a;
        point.set(nmdVar.y0(fIntBitsToFloat / nmdVar.getDensity()), nmdVar.y0(Float.intBitsToFloat((int) (j & 4294967295L)) / nmdVar.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
