package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class pfb0 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ofb0.values().length];
            try {
                ofb0 ofb0Var = ofb0.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ofb0 ofb0Var2 = ofb0.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final int a(ofb0 ofb0Var, e9f0 e9f0Var) {
        int i = ofb0Var == null ? -1 : a.a[ofb0Var.ordinal()];
        if (i == 1) {
            return e9f0Var == e9f0.a ? R.drawable.ic_default_league_logo_home : R.drawable.ic_default_league_logo_away;
        }
        if (i != 2) {
            return e9f0Var == e9f0.a ? R.drawable.ic_default_league_logo_home : R.drawable.ic_default_league_logo_away;
        }
        return e9f0Var == e9f0.a ? R.drawable.ic_default_individual_logo_home : R.drawable.ic_default_individual_logo_away;
    }

    public static final ofb0 b(String str) {
        Object next;
        Object next2;
        if (str != null) {
            xfn.b.getClass();
            Iterator<T> it = xfn.d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((xfn) next).a.equalsIgnoreCase(str));
            if (((xfn) next) != null) {
                return ofb0.b;
            }
            f9f0.b.getClass();
            Iterator<T> it2 = f9f0.d.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((f9f0) next2).a.equalsIgnoreCase(str));
            if (((f9f0) next2) != null) {
                return ofb0.a;
            }
        }
        return null;
    }
}
