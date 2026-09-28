package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class y9g {
    public static final Regex a = new Regex("&(\\w+);");
    public static final Map<String, String> b = kpu.f(new Pair("amp", "&"), new Pair("lt", "<"), new Pair("gt", ">"), new Pair("quot", "\""), new Pair("apos", "'"), new Pair("nbsp", " "));
}
