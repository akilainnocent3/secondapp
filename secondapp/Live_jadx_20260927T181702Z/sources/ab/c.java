package ab;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class c extends p<bb.d, bb.d> {
    public c(List<hb.a<bb.d>> list) {
        super((List) b(list));
    }

    public static hb.a<bb.d> a(hb.a<bb.d> aVar) {
        bb.d dVar = aVar.f88080b;
        bb.d dVar2 = aVar.f88081c;
        if (dVar == null || dVar2 == null || dVar.e().length == dVar2.e().length) {
            return aVar;
        }
        float[] fArrC = c(dVar.e(), dVar2.e());
        return aVar.b(dVar.b(fArrC), dVar2.b(fArrC));
    }

    public static List<hb.a<bb.d>> b(List<hb.a<bb.d>> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, a(list.get(i10)));
        }
        return list;
    }

    public static float[] c(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f10 = Float.NaN;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f11 = fArr3[i11];
            if (f11 != f10) {
                fArr3[i10] = f11;
                i10++;
                f10 = fArr3[i11];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i10);
    }

    @Override // ab.p, ab.o
    public /* bridge */ /* synthetic */ boolean e() {
        return super.e();
    }

    @Override // ab.o
    public wa.a<bb.d, bb.d> f() {
        return new wa.e(this.f4677a);
    }

    @Override // ab.p, ab.o
    public /* bridge */ /* synthetic */ List g() {
        return super.g();
    }

    @Override // ab.p
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
