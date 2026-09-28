package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rbn {
    public static int k;
    public static final b l = new b();
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final kwh0 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public static final class b {
    }

    public rbn(String str, float f, float f2, float f3, float f4, kwh0 kwh0Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = kwh0Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbn)) {
            return false;
        }
        rbn rbnVar = (rbn) obj;
        if (!Intrinsics.g(this.a, rbnVar.a) || !g7f.b(this.b, rbnVar.b) || !g7f.b(this.c, rbnVar.c) || this.d != rbnVar.d || this.e != rbnVar.e || !this.f.equals(rbnVar.f)) {
            return false;
        }
        long j = rbnVar.g;
        int i = j58.n;
        return nbh0.a(this.g, j) && this.h == rbnVar.h && this.i == rbnVar.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + tvh.a(this.e, tvh.a(this.d, tvh.a(this.c, tvh.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Boolean.hashCode(this.i) + gpp.a(this.h, f87.a(iHashCode, this.g, 31), 31);
    }

    public static final class a {
        public final String a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final long f;
        public final int g;
        public final boolean h;
        public final ArrayList<C1046a> i;
        public final C1046a j;
        public boolean k;

        public a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
            str = (i2 & 1) != 0 ? "" : str;
            long j2 = (i2 & 32) != 0 ? j58.m : j;
            int i3 = (i2 & 64) != 0 ? 5 : i;
            boolean z2 = (i2 & 128) != 0 ? false : z;
            this.a = str;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = j2;
            this.g = i3;
            this.h = z2;
            ArrayList<C1046a> arrayList = new ArrayList<>();
            this.i = arrayList;
            C1046a c1046a = new C1046a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            this.j = c1046a;
            arrayList.add(c1046a);
        }

        public static void a(a aVar, ArrayList arrayList, soa0 soa0Var) {
            if (aVar.k) {
                wkn.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            ((C1046a) rh6.a(1, aVar.i)).j.add(new owh0("", arrayList, 0, soa0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
        }

        public final rbn b() {
            if (this.k) {
                wkn.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            while (true) {
                ArrayList<C1046a> arrayList = this.i;
                if (arrayList.size() <= 1) {
                    C1046a c1046a = this.j;
                    rbn rbnVar = new rbn(this.a, this.b, this.c, this.d, this.e, new kwh0(c1046a.a, c1046a.b, c1046a.c, c1046a.d, c1046a.e, c1046a.f, c1046a.g, c1046a.h, c1046a.i, c1046a.j), this.f, this.g, this.h);
                    this.k = true;
                    return rbnVar;
                }
                if (this.k) {
                    wkn.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                }
                C1046a c1046aRemove = arrayList.remove(arrayList.size() - 1);
                ((C1046a) rh6.a(1, arrayList)).j.add(new kwh0(c1046aRemove.a, c1046aRemove.b, c1046aRemove.c, c1046aRemove.d, c1046aRemove.e, c1046aRemove.f, c1046aRemove.g, c1046aRemove.h, c1046aRemove.i, c1046aRemove.j));
            }
        }

        /* JADX INFO: renamed from: rbn$a$a, reason: collision with other inner class name */
        public static final class C1046a {
            public final String a;
            public final float b;
            public final float c;
            public final float d;
            public final float e;
            public final float f;
            public final float g;
            public final float h;
            public final List<? extends qxz> i;
            public final ArrayList j;

            public C1046a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
                str = (i & 1) != 0 ? "" : str;
                f = (i & 2) != 0 ? 0.0f : f;
                f2 = (i & 4) != 0 ? 0.0f : f2;
                f3 = (i & 8) != 0 ? 0.0f : f3;
                f4 = (i & 16) != 0 ? 1.0f : f4;
                f5 = (i & 32) != 0 ? 1.0f : f5;
                f6 = (i & 64) != 0 ? 0.0f : f6;
                f7 = (i & 128) != 0 ? 0.0f : f7;
                list = (i & 256) != 0 ? lwh0.a : list;
                ArrayList arrayList = new ArrayList();
                this.a = str;
                this.b = f;
                this.c = f2;
                this.d = f3;
                this.e = f4;
                this.f = f5;
                this.g = f6;
                this.h = f7;
                this.i = list;
                this.j = arrayList;
            }

            public C1046a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            }
        }
    }
}
