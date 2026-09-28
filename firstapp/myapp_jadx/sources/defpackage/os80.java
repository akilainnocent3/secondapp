package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.Status;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class os80 extends Dialog implements r54.a {
    public c28 a;
    public ibs b;
    public cx80 c;
    public String d;
    public r54 e;
    public et80 f;

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
        public final /* synthetic */ es80 a;

        public b(es80 es80Var) {
            this.a = es80Var;
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

    @Override // r54.a
    public final void a(String str) {
        str.getClass();
        try {
            Context context = getContext();
            context.getClass();
            et80 et80Var = new et80(context, this.a, this.b, str, new ax8(2));
            this.f = et80Var;
            et80Var.a();
            wz.a("FairnessClicked", "Sporty Hero", "biggest coefficient");
        } catch (Exception unused) {
        }
    }

    public final cx80 b() {
        cx80 cx80Var = this.c;
        if (cx80Var != null) {
            return cx80Var;
        }
        Intrinsics.n("binding");
        throw null;
    }

    public final void c() {
        try {
            this.a.f.f(this.b, new b(new es80(this)));
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.c = cx80.a(getLayoutInflater());
            setContentView(b().a);
            b().B.setText(getContext().getString(R.string.biggest_coefficients));
            b().B.setTag(getContext().getString(R.string.biggest_coefficients_cms));
            b().d.setVisibility(8);
            this.a.x1(this.d);
            wz.a("BiggestCoeffClicked", "Sporty Hero", "Day");
            c();
            b().e.setOnClickListener(new View.OnClickListener() { // from class: wr80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.dismiss();
                    wz.a("popup_action", "Sporty Hero", "biggest coefficient", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                }
            });
            b().w.setOnClickListener(new yr80(this, 0));
            b().A.setOnClickListener(new View.OnClickListener() { // from class: as80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    os80 os80Var = this.a;
                    String string = os80Var.getContext().getString(R.string.monthly);
                    string.getClass();
                    os80Var.d = string;
                    os80Var.a.x1(string);
                    os80Var.c();
                    os80Var.b().w.setBackgroundColor(os80Var.getContext().getColor(R.color.sb_black));
                    os80Var.b().A.setBackgroundColor(os80Var.getContext().getColor(R.color.bg_primary));
                    os80Var.b().E.setBackgroundColor(os80Var.getContext().getColor(R.color.sb_black));
                    wz.a("BiggestCoeffClicked", "Sporty Hero", "Month");
                }
            });
            b().E.setOnClickListener(new View.OnClickListener() { // from class: cs80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    os80 os80Var = this.a;
                    String string = os80Var.getContext().getString(R.string.yearly);
                    string.getClass();
                    os80Var.d = string;
                    os80Var.a.x1(string);
                    os80Var.b().w.setBackgroundColor(os80Var.getContext().getColor(R.color.sb_black));
                    os80Var.b().A.setBackgroundColor(os80Var.getContext().getColor(R.color.sb_black));
                    os80Var.b().E.setBackgroundColor(os80Var.getContext().getColor(R.color.bg_primary));
                    os80Var.c();
                    wz.a("BiggestCoeffClicked", "Sporty Hero", "Year");
                }
            });
            op5.r(op5.a, kotlin.collections.b.f(b().B, b().w, b().A, b().E, b().v, b().f, b().y), null, 4);
        } catch (Exception unused) {
        }
    }
}
