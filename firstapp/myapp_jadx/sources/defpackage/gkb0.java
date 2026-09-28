package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class gkb0 {
    public final wwd0 a;
    public final qxd0<Integer> d;
    public final qxd0<UiText> e;
    public final qxd0<UiText> f;
    public final qxd0<UiText> b = a(new wjb0(), new ekb0());
    public final qxd0<List<String>> c = a(new n970(1), new fkb0());
    public final qxd0<uxs> g = a(new zjb0(), new akb0());
    public final qxd0<wg8> h = a(new bkb0(), new ckb0());
    public final qxd0<vc8> i = a(new gdb(2), new dkb0());

    public static final class a {
    }

    public gkb0(wwd0 wwd0Var) {
        this.a = wwd0Var;
        int i = 1;
        this.d = a(new xjb0(), new bc7(i));
        this.e = a(new yjb0(0), new dc7(i));
        this.f = a(new czp(1), new fc7(i));
    }

    public final <T> qxd0<T> a(Function1<? super vjb0, ? extends T> function1, Function2<? super vjb0, ? super T, vjb0> function2) {
        int i = 1;
        return new qxd0<>(new adb(i, function1, this), new bc2(i, this, function2));
    }
}
