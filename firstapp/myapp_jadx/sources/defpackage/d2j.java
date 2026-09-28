package defpackage;

import android.graphics.drawable.Drawable;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d2j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d2j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                return Unit.a;
            default:
                l22 l22Var = ((xss) obj).f;
                Drawable drawable = l22Var.getDrawable(R.drawable.spr_ic_arrow_drop_down_black_24dp);
                if (drawable == null) {
                    return null;
                }
                aef.b(drawable, l22Var, R.color.brand_secondary_variable_type3);
                return drawable;
        }
    }
}
