package defpackage;

import android.util.ArrayMap;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ue6 {
    public static final wg1 i = hoa.a.a(Integer.TYPE, "camerax.core.captureConfig.rotation");
    public static final wg1 j = hoa.a.a(Integer.class, "camerax.core.captureConfig.jpegQuality");
    public static final wg1 k = hoa.a.a(Range.class, "camerax.core.captureConfig.resolvedFrameRate");
    public final ArrayList a;
    public final w2z b;
    public final int c;
    public final boolean d;
    public final List<tz5> e;
    public final boolean f;
    public final c4f0 g;
    public final e06 h;

    public interface b {
        void a(i8n i8nVar, a aVar);
    }

    public ue6(ArrayList arrayList, w2z w2zVar, int i2, boolean z, ArrayList arrayList2, boolean z2, c4f0 c4f0Var, e06 e06Var) {
        this.a = arrayList;
        this.b = w2zVar;
        this.c = i2;
        this.e = Collections.unmodifiableList(arrayList2);
        this.f = z2;
        this.g = c4f0Var;
        this.h = e06Var;
        this.d = z;
    }

    public final Range<Integer> a() {
        Range<Integer> range = (Range) this.b.b(k, k8e0.a);
        Objects.requireNonNull(range);
        return range;
    }

    public final int b() {
        Object obj = this.g.a.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    public final int c() {
        Integer num = (Integer) this.b.b(snh0.J, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int d() {
        Integer num = (Integer) this.b.b(snh0.K, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public static final class a {
        public final HashSet a;
        public ftw b;
        public int c;
        public boolean d;
        public final ArrayList e;
        public boolean f;
        public final buw g;
        public e06 h;

        public a(ue6 ue6Var) {
            HashSet hashSet = new HashSet();
            this.a = hashSet;
            this.b = ftw.V();
            this.c = -1;
            this.d = false;
            ArrayList arrayList = new ArrayList();
            this.e = arrayList;
            this.f = false;
            this.g = buw.a();
            hashSet.addAll(ue6Var.a);
            this.b = ftw.W(ue6Var.b);
            this.c = ue6Var.c;
            arrayList.addAll(ue6Var.e);
            this.f = ue6Var.f;
            c4f0 c4f0Var = ue6Var.g;
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = c4f0Var.a;
            for (String str : arrayMap2.keySet()) {
                arrayMap.put(str, arrayMap2.get(str));
            }
            this.g = new buw(arrayMap);
            this.d = ue6Var.d;
        }

        public final void a(Collection<tz5> collection) {
            Iterator<tz5> it = collection.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        }

        public final void b(tz5 tz5Var) {
            ArrayList arrayList = this.e;
            if (arrayList.contains(tz5Var)) {
                return;
            }
            arrayList.add(tz5Var);
        }

        public final void c(hoa hoaVar) {
            for (hoa.a<?> aVar : hoaVar.c()) {
                Object objB = this.b.b(aVar, null);
                Object objD = hoaVar.d(aVar);
                if (objB instanceof ulw) {
                    ulw ulwVar = (ulw) objD;
                    ulwVar.getClass();
                    ((ulw) objB).a.addAll(Collections.unmodifiableList(new ArrayList(ulwVar.a)));
                } else {
                    if (objD instanceof ulw) {
                        objD = ((ulw) objD).clone();
                    }
                    this.b.X(aVar, hoaVar.f(aVar), objD);
                }
            }
        }

        public final void d(ijd ijdVar) {
            this.a.add(ijdVar);
        }

        public final ue6 e() {
            ArrayList arrayList = new ArrayList(this.a);
            w2z w2zVarU = w2z.U(this.b);
            int i = this.c;
            boolean z = this.d;
            ArrayList arrayList2 = new ArrayList(this.e);
            boolean z2 = this.f;
            c4f0 c4f0Var = c4f0.b;
            ArrayMap arrayMap = new ArrayMap();
            buw buwVar = this.g;
            for (String str : buwVar.a.keySet()) {
                arrayMap.put(str, buwVar.a.get(str));
            }
            return new ue6(arrayList, w2zVarU, i, z, arrayList2, z2, new c4f0(arrayMap), this.h);
        }

        public final Range<Integer> f() {
            return (Range) this.b.b(ue6.k, k8e0.a);
        }

        public a() {
            this.a = new HashSet();
            this.b = ftw.V();
            this.c = -1;
            this.d = false;
            this.e = new ArrayList();
            this.f = false;
            this.g = buw.a();
        }
    }
}
