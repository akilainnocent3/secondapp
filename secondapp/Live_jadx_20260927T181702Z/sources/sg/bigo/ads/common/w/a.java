package sg.bigo.ads.common.w;

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
import k.t0;

/* JADX INFO: loaded from: classes7.dex */
@t0(api = 19)
final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Comparator<C1360a> f133651g = new Comparator<C1360a>() { // from class: sg.bigo.ads.common.w.a.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C1360a c1360a, C1360a c1360a2) {
            return c1360a2.a() - c1360a.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f133652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int[] f133653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<c.C1362c> f133654c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final c.b[] f133656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f133657f = new float[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    final TimingLogger f133655d = null;

    /* JADX INFO: renamed from: sg.bigo.ads.common.w.a$a, reason: collision with other inner class name */
    public class C1360a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133658a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f133660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f133661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f133662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f133663f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f133664g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f133665h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f133666i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f133667j;

        public C1360a(int i10, int i11) {
            this.f133660c = i10;
            this.f133658a = i11;
            c();
        }

        private int f() {
            return (this.f133658a + 1) - this.f133660c;
        }

        public final int a() {
            return ((this.f133663f - this.f133662e) + 1) * ((this.f133665h - this.f133664g) + 1) * ((this.f133667j - this.f133666i) + 1);
        }

        public final boolean b() {
            return f() > 1;
        }

        public final void c() {
            a aVar = a.this;
            int[] iArr = aVar.f133652a;
            int[] iArr2 = aVar.f133653b;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = 0;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MAX_VALUE;
            for (int i17 = this.f133660c; i17 <= this.f133658a; i17++) {
                int i18 = iArr[i17];
                i14 += iArr2[i18];
                int iA = a.a(i18);
                int iB = a.b(i18);
                int iC = a.c(i18);
                if (iA > i11) {
                    i11 = iA;
                }
                if (iA < i10) {
                    i10 = iA;
                }
                if (iB > i12) {
                    i12 = iB;
                }
                if (iB < i15) {
                    i15 = iB;
                }
                if (iC > i13) {
                    i13 = iC;
                }
                if (iC < i16) {
                    i16 = iC;
                }
            }
            this.f133662e = i10;
            this.f133663f = i11;
            this.f133664g = i15;
            this.f133665h = i12;
            this.f133666i = i16;
            this.f133667j = i13;
            this.f133661d = i14;
        }

        public final int d() {
            int i10;
            int i11 = this.f133663f - this.f133662e;
            int i12 = this.f133665h - this.f133664g;
            int i13 = this.f133667j - this.f133666i;
            if (i11 < i12 || i11 < i13) {
                i10 = (i12 < i11 || i12 < i13) ? -1 : -2;
            } else {
                i10 = -3;
            }
            a aVar = a.this;
            int[] iArr = aVar.f133652a;
            int[] iArr2 = aVar.f133653b;
            a.a(iArr, i10, this.f133660c, this.f133658a);
            Arrays.sort(iArr, this.f133660c, this.f133658a + 1);
            a.a(iArr, i10, this.f133660c, this.f133658a);
            int i14 = this.f133661d / 2;
            int i15 = this.f133660c;
            int i16 = 0;
            while (true) {
                int i17 = this.f133658a;
                if (i15 > i17) {
                    return this.f133660c;
                }
                i16 += iArr2[iArr[i15]];
                if (i16 >= i14) {
                    return Math.min(i17 - 1, i15);
                }
                i15++;
            }
        }

        public final c.C1362c e() {
            a aVar = a.this;
            int[] iArr = aVar.f133652a;
            int[] iArr2 = aVar.f133653b;
            int i10 = 0;
            int iA = 0;
            int iB = 0;
            int iC = 0;
            for (int i11 = this.f133660c; i11 <= this.f133658a; i11++) {
                int i12 = iArr[i11];
                int i13 = iArr2[i12];
                i10 += i13;
                iA += a.a(i12) * i13;
                iB += a.b(i12) * i13;
                iC += i13 * a.c(i12);
            }
            if (i10 == 0) {
                return new c.C1362c(a.a(0, 0, 0), i10);
            }
            float f10 = i10;
            return new c.C1362c(a.a(Math.round(iA / f10), Math.round(iB / f10), Math.round(iC / f10)), i10);
        }
    }

    public a(int[] iArr, int i10, c.b[] bVarArr) {
        this.f133656e = bVarArr;
        int[] iArr2 = new int[32768];
        this.f133653b = iArr2;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            int iB = b(Color.blue(i12), 8, 5) | (b(Color.red(i12), 8, 5) << 10) | (b(Color.green(i12), 8, 5) << 5);
            iArr[i11] = iB;
            iArr2[iB] = iArr2[iB] + 1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 32768; i14++) {
            if (iArr2[i14] > 0) {
                b.a(d(i14), this.f133657f);
                if (a(this.f133657f)) {
                    iArr2[i14] = 0;
                }
            }
            if (iArr2[i14] > 0) {
                i13++;
            }
        }
        int[] iArr3 = new int[i13];
        this.f133652a = iArr3;
        int i15 = 0;
        for (int i16 = 0; i16 < 32768; i16++) {
            if (iArr2[i16] > 0) {
                iArr3[i15] = i16;
                i15++;
            }
        }
        if (i13 > i10) {
            PriorityQueue priorityQueue = new PriorityQueue(i10, f133651g);
            priorityQueue.offer(new C1360a(0, this.f133652a.length - 1));
            a(priorityQueue, i10);
            this.f133654c = a(priorityQueue);
            return;
        }
        this.f133654c = new ArrayList();
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = iArr3[i17];
            this.f133654c.add(new c.C1362c(d(i18), iArr2[i18]));
        }
    }

    public static int a(int i10) {
        return (i10 >> 10) & 31;
    }

    public static int b(int i10) {
        return (i10 >> 5) & 31;
    }

    public static int c(int i10) {
        return i10 & 31;
    }

    private static int d(int i10) {
        return a((i10 >> 10) & 31, (i10 >> 5) & 31, i10 & 31);
    }

    public static int a(int i10, int i11, int i12) {
        return Color.rgb(b(i10, 5, 8), b(i11, 5, 8), b(i12, 5, 8));
    }

    private static int b(int i10, int i11, int i12) {
        return (i12 > i11 ? i10 << (i12 - i11) : i10 >> (i11 - i12)) & ((1 << i12) - 1);
    }

    private List<c.C1362c> a(Collection<C1360a> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<C1360a> it = collection.iterator();
        while (it.hasNext()) {
            c.C1362c c1362cE = it.next().e();
            if (!a(c1362cE.a())) {
                arrayList.add(c1362cE);
            }
        }
        return arrayList;
    }

    private static void a(PriorityQueue<C1360a> priorityQueue, int i10) {
        C1360a c1360aPoll;
        while (priorityQueue.size() < i10 && (c1360aPoll = priorityQueue.poll()) != null && c1360aPoll.b()) {
            if (!c1360aPoll.b()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int iD = c1360aPoll.d();
            C1360a c1360a = a.this.new C1360a(iD + 1, c1360aPoll.f133658a);
            c1360aPoll.f133658a = iD;
            c1360aPoll.c();
            priorityQueue.offer(c1360a);
            priorityQueue.offer(c1360aPoll);
        }
    }

    public static void a(int[] iArr, int i10, int i11, int i12) {
        if (i10 == -2) {
            while (i11 <= i12) {
                int i13 = iArr[i11];
                iArr[i11] = (i13 & 31) | (((i13 >> 5) & 31) << 10) | (((i13 >> 10) & 31) << 5);
                i11++;
            }
            return;
        }
        if (i10 != -1) {
            return;
        }
        while (i11 <= i12) {
            int i14 = iArr[i11];
            iArr[i11] = ((i14 >> 10) & 31) | ((i14 & 31) << 10) | (((i14 >> 5) & 31) << 5);
            i11++;
        }
    }

    private boolean a(float[] fArr) {
        c.b[] bVarArr = this.f133656e;
        if (bVarArr != null && bVarArr.length > 0) {
            int length = bVarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (!this.f133656e[i10].a(fArr)) {
                    return true;
                }
            }
        }
        return false;
    }
}
