package androidx.work;

import a9.z2;
import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import k.h1;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20075b = r.f("Data");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f20076c = new a().a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final int f20077d = 10240;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, Object> f20078a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map<String, Object> f20079a = new HashMap();

        @NonNull
        public e a() throws Throwable {
            e eVar = new e((Map<String, ?>) this.f20079a);
            e.F(eVar);
            return eVar;
        }

        @NonNull
        @y0({y0.a.LIBRARY_GROUP})
        public a b(@NonNull String key, @Nullable Object value) {
            if (value == null) {
                this.f20079a.put(key, null);
                return this;
            }
            Class<?> cls = value.getClass();
            if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                this.f20079a.put(key, value);
                return this;
            }
            if (cls == boolean[].class) {
                this.f20079a.put(key, e.a((boolean[]) value));
                return this;
            }
            if (cls == byte[].class) {
                this.f20079a.put(key, e.b((byte[]) value));
                return this;
            }
            if (cls == int[].class) {
                this.f20079a.put(key, e.e((int[]) value));
                return this;
            }
            if (cls == long[].class) {
                this.f20079a.put(key, e.f((long[]) value));
                return this;
            }
            if (cls == float[].class) {
                this.f20079a.put(key, e.d((float[]) value));
                return this;
            }
            if (cls != double[].class) {
                throw new IllegalArgumentException(String.format("Key %s has invalid type %s", key, cls));
            }
            this.f20079a.put(key, e.c((double[]) value));
            return this;
        }

        @NonNull
        public a c(@NonNull e data) {
            d(data.f20078a);
            return this;
        }

        @NonNull
        public a d(@NonNull Map<String, Object> values) {
            for (Map.Entry<String, Object> entry : values.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @NonNull
        public a e(@NonNull String key, boolean value) {
            this.f20079a.put(key, Boolean.valueOf(value));
            return this;
        }

        @NonNull
        public a f(@NonNull String key, @NonNull boolean[] value) {
            this.f20079a.put(key, e.a(value));
            return this;
        }

        @NonNull
        public a g(@NonNull String key, byte value) {
            this.f20079a.put(key, Byte.valueOf(value));
            return this;
        }

        @NonNull
        public a h(@NonNull String key, @NonNull byte[] value) {
            this.f20079a.put(key, e.b(value));
            return this;
        }

        @NonNull
        public a i(@NonNull String key, double value) {
            this.f20079a.put(key, Double.valueOf(value));
            return this;
        }

        @NonNull
        public a j(@NonNull String key, @NonNull double[] value) {
            this.f20079a.put(key, e.c(value));
            return this;
        }

        @NonNull
        public a k(@NonNull String key, float value) {
            this.f20079a.put(key, Float.valueOf(value));
            return this;
        }

        @NonNull
        public a l(@NonNull String key, @NonNull float[] value) {
            this.f20079a.put(key, e.d(value));
            return this;
        }

        @NonNull
        public a m(@NonNull String key, int value) {
            this.f20079a.put(key, Integer.valueOf(value));
            return this;
        }

        @NonNull
        public a n(@NonNull String key, @NonNull int[] value) {
            this.f20079a.put(key, e.e(value));
            return this;
        }

        @NonNull
        public a o(@NonNull String key, long value) {
            this.f20079a.put(key, Long.valueOf(value));
            return this;
        }

        @NonNull
        public a p(@NonNull String key, @NonNull long[] value) {
            this.f20079a.put(key, e.f(value));
            return this;
        }

        @NonNull
        public a q(@NonNull String key, @Nullable String value) {
            this.f20079a.put(key, value);
            return this;
        }

        @NonNull
        public a r(@NonNull String key, @NonNull String[] value) {
            this.f20079a.put(key, value);
            return this;
        }
    }

    public e() {
    }

    @NonNull
    @z2
    @y0({y0.a.LIBRARY_GROUP})
    public static byte[] F(@NonNull e data) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(data.D());
                    for (Map.Entry<String, Object> entry : data.f20078a.entrySet()) {
                        objectOutputStream2.writeUTF(entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e10) {
                        Log.e(f20075b, "Error in Data#toByteArray: ", e10);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        Log.e(f20075b, "Error in Data#toByteArray: ", e11);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e12) {
                    e = e12;
                    objectOutputStream = objectOutputStream2;
                    Log.e(f20075b, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e13) {
                            Log.e(f20075b, "Error in Data#toByteArray: ", e13);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e14) {
                        Log.e(f20075b, "Error in Data#toByteArray: ", e14);
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e15) {
                            Log.e(f20075b, "Error in Data#toByteArray: ", e15);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e16) {
                        Log.e(f20075b, "Error in Data#toByteArray: ", e16);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e17) {
            e = e17;
        }
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public static Boolean[] a(@NonNull boolean[] value) {
        Boolean[] boolArr = new Boolean[value.length];
        for (int i10 = 0; i10 < value.length; i10++) {
            boolArr[i10] = Boolean.valueOf(value[i10]);
        }
        return boolArr;
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public static Byte[] b(@NonNull byte[] value) {
        Byte[] bArr = new Byte[value.length];
        for (int i10 = 0; i10 < value.length; i10++) {
            bArr[i10] = Byte.valueOf(value[i10]);
        }
        return bArr;
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public static Double[] c(@NonNull double[] value) {
        Double[] dArr = new Double[value.length];
        for (int i10 = 0; i10 < value.length; i10++) {
            dArr[i10] = Double.valueOf(value[i10]);
        }
        return dArr;
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public static Float[] d(@NonNull float[] value) {
        Float[] fArr = new Float[value.length];
        for (int i10 = 0; i10 < value.length; i10++) {
            fArr[i10] = Float.valueOf(value[i10]);
        }
        return fArr;
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public static Integer[] e(@NonNull int[] value) {
        Integer[] numArr = new Integer[value.length];
        for (int i10 = 0; i10 < value.length; i10++) {
            numArr[i10] = Integer.valueOf(value[i10]);
        }
        return numArr;
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public static Long[] f(@NonNull long[] value) {
        Long[] lArr = new Long[value.length];
        for (int i10 = 0; i10 < value.length; i10++) {
            lArr[i10] = Long.valueOf(value[i10]);
        }
        return lArr;
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public static byte[] g(@NonNull Byte[] array) {
        byte[] bArr = new byte[array.length];
        for (int i10 = 0; i10 < array.length; i10++) {
            bArr[i10] = array[i10].byteValue();
        }
        return bArr;
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public static double[] h(@NonNull Double[] array) {
        double[] dArr = new double[array.length];
        for (int i10 = 0; i10 < array.length; i10++) {
            dArr[i10] = array[i10].doubleValue();
        }
        return dArr;
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public static float[] i(@NonNull Float[] array) {
        float[] fArr = new float[array.length];
        for (int i10 = 0; i10 < array.length; i10++) {
            fArr[i10] = array[i10].floatValue();
        }
        return fArr;
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public static int[] j(@NonNull Integer[] array) {
        int[] iArr = new int[array.length];
        for (int i10 = 0; i10 < array.length; i10++) {
            iArr[i10] = array[i10].intValue();
        }
        return iArr;
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public static long[] k(@NonNull Long[] array) {
        long[] jArr = new long[array.length];
        for (int i10 = 0; i10 < array.length; i10++) {
            jArr[i10] = array[i10].longValue();
        }
        return jArr;
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public static boolean[] l(@NonNull Boolean[] array) {
        boolean[] zArr = new boolean[array.length];
        for (int i10 = 0; i10 < array.length; i10++) {
            zArr[i10] = array[i10].booleanValue();
        }
        return zArr;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0031 A[EXC_TOP_SPLITTER, PHI: r3
      0x0031: PHI (r3v8 java.io.ObjectInputStream) = (r3v7 java.io.ObjectInputStream), (r3v10 java.io.ObjectInputStream) binds: [B:31:0x0056, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @NonNull
    @z2
    public static e m(@NonNull byte[] bytes) throws Throwable {
        Throwable th2;
        ObjectInputStream objectInputStream;
        Throwable e10;
        if (bytes.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    try {
                        objectInputStream = new ObjectInputStream(byteArrayInputStream);
                        try {
                            for (int i10 = objectInputStream.readInt(); i10 > 0; i10--) {
                                map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            }
                        } catch (IOException e11) {
                            e10 = e11;
                            Log.e(f20075b, "Error in Data#fromByteArray: ", e10);
                            if (objectInputStream != null) {
                            }
                            byteArrayInputStream.close();
                            return new e(map);
                        } catch (ClassNotFoundException e12) {
                            e10 = e12;
                            Log.e(f20075b, "Error in Data#fromByteArray: ", e10);
                            if (objectInputStream != null) {
                            }
                            byteArrayInputStream.close();
                            return new e(map);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        if (0 != 0) {
                            try {
                                objectInputStream2.close();
                            } catch (IOException e13) {
                                Log.e(f20075b, "Error in Data#fromByteArray: ", e13);
                            }
                        }
                        try {
                            byteArrayInputStream.close();
                            throw th2;
                        } catch (IOException e14) {
                            Log.e(f20075b, "Error in Data#fromByteArray: ", e14);
                            throw th2;
                        }
                    }
                } catch (IOException e15) {
                    e = e15;
                    Throwable th4 = e;
                    objectInputStream = null;
                    e10 = th4;
                    Log.e(f20075b, "Error in Data#fromByteArray: ", e10);
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    byteArrayInputStream.close();
                    return new e(map);
                } catch (ClassNotFoundException e16) {
                    e = e16;
                    Throwable th5 = e;
                    objectInputStream = null;
                    e10 = th5;
                    Log.e(f20075b, "Error in Data#fromByteArray: ", e10);
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    byteArrayInputStream.close();
                    return new e(map);
                } catch (Throwable th6) {
                    th2 = th6;
                    if (0 != 0) {
                        objectInputStream2.close();
                    }
                    byteArrayInputStream.close();
                    throw th2;
                }
                byteArrayInputStream.close();
            } catch (IOException e17) {
                Log.e(f20075b, "Error in Data#fromByteArray: ", e17);
            }
            objectInputStream.close();
        } catch (IOException e18) {
            Log.e(f20075b, "Error in Data#fromByteArray: ", e18);
        }
        return new e(map);
    }

    @Nullable
    public String A(@NonNull String key) {
        Object obj = this.f20078a.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Nullable
    public String[] B(@NonNull String key) {
        Object obj = this.f20078a.get(key);
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return null;
    }

    public <T> boolean C(@NonNull String key, @NonNull Class<T> klass) {
        Object obj = this.f20078a.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    @h1
    @y0({y0.a.LIBRARY_GROUP})
    public int D() {
        return this.f20078a.size();
    }

    @NonNull
    public byte[] E() {
        return F(this);
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 == null || e.class != o10.getClass()) {
            return false;
        }
        e eVar = (e) o10;
        Set<String> setKeySet = this.f20078a.keySet();
        if (!setKeySet.equals(eVar.f20078a.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj = this.f20078a.get(str);
            Object obj2 = eVar.f20078a.get(str);
            if (!((obj == null || obj2 == null) ? obj == obj2 : ((obj instanceof Object[]) && (obj2 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj, (Object[]) obj2) : obj.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f20078a.hashCode() * 31;
    }

    public boolean n(@NonNull String key, boolean defaultValue) {
        Object obj = this.f20078a.get(key);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : defaultValue;
    }

    @Nullable
    public boolean[] o(@NonNull String key) {
        Object obj = this.f20078a.get(key);
        if (obj instanceof Boolean[]) {
            return l((Boolean[]) obj);
        }
        return null;
    }

    public byte p(@NonNull String key, byte defaultValue) {
        Object obj = this.f20078a.get(key);
        return obj instanceof Byte ? ((Byte) obj).byteValue() : defaultValue;
    }

    @Nullable
    public byte[] q(@NonNull String key) {
        Object obj = this.f20078a.get(key);
        if (obj instanceof Byte[]) {
            return g((Byte[]) obj);
        }
        return null;
    }

    public double r(@NonNull String key, double defaultValue) {
        Object obj = this.f20078a.get(key);
        return obj instanceof Double ? ((Double) obj).doubleValue() : defaultValue;
    }

    @Nullable
    public double[] s(@NonNull String key) {
        Object obj = this.f20078a.get(key);
        if (obj instanceof Double[]) {
            return h((Double[]) obj);
        }
        return null;
    }

    public float t(@NonNull String key, float defaultValue) {
        Object obj = this.f20078a.get(key);
        return obj instanceof Float ? ((Float) obj).floatValue() : defaultValue;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.f20078a.isEmpty()) {
            for (String str : this.f20078a.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.f20078a.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Nullable
    public float[] u(@NonNull String key) {
        Object obj = this.f20078a.get(key);
        if (obj instanceof Float[]) {
            return i((Float[]) obj);
        }
        return null;
    }

    public int v(@NonNull String key, int defaultValue) {
        Object obj = this.f20078a.get(key);
        return obj instanceof Integer ? ((Integer) obj).intValue() : defaultValue;
    }

    @Nullable
    public int[] w(@NonNull String key) {
        Object obj = this.f20078a.get(key);
        if (obj instanceof Integer[]) {
            return j((Integer[]) obj);
        }
        return null;
    }

    @NonNull
    public Map<String, Object> x() {
        return Collections.unmodifiableMap(this.f20078a);
    }

    public long y(@NonNull String key, long defaultValue) {
        Object obj = this.f20078a.get(key);
        return obj instanceof Long ? ((Long) obj).longValue() : defaultValue;
    }

    @Nullable
    public long[] z(@NonNull String key) {
        Object obj = this.f20078a.get(key);
        if (obj instanceof Long[]) {
            return k((Long[]) obj);
        }
        return null;
    }

    public e(@NonNull e other) {
        this.f20078a = new HashMap(other.f20078a);
    }

    @y0({y0.a.LIBRARY_GROUP})
    public e(@NonNull Map<String, ?> values) {
        this.f20078a = new HashMap(values);
    }
}
