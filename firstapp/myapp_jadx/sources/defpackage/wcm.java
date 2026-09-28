package defpackage;

import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wcm implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ wcm(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                Float f = (Float) obj;
                List<String> list = dfm.v2;
                oku okuVar = ((dfm) fragment).D1;
                f.getClass();
                wwd0 wwd0Var = okuVar.p0;
                wwd0Var.getClass();
                wwd0Var.k(null, f);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                d740 d740VarQ0 = ((o540) fragment).q0();
                ej5.c(o8i0.d(d740VarQ0), null, null, new n740(d740VarQ0, str, null), 3);
                break;
        }
        return Unit.a;
    }
}
