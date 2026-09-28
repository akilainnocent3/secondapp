package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.ComposeCashOutModel;
import com.sportygames.commons.models.ComposeCoeffModel;
import com.sportygames.commons.models.PrizeInfo;
import com.sportygames.commons.tournament.model.TournamentJoinConfirmationData;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lw6g0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w6g0 extends Fragment {
    public x6g0 F;
    public String a;
    public String b;
    public Function1<? super Long, Unit> c;
    public Function1<? super Long, Unit> d;
    public long e;
    public boolean f;
    public String i = "";
    public String v = "";
    public String w = "";
    public String y = "";
    public String z = "";
    public String A = "";
    public String B = "";
    public String C = "";
    public String D = "";
    public List<PrizeInfo> E = m2g.a;
    public final ytw<ComposeCoeffModel> G = m.b(new ComposeCoeffModel("0.00x", new j58(a6g0.g), null));
    public final ytw<ComposeCashOutModel> H = m.b(new ComposeCashOutModel(null, null, false, false, 15, null));

    public static final class a {
        public static w6g0 a(String str, String str2, long j, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, Function1 function1, Function1 function2) {
            str4.getClass();
            str6.getClass();
            str7.getClass();
            str10.getClass();
            list.getClass();
            w6g0 w6g0Var = new w6g0();
            w6g0Var.a = str;
            w6g0Var.b = str2;
            w6g0Var.e = j;
            w6g0Var.c = function1;
            w6g0Var.d = function2;
            w6g0Var.f = z;
            w6g0Var.i = str3;
            w6g0Var.v = str4;
            w6g0Var.w = str5;
            w6g0Var.y = str6;
            w6g0Var.E = list;
            w6g0Var.z = str7;
            w6g0Var.A = str8;
            w6g0Var.B = str9;
            w6g0Var.C = str10;
            w6g0Var.D = str11;
            return w6g0Var;
        }
    }

    public static final class b implements lfy, paj {
        public final /* synthetic */ jzb0 a;

        public b(jzb0 jzb0Var) {
            this.a = jzb0Var;
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

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        final ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setContent(new op8(746819918, new Function2() { // from class: s6g0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                String str;
                String str2;
                int i;
                String strB;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ytw<Boolean> ytwVar = xag0.h;
                    isw iswVar = xag0.j;
                    ytw<Integer> ytwVar2 = xag0.k;
                    final ComposeView composeView2 = composeView;
                    Context context2 = composeView2.getContext();
                    final w6g0 w6g0Var = this;
                    if (context2 != null) {
                        if (k94.a(w6g0Var.w)) {
                            op5 op5Var = op5.a;
                            String string = context2.getString(R.string.now_cms);
                            string.getClass();
                            op5Var.getClass();
                            strB = op5.b(string, "Now", null);
                        } else {
                            String strG = k94.g(w6g0Var.w);
                            List listSplit$default = StringsKt__StringsKt.split$default(strG, new String[]{" "}, false, 0, 6, null);
                            if (listSplit$default == null || (str2 = (String) listSplit$default.get(0)) == null) {
                                str2 = "";
                            }
                            String str3 = "days";
                            if (StringsKt.M(strG, "days", false) || StringsKt.M(strG, "day", false)) {
                                if (str2.equals("1")) {
                                    str3 = "1 day";
                                    i = R.string.day_cms_tourney;
                                } else {
                                    i = R.string.days_cms;
                                }
                            } else if (StringsKt.M(strG, "hours", false) || StringsKt.M(strG, "hour", false)) {
                                if (str2.equals("1")) {
                                    str3 = "1 hour";
                                    i = R.string.hour_cms;
                                } else {
                                    str3 = "{value} hours";
                                    i = R.string.hours_cms;
                                }
                            } else if (StringsKt.M(strG, "minutes", false) || StringsKt.M(strG, "minute", false)) {
                                if (str2.equals("1")) {
                                    str3 = "1 minute";
                                    i = R.string.minute_cms;
                                } else {
                                    str3 = "{value} minutes";
                                    i = R.string.minutes_cms;
                                }
                            } else if (str2.equals("1")) {
                                str3 = "1 second";
                                i = R.string.second_cms;
                            } else {
                                str3 = "{value} seconds";
                                i = R.string.seconds_cms;
                            }
                            HashMap map = new HashMap();
                            map.put("{value}", str2);
                            op5 op5Var2 = op5.a;
                            String string2 = context2.getString(i);
                            string2.getClass();
                            op5Var2.getClass();
                            strB = op5.b(string2, str3, map);
                        }
                        str = strB;
                    } else {
                        str = "";
                    }
                    String strA = yk10.a(w6g0Var.a, "!");
                    String str4 = w6g0Var.b;
                    TournamentJoinConfirmationData tournamentJoinConfirmationData = new TournamentJoinConfirmationData(strA, str4 == null ? "" : str4, w6g0Var.f, w6g0Var.i, w6g0Var.v, str, w6g0Var.y, w6g0Var.z, k94.e(w6g0Var.A), k94.e(w6g0Var.B), w6g0Var.C, w6g0Var.D, ohg0.a(w6g0Var.E));
                    ytw<ComposeCoeffModel> ytwVar3 = w6g0Var.G;
                    ytw<ComposeCashOutModel> ytwVar4 = w6g0Var.H;
                    boolean zBooleanValue = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
                    float fFloatValue = iswVar.getValue().floatValue();
                    int iIntValue2 = ((Number) ((x5a0) ytwVar2).getValue()).intValue();
                    boolean zA = aVar.A(w6g0Var);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new yb3(w6g0Var, 2);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(w6g0Var);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new zb3(w6g0Var, 2);
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA3 = aVar.A(w6g0Var);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new Function0() { // from class: u6g0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                w6g0 w6g0Var2 = w6g0Var;
                                Function1<? super Long, Unit> function2 = w6g0Var2.d;
                                if (function2 != null) {
                                    function2.invoke(Long.valueOf(w6g0Var2.e));
                                }
                                if (!w6g0Var2.isRemoving()) {
                                    w6g0Var2.getParentFragmentManager().Y();
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY3);
                    }
                    Function0 function2 = (Function0) objY3;
                    boolean zA4 = aVar.A(composeView2);
                    Object objY4 = aVar.y();
                    if (zA4 || objY4 == c0042a) {
                        objY4 = new bc3(composeView2, 1);
                        aVar.r(objY4);
                    }
                    Function0 function3 = (Function0) objY4;
                    boolean zA5 = aVar.A(composeView2);
                    Object objY5 = aVar.y();
                    if (zA5 || objY5 == c0042a) {
                        objY5 = new Function0() { // from class: v6g0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Intent intent = new Intent("cashoutCall");
                                intent.putExtra("betIndex", 2);
                                Context context3 = composeView2.getContext();
                                if (context3 != null) {
                                    fdt.a(context3).c(intent);
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY5);
                    }
                    j8g0.c(tournamentJoinConfirmationData, function0, function1, function2, ytwVar3, ytwVar4, function3, (Function0) objY5, zBooleanValue, fFloatValue, iIntValue2, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        x6g0 x6g0Var;
        super.onPause();
        Context context = getContext();
        if (context == null || (x6g0Var = this.F) == null) {
            return;
        }
        fdt.a(context).d(x6g0Var);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        x6g0 x6g0Var;
        super.onResume();
        Context context = getContext();
        if (context == null || (x6g0Var = this.F) == null) {
            return;
        }
        fdt.a(context).b(x6g0Var, new IntentFilter("custom-event-name"));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: t6g0
            @Override // java.lang.Runnable
            public final void run() {
                FragmentManager supportFragmentManager;
                w6g0 w6g0Var = this.a;
                try {
                    e activity = w6g0Var.getActivity();
                    if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                        return;
                    }
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                    aVar.p(w6g0Var);
                    aVar.k(true, true);
                } catch (Exception unused) {
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.F = new x6g0(this);
        mqw.a.f(getViewLifecycleOwner(), new b(new jzb0(this, 1)));
    }
}
