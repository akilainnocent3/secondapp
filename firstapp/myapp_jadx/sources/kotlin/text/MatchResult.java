package kotlin.text;

import defpackage.n8v;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/MatchResult;", "", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface MatchResult {
    List<String> a();

    IntRange b();

    String getValue();

    n8v next();
}
