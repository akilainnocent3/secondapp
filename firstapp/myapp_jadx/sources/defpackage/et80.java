package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class et80 extends Dialog {
    public final Context a;
    public final c28 b;
    public final ibs c;
    public final String d;
    public final Function0<Unit> e;
    public ft80 f;
    public km60 i;

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
        public final /* synthetic */ se40 a;

        public b(se40 se40Var) {
            this.a = se40Var;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et80(Context context, c28 c28Var, ibs ibsVar, String str, Function0<Unit> function0) {
        super(context);
        context.getClass();
        c28Var.getClass();
        ibsVar.getClass();
        str.getClass();
        this.a = context;
        this.b = c28Var;
        this.c = ibsVar;
        this.d = str;
        this.e = function0;
        setCancelable(false);
    }

    public final void a() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.gravity = 17;
        }
        if (attributes != null) {
            attributes.flags &= -5;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setAttributes(attributes);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setBackgroundDrawableResource(R.color.dialog_bg_color);
        }
        show();
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setLayout(-1, -1);
        }
    }

    public final ft80 b() {
        ft80 ft80Var = this.f;
        if (ft80Var != null) {
            return ft80Var;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c28 c28Var = this.b;
        c28Var.i.l(this.c);
        c28Var.i.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.sh_fairness_v2, (ViewGroup) null, false);
        int i2 = R.id.client_layout;
        if (((ConstraintLayout) h5e.a(R.id.client_layout, viewInflate)) != null) {
            i2 = R.id.client_seed;
            RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.client_seed, viewInflate);
            if (recyclerView != null) {
                i2 = R.id.client_seed_generate_text;
                AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.client_seed_generate_text, viewInflate);
                if (appCompatTextView != null) {
                    i2 = R.id.client_seed_image;
                    if (((AppCompatImageView) h5e.a(R.id.client_seed_image, viewInflate)) != null) {
                        i2 = R.id.client_seed_text;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.client_seed_text, viewInflate);
                        if (appCompatTextView2 != null) {
                            i2 = R.id.close;
                            FloatingActionButton floatingActionButton = (FloatingActionButton) h5e.a(R.id.close, viewInflate);
                            if (floatingActionButton != null) {
                                i2 = R.id.coefficient;
                                TextView textView = (TextView) h5e.a(R.id.coefficient, viewInflate);
                                if (textView != null) {
                                    i2 = R.id.combined_seed;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.combined_seed, viewInflate);
                                    if (appCompatTextView3 != null) {
                                        i2 = R.id.combined_seed_image;
                                        if (((AppCompatImageView) h5e.a(R.id.combined_seed_image, viewInflate)) != null) {
                                            i2 = R.id.combined_seed_text;
                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) h5e.a(R.id.combined_seed_text, viewInflate);
                                            if (appCompatTextView4 != null) {
                                                i2 = R.id.combined_text;
                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) h5e.a(R.id.combined_text, viewInflate);
                                                if (appCompatTextView5 != null) {
                                                    i2 = R.id.container;
                                                    if (((CardView) h5e.a(R.id.container, viewInflate)) != null) {
                                                        i2 = R.id.decimal;
                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) h5e.a(R.id.decimal, viewInflate);
                                                        if (appCompatTextView6 != null) {
                                                            i2 = R.id.decimal_text;
                                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) h5e.a(R.id.decimal_text, viewInflate);
                                                            if (appCompatTextView7 != null) {
                                                                i2 = R.id.hex;
                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) h5e.a(R.id.hex, viewInflate);
                                                                if (appCompatTextView8 != null) {
                                                                    i2 = R.id.hex_text;
                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) h5e.a(R.id.hex_text, viewInflate);
                                                                    if (appCompatTextView9 != null) {
                                                                        i2 = R.id.loader;
                                                                        SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.loader, viewInflate);
                                                                        if (spinKitView != null) {
                                                                            i2 = R.id.parentConstraint;
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.parentConstraint, viewInflate);
                                                                            if (constraintLayout != null) {
                                                                                i2 = R.id.provably_fair_text;
                                                                                AppCompatTextView appCompatTextView10 = (AppCompatTextView) h5e.a(R.id.provably_fair_text, viewInflate);
                                                                                if (appCompatTextView10 != null) {
                                                                                    i2 = R.id.result;
                                                                                    AppCompatTextView appCompatTextView11 = (AppCompatTextView) h5e.a(R.id.result, viewInflate);
                                                                                    if (appCompatTextView11 != null) {
                                                                                        i2 = R.id.result_text;
                                                                                        AppCompatTextView appCompatTextView12 = (AppCompatTextView) h5e.a(R.id.result_text, viewInflate);
                                                                                        if (appCompatTextView12 != null) {
                                                                                            i2 = R.id.round_id;
                                                                                            AppCompatTextView appCompatTextView13 = (AppCompatTextView) h5e.a(R.id.round_id, viewInflate);
                                                                                            if (appCompatTextView13 != null) {
                                                                                                i2 = R.id.round_layout;
                                                                                                if (((ConstraintLayout) h5e.a(R.id.round_layout, viewInflate)) != null) {
                                                                                                    i2 = R.id.server_seed;
                                                                                                    AppCompatTextView appCompatTextView14 = (AppCompatTextView) h5e.a(R.id.server_seed, viewInflate);
                                                                                                    if (appCompatTextView14 != null) {
                                                                                                        i2 = R.id.server_seed_generate_text;
                                                                                                        AppCompatTextView appCompatTextView15 = (AppCompatTextView) h5e.a(R.id.server_seed_generate_text, viewInflate);
                                                                                                        if (appCompatTextView15 != null) {
                                                                                                            i2 = R.id.server_seed_image;
                                                                                                            if (((AppCompatImageView) h5e.a(R.id.server_seed_image, viewInflate)) != null) {
                                                                                                                i2 = R.id.server_seed_text;
                                                                                                                AppCompatTextView appCompatTextView16 = (AppCompatTextView) h5e.a(R.id.server_seed_text, viewInflate);
                                                                                                                if (appCompatTextView16 != null) {
                                                                                                                    i2 = R.id.time;
                                                                                                                    AppCompatTextView appCompatTextView17 = (AppCompatTextView) h5e.a(R.id.time, viewInflate);
                                                                                                                    if (appCompatTextView17 != null) {
                                                                                                                        this.f = new ft80((ConstraintLayout) viewInflate, recyclerView, appCompatTextView, appCompatTextView2, floatingActionButton, textView, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, spinKitView, constraintLayout, appCompatTextView10, appCompatTextView11, appCompatTextView12, appCompatTextView13, appCompatTextView14, appCompatTextView15, appCompatTextView16, appCompatTextView17);
                                                                                                                        setContentView(b().a);
                                                                                                                        b().E.setPaintFlags(b().E.getPaintFlags() | 8);
                                                                                                                        b().E.setOnClickListener(new ws80(this, i));
                                                                                                                        b().e.setOnClickListener(new View.OnClickListener() { // from class: xs80
                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view) {
                                                                                                                                this.a.dismiss();
                                                                                                                                wz.a("popup_action", "Sporty Hero", "provably fair", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                                                                                                                            }
                                                                                                                        });
                                                                                                                        String str = this.d;
                                                                                                                        c28 c28Var = this.b;
                                                                                                                        c28Var.y1(str);
                                                                                                                        try {
                                                                                                                            c28Var.i.f(this.c, new b(new se40(this, 1)));
                                                                                                                            return;
                                                                                                                        } catch (Exception unused) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    public /* synthetic */ et80(Context context, c28 c28Var, ibs ibsVar, String str) {
        this(context, c28Var, ibsVar, str, new ax8(2));
    }
}
