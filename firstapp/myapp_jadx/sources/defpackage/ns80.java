package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.Status;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ns80 extends Dialog implements q54.a {
    public y720 a;
    public ibs b;
    public m820 c;
    public String d;
    public q54 e;
    public dt80 f;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class b implements lfy, paj {
        public final /* synthetic */ hs80 a;

        public b(hs80 hs80Var) {
            this.a = hs80Var;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    @Override // q54.a
    public final void a(String str) {
        str.getClass();
        try {
            Context context = getContext();
            context.getClass();
            dt80 dt80Var = new dt80(context, this.a, this.b, str, new zs80());
            this.f = dt80Var;
            dt80Var.a();
            wz.a("FairnessClicked", "Ping Pong", "biggest coefficient");
        } catch (Exception unused) {
        }
    }

    public final m820 b() {
        m820 m820Var = this.c;
        if (m820Var != null) {
            return m820Var;
        }
        Intrinsics.n("binding");
        throw null;
    }

    public final void c() {
        try {
            this.a.e.f(this.b, new b(new hs80(this)));
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.c = m820.a(getLayoutInflater());
            setContentView(b().a);
            b().B.setText(getContext().getString(R.string.biggest_coefficients));
            b().B.setTag(getContext().getString(R.string.biggest_coefficients_cms));
            b().d.setVisibility(8);
            setOnCancelListener(new xr80());
            this.a.x1(this.d);
            wz.a("BiggestCoeffClicked", "Ping Pong", "Day");
            c();
            b().e.setOnClickListener(new View.OnClickListener() { // from class: zr80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.dismiss();
                    wz.a("popup_action", "Ping Pong", "biggest coefficient", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                }
            });
            b().w.setOnClickListener(new View.OnClickListener() { // from class: bs80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ns80 ns80Var = this.a;
                    String string = ns80Var.getContext().getString(R.string.daily);
                    string.getClass();
                    ns80Var.d = string;
                    wz.a("BiggestCoeffClicked", "Ping Pong", "Day");
                    ns80Var.a.x1(ns80Var.d);
                    ns80Var.c();
                    ns80Var.b().w.setBackgroundColor(ns80Var.getContext().getColor(R.color.bg_primary));
                    ns80Var.b().A.setBackgroundColor(ns80Var.getContext().getColor(R.color.pp_setting_bg));
                    ns80Var.b().E.setBackgroundColor(ns80Var.getContext().getColor(R.color.pp_setting_bg));
                }
            });
            b().A.setOnClickListener(new ds80(this, 0));
            b().E.setOnClickListener(new View.OnClickListener() { // from class: fs80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ns80 ns80Var = this.a;
                    String string = ns80Var.getContext().getString(R.string.yearly);
                    string.getClass();
                    ns80Var.d = string;
                    ns80Var.a.x1(string);
                    ns80Var.b().w.setBackgroundColor(ns80Var.getContext().getColor(R.color.pp_setting_bg));
                    ns80Var.b().A.setBackgroundColor(ns80Var.getContext().getColor(R.color.pp_setting_bg));
                    ns80Var.b().E.setBackgroundColor(ns80Var.getContext().getColor(R.color.bg_primary));
                    ns80Var.c();
                    wz.a("BiggestCoeffClicked", "Ping Pong", "Year");
                }
            });
            op5.r(op5.a, kotlin.collections.b.f(b().B, b().w, b().A, b().E, b().v, b().f, b().y), null, 4);
        } catch (Exception unused) {
        }
    }
}
