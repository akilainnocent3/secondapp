package defpackage;

import com.sportybet.plugin.realsports.searchv2.SearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pt70 extends saj implements Function0 {
    public final /* synthetic */ int a = 1;

    public pt70(Object obj) {
        super(0, obj, SearchActivity.class, "finish", "finish()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((SearchActivity) this.receiver).finish();
                return Unit.a;
            default:
                b390 b390Var = ((f7k0) this.receiver).y;
                Unit unit = Unit.a;
                b390Var.a(unit);
                return unit;
        }
    }

    public /* synthetic */ pt70(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
