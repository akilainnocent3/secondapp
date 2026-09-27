package da;

import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class h<T> extends g<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final T f78662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public final String f78663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    public final g.b f78664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l
    public final f f78665e;

    public h(@l T value, @l String tag, @l g.b verificationMode, @l f logger) {
        m0.p(value, "value");
        m0.p(tag, "tag");
        m0.p(verificationMode, "verificationMode");
        m0.p(logger, "logger");
        this.f78662b = value;
        this.f78663c = tag;
        this.f78664d = verificationMode;
        this.f78665e = logger;
    }

    @Override // da.g
    @l
    public T a() {
        return this.f78662b;
    }

    @Override // da.g
    @l
    public g<T> c(@l String message, @l ds.l<? super T, Boolean> condition) {
        m0.p(message, "message");
        m0.p(condition, "condition");
        return condition.invoke(this.f78662b).booleanValue() ? this : new e(this.f78662b, this.f78663c, message, this.f78665e, this.f78664d);
    }

    @l
    public final f d() {
        return this.f78665e;
    }

    @l
    public final String e() {
        return this.f78663c;
    }

    @l
    public final T f() {
        return this.f78662b;
    }

    @l
    public final g.b g() {
        return this.f78664d;
    }
}
