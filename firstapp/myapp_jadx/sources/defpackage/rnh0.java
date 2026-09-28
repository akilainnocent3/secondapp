package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rnh0 {
    public final String a;
    public final LinkedHashMap b = new LinkedHashMap();

    public static final class a {
        public final wf80 a;
        public final snh0<?> b;
        public final k8e0 c;
        public final List<tnh0.b> d;
        public boolean e = false;
        public boolean f = false;

        public a(wf80 wf80Var, snh0<?> snh0Var, k8e0 k8e0Var, List<tnh0.b> list) {
            this.a = wf80Var;
            this.b = snh0Var;
            this.c = k8e0Var;
            this.d = list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UseCaseAttachInfo{mSessionConfig=");
            sb.append(this.a);
            sb.append(", mUseCaseConfig=");
            sb.append(this.b);
            sb.append(", mStreamSpec=");
            sb.append(this.c);
            sb.append(", mCaptureTypes=");
            sb.append(this.d);
            sb.append(", mAttached=");
            sb.append(this.e);
            sb.append(", mActive=");
            return ruw.a(sb, this.f, '}');
        }
    }

    public rnh0(String str) {
        this.a = str;
    }

    public final wf80.g a() {
        wf80.g gVar = new wf80.g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.b.entrySet()) {
            a aVar = (a) entry.getValue();
            if (aVar.f && aVar.e) {
                String str = (String) entry.getKey();
                gVar.a(aVar.a);
                arrayList.add(str);
            }
        }
        pgt.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.a);
        return gVar;
    }

    public final wf80.g b() {
        wf80.g gVar = new wf80.g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.b.entrySet()) {
            a aVar = (a) entry.getValue();
            if (aVar.e) {
                gVar.a(aVar.a);
                arrayList.add((String) entry.getKey());
            }
        }
        pgt.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.a);
        return gVar;
    }

    public final Collection<wf80> c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.b.entrySet()) {
            if (((a) entry.getValue()).e) {
                arrayList.add(((a) entry.getValue()).a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public final Collection<snh0<?>> d() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.b.entrySet()) {
            if (((a) entry.getValue()).e) {
                arrayList.add(((a) entry.getValue()).b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public final boolean e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (linkedHashMap.containsKey(str)) {
            return ((a) linkedHashMap.get(str)).e;
        }
        return false;
    }

    public final void f(String str, wf80 wf80Var, snh0<?> snh0Var, k8e0 k8e0Var, List<tnh0.b> list) {
        LinkedHashMap linkedHashMap = this.b;
        if (linkedHashMap.containsKey(str)) {
            a aVar = new a(wf80Var, snh0Var, k8e0Var, list);
            a aVar2 = (a) linkedHashMap.get(str);
            aVar.e = aVar2.e;
            aVar.f = aVar2.f;
            linkedHashMap.put(str, aVar);
        }
    }
}
