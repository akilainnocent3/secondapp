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
import java.util.ArrayList;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class oh60 extends Dialog {
    public uw10 A;
    public int B;
    public int C;
    public a D;
    public a E;
    public FloatingActionButton a;
    public RecyclerView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public RelativeLayout i;
    public LinearLayoutCompat v;
    public final ArrayList w;
    public final ArrayList y;
    public tw10 z;

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

    public oh60(e eVar) {
        super(eVar);
        this.w = new ArrayList();
        this.y = new ArrayList();
        this.B = 15;
        this.C = -15;
        a aVar = a.a;
        this.D = aVar;
        this.E = aVar;
        setCancelable(true);
        setCanceledOnTouchOutside(false);
    }

    public final void a() {
        this.w.clear();
        this.y.clear();
        a aVar = a.a;
        this.D = aVar;
        this.E = aVar;
        this.C = -15;
        this.B = 15;
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

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.pr_bet_history);
        View viewFindViewById = findViewById(R.id.bet_history_close);
        viewFindViewById.getClass();
        this.a = (FloatingActionButton) viewFindViewById;
        this.i = (RelativeLayout) findViewById(R.id.loading_data);
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
        this.f = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.bethistory_container_list_layer);
        viewFindViewById6.getClass();
        this.v = (LinearLayoutCompat) findViewById(R.id.no_record_found);
        View viewFindViewById7 = findViewById(R.id.bethistory_container_list);
        viewFindViewById7.getClass();
        this.b = (RecyclerView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.rocket);
        viewFindViewById8.getClass();
        TextView textView = (TextView) viewFindViewById8;
        op5 op5Var = op5.a;
        TextView textView2 = this.c;
        if (textView2 == null) {
            Intrinsics.n("time");
            throw null;
        }
        TextView textView3 = this.d;
        if (textView3 == null) {
            Intrinsics.n("stake");
            throw null;
        }
        TextView textView4 = this.e;
        if (textView4 == null) {
            Intrinsics.n(AnalyticsParam.EVENT_STATUS);
            throw null;
        }
        TextView textView5 = this.f;
        if (textView5 == null) {
            Intrinsics.n("noRecordText");
            throw null;
        }
        op5.r(op5Var, b.f(textView2, textView3, textView4, textView5, textView), null, 4);
        FloatingActionButton floatingActionButton = this.a;
        if (floatingActionButton != null) {
            floatingActionButton.setOnClickListener(new g3p(this, 1));
        } else {
            Intrinsics.n("closeButton");
            throw null;
        }
    }
}
