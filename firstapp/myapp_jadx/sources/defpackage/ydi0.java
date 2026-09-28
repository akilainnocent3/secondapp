package defpackage;

import kotlin.Unit;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes8.dex */
public final class ydi0 {
    public static nk0 a(String str) {
        str.getClass();
        nk0.b bVar = new nk0.b((Object) null);
        q1k.a aVar = new q1k.a(Regex.c(new Regex("<strong>(.*?)</strong>"), str));
        int i = 0;
        while (aVar.hasNext()) {
            MatchResult matchResult = (MatchResult) aVar.next();
            bVar.g(str.substring(i, matchResult.b().a));
            int iL = bVar.l(new ora0(0L, 0L, t9i.E, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65531));
            try {
                bVar.g(matchResult.a().get(1));
                Unit unit = Unit.a;
                bVar.i(iL);
                i = matchResult.b().b + 1;
            } catch (Throwable th) {
                bVar.i(iL);
                throw th;
            }
        }
        if (i < str.length()) {
            bVar.g(str.substring(i));
        }
        return bVar.m();
    }
}
