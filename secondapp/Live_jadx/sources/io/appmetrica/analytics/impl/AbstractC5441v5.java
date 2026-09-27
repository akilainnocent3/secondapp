package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC5441v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f98436a = CollectionUtils.createSortedListWithoutRepetitions("id", "type", "report_request_parameters", "session_description");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f98437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f98438c;

    static {
        Locale locale = Locale.US;
        f98437b = String.format(locale, "SELECT DISTINCT %s  FROM %s WHERE %s >=0 AND (SELECT count() FROM %5$s WHERE %5$s.%6$s = %2$s.%3$s AND %5$s.%7$s = %2$s.%4$s) > 0 ORDER BY %3$s LIMIT 1", "report_request_parameters", "sessions", "id", "type", "events", "session_id", "session_type");
        f98438c = String.format(locale, "(select count(%s.%s) from %s where %s.%s = %s.%s) = 0 and cast(%s as integer) < ?", "events", "id", "events", "events", "session_id", "sessions", "id", "id");
    }
}
