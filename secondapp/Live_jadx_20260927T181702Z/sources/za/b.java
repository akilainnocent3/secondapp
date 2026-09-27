package za;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import k.k;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY})
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f160906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f160907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f160908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f160909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f160910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f160911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f160912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @k
    public int f160913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @k
    public int f160914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f160915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f160916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public PointF f160917l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public PointF f160918m;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, @k int i11, @k int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        a(str, str2, f10, aVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void a(String str, String str2, float f10, a aVar, int i10, float f11, float f12, @k int i11, @k int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.f160906a = str;
        this.f160907b = str2;
        this.f160908c = f10;
        this.f160909d = aVar;
        this.f160910e = i10;
        this.f160911f = f11;
        this.f160912g = f12;
        this.f160913h = i11;
        this.f160914i = i12;
        this.f160915j = f13;
        this.f160916k = z10;
        this.f160917l = pointF;
        this.f160918m = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f160906a.hashCode() * 31) + this.f160907b.hashCode()) * 31) + this.f160908c)) * 31) + this.f160909d.ordinal()) * 31) + this.f160910e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f160911f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f160913h;
    }

    public b() {
    }
}
