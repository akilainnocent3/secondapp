package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class dxf0 {
    public final int a;
    public final qjd0 b;
    public final mpe0 c;
    public lew d;
    public Function0<? extends xvf0> e;

    public dxf0(Context context, int i) {
        this.a = i;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_single_select_popup_view, (ViewGroup) null, false);
        if (viewInflate == null) {
            bmy.a("rootView");
            throw null;
        }
        this.b = new qjd0((RecyclerView) viewInflate);
        this.c = hwr.b(new avb(this, 3));
        this.e = new zwf0();
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        xvf0 xvf0Var = new xvf0();
        xvf0Var.a = "all";
        qjd0 qjd0Var = this.b;
        Context context = qjd0Var.a.getContext();
        context.getClass();
        xvf0Var.b = sn5.b(context, R.string.common_functions__all, new Object[0]);
        xvf0Var.d = 0L;
        xvf0Var.e = 0L;
        xvf0Var.c = true;
        arrayList.add(xvf0Var);
        xvf0 xvf0Var2 = new xvf0();
        long jCurrentTimeMillis = System.currentTimeMillis();
        xvf0Var2.a = "custom";
        Context context2 = qjd0Var.a.getContext();
        context2.getClass();
        xvf0Var2.b = sn5.b(context2, R.string.live___3_hours, new Object[0]);
        xvf0Var2.d = jCurrentTimeMillis;
        xvf0Var2.e = jCurrentTimeMillis + 10800000;
        arrayList.add(xvf0Var2);
        int i = Calendar.getInstance().get(7);
        int i2 = i - 2;
        if (i2 < 0) {
            i2 = i + 5;
        }
        Context context3 = qjd0Var.a.getContext();
        context3.getClass();
        String[] strArrG = yrh0.g(context3);
        int i3 = i2 + 1;
        if (i3 < 7) {
            int i4 = i3;
            while (i4 < 7) {
                xvf0 xvf0Var3 = new xvf0();
                int i5 = i4 + 1;
                long jC = j020.c(i5);
                xvf0Var3.a = "date_range";
                xvf0Var3.b = strArrG[i4];
                xvf0Var3.d = jC;
                xvf0Var3.e = jC + 86400000;
                arrayList.add(xvf0Var3);
                i4 = i5;
            }
        }
        int i6 = 0;
        while (i6 < i2) {
            xvf0 xvf0Var4 = new xvf0();
            int i7 = i6 + 1;
            long jC2 = j020.c(i7);
            xvf0Var4.a = "date_range";
            xvf0Var4.b = strArrG[i6];
            xvf0Var4.d = jC2;
            xvf0Var4.e = jC2 + 86400000;
            arrayList.add(xvf0Var4);
            i6 = i7;
        }
        xvf0 xvf0Var5 = new xvf0();
        long jC3 = j020.c(i3);
        xvf0Var5.a = "date_range";
        Context context4 = qjd0Var.a.getContext();
        context4.getClass();
        xvf0Var5.b = sn5.b(context4, R.string.wap_home__today, new Object[0]);
        xvf0Var5.d = jC3;
        xvf0Var5.e = jC3 + 86400000;
        Unit unit = Unit.a;
        arrayList.add(2, xvf0Var5);
        return arrayList;
    }
}
