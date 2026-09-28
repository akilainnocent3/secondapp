package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportyherov2.remote.models.DetailResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class rj60 extends Dialog {
    public ConstraintLayout A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public List<DetailResponse> a;
    public Function0<Unit> b;
    public FloatingActionButton c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView i;
    public TextView v;
    public TextView w;
    public boolean y;
    public ConstraintLayout z;

    public rj60(e eVar) {
        super(eVar);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.sh_game_limits_v2);
        View viewFindViewById = findViewById(R.id.game_limit_close);
        viewFindViewById.getClass();
        this.c = (FloatingActionButton) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.text);
        viewFindViewById2.getClass();
        this.d = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.note);
        viewFindViewById3.getClass();
        this.w = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.classic_detail);
        viewFindViewById4.getClass();
        this.z = (ConstraintLayout) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.game_mode_detail);
        viewFindViewById5.getClass();
        this.A = (ConstraintLayout) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.classic_max_payout_per_bet);
        viewFindViewById6.getClass();
        this.e = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.ou_max_payout_per_bet);
        viewFindViewById7.getClass();
        this.f = (TextView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.range_max_payout_per_bet);
        viewFindViewById8.getClass();
        this.i = (TextView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.max_payout_text_value);
        viewFindViewById9.getClass();
        this.v = (TextView) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.classic_mode);
        viewFindViewById10.getClass();
        this.B = (TextView) viewFindViewById10;
        View viewFindViewById11 = findViewById(R.id.ou_mode);
        viewFindViewById11.getClass();
        this.C = (TextView) viewFindViewById11;
        View viewFindViewById12 = findViewById(R.id.range_mode);
        viewFindViewById12.getClass();
        this.D = (TextView) viewFindViewById12;
        View viewFindViewById13 = findViewById(R.id.max_payout_text);
        viewFindViewById13.getClass();
        this.E = (TextView) viewFindViewById13;
        View viewFindViewById14 = findViewById(R.id.mode);
        viewFindViewById14.getClass();
        this.F = (TextView) viewFindViewById14;
        View viewFindViewById15 = findViewById(R.id.max_payout_per_bet);
        viewFindViewById15.getClass();
        this.G = (TextView) viewFindViewById15;
        z4f z4fVar = new z4f(this, 1);
        FloatingActionButton floatingActionButton = this.c;
        if (floatingActionButton == null) {
            Intrinsics.n("closeButton");
            throw null;
        }
        floatingActionButton.setOnClickListener(new z6p(z4fVar, 1));
        List<DetailResponse> list = this.a;
        if (list == null) {
            Intrinsics.n("detailResponse");
            throw null;
        }
        if (!list.isEmpty()) {
            if (this.y) {
                ConstraintLayout constraintLayout = this.A;
                if (constraintLayout == null) {
                    Intrinsics.n("gameModeDetail");
                    throw null;
                }
                constraintLayout.setVisibility(0);
                ConstraintLayout constraintLayout2 = this.z;
                if (constraintLayout2 == null) {
                    Intrinsics.n("classicDetail");
                    throw null;
                }
                constraintLayout2.setVisibility(8);
                TextView textView = this.e;
                if (textView == null) {
                    Intrinsics.n("classicMaxPayoutPerBet");
                    throw null;
                }
                op5 op5Var = op5.a;
                List<DetailResponse> list2 = this.a;
                if (list2 == null) {
                    Intrinsics.n("detailResponse");
                    throw null;
                }
                String strA = qj60.a(list2.get(0), op5Var);
                TreeMap treeMap = pw.a;
                List<DetailResponse> list3 = this.a;
                if (list3 == null) {
                    Intrinsics.n("detailResponse");
                    throw null;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list3) {
                    if (Intrinsics.g(((DetailResponse) obj).getBetCategoryEnum(), "CLASSIC")) {
                        arrayList.add(obj);
                    }
                }
                hu1.b(strA, " ", pw.n(((DetailResponse) arrayList.get(0)).getMaxPayoutAmount()), textView);
                TextView textView2 = this.f;
                if (textView2 == null) {
                    Intrinsics.n("ouMaxPayoutPerBet");
                    throw null;
                }
                op5 op5Var2 = op5.a;
                List<DetailResponse> list4 = this.a;
                if (list4 == null) {
                    Intrinsics.n("detailResponse");
                    throw null;
                }
                String strA2 = qj60.a(list4.get(0), op5Var2);
                TreeMap treeMap2 = pw.a;
                List<DetailResponse> list5 = this.a;
                if (list5 == null) {
                    Intrinsics.n("detailResponse");
                    throw null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list5) {
                    if (Intrinsics.g(((DetailResponse) obj2).getBetCategoryEnum(), "OVER_UNDER")) {
                        arrayList2.add(obj2);
                    }
                }
                hu1.b(strA2, " ", pw.n(((DetailResponse) arrayList2.get(0)).getMaxPayoutAmount()), textView2);
                TextView textView3 = this.i;
                if (textView3 == null) {
                    Intrinsics.n("rangeMaxPayoutPerBet");
                    throw null;
                }
                op5 op5Var3 = op5.a;
                List<DetailResponse> list6 = this.a;
                if (list6 == null) {
                    Intrinsics.n("detailResponse");
                    throw null;
                }
                String strA3 = qj60.a(list6.get(0), op5Var3);
                TreeMap treeMap3 = pw.a;
                List<DetailResponse> list7 = this.a;
                if (list7 == null) {
                    Intrinsics.n("detailResponse");
                    throw null;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list7) {
                    if (Intrinsics.g(((DetailResponse) obj3).getBetCategoryEnum(), "RANGE")) {
                        arrayList3.add(obj3);
                    }
                }
                hu1.b(strA3, " ", pw.n(((DetailResponse) arrayList3.get(0)).getMaxPayoutAmount()), textView3);
                TextView textView4 = this.w;
                if (textView4 == null) {
                    Intrinsics.n("note");
                    throw null;
                }
                textView4.setTag(getContext().getString(R.string.game_limit_cashout_note_with_sidebets_cms));
            } else {
                ConstraintLayout constraintLayout3 = this.z;
                if (constraintLayout3 == null) {
                    Intrinsics.n("classicDetail");
                    throw null;
                }
                constraintLayout3.setVisibility(0);
                ConstraintLayout constraintLayout4 = this.A;
                if (constraintLayout4 == null) {
                    Intrinsics.n("gameModeDetail");
                    throw null;
                }
                constraintLayout4.setVisibility(8);
                TextView textView5 = this.v;
                if (textView5 == null) {
                    Intrinsics.n("maxPayoutTextValue");
                    throw null;
                }
                op5 op5Var4 = op5.a;
                List<DetailResponse> list8 = this.a;
                if (list8 == null) {
                    Intrinsics.n("detailResponse");
                    throw null;
                }
                String strA4 = qj60.a(list8.get(0), op5Var4);
                TreeMap treeMap4 = pw.a;
                List<DetailResponse> list9 = this.a;
                if (list9 == null) {
                    Intrinsics.n("detailResponse");
                    throw null;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list9) {
                    if (Intrinsics.g(((DetailResponse) obj4).getBetCategoryEnum(), "CLASSIC")) {
                        arrayList4.add(obj4);
                    }
                }
                hu1.b(strA4, " ", pw.n(((DetailResponse) arrayList4.get(0)).getMaxPayoutAmount()), textView5);
                TextView textView6 = this.w;
                if (textView6 == null) {
                    Intrinsics.n("note");
                    throw null;
                }
                textView6.setTag(getContext().getString(R.string.game_limit_cashout_note_cms));
            }
        }
        op5 op5Var5 = op5.a;
        TextView textView7 = this.w;
        if (textView7 == null) {
            Intrinsics.n("note");
            throw null;
        }
        TextView textView8 = this.d;
        if (textView8 == null) {
            Intrinsics.n("title");
            throw null;
        }
        TextView textView9 = this.B;
        if (textView9 == null) {
            Intrinsics.n("classicMode");
            throw null;
        }
        TextView textView10 = this.C;
        if (textView10 == null) {
            Intrinsics.n("ouMode");
            throw null;
        }
        TextView textView11 = this.D;
        if (textView11 == null) {
            Intrinsics.n("rangeMode");
            throw null;
        }
        TextView textView12 = this.E;
        if (textView12 == null) {
            Intrinsics.n("maxPayoutText");
            throw null;
        }
        TextView textView13 = this.F;
        if (textView13 == null) {
            Intrinsics.n("mode");
            throw null;
        }
        TextView textView14 = this.G;
        if (textView14 == null) {
            Intrinsics.n("maxPayoutPerBet");
            throw null;
        }
        op5.r(op5Var5, b.f(textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14), null, 6);
    }
}
