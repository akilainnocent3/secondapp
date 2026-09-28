package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class rfy extends c87 {
    @Override // defpackage.c87
    public final int a(String str, int i, StringWriter stringWriter) throws IOException {
        int i2;
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        int length = (str.length() - i) - 1;
        StringBuilder sb = new StringBuilder();
        if (str.charAt(i) != '\\' || length <= 0 || (cCharAt = str.charAt((i2 = i + 1))) < '0' || cCharAt > '7') {
            return 0;
        }
        int i3 = i + 2;
        int i4 = i + 3;
        sb.append(str.charAt(i2));
        if (length > 1 && (cCharAt2 = str.charAt(i3)) >= '0' && cCharAt2 <= '7') {
            sb.append(str.charAt(i3));
            if (length > 2 && (cCharAt3 = str.charAt(i2)) >= '0' && cCharAt3 <= '3' && (cCharAt4 = str.charAt(i4)) >= '0' && cCharAt4 <= '7') {
                sb.append(str.charAt(i4));
            }
        }
        stringWriter.write(Integer.parseInt(sb.toString(), 8));
        return sb.length() + 1;
    }
}
