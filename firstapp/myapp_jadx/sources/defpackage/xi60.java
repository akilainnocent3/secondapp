package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.m;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i0;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.GiftItemKt;
import com.sportygames.commons.models.enums.GiftUseType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lxi60;", "Lw4;", "<init>", "()V", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class xi60 extends w4 {
    public ho80 a;
    public ri60 b;
    public gaj<? super GiftItem, ? super Double, ? super Boolean, Unit> d;
    public Function0<Unit> e;
    public Function0<Unit> c = new ena(1);
    public String f = "";
    public String i = "";
    public String v = "";
    public String w = "";

    public static final class a {
        public final GiftItem a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public GiftUseType g;
        public final boolean h;
        public final boolean i;
        public final double j;
        public final String k;
        public GiftUseType l;
        public final double m;
        public String n;
        public int o;
        public final String p;

        public a(GiftItem giftItem, String str, String str2, String str3, String str4, String str5, GiftUseType giftUseType, boolean z, boolean z2, double d, String str6, GiftUseType giftUseType2, double d2, int i, String str7) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            giftUseType.getClass();
            giftUseType2.getClass();
            str7.getClass();
            this.a = giftItem;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = giftUseType;
            this.h = z;
            this.i = z2;
            this.j = d;
            this.k = str6;
            this.l = giftUseType2;
            this.m = d2;
            this.n = "";
            this.o = i;
            this.p = str7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e) && this.f.equals(aVar.f) && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && Double.compare(this.j, aVar.j) == 0 && this.k.equals(aVar.k) && this.l == aVar.l && Double.compare(this.m, aVar.m) == 0 && this.n.equals(aVar.n) && this.o == aVar.o && this.p.equals(aVar.p);
        }

        public final int hashCode() {
            return this.p.hashCode() + gpp.a(this.o, gmf0.a(nrg0.a((this.l.hashCode() + gmf0.a(nrg0.a(mtg0.a(mtg0.a((this.g.hashCode() + mtg0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, true)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31, 31, this.m), 31, this.n), 31);
        }

        public final String toString() {
            GiftUseType giftUseType = this.g;
            GiftUseType giftUseType2 = this.l;
            String str = this.n;
            int i = this.o;
            StringBuilder sb = new StringBuilder("GiftItemExtendV2(giftItem=");
            sb.append(this.a);
            sb.append(", currency=");
            sb.append(this.b);
            sb.append(", currentBalanceText=");
            hxa.c(sb, this.c, ", availableText=", this.d, ", expiryText=");
            hxa.c(sb, this.e, ", giftAmount=", this.f, ", expand=true, giftUseType=");
            sb.append(giftUseType);
            sb.append(", isAllDisable=");
            sb.append(this.h);
            sb.append(", isCardDisable=");
            sb.append(this.i);
            sb.append(", maxPartialAmount=");
            sb.append(this.j);
            sb.append(", partialTextPlaceHolder=");
            sb.append(this.k);
            sb.append(", selectedGiftType=");
            sb.append(giftUseType2);
            hib0.b(this.m, ", minPartialAmount=", ", userInput=", sb);
            wxa.b(i, str, ", userSelection=", ", offOrLeftText=", sb);
            return uf80.a(sb, this.p, ")");
        }
    }

    public static final class b extends RecyclerView.x {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            motionEvent.getClass();
            return xi60.this.p0();
        }
    }

    @c0d(c = "com.sportygames.commons.components.SGFreeBetGiftDialogV2$setGiftItems$1", f = "SGFreeBetGiftDialogV2.kt", l = {222}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ double c;
        public final /* synthetic */ double d;
        public final /* synthetic */ double e;
        public final /* synthetic */ List<GiftItem> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(double d, double d2, double d3, List<GiftItem> list, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = d;
            this.d = d2;
            this.e = d3;
            this.f = list;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return xi60.this.new c(this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, ri60] */
        /* JADX WARN: Type inference failed for: r2v40 */
        /* JADX WARN: Type inference failed for: r31v0, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r31v1, types: [java.lang.Throwable] */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ?? r2;
            e activity;
            int i;
            String strB;
            y5b y5bVar = y5b.a;
            int i2 = this.a;
            HashMap map = null;
            xi60 xi60Var = xi60.this;
            if (i2 == 0) {
                uj50.b(obj);
                xi60Var.o0().d.setVisibility(0);
                xi60Var.o0().c.setVisibility(8);
                this.a = 1;
                if (hkd.b(500L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            double d = this.c;
            new Double(d);
            double d2 = this.d;
            new Double(d2);
            double d3 = this.e;
            new Double(d3);
            if (Double.compare(d2, d) <= 0 && Double.compare(d2, d3) >= d) {
                d = d2;
            }
            List<GiftItem> list = this.f;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    ?? r31 = map;
                    kotlin.collections.b.q();
                    throw r31;
                }
                GiftItem giftItem = (GiftItem) next;
                String currency = giftItem.getCurrency();
                Locale locale = Locale.ROOT;
                String upperCase = currency.toUpperCase(locale);
                upperCase.getClass();
                if (xi60Var.v.length() == 0) {
                    op5 op5Var = op5.a;
                    String currency2 = giftItem.getCurrency();
                    op5Var.getClass();
                    String upperCase2 = op5.i(currency2).toUpperCase(locale);
                    upperCase2.getClass();
                    xi60Var.v = upperCase2;
                }
                TreeMap treeMap = pw.a;
                String strD = pw.d(giftItem.getCurBal());
                String strD2 = pw.d(giftItem.getInitBal());
                if (giftItem.getCurBal() == giftItem.getInitBal()) {
                    strB = "";
                } else {
                    HashMap mapD = kpu.d(new Pair(xi60Var.getString(R.string.currency_cms), xi60Var.v), new Pair(xi60Var.getString(R.string.amount_cms), strD2));
                    op5 op5Var2 = op5.a;
                    String string = xi60Var.getString(R.string.original_amount_text_cms);
                    string.getClass();
                    String string2 = xi60Var.getString(R.string.fbg_available_text, xi60Var.v, strD2);
                    string2.getClass();
                    op5Var2.getClass();
                    strB = op5.b(string, string2, mapD);
                }
                String str = strB;
                double curBal = d > giftItem.getCurBal() ? giftItem.getCurBal() : d;
                String strD3 = pw.d(curBal);
                if (xi60Var.w.length() == 0) {
                    op5 op5Var3 = op5.a;
                    String string3 = xi60Var.getString(R.string.max_text_fbg_cms);
                    string3.getClass();
                    String string4 = xi60Var.getString(R.string.max);
                    string4.getClass();
                    op5Var3.getClass();
                    xi60Var.w = op5.b(string3, string4, map);
                }
                String string5 = xi60Var.getString(R.string.fbg_gift_amount_text, xi60Var.v, strD);
                string5.getClass();
                long expireTime = giftItem.getExpireTime();
                HashMap map2 = new HashMap();
                HashMap map3 = map;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
                simpleDateFormat.setTimeZone(TimeZone.getDefault());
                String str2 = simpleDateFormat.format(new Date(expireTime));
                str2.getClass();
                map2.put("{date}", str2);
                op5 op5Var4 = op5.a;
                String string6 = xi60Var.getString(R.string.expires_cms);
                string6.getClass();
                Iterator it2 = it;
                double d4 = d;
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
                simpleDateFormat2.setTimeZone(TimeZone.getDefault());
                String str3 = simpleDateFormat2.format(new Date(expireTime));
                str3.getClass();
                String string7 = xi60Var.getString(R.string.fbg_expiry_text, str3);
                string7.getClass();
                op5Var4.getClass();
                String strB2 = op5.b(string6, string7, map2);
                String string8 = xi60Var.getString(R.string.fbg_gift_amount, pw.d(giftItem.getCurBal()));
                string8.getClass();
                boolean z = giftItem.getCurBal() > d4;
                double curBal2 = giftItem.getCurBal();
                double d5 = this.e;
                arrayList.add(new a(giftItem, upperCase, string5, str, strB2, string8, giftItem.getCurBal() > d4 ? GiftUseType.PARTIAL : GiftUseType.FULL, z, curBal2 < d5, curBal, oxc.a(xi60Var.w, " ", xi60Var.getString(R.string.fbg_gift_partial_text_placeholder, xi60Var.v, strD3)), giftItem.getCurBal() > d4 ? GiftUseType.PARTIAL : GiftUseType.FULL, d5, giftItem.getCurBal() > d4 ? 1 : 0, !Double.valueOf(giftItem.getCurBal()).equals(Double.valueOf(giftItem.getInitBal())) ? xi60Var.f : xi60Var.i));
                it = it2;
                i3 = i4;
                map = map3;
                d = d4;
            }
            ?? r32 = map;
            if (xi60Var.getContext() == null || (activity = xi60Var.getActivity()) == null) {
                r2 = r32;
            } else {
                xi60Var.o0();
                ArrayList arrayList2 = new ArrayList(arrayList);
                if (!arrayList2.isEmpty()) {
                    int size = arrayList2.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            i = 1;
                            break;
                        }
                        Object obj2 = arrayList2.get(i5);
                        i5++;
                        if (((a) obj2).i) {
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            int i6 = 0;
                            while (i6 < size2) {
                                Object obj3 = arrayList2.get(i6);
                                i6++;
                                if (((a) obj3).i) {
                                    arrayList3.add(obj3);
                                }
                            }
                            i = 1;
                            p48.A(arrayList2, new hsj(1));
                            arrayList2.addAll(arrayList3);
                            break;
                        }
                    }
                } else {
                    i = 1;
                    break;
                }
                gaj<? super GiftItem, ? super Double, ? super Boolean, Unit> gajVar = xi60Var.d;
                if (gajVar == null) {
                    Intrinsics.n("onGiftUseClick");
                    throw r32;
                }
                yi60 yi60Var = new yi60();
                s5p s5pVar = new s5p(i);
                ri60 ri60Var = new ri60();
                ri60Var.a = activity;
                ri60Var.b = arrayList2;
                ri60Var.c = gajVar;
                ri60Var.d = yi60Var;
                ri60Var.e = s5pVar;
                new ArrayList();
                Boolean bool = Boolean.FALSE;
                ri60Var.i = m.b(bool);
                ri60Var.v = m.b(bool);
                ri60Var.w = m.b(bool);
                r2 = ri60Var;
            }
            r2.getClass();
            xi60Var.b = r2;
            RecyclerView recyclerView = xi60Var.o0().c;
            ri60 ri60Var2 = xi60Var.b;
            if (ri60Var2 == null) {
                Intrinsics.n("adapter");
                throw r32;
            }
            recyclerView.setAdapter(ri60Var2);
            xi60Var.o0().d.setVisibility(8);
            xi60Var.o0().c.setVisibility(0);
            return Unit.a;
        }
    }

    @Override // defpackage.w4
    public final void j0() {
        dismiss();
    }

    @Override // defpackage.w4
    public final void m0(FragmentManager fragmentManager, Function0<Unit> function0, final gaj<? super com.sportygames.common.ui.model.GiftItem, ? super Double, ? super Boolean, Unit> gajVar, Function0<Unit> function1) {
        fragmentManager.getClass();
        q0(fragmentManager, function0, new gaj() { // from class: wi60
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                GiftItem giftItem = (GiftItem) obj;
                Double d = (Double) obj2;
                d.getClass();
                Boolean bool = (Boolean) obj3;
                bool.getClass();
                giftItem.getClass();
                gajVar.invoke(GiftItemKt.toCommonGiftItem(giftItem), d, bool);
                return Unit.a;
            }
        }, function1);
    }

    @Override // defpackage.w4
    public final void n0(List<com.sportygames.common.ui.model.GiftItem> list, double d, double d2, double d3) {
        list.getClass();
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(GiftItemKt.toGiftItem((com.sportygames.common.ui.model.GiftItem) it.next()));
        }
        r0(arrayList, d, d2, d3);
    }

    public final ho80 o0() {
        ho80 ho80Var = this.a;
        if (ho80Var != null) {
            return ho80Var;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.BottomSheetStyle);
    }

    @Override // com.google.android.material.bottomsheet.c, defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getClass();
        if (dialogOnCreateDialog instanceof com.google.android.material.bottomsheet.b) {
            com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) dialogOnCreateDialog;
            bVar.g().Y = true;
            bVar.g().L(3);
            dialogOnCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: si60
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    dialogInterface.getClass();
                    View viewFindViewById = ((b) dialogInterface).findViewById(R.id.design_bottom_sheet);
                    if (viewFindViewById != null) {
                        Context context = this.a.getContext();
                        viewFindViewById.setBackground(context != null ? context.getDrawable(R.drawable.bottom_sheet_background) : null);
                    }
                }
            });
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.sg_free_bet_gift_dialog_v2, viewGroup, false);
        int i = R.id.close_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.close_icon, viewInflate);
        if (appCompatImageView != null) {
            i = R.id.gift_item_list;
            RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.gift_item_list, viewInflate);
            if (recyclerView != null) {
                i = R.id.layout;
                if (((ConstraintLayout) h5e.a(R.id.layout, viewInflate)) != null) {
                    i = R.id.loader;
                    SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.loader, viewInflate);
                    if (spinKitView != null) {
                        i = R.id.title;
                        TextView textView = (TextView) h5e.a(R.id.title, viewInflate);
                        if (textView != null) {
                            i = R.id.water_mark;
                            if (((ImageView) h5e.a(R.id.water_mark, viewInflate)) != null) {
                                this.a = new ho80((CoordinatorLayout) viewInflate, appCompatImageView, recyclerView, spinKitView, textView);
                                op5.r(op5.a, kotlin.collections.b.f(o0().e), null, 4);
                                CoordinatorLayout coordinatorLayout = o0().a;
                                coordinatorLayout.getClass();
                                return coordinatorLayout;
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Object parent = requireView().getParent();
        parent.getClass();
        View view = (View) parent;
        BottomSheetBehavior bottomSheetBehaviorC = BottomSheetBehavior.C(view);
        bottomSheetBehaviorC.L(3);
        bottomSheetBehaviorC.K(view.getHeight());
        bottomSheetBehaviorC.Z = false;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        o0().c.post(new Runnable() { // from class: ti60
            @Override // java.lang.Runnable
            public final void run() {
                RecyclerView.o layoutManager = this.a.o0().c.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.w1(0, 0);
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        o0().b.setOnClickListener(new ui60(this, 0));
        RecyclerView.l itemAnimator = o0().c.getItemAnimator();
        i0 i0Var = itemAnimator instanceof i0 ? (i0) itemAnimator : null;
        if (i0Var != null) {
            i0Var.g = false;
        }
        RecyclerView recyclerView = o0().c;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        o0().c.setHasFixedSize(true);
        o0().c.setItemAnimator(null);
        op5 op5Var = op5.a;
        String string = getString(R.string.left_text_cms);
        string.getClass();
        String string2 = getString(R.string.left);
        string2.getClass();
        op5Var.getClass();
        this.f = op5.b(string, string2, null);
        String string3 = getString(R.string.off_text_fbg_cms);
        string3.getClass();
        String string4 = getString(R.string.off_text);
        string4.getClass();
        this.i = op5.b(string3, string4, null);
        this.c.invoke();
        p0();
        o0().c.setOnTouchListener(new View.OnTouchListener() { // from class: vi60
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return this.a.p0();
            }
        });
        o0().c.j(new b());
    }

    public final boolean p0() {
        try {
            Context context = getContext();
            Object systemService = context != null ? context.getSystemService("input_method") : null;
            systemService.getClass();
            Object objInvoke = InputMethodManager.class.getMethod("getInputMethodWindowVisibleHeight", null).invoke((InputMethodManager) systemService, null);
            objInvoke.getClass();
            return ((Integer) objInvoke).intValue() > 0;
        } catch (Exception unused) {
        }
    }

    public final void q0(FragmentManager fragmentManager, Function0<Unit> function0, gaj<? super GiftItem, ? super Double, ? super Boolean, Unit> gajVar, Function0<Unit> function1) {
        fragmentManager.getClass();
        show(fragmentManager, "TAG");
        this.c = function0;
        this.d = gajVar;
        this.e = function1;
    }

    public final void r0(List<GiftItem> list, double d, double d2, double d3) {
        list.getClass();
        ej5.c(ebs.a(getLifecycle()), null, null, new c(d, d3, d2, list, null), 3);
    }
}
