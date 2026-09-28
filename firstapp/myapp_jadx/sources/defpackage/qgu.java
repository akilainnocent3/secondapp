package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class qgu {
    public final wwd0 a;
    public final qxd0<UiText> b = a(new qfu(), new sfu());
    public final qxd0<List<String>> c = a(new agu(), new bgu());
    public final qxd0<Integer> d = a(new cgu(), new ltk(1));
    public final qxd0<UiText> e = a(new dgu(), new egu());
    public final qxd0<UiText> f = a(new vh2(1), new fgu());
    public final qxd0<z900> g = a(new v3g(1), new ggu());
    public final qxd0<UiText> h = a(new jgu(0), new kgu());
    public final qxd0<UiText> i = a(new lgu(0), new mgu());
    public final qxd0<UiText> j = a(new ngu(), new ogu());
    public final qxd0<UiText> k = a(new pgu(), new rfu());
    public final qxd0<gtp> l = a(new tfu(), new ufu());
    public final qxd0<wg8> m = a(new vfu(), new wfu());
    public final qxd0<il8> n = a(new xfu(), new c3q());
    public final qxd0<rrj0> o = a(new yfu(), new etk(1));
    public final qxd0<uxs> p = a(new zfu(), new i3q());

    public static final class a {
    }

    public qgu(wwd0 wwd0Var) {
        this.a = wwd0Var;
    }

    public final <T> qxd0<T> a(final Function1<? super pfu, ? extends T> function1, final Function2<? super pfu, ? super T, pfu> function2) {
        return new qxd0<>(new Function0() { // from class: hgu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return function1.invoke(this.a.getValue());
            }
        }, new Function1() { // from class: igu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object value;
                wwd0 wwd0Var = this.a.a;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, (pfu) function2.invoke((pfu) value, obj)));
                return Unit.a;
            }
        });
    }
}
