package dw;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@dr.f1
public abstract class y<E, C extends Collection<? extends E>, B> extends x<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@oy.l zv.j<E> element) {
        super(element, null);
        kotlin.jvm.internal.m0.p(element, "element");
    }

    @Override // dw.a
    @oy.l
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator<E> d(@oy.l C c10) {
        kotlin.jvm.internal.m0.p(c10, "<this>");
        return c10.iterator();
    }

    @Override // dw.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int e(@oy.l C c10) {
        kotlin.jvm.internal.m0.p(c10, "<this>");
        return c10.size();
    }
}
