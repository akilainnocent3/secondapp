package fr;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@dr.l1(version = "1.1")
public abstract class k<E> extends b<E> implements Set<E>, es.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final a f85121b = new a(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public final boolean a(@oy.l Set<?> c10, @oy.l Set<?> other) {
            kotlin.jvm.internal.m0.p(c10, "c");
            kotlin.jvm.internal.m0.p(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            return c10.containsAll(other);
        }

        public final int b(@oy.l Collection<?> c10) {
            kotlin.jvm.internal.m0.p(c10, "c");
            Iterator<?> it = c10.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode += next != null ? next.hashCode() : 0;
            }
            return iHashCode;
        }

        public a() {
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@oy.m Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f85121b.a(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f85121b.b(this);
    }

    @Override // fr.b, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
