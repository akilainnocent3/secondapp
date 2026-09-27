package m9;

import cs.o;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    public static final a f107118d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final String f107119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @m
    public final Object[] f107120c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        public final void a(g gVar, int i10, Object obj) {
            if (obj == null) {
                gVar.g(i10);
                return;
            }
            if (obj instanceof byte[]) {
                gVar.f(i10, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                gVar.j(i10, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                gVar.j(i10, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                gVar.e(i10, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                gVar.e(i10, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                gVar.e(i10, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                gVar.e(i10, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                gVar.c0(i10, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                gVar.e(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        @o
        public final void b(@l g statement, @m Object[] objArr) {
            m0.p(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                a(statement, i10, obj);
            }
        }

        public a() {
        }
    }

    public b(@l String query, @m Object[] objArr) {
        m0.p(query, "query");
        this.f107119b = query;
        this.f107120c = objArr;
    }

    @o
    public static final void a(@l g gVar, @m Object[] objArr) {
        f107118d.b(gVar, objArr);
    }

    @Override // m9.h
    public int d() {
        Object[] objArr = this.f107120c;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // m9.h
    @l
    public String h() {
        return this.f107119b;
    }

    @Override // m9.h
    public void i(@l g statement) {
        m0.p(statement, "statement");
        f107118d.b(statement, this.f107120c);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@l String query) {
        this(query, null);
        m0.p(query, "query");
    }
}
