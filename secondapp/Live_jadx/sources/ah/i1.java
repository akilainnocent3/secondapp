package ah;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class i1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Comparator<b> f5178h = new Comparator() { // from class: ah.g1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return i1.a((i1.b) obj, (i1.b) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Comparator<b> f5179i = new Comparator() { // from class: ah.h1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((i1.b) obj).f5193c, ((i1.b) obj2).f5193c);
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f5180j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f5181k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f5182l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f5183m = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5184a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5190g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b[] f5186c = new b[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f5185b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5187d = -1;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f5193c;

        public b() {
        }
    }

    public i1(int i10) {
        this.f5184a = i10;
    }

    public static /* synthetic */ int a(b bVar, b bVar2) {
        return bVar.f5191a - bVar2.f5191a;
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f5190g;
        if (i11 > 0) {
            b[] bVarArr = this.f5186c;
            int i12 = i11 - 1;
            this.f5190g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f5188e;
        this.f5188e = i13 + 1;
        bVar.f5191a = i13;
        bVar.f5192b = i10;
        bVar.f5193c = f10;
        this.f5185b.add(bVar);
        this.f5189f += i10;
        while (true) {
            int i14 = this.f5189f;
            int i15 = this.f5184a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            b bVar2 = this.f5185b.get(0);
            int i17 = bVar2.f5192b;
            if (i17 <= i16) {
                this.f5189f -= i17;
                this.f5185b.remove(0);
                int i18 = this.f5190g;
                if (i18 < 5) {
                    b[] bVarArr2 = this.f5186c;
                    this.f5190g = i18 + 1;
                    bVarArr2[i18] = bVar2;
                }
            } else {
                bVar2.f5192b = i17 - i16;
                this.f5189f -= i16;
            }
        }
    }

    public final void d() {
        if (this.f5187d != 1) {
            Collections.sort(this.f5185b, f5178h);
            this.f5187d = 1;
        }
    }

    public final void e() {
        if (this.f5187d != 0) {
            Collections.sort(this.f5185b, f5179i);
            this.f5187d = 0;
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * this.f5189f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f5185b.size(); i11++) {
            b bVar = this.f5185b.get(i11);
            i10 += bVar.f5192b;
            if (i10 >= f11) {
                return bVar.f5193c;
            }
        }
        if (this.f5185b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f5185b;
        return arrayList.get(arrayList.size() - 1).f5193c;
    }

    public void g() {
        this.f5185b.clear();
        this.f5187d = -1;
        this.f5188e = 0;
        this.f5189f = 0;
    }
}
