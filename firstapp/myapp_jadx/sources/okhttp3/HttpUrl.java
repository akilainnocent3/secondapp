package okhttp3;

import com.twilio.voice.EventKeys;
import defpackage.fae;
import defpackage.fu5;
import defpackage.gqm;
import defpackage.hb5;
import defpackage.hce0;
import defpackage.hqm;
import defpackage.ib5;
import defpackage.inm;
import defpackage.kb5;
import defpackage.l48;
import defpackage.m2g;
import defpackage.pr0;
import defpackage.rh6;
import defpackage.sbz;
import defpackage.t3g;
import defpackage.wae0;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\"\n\u0002\b\u0016\u0018\u0000 Z2\u00020\u0001:\u0002[ZJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010\u0017J\u000f\u0010&\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b&\u0010\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b(\u0010\bJ\u000f\u0010*\u001a\u00020\nH\u0007¢\u0006\u0004\b)\u0010\u0017J\u000f\u0010,\u001a\u00020\nH\u0007¢\u0006\u0004\b+\u0010\u0017J\u000f\u0010.\u001a\u00020\nH\u0007¢\u0006\u0004\b-\u0010\u0017J\u000f\u00100\u001a\u00020\nH\u0007¢\u0006\u0004\b/\u0010\u0017J\u000f\u00102\u001a\u00020\nH\u0007¢\u0006\u0004\b1\u0010\u0017J\u000f\u00104\u001a\u00020\nH\u0007¢\u0006\u0004\b3\u0010\u0017J\u000f\u00106\u001a\u00020\u0011H\u0007¢\u0006\u0004\b5\u0010$J\u000f\u00108\u001a\u00020\u0011H\u0007¢\u0006\u0004\b7\u0010$J\u000f\u0010:\u001a\u00020\nH\u0007¢\u0006\u0004\b9\u0010\u0017J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007¢\u0006\u0004\b;\u0010<J\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007¢\u0006\u0004\b>\u0010<J\u0011\u0010A\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b@\u0010\u0017J\u0011\u0010C\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bB\u0010\u0017J\u000f\u0010E\u001a\u00020\u0011H\u0007¢\u0006\u0004\bD\u0010$J\u0015\u0010I\u001a\b\u0012\u0004\u0012\u00020\n0FH\u0007¢\u0006\u0004\bG\u0010HJ\u0011\u0010K\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bJ\u0010\u0017J\u0011\u0010M\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bL\u0010\u0017R\u0017\u0010*\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b*\u0010\u0017R\u0017\u0010.\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\bP\u0010O\u001a\u0004\b.\u0010\u0017R\u0017\u00102\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\bQ\u0010O\u001a\u0004\b2\u0010\u0017R\u0017\u00104\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\bR\u0010O\u001a\u0004\b4\u0010\u0017R\u0017\u00106\u001a\u00020\u00118\u0007¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\b6\u0010$R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0007¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\b?\u0010<R\u0019\u0010M\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\bW\u0010O\u001a\u0004\bM\u0010\u0017R\u0011\u0010X\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0011\u0010,\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b,\u0010\u0017R\u0011\u00100\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b0\u0010\u0017R\u0011\u00108\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b8\u0010$R\u0011\u0010:\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b:\u0010\u0017R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8G¢\u0006\u0006\u001a\u0004\b=\u0010<R\u0013\u0010A\u001a\u0004\u0018\u00010\n8G¢\u0006\u0006\u001a\u0004\bA\u0010\u0017R\u0013\u0010C\u001a\u0004\u0018\u00010\n8G¢\u0006\u0006\u001a\u0004\bC\u0010\u0017R\u0011\u0010E\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\bE\u0010$R\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020\n0F8G¢\u0006\u0006\u001a\u0004\bI\u0010HR\u0013\u0010K\u001a\u0004\u0018\u00010\n8G¢\u0006\u0006\u001a\u0004\bK\u0010\u0017¨\u0006\\"}, d2 = {"Lokhttp3/HttpUrl;", "", "Ljava/net/URL;", "url", "()Ljava/net/URL;", "toUrl", "Ljava/net/URI;", "uri", "()Ljava/net/URI;", "toUri", "", "name", "queryParameter", "(Ljava/lang/String;)Ljava/lang/String;", "", "queryParameterValues", "(Ljava/lang/String;)Ljava/util/List;", "", "index", "queryParameterName", "(I)Ljava/lang/String;", "queryParameterValue", "redact", "()Ljava/lang/String;", "link", "resolve", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "Lokhttp3/HttpUrl$Builder;", "newBuilder", "()Lokhttp3/HttpUrl$Builder;", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "topPrivateDomain", "-deprecated_url", "-deprecated_uri", "-deprecated_scheme", "scheme", "-deprecated_encodedUsername", "encodedUsername", "-deprecated_username", "username", "-deprecated_encodedPassword", "encodedPassword", "-deprecated_password", "password", "-deprecated_host", "host", "-deprecated_port", EventKeys.PORT, "-deprecated_pathSize", "pathSize", "-deprecated_encodedPath", "encodedPath", "-deprecated_encodedPathSegments", "()Ljava/util/List;", "encodedPathSegments", "-deprecated_pathSegments", "pathSegments", "-deprecated_encodedQuery", "encodedQuery", "-deprecated_query", "query", "-deprecated_querySize", "querySize", "", "-deprecated_queryParameterNames", "()Ljava/util/Set;", "queryParameterNames", "-deprecated_encodedFragment", "encodedFragment", "-deprecated_fragment", "fragment", "a", "Ljava/lang/String;", "b", "c", "d", "e", "I", "f", "Ljava/util/List;", "h", "isHttps", "()Z", "Companion", "Builder", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HttpUrl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String scheme;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String username;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String password;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String host;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int port;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final List<String> pathSegments;
    public final List<String> g;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final String fragment;
    public final String i;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010!\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0006J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0006J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0006J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0006J\u001d\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u000eJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u0006J\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u0006J\u001f\u0010!\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010\"J\u001f\u0010&\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b&\u0010\"J\u001f\u0010'\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\"J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u0006J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b)\u0010\u0006J\u0017\u0010*\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b*\u0010\u0006J\u0017\u0010+\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010.\u001a\u00020\u0000H\u0000¢\u0006\u0004\b,\u0010-J\r\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u00103J!\u00108\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010/2\u0006\u00105\u001a\u00020\u0004H\u0000¢\u0006\u0004\b6\u00107R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u00103\"\u0004\b<\u0010=R\"\u0010\b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010:\u001a\u0004\b?\u00103\"\u0004\b@\u0010=R\"\u0010\n\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010:\u001a\u0004\bB\u00103\"\u0004\bC\u0010=R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010:\u001a\u0004\bE\u00103\"\u0004\bF\u0010=R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR,\u0010V\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010M8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010O\u001a\u0004\bS\u0010Q\"\u0004\bT\u0010UR$\u0010+\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010:\u001a\u0004\bX\u00103\"\u0004\bY\u0010=¨\u0006Z"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "<init>", "()V", "", "scheme", "(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "username", "encodedUsername", "password", "encodedPassword", "host", "", EventKeys.PORT, "(I)Lokhttp3/HttpUrl$Builder;", "pathSegment", "addPathSegment", "pathSegments", "addPathSegments", "encodedPathSegment", "addEncodedPathSegment", "encodedPathSegments", "addEncodedPathSegments", "index", "setPathSegment", "(ILjava/lang/String;)Lokhttp3/HttpUrl$Builder;", "setEncodedPathSegment", "removePathSegment", "encodedPath", "query", "encodedQuery", "name", "value", "addQueryParameter", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "encodedName", "encodedValue", "addEncodedQueryParameter", "setQueryParameter", "setEncodedQueryParameter", "removeAllQueryParameters", "removeAllEncodedQueryParameters", "fragment", "encodedFragment", "reencodeForUri$okhttp", "()Lokhttp3/HttpUrl$Builder;", "reencodeForUri", "Lokhttp3/HttpUrl;", "build", "()Lokhttp3/HttpUrl;", "toString", "()Ljava/lang/String;", "base", "input", "parse$okhttp", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "parse", "a", "Ljava/lang/String;", "getScheme$okhttp", "setScheme$okhttp", "(Ljava/lang/String;)V", "b", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "c", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "d", "getHost$okhttp", "setHost$okhttp", "e", "I", "getPort$okhttp", "()I", "setPort$okhttp", "(I)V", "", "f", "Ljava/util/List;", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "g", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "h", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public String scheme;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public String host;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public List<String> encodedQueryNamesAndValues;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public String encodedFragment;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public String encodedUsername = "";

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public String encodedPassword = "";

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public int port = -1;
        public final ArrayList f = b.l("");

        public static boolean b(String str) {
            return Intrinsics.g(str, ".") || c.l(str, "%2e", true);
        }

        public static boolean c(String str) {
            return Intrinsics.g(str, "..") || c.l(str, "%2e.", true) || c.l(str, ".%2e", true) || c.l(str, "%2e%2e", true);
        }

        public static ArrayList g(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iS = StringsKt.S(str, '&', i, 4);
                if (iS == -1) {
                    iS = str.length();
                }
                int iS2 = StringsKt.S(str, '=', i, 4);
                if (iS2 == -1 || iS2 > iS) {
                    arrayList.add(str.substring(i, iS));
                    arrayList.add(null);
                } else {
                    arrayList.add(str.substring(i, iS2));
                    arrayList.add(str.substring(iS2 + 1, iS));
                }
                i = iS + 1;
            }
            return arrayList;
        }

        public final void a(String str, boolean z) {
            int i = 0;
            while (true) {
                int iDelimiterOffset = _UtilCommonKt.delimiterOffset(str, "/\\", i, str.length());
                this.d(i, iDelimiterOffset, str, iDelimiterOffset < str.length(), z);
                i = iDelimiterOffset + 1;
                if (i > str.length()) {
                    return;
                }
                this = this;
                str = str;
                z = z;
            }
        }

        public final Builder addEncodedPathSegment(String encodedPathSegment) {
            encodedPathSegment.getClass();
            d(0, encodedPathSegment.length(), encodedPathSegment, false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String encodedPathSegments) {
            encodedPathSegments.getClass();
            a(encodedPathSegments, true);
            return this;
        }

        public final Builder addEncodedQueryParameter(String encodedName, String encodedValue) {
            encodedName.getClass();
            List arrayList = this.encodedQueryNamesAndValues;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.encodedQueryNamesAndValues = arrayList;
            }
            arrayList.getClass();
            arrayList.add(_UrlKt.canonicalize$default(encodedName, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null));
            List<String> list = this.encodedQueryNamesAndValues;
            list.getClass();
            list.add(encodedValue != null ? _UrlKt.canonicalize$default(encodedValue, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null) : null);
            return this;
        }

        public final Builder addPathSegment(String pathSegment) {
            pathSegment.getClass();
            d(0, pathSegment.length(), pathSegment, false, false);
            return this;
        }

        public final Builder addPathSegments(String pathSegments) {
            pathSegments.getClass();
            a(pathSegments, false);
            return this;
        }

        public final Builder addQueryParameter(String name, String value) {
            name.getClass();
            List arrayList = this.encodedQueryNamesAndValues;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.encodedQueryNamesAndValues = arrayList;
            }
            arrayList.getClass();
            arrayList.add(_UrlKt.canonicalize$default(name, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null));
            List<String> list = this.encodedQueryNamesAndValues;
            list.getClass();
            list.add(value != null ? _UrlKt.canonicalize$default(value, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null) : null);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                ib5.a("scheme == null");
                return null;
            }
            String strPercentDecode$default = _UrlKt.percentDecode$default(this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$default2 = _UrlKt.percentDecode$default(this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                ib5.a("host == null");
                return null;
            }
            int iDefaultPort = this.port;
            if (iDefaultPort == -1) {
                Companion companion = HttpUrl.INSTANCE;
                String str3 = this.scheme;
                str3.getClass();
                iDefaultPort = companion.defaultPort(str3);
            }
            ArrayList arrayList2 = this.f;
            ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, 10));
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                arrayList3.add(_UrlKt.percentDecode$default((String) obj, 0, 0, false, 7, null));
            }
            List<String> list = this.encodedQueryNamesAndValues;
            if (list != null) {
                arrayList = new ArrayList(l48.r(list, 10));
                for (String str4 : list) {
                    arrayList.add(str4 != null ? _UrlKt.percentDecode$default(str4, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str5 = this.encodedFragment;
            return new HttpUrl(str, strPercentDecode$default, strPercentDecode$default2, str2, iDefaultPort, arrayList3, arrayList, str5 != null ? _UrlKt.percentDecode$default(str5, 0, 0, false, 7, null) : null, toString(), null);
        }

        public final void d(int i, int i2, String str, boolean z, boolean z2) {
            String strCanonicalize$default = _UrlKt.canonicalize$default(str, i, i2, _UrlKt.PATH_SEGMENT_ENCODE_SET, z2, false, false, false, 112, null);
            if (b(strCanonicalize$default)) {
                return;
            }
            boolean zC = c(strCanonicalize$default);
            ArrayList arrayList = this.f;
            if (zC) {
                if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                    arrayList.add("");
                    return;
                } else {
                    arrayList.set(arrayList.size() - 1, "");
                    return;
                }
            }
            if (((CharSequence) rh6.a(1, arrayList)).length() == 0) {
                arrayList.set(arrayList.size() - 1, strCanonicalize$default);
            } else {
                arrayList.add(strCanonicalize$default);
            }
            if (z) {
                arrayList.add("");
            }
        }

        public final void e(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            list.getClass();
            int size = list.size() - 2;
            int iA = sbz.a(size, 0, -2);
            if (iA > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                list2.getClass();
                if (Intrinsics.g(str, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    list3.getClass();
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    list4.getClass();
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    list5.getClass();
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == iA) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        public final Builder encodedFragment(String encodedFragment) {
            this.encodedFragment = encodedFragment != null ? _UrlKt.canonicalize$default(encodedFragment, 0, 0, "", true, false, false, true, 51, null) : null;
            return this;
        }

        public final Builder encodedPassword(String encodedPassword) {
            encodedPassword.getClass();
            this.encodedPassword = _UrlKt.canonicalize$default(encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 115, null);
            return this;
        }

        public final Builder encodedPath(String encodedPath) {
            encodedPath.getClass();
            if (c.u(encodedPath, "/", false)) {
                f(0, encodedPath.length(), encodedPath);
                return this;
            }
            kb5.a("unexpected encodedPath: ".concat(encodedPath));
            return null;
        }

        public final Builder encodedQuery(String encodedQuery) {
            String strCanonicalize$default;
            this.encodedQueryNamesAndValues = (encodedQuery == null || (strCanonicalize$default = _UrlKt.canonicalize$default(encodedQuery, 0, 0, _UrlKt.QUERY_ENCODE_SET, true, false, true, false, 83, null)) == null) ? null : g(strCanonicalize$default);
            return this;
        }

        public final Builder encodedUsername(String encodedUsername) {
            encodedUsername.getClass();
            this.encodedUsername = _UrlKt.canonicalize$default(encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 115, null);
            return this;
        }

        public final void f(int i, int i2, String str) {
            if (i == i2) {
                return;
            }
            char cCharAt = str.charAt(i);
            ArrayList arrayList = this.f;
            if (cCharAt == '/' || cCharAt == '\\') {
                arrayList.clear();
                arrayList.add("");
                i++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            int i3 = i;
            while (i3 < i2) {
                int iDelimiterOffset = _UtilCommonKt.delimiterOffset(str, "/\\", i3, i2);
                boolean z = iDelimiterOffset < i2;
                this = this;
                String str2 = str;
                this.d(i3, iDelimiterOffset, str2, z, true);
                i3 = z ? iDelimiterOffset + 1 : iDelimiterOffset;
                str = str2;
            }
        }

        public final Builder fragment(String fragment) {
            this.encodedFragment = fragment != null ? _UrlKt.canonicalize$default(fragment, 0, 0, "", false, false, false, true, 59, null) : null;
            return this;
        }

        /* JADX INFO: renamed from: getEncodedFragment$okhttp, reason: from getter */
        public final String getEncodedFragment() {
            return this.encodedFragment;
        }

        /* JADX INFO: renamed from: getEncodedPassword$okhttp, reason: from getter */
        public final String getEncodedPassword() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.f;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        /* JADX INFO: renamed from: getEncodedUsername$okhttp, reason: from getter */
        public final String getEncodedUsername() {
            return this.encodedUsername;
        }

        /* JADX INFO: renamed from: getHost$okhttp, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        /* JADX INFO: renamed from: getPort$okhttp, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        /* JADX INFO: renamed from: getScheme$okhttp, reason: from getter */
        public final String getScheme() {
            return this.scheme;
        }

        public final Builder host(String host) {
            host.getClass();
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(host, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            hb5.a(inm.a("unexpected host: ", host));
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:4:0x001c  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
        public final Builder parse$okhttp(HttpUrl base, String input) {
            int i;
            byte b;
            byte b2;
            int iDelimiterOffset;
            int i2;
            int i3;
            byte b3;
            int i4;
            int i5;
            int i6;
            char c;
            char cCharAt;
            String str = input;
            str.getClass();
            Builder builder = null;
            int iIndexOfFirstNonAsciiWhitespace$default = _UtilCommonKt.indexOfFirstNonAsciiWhitespace$default(str, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = _UtilCommonKt.indexOfLastNonAsciiWhitespace$default(str, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            byte b4 = -1;
            if (iIndexOfLastNonAsciiWhitespace$default - iIndexOfFirstNonAsciiWhitespace$default >= 2) {
                char cCharAt2 = str.charAt(iIndexOfFirstNonAsciiWhitespace$default);
                if ((Intrinsics.h(cCharAt2, 97) >= 0 && Intrinsics.h(cCharAt2, 122) <= 0) || (Intrinsics.h(cCharAt2, 65) >= 0 && Intrinsics.h(cCharAt2, 90) <= 0)) {
                    i = iIndexOfFirstNonAsciiWhitespace$default + 1;
                    while (true) {
                        if (i < iIndexOfLastNonAsciiWhitespace$default) {
                            char cCharAt3 = str.charAt(i);
                            if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                                if (cCharAt3 == ':') {
                                    break;
                                }
                                break;
                            }
                            i++;
                        }
                        i = -1;
                        break;
                    }
                } else {
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
            int i7 = 1;
            if (i != -1) {
                if (c.t(iIndexOfFirstNonAsciiWhitespace$default, str, "https:", true)) {
                    this.scheme = "https";
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!c.t(iIndexOfFirstNonAsciiWhitespace$default, str, "http:", true)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
                    }
                    this.scheme = "http";
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (base == null) {
                    hb5.a("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? wae0.K(6, str).concat("...") : str));
                    return null;
                }
                this.scheme = base.scheme();
            }
            int i8 = 0;
            int i9 = iIndexOfFirstNonAsciiWhitespace$default;
            while (true) {
                b = 92;
                b2 = 47;
                if (i9 >= iIndexOfLastNonAsciiWhitespace$default || !((cCharAt = str.charAt(i9)) == '/' || cCharAt == '\\')) {
                    break;
                }
                i8++;
                i9++;
            }
            byte b5 = 63;
            byte b6 = 35;
            if (i8 >= 2 || base == null || !Intrinsics.g(base.scheme(), this.scheme)) {
                int i10 = iIndexOfFirstNonAsciiWhitespace$default + i8;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    iDelimiterOffset = _UtilCommonKt.delimiterOffset(str, "@/\\?#", i10, iIndexOfLastNonAsciiWhitespace$default);
                    byte bCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? str.charAt(iDelimiterOffset) : b4;
                    if (bCharAt == b4 || bCharAt == b6 || bCharAt == b2 || bCharAt == b || bCharAt == b5) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (i11 == 0) {
                            int iDelimiterOffset2 = _UtilCommonKt.delimiterOffset(str, ':', i10, iDelimiterOffset);
                            i3 = i7;
                            b3 = b2;
                            String strCanonicalize$default = _UrlKt.canonicalize$default(str, i10, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                            if (i12 != 0) {
                                strCanonicalize$default = pr0.a(new StringBuilder(), this.encodedUsername, "%40", strCanonicalize$default);
                            }
                            this.encodedUsername = strCanonicalize$default;
                            if (iDelimiterOffset2 != iDelimiterOffset) {
                                int i13 = iDelimiterOffset2 + 1;
                                i5 = iDelimiterOffset;
                                this.encodedPassword = _UrlKt.canonicalize$default(input, i13, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                                i6 = i3;
                            } else {
                                i5 = iDelimiterOffset;
                                i6 = i11;
                            }
                            str = input;
                            i4 = i5;
                            i11 = i6;
                            i12 = i3;
                        } else {
                            i3 = i7;
                            b3 = b2;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.encodedPassword);
                            sb.append("%40");
                            str = input;
                            i4 = iDelimiterOffset;
                            sb.append(_UrlKt.canonicalize$default(str, i10, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null));
                            this.encodedPassword = sb.toString();
                        }
                        i10 = i4 + 1;
                        b2 = b3;
                        i7 = i3;
                        b = b;
                        builder = builder;
                        b5 = 63;
                        b6 = 35;
                        b4 = -1;
                    }
                }
                int i14 = iDelimiterOffset;
                int i15 = i7;
                Builder builder2 = builder;
                int i16 = i10;
                while (true) {
                    if (i16 < i14) {
                        char cCharAt4 = str.charAt(i16);
                        if (cCharAt4 == ':') {
                            break;
                        }
                        if (cCharAt4 == '[') {
                            do {
                                i16++;
                                if (i16 >= i14) {
                                    break;
                                }
                            } while (str.charAt(i16) != ']');
                        }
                        i16++;
                    } else {
                        i16 = i14;
                        break;
                    }
                }
                int i17 = i16 + 1;
                if (i17 < i14) {
                    int i18 = i10;
                    int i19 = i16;
                    this.host = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(str, i10, i16, false, 4, null));
                    str = input;
                    try {
                        String strCanonicalize$default2 = _UrlKt.canonicalize$default(str, i17, i14, "", false, false, false, false, 120, null);
                        i14 = i14;
                        try {
                            i2 = Integer.parseInt(strCanonicalize$default2);
                            if (i15 > i2 || i2 >= 65536) {
                                i2 = -1;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } catch (NumberFormatException unused2) {
                        i14 = i14;
                    }
                    this.port = i2;
                    if (i2 == -1) {
                        hqm.a(str.substring(i17, i14), "Invalid URL port: \"", 34);
                        return builder2;
                    }
                    i10 = i18;
                    i16 = i19;
                } else {
                    this.host = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(str, i10, i16, false, 4, null));
                    Companion companion = HttpUrl.INSTANCE;
                    String str2 = this.scheme;
                    str2.getClass();
                    this.port = companion.defaultPort(str2);
                }
                if (this.host == null) {
                    hqm.a(str.substring(i10, i16), "Invalid URL host: \"", 34);
                    return builder2;
                }
                iIndexOfFirstNonAsciiWhitespace$default = i14;
            } else {
                this.encodedUsername = base.encodedUsername();
                this.encodedPassword = base.encodedPassword();
                this.host = base.host();
                this.port = base.port();
                ArrayList arrayList = this.f;
                arrayList.clear();
                arrayList.addAll(base.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || str.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(base.encodedQuery());
                }
            }
            int iDelimiterOffset3 = _UtilCommonKt.delimiterOffset(str, "?#", iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            f(iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3, str);
            if (iDelimiterOffset3 >= iIndexOfLastNonAsciiWhitespace$default || str.charAt(iDelimiterOffset3) != '?') {
                c = '#';
            } else {
                c = '#';
                int iDelimiterOffset4 = _UtilCommonKt.delimiterOffset(str, '#', iDelimiterOffset3, iIndexOfLastNonAsciiWhitespace$default);
                this.encodedQueryNamesAndValues = g(_UrlKt.canonicalize$default(str, iDelimiterOffset3 + 1, iDelimiterOffset4, _UrlKt.QUERY_ENCODE_SET, true, false, true, false, 80, null));
                iDelimiterOffset3 = iDelimiterOffset4;
            }
            if (iDelimiterOffset3 < iIndexOfLastNonAsciiWhitespace$default && str.charAt(iDelimiterOffset3) == c) {
                this.encodedFragment = _UrlKt.canonicalize$default(str, iDelimiterOffset3 + 1, iIndexOfLastNonAsciiWhitespace$default, "", true, false, false, true, 48, null);
            }
            return this;
        }

        public final Builder password(String password) {
            password.getClass();
            this.encodedPassword = _UrlKt.canonicalize$default(password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        public final Builder port(int port) {
            if (1 > port || port >= 65536) {
                kb5.a(hce0.a(port, "unexpected port: "));
                return null;
            }
            this.port = port;
            return this;
        }

        public final Builder query(String query) {
            String strCanonicalize$default;
            this.encodedQueryNamesAndValues = (query == null || (strCanonicalize$default = _UrlKt.canonicalize$default(query, 0, 0, _UrlKt.QUERY_ENCODE_SET, false, false, true, false, 91, null)) == null) ? null : g(strCanonicalize$default);
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            this.host = str != null ? fu5.a("[\"<>^`{|}]", str, "") : null;
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.set(i, _UrlKt.canonicalize$default((String) arrayList.get(i), 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, 99, null));
            }
            List<String> list = this.encodedQueryNamesAndValues;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str2 = list.get(i2);
                    list.set(i2, str2 != null ? _UrlKt.canonicalize$default(str2, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, 67, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? _UrlKt.canonicalize$default(str3, 0, 0, _UrlKt.FRAGMENT_ENCODE_SET_URI, true, true, false, true, 35, null) : null;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String encodedName) {
            encodedName.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            e(_UrlKt.canonicalize$default(encodedName, 0, 0, _UrlKt.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, 83, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String name) {
            name.getClass();
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            e(_UrlKt.canonicalize$default(name, 0, 0, _UrlKt.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, 91, null));
            return this;
        }

        public final Builder removePathSegment(int index) {
            ArrayList arrayList = this.f;
            arrayList.remove(index);
            if (arrayList.isEmpty()) {
                arrayList.add("");
            }
            return this;
        }

        public final Builder scheme(String scheme) {
            scheme.getClass();
            if (c.l(scheme, "http", true)) {
                this.scheme = "http";
                return this;
            }
            if (c.l(scheme, "https", true)) {
                this.scheme = "https";
                return this;
            }
            hb5.a(inm.a("unexpected scheme: ", scheme));
            return null;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            str.getClass();
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int index, String encodedPathSegment) {
            encodedPathSegment.getClass();
            String strCanonicalize$default = _UrlKt.canonicalize$default(encodedPathSegment, 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET, true, false, false, false, 115, null);
            this.f.set(index, strCanonicalize$default);
            if (!b(strCanonicalize$default) && !c(strCanonicalize$default)) {
                return this;
            }
            kb5.a("unexpected path segment: ".concat(encodedPathSegment));
            return null;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String encodedName, String encodedValue) {
            encodedName.getClass();
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, encodedValue);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            str.getClass();
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int index, String pathSegment) {
            pathSegment.getClass();
            String strCanonicalize$default = _UrlKt.canonicalize$default(pathSegment, 0, 0, _UrlKt.PATH_SEGMENT_ENCODE_SET, false, false, false, false, 123, null);
            if (b(strCanonicalize$default) || c(strCanonicalize$default)) {
                kb5.a("unexpected path segment: ".concat(pathSegment));
                return null;
            }
            this.f.set(index, strCanonicalize$default);
            return this;
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final Builder setQueryParameter(String name, String value) {
            name.getClass();
            removeAllQueryParameters(name);
            addQueryParameter(name, value);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                if (StringsKt.N(str2, ':')) {
                    sb.append('[');
                    sb.append(this.host);
                    sb.append(']');
                } else {
                    sb.append(this.host);
                }
            }
            int iDefaultPort = this.port;
            if (iDefaultPort != -1 || this.scheme != null) {
                if (iDefaultPort == -1) {
                    Companion companion = HttpUrl.INSTANCE;
                    String str3 = this.scheme;
                    str3.getClass();
                    iDefaultPort = companion.defaultPort(str3);
                }
                String str4 = this.scheme;
                if (str4 == null || iDefaultPort != HttpUrl.INSTANCE.defaultPort(str4)) {
                    sb.append(':');
                    sb.append(iDefaultPort);
                }
            }
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append((String) arrayList.get(i));
            }
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                Companion companion2 = HttpUrl.INSTANCE;
                List<String> list = this.encodedQueryNamesAndValues;
                list.getClass();
                Companion.access$toQueryString(companion2, list, sb);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            return sb.toString();
        }

        public final Builder username(String username) {
            username.getClass();
            this.encodedUsername = _UrlKt.canonicalize$default(username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\f\u001a\u00020\t*\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\t*\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\t*\u00020\u000fH\u0007¢\u0006\u0004\b\n\u0010\u0010J\u0015\u0010\u000e\u001a\u0004\u0018\u00010\t*\u00020\u0011H\u0007¢\u0006\u0004\b\n\u0010\u0012J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u000bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0010J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "<init>", "()V", "", "scheme", "", "defaultPort", "(Ljava/lang/String;)I", "Lokhttp3/HttpUrl;", "get", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "toHttpUrl", "parse", "toHttpUrlOrNull", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/HttpUrl;", "Ljava/net/URI;", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", "url", "-deprecated_get", "-deprecated_parse", "uri", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void access$toQueryString(Companion companion, List list, StringBuilder sb) {
            companion.getClass();
            kotlin.ranges.c cVarL = f.l(2, f.n(0, list.size()));
            int i = cVarL.a;
            int i2 = cVarL.b;
            int i3 = cVarL.c;
            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
                return;
            }
            while (true) {
                String str = (String) list.get(i);
                String str2 = (String) list.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i == i2) {
                    return;
                } else {
                    i += i3;
                }
            }
        }

        @fae
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m178deprecated_get(String url) {
            url.getClass();
            return get(url);
        }

        @fae
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m181deprecated_parse(String url) {
            url.getClass();
            return parse(url);
        }

        public final int defaultPort(String scheme) {
            scheme.getClass();
            if (Intrinsics.g(scheme, "http")) {
                return 80;
            }
            return Intrinsics.g(scheme, "https") ? 443 : -1;
        }

        public final HttpUrl get(String str) {
            str.getClass();
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            str.getClass();
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }

        @fae
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m180deprecated_get(URL url) {
            url.getClass();
            return get(url);
        }

        @fae
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m179deprecated_get(URI uri) {
            uri.getClass();
            return get(uri);
        }

        public final HttpUrl get(URL url) {
            url.getClass();
            String string = url.toString();
            string.getClass();
            return parse(string);
        }

        public final HttpUrl get(URI uri) {
            uri.getClass();
            String string = uri.toString();
            string.getClass();
            return parse(string);
        }
    }

    public HttpUrl() {
        throw null;
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i, List list, List list2, String str5, String str6, DefaultConstructorMarker defaultConstructorMarker) {
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.g = list2;
        this.fragment = str5;
        this.i = str6;
    }

    public static final int defaultPort(String str) {
        return INSTANCE.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return INSTANCE.get(str);
    }

    public static final HttpUrl parse(String str) {
        return INSTANCE.parse(str);
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m159deprecated_encodedFragment() {
        return encodedFragment();
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m160deprecated_encodedPassword() {
        return encodedPassword();
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m161deprecated_encodedPath() {
        return encodedPath();
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m162deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m163deprecated_encodedQuery() {
        return encodedQuery();
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m164deprecated_encodedUsername() {
        return encodedUsername();
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_fragment, reason: not valid java name and from getter */
    public final String getFragment() {
        return this.fragment;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_host, reason: not valid java name and from getter */
    public final String getHost() {
        return this.host;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_password, reason: not valid java name and from getter */
    public final String getPassword() {
        return this.password;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m168deprecated_pathSegments() {
        return this.pathSegments;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m169deprecated_pathSize() {
        return pathSize();
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_port, reason: not valid java name and from getter */
    public final int getPort() {
        return this.port;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_query, reason: not valid java name */
    public final String m171deprecated_query() {
        return query();
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m172deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m173deprecated_querySize() {
        return querySize();
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m175deprecated_uri() {
        return uri();
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final URL m176deprecated_url() {
        return url();
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_username, reason: not valid java name and from getter */
    public final String getUsername() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String str = this.i;
        return str.substring(StringsKt.S(str, '#', 0, 6) + 1);
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.i;
        return str.substring(StringsKt.S(str, ':', length, 4) + 1, StringsKt.S(str, '@', 0, 6));
    }

    public final String encodedPath() {
        int length = this.scheme.length() + 3;
        String str = this.i;
        int iS = StringsKt.S(str, '/', length, 4);
        return str.substring(iS, _UtilCommonKt.delimiterOffset(str, "?#", iS, str.length()));
    }

    public final List<String> encodedPathSegments() {
        int length = this.scheme.length() + 3;
        String str = this.i;
        int iS = StringsKt.S(str, '/', length, 4);
        int iDelimiterOffset = _UtilCommonKt.delimiterOffset(str, "?#", iS, str.length());
        ArrayList arrayList = new ArrayList();
        while (iS < iDelimiterOffset) {
            int i = iS + 1;
            int iDelimiterOffset2 = _UtilCommonKt.delimiterOffset(str, '/', i, iDelimiterOffset);
            arrayList.add(str.substring(i, iDelimiterOffset2));
            iS = iDelimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iS = StringsKt.S(str, '?', 0, 6) + 1;
        return str.substring(iS, _UtilCommonKt.delimiterOffset(str, '#', iS, str.length()));
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.i;
        return str.substring(length, _UtilCommonKt.delimiterOffset(str, ":@", length, str.length()));
    }

    public boolean equals(Object other) {
        return (other instanceof HttpUrl) && Intrinsics.g(((HttpUrl) other).i, this.i);
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return Intrinsics.g(this.scheme, "https");
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        String str = this.scheme;
        builder.setScheme$okhttp(str);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        int iDefaultPort = INSTANCE.defaultPort(str);
        int i = this.port;
        if (i == iDefaultPort) {
            i = -1;
        }
        builder.setPort$okhttp(i);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        List<String> list = this.g;
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.access$toQueryString(INSTANCE, list, sb);
        return sb.toString();
    }

    public final String queryParameter(String name) {
        name.getClass();
        List<String> list = this.g;
        if (list == null) {
            return null;
        }
        kotlin.ranges.c cVarL = f.l(2, f.n(0, list.size()));
        int i = cVarL.a;
        int i2 = cVarL.b;
        int i3 = cVarL.c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return null;
        }
        while (!name.equals(list.get(i))) {
            if (i == i2) {
                return null;
            }
            i += i3;
        }
        return list.get(i + 1);
    }

    public final String queryParameterName(int index) {
        List<String> list = this.g;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(index * 2);
        str.getClass();
        return str;
    }

    public final Set<String> queryParameterNames() {
        List<String> list = this.g;
        if (list == null) {
            return t3g.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(list.size() / 2, 1.0f);
        kotlin.ranges.c cVarL = f.l(2, f.n(0, list.size()));
        int i = cVarL.a;
        int i2 = cVarL.b;
        int i3 = cVarL.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                String str = list.get(i);
                str.getClass();
                linkedHashSet.add(str);
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    public final String queryParameterValue(int index) {
        List<String> list = this.g;
        if (list != null) {
            return list.get((index * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String name) {
        name.getClass();
        List<String> list = this.g;
        if (list == null) {
            return m2g.a;
        }
        ArrayList arrayList = new ArrayList(4);
        kotlin.ranges.c cVarL = f.l(2, f.n(0, list.size()));
        int i = cVarL.a;
        int i2 = cVarL.b;
        int i3 = cVarL.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                if (name.equals(list.get(i))) {
                    arrayList.add(list.get(i + 1));
                }
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder builderNewBuilder = newBuilder("/...");
        builderNewBuilder.getClass();
        return builderNewBuilder.username("").password("").build().getI();
    }

    public final HttpUrl resolve(String link) {
        link.getClass();
        Builder builderNewBuilder = newBuilder(link);
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getI() {
        return this.i;
    }

    public final String topPrivateDomain() {
        String str = this.host;
        if (_HostnamesCommonKt.canParseAsIpAddress(str)) {
            return null;
        }
        return PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(str);
    }

    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                gqm.a(e);
                return null;
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.i);
        } catch (MalformedURLException e) {
            gqm.a(e);
            return null;
        }
    }

    public final String username() {
        return this.username;
    }

    public static final HttpUrl get(URI uri) {
        return INSTANCE.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return INSTANCE.get(url);
    }

    public final Builder newBuilder(String link) {
        link.getClass();
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
