package defpackage;

import com.sporty.android.core.model.MyLog;

/* JADX INFO: loaded from: classes7.dex */
public final class imn {
    public String a;
    public String b;
    public long c;

    public imn(long j, String str, String str2) {
        try {
            int length = str.length() - str.replace(",", "").length();
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.a("[replaceCommaToPoint] value = %1$s, count =%2$s", str, Integer.valueOf(length));
            if (length == 1) {
                str = str.replaceAll(",", ".");
            }
        } catch (Exception e) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_COMMON);
            aVar2.a("[replaceCommaToPoint] e = %s", e.toString());
        }
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputObj{value='");
        sb.append(this.a);
        sb.append("', msg='");
        sb.append(this.b);
        sb.append("', chuanCount=");
        return uvh.a(sb, this.c, '}');
    }
}
