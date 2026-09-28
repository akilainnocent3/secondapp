package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sporty.android.book.domain.entity.MarketGroup;
import com.sporty.android.book.domain.entity.SimpleMarket;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.plugin.realsports.data.Event;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public final class eng {
    public final mpe0 a = hwr.b(new n98(1));

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"eng$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/sporty/android/book/domain/entity/SimpleMarket;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends SimpleMarket>> {
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"eng$b", "Lcom/google/gson/reflect/TypeToken;", "", "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b extends TypeToken<List<? extends Integer>> {
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"eng$c", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/sporty/android/book/domain/entity/MarketGroup;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class c extends TypeToken<List<? extends MarketGroup>> {
    }

    public final List<SimpleMarket> a(String str) {
        if (str == null) {
            return null;
        }
        Type type = new a().getType();
        try {
            zi50.a aVar = zi50.b;
            return (List) d().fromJson(str, type);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            if (zi50.a(new zi50.b(th)) == null) {
                return null;
            }
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_CACHE_DB);
            aVar3.a("AvailableMarkets convert from JS string failed", new Object[0]);
            return null;
        }
    }

    public final Event b(String str) {
        if (str == null) {
            return null;
        }
        try {
            zi50.a aVar = zi50.b;
            return (Event) d().fromJson(str, Event.class);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            if (zi50.a(new zi50.b(th)) == null) {
                return null;
            }
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_CACHE_DB);
            aVar3.a("Event convert from JS string failed", new Object[0]);
            return null;
        }
    }

    public final List<Integer> c(String str) {
        if (str == null) {
            return null;
        }
        Type type = new b().getType();
        try {
            zi50.a aVar = zi50.b;
            return (List) d().fromJson(str, type);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            if (zi50.a(new zi50.b(th)) == null) {
                return null;
            }
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_CACHE_DB);
            aVar3.a("FavoriteMarketIds convert from JS string failed", new Object[0]);
            return null;
        }
    }

    public final JsonSerializeService d() {
        return (JsonSerializeService) this.a.getValue();
    }

    public final List<MarketGroup> e(String str) {
        if (str == null) {
            return null;
        }
        Type type = new c().getType();
        try {
            zi50.a aVar = zi50.b;
            return (List) d().fromJson(str, type);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            if (zi50.a(new zi50.b(th)) == null) {
                return null;
            }
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_CACHE_DB);
            aVar3.a("MarketGroup convert from JS string failed", new Object[0]);
            return null;
        }
    }
}
