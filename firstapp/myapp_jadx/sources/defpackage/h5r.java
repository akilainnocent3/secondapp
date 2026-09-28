package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h5r implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h5r(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(zxq.c0.a);
                return Unit.a;
            default:
                Context context = ((ggg0) obj).d;
                Drawable drawable = context.getDrawable(R.drawable.spr_ic_arrow_right_black_24dp);
                if (drawable == null) {
                    return null;
                }
                context.getClass();
                aef.b(drawable, context, R.color.brand_secondary);
                return drawable;
        }
    }
}
