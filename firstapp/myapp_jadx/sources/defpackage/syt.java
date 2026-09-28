package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class syt {
    public final u2u a;
    public final vxt b;
    public final g8k c;
    public final nt5 d;
    public final mgb0 e;
    public final psm f;
    public final uti g;

    public syt(u2u u2uVar, vxt vxtVar, g8k g8kVar, nt5 nt5Var, mgb0 mgb0Var, psm psmVar, uti utiVar) {
        mgb0Var.getClass();
        psmVar.getClass();
        this.a = u2uVar;
        this.b = vxtVar;
        this.c = g8kVar;
        this.d = nt5Var;
        this.e = mgb0Var;
        this.f = psmVar;
        this.g = utiVar;
    }

    public static long b(float f, boolean z) {
        if (Math.abs(f - 1.0f) < 1.0E-4f) {
            return r58.d(4278255555L);
        }
        return (f >= 1.0f || !z) ? r58.d(4294931572L) : r58.d(4294623505L);
    }

    public static ConcatUiText c(Long l, boolean z) {
        Date time;
        if (z) {
            Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
            calendar.add(2, 1);
            calendar.set(5, 1);
            time = calendar.getTime();
            time.getClass();
        } else if (l != null) {
            time = new Date(l.longValue());
        } else {
            Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
            calendar2.add(2, 1);
            calendar2.set(5, 1);
            time = calendar2.getTime();
            time.getClass();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM", Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(time);
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.page_loyalty__next_grade);
        StringUiText stringUiText2 = new StringUiText(": ");
        str.getClass();
        return new ConcatUiText(new UiText[]{resourceUiText, stringUiText2, new StringUiText(str)});
    }

    public static String d(krf0 krf0Var) {
        dgv dgvVar = krf0Var != null ? krf0Var.v : null;
        if (dgvVar != null) {
            return dgvVar.a;
        }
        if (dgvVar == null) {
            return null;
        }
        uhc.a();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(Integer num, String str, x1b x1bVar) {
        nyt nytVar;
        uti utiVar;
        Object objG;
        if (x1bVar instanceof nyt) {
            nytVar = (nyt) x1bVar;
            int i = nytVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nytVar.d = i - Integer.MIN_VALUE;
            } else {
                nytVar = new nyt(this, x1bVar);
            }
        } else {
            nytVar = new nyt(this, x1bVar);
        }
        nyt nytVar2 = nytVar;
        Object objG2 = nytVar2.b;
        y5b y5bVar = y5b.a;
        int i2 = nytVar2.d;
        uti utiVar2 = this.g;
        if (i2 == 0) {
            uj50.b(objG2);
            if (num != null) {
                String strD = s5y.d(num);
                nytVar2.a = str;
                nytVar2.d = 1;
                utiVar = utiVar2;
                objG2 = uti.g(utiVar, strD, str, false, nytVar2, 28);
                if (objG2 != y5bVar) {
                    str = str;
                }
            } else {
                utiVar = utiVar2;
                String str2 = str;
                nytVar2.a = null;
                nytVar2.d = 2;
                objG = uti.g(utiVar, "0.00", str2, false, nytVar2, 28);
                if (objG != y5bVar) {
                    return objG;
                }
            }
            return y5bVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objG2);
                return objG2;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = nytVar2.a;
        uj50.b(objG2);
        utiVar = utiVar2;
        String str3 = (String) objG2;
        if (str3 != null) {
            return str3;
        }
        String str4 = str;
        nytVar2.a = null;
        nytVar2.d = 2;
        objG = uti.g(utiVar, "0.00", str4, false, nytVar2, 28);
        if (objG != y5bVar) {
            return y5bVar;
        }
        return objG;
    }
}
