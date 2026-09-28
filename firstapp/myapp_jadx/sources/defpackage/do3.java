package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class do3 {
    public final gy3 a;
    public final no3 b;
    public final odd c;
    public final wwd0 d;
    public final wwd0 e;
    public final wwd0 f;
    public final wwd0 g;
    public final wwd0 h;
    public final wwd0 i;
    public final wwd0 j;
    public v340 k;
    public final ku90<Unit> l;
    public final t340 m;

    public do3(gy3 gy3Var, no3 no3Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        gy3Var.getClass();
        this.a = gy3Var;
        this.b = no3Var;
        this.c = oddVar;
        this.d = xwd0.a(Boolean.TRUE);
        this.e = xwd0.a(t3g.a);
        this.f = xwd0.a(null);
        this.g = xwd0.a(0);
        this.h = xwd0.a(m2g.a);
        this.i = xwd0.a(null);
        this.j = xwd0.a(null);
        ku90<Unit> ku90Var = new ku90<>();
        this.l = ku90Var;
        this.m = e1i.a(ku90Var);
    }

    public static oo3 a(do3 do3Var) {
        oo3.b bVar = oo3.b.c;
        do3Var.getClass();
        return new oo3(bVar, 0, new ConcatUiText(new UiText[]{vch0.d(String.valueOf(0)), new ResourceUiText(R.string.page_loyalty__x_pick)}), false, false, m2g.a, 64);
    }

    public static final class a {
        public final wy3 a;
        public final jw3 b;

        public a(int i) {
            this(new wy3(0, m2g.a), null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            jw3 jw3Var = this.b;
            return iHashCode + (jw3Var == null ? 0 : jw3Var.hashCode());
        }

        public final String toString() {
            return "ThemesBundle(themes=" + this.a + ", availability=" + this.b + ")";
        }

        public a(wy3 wy3Var, jw3 jw3Var) {
            this.a = wy3Var;
            this.b = jw3Var;
        }

        public a() {
            this(0);
        }
    }
}
