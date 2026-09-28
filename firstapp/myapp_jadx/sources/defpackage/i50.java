package defpackage;

import android.content.res.Resources;
import com.sportybet.android.gp.tz.R;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class i50 {
    public static final boolean a(bb80 bb80Var) {
        return !bb80Var.k().a.b(hb80.i);
    }

    public static final tsr b(tsr tsrVar, Function1<? super tsr, Boolean> function1) {
        for (tsr tsrVarH = tsrVar.H(); tsrVarH != null; tsrVarH = tsrVarH.H()) {
            if (function1.invoke(tsrVarH).booleanValue()) {
                return tsrVarH;
            }
        }
        return null;
    }

    public static final boolean c(bb80 bb80Var) {
        kzf0 kzf0Var = (kzf0) ta80.a(bb80Var.d, hb80.I);
        sa80 sa80Var = bb80Var.d;
        su50 su50Var = (su50) ta80.a(sa80Var, hb80.x);
        boolean z = kzf0Var != null;
        if (((Boolean) ta80.a(sa80Var, hb80.H)) == null || (su50Var != null && su50Var.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String d(bb80 bb80Var, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        int iE;
        Object objA = ta80.a(bb80Var.d, hb80.b);
        sa80 sa80Var = bb80Var.d;
        kzf0 kzf0Var = (kzf0) ta80.a(sa80Var, hb80.I);
        su50 su50Var = (su50) ta80.a(sa80Var, hb80.x);
        Object string = null;
        if (kzf0Var != null) {
            int iOrdinal = kzf0Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return null;
                    }
                    if (objA == null) {
                        objA = resources.getString(R.string.indeterminate);
                    }
                } else if (su50Var != null && su50Var.a == 2 && objA == null) {
                    objA = resources.getString(R.string.state_off);
                }
            } else if (su50Var != null && su50Var.a == 2 && objA == null) {
                objA = resources.getString(R.string.state_on);
            }
        }
        Boolean bool = (Boolean) ta80.a(sa80Var, hb80.H);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((su50Var == null || su50Var.a != 4) && objA == null) {
                objA = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        m230 m230Var = (m230) ta80.a(sa80Var, hb80.c);
        if (m230Var != null) {
            if (m230Var != m230.d) {
                if (objA == null) {
                    gt7 gt7Var = m230Var.b;
                    float f = gt7Var.b;
                    float f2 = gt7Var.a;
                    float fFloatValue = Float.valueOf(f).floatValue() - Float.valueOf(f2).floatValue() == 0.0f ? 0.0f : (m230Var.a - Float.valueOf(f2).floatValue()) / (Float.valueOf(gt7Var.b).floatValue() - Float.valueOf(f2).floatValue());
                    if (fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    if (fFloatValue == 0.0f) {
                        iE = 0;
                    } else {
                        iE = fFloatValue == 1.0f ? 100 : f.e(Math.round(fFloatValue * 100.0f), 1, 99);
                    }
                    objA = resources.getString(R.string.template_percent, Integer.valueOf(iE));
                }
            } else if (objA == null) {
                objA = resources.getString(R.string.in_progress);
            }
        }
        ob80<nk0> ob80Var = hb80.E;
        if (sa80Var.a.b(ob80Var)) {
            sa80 sa80VarK = new bb80(bb80Var.a, true, bb80Var.c, sa80Var).k();
            Collection collection2 = (Collection) ta80.a(sa80VarK, hb80.a);
            if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) ta80.a(sa80VarK, hb80.A)) == null || collection.isEmpty()) && ((charSequence = (CharSequence) ta80.a(sa80VarK, ob80Var)) == null || charSequence.length() == 0))) {
                string = resources.getString(R.string.state_empty);
            }
            objA = string;
        }
        return (String) objA;
    }

    public static final nk0 e(bb80 bb80Var) {
        nk0 nk0Var = (nk0) ta80.a(bb80Var.d, hb80.E);
        List list = (List) ta80.a(bb80Var.d, hb80.A);
        return nk0Var == null ? list != null ? (nk0) CollectionsKt.firstOrNull(list) : null : nk0Var;
    }

    public static final boolean f(bb80 bb80Var, Resources resources) {
        List list = (List) ta80.a(bb80Var.d, hb80.a);
        return !gb80.d(bb80Var) && (bb80Var.d.c || (bb80Var.o() && ((list != null ? (String) CollectionsKt.firstOrNull(list) : null) != null || e(bb80Var) != null || d(bb80Var, resources) != null || c(bb80Var))));
    }
}
