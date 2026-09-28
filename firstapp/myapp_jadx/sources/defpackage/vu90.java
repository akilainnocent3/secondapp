package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vu90<T> extends ssw<T> {
    public final AtomicBoolean l = new AtomicBoolean(false);

    public static final class a implements lfy, paj {
        public final /* synthetic */ cxw a;

        public a(cxw cxwVar) {
            this.a = cxwVar;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    @Override // defpackage.njs
    public final void f(ibs ibsVar, lfy<? super T> lfyVar) {
        ibsVar.getClass();
        if (e()) {
            itf0.a aVar = itf0.a;
            aVar.q("SingleLiveEvent");
            aVar.n("Multiple observers registered but only one will be notified of changes.", new Object[0]);
        }
        super.f(ibsVar, new a(new cxw(1, this, lfyVar)));
    }

    @Override // defpackage.njs
    public final void m(T t) {
        this.l.set(true);
        super.m(t);
    }
}
