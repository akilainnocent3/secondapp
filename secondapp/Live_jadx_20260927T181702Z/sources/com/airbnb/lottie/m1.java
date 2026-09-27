package com.airbnb.lottie;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25099a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<b> f25100b = new f0.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, gb.k> f25101c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Comparator<e2.t<String, Float>> f25102d = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Comparator<e2.t<String, Float>> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(e2.t<String, Float> tVar, e2.t<String, Float> tVar2) {
            float fFloatValue = tVar.f79832b.floatValue();
            float fFloatValue2 = tVar2.f79832b.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void a(float f10);
    }

    public void a(b bVar) {
        this.f25100b.add(bVar);
    }

    public void b() {
        this.f25101c.clear();
    }

    public List<e2.t<String, Float>> c() {
        if (!this.f25099a) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.f25101c.size());
        for (Map.Entry<String, gb.k> entry : this.f25101c.entrySet()) {
            arrayList.add(new e2.t(entry.getKey(), Float.valueOf(entry.getValue().b())));
        }
        Collections.sort(arrayList, this.f25102d);
        return arrayList;
    }

    public void d() {
        if (this.f25099a) {
            List<e2.t<String, Float>> listC = c();
            Log.d(f.f24988b, "Render times:");
            for (int i10 = 0; i10 < listC.size(); i10++) {
                e2.t<String, Float> tVar = listC.get(i10);
                Log.d(f.f24988b, String.format("\t\t%30s:%.2f", tVar.f79831a, tVar.f79832b));
            }
        }
    }

    public void e(String str, float f10) {
        if (this.f25099a) {
            gb.k kVar = this.f25101c.get(str);
            if (kVar == null) {
                kVar = new gb.k();
                this.f25101c.put(str, kVar);
            }
            kVar.a(f10);
            if (str.equals("__container")) {
                Iterator<b> it = this.f25100b.iterator();
                while (it.hasNext()) {
                    it.next().a(f10);
                }
            }
        }
    }

    public void f(b bVar) {
        this.f25100b.remove(bVar);
    }

    public void g(boolean z10) {
        this.f25099a = z10;
    }
}
