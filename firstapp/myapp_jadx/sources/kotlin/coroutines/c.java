package kotlin.coroutines;

import defpackage.c5b;
import defpackage.j26;
import defpackage.x78;
import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements CoroutineContext, Serializable {
    public final CoroutineContext a;
    public final CoroutineContext.Element b;

    public c(CoroutineContext.Element element, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.a = coroutineContext;
        this.b = element;
    }

    public final boolean equals(Object obj) {
        boolean zG;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i = 2;
            c cVar2 = cVar;
            int i2 = 2;
            while (true) {
                CoroutineContext coroutineContext = cVar2.a;
                cVar2 = coroutineContext instanceof c ? (c) coroutineContext : null;
                if (cVar2 == null) {
                    break;
                }
                i2++;
            }
            c cVar3 = this;
            while (true) {
                CoroutineContext coroutineContext2 = cVar3.a;
                cVar3 = coroutineContext2 instanceof c ? (c) coroutineContext2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    CoroutineContext.Element element = this.b;
                    if (!Intrinsics.g(cVar.get(element.getKey()), element)) {
                        zG = false;
                        break;
                    }
                    CoroutineContext coroutineContext3 = this.a;
                    if (!(coroutineContext3 instanceof c)) {
                        coroutineContext3.getClass();
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext3;
                        zG = Intrinsics.g(cVar.get(element2.getKey()), element2);
                        break;
                    }
                    this = (c) coroutineContext3;
                }
                if (zG) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return function2.invoke((Object) this.a.fold(r, function2), this.b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(CoroutineContext.a<E> aVar) {
        aVar.getClass();
        while (true) {
            E e = (E) this.b.get(aVar);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = this.a;
            if (!(coroutineContext instanceof c)) {
                return (E) coroutineContext.get(aVar);
            }
            this = (c) coroutineContext;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.a<?> aVar) {
        aVar.getClass();
        CoroutineContext.Element element = this.b;
        CoroutineContext.Element element2 = element.get(aVar);
        CoroutineContext coroutineContext = this.a;
        if (element2 != null) {
            return coroutineContext;
        }
        CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(aVar);
        if (coroutineContextMinusKey == coroutineContext) {
            return this;
        }
        return coroutineContextMinusKey == e.a ? element : new c(element, coroutineContextMinusKey);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        return coroutineContext == e.a ? this : (CoroutineContext) coroutineContext.fold(this, new c5b());
    }

    public final String toString() {
        return j26.a(new StringBuilder("["), (String) fold("", new x78()), ']');
    }
}
