package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.PopupWindow;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.data.PreMatchFilterType;
import com.sportybet.plugin.realsports.prematch.data.PreMatchSortType;
import com.sportybet.plugin.realsports.prematch.widget.PreMatchFiltersContainer;
import com.sportybet.plugin.realsports.sportssoccer.expandview.PopOneListView;
import com.sportybet.plugin.realsports.sportssoccer.expandview.RegionsListView;
import com.sportybet.plugin.realsports.sportssoccer.expandview.TimeFilterPopupView;
import com.sportybet.plugin.realsports.widget.OddsFilterSettingView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ymh {
    public final Context a;
    public PreMatchSportActivity.b b;
    public yec c;
    public final mpe0 d;
    public final mpe0 e;
    public final mpe0 g;
    public final mpe0 h;
    public final mpe0 i;
    public final ArrayList l;
    public final ArrayList m;
    public final mpe0 f = hwr.b(new Function0() { // from class: qmh
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            final ymh ymhVar = this.a;
            RegionsListView regionsListView = new RegionsListView(ymhVar.a);
            regionsListView.setDismissListener(new View.OnClickListener() { // from class: vmh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yec yecVar = ymhVar.c;
                    if (yecVar != null) {
                        yecVar.dismiss();
                    }
                }
            });
            regionsListView.d(ymhVar.m);
            regionsListView.setOnApplyClickListener(new RegionsListView.a() { // from class: wmh
                @Override // com.sportybet.plugin.realsports.sportssoccer.expandview.RegionsListView.a
                public final void a(String str, boolean z) {
                    ymh ymhVar2 = ymhVar;
                    yec yecVar = ymhVar2.c;
                    ArrayList arrayList = ymhVar2.l;
                    if (yecVar != null) {
                        yecVar.dismiss();
                    }
                    if (z) {
                        Integer numB = ymhVar2.b();
                        PreMatchSortType preMatchSortType = PreMatchSortType.DEFAULT;
                        int value = preMatchSortType.getValue();
                        if (numB == null || numB.intValue() != value) {
                            ymh.d(String.valueOf(preMatchSortType.getValue()), arrayList);
                        }
                    }
                    if (!rs40.b().c().isEmpty()) {
                        ymh.d(String.valueOf(PreMatchSortType.LEAGUE.getValue()), arrayList);
                    }
                    Integer numB2 = ymhVar2.b();
                    int iIntValue = numB2 != null ? numB2.intValue() : PreMatchSortType.DEFAULT.getValue();
                    PreMatchSportActivity.b bVar = ymhVar2.b;
                    if (bVar != null) {
                        str.getClass();
                        PreMatchSportActivity preMatchSportActivity = bVar.a;
                        preMatchSportActivity.P = true;
                        PreMatchFiltersContainer preMatchFiltersContainer = bVar.b.c;
                        preMatchFiltersContainer.a(str);
                        preMatchFiltersContainer.c(iIntValue);
                        jk20 jk20VarI1 = preMatchSportActivity.I1();
                        jk20VarI1.D = iIntValue;
                        ArrayList arrayList2 = jk20VarI1.z;
                        k48.a(arrayList2, rs40.b().c());
                        arrayList2.remove("sr_select_item_id");
                        jk20VarI1.x1();
                        preMatchSportActivity.G1().x1(preMatchSportActivity.I1().e);
                        preMatchSportActivity.P1();
                    }
                }
            });
            return regionsListView;
        }
    });
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PreMatchFilterType.values().length];
            try {
                iArr[PreMatchFilterType.SPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreMatchFilterType.TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreMatchFilterType.LEAGUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PreMatchFilterType.ODDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PreMatchFilterType.SORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public ymh(Context context) {
        this.a = context;
        int i = 0;
        this.d = hwr.b(new emh(this, i));
        this.e = hwr.b(new pmh(this, i));
        this.g = hwr.b(new rmh(this, i));
        this.h = hwr.b(new smh(this, i));
        this.i = hwr.b(new tmh(this, i));
        ArrayList arrayList = new ArrayList();
        this.l = arrayList;
        this.m = new ArrayList();
        PreMatchSortType preMatchSortType = PreMatchSortType.DEFAULT;
        yoa0 yoa0Var = new yoa0(String.valueOf(preMatchSortType.getValue()), sn5.b(context, R.string.common_functions__default, new Object[0]), preMatchSortType.getValue());
        PreMatchSortType preMatchSortType2 = PreMatchSortType.TIME;
        yoa0 yoa0Var2 = new yoa0(String.valueOf(preMatchSortType2.getValue()), sn5.b(context, R.string.common_functions__time, new Object[0]), preMatchSortType2.getValue());
        PreMatchSortType preMatchSortType3 = PreMatchSortType.LEAGUE;
        arrayList.addAll(b.k(yoa0Var, yoa0Var2, new yoa0(String.valueOf(preMatchSortType3.getValue()), sn5.b(context, R.string.common_functions__league, new Object[0]), preMatchSortType3.getValue())));
        ((g1f0) arrayList.get(0)).c = true;
    }

    public static void d(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g1f0 g1f0Var = (g1f0) it.next();
            g1f0Var.c = Intrinsics.g(g1f0Var.a, str);
        }
    }

    public final void a(PreMatchFilterType preMatchFilterType, View view) {
        View view2;
        preMatchFilterType.getClass();
        yec yecVar = this.c;
        if (yecVar != null && yecVar.isShowing()) {
            yecVar.dismiss();
        }
        int i = a.a[preMatchFilterType.ordinal()];
        if (i == 1) {
            PopOneListView popOneListViewC = c();
            g220 g220Var = popOneListViewC.e;
            if (g220Var != null) {
                popOneListViewC.f.removeCallbacks(g220Var);
            }
            popOneListViewC.i = true;
            view2 = popOneListViewC;
        } else if (i == 2) {
            TimeFilterPopupView timeFilterPopupView = (TimeFilterPopupView) this.e.getValue();
            timeFilterPopupView.c(this.k);
            view2 = timeFilterPopupView;
        } else if (i == 3) {
            RegionsListView regionsListView = (RegionsListView) this.f.getValue();
            regionsListView.d(this.m);
            view2 = regionsListView;
        } else if (i == 4) {
            view2 = (OddsFilterSettingView) this.g.getValue();
        } else {
            if (i != 5) {
                uhc.a();
                return;
            }
            view2 = (PopOneListView) this.h.getValue();
        }
        yec yecVar2 = this.c;
        yec yecVar3 = yecVar2;
        if (yecVar2 == null) {
            final yec yecVar4 = new yec(view2);
            yecVar4.setFocusable(true);
            yecVar4.setOutsideTouchable(true);
            yecVar4.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: umh
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v3, types: [g220, java.lang.Runnable] */
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    yec yecVar5 = yecVar4;
                    View contentView = yecVar5.getContentView();
                    ymh ymhVar = this;
                    if (Intrinsics.g(contentView, (OddsFilterSettingView) ymhVar.g.getValue())) {
                        OddsFilterSettingView oddsFilterSettingView = (OddsFilterSettingView) ymhVar.g.getValue();
                        oddsFilterSettingView.K.setProgress(oddsFilterSettingView.S, oddsFilterSettingView.T);
                    } else if (Intrinsics.g(yecVar5.getContentView(), ymhVar.c())) {
                        final PopOneListView popOneListViewC2 = ymhVar.c();
                        Handler handler = popOneListViewC2.f;
                        ?? r2 = new Runnable() { // from class: g220
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2 = PopOneListView.v;
                                popOneListViewC2.i = false;
                            }
                        };
                        popOneListViewC2.e = r2;
                        handler.postDelayed(r2, 300L);
                    }
                    PreMatchSportActivity.b bVar = ymhVar.b;
                    if (bVar != null) {
                        fjd0 fjd0Var = bVar.b.c.a;
                        fjd0Var.e.setExpanded(false, 300);
                        fjd0Var.b.setExpanded(false, 300);
                        fjd0Var.c.setExpanded(false, 300);
                        fjd0Var.d.setExpanded(false, 300);
                    }
                }
            });
            this.c = yecVar4;
            yecVar3 = yecVar4;
        }
        if (!Intrinsics.g(yecVar3.getContentView(), view2)) {
            yecVar3.setContentView(view2);
        }
        yecVar3.b(Intrinsics.g(view2, c()) ? 0 : ((Number) this.i.getValue()).intValue(), view);
    }

    public final Integer b() {
        Object obj;
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
        } while (!((g1f0) obj).c);
        g1f0 g1f0Var = (g1f0) obj;
        if (g1f0Var != null) {
            if (!(g1f0Var instanceof yoa0)) {
                g1f0Var = null;
            }
            yoa0 yoa0Var = (yoa0) g1f0Var;
            if (yoa0Var != null) {
                return Integer.valueOf(yoa0Var.d);
            }
        }
        return null;
    }

    public final PopOneListView c() {
        return (PopOneListView) this.d.getValue();
    }
}
