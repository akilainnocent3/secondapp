package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fj4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fj4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(Boolean.FALSE);
                return Unit.a;
            case 1:
                return Integer.valueOf(((eiw) obj).a().getColor(R.color.text_inverse_secondary));
            default:
                m410 m410Var = (m410) obj;
                m410Var.L0 = 1;
                m410Var.L0().y1();
                return Unit.a;
        }
    }
}
