package com.fyber.inneractive.sdk.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class v3 extends w3 {
    public v3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a() {
        if (!super.a()) {
            return false;
        }
        try {
            Class<?> cls = this.f47611a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            x3.a(th2);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c A[PHI: r4
      0x003c: PHI (r4v9 java.lang.reflect.Field) = (r4v5 java.lang.reflect.Field), (r4v12 java.lang.reflect.Field) binds: [B:22:0x004f, B:12:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean b() {
        Field declaredField;
        Class<?> cls = Long.TYPE;
        Unsafe unsafe = this.f47611a;
        if (unsafe != null) {
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                Field field = null;
                if (d.a()) {
                    try {
                        declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    } catch (Throwable unused) {
                        declaredField = null;
                    }
                    if (declaredField != null) {
                        field = declaredField;
                    } else {
                        try {
                            declaredField = Buffer.class.getDeclaredField("address");
                        } catch (Throwable unused2) {
                            declaredField = null;
                        }
                        if (declaredField != null && declaredField.getType() == cls) {
                            field = declaredField;
                        }
                    }
                } else {
                    declaredField = Buffer.class.getDeclaredField("address");
                    if (declaredField != null) {
                        field = declaredField;
                    }
                }
                if (field != null) {
                    try {
                        Class<?> cls3 = this.f47611a.getClass();
                        cls3.getMethod("getByte", cls);
                        cls3.getMethod("putByte", cls, Byte.TYPE);
                        cls3.getMethod("getInt", cls);
                        cls3.getMethod("putInt", cls, Integer.TYPE);
                        cls3.getMethod("getLong", cls);
                        cls3.getMethod("putLong", cls, cls);
                        cls3.getMethod("copyMemory", cls, cls, cls);
                        cls3.getMethod("copyMemory", Object.class, cls, Object.class, cls, cls);
                        return true;
                    } catch (Throwable th2) {
                        x3.a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                x3.a(th3);
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final double c(Object obj, long j10) {
        return this.f47611a.getDouble(obj, j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final float d(Object obj, long j10) {
        return this.f47611a.getFloat(obj, j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, byte b10) {
        this.f47611a.putByte(obj, j10, b10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a(Object obj, long j10) {
        return this.f47611a.getBoolean(obj, j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, boolean z10) {
        this.f47611a.putBoolean(obj, j10, z10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, float f10) {
        this.f47611a.putFloat(obj, j10, f10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, double d10) {
        this.f47611a.putDouble(obj, j10, d10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte a(long j10) {
        return this.f47611a.getByte(j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(long j10, byte[] bArr, long j11) {
        this.f47611a.copyMemory((Object) null, j10, bArr, x3.f47628f, j11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte b(Object obj, long j10) {
        return this.f47611a.getByte(obj, j10);
    }
}
