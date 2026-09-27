package com.tiktok.appevents;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class k0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends ObjectInputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f76099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f76100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f76101d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List f76102e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InputStream x10, final long val$safeClasses, final List val$maxObjects) {
            super(x10);
            this.f76101d = val$safeClasses;
            this.f76102e = val$maxObjects;
            this.f76099b = 0;
            this.f76100c = enableResolveObject(true);
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass osc) throws ClassNotFoundException, IOException {
            Class<?> clsResolveClass = super.resolveClass(osc);
            if (clsResolveClass.isArray() || clsResolveClass.equals(String.class) || Number.class.isAssignableFrom(clsResolveClass) || this.f76102e.contains(clsResolveClass)) {
                return clsResolveClass;
            }
            throw new SecurityException("deserialize unauthorized " + clsResolveClass);
        }

        @Override // java.io.ObjectInputStream
        public Object resolveObject(Object obj) throws IOException {
            int i10 = this.f76099b;
            this.f76099b = i10 + 1;
            if (i10 <= this.f76101d) {
                return super.resolveObject(obj);
            }
            throw new SecurityException("too many objects from stream. Limit is " + this.f76101d);
        }
    }

    public static <T> T a(List<Class<?>> list, long j10, long j11, InputStream inputStream) throws IOException, ClassNotFoundException {
        a aVar = new a(inputStream, j11);
        b bVar = new b(aVar, j10, list);
        T t10 = (T) bVar.readObject();
        try {
            inputStream.close();
            aVar.close();
            bVar.close();
            return t10;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return t10;
        }
    }

    public static y b(InputStream in2) throws IOException, ClassNotFoundException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y.class);
        arrayList.add(ArrayList.class);
        arrayList.add(c.class);
        arrayList.add(Enum.class);
        arrayList.add(String.class);
        arrayList.add(Date.class);
        arrayList.add(Long.class);
        arrayList.add(m0.class);
        arrayList.add(c.a.class);
        return (y) a(arrayList, Long.MAX_VALUE, Long.MAX_VALUE, in2);
    }

    public static c0.a c(InputStream in2) throws IOException, ClassNotFoundException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0.a.class);
        arrayList.add(c0.a.C0730a.class);
        arrayList.add(String.class);
        arrayList.add(Long.class);
        arrayList.add(Integer.class);
        arrayList.add(ArrayList.class);
        return (c0.a) a(arrayList, Long.MAX_VALUE, Long.MAX_VALUE, in2);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends FilterInputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f76097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f76098c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputStream x10, final long val$maxBytes) {
            super(x10);
            this.f76098c = val$maxBytes;
            this.f76097b = 0L;
        }

        public final void d() {
            if (this.f76097b <= this.f76098c) {
                return;
            }
            throw new SecurityException("too many bytes from stream. Limit is " + this.f76098c);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i10 = super.read();
            if (i10 != -1) {
                this.f76097b++;
                d();
            }
            return i10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] b10, int off, int readLength) throws IOException {
            int i10 = super.read(b10, off, readLength);
            if (i10 > 0) {
                this.f76097b += (long) i10;
                d();
            }
            return i10;
        }
    }
}
