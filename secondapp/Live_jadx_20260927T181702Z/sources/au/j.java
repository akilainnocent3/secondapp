package au;

import java.util.Collection;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class j {
    public abstract void a(@oy.l ws.b bVar);

    public abstract void b(@oy.l ws.b bVar, @oy.l ws.b bVar2);

    public abstract void c(@oy.l ws.b bVar, @oy.l ws.b bVar2);

    public void d(@oy.l ws.b member, @oy.l Collection<? extends ws.b> overridden) {
        m0.p(member, "member");
        m0.p(overridden, "overridden");
        member.S(overridden);
    }
}
