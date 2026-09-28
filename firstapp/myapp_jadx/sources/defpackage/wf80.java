package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.media.MediaCodec;
import android.util.ArrayMap;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wf80 {
    public static final List<Integer> j = Arrays.asList(1, 5, 3);
    public final ArrayList a;
    public final f b;
    public final List<CameraDevice.StateCallback> c;
    public final List<CameraCaptureSession.StateCallback> d;
    public final List<tz5> e;
    public final d f;
    public final ue6 g;
    public final int h;
    public final InputConfiguration i;

    public static class a {
        public c f;
        public InputConfiguration g;
        public f i;
        public final LinkedHashSet a = new LinkedHashSet();
        public final ue6.a b = new ue6.a();
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();
        public final ArrayList e = new ArrayList();
        public int h = 0;
    }

    public static class b extends a {
        public static b d(snh0<?> snh0Var, Size size) {
            e eVarK = snh0Var.K();
            if (eVarK == null) {
                uj5.a(snh0Var.q(snh0Var.toString()), "Implementation is missing option unpacker for ");
                return null;
            }
            b bVar = new b();
            eVarK.a(size, snh0Var, bVar);
            return bVar;
        }

        public final void a(hoa hoaVar) {
            this.b.c(hoaVar);
        }

        public final void b(ijd ijdVar, dhf dhfVar, int i) {
            pk1.a aVarA = f.a(ijdVar);
            if (dhfVar == null) {
                bmy.a("Null dynamicRange");
                return;
            }
            aVarA.e = dhfVar;
            aVarA.c = Integer.valueOf(i);
            this.a.add(aVarA.a());
            this.b.d(ijdVar);
        }

        public final wf80 c() {
            return new wf80(new ArrayList(this.a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.e(), this.f, this.g, this.h, this.i);
        }
    }

    public static final class c implements d {
        public final AtomicBoolean a = new AtomicBoolean(false);
        public final d b;

        public c(d dVar) {
            this.b = dVar;
        }

        @Override // wf80.d
        public final void a(wf80 wf80Var) {
            if (this.a.get()) {
                return;
            }
            this.b.a(wf80Var);
        }

        public final void b() {
            this.a.set(true);
        }
    }

    public interface d {
        void a(wf80 wf80Var);
    }

    public interface e {
        void a(Size size, snh0<?> snh0Var, b bVar);
    }

    public static abstract class f {

        public static abstract class a {
        }

        public static pk1.a a(ijd ijdVar) {
            pk1.a aVar = new pk1.a();
            if (ijdVar == null) {
                bmy.a("Null surface");
                return null;
            }
            aVar.a = ijdVar;
            List<ijd> list = Collections.EMPTY_LIST;
            if (list == null) {
                bmy.a("Null sharedSurfaces");
                return null;
            }
            aVar.b = list;
            aVar.c = -1;
            aVar.d = -1;
            aVar.e = dhf.d;
            return aVar;
        }

        public abstract dhf b();

        public abstract int c();

        public abstract String d();

        public abstract List<ijd> e();

        public abstract ijd f();

        public abstract int g();
    }

    public static final class g extends a {
        public final fie0 j = new fie0();
        public boolean k = true;
        public final StringBuilder l = new StringBuilder();
        public boolean m = false;
        public final ArrayList n = new ArrayList();

        public final void a(wf80 wf80Var) {
            ue6.a aVar = this.b;
            HashSet hashSet = aVar.a;
            ue6 ue6Var = wf80Var.g;
            int i = ue6Var.c;
            if (i != -1) {
                this.m = true;
                int i2 = aVar.c;
                List<Integer> list = wf80.j;
                if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                    i = i2;
                }
                aVar.c = i;
            }
            Range<Integer> rangeA = ue6Var.a();
            Range<Integer> range = k8e0.a;
            boolean zEquals = rangeA.equals(range);
            StringBuilder sb = this.l;
            if (!zEquals) {
                if (aVar.f().equals(range)) {
                    aVar.b.Y(ue6.k, rangeA);
                } else if (!aVar.f().equals(rangeA)) {
                    this.k = false;
                    String str = "Different ExpectedFrameRateRange values; current = " + aVar.f() + ", new = " + rangeA;
                    pgt.c("ValidatingBuilder", str);
                    sb.append(str);
                }
            }
            int iC = ue6Var.c();
            if (iC != 0 && iC != 0) {
                aVar.b.Y(snh0.J, Integer.valueOf(iC));
            }
            int iD = ue6Var.d();
            if (iD != 0 && iD != 0) {
                aVar.b.Y(snh0.K, Integer.valueOf(iD));
            }
            aVar.g.a.putAll((Map) ue6Var.g.a);
            this.c.addAll(wf80Var.c);
            this.d.addAll(wf80Var.d);
            aVar.a(ue6Var.e);
            this.e.addAll(wf80Var.e);
            d dVar = wf80Var.f;
            if (dVar != null) {
                this.n.add(dVar);
            }
            InputConfiguration inputConfiguration = wf80Var.i;
            if (inputConfiguration != null) {
                this.g = inputConfiguration;
            }
            ArrayList arrayList = wf80Var.a;
            LinkedHashSet<f> linkedHashSet = this.a;
            linkedHashSet.addAll(arrayList);
            hashSet.addAll(Collections.unmodifiableList(ue6Var.a));
            ArrayList arrayList2 = new ArrayList();
            for (f fVar : linkedHashSet) {
                arrayList2.add(fVar.f());
                Iterator<ijd> it = fVar.e().iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
            }
            if (!arrayList2.containsAll(hashSet)) {
                pgt.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.k = false;
                sb.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
            }
            int i3 = wf80Var.h;
            int i4 = this.h;
            if (i3 != i4 && i3 != 0 && i4 != 0) {
                pgt.a("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
                this.k = false;
                sb.append("Invalid configuration due to that two non-default session types are set");
            } else if (i3 != 0) {
                this.h = i3;
            }
            f fVar2 = wf80Var.b;
            if (fVar2 != null) {
                f fVar3 = this.i;
                if (fVar3 == fVar2 || fVar3 == null) {
                    this.i = fVar2;
                } else {
                    pgt.a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.k = false;
                    sb.append("Invalid configuration due to that two different postview output configs are set");
                }
            }
            aVar.c(ue6Var.b);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x007c  */
        /* JADX WARN: Code duplicated, block: B:35:0x0099  */
        /* JADX WARN: Code duplicated, block: B:37:0x009c A[EDGE_INSN: B:37:0x009c->B:38:0x00cd BREAK  A[LOOP:0: B:16:0x0036->B:47:?]] */
        /* JADX WARN: Instruction removed from duplicated block: B:37:0x009c, please report this as an issue */
        public final wf80 b() {
            Range<Integer> rangeF;
            if (!this.k) {
                hb5.a("Unsupported session configuration combination");
                return null;
            }
            ArrayList arrayList = new ArrayList(this.a);
            if (this.j.a) {
                Collections.sort(arrayList, new eie0());
            }
            int i = this.h;
            ue6.a aVar = this.b;
            if (i == 1 && arrayList.size() == 2 && !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ijd ijdVarF = ((f) obj).f();
                    ijdVarF.getClass();
                    if (Intrinsics.g(ijdVarF.j, MediaCodec.class)) {
                        HashSet hashSet = aVar.a;
                        if (!hashSet.isEmpty()) {
                            Iterator it = hashSet.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    rangeF = aVar.f();
                                    if (rangeF != null) {
                                        break;
                                    }
                                    if (((Number) rangeF.getUpper()).intValue() >= 120) {
                                        rangeF = null;
                                    } else {
                                        rangeF = null;
                                    }
                                    if (rangeF != null) {
                                        break;
                                    }
                                    Range range = new Range(30, rangeF.getUpper());
                                    pgt.a("HighSpeedFpsModifier", "Modified high-speed FPS range from " + rangeF + " to " + range);
                                    aVar.b.Y(ue6.k, range);
                                    break;
                                }
                                ijd ijdVar = (ijd) it.next();
                                ijdVar.getClass();
                                if (Intrinsics.g(ijdVar.j, MediaCodec.class)) {
                                    break;
                                }
                            }
                        } else {
                            rangeF = aVar.f();
                            if (rangeF != null) {
                                break;
                            }
                            if (((Number) rangeF.getUpper()).intValue() >= 120 || !Intrinsics.g(rangeF.getLower(), rangeF.getUpper())) {
                                rangeF = null;
                            }
                            if (rangeF != null) {
                                break;
                            }
                            Range range2 = new Range(30, rangeF.getUpper());
                            pgt.a("HighSpeedFpsModifier", "Modified high-speed FPS range from " + rangeF + " to " + range2);
                            aVar.b.Y(ue6.k, range2);
                            break;
                        }
                    }
                }
            }
            return new wf80(arrayList, new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), aVar.e(), this.n.isEmpty() ? null : new d() { // from class: vf80
                @Override // wf80.d
                public final void a(wf80 wf80Var) {
                    ArrayList arrayList2 = this.a.n;
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        ((wf80.d) obj2).a(wf80Var);
                    }
                }
            }, this.g, this.h, this.i);
        }

        public final boolean c() {
            return this.m && this.k;
        }
    }

    public wf80(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ue6 ue6Var, d dVar, InputConfiguration inputConfiguration, int i, f fVar) {
        this.a = arrayList;
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
        this.f = dVar;
        this.g = ue6Var;
        this.i = inputConfiguration;
        this.h = i;
        this.b = fVar;
    }

    public static wf80 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        ftw ftwVarV = ftw.V();
        ArrayList arrayList5 = new ArrayList();
        buw buwVarA = buw.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        w2z w2zVarU = w2z.U(ftwVarV);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        c4f0 c4f0Var = c4f0.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = buwVarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new wf80(arrayList, arrayList2, arrayList3, arrayList4, new ue6(arrayList6, w2zVarU, -1, false, arrayList7, false, new c4f0(arrayMap), null), null, null, 0, null);
    }

    public final List<ijd> b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            f fVar = (f) obj;
            arrayList.add(fVar.f());
            Iterator<ijd> it = fVar.e().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
