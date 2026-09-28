package defpackage;

import com.sporty.android.common_ui.widgets.CustomProgressButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ce8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ce8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                re8.a aVar = re8.P;
                CustomProgressButton customProgressButton = ((re8) obj2).n0().H;
                bool.getClass();
                customProgressButton.setLoading(bool.booleanValue());
                break;
            default:
                hq60 hq60Var = (hq60) obj;
                hq60Var.getClass();
                hq60Var.L(1, (String) obj2);
                break;
        }
        return Unit.a;
    }
}
