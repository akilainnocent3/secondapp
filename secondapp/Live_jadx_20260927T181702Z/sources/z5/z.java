package z5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public class z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Comparator<b> f160531h = new Comparator() { // from class: z5.x
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return z.b((z.b) obj, (z.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Comparator<b> f160532i = new Comparator() { // from class: z5.y
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((z.b) obj).f160546c, ((z.b) obj2).f160546c);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f160533j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f160534k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f160535l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f160536m = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f160537a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f160541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f160542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f160543g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b[] f160539c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f160538b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f160540d = -1;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f160544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f160545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f160546c;

        public b() {
        }
    }

    public z(int i10) {
        this.f160537a = i10;
    }

    public static /* synthetic */ int b(b bVar, b bVar2) {
        return bVar.f160544a - bVar2.f160544a;
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f160543g;
        if (i11 > 0) {
            b[] bVarArr = this.f160539c;
            int i12 = i11 - 1;
            this.f160543g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f160541e;
        this.f160541e = i13 + 1;
        bVar.f160544a = i13;
        bVar.f160545b = i10;
        bVar.f160546c = f10;
        this.f160538b.add(bVar);
        this.f160542f += i10;
        while (true) {
            int i14 = this.f160542f;
            int i15 = this.f160537a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = this.f160538b.get(0);
            int i17 = bVar2.f160545b;
            if (i17 <= i16) {
                this.f160542f -= i17;
                this.f160538b.remove(0);
                int i18 = this.f160543g;
                if (i18 < 5) {
                    b[] bVarArr2 = this.f160539c;
                    this.f160543g = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f160545b = i17 - i16;
                this.f160542f -= i16;
            }
        }
    }

    public final void d() {
        if (this.f160540d != 1) {
            Collections.sort(this.f160538b, f160531h);
            this.f160540d = 1;
        }
    }

    public final void e() {
        if (this.f160540d != 0) {
            Collections.sort(this.f160538b, f160532i);
            this.f160540d = 0;
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f160542f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f160538b.size(); i11++) {
            b bVar = this.f160538b.get(i11);
            i10 += bVar.f160545b;
            if (i10 >= f11) {
                return bVar.f160546c;
            }
        }
        if (this.f160538b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f160538b;
        return arrayList.get(arrayList.size() - 1).f160546c;
    }

    public void g() {
        this.f160538b.clear();
        this.f160540d = -1;
        this.f160541e = 0;
        this.f160542f = 0;
    }
}
