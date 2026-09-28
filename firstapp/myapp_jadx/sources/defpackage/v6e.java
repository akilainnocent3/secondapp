package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class v6e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v6e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(uc8.a.a);
                return Unit.a;
            case 1:
                n2j n2jVar = (n2j) obj;
                n2jVar.m0();
                n2jVar.d0 = null;
                return Unit.a;
            default:
                return Integer.valueOf(((xss) obj).f.getColor(R.color.text_type1_secondary));
        }
    }
}
