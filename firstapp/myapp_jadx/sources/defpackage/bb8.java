package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.enums.PagingFetchType;
import com.sportygames.crashInitiated.model.response.BetHistoryItem;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class bb8 extends Dialog {
    public final ArrayList A;
    public final ArrayList B;
    public wlb C;
    public xlb D;
    public int E;
    public int F;
    public a G;
    public a H;
    public final mz1 I;
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
    public bb8(e eVar, String str, mz1 mz1Var) {
        super(eVar);
        str.getClass();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.E = 15;
        this.F = -15;
        a aVar = a.a;
        this.G = aVar;
        this.H = aVar;
        new ssw();
        new ssw();
        new ssw();
        this.I = mz1Var;
        setCancelable(true);
        setCanceledOnTouchOutside(false);
    }

    public final void a(ArrayList<BetHistoryItem> arrayList, Integer num, int i, int i2, PagingFetchType pagingFetchType) {
        a aVar;
        a aVar2;
        pagingFetchType.getClass();
        ArrayList arrayList2 = this.B;
        ArrayList arrayList3 = this.A;
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
            arrayList2.addAll(arrayList);
        }
        this.F = i;
        this.E = i2;
        int size = arrayList != null ? arrayList.size() : 0;
        if (pagingFetchType == PagingFetchType.VIEW_MORE && ((aVar2 = this.G) == a.a || aVar2 == a.b)) {
            a aVar3 = (num == null || num.intValue() <= arrayList3.size()) ? a.c : a.b;
            this.G = aVar3;
            this.z = arrayList3.size();
        }
        if (pagingFetchType == PagingFetchType.ARCHIVE_MORE && ((aVar = this.G) == a.a || aVar == a.b)) {
            a aVar4 = a.c;
            this.G = aVar4;
            if (num != null && size >= 15) {
                aVar4 = a.b;
            }
            this.H = aVar4;
            int size2 = arrayList3.size();
            int i3 = this.E;
            this.z = size2 - i3;
            this.F = i3 - 15;
            this.E = 15;
        }
        a aVar5 = this.G;
        a aVar6 = a.c;
        if (aVar5 == aVar6) {
            a aVar7 = this.H;
            a aVar8 = a.b;
            if (aVar7 == aVar8) {
                if (num == null || num.intValue() <= arrayList3.size() - this.z) {
                    aVar8 = aVar6;
                }
                this.H = aVar8;
            }
        }
        if (this.G == aVar6 && this.H == a.a) {
            this.F = -15;
            this.E = 15;
            this.H = a.b;
        }
        if (arrayList != null) {
            RecyclerView.f adapter = c().getAdapter();
            adapter.getClass();
            pn80 pn80Var = (pn80) adapter;
            ArrayList arrayListC0 = CollectionsKt.C0(arrayList2);
            a aVar9 = this.G;
            a aVar10 = a.b;
            ej5.c(pn80Var.d, null, null, new dp2(arrayListC0, aVar9 == aVar10, this.H == aVar10, pn80Var, null), 3);
        }
        RecyclerView.f adapter2 = c().getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final void b() {
        this.A.clear();
        this.B.clear();
        a aVar = a.a;
        this.G = aVar;
        this.H = aVar;
        this.F = -15;
        this.E = 15;
        RecyclerView.f adapter = c().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final RecyclerView c() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.n("recyclerView");
        throw null;
    }

    public final void d(boolean z) {
        RelativeLayout relativeLayout = this.v;
        if (relativeLayout != null && this.F < 0) {
            relativeLayout.setVisibility(z ? 0 : 8);
        }
    }

    public final void e(boolean z) {
        LinearLayoutCompat linearLayoutCompat = this.y;
        if (linearLayoutCompat != null) {
            linearLayoutCompat.setVisibility(z ? 0 : 8);
        }
        c().setVisibility(0);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.pp_bethistory_container);
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
        int iL = r58.l(this.I.t0());
        RelativeLayout relativeLayout = this.w;
        if (relativeLayout == null) {
            Intrinsics.n("container");
            throw null;
        }
        relativeLayout.setBackgroundColor(iL);
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
        FloatingActionButton floatingActionButton = this.a;
        if (floatingActionButton != null) {
            floatingActionButton.setOnClickListener(new View.OnClickListener() { // from class: ua8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bb8 bb8Var = this.a;
                    bb8Var.b();
                    bb8Var.dismiss();
                    wz.a("popup_action", "Ping Pong", "bet history", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                }
            });
        } else {
            Intrinsics.n("closeButton");
            throw null;
        }
    }
}
