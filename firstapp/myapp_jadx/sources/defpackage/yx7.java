package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.r;
import com.google.protobuf.Reader;
import com.sporty.android.core.model.bookingcode.BookingCodeFilterDto;
import com.sportybet.android.gp.tz.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final class yx7 {
    public static final oy7 i = new oy7(1, 50);
    public static final oy7 j = new oy7(40, 50);
    public static final oy7 k = new oy7(1, 50);
    public static final oy7 l = new oy7(1, Reader.READ_DONE);
    public static final List<Integer> m = b.k(1, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50);
    public static final List<Integer> n = b.k(1, 5, 10, 20, 50, 100, Integer.valueOf(r.d.DEFAULT_SWIPE_ANIMATION_DURATION), 500, 1000, 2000, Integer.valueOf(Reader.READ_DONE));
    public final veb0 a;
    public final m320 b;
    public final Function0<List<Pair<String, iy7.a>>> c;
    public final n320 d;
    public final az7 e;
    public final az7 f;
    public az7 g;
    public final Context h;

    public static final class a {
        public static ArrayList a(Context context) {
            context.getClass();
            ArrayList arrayList = new ArrayList();
            BookingCodeFilterDto bookingCodeFilterDto = mz7.h0;
            Calendar calendarA = mz7.b.a();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE", Locale.US);
            String str = simpleDateFormat.format(calendarA.getTime());
            str.getClass();
            arrayList.add(new Pair(d(context, str), Long.valueOf(calendarA.getTime().getTime())));
            for (int i = 1; i < 7; i++) {
                calendarA.add(5, 1);
                String str2 = simpleDateFormat.format(calendarA.getTime());
                str2.getClass();
                arrayList.add(new Pair(d(context, str2), Long.valueOf(calendarA.getTime().getTime())));
            }
            return arrayList;
        }

        public static ArrayList b() {
            ArrayList arrayList = new ArrayList();
            BookingCodeFilterDto bookingCodeFilterDto = mz7.h0;
            Calendar calendarA = mz7.b.a();
            for (int i = 0; i < 7; i++) {
                int i2 = calendarA.get(7);
                if (i2 == 1 || i2 == 7) {
                    arrayList.add(Long.valueOf(calendarA.getTime().getTime()));
                }
                calendarA.add(5, 1);
            }
            return arrayList;
        }

        public static String c(Context context, String str) {
            for (Map.Entry entry : kpu.d(new Pair("Monday", sn5.b(context, R.string.common_dates__monday, new Object[0])), new Pair("Tuesday", sn5.b(context, R.string.common_dates__tuesday, new Object[0])), new Pair("Wednesday", sn5.b(context, R.string.common_dates__wednesday, new Object[0])), new Pair("Thursday", sn5.b(context, R.string.common_dates__thursday, new Object[0])), new Pair("Friday", sn5.b(context, R.string.common_dates__friday, new Object[0])), new Pair("Saturday", sn5.b(context, R.string.common_dates__saturday, new Object[0])), new Pair("Sunday", sn5.b(context, R.string.common_dates__sunday, new Object[0]))).entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (StringsKt.M(str, str2, false)) {
                    return c.p(str, str2, str3, false);
                }
            }
            return str;
        }

        public static String d(Context context, String str) {
            for (Map.Entry entry : kpu.d(new Pair("Mon", sn5.b(context, R.string.common_dates__short_monday, new Object[0])), new Pair("Tue", sn5.b(context, R.string.common_dates__short_tuesday, new Object[0])), new Pair("Wed", sn5.b(context, R.string.common_dates__short_wednesday, new Object[0])), new Pair("Thu", sn5.b(context, R.string.common_dates__short_thursday, new Object[0])), new Pair("Fri", sn5.b(context, R.string.common_dates__short_friday, new Object[0])), new Pair("Sat", sn5.b(context, R.string.common_dates__short_saturday, new Object[0])), new Pair("Sun", sn5.b(context, R.string.common_dates__short_sunday, new Object[0]))).entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (StringsKt.M(str, str2, false)) {
                    return c.p(str, str2, str3, false);
                }
            }
            return str;
        }
    }

    public yx7() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yx7(View view, veb0 veb0Var, m320 m320Var, n320 n320Var) {
        int iIntValue;
        jx7 jx7Var = new jx7();
        view.getClass();
        ConstraintLayout constraintLayout = veb0Var.a;
        this.a = veb0Var;
        this.b = m320Var;
        this.c = jx7Var;
        this.d = n320Var;
        hy7 hy7Var = hy7.c;
        List<Pair<String, iy7.b>> list = fy7.a;
        Context context = constraintLayout.getContext();
        context.getClass();
        List listA = fy7.a.a(context);
        Context context2 = constraintLayout.getContext();
        context2.getClass();
        this.e = new az7(view, veb0Var, hy7Var, listA, (iy7) ((Pair) CollectionsKt.T(fy7.a.a(context2))).b, m, j, k, i, new gaj() { // from class: px7
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                iy7 iy7Var = (iy7) obj;
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                Boolean bool2 = (Boolean) obj3;
                bool2.getClass();
                iy7Var.getClass();
                this.a.d.d(iy7Var, hy7.c, bool, bool2);
                return Unit.a;
            }
        }, new qx7(this, 0), new zx7(6, this, yx7.class, "addOption", "addOption(Ljava/lang/String;Ljava/lang/Object;ZZZLkotlin/jvm/functions/Function2;)Lkotlin/Pair;", 0), new ay7(1, this, yx7.class, "enableApply", "enableApply(Z)V", 0), new by7(1, this, yx7.class, "enableReset", "enableReset(Z)V", 0));
        hy7 hy7Var2 = hy7.d;
        Context context3 = constraintLayout.getContext();
        context3.getClass();
        List listB = fy7.a.b(context3);
        Context context4 = constraintLayout.getContext();
        context4.getClass();
        iy7 iy7Var = (iy7) ((Pair) CollectionsKt.T(fy7.a.b(context4))).b;
        int iIntValue2 = r.d.DEFAULT_DRAG_ANIMATION_DURATION;
        Integer intOrNull = StringsKt.toIntOrNull(gky.a(String.valueOf(r.d.DEFAULT_DRAG_ANIMATION_DURATION)));
        iIntValue2 = intOrNull != null ? intOrNull.intValue() : iIntValue2;
        Integer intOrNull2 = StringsKt.toIntOrNull(gky.a(String.valueOf(2000)));
        oy7 oy7Var = new oy7(iIntValue2, intOrNull2 != null ? intOrNull2.intValue() : 2000);
        Context context5 = constraintLayout.getContext();
        context5.getClass();
        if (gky.c(context5)) {
            iIntValue = -100000;
        } else {
            iIntValue = 1;
            Integer intOrNull3 = StringsKt.toIntOrNull(gky.a(String.valueOf(1)));
            if (intOrNull3 != null) {
                iIntValue = intOrNull3.intValue();
            }
        }
        Integer intOrNull4 = StringsKt.toIntOrNull(gky.a(String.valueOf(100000)));
        this.f = new az7(view, veb0Var, hy7Var2, listB, iy7Var, n, oy7Var, new oy7(iIntValue, intOrNull4 != null ? intOrNull4.intValue() : 100000), l, new gaj() { // from class: rx7
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                iy7 iy7Var2 = (iy7) obj;
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                Boolean bool2 = (Boolean) obj3;
                bool2.getClass();
                iy7Var2.getClass();
                this.a.d.d(iy7Var2, hy7.d, bool, bool2);
                return Unit.a;
            }
        }, new sx7(this, 0), new cy7(6, this, yx7.class, "addOption", "addOption(Ljava/lang/String;Ljava/lang/Object;ZZZLkotlin/jvm/functions/Function2;)Lkotlin/Pair;", 0), new dy7(1, this, yx7.class, "enableApply", "enableApply(Z)V", 0), new ey7(1, this, yx7.class, "enableReset", "enableReset(Z)V", 0));
        Context context6 = constraintLayout.getContext();
        this.h = context6;
        context6.getClass();
        if (r0b.d(context6)) {
            veb0Var.d.setBackgroundColor(context6.getColor(R.color.background_general_primary));
            veb0Var.f.a.setBackgroundColor(context6.getColor(R.color.background_general_primary));
        }
    }

    public static final void b(geb0 geb0Var, yx7 yx7Var, boolean z) {
        Context context = yx7Var.h;
        TextView textView = geb0Var.c;
        if (z) {
            textView.setTextColor(context.getColor(R.color.brand_quaternary));
        } else {
            textView.setTextColor(context.getColor(R.color.text_type1_primary));
        }
    }

    public static final ph80 f(String str, ArrayList arrayList) {
        ph80 ph80Var = new ph80();
        if (j(str, arrayList)) {
            ph80Var.add("this_weekend");
        }
        ArrayList arrayListH = h(str, arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayListH.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListH.get(i3);
            i3++;
            if (((gy7) obj).c) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ph80Var.add(String.valueOf(((gy7) obj2).b));
        }
        return wi80.a(ph80Var);
    }

    public static final List g(ArrayList arrayList, ArrayList arrayList2, String str, ArrayList arrayList3) {
        ArrayList arrayListH = h(str, arrayList2);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayListH.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListH.get(i3);
            i3++;
            if (((gy7) obj).c) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList(l48.r(arrayList4, 10));
        int size2 = arrayList4.size();
        while (i2 < size2) {
            Object obj2 = arrayList4.get(i2);
            i2++;
            arrayList5.add(Long.valueOf(((gy7) obj2).b));
        }
        ngs ngsVarB = kotlin.collections.a.b();
        ngsVarB.addAll(arrayList5);
        if (j(str, arrayList2)) {
            ngsVarB.addAll(arrayList3);
        }
        List listN = CollectionsKt.N(kotlin.collections.a.a(ngsVarB));
        return (listN.size() == arrayList.size() && listN.containsAll(arrayList)) ? arrayList : listN;
    }

    public static final ArrayList h(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!Intrinsics.g(((gy7) obj).a, str)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean i(ArrayList<gy7> arrayList) {
        if (arrayList.isEmpty()) {
            return true;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            gy7 gy7Var = arrayList.get(i2);
            i2++;
            if (!gy7Var.c) {
                return false;
            }
        }
        return true;
    }

    public static final boolean j(String str, ArrayList arrayList) {
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        do {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
        } while (!Intrinsics.g(((gy7) obj).a, str));
        gy7 gy7Var = (gy7) obj;
        return gy7Var != null && gy7Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(yx7 yx7Var, dq40 dq40Var, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, List list, List list2, Set set, boolean z) {
        int size = arrayList.size();
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z3 = true;
            if (i3 >= size) {
                ((Function1) ((Pair) dq40Var.a).b).invoke(Boolean.valueOf(i(arrayList2)));
                List listG = g(arrayList3, arrayList2, str, arrayList4);
                boolean zJ = j(str, arrayList2);
                ph80 ph80VarF = f(str, arrayList2);
                if ((!listG.equals(list) || !list2.isEmpty() || zJ != z || !Intrinsics.g(ph80VarF, set)) && !listG.isEmpty()) {
                    z2 = true;
                }
                yx7Var.c(z2);
                yx7Var.d(!i(arrayList2));
                return;
            }
            Object obj = arrayList.get(i3);
            i3++;
            int i4 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            Function1 function1 = (Function1) ((Pair) obj).b;
            gy7 gy7Var = (gy7) CollectionsKt.V(i2, arrayList2);
            if (gy7Var == null || !gy7Var.c) {
                z3 = false;
            }
            function1.invoke(Boolean.valueOf(z3));
            i2 = i4;
        }
    }

    public final <T> Pair<T, Function1<Boolean, Unit>> a(String str, final T t, boolean z, final boolean z2, final boolean z3, final Function2<? super T, ? super Boolean, Unit> function2) {
        final geb0 geb0Var;
        final yp40 yp40Var = new yp40();
        yp40Var.a = z;
        Context context = this.h;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spm_code_hub_filter_item, (ViewGroup) null, false);
        int i2 = R.id.cbTick;
        CheckBox checkBox = (CheckBox) h5e.a(R.id.cbTick, viewInflate);
        if (checkBox != null) {
            i2 = R.id.llHolder;
            LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.llHolder, viewInflate);
            if (linearLayout != null) {
                i2 = R.id.tvOption;
                TextView textView = (TextView) h5e.a(R.id.tvOption, viewInflate);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    geb0 geb0Var2 = new geb0(constraintLayout, checkBox, linearLayout, textView);
                    textView.setText(str);
                    context.getClass();
                    if (r0b.d(context)) {
                        linearLayout.setBackgroundColor(context.getColor(R.color.background_general_primary));
                        constraintLayout.setBackgroundColor(context.getColor(R.color.brand_secondary_variable_type1));
                    }
                    b(geb0Var2, this, yp40Var.a);
                    if (z2) {
                        checkBox.setVisibility(0);
                        checkBox.setChecked(z);
                        geb0Var = geb0Var2;
                        checkBox.setOnClickListener(new View.OnClickListener() { // from class: mx7
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                yp40 yp40Var2 = yp40Var;
                                function2.invoke(t, Boolean.valueOf(!yp40Var2.a));
                                if (z3) {
                                    return;
                                }
                                boolean z4 = !yp40Var2.a;
                                yp40Var2.a = z4;
                                geb0 geb0Var3 = geb0Var;
                                geb0Var3.b.setChecked(z4);
                                yx7.b(geb0Var3, this, yp40Var2.a);
                            }
                        });
                    } else {
                        geb0Var = geb0Var2;
                        checkBox.setVisibility(8);
                    }
                    final geb0 geb0Var3 = geb0Var;
                    constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: nx7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            yp40 yp40Var2 = yp40Var;
                            function2.invoke(t, Boolean.valueOf(!yp40Var2.a));
                            if (z3) {
                                return;
                            }
                            boolean z4 = !yp40Var2.a;
                            yp40Var2.a = z4;
                            boolean z5 = z2;
                            geb0 geb0Var4 = geb0Var3;
                            if (z5) {
                                geb0Var4.b.setChecked(z4);
                            }
                            yx7.b(geb0Var4, this, yp40Var2.a);
                        }
                    });
                    this.a.e.addView(constraintLayout);
                    return new Pair<>(t, new Function1() { // from class: ox7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            yp40 yp40Var2 = yp40Var;
                            yp40Var2.a = zBooleanValue;
                            boolean z4 = z2;
                            geb0 geb0Var4 = geb0Var3;
                            if (z4) {
                                geb0Var4.b.setChecked(zBooleanValue);
                            }
                            yx7.b(geb0Var4, this, yp40Var2.a);
                            return Unit.a;
                        }
                    });
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    public final void c(boolean z) {
        veb0 veb0Var = this.a;
        AppCompatButton appCompatButton = veb0Var.b;
        appCompatButton.setEnabled(z);
        ConstraintLayout constraintLayout = veb0Var.a;
        appCompatButton.setTextColor(constraintLayout.getContext().getColor(z ? R.color.brand_tertiary : R.color.text_disable_type1_primary));
        appCompatButton.setBackgroundColor(constraintLayout.getContext().getColor(z ? R.color.brand_secondary : R.color.brand_secondary_disable));
    }

    public final void d(boolean z) {
        veb0 veb0Var = this.a;
        AppCompatButton appCompatButton = veb0Var.c;
        appCompatButton.setEnabled(z);
        ConstraintLayout constraintLayout = veb0Var.a;
        appCompatButton.setTextColor(constraintLayout.getContext().getColor(z ? R.color.brand_secondary : R.color.text_disable_type1_primary));
        appCompatButton.setBackground(constraintLayout.getContext().getDrawable(z ? R.drawable.btn_border_rounded_bg : R.drawable.btn_disable_border_rounded_bg));
    }

    public final void e() {
        veb0 veb0Var = this.a;
        lop.b(veb0Var.a, Boolean.FALSE);
        veb0Var.a.setVisibility(8);
    }
}
