package n0;

import com.ironsource.C4235d4;
import java.io.PrintStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f115627d = 999;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f115628a = new int[101];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k0.a[] f115629b = new k0.a[101];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f115630c;

        public a() {
            b();
        }

        public void a(int i10, k0.a aVar) {
            if (this.f115629b[i10] != null) {
                e(i10);
            }
            this.f115629b[i10] = aVar;
            int[] iArr = this.f115628a;
            int i11 = this.f115630c;
            this.f115630c = i11 + 1;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f115628a, 999);
            Arrays.fill(this.f115629b, (Object) null);
            this.f115630c = 0;
        }

        public void c() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f115628a, this.f115630c)));
            System.out.print("K: [");
            int i10 = 0;
            while (i10 < this.f115630c) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "" : ", ");
                sb2.append(g(i10));
                printStream.print(sb2.toString());
                i10++;
            }
            System.out.println(C4235d4.j.f61462e);
        }

        public int d(int i10) {
            return this.f115628a[i10];
        }

        public void e(int i10) {
            this.f115629b[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.f115630c;
                if (i11 >= i13) {
                    this.f115630c = i13 - 1;
                    return;
                }
                int[] iArr = this.f115628a;
                if (i10 == iArr[i11]) {
                    iArr[i11] = 999;
                    i12++;
                }
                if (i11 != i12) {
                    iArr[i11] = iArr[i12];
                }
                i12++;
                i11++;
            }
        }

        public int f() {
            return this.f115630c;
        }

        public k0.a g(int i10) {
            return this.f115629b[this.f115628a[i10]];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f115631d = 999;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f115632a = new int[101];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k0.b[] f115633b = new k0.b[101];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f115634c;

        public b() {
            b();
        }

        public void a(int i10, k0.b bVar) {
            if (this.f115633b[i10] != null) {
                e(i10);
            }
            this.f115633b[i10] = bVar;
            int[] iArr = this.f115632a;
            int i11 = this.f115634c;
            this.f115634c = i11 + 1;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f115632a, 999);
            Arrays.fill(this.f115633b, (Object) null);
            this.f115634c = 0;
        }

        public void c() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f115632a, this.f115634c)));
            System.out.print("K: [");
            int i10 = 0;
            while (i10 < this.f115634c) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "" : ", ");
                sb2.append(g(i10));
                printStream.print(sb2.toString());
                i10++;
            }
            System.out.println(C4235d4.j.f61462e);
        }

        public int d(int i10) {
            return this.f115632a[i10];
        }

        public void e(int i10) {
            this.f115633b[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.f115634c;
                if (i11 >= i13) {
                    this.f115634c = i13 - 1;
                    return;
                }
                int[] iArr = this.f115632a;
                if (i10 == iArr[i11]) {
                    iArr[i11] = 999;
                    i12++;
                }
                if (i11 != i12) {
                    iArr[i11] = iArr[i12];
                }
                i12++;
                i11++;
            }
        }

        public int f() {
            return this.f115634c;
        }

        public k0.b g(int i10) {
            return this.f115633b[this.f115632a[i10]];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f115635d = 999;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f115636a = new int[101];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[][] f115637b = new float[101][];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f115638c;

        public c() {
            b();
        }

        public void a(int i10, float[] fArr) {
            if (this.f115637b[i10] != null) {
                e(i10);
            }
            this.f115637b[i10] = fArr;
            int[] iArr = this.f115636a;
            int i11 = this.f115638c;
            this.f115638c = i11 + 1;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f115636a, 999);
            Arrays.fill(this.f115637b, (Object) null);
            this.f115638c = 0;
        }

        public void c() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f115636a, this.f115638c)));
            System.out.print("K: [");
            int i10 = 0;
            while (i10 < this.f115638c) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "" : ", ");
                sb2.append(Arrays.toString(g(i10)));
                printStream.print(sb2.toString());
                i10++;
            }
            System.out.println(C4235d4.j.f61462e);
        }

        public int d(int i10) {
            return this.f115636a[i10];
        }

        public void e(int i10) {
            this.f115637b[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.f115638c;
                if (i11 >= i13) {
                    this.f115638c = i13 - 1;
                    return;
                }
                int[] iArr = this.f115636a;
                if (i10 == iArr[i11]) {
                    iArr[i11] = 999;
                    i12++;
                }
                if (i11 != i12) {
                    iArr[i11] = iArr[i12];
                }
                i12++;
                i11++;
            }
        }

        public int f() {
            return this.f115638c;
        }

        public float[] g(int i10) {
            return this.f115637b[this.f115636a[i10]];
        }
    }
}
