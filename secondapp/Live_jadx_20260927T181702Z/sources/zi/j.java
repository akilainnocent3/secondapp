package zi;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.c
@yi.d
@k
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Double f161745a = Double.valueOf(0.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Float f161746b = Float.valueOf(0.0f);

    @zq.a
    public static <T> T a(Class<T> cls) {
        l0.E(cls);
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls == Boolean.TYPE) {
            return (T) Boolean.FALSE;
        }
        if (cls == Character.TYPE) {
            return (T) (char) 0;
        }
        if (cls == Byte.TYPE) {
            return (T) (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (T) (short) 0;
        }
        if (cls == Integer.TYPE) {
            return (T) 0;
        }
        if (cls == Long.TYPE) {
            return (T) 0L;
        }
        if (cls == Float.TYPE) {
            return (T) f161746b;
        }
        if (cls == Double.TYPE) {
            return (T) f161745a;
        }
        return null;
    }
}
