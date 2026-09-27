package qv;

import dr.w2;
import java.util.ArrayList;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@cs.h
@s1({"SMAP\nInlineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class x<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    public final Object f123046a;

    public /* synthetic */ x(Object obj) {
        this.f123046a = obj;
    }

    public static final /* synthetic */ x a(Object obj) {
        return new x(obj);
    }

    public static /* synthetic */ Object c(Object obj, int i10, kotlin.jvm.internal.x xVar) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return b(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof x) && kotlin.jvm.internal.m0.g(obj, ((x) obj2).j());
    }

    public static final boolean e(Object obj, Object obj2) {
        return kotlin.jvm.internal.m0.g(obj, obj2);
    }

    public static final void f(Object obj, @oy.l ds.l<? super E, w2> lVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            lVar.invoke(obj);
            return;
        }
        kotlin.jvm.internal.m0.n(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                lVar.invoke((Object) arrayList.get(size));
            }
        }
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @oy.l
    public static final Object h(Object obj, E e10) {
        if (obj == null) {
            return b(e10);
        }
        if (obj instanceof ArrayList) {
            kotlin.jvm.internal.m0.n(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ((ArrayList) obj).add(e10);
            return b(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e10);
        return b(arrayList);
    }

    public static String i(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f123046a, obj);
    }

    public int hashCode() {
        return g(this.f123046a);
    }

    public final /* synthetic */ Object j() {
        return this.f123046a;
    }

    public String toString() {
        return i(this.f123046a);
    }

    @oy.l
    public static <E> Object b(@oy.m Object obj) {
        return obj;
    }
}
