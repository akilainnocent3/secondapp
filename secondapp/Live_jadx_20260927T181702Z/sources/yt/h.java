package yt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import yt.h.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class h<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f159894d = new h(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f159896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f159897c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v<FieldDescriptorType, Object> f159895a = v.p(16);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f159899b;

        static {
            int[] iArr = new int[z.b.values().length];
            f159899b = iArr;
            try {
                iArr[z.b.f159984d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f159899b[z.b.f159985e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f159899b[z.b.f159986f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f159899b[z.b.f159987g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f159899b[z.b.f159988h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f159899b[z.b.f159989i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f159899b[z.b.f159990j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f159899b[z.b.f159991k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f159899b[z.b.f159992l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f159899b[z.b.f159995o.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f159899b[z.b.f159996p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f159899b[z.b.f159998r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f159899b[z.b.f159999s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f159899b[z.b.f160000t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f159899b[z.b.f160001u.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f159899b[z.b.f159993m.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f159899b[z.b.f159994n.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f159899b[z.b.f159997q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[z.c.values().length];
            f159898a = iArr2;
            try {
                iArr2[z.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f159898a[z.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f159898a[z.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f159898a[z.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f159898a[z.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f159898a[z.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f159898a[z.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f159898a[z.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f159898a[z.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b<T extends b<T>> extends Comparable<T> {
        q.a A0(q.a aVar, q qVar);

        z.c getLiteJavaType();

        z.b getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public h() {
    }

    public static int d(z.b bVar, int i10, Object obj) {
        int iD = f.D(i10);
        if (bVar == z.b.f159993m) {
            iD *= 2;
        }
        return iD + e(bVar, obj);
    }

    public static int e(z.b bVar, Object obj) {
        switch (a.f159899b[bVar.ordinal()]) {
            case 1:
                return f.g(((Double) obj).doubleValue());
            case 2:
                return f.m(((Float) obj).floatValue());
            case 3:
                return f.q(((Long) obj).longValue());
            case 4:
                return f.F(((Long) obj).longValue());
            case 5:
                return f.p(((Integer) obj).intValue());
            case 6:
                return f.k(((Long) obj).longValue());
            case 7:
                return f.j(((Integer) obj).intValue());
            case 8:
                return f.b(((Boolean) obj).booleanValue());
            case 9:
                return f.C((String) obj);
            case 10:
                return obj instanceof d ? f.e((d) obj) : f.c((byte[]) obj);
            case 11:
                return f.E(((Integer) obj).intValue());
            case 12:
                return f.x(((Integer) obj).intValue());
            case 13:
                return f.y(((Long) obj).longValue());
            case 14:
                return f.z(((Integer) obj).intValue());
            case 15:
                return f.B(((Long) obj).longValue());
            case 16:
                return f.n((q) obj);
            case 17:
                return obj instanceof l ? f.r((l) obj) : f.t((q) obj);
            case 18:
                return obj instanceof j.a ? f.i(((j.a) obj).getNumber()) : f.i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        z.b liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return d(liteType, number, obj);
        }
        int iD = 0;
        if (bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iD += e(liteType, it.next());
            }
            return f.D(number) + iD + f.v(iD);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iD += d(liteType, number, it2.next());
        }
        return iD;
    }

    public static <T extends b<T>> h<T> g() {
        return f159894d;
    }

    public static int l(z.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.g();
    }

    public static <T extends b<T>> h<T> t() {
        return new h<>();
    }

    public static Object u(e eVar, z.b bVar, boolean z10) throws IOException {
        switch (a.f159899b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(eVar.m());
            case 2:
                return Float.valueOf(eVar.q());
            case 3:
                return Long.valueOf(eVar.t());
            case 4:
                return Long.valueOf(eVar.M());
            case 5:
                return Integer.valueOf(eVar.s());
            case 6:
                return Long.valueOf(eVar.p());
            case 7:
                return Integer.valueOf(eVar.o());
            case 8:
                return Boolean.valueOf(eVar.k());
            case 9:
                return z10 ? eVar.J() : eVar.I();
            case 10:
                return eVar.l();
            case 11:
                return Integer.valueOf(eVar.L());
            case 12:
                return Integer.valueOf(eVar.E());
            case 13:
                return Long.valueOf(eVar.F());
            case 14:
                return Integer.valueOf(eVar.G());
            case 15:
                return Long.valueOf(eVar.H());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    public static void w(z.b bVar, Object obj) {
        obj.getClass();
        boolean z10 = true;
        boolean z11 = false;
        switch (a.f159898a[bVar.d().ordinal()]) {
            case 1:
                z11 = obj instanceof Integer;
                break;
            case 2:
                z11 = obj instanceof Long;
                break;
            case 3:
                z11 = obj instanceof Float;
                break;
            case 4:
                z11 = obj instanceof Double;
                break;
            case 5:
                z11 = obj instanceof Boolean;
                break;
            case 6:
                z11 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof d) && !(obj instanceof byte[])) {
                    z10 = false;
                }
                z11 = z10;
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof j.a)) {
                    z10 = false;
                }
                z11 = z10;
                break;
            case 9:
                if (!(obj instanceof q) && !(obj instanceof l)) {
                    z10 = false;
                }
                z11 = z10;
                break;
        }
        if (!z11) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void x(f fVar, z.b bVar, int i10, Object obj) throws IOException {
        if (bVar == z.b.f159993m) {
            fVar.Y(i10, (q) obj);
        } else {
            fVar.w0(i10, l(bVar, false));
            y(fVar, bVar, obj);
        }
    }

    public static void y(f fVar, z.b bVar, Object obj) throws IOException {
        switch (a.f159899b[bVar.ordinal()]) {
            case 1:
                fVar.R(((Double) obj).doubleValue());
                break;
            case 2:
                fVar.X(((Float) obj).floatValue());
                break;
            case 3:
                fVar.c0(((Long) obj).longValue());
                break;
            case 4:
                fVar.z0(((Long) obj).longValue());
                break;
            case 5:
                fVar.b0(((Integer) obj).intValue());
                break;
            case 6:
                fVar.V(((Long) obj).longValue());
                break;
            case 7:
                fVar.U(((Integer) obj).intValue());
                break;
            case 8:
                fVar.M(((Boolean) obj).booleanValue());
                break;
            case 9:
                fVar.v0((String) obj);
                break;
            case 10:
                if (!(obj instanceof d)) {
                    fVar.N((byte[]) obj);
                } else {
                    fVar.P((d) obj);
                }
                break;
            case 11:
                fVar.y0(((Integer) obj).intValue());
                break;
            case 12:
                fVar.q0(((Integer) obj).intValue());
                break;
            case 13:
                fVar.r0(((Long) obj).longValue());
                break;
            case 14:
                fVar.s0(((Integer) obj).intValue());
                break;
            case 15:
                fVar.u0(((Long) obj).longValue());
                break;
            case 16:
                fVar.Z((q) obj);
                break;
            case 17:
                fVar.e0((q) obj);
                break;
            case 18:
                if (!(obj instanceof j.a)) {
                    fVar.T(((Integer) obj).intValue());
                } else {
                    fVar.T(((j.a) obj).getNumber());
                }
                break;
        }
    }

    public static void z(b<?> bVar, Object obj, f fVar) throws IOException {
        z.b liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            if (obj instanceof l) {
                x(fVar, liteType, number, ((l) obj).e());
                return;
            } else {
                x(fVar, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!bVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                x(fVar, liteType, number, it.next());
            }
            return;
        }
        fVar.w0(number, 2);
        Iterator it2 = list.iterator();
        int iE = 0;
        while (it2.hasNext()) {
            iE += e(liteType, it2.next());
        }
        fVar.o0(iE);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            y(fVar, liteType, it3.next());
        }
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        List arrayList;
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        w(fielddescriptortype.getLiteType(), obj);
        Object objH = h(fielddescriptortype);
        if (objH == null) {
            arrayList = new ArrayList();
            this.f159895a.put(fielddescriptortype, arrayList);
        } else {
            arrayList = (List) objH;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h<FieldDescriptorType> clone() {
        h<FieldDescriptorType> hVarT = t();
        for (int i10 = 0; i10 < this.f159895a.j(); i10++) {
            Map.Entry<K, Object> entryH = this.f159895a.h(i10);
            hVarT.v((b) entryH.getKey(), entryH.getValue());
        }
        Iterator it = this.f159895a.k().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            hVarT.v((b) entry.getKey(), entry.getValue());
        }
        hVarT.f159897c = this.f159897c;
        return hVarT;
    }

    public final Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public Object h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f159895a.get(fielddescriptortype);
        return obj instanceof l ? ((l) obj).e() : obj;
    }

    public Object i(FieldDescriptorType fielddescriptortype, int i10) {
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objH = h(fielddescriptortype);
        if (objH != null) {
            return ((List) objH).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int j(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objH = h(fielddescriptortype);
        if (objH == null) {
            return 0;
        }
        return ((List) objH).size();
    }

    public int k() {
        int iF = 0;
        for (int i10 = 0; i10 < this.f159895a.j(); i10++) {
            Map.Entry<K, Object> entryH = this.f159895a.h(i10);
            iF += f((b) entryH.getKey(), entryH.getValue());
        }
        Iterator it = this.f159895a.k().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean m(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f159895a.get(fielddescriptortype) != null;
    }

    public boolean n() {
        for (int i10 = 0; i10 < this.f159895a.j(); i10++) {
            if (!o(this.f159895a.h(i10))) {
                return false;
            }
        }
        Iterator it = this.f159895a.k().iterator();
        while (it.hasNext()) {
            if (!o((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.getLiteJavaType() == z.c.MESSAGE) {
            if (key.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((q) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof q)) {
                    if (value instanceof l) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((q) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> p() {
        return this.f159897c ? new l.c(this.f159895a.entrySet().iterator()) : this.f159895a.entrySet().iterator();
    }

    public void q() {
        if (this.f159896b) {
            return;
        }
        this.f159895a.n();
        this.f159896b = true;
    }

    public void r(h<FieldDescriptorType> hVar) {
        for (int i10 = 0; i10 < hVar.f159895a.j(); i10++) {
            s(hVar.f159895a.h(i10));
        }
        Iterator it = hVar.f159895a.k().iterator();
        while (it.hasNext()) {
            s((Map.Entry) it.next());
        }
    }

    public final void s(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof l) {
            value = ((l) value).e();
        }
        if (key.isRepeated()) {
            Object objH = h(key);
            if (objH == null) {
                objH = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objH).add(c(it.next()));
            }
            this.f159895a.put(key, objH);
            return;
        }
        if (key.getLiteJavaType() != z.c.MESSAGE) {
            this.f159895a.put(key, c(value));
            return;
        }
        Object objH2 = h(key);
        if (objH2 == null) {
            this.f159895a.put(key, c(value));
        } else {
            this.f159895a.put(key, key.A0(((q) objH2).toBuilder(), (q) value).build());
        }
    }

    public void v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.isRepeated()) {
            w(fielddescriptortype.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w(fielddescriptortype.getLiteType(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof l) {
            this.f159897c = true;
        }
        this.f159895a.put(fielddescriptortype, obj);
    }

    public h(boolean z10) {
        q();
    }
}
