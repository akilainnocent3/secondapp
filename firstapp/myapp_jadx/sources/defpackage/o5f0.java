package defpackage;

import com.google.android.gms.common.Feature;
import sl0.b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o5f0<A extends sl0.b, ResultT> {
    public final Feature[] a;
    public final boolean b;
    public final int c;

    public static class a<A extends sl0.b, ResultT> {
        public z550 a;
        public boolean b;
        public Feature[] c;
        public int d;

        public final jhk0 a() {
            hm20.a("execute parameter required", this.a != null);
            return new jhk0(this, this.c, this.b, this.d);
        }
    }

    public o5f0(Feature[] featureArr, boolean z, int i) {
        this.a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    public static <A extends sl0.b, ResultT> a<A, ResultT> a() {
        a<A, ResultT> aVar = new a<>();
        aVar.b = true;
        aVar.d = 0;
        return aVar;
    }
}
