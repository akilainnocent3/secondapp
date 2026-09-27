package androidx.media3.exoplayer;

import android.media.MediaFormat;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import k.t0;
import k.y0;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f13730b = new C0104b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f13731a;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0104b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, Object> f13732a;

        public b a() {
            return new b(this.f13732a);
        }

        @qj.a
        public C0104b b(String str) {
            this.f13732a.remove(str);
            return this;
        }

        @qj.a
        public C0104b c(String str, @Nullable ByteBuffer byteBuffer) {
            if (byteBuffer == null) {
                this.f13732a.put(str, null);
                return this;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            byteBufferAllocate.put(byteBuffer.duplicate());
            byteBufferAllocate.flip();
            this.f13732a.put(str, byteBufferAllocate);
            return this;
        }

        @qj.a
        public C0104b d(String str, float f10) {
            this.f13732a.put(str, Float.valueOf(f10));
            return this;
        }

        @qj.a
        public C0104b e(String str, int i10) {
            this.f13732a.put(str, Integer.valueOf(i10));
            return this;
        }

        @qj.a
        public C0104b f(String str, long j10) {
            this.f13732a.put(str, Long.valueOf(j10));
            return this;
        }

        @qj.a
        public C0104b g(String str, @Nullable String str2) {
            this.f13732a.put(str, str2);
            return this;
        }

        public C0104b() {
            this.f13732a = new HashMap();
        }

        public C0104b(b bVar) {
            this.f13732a = new HashMap(bVar.f13731a);
        }
    }

    @t0(29)
    @y0({y0.a.LIBRARY_GROUP})
    public static C0104b d(MediaFormat mediaFormat, Set<String> set) {
        C0104b c0104b = new C0104b();
        for (String str : set) {
            if (mediaFormat.containsKey(str)) {
                int valueTypeForKey = mediaFormat.getValueTypeForKey(str);
                if (valueTypeForKey == 1) {
                    c0104b.e(str, mediaFormat.getInteger(str));
                } else if (valueTypeForKey == 2) {
                    c0104b.f(str, mediaFormat.getLong(str));
                } else if (valueTypeForKey == 3) {
                    c0104b.d(str, mediaFormat.getFloat(str));
                } else if (valueTypeForKey == 4) {
                    c0104b.g(str, mediaFormat.getString(str));
                } else if (valueTypeForKey == 5) {
                    c0104b.c(str, mediaFormat.getByteBuffer(str));
                }
            }
        }
        return c0104b;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public void b(MediaFormat mediaFormat) {
        for (Map.Entry<String, Object> entry : this.f13731a.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                mediaFormat.setString(key, null);
            } else if (value instanceof Integer) {
                mediaFormat.setInteger(key, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                mediaFormat.setLong(key, ((Long) value).longValue());
            } else if (value instanceof Float) {
                mediaFormat.setFloat(key, ((Float) value).floatValue());
            } else if (value instanceof String) {
                mediaFormat.setString(key, (String) value);
            } else if (value instanceof ByteBuffer) {
                mediaFormat.setByteBuffer(key, (ByteBuffer) value);
            }
        }
    }

    public C0104b c() {
        return new C0104b();
    }

    @Nullable
    public Object e(String str) {
        return this.f13731a.get(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f13731a.equals(((b) obj).f13731a);
        }
        return false;
    }

    public Set<String> f() {
        return this.f13731a.keySet();
    }

    @y0({y0.a.LIBRARY_GROUP})
    public Bundle g() {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : this.f13731a.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (value instanceof Integer) {
                    bundle.putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    bundle.putLong(key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    bundle.putFloat(key, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    bundle.putString(key, (String) value);
                } else if (value instanceof ByteBuffer) {
                    ByteBuffer byteBuffer = (ByteBuffer) value;
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.duplicate().get(bArr);
                    bundle.putByteArray(key, bArr);
                }
            }
        }
        return bundle;
    }

    public int hashCode() {
        return this.f13731a.hashCode();
    }

    public b(Map<String, Object> map) {
        this.f13731a = Collections.unmodifiableMap(map);
    }
}
