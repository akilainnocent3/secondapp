package defpackage;

import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sporty.android.permission.location.KN.qUnCRF;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes8.dex */
public final class r9e0 {
    public static final rr a;

    public static class a extends c87 {
        @Override // defpackage.c87
        public final int a(String str, int i, StringWriter stringWriter) throws IOException {
            if (i != 0) {
                ib5.a("XsiUnescaper should never reach the [1] index");
                return 0;
            }
            String string = str.toString();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int iIndexOf = string.indexOf(92, i2);
                if (iIndexOf == -1) {
                    break;
                }
                if (iIndexOf > i3) {
                    stringWriter.write(string.substring(i3, iIndexOf));
                }
                i3 = iIndexOf + 1;
                i2 = iIndexOf + 2;
            }
            if (i3 < string.length()) {
                stringWriter.write(string.substring(i3));
            }
            return Character.codePointCount(str, 0, str.length());
        }
    }

    public static String a(String str) {
        rr rrVar = a;
        rrVar.getClass();
        if (str == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(str.length() * 2);
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iA = rrVar.a(str, iCharCount, stringWriter);
                if (iA == 0) {
                    char cCharAt = str.charAt(iCharCount);
                    stringWriter.write(cCharAt);
                    int i = iCharCount + 1;
                    if (Character.isHighSurrogate(cCharAt) && i < length) {
                        char cCharAt2 = str.charAt(i);
                        if (Character.isLowSurrogate(cCharAt2)) {
                            stringWriter.write(cCharAt2);
                            iCharCount += 2;
                        }
                    }
                    iCharCount = i;
                } else {
                    for (int i2 = 0; i2 < iA; i2++) {
                        iCharCount += Character.charCount(Character.codePointAt(str, iCharCount));
                    }
                }
            }
            return stringWriter.toString();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("\"", "\\\"");
        map.put("\\", "\\\\");
        nlt nltVar = new nlt(Collections.unmodifiableMap(map));
        Map<CharSequence, CharSequence> map2 = w9g.i;
        new rr(nltVar, new nlt(map2), new b8p(127));
        HashMap map3 = new HashMap();
        map3.put("'", "\\'");
        map3.put("\"", "\\\"");
        map3.put("\\", "\\\\");
        map3.put("/", "\\/");
        new rr(new nlt(Collections.unmodifiableMap(map3)), new nlt(map2), new b8p(127));
        HashMap map4 = new HashMap();
        map4.put("\"", "\\\"");
        map4.put("\\", "\\\\");
        map4.put("/", "\\/");
        new rr(new nlt(Collections.unmodifiableMap(map4)), new nlt(map2), new b8p(WebSocketProtocol.PAYLOAD_SHORT));
        HashMap map5 = new HashMap();
        map5.put("\u0000", "");
        map5.put("\u0001", "");
        map5.put("\u0002", "");
        map5.put("\u0003", "");
        map5.put("\u0004", "");
        map5.put("\u0005", "");
        map5.put("\u0006", "");
        map5.put("\u0007", "");
        map5.put("\b", "");
        map5.put("\u000b", "");
        map5.put("\f", "");
        map5.put("\u000e", "");
        map5.put("\u000f", "");
        map5.put("\u0010", "");
        map5.put("\u0011", "");
        map5.put("\u0012", "");
        map5.put("\u0013", "");
        map5.put("\u0014", "");
        map5.put("\u0015", "");
        map5.put("\u0016", "");
        map5.put("\u0017", "");
        map5.put("\u0018", "");
        map5.put("\u0019", "");
        map5.put(yFmFZvuWxAYfEj.XLyFXgBLxec, "");
        map5.put("\u001b", "");
        map5.put("\u001c", "");
        map5.put("\u001d", "");
        map5.put("\u001e", "");
        map5.put("\u001f", "");
        map5.put("\ufffe", "");
        map5.put("\uffff", "");
        Map<CharSequence, CharSequence> map6 = w9g.e;
        nlt nltVar2 = new nlt(map6);
        Map<CharSequence, CharSequence> map7 = w9g.g;
        new rr(nltVar2, new nlt(map7), new nlt(Collections.unmodifiableMap(map5)), new f6y(127, 132), new f6y(134, 159), new tdh0());
        HashMap map8 = new HashMap();
        map8.put("\u0000", "");
        map8.put("\u000b", "&#11;");
        map8.put("\f", "&#12;");
        map8.put("\ufffe", "");
        map8.put("\uffff", "");
        new rr(new nlt(map6), new nlt(map7), new nlt(Collections.unmodifiableMap(map8)), new f6y(1, 8), new f6y(14, 31), new f6y(127, 132), new f6y(134, 159), new tdh0());
        nlt nltVar3 = new nlt(map6);
        Map<CharSequence, CharSequence> map9 = w9g.a;
        new rr(nltVar3, new nlt(map9));
        new rr(new nlt(map6), new nlt(map9), new nlt(w9g.c));
        new z3c.a();
        HashMap map10 = new HashMap();
        map10.put("|", "\\|");
        map10.put("&", "\\&");
        map10.put(";", "\\;");
        map10.put("<", "\\<");
        map10.put(">", "\\>");
        map10.put("(", "\\(");
        map10.put(")", "\\)");
        map10.put("$", LxHElgWAiSeM.MxaSHKUlPPlWgA);
        map10.put("`", "\\`");
        map10.put("\\", "\\\\");
        map10.put("\"", "\\\"");
        map10.put("'", "\\'");
        map10.put(qUnCRF.UzlASOMKYkLbQS, "\\ ");
        map10.put("\t", "\\\t");
        map10.put("\r\n", "");
        map10.put("\n", "");
        map10.put("*", "\\*");
        map10.put("?", "\\?");
        map10.put("[", "\\[");
        map10.put("#", "\\#");
        map10.put("~", "\\~");
        map10.put("=", "\\=");
        map10.put("%", "\\%");
        new nlt(Collections.unmodifiableMap(map10));
        HashMap map11 = new HashMap();
        map11.put("\\\\", "\\");
        map11.put("\\\"", "\"");
        map11.put("\\'", "'");
        map11.put("\\", "");
        a = new rr(new rfy(), new sdh0(), new nlt(w9g.j), new nlt(Collections.unmodifiableMap(map11)));
        Map<CharSequence, CharSequence> map12 = w9g.f;
        nlt nltVar4 = new nlt(map12);
        Map<CharSequence, CharSequence> map13 = w9g.b;
        new rr(nltVar4, new nlt(map13), new g6y(new g6y.a[0]));
        new rr(new nlt(map12), new nlt(map13), new nlt(w9g.d), new g6y(new g6y.a[0]));
        new rr(new nlt(map12), new nlt(w9g.h), new g6y(new g6y.a[0]));
        new z3c.b();
        new a();
    }
}
