package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class l51 extends h51 {
    public final l51 a(Object obj) {
        obj.getClass();
        a(this.f149939b + 1);
        Object[] objArr = this.f149938a;
        int i10 = this.f149939b;
        this.f149939b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l51 a(List list) {
        if (list instanceof Collection) {
            a(list.size() + this.f149939b);
            if (list instanceof j51) {
                this.f149939b = ((j51) list).a(this.f149939b, this.f149938a);
                return this;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    public final sm2 a() {
        this.f149940c = true;
        return p51.b(this.f149939b, this.f149938a);
    }
}
