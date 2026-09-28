package defpackage;

import com.sportybet.plugin.realsports.searchv2.data.model.SearchResultsDto;
import com.sportybet.plugin.realsports.searchv2.data.model.SearchSuggestions;
import com.sportybet.plugin.realsports.searchv2.data.model.SearchTrending;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lst70;", "", "Lzi50;", "Lcom/sportybet/plugin/realsports/searchv2/data/model/SearchTrending;", "c", "(Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/plugin/realsports/searchv2/data/model/SearchSuggestions;", "b", "", "query", "Lcom/sportybet/plugin/realsports/searchv2/data/model/SearchResultsDto;", "a", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface st70 {
    @sbj("factsCenter/search")
    Object a(@db30("q") String str, v1b<? super zi50<SearchResultsDto>> v1bVar);

    @sbj("factsCenter/search/suggestmap")
    Object b(v1b<? super zi50<SearchSuggestions>> v1bVar);

    @sbj("factsCenter/search/trending")
    Object c(v1b<? super zi50<SearchTrending>> v1bVar);
}
