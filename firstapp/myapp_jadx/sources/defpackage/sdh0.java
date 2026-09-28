package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes8.dex */
public final class sdh0 extends c87 {
    @Override // defpackage.c87
    public final int a(String str, int i, StringWriter stringWriter) throws IOException {
        int i2;
        int i3;
        if (str.charAt(i) == '\\' && (i2 = i + 1) < str.length() && str.charAt(i2) == 'u') {
            int i4 = 2;
            while (true) {
                i3 = i + i4;
                if (i3 >= str.length() || str.charAt(i3) != 'u') {
                    break;
                }
                i4++;
            }
            if (i3 < str.length() && str.charAt(i3) == '+') {
                i4++;
            }
            int i5 = i + i4;
            int i6 = i5 + 4;
            if (i6 <= str.length()) {
                CharSequence charSequenceSubSequence = str.subSequence(i5, i6);
                try {
                    stringWriter.write((char) Integer.parseInt(charSequenceSubSequence.toString(), 16));
                    return i4 + 4;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Unable to parse unicode value: " + ((Object) charSequenceSubSequence), e);
                }
            }
            d9h0.a(str.subSequence(i, str.length()), "Less than 4 hex digits in unicode value: '", "' due to end of CharSequence");
        }
        return 0;
    }
}
