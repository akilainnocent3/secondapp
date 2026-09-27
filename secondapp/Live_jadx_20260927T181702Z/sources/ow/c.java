package ow;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Task.kt\nokhttp3/internal/concurrent/Task\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final String f119999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f120000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @m
    public e f120001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f120002d;

    public c(@l String name, boolean z10) {
        m0.p(name, "name");
        this.f119999a = name;
        this.f120000b = z10;
        this.f120002d = -1L;
    }

    public final boolean a() {
        return this.f120000b;
    }

    @l
    public final String b() {
        return this.f119999a;
    }

    public final long c() {
        return this.f120002d;
    }

    @m
    public final e d() {
        return this.f120001c;
    }

    public final void e(@l e queue) {
        m0.p(queue, "queue");
        e eVar = this.f120001c;
        if (eVar == queue) {
            return;
        }
        if (eVar != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f120001c = queue;
    }

    public abstract long f();

    public final void g(long j10) {
        this.f120002d = j10;
    }

    public final void h(@m e eVar) {
        this.f120001c = eVar;
    }

    @l
    public String toString() {
        return this.f119999a;
    }

    public /* synthetic */ c(String str, boolean z10, int i10, x xVar) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
