package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class ab8 extends Dialog {
    public final String A;
    public final boolean B;
    public ConstraintLayout C;
    public final ArrayList D;
    public final ArrayList E;
    public Function2<? super Integer, ? super Integer, Unit> F;
    public Function2<? super Integer, ? super Integer, Unit> G;
    public int H;
    public int I;
    public a J;
    public a K;
    public TextView L;
    public TextView M;
    public TextView N;
    public final ssw<Boolean> O;
    public final ssw<Boolean> P;
    public final ssw<Boolean> Q;
    public final mz1 R;
    public FloatingActionButton a;
    public RecyclerView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView i;
    public RelativeLayout v;
    public RelativeLayout w;
    public LinearLayoutCompat y;
    public int z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("NOTHING", 0);
            a = aVar;
            a aVar2 = new a("SHOW", 1);
            b = aVar2;
            a aVar3 = new a("COMPLETE", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab8(e eVar, Boolean bool, String str, mz1 mz1Var) {
        super(eVar);
        str.getClass();
        this.A = "";
        this.B = true;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.H = 15;
        this.I = -15;
        a aVar = a.a;
        this.J = aVar;
        this.K = aVar;
        this.O = new ssw<>();
        this.P = new ssw<>();
        this.Q = new ssw<>();
        this.B = bool.booleanValue();
        this.A = str;
        this.R = mz1Var;
        setCancelable(true);
        setCanceledOnTouchOutside(false);
    }

    public final void a() {
        this.D.clear();
        this.E.clear();
        a aVar = a.a;
        this.J = aVar;
        this.K = aVar;
        this.I = -15;
        this.H = 15;
        RecyclerView.f adapter = b().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final RecyclerView b() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.n("recyclerView");
        throw null;
    }

    public final void c(zo2 zo2Var) {
        RecyclerView recyclerViewB = b();
        getContext();
        recyclerViewB.setLayoutManager(new LinearLayoutManager());
        s83 s83Var = new s83(this, 1);
        Function0<Unit> function0 = new Function0() { // from class: wa8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ab8 ab8Var = this.a;
                if (ab8Var.K == ab8.a.b) {
                    Function2<? super Integer, ? super Integer, Unit> function2 = ab8Var.G;
                    if (function2 == null) {
                        Intrinsics.n("betHistoryArchiveFetchManager");
                        throw null;
                    }
                    function2.invoke(Integer.valueOf(ab8Var.I + ab8Var.H), Integer.valueOf(ab8Var.H));
                }
                return Unit.a;
            }
        };
        zo2Var.b = s83Var;
        zo2Var.c = function0;
        b().setAdapter(zo2Var);
        op5 op5Var = op5.a;
        TextView textView = this.c;
        if (textView == null) {
            Intrinsics.n("time");
            throw null;
        }
        TextView textView2 = this.d;
        if (textView2 == null) {
            Intrinsics.n("stake");
            throw null;
        }
        TextView textView3 = this.e;
        if (textView3 == null) {
            Intrinsics.n(AnalyticsParam.EVENT_STATUS);
            throw null;
        }
        TextView textView4 = this.f;
        if (textView4 == null) {
            Intrinsics.n("coeff");
            throw null;
        }
        TextView textView5 = this.i;
        if (textView5 != null) {
            op5.r(op5Var, b.f(textView, textView2, textView3, textView4, textView5), null, 4);
        } else {
            Intrinsics.n("noRecordText");
            throw null;
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.sh_bethistory_container_v2);
        View viewFindViewById = findViewById(R.id.bet_history_close);
        viewFindViewById.getClass();
        this.a = (FloatingActionButton) viewFindViewById;
        this.v = (RelativeLayout) findViewById(R.id.loading_data);
        View viewFindViewById2 = findViewById(R.id.status_header);
        viewFindViewById2.getClass();
        this.e = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.stake_header);
        viewFindViewById3.getClass();
        this.d = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.time_header);
        viewFindViewById4.getClass();
        this.c = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.no_record_text);
        viewFindViewById5.getClass();
        this.i = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.coeff);
        viewFindViewById6.getClass();
        this.f = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.bethistory_container_list_layer);
        viewFindViewById7.getClass();
        this.w = (RelativeLayout) viewFindViewById7;
        MaterialCardView materialCardView = (MaterialCardView) findViewById(R.id.game_limit_container);
        String str = this.A;
        if (!c.l(str, "sporty-hero", true) && !c.l(str, "Sporty Hero", true) && !c.l(str, "Sporty Hero", true)) {
            int iL = r58.l(this.R.t0());
            RelativeLayout relativeLayout = this.w;
            if (relativeLayout == null) {
                Intrinsics.n("container");
                throw null;
            }
            relativeLayout.setBackgroundColor(iL);
            materialCardView.setStrokeWidth(0);
            materialCardView.setCardBackgroundColor(iL);
        }
        this.y = (LinearLayoutCompat) findViewById(R.id.no_record_found);
        View viewFindViewById8 = findViewById(R.id.bethistory_container_list);
        viewFindViewById8.getClass();
        this.b = (RecyclerView) viewFindViewById8;
        op5 op5Var = op5.a;
        TextView textView = this.c;
        if (textView == null) {
            Intrinsics.n("time");
            throw null;
        }
        TextView textView2 = this.d;
        if (textView2 == null) {
            Intrinsics.n("stake");
            throw null;
        }
        TextView textView3 = this.e;
        if (textView3 == null) {
            Intrinsics.n(AnalyticsParam.EVENT_STATUS);
            throw null;
        }
        TextView textView4 = this.i;
        if (textView4 == null) {
            Intrinsics.n("noRecordText");
            throw null;
        }
        TextView textView5 = this.f;
        if (textView5 == null) {
            Intrinsics.n("coeff");
            throw null;
        }
        op5.r(op5Var, b.f(textView, textView2, textView3, textView4, textView5), null, 4);
        View viewFindViewById9 = findViewById(R.id.ou_header);
        viewFindViewById9.getClass();
        this.L = (TextView) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.range_header);
        viewFindViewById10.getClass();
        this.M = (TextView) viewFindViewById10;
        View viewFindViewById11 = findViewById(R.id.classic_header);
        viewFindViewById11.getClass();
        this.N = (TextView) viewFindViewById11;
        View viewFindViewById12 = findViewById(R.id.bet_history_tab);
        viewFindViewById12.getClass();
        this.C = (ConstraintLayout) viewFindViewById12;
        TextView textView6 = this.c;
        if (textView6 == null) {
            Intrinsics.n("time");
            throw null;
        }
        TextView textView7 = this.d;
        if (textView7 == null) {
            Intrinsics.n("stake");
            throw null;
        }
        TextView textView8 = this.e;
        if (textView8 == null) {
            Intrinsics.n(AnalyticsParam.EVENT_STATUS);
            throw null;
        }
        TextView textView9 = this.i;
        if (textView9 == null) {
            Intrinsics.n("noRecordText");
            throw null;
        }
        TextView textView10 = this.f;
        if (textView10 == null) {
            Intrinsics.n("coeff");
            throw null;
        }
        TextView textView11 = this.N;
        if (textView11 == null) {
            Intrinsics.n("classicHeader");
            throw null;
        }
        TextView textView12 = this.L;
        if (textView12 == null) {
            Intrinsics.n("ouHeader");
            throw null;
        }
        TextView textView13 = this.M;
        if (textView13 == null) {
            Intrinsics.n("rangeHeader");
            throw null;
        }
        op5.r(op5Var, b.f(textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13), null, 4);
        FloatingActionButton floatingActionButton = this.a;
        if (floatingActionButton == null) {
            Intrinsics.n("closeButton");
            throw null;
        }
        int i = 0;
        floatingActionButton.setOnClickListener(new ya8(this, i));
        TextView textView14 = this.L;
        if (textView14 == null) {
            Intrinsics.n("ouHeader");
            throw null;
        }
        textView14.setOnClickListener(new za8(this, i));
        TextView textView15 = this.M;
        if (textView15 == null) {
            Intrinsics.n("rangeHeader");
            throw null;
        }
        int i2 = 1;
        textView15.setOnClickListener(new a93(this, i2));
        TextView textView16 = this.N;
        if (textView16 == null) {
            Intrinsics.n("classicHeader");
            throw null;
        }
        textView16.setOnClickListener(new b93(this, i2));
        TextView textView17 = this.N;
        if (textView17 == null) {
            Intrinsics.n("classicHeader");
            throw null;
        }
        textView17.setEnabled(false);
        if ((c.l(str, "sporty-hero", true) || c.l(str, "Sporty Hero", true) || c.l(str, "Sporty Hero", true)) && this.B) {
            SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
            if (!c.l(sportyGamesManager.getCountry(), "za", true) && !c.l(sportyGamesManager.getSubCountry(), "br", true)) {
                return;
            }
        }
        ConstraintLayout constraintLayout = this.C;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        } else {
            Intrinsics.n("betHistoryTab");
            throw null;
        }
    }
}
