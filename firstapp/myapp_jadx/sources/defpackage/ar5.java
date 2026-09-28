package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class ar5 implements isp {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.isp
    public final Object a(String str, boolean z, Long l, x1b x1bVar) {
        zq5 zq5Var;
        if (x1bVar instanceof zq5) {
            zq5Var = (zq5) x1bVar;
            int i = zq5Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zq5Var.c = i - Integer.MIN_VALUE;
            } else {
                zq5Var = new zq5(this, x1bVar);
            }
        } else {
            zq5Var = new zq5(this, x1bVar);
        }
        Object obj = zq5Var.a;
        y5b y5bVar = y5b.a;
        int i2 = zq5Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            if (str.length() == 18) {
                boolean zEquals = false;
                String strSubstring = str.substring(0, 4);
                int i3 = 0;
                while (true) {
                    if (i3 >= strSubstring.length()) {
                        if (l == null) {
                            zEquals = true;
                        } else if (str.length() >= 10) {
                            Date date = new Date(l.longValue());
                            Locale locale = Locale.US;
                            locale.getClass();
                            zEquals = bwf0.l(date, "yyMMdd", locale, 0, 0).equals(str.substring(4, 10));
                        }
                        if (!zEquals) {
                            break;
                        }
                        return null;
                    }
                    if (!Character.isLetter(strSubstring.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
            }
            zq5Var.c = 1;
            if (hkd.b(1000L, zq5Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return new ResourceUiText(R.string.register_login_mx__invalid_curp_error_message);
    }

    @Override // defpackage.isp
    public final boolean b(String str) {
        str.getClass();
        if (str.length() <= 18) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (Character.isLetter(cCharAt) || Character.isDigit(cCharAt)) {
                }
            }
            return true;
        }
        return false;
    }
}
