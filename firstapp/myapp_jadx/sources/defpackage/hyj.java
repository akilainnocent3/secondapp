package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class hyj {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = jrh0.a;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.a = i;
            this.b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(uov uovVar) {
        int i = 0;
        while (true) {
            uov.a[] aVarArr = uovVar.a;
            if (i >= aVarArr.length) {
                return;
            }
            uov.a aVar = aVarArr[i];
            if (aVar instanceof a98) {
                a98 a98Var = (a98) aVar;
                if ("iTunSMPB".equals(a98Var.c) && a(a98Var.d)) {
                    return;
                }
            } else if (aVar instanceof uyo) {
                uyo uyoVar = (uyo) aVar;
                if ("com.apple.iTunes".equals(uyoVar.b) && "iTunSMPB".equals(uyoVar.c) && a(uyoVar.d)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
