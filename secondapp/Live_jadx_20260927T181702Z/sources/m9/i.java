package m9;

import cs.o;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@s1({"SMAP\nSupportSQLiteQueryBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteQueryBuilder.android.kt\nandroidx/sqlite/db/SupportSQLiteQueryBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @l
    public static final a f107140j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f107141k = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final String f107142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f107143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @m
    public String[] f107144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @m
    public String f107145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @m
    public Object[] f107146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @m
    public String f107147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @m
    public String f107148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @m
    public String f107149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @m
    public String f107150i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        @l
        @o
        public final i a(@l String tableName) {
            m0.p(tableName, "tableName");
            return new i(tableName, null);
        }

        public a() {
        }
    }

    public /* synthetic */ i(String str, x xVar) {
        this(str);
    }

    @l
    @o
    public static final i c(@l String str) {
        return f107140j.a(str);
    }

    public final void a(StringBuilder sb2, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        sb2.append(str);
        sb2.append(str2);
    }

    public final void b(StringBuilder sb2, String[] strArr) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(' ');
    }

    @l
    public final i d(@m String[] strArr) {
        this.f107144c = strArr;
        return this;
    }

    @l
    public final h e() {
        String str;
        String str2 = this.f107147f;
        if ((str2 == null || str2.length() == 0) && (str = this.f107148g) != null && str.length() != 0) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        StringBuilder sb2 = new StringBuilder(120);
        sb2.append("SELECT ");
        if (this.f107143b) {
            sb2.append("DISTINCT ");
        }
        String[] strArr = this.f107144c;
        if (strArr == null || strArr.length == 0) {
            sb2.append("* ");
        } else {
            m0.m(strArr);
            b(sb2, strArr);
        }
        sb2.append("FROM ");
        sb2.append(this.f107142a);
        a(sb2, " WHERE ", this.f107145d);
        a(sb2, " GROUP BY ", this.f107147f);
        a(sb2, " HAVING ", this.f107148g);
        a(sb2, " ORDER BY ", this.f107149h);
        a(sb2, " LIMIT ", this.f107150i);
        return new b(sb2.toString(), this.f107146e);
    }

    @l
    public final i f() {
        this.f107143b = true;
        return this;
    }

    @l
    public final i g(@m String str) {
        this.f107147f = str;
        return this;
    }

    @l
    public final i h(@m String str) {
        this.f107148g = str;
        return this;
    }

    @l
    public final i i(@l String limit) {
        m0.p(limit, "limit");
        boolean zMatches = f107141k.matcher(limit).matches();
        if (limit.length() == 0 || zMatches) {
            this.f107150i = limit;
            return this;
        }
        throw new IllegalArgumentException(("invalid LIMIT clauses:" + limit).toString());
    }

    @l
    public final i j(@m String str) {
        this.f107149h = str;
        return this;
    }

    @l
    public final i k(@m String str, @m Object[] objArr) {
        this.f107145d = str;
        this.f107146e = objArr;
        return this;
    }

    public i(String str) {
        this.f107142a = str;
    }
}
