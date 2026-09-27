package da;

import dr.o0;
import fr.a0;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class e<T> extends g<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final T f78650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public final String f78651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    public final String f78652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l
    public final f f78653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    public final g.b f78654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l
    public final j f78655g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78656a;

        static {
            int[] iArr = new int[g.b.values().length];
            iArr[g.b.STRICT.ordinal()] = 1;
            iArr[g.b.LOG.ordinal()] = 2;
            iArr[g.b.QUIET.ordinal()] = 3;
            f78656a = iArr;
        }
    }

    public e(@l T value, @l String tag, @l String message, @l f logger, @l g.b verificationMode) {
        m0.p(value, "value");
        m0.p(tag, "tag");
        m0.p(message, "message");
        m0.p(logger, "logger");
        m0.p(verificationMode, "verificationMode");
        this.f78650b = value;
        this.f78651c = tag;
        this.f78652d = message;
        this.f78653e = logger;
        this.f78654f = verificationMode;
        j jVar = new j(b(value, message));
        StackTraceElement[] stackTrace = jVar.getStackTrace();
        m0.o(stackTrace, "stackTrace");
        Object[] array = a0.u9(stackTrace, 2).toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        jVar.setStackTrace((StackTraceElement[]) array);
        this.f78655g = jVar;
    }

    @Override // da.g
    @m
    public T a() throws j {
        int i10 = a.f78656a[this.f78654f.ordinal()];
        if (i10 == 1) {
            throw this.f78655g;
        }
        if (i10 == 2) {
            this.f78653e.a(this.f78651c, b(this.f78650b, this.f78652d));
            return null;
        }
        if (i10 == 3) {
            return null;
        }
        throw new o0();
    }

    @Override // da.g
    @l
    public g<T> c(@l String message, @l ds.l<? super T, Boolean> condition) {
        m0.p(message, "message");
        m0.p(condition, "condition");
        return this;
    }

    @l
    public final j d() {
        return this.f78655g;
    }

    @l
    public final f e() {
        return this.f78653e;
    }

    @l
    public final String f() {
        return this.f78652d;
    }

    @l
    public final String g() {
        return this.f78651c;
    }

    @l
    public final T h() {
        return this.f78650b;
    }

    @l
    public final g.b i() {
        return this.f78654f;
    }
}
