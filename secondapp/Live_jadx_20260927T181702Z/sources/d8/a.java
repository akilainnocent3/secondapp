package d8;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import k1.b0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f78559g = "ColorCutQuantizer";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f78560h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f78561i = -3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f78562j = -2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f78563k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f78564l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f78565m = 31;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Comparator<b> f78566n = new C0767a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f78567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f78568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<d8.b.e> f78569c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d8.b.c[] f78571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f78572f = new float[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final TimingLogger f78570d = null;

    /* JADX INFO: renamed from: d8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0767a implements Comparator<b> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar2.g() - bVar.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f78573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f78574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f78575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f78576d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f78577e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f78578f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f78579g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f78580h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f78581i;

        public b(int i10, int i11) {
            this.f78573a = i10;
            this.f78574b = i11;
            c();
        }

        public final boolean a() {
            return e() > 1;
        }

        public final int b() {
            int iF = f();
            a aVar = a.this;
            int[] iArr = aVar.f78567a;
            int[] iArr2 = aVar.f78568b;
            a.e(iArr, iF, this.f78573a, this.f78574b);
            Arrays.sort(iArr, this.f78573a, this.f78574b + 1);
            a.e(iArr, iF, this.f78573a, this.f78574b);
            int i10 = this.f78575c / 2;
            int i11 = this.f78573a;
            int i12 = 0;
            while (true) {
                int i13 = this.f78574b;
                if (i11 > i13) {
                    return this.f78573a;
                }
                i12 += iArr2[iArr[i11]];
                if (i12 >= i10) {
                    return Math.min(i13 - 1, i11);
                }
                i11++;
            }
        }

        public final void c() {
            a aVar = a.this;
            int[] iArr = aVar.f78567a;
            int[] iArr2 = aVar.f78568b;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = 0;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MAX_VALUE;
            for (int i17 = this.f78573a; i17 <= this.f78574b; i17++) {
                int i18 = iArr[i17];
                i14 += iArr2[i18];
                int iK = a.k(i18);
                int iJ = a.j(i18);
                int i19 = a.i(i18);
                if (iK > i11) {
                    i11 = iK;
                }
                if (iK < i10) {
                    i10 = iK;
                }
                if (iJ > i12) {
                    i12 = iJ;
                }
                if (iJ < i15) {
                    i15 = iJ;
                }
                if (i19 > i13) {
                    i13 = i19;
                }
                if (i19 < i16) {
                    i16 = i19;
                }
            }
            this.f78576d = i10;
            this.f78577e = i11;
            this.f78578f = i15;
            this.f78579g = i12;
            this.f78580h = i16;
            this.f78581i = i13;
            this.f78575c = i14;
        }

        public final d8.b.e d() {
            a aVar = a.this;
            int[] iArr = aVar.f78567a;
            int[] iArr2 = aVar.f78568b;
            int iK = 0;
            int i10 = 0;
            int iJ = 0;
            int i11 = 0;
            for (int i12 = this.f78573a; i12 <= this.f78574b; i12++) {
                int i13 = iArr[i12];
                int i14 = iArr2[i13];
                i10 += i14;
                iK += a.k(i13) * i14;
                iJ += a.j(i13) * i14;
                i11 += i14 * a.i(i13);
            }
            float f10 = i10;
            return new d8.b.e(a.b(Math.round(iK / f10), Math.round(iJ / f10), Math.round(i11 / f10)), i10);
        }

        public final int e() {
            return (this.f78574b + 1) - this.f78573a;
        }

        public final int f() {
            int i10 = this.f78577e - this.f78576d;
            int i11 = this.f78579g - this.f78578f;
            int i12 = this.f78581i - this.f78580h;
            if (i10 < i11 || i10 < i12) {
                return (i11 < i10 || i11 < i12) ? -1 : -2;
            }
            return -3;
        }

        public final int g() {
            return ((this.f78577e - this.f78576d) + 1) * ((this.f78579g - this.f78578f) + 1) * ((this.f78581i - this.f78580h) + 1);
        }

        public final b h() {
            if (!a()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int iB = b();
            b bVar = a.this.new b(iB + 1, this.f78574b);
            this.f78574b = iB;
            c();
            return bVar;
        }
    }

    public a(int[] iArr, int i10, d8.b.c[] cVarArr) {
        this.f78571e = cVarArr;
        int[] iArr2 = new int[32768];
        this.f78568b = iArr2;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int iG = g(iArr[i11]);
            iArr[i11] = iG;
            iArr2[iG] = iArr2[iG] + 1;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 32768; i13++) {
            if (iArr2[i13] > 0 && l(i13)) {
                iArr2[i13] = 0;
            }
            if (iArr2[i13] > 0) {
                i12++;
            }
        }
        int[] iArr3 = new int[i12];
        this.f78567a = iArr3;
        int i14 = 0;
        for (int i15 = 0; i15 < 32768; i15++) {
            if (iArr2[i15] > 0) {
                iArr3[i14] = i15;
                i14++;
            }
        }
        if (i12 > i10) {
            this.f78569c = h(i10);
            return;
        }
        this.f78569c = new ArrayList();
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = iArr3[i16];
            this.f78569c.add(new d8.b.e(a(i17), iArr2[i17]));
        }
    }

    public static int a(int i10) {
        return b(k(i10), j(i10), i(i10));
    }

    public static int b(int i10, int i11, int i12) {
        return Color.rgb(f(i10, 5, 8), f(i11, 5, 8), f(i12, 5, 8));
    }

    public static void e(int[] iArr, int i10, int i11, int i12) {
        if (i10 == -2) {
            while (i11 <= i12) {
                int i13 = iArr[i11];
                iArr[i11] = i(i13) | (j(i13) << 10) | (k(i13) << 5);
                i11++;
            }
            return;
        }
        if (i10 != -1) {
            return;
        }
        while (i11 <= i12) {
            int i14 = iArr[i11];
            iArr[i11] = k(i14) | (i(i14) << 10) | (j(i14) << 5);
            i11++;
        }
    }

    public static int f(int i10, int i11, int i12) {
        return (i12 > i11 ? i10 << (i12 - i11) : i10 >> (i11 - i12)) & ((1 << i12) - 1);
    }

    public static int g(int i10) {
        return f(Color.blue(i10), 8, 5) | (f(Color.red(i10), 8, 5) << 10) | (f(Color.green(i10), 8, 5) << 5);
    }

    public static int i(int i10) {
        return i10 & 31;
    }

    public static int j(int i10) {
        return (i10 >> 5) & 31;
    }

    public static int k(int i10) {
        return (i10 >> 10) & 31;
    }

    public final List<d8.b.e> c(Collection<b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<b> it = collection.iterator();
        while (it.hasNext()) {
            d8.b.e eVarD = it.next().d();
            if (!n(eVarD)) {
                arrayList.add(eVarD);
            }
        }
        return arrayList;
    }

    public List<d8.b.e> d() {
        return this.f78569c;
    }

    public final List<d8.b.e> h(int i10) {
        PriorityQueue<b> priorityQueue = new PriorityQueue<>(i10, f78566n);
        priorityQueue.offer(new b(0, this.f78567a.length - 1));
        o(priorityQueue, i10);
        return c(priorityQueue);
    }

    public final boolean l(int i10) {
        int iA = a(i10);
        b0.q(iA, this.f78572f);
        return m(iA, this.f78572f);
    }

    public final boolean m(int i10, float[] fArr) {
        d8.b.c[] cVarArr = this.f78571e;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (!this.f78571e[i11].a(i10, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean n(d8.b.e eVar) {
        return m(eVar.e(), eVar.c());
    }

    public final void o(PriorityQueue<b> priorityQueue, int i10) {
        b bVarPoll;
        while (priorityQueue.size() < i10 && (bVarPoll = priorityQueue.poll()) != null && bVarPoll.a()) {
            priorityQueue.offer(bVarPoll.h());
            priorityQueue.offer(bVarPoll);
        }
    }
}
