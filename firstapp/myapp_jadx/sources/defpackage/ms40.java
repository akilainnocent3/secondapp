package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
public final /* synthetic */ class ms40 extends saj implements Function1<MatchResult, MatchResult> {
    public static final ms40 a = new ms40();

    public ms40() {
        super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MatchResult invoke(MatchResult matchResult) {
        MatchResult matchResult2 = matchResult;
        matchResult2.getClass();
        return matchResult2.next();
    }
}
