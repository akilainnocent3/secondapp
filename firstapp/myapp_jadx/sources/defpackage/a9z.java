package defpackage;

import android.content.Context;
import android.graphics.Paint;
import com.sportybet.plugin.realsports.widget.OutcomeViewShimmer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a9z implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a9z(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = OutcomeViewShimmer.i;
                Paint paint = new Paint(1);
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(-1275068417);
                paint.setStrokeWidth(r0b.a((Context) obj, 13));
                return paint;
            default:
                ((Function1) obj).invoke(dsc0.a.a);
                return Unit.a;
        }
    }
}
