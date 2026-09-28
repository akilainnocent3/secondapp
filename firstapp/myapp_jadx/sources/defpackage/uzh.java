package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class uzh {
    public static final tv60 a = new tv60();
    public static final tzh b = new tzh();

    public static final byte a(char c) {
        if (c < '~') {
            return y77.b[c];
        }
        return (byte) 0;
    }

    public static final lyh b(lyh lyhVar) {
        return lyhVar instanceof uwd0 ? lyhVar : c(lyhVar, a, b);
    }

    public static final jte c(lyh lyhVar, Function1 function1, Function2 function2) {
        if (lyhVar instanceof jte) {
            jte jteVar = (jte) lyhVar;
            if (jteVar.b == function1 && jteVar.c == function2) {
                return jteVar;
            }
        }
        return new jte(lyhVar, function1, function2);
    }

    public static final String d(byte b2) {
        if (b2 == 1) {
            return "quotation mark '\"'";
        }
        if (b2 == 2) {
            return "string escape sequence '\\'";
        }
        if (b2 == 4) {
            return "comma ','";
        }
        if (b2 == 5) {
            return "colon ':'";
        }
        if (b2 == 6) {
            return "start of the object '{'";
        }
        if (b2 == 7) {
            return "end of the object '}'";
        }
        if (b2 == 8) {
            return "start of the array '['";
        }
        if (b2 == 9) {
            return "end of the array ']'";
        }
        if (b2 == 10) {
            return "end of the input";
        }
        return b2 == 127 ? "invalid token" : "valid token";
    }
}
