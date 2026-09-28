package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class w9y {
    public final wwd0 a;
    public final qxd0<UiText> b = a(new y8y(), new a9y());
    public final qxd0<List<String>> c = a(new g9y(), new h9y());
    public final qxd0<Integer> d = a(new j9y(), new sr6(1));
    public final qxd0<UiText> e = a(new tr6(1), new k9y());
    public final qxd0<UiText> f = a(new wr6(1), new l9y());
    public final qxd0<z900> g = a(new i9y(), new o9y());
    public final qxd0<UiText> h = a(new p9y(0), new q9y());
    public final qxd0<UiText> i = a(new r9y(), new s9y());
    public final qxd0<uxs> j = a(new t9y(), new u9y());
    public final qxd0<gtp> k = a(new v9y(0), new z8y());
    public final qxd0<wg8> l = a(new xvj(1), new b9y());
    public final qxd0<il8> m = a(new c9y(), new d9y());
    public final qxd0<rrj0> n = a(new e9y(), new f9y());

    public static final class a {
    }

    public w9y(wwd0 wwd0Var) {
        this.a = wwd0Var;
    }

    public final <T> qxd0<T> a(final Function1<? super x8y, ? extends T> function1, final Function2<? super x8y, ? super T, x8y> function2) {
        return new qxd0<>(new Function0() { // from class: m9y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return function1.invoke(this.a.getValue());
            }
        }, new Function1() { // from class: n9y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object value;
                wwd0 wwd0Var = this.a.a;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, (x8y) function2.invoke((x8y) value, obj)));
                return Unit.a;
            }
        });
    }
}
