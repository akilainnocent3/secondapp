package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class a8y {
    public final wwd0 a;
    public final qxd0<UiText> b = a(new c7y(), new e7y());
    public final qxd0<List<String>> c = a(new vm6(1), new j7y());
    public final qxd0<Integer> d = a(new l7y(), new m7y());
    public final qxd0<UiText> e = a(new n7y(), new o7y());
    public final qxd0<UiText> f = a(new f8f(1), new p7y());
    public final qxd0<z900> g = a(new k7y(), new s7y());
    public final qxd0<UiText> h = a(new t7y(), new u7y());
    public final qxd0<UiText> i = a(new v7y(), new w7y());
    public final qxd0<uxs> j = a(new x7y(), new y7y());
    public final qxd0<gtp> k = a(new z7y(), new d7y());
    public final qxd0<dh30> l = a(new f7y(), new g7y());
    public final qxd0<wg8> m = a(new vtj(1), new h7y());
    public final qxd0<vc8> n = a(new xtj(1), new i7y());

    public static final class a {
    }

    public a8y(wwd0 wwd0Var) {
        this.a = wwd0Var;
    }

    public final <T> qxd0<T> a(final Function1<? super b7y, ? extends T> function1, final Function2<? super b7y, ? super T, b7y> function2) {
        return new qxd0<>(new Function0() { // from class: q7y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return function1.invoke(this.a.getValue());
            }
        }, new Function1() { // from class: r7y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object value;
                wwd0 wwd0Var = this.a.a;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, (b7y) function2.invoke((b7y) value, obj)));
                return Unit.a;
            }
        });
    }
}
