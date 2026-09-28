package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class fjz {
    public final wwd0 a;
    public final qxd0<UiText> b = a(new fiz(), new hiz());
    public final qxd0<List<String>> c = a(new oiz(), new piz());
    public final qxd0<Integer> d = a(new qiz(), new riz());
    public final qxd0<UiText> e = a(new siz(), new tiz());
    public final qxd0<UiText> f = a(new uiz(), new viz());
    public final qxd0<z900> g = a(new j9l(1), new yiz());
    public final qxd0<UiText> h = a(new ziz(), new ajz());
    public final qxd0<UiText> i = a(new yuu(1), new bjz());
    public final qxd0<uxs> j = a(new cjz(), new djz());
    public final qxd0<gtp> k = a(new ejz(), new giz());
    public final qxd0<dh30> l = a(new lrb(1), new iiz());
    public final qxd0<String> m = a(new jiz(), new kiz());
    public final qxd0<wg8> n = a(new prb(1), new liz());
    public final qxd0<vc8> o = a(new miz(), new niz());

    public static final class a {
    }

    public fjz(wwd0 wwd0Var) {
        this.a = wwd0Var;
    }

    public final <T> qxd0<T> a(final Function1<? super eiz, ? extends T> function1, Function2<? super eiz, ? super T, eiz> function2) {
        return new qxd0<>(new Function0() { // from class: wiz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return function1.invoke(this.a.getValue());
            }
        }, new xiz(0, this, function2));
    }
}
