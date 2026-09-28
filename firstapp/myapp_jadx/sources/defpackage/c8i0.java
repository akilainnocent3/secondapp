package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.sportygames.crash.models.header.snc.OdQr;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class c8i0 {

    public static final class a implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ long b;
        public final /* synthetic */ Function1<View, Unit> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(cq40 cq40Var, long j, Function1<? super View, Unit> function1) {
            this.a = cq40Var;
            this.b = j;
            this.c = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < this.b) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            this.c.invoke(view);
        }
    }

    public static void a(View view, Function1 function1) {
        view.setTag(1123461123, 500L);
        view.setOnClickListener(new xrs(1, view, function1));
    }

    public static final void b(View view, long j, Function1<? super View, Unit> function1) {
        view.getClass();
        view.setOnClickListener(new a(new cq40(), j, function1));
    }

    public static final int c(int i, View view) {
        view.getClass();
        Resources resources = view.getContext().getResources();
        ThreadLocal<TypedValue> threadLocal = th50.a;
        return resources.getColor(i, null);
    }

    public static final int d(int i, View view) {
        view.getClass();
        return view.getContext().getColor(i);
    }

    public static final void f(View view) {
        view.getClass();
        view.setVisibility(8);
    }

    public static final void g(View view) {
        view.getClass();
        Object systemService = view.getContext().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final void h(View view) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        layoutParams.width = -1;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
    }

    public static final void i(ViewGroup viewGroup, int i, float f, float f2, float f3, float f4) {
        viewGroup.getClass();
        rx80.a aVarH = new rx80().h();
        aVarH.a = gcv.a(1);
        aVarH.f(f);
        aVarH.b = gcv.a(1);
        aVarH.g(f2);
        aVarH.d = gcv.a(1);
        aVarH.d(f3);
        aVarH.c = gcv.a(1);
        aVarH.e(f4);
        fcv fcvVar = new fcv(aVarH.a());
        fcvVar.s(ColorStateList.valueOf(viewGroup.getContext().getColor(i)));
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        viewGroup.setBackground(fcvVar);
    }

    public static final void j(View view, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setStateDescription(str);
        }
        view.setContentDescription(str);
    }

    public static final void k(int i, View view) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        layoutParams.width = -1;
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public static final <T> void l(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        view.getClass();
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(num.intValue(), num2 != null ? num2.intValue() : marginLayoutParams.topMargin, num3 != null ? num3.intValue() : marginLayoutParams.rightMargin, num4 != null ? num4.intValue() : marginLayoutParams.bottomMargin);
        }
    }

    public static void m(TextView textView, CharSequence charSequence, v5b v5bVar, Map map) {
        Map map2;
        c9p c9pVarC;
        c9p c9pVar;
        textView.getClass();
        charSequence.getClass();
        String strA = d40.a(textView.getId(), System.identityHashCode(textView), "_");
        if (map != null && (c9pVar = (c9p) map.get(strA)) != null) {
            c9pVar.cancel((CancellationException) null);
        }
        if (v5bVar != null) {
            pfd pfdVar = fse.a;
            map2 = map;
            c9pVarC = ej5.c(v5bVar, gku.a, null, new e8i0(textView, charSequence, map2, strA, null), 2);
        } else {
            map2 = map;
            textView.setText(charSequence);
            c9pVarC = map2 != null ? (c9p) map2.remove(strA) : null;
        }
        if (c9pVarC == null || map2 == null) {
            return;
        }
        map2.put(strA, c9pVarC);
    }

    public static final void n(View view) {
        view.getClass();
        view.setVisibility(0);
    }

    public static final void o(View view, boolean z) {
        view.getClass();
        view.setVisibility(z ? 0 : 8);
    }

    public static final String e(View view) {
        view.getClass();
        return (view.getResources().getConfiguration().uiMode & 48) == 32 ? OdQr.VgOVrtokstowV : "light";
    }
}
