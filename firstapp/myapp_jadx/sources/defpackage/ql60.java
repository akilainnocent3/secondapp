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

/* JADX INFO: loaded from: classes8.dex */
public final class ql60 extends Dialog {
    public final boolean A;
    public final ArrayList B;
    public final ArrayList C;
    public Function2<? super Integer, ? super Integer, Unit> D;
    public Function2<? super Integer, ? super Integer, Unit> E;
    public int F;
    public int G;
    public a H;
    public a I;
    public TextView J;
    public TextView K;
    public TextView L;
    public final ssw<Boolean> M;
    public final ssw<Boolean> N;
    public final ssw<Boolean> O;
    public FloatingActionButton a;
    public RecyclerView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public ConstraintLayout i;
    public TextView v;
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

    public ql60(e eVar, Boolean bool) {
        super(eVar);
        this.A = true;
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.F = 15;
        this.G = -15;
        a aVar = a.a;
        this.H = aVar;
        this.I = aVar;
        this.M = new ssw<>();
        this.N = new ssw<>();
        this.O = new ssw<>();
        this.A = bool != null ? bool.booleanValue() : true;
        setCancelable(false);
    }

    public final void a() {
        this.B.clear();
        this.C.clear();
        a aVar = a.a;
        this.H = aVar;
        this.I = aVar;
        this.G = -15;
        this.F = 15;
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

    public final void c(tl60 tl60Var) {
        RecyclerView recyclerViewB = b();
        getContext();
        recyclerViewB.setLayoutManager(new LinearLayoutManager());
        Function0<Unit> function0 = new Function0() { // from class: nl60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ql60 ql60Var = this.a;
                if (ql60Var.H == ql60.a.b) {
                    Function2<? super Integer, ? super Integer, Unit> function2 = ql60Var.D;
                    if (function2 == null) {
                        Intrinsics.n("betHistoryFetchManager");
                        throw null;
                    }
                    function2.invoke(Integer.valueOf(ql60Var.G + ql60Var.F), Integer.valueOf(ql60Var.F));
                }
                return Unit.a;
            }
        };
        Function0<Unit> function1 = new Function0() { // from class: ol60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ql60 ql60Var = this.a;
                if (ql60Var.I == ql60.a.b) {
                    Function2<? super Integer, ? super Integer, Unit> function2 = ql60Var.E;
                    if (function2 == null) {
                        Intrinsics.n("betHistoryArchiveFetchManager");
                        throw null;
                    }
                    function2.invoke(Integer.valueOf(ql60Var.G + ql60Var.F), Integer.valueOf(ql60Var.F));
                }
                return Unit.a;
            }
        };
        tl60Var.b = function0;
        tl60Var.c = function1;
        b().setAdapter(tl60Var);
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
        TextView textView5 = this.v;
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
        int i = 1;
        requestWindowFeature(1);
        setContentView(R.layout.sh_bethistory_container_v2);
        View viewFindViewById = findViewById(R.id.bet_history_close);
        viewFindViewById.getClass();
        this.a = (FloatingActionButton) viewFindViewById;
        this.w = (RelativeLayout) findViewById(R.id.loading_data);
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
        this.v = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.coeff);
        viewFindViewById6.getClass();
        this.f = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.bethistory_container_list_layer);
        viewFindViewById7.getClass();
        this.y = (LinearLayoutCompat) findViewById(R.id.no_record_found);
        View viewFindViewById8 = findViewById(R.id.bethistory_container_list);
        viewFindViewById8.getClass();
        this.b = (RecyclerView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.ou_header);
        viewFindViewById9.getClass();
        this.J = (TextView) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.range_header);
        viewFindViewById10.getClass();
        this.K = (TextView) viewFindViewById10;
        View viewFindViewById11 = findViewById(R.id.classic_header);
        viewFindViewById11.getClass();
        this.L = (TextView) viewFindViewById11;
        View viewFindViewById12 = findViewById(R.id.bet_history_tab);
        viewFindViewById12.getClass();
        this.i = (ConstraintLayout) viewFindViewById12;
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
        TextView textView4 = this.v;
        if (textView4 == null) {
            Intrinsics.n("noRecordText");
            throw null;
        }
        TextView textView5 = this.f;
        if (textView5 == null) {
            Intrinsics.n("coeff");
            throw null;
        }
        TextView textView6 = this.L;
        if (textView6 == null) {
            Intrinsics.n("classicHeader");
            throw null;
        }
        TextView textView7 = this.J;
        if (textView7 == null) {
            Intrinsics.n("ouHeader");
            throw null;
        }
        TextView textView8 = this.K;
        if (textView8 == null) {
            Intrinsics.n("rangeHeader");
            throw null;
        }
        op5.r(op5Var, b.f(textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8), null, 4);
        FloatingActionButton floatingActionButton = this.a;
        if (floatingActionButton == null) {
            Intrinsics.n("closeButton");
            throw null;
        }
        floatingActionButton.setOnClickListener(new View.OnClickListener() { // from class: ll60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ql60 ql60Var = this.a;
                ql60Var.a();
                ql60Var.dismiss();
                wz.a("popup_action", "Sporty Hero", "bet history", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
            }
        });
        TextView textView9 = this.J;
        if (textView9 == null) {
            Intrinsics.n("ouHeader");
            throw null;
        }
        textView9.setOnClickListener(new nuj(this, 2));
        TextView textView10 = this.K;
        if (textView10 == null) {
            Intrinsics.n("rangeHeader");
            throw null;
        }
        textView10.setOnClickListener(new kb20(this, i));
        TextView textView11 = this.L;
        if (textView11 == null) {
            Intrinsics.n("classicHeader");
            throw null;
        }
        textView11.setOnClickListener(new mb20(this, 1));
        TextView textView12 = this.L;
        if (textView12 == null) {
            Intrinsics.n("classicHeader");
            throw null;
        }
        textView12.setEnabled(false);
        if (c.l(SportyGamesManager.getInstance().getCountry(), "za", true) || c.l(SportyGamesManager.getInstance().getSubCountry(), "br", true) || !this.A) {
            ConstraintLayout constraintLayout = this.i;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            } else {
                Intrinsics.n("betHistoryTab");
                throw null;
            }
        }
    }
}
