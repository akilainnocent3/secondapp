package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v3b implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v3b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        e activity;
        xi60 xi60Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new h4b((iif0) obj2);
            default:
                kab0 kab0Var = (kab0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (kab0Var.j0 || kab0Var.B != null) {
                    return Unit.a;
                }
                ypa0 ypa0VarV0 = kab0Var.v0();
                String string = kab0Var.getString(R.string.click_chip);
                string.getClass();
                ypa0VarV0.A1(0L, string);
                if (zBooleanValue && (activity = kab0Var.getActivity()) != null) {
                    zp40 zp40Var = new zp40();
                    Set<Map.Entry<Integer, List<Double>>> setEntrySet = kab0Var.f.entrySet();
                    setEntrySet.getClass();
                    Iterator<T> it = setEntrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        double d = zp40Var.a;
                        Object value = entry.getValue();
                        value.getClass();
                        zp40Var.a = CollectionsKt.s0((Iterable) value) + d;
                    }
                    xi60 xi60Var2 = kab0Var.B;
                    if (xi60Var2 == null) {
                        xi60Var2 = new xi60();
                        kab0Var.B = xi60Var2;
                    }
                    if (!xi60Var2.isAdded() && (xi60Var = kab0Var.B) != null) {
                        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        int i2 = 1;
                        xi60Var.q0(supportFragmentManager, new ku60(i2, kab0Var, zp40Var), new i9b0(kab0Var, 0), new mk20(kab0Var, i2));
                    }
                }
                return Unit.a;
        }
    }
}
