package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class lok0 {
    public final String a;
    public final dok0 b;
    public dok0 c;

    public /* synthetic */ lok0(String str) {
        dok0 dok0Var = new dok0();
        this.b = dok0Var;
        this.c = dok0Var;
        this.a = str;
    }

    public final void a(Object obj, String str) {
        dok0 dok0Var = new dok0();
        this.c.c = dok0Var;
        this.c = dok0Var;
        dok0Var.b = obj;
        dok0Var.a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        dok0 dok0Var = this.b.c;
        String str = "";
        while (dok0Var != null) {
            Object obj = dok0Var.b;
            sb.append(str);
            String str2 = dok0Var.a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            dok0Var = dok0Var.c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
