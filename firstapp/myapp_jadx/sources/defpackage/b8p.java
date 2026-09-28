package defpackage;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class b8p extends f08 {
    public final int b = 32;
    public final int c;

    public b8p(int i) {
        this.c = i;
    }

    @Override // defpackage.f08
    public final boolean b(int i, StringWriter stringWriter) throws IOException {
        if (i >= this.b && i <= this.c) {
            return false;
        }
        if (i <= 65535) {
            stringWriter.write("\\u");
            char[] cArr = c87.a;
            stringWriter.write(cArr[(i >> 12) & 15]);
            stringWriter.write(cArr[(i >> 8) & 15]);
            stringWriter.write(cArr[(i >> 4) & 15]);
            stringWriter.write(cArr[i & 15]);
            return true;
        }
        char[] chars = Character.toChars(i);
        StringBuilder sb = new StringBuilder("\\u");
        String hexString = Integer.toHexString(chars[0]);
        Locale locale = Locale.ENGLISH;
        sb.append(hexString.toUpperCase(locale));
        sb.append("\\u");
        sb.append(Integer.toHexString(chars[1]).toUpperCase(locale));
        stringWriter.write(sb.toString());
        return true;
    }
}
