package androidx.work;

import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import defpackage.dq7;
import defpackage.dsc;
import defpackage.ft7;
import defpackage.hce0;
import defpackage.hoc;
import defpackage.ib5;
import defpackage.jgt;
import defpackage.jq40;
import defpackage.nrh0;
import defpackage.q1b;
import defpackage.qlr;
import defpackage.uf80;
import defpackage.wx0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c b;
    public final HashMap a;

    public static final class b {
        /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
        public static final Serializable a(DataInputStream dataInputStream, byte b) throws IOException {
            if (b == 0) {
                return null;
            }
            if (b == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b == 7) {
                return dataInputStream.readUTF();
            }
            int i = 0;
            if (b == 8) {
                int i2 = dataInputStream.readInt();
                ?? r0 = new Boolean[i2];
                while (i < i2) {
                    r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                    i++;
                }
                return r0;
            }
            if (b == 9) {
                int i3 = dataInputStream.readInt();
                ?? r1 = new Byte[i3];
                while (i < i3) {
                    r1[i] = Byte.valueOf(dataInputStream.readByte());
                    i++;
                }
                return r1;
            }
            if (b == 10) {
                int i4 = dataInputStream.readInt();
                ?? r2 = new Integer[i4];
                while (i < i4) {
                    r2[i] = Integer.valueOf(dataInputStream.readInt());
                    i++;
                }
                return r2;
            }
            if (b == 11) {
                int i5 = dataInputStream.readInt();
                ?? r3 = new Long[i5];
                while (i < i5) {
                    r3[i] = Long.valueOf(dataInputStream.readLong());
                    i++;
                }
                return r3;
            }
            if (b == 12) {
                int i6 = dataInputStream.readInt();
                ?? r4 = new Float[i6];
                while (i < i6) {
                    r4[i] = Float.valueOf(dataInputStream.readFloat());
                    i++;
                }
                return r4;
            }
            if (b == 13) {
                int i7 = dataInputStream.readInt();
                ?? r5 = new Double[i7];
                while (i < i7) {
                    r5[i] = Double.valueOf(dataInputStream.readDouble());
                    i++;
                }
                return r5;
            }
            if (b != 14) {
                ib5.a(hce0.a(b, "Unsupported type "));
                return null;
            }
            int i8 = dataInputStream.readInt();
            ?? r6 = new String[i8];
            while (i < i8) {
                String utf = dataInputStream.readUTF();
                if (Intrinsics.g(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    utf = null;
                }
                r6[i] = utf;
                i++;
            }
            return r6;
        }

        public static byte[] b(c cVar) {
            cVar.getClass();
            HashMap map = cVar.a;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    dataOutputStream.writeShort(-21521);
                    dataOutputStream.writeShort(1);
                    dataOutputStream.writeInt(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        c(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    dataOutputStream.close();
                    byteArray.getClass();
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ft7.a(dataOutputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                jgt.e().d(dsc.a, "Error in Data#toByteArray: ", e);
                return new byte[0];
            }
        }

        public static final void c(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            int i;
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    hoc.a(jq40.a(obj.getClass()).k(), "Unsupported value type ");
                    return;
                }
                Object[] objArr = (Object[]) obj;
                dq7 dq7VarA = jq40.a(objArr.getClass());
                if (dq7VarA.equals(jq40.a(Boolean[].class))) {
                    i = 8;
                } else if (dq7VarA.equals(jq40.a(Byte[].class))) {
                    i = 9;
                } else if (dq7VarA.equals(jq40.a(Integer[].class))) {
                    i = 10;
                } else if (dq7VarA.equals(jq40.a(Long[].class))) {
                    i = 11;
                } else if (dq7VarA.equals(jq40.a(Float[].class))) {
                    i = 12;
                } else if (dq7VarA.equals(jq40.a(Double[].class))) {
                    i = 13;
                } else {
                    if (!dq7VarA.equals(jq40.a(String[].class))) {
                        hoc.a(jq40.a(objArr.getClass()).i(), "Unsupported value type ");
                        return;
                    }
                    i = 14;
                }
                dataOutputStream.writeByte(i);
                dataOutputStream.writeInt(objArr.length);
                for (Object obj2 : objArr) {
                    if (i == 8) {
                        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                        dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                    } else if (i == 9) {
                        Byte b = obj2 instanceof Byte ? (Byte) obj2 : null;
                        dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                    } else if (i == 10) {
                        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                        dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                    } else if (i == 11) {
                        Long l = obj2 instanceof Long ? (Long) obj2 : null;
                        dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                    } else if (i == 12) {
                        Float f = obj2 instanceof Float ? (Float) obj2 : null;
                        dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                    } else if (i == 13) {
                        Double d = obj2 instanceof Double ? (Double) obj2 : null;
                        dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                    } else if (i == 14) {
                        String str2 = obj2 instanceof String ? (String) obj2 : null;
                        if (str2 == null) {
                            str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                        }
                        dataOutputStream.writeUTF(str2);
                    }
                }
            }
            dataOutputStream.writeUTF(str);
        }
    }

    /* JADX INFO: renamed from: androidx.work.c$c, reason: collision with other inner class name */
    public static final class C0077c extends qlr implements Function1<Map.Entry<? extends String, ? extends Object>, CharSequence> {
        public static final C0077c a = new C0077c(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Map.Entry<? extends String, ? extends Object> entry) {
            Map.Entry<? extends String, ? extends Object> entry2 = entry;
            entry2.getClass();
            String key = entry2.getKey();
            Object value = entry2.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(key);
            sb.append(" : ");
            if (value instanceof Object[]) {
                value = Arrays.toString((Object[]) value);
                value.getClass();
            }
            sb.append(value);
            return sb.toString();
        }
    }

    static {
        c cVar = new c(new LinkedHashMap());
        b.b(cVar);
        b = cVar;
    }

    public c(c cVar) {
        cVar.getClass();
        this.a = new HashMap(cVar.a);
    }

    public static final c a(byte[] bArr) {
        bArr.getClass();
        if (bArr.length > 10240) {
            ib5.a("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            int i = 0;
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i2 = objectInputStream.readInt();
                    while (i < i2) {
                        String utf = objectInputStream.readUTF();
                        utf.getClass();
                        linkedHashMap.put(utf, objectInputStream.readObject());
                        i++;
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ft7.a(objectInputStream, th);
                        throw th2;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s = dataInputStream.readShort();
                    if (s == -21521) {
                        short s2 = dataInputStream.readShort();
                        if (s2 != 1) {
                            q1b.a(hce0.a(s2, "Unsupported version number: "));
                        }
                    } else {
                        q1b.a(hce0.a(s, "Magic number doesn't match: "));
                    }
                    int i3 = dataInputStream.readInt();
                    while (i < i3) {
                        Serializable serializableA = b.a(dataInputStream, dataInputStream.readByte());
                        String utf2 = dataInputStream.readUTF();
                        utf2.getClass();
                        linkedHashMap.put(utf2, serializableA);
                        i++;
                    }
                    dataInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        ft7.a(dataInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (IOException e) {
            jgt.e().d(dsc.a, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            jgt.e().d(dsc.a, "Error in Data#fromByteArray: ", e2);
        }
        return new c(linkedHashMap);
    }

    public final boolean b(String str) {
        Object obj = this.a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && c.class.equals(obj.getClass())) {
                HashMap map = ((c) obj).a;
                HashMap map2 = this.a;
                Set<String> setKeySet = map2.keySet();
                if (Intrinsics.g(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = wx0.b(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return uf80.a(new StringBuilder("Data {"), CollectionsKt.a0(this.a.entrySet(), null, null, null, C0077c.a, 31), "}");
    }

    public static final class a {
        public final LinkedHashMap a = new LinkedHashMap();

        public final c a() {
            c cVar = new c(this.a);
            b.b(cVar);
            return cVar;
        }

        public final void c(HashMap map) {
            for (Map.Entry entry : map.entrySet()) {
                b(entry.getValue(), (String) entry.getKey());
            }
        }

        public final void b(Object obj, String str) {
            boolean zEquals;
            boolean zEquals2;
            boolean zEquals3;
            boolean zEquals4;
            boolean zEquals5;
            boolean zEquals6;
            boolean zEquals7;
            boolean zEquals8;
            boolean zEquals9;
            boolean zEquals10;
            boolean zEquals11;
            boolean zEquals12;
            Object[] objArr;
            str.getClass();
            if (obj == null) {
                obj = null;
            } else {
                dq7 dq7VarA = jq40.a(obj.getClass());
                boolean zEquals13 = true;
                if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                    zEquals = true;
                } else {
                    zEquals = dq7VarA.equals(jq40.a(Byte.TYPE));
                }
                if (zEquals) {
                    zEquals2 = true;
                } else {
                    zEquals2 = dq7VarA.equals(jq40.a(Integer.TYPE));
                }
                if (zEquals2) {
                    zEquals3 = true;
                } else {
                    zEquals3 = dq7VarA.equals(jq40.a(Long.TYPE));
                }
                if (zEquals3) {
                    zEquals4 = true;
                } else {
                    zEquals4 = dq7VarA.equals(jq40.a(Float.TYPE));
                }
                if (zEquals4) {
                    zEquals5 = true;
                } else {
                    zEquals5 = dq7VarA.equals(jq40.a(Double.TYPE));
                }
                if (zEquals5) {
                    zEquals6 = true;
                } else {
                    zEquals6 = dq7VarA.equals(jq40.a(String.class));
                }
                if (zEquals6) {
                    zEquals7 = true;
                } else {
                    zEquals7 = dq7VarA.equals(jq40.a(Boolean[].class));
                }
                if (zEquals7) {
                    zEquals8 = true;
                } else {
                    zEquals8 = dq7VarA.equals(jq40.a(Byte[].class));
                }
                if (zEquals8) {
                    zEquals9 = true;
                } else {
                    zEquals9 = dq7VarA.equals(jq40.a(Integer[].class));
                }
                if (zEquals9) {
                    zEquals10 = true;
                } else {
                    zEquals10 = dq7VarA.equals(jq40.a(Long[].class));
                }
                if (zEquals10) {
                    zEquals11 = true;
                } else {
                    zEquals11 = dq7VarA.equals(jq40.a(Float[].class));
                }
                if (zEquals11) {
                    zEquals12 = true;
                } else {
                    zEquals12 = dq7VarA.equals(jq40.a(Double[].class));
                }
                if (!zEquals12) {
                    zEquals13 = dq7VarA.equals(jq40.a(String[].class));
                }
                if (!zEquals13) {
                    int i = 0;
                    if (dq7VarA.equals(jq40.a(boolean[].class))) {
                        boolean[] zArr = (boolean[]) obj;
                        String str2 = dsc.a;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i < length) {
                            objArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                    } else if (dq7VarA.equals(jq40.a(byte[].class))) {
                        byte[] bArr = (byte[]) obj;
                        String str3 = dsc.a;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i < length2) {
                            objArr[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                    } else if (dq7VarA.equals(jq40.a(int[].class))) {
                        int[] iArr = (int[]) obj;
                        String str4 = dsc.a;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i < length3) {
                            objArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                    } else if (dq7VarA.equals(jq40.a(long[].class))) {
                        long[] jArr = (long[]) obj;
                        String str5 = dsc.a;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i < length4) {
                            objArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                    } else if (dq7VarA.equals(jq40.a(float[].class))) {
                        float[] fArr = (float[]) obj;
                        String str6 = dsc.a;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i < length5) {
                            objArr[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                    } else if (dq7VarA.equals(jq40.a(double[].class))) {
                        double[] dArr = (double[]) obj;
                        String str7 = dsc.a;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i < length6) {
                            objArr[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                    } else {
                        nrh0.a(str, dqvOSm.LmvMCUpMtGdHT, " has invalid type ", dq7VarA);
                        return;
                    }
                    obj = objArr;
                }
            }
            this.a.put(str, obj);
        }
    }

    public c(LinkedHashMap linkedHashMap) {
        this.a = new HashMap(linkedHashMap);
    }
}
