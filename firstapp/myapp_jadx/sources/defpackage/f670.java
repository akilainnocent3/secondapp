package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f670 {
    public final mg70 a;
    public final rdd0 b;
    public jvd0 d;
    public final b390 c = d390.b(0, 1, pb5.b, 1);
    public final wwd0 e = xwd0.a(null);
    public final wwd0 f = xwd0.a(null);
    public final wwd0 g = xwd0.a(null);

    public static final class a {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return kox.a("HeadToHeadStatsDataError(throwable=", ")", this.a);
        }
    }

    public interface b {

        public static final class a implements b {
            public final a a;

            public a(a aVar) {
                this.a = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a.equals(((a) obj).a);
            }

            public final int hashCode() {
                return this.a.a.hashCode();
            }

            public final String toString() {
                return "Failure(error=" + this.a + ")";
            }
        }

        /* JADX INFO: renamed from: f670$b$b, reason: collision with other inner class name */
        public static final class C0546b implements b {
            public static final C0546b a = new C0546b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0546b);
            }

            public final int hashCode() {
                return 416123481;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public static final class c implements b {
            public final a670 a;

            public c(a670 a670Var) {
                this.a = a670Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                a670 a670Var = this.a;
                if (a670Var == null) {
                    return 0;
                }
                return a670Var.hashCode();
            }

            public final String toString() {
                return "Success(data=" + this.a + ")";
            }
        }
    }

    public f670(mg70 mg70Var, rdd0 rdd0Var) {
        this.a = mg70Var;
        this.b = rdd0Var;
    }

    public static ior c(r670 r670Var, boolean z, String str) {
        jor jorVar;
        String str2 = r670Var.a;
        int i = r670Var.h;
        int i2 = r670Var.d;
        boolean zEquals = str2.equals(str);
        int i3 = zEquals ? i2 : i;
        int i4 = zEquals ? i : i2;
        String str3 = zEquals ? r670Var.f : r670Var.b;
        if (i3 > i4) {
            int i5 = z ? R.color.bg_brand_sub_primary_d_lightest : R.color.bg_brand_main_primary;
            StringUiText stringUiText = vch0.a;
            jorVar = new jor(i5, R.color.text_inverse_primary, new ResourceUiText(R.string.page_instant_virtual__stats_popup_w));
        } else if (i3 < i4) {
            int i6 = z ? R.color.bg_brand_sub_secondary_d_darker : R.color.bg_danger_secondary;
            StringUiText stringUiText2 = vch0.a;
            jorVar = new jor(i6, R.color.text_secondary, new ResourceUiText(R.string.page_instant_virtual__stats_popup_l));
        } else {
            StringUiText stringUiText3 = vch0.a;
            jorVar = new jor(R.color.bg_surface_secondary, R.color.text_secondary, new ResourceUiText(R.string.page_instant_virtual__stats_popup_d));
        }
        return new ior(jorVar, zEquals, str3, d40.a(i2, i, ":"));
    }

    public final void a() {
        wwd0 wwd0Var;
        Object value;
        wwd0 wwd0Var2;
        Object value2;
        jvd0 jvd0Var = this.d;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.d = null;
        do {
            wwd0Var = this.e;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, null));
        do {
            wwd0Var2 = this.f;
            value2 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value2, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, x1b x1bVar) {
        g670 g670Var;
        Object value;
        Object objE;
        Object value2;
        Object value3;
        Object value4;
        if (x1bVar instanceof g670) {
            g670Var = (g670) x1bVar;
            int i = g670Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                g670Var.d = i - Integer.MIN_VALUE;
            } else {
                g670Var = new g670(this, x1bVar);
            }
        } else {
            g670Var = new g670(this, x1bVar);
        }
        Object obj = g670Var.b;
        y5b y5bVar = y5b.a;
        int i2 = g670Var.d;
        wwd0 wwd0Var = this.e;
        if (i2 == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, new Pair(str2, b.C0546b.a)));
            g670Var.a = str2;
            g670Var.d = 1;
            objE = this.a.e(str, str2, g670Var);
            if (objE == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = g670Var.a;
            uj50.b(obj);
            objE = ((zi50) obj).a;
        }
        String str3 = str2;
        Throwable thA = zi50.a(objE);
        if (thA == null) {
            a670 a670Var = (a670) objE;
            do {
                value4 = wwd0Var.getValue();
            } while (!wwd0Var.g(value4, new Pair(str3, new b.c(a670Var))));
            return Unit.a;
        }
        if ((thA instanceof SprThrowable) && ((SprThrowable) thA).getD() == 23001) {
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, new Pair(str3, new b.c(null))));
            return Unit.a;
        }
        do {
            value2 = wwd0Var.getValue();
        } while (!wwd0Var.g(value2, new Pair(str3, new b.a(new a(thA)))));
        return Unit.a;
    }
}
