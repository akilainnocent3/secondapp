package defpackage;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class ku {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static HashMap a(String str) {
        String strGroup;
        str.getClass();
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        byte[] bytes = str.getBytes(charsetForName);
        bytes.getClass();
        Charset charsetForName2 = Charset.forName("UTF-8");
        charsetForName2.getClass();
        String str2 = new String(bytes, charsetForName2);
        Pattern patternCompile = Pattern.compile("[\ud83c-\u10fc00-\udfff]+");
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str2);
        matcher.getClass();
        if (matcher.find()) {
            strGroup = matcher.group();
            strGroup.getClass();
        } else {
            strGroup = "";
        }
        String lowerCase = c.p(fu5.a("[^a-zA-Z0-9\\s]", StringsKt.t0(c.p(str, strGroup, "", false)).toString(), ""), " ", "_", false).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return kpu.d(new Pair(lowerCase.concat("_message"), strGroup));
    }
}
