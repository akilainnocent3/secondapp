package bt;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.m0;
import ws.b1;
import ws.c1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class b implements b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Annotation f21949b;

    public b(@oy.l Annotation annotation) {
        m0.p(annotation, "annotation");
        this.f21949b = annotation;
    }

    @Override // ws.b1
    @oy.l
    public c1 b() {
        c1 NO_SOURCE_FILE = c1.f143738a;
        m0.o(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @oy.l
    public final Annotation d() {
        return this.f21949b;
    }
}
