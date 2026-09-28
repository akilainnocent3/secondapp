package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class weu {
    public final wwd0 a;
    public final qxd0<UiText> b = a(new oe7(1), new udu());
    public final qxd0<List<String>> c = a(new feu(), new geu());
    public final qxd0<Integer> d = a(new heu(), new ieu());
    public final qxd0<UiText> e = a(new jeu(), new keu());
    public final qxd0<UiText> f = a(new leu(0), new meu());
    public final qxd0<z900> g = a(new ceu(), new neu());
    public final qxd0<UiText> h = a(new peu(), new qeu());
    public final qxd0<UiText> i = a(new reu(), new seu());
    public final qxd0<UiText> j = a(new teu(), new ueu());
    public final qxd0<UiText> k = a(new veu(0), new tdu());
    public final qxd0<uxs> l = a(new vdu(0), new wdu());
    public final qxd0<gtp> m = a(new xdu(0), new ydu());
    public final qxd0<dh30> n = a(new zdu(), new aeu());
    public final qxd0<wg8> o = a(new xe7(2), new beu());
    public final qxd0<vc8> p = a(new deu(), new eeu());

    public static final class a {
    }

    public weu(wwd0 wwd0Var) {
        this.a = wwd0Var;
    }

    public final <T> qxd0<T> a(final Function1<? super sdu, ? extends T> function1, Function2<? super sdu, ? super T, sdu> function2) {
        return new qxd0<>(new Function0() { // from class: oeu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return function1.invoke(this.a.getValue());
            }
        }, new veb(1, this, function2));
    }
}
