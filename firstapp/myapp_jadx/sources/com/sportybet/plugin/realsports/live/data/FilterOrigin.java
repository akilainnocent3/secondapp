package com.sportybet.plugin.realsports.live.data;

import defpackage.om2;
import defpackage.tag;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/sportybet/plugin/realsports/live/data/FilterOrigin;", "", "originName", "", "sportIdWhitelist", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)V", "getOriginName", "()Ljava/lang/String;", "getSportIdWhitelist", "()Ljava/util/List;", "VIRTUALS", "Companion", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum FilterOrigin {
    VIRTUALS("virtuals", b.k("sr:sport:202120001", "sr:sport:137", "sr:sport:153", "sr:sport:109", "sr:sport:110", "sr:sport:111"));

    private final String originName;
    private final List<String> sportIdWhitelist;
    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/sportybet/plugin/realsports/live/data/FilterOrigin$Companion;", "", "<init>", "()V", "getFilterOriginByOriginName", "Lcom/sportybet/plugin/realsports/live/data/FilterOrigin;", "filterOriginName", "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FilterOrigin getFilterOriginByOriginName(String filterOriginName) {
            FilterOrigin filterOrigin = null;
            if (filterOriginName == null || filterOriginName.length() == 0) {
                return null;
            }
            for (FilterOrigin filterOrigin2 : FilterOrigin.getEntries()) {
                String originName = filterOrigin2.getOriginName();
                Locale locale = Locale.ROOT;
                String lowerCase = originName.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = filterOriginName.toLowerCase(locale);
                lowerCase2.getClass();
                if (Intrinsics.g(lowerCase, lowerCase2)) {
                    filterOrigin = filterOrigin2;
                    break;
                }
            }
            return filterOrigin;
        }

        private Companion() {
        }
    }

    FilterOrigin(String str, List list) {
        this.originName = str;
        this.sportIdWhitelist = list;
    }

    public static tag<FilterOrigin> getEntries() {
        return $ENTRIES;
    }

    public final String getOriginName() {
        return this.originName;
    }

    public final List<String> getSportIdWhitelist() {
        return this.sportIdWhitelist;
    }
}
