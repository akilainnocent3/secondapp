package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.graphics.Paint;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hr40 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mr5 mr5Var = (mr5) obj;
        mr5Var.getClass();
        Paint paint = c90.a().a;
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#DDE0E0E0"));
        paint.setMaskFilter(new BlurMaskFilter(40.0f, BlurMaskFilter.Blur.NORMAL));
        return mr5Var.e(new lzc(paint, 2));
    }
}
