package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import f0.m3;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, List<cb.e>> f25070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, c1> f25071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f25072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, za.c> f25073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<za.h> f25074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m3<za.d> f25075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f0.d1<cb.e> f25076i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<cb.e> f25077j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f25078k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f25079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f25080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f25081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f25082o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f25084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f25085r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f25068a = new m1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet<String> f25069b = new HashSet<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f25083p = 0;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Deprecated
    public static class b {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a implements d1<k>, com.airbnb.lottie.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final l1 f25086a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f25087b;

            @Override // com.airbnb.lottie.d1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResult(k kVar) {
                if (this.f25087b) {
                    return;
                }
                this.f25086a.a(kVar);
            }

            @Override // com.airbnb.lottie.b
            public void cancel() {
                this.f25087b = true;
            }

            public a(l1 l1Var) {
                this.f25087b = false;
                this.f25086a = l1Var;
            }
        }

        @Deprecated
        public static com.airbnb.lottie.b a(Context context, String str, l1 l1Var) {
            a aVar = new a(l1Var);
            f0.y(context, str).d(aVar);
            return aVar;
        }

        @Nullable
        @k.i1
        @Deprecated
        public static k b(Context context, String str) {
            return f0.A(context, str).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b c(InputStream inputStream, l1 l1Var) {
            a aVar = new a(l1Var);
            f0.F(inputStream, null).d(aVar);
            return aVar;
        }

        @Nullable
        @k.i1
        @Deprecated
        public static k d(InputStream inputStream) {
            return f0.H(inputStream, null).b();
        }

        @Nullable
        @k.i1
        @Deprecated
        public static k e(InputStream inputStream, boolean z10) {
            if (z10) {
                gb.g.e("Lottie now auto-closes input stream!");
            }
            return f0.H(inputStream, null).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b f(fb.c cVar, l1 l1Var) {
            a aVar = new a(l1Var);
            f0.J(cVar, null).d(aVar);
            return aVar;
        }

        @Deprecated
        public static com.airbnb.lottie.b g(String str, l1 l1Var) {
            a aVar = new a(l1Var);
            f0.Q(str, null).d(aVar);
            return aVar;
        }

        @Nullable
        @k.i1
        @Deprecated
        public static k h(Resources resources, JSONObject jSONObject) {
            return f0.S(jSONObject, null).b();
        }

        @Nullable
        @k.i1
        @Deprecated
        public static k i(fb.c cVar) {
            return f0.K(cVar, null).b();
        }

        @Nullable
        @k.i1
        @Deprecated
        public static k j(String str) {
            return f0.R(str, null).b();
        }

        @Deprecated
        public static com.airbnb.lottie.b k(Context context, @k.r0 int i10, l1 l1Var) {
            a aVar = new a(l1Var);
            f0.T(context, i10).d(aVar);
            return aVar;
        }
    }

    @k.y0({k.y0.a.LIBRARY})
    public void A(boolean z10) {
        this.f25082o = z10;
    }

    public void B(boolean z10) {
        this.f25068a.g(z10);
    }

    @k.y0({k.y0.a.LIBRARY})
    public void a(String str) {
        gb.g.e(str);
        this.f25069b.add(str);
    }

    public Rect b() {
        return this.f25078k;
    }

    public m3<za.d> c() {
        return this.f25075h;
    }

    public float d() {
        return (long) ((e() / this.f25081n) * 1000.0f);
    }

    public float e() {
        return this.f25080m - this.f25079l;
    }

    public float f() {
        return this.f25080m;
    }

    public Map<String, za.c> g() {
        return this.f25073f;
    }

    public float h(float f10) {
        return gb.l.k(this.f25079l, this.f25080m, f10);
    }

    public float i() {
        return this.f25081n;
    }

    public Map<String, c1> j() {
        float fE = gb.z.e();
        if (fE != this.f25072e) {
            for (Map.Entry<String, c1> entry : this.f25071d.entrySet()) {
                this.f25071d.put(entry.getKey(), entry.getValue().a(this.f25072e / fE));
            }
        }
        this.f25072e = fE;
        return this.f25071d;
    }

    public List<cb.e> k() {
        return this.f25077j;
    }

    @Nullable
    public za.h l(String str) {
        int size = this.f25074g.size();
        for (int i10 = 0; i10 < size; i10++) {
            za.h hVar = this.f25074g.get(i10);
            if (hVar.d(str)) {
                return hVar;
            }
        }
        return null;
    }

    public List<za.h> m() {
        return this.f25074g;
    }

    @k.y0({k.y0.a.LIBRARY})
    public int n() {
        return this.f25083p;
    }

    public m1 o() {
        return this.f25068a;
    }

    @Nullable
    @k.y0({k.y0.a.LIBRARY})
    public List<cb.e> p(String str) {
        return this.f25070c.get(str);
    }

    public float q(float f10) {
        float f11 = this.f25079l;
        return (f10 - f11) / (this.f25080m - f11);
    }

    public float r() {
        return this.f25079l;
    }

    public int s() {
        return this.f25085r;
    }

    public int t() {
        return this.f25084q;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<cb.e> it = this.f25077j.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().z("\t"));
        }
        return sb2.toString();
    }

    public ArrayList<String> u() {
        HashSet<String> hashSet = this.f25069b;
        return new ArrayList<>(Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()])));
    }

    @k.y0({k.y0.a.LIBRARY})
    public boolean v() {
        return this.f25082o;
    }

    public boolean w() {
        return !this.f25071d.isEmpty();
    }

    @k.y0({k.y0.a.LIBRARY})
    public void x(int i10) {
        this.f25083p += i10;
    }

    @k.y0({k.y0.a.LIBRARY})
    public void y(Rect rect, float f10, float f11, float f12, List<cb.e> list, f0.d1<cb.e> d1Var, Map<String, List<cb.e>> map, Map<String, c1> map2, float f13, m3<za.d> m3Var, Map<String, za.c> map3, List<za.h> list2, int i10, int i11) {
        this.f25078k = rect;
        this.f25079l = f10;
        this.f25080m = f11;
        this.f25081n = f12;
        this.f25077j = list;
        this.f25076i = d1Var;
        this.f25070c = map;
        this.f25071d = map2;
        this.f25072e = f13;
        this.f25075h = m3Var;
        this.f25073f = map3;
        this.f25074g = list2;
        this.f25084q = i10;
        this.f25085r = i11;
    }

    @k.y0({k.y0.a.LIBRARY})
    public cb.e z(long j10) {
        return this.f25076i.g(j10);
    }
}
