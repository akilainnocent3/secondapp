package androidx.compose.ui;

import defpackage.c9p;
import defpackage.e9p;
import defpackage.ham;
import defpackage.j1b;
import defpackage.ns1;
import defpackage.o3w;
import defpackage.ofy;
import defpackage.okd;
import defpackage.pkd;
import defpackage.v5b;
import defpackage.w5b;
import defpackage.wkn;
import defpackage.ywx;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface d {

    public static final class a implements d {
        public static final /* synthetic */ a b = new a();

        @Override // androidx.compose.ui.d
        public final <R> R b(R r, Function2<? super R, ? super b, ? extends R> function2) {
            return r;
        }

        @Override // androidx.compose.ui.d
        public final boolean c(Function1<? super b, Boolean> function1) {
            return true;
        }

        @Override // androidx.compose.ui.d
        public final d n(d dVar) {
            return dVar;
        }

        public final String toString() {
            return "Modifier";
        }
    }

    public interface b extends d {
        @Override // androidx.compose.ui.d
        default <R> R b(R r, Function2<? super R, ? super b, ? extends R> function2) {
            return function2.invoke(r, this);
        }

        @Override // androidx.compose.ui.d
        default boolean c(Function1<? super b, Boolean> function1) {
            return function1.invoke(this).booleanValue();
        }
    }

    public static abstract class c implements okd {
        public boolean A;
        public ham.a B;
        public boolean C;
        public j1b b;
        public int c;
        public c e;
        public c f;
        public ofy i;
        public ywx v;
        public boolean w;
        public boolean y;
        public boolean z;
        public c a = this;
        public int d = -1;

        public final v5b d2() {
            j1b j1bVar = this.b;
            if (j1bVar != null) {
                return j1bVar;
            }
            j1b j1bVarA = w5b.a(pkd.g(this).getCoroutineContext().plus(new e9p((c9p) pkd.g(this).getCoroutineContext().get(c9p.b.a))));
            this.b = j1bVarA;
            return j1bVarA;
        }

        public boolean e2() {
            return !(this instanceof ns1);
        }

        public void f2() {
            if (this.C) {
                wkn.c("node attached multiple times");
            }
            if (this.v == null) {
                wkn.c("attach invoked on a node without a coordinator");
            }
            this.C = true;
            this.z = true;
        }

        public void g2() {
            if (!this.C) {
                wkn.c("Cannot detach a node that is not attached");
            }
            if (this.z) {
                wkn.c("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.A) {
                wkn.c("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.C = false;
            j1b j1bVar = this.b;
            if (j1bVar != null) {
                w5b.c(j1bVar, new o3w("The Modifier.Node was detached"));
                this.b = null;
            }
        }

        public void h2() {
        }

        @Override // defpackage.okd
        public final c i() {
            return this.a;
        }

        public void i2() {
        }

        public void j2() {
        }

        public void k2() {
            if (!this.C) {
                wkn.c("reset() called on an unattached node");
            }
            j2();
        }

        public void l2() {
            if (!this.C) {
                wkn.c("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.z) {
                wkn.c("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.z = false;
            h2();
            this.A = true;
        }

        public void m2() {
            if (!this.C) {
                wkn.c("node detached multiple times");
            }
            if (this.v == null) {
                wkn.c("detach invoked on a node without a coordinator");
            }
            if (!this.A) {
                wkn.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.A = false;
            ham.a aVar = this.B;
            if (aVar != null) {
                aVar.invoke();
            }
            i2();
        }

        public void n2(c cVar) {
            this.a = cVar;
        }

        public void o2(ywx ywxVar) {
            this.v = ywxVar;
        }
    }

    <R> R b(R r, Function2<? super R, ? super b, ? extends R> function2);

    boolean c(Function1<? super b, Boolean> function1);

    default d n(d dVar) {
        return dVar == a.b ? this : new androidx.compose.ui.a(this, dVar);
    }
}
