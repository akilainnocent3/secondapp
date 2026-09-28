package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class yis<L> {
    public final Executor a;
    public volatile jet b;
    public volatile a c;

    public static final class a<L> {
        public final jet a;
        public final String b;

        public a(jet jetVar, String str) {
            this.a = jetVar;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (System.identityHashCode(this.a) * 31);
        }
    }

    public interface b<L> {
        void a(jet jetVar);
    }

    public yis(Looper looper, pet.a aVar, String str) {
        this.a = new ycl(looper);
        this.b = aVar;
        hm20.e(str);
        this.c = new a(aVar, str);
    }

    public yis(lxk0 lxk0Var) {
        this.a = r1l0.a;
        this.b = lxk0Var;
        hm20.e("GetCurrentLocation");
        this.c = new a(lxk0Var, "GetCurrentLocation");
    }
}
