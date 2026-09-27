package wb;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import k.h1;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@t0(19)
public class q implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f142677d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f142678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f142679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f142680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f142681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Bitmap.Config[] f142682i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f142683a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h<b, Bitmap> f142684b = new h<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f142685c = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f142686a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f142686a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f142686a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f142686a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f142686a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @h1
    public static class c extends d<b> {
        @Override // wb.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b bVarB = b();
            bVarB.b(i10, config);
            return bVarB;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f142678e = configArr;
        f142679f = configArr;
        f142680g = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f142681h = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f142682i = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String h(int i10, Bitmap.Config config) {
        return C4235d4.j.f61460d + i10 + "](" + config + gi.j.f86771d;
    }

    public static Bitmap.Config[] i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f142679f;
        }
        int i10 = a.f142686a[config.ordinal()];
        if (i10 == 1) {
            return f142678e;
        }
        if (i10 == 2) {
            return f142680g;
        }
        if (i10 != 3) {
            return i10 != 4 ? new Bitmap.Config[]{config} : f142682i;
        }
        return f142681h;
    }

    @Override // wb.m
    public String a(int i10, int i11, Bitmap.Config config) {
        return h(pc.o.h(i10, i11, config), config);
    }

    @Override // wb.m
    public int b(Bitmap bitmap) {
        return pc.o.i(bitmap);
    }

    @Override // wb.m
    public String c(Bitmap bitmap) {
        return h(pc.o.i(bitmap), bitmap.getConfig());
    }

    @Override // wb.m
    public void d(Bitmap bitmap) {
        b bVarE = this.f142683a.e(pc.o.i(bitmap), bitmap.getConfig());
        this.f142684b.d(bVarE, bitmap);
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num = navigableMapJ.get(Integer.valueOf(bVarE.f142688b));
        navigableMapJ.put(Integer.valueOf(bVarE.f142688b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // wb.m
    @Nullable
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        b bVarG = g(pc.o.h(i10, i11, config), config);
        Bitmap bitmapA = this.f142684b.a(bVarG);
        if (bitmapA != null) {
            f(Integer.valueOf(bVarG.f142688b), bitmapA);
            bitmapA.reconfigure(i10, i11, config);
        }
        return bitmapA;
    }

    public final void f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num2 = navigableMapJ.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapJ.remove(num);
                return;
            } else {
                navigableMapJ.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(bitmap) + ", this: " + this);
    }

    public final b g(int i10, Bitmap.Config config) {
        b bVarE = this.f142683a.e(i10, config);
        for (Bitmap.Config config2 : i(config)) {
            Integer numCeilingKey = j(config2).ceilingKey(Integer.valueOf(i10));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i10 * 8) {
                if (numCeilingKey.intValue() == i10 && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                this.f142683a.c(bVarE);
                return this.f142683a.e(numCeilingKey.intValue(), config2);
            }
        }
        return bVarE;
    }

    public final NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f142685c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f142685c.put(config, treeMap);
        return treeMap;
    }

    @Override // wb.m
    @Nullable
    public Bitmap removeLast() {
        Bitmap bitmapF = this.f142684b.f();
        if (bitmapF != null) {
            f(Integer.valueOf(pc.o.i(bitmapF)), bitmapF);
        }
        return bitmapF;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f142684b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f142685c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(fw.b.f85384k);
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f142685c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @h1
    public static final class b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f142687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f142688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bitmap.Config f142689c;

        public b(c cVar) {
            this.f142687a = cVar;
        }

        @Override // wb.n
        public void a() {
            this.f142687a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f142688b = i10;
            this.f142689c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f142688b == bVar.f142688b && pc.o.e(this.f142689c, bVar.f142689c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f142688b * 31;
            Bitmap.Config config = this.f142689c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return q.h(this.f142688b, this.f142689c);
        }

        @h1
        public b(c cVar, int i10, Bitmap.Config config) {
            this(cVar);
            b(i10, config);
        }
    }
}
