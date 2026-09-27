package w9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY})
public class g extends e {
    public static final Charset C = Charset.forName("UTF-16");
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;
    public static final int J = 6;
    public static final int K = 7;
    public static final int L = 8;
    public static final int M = 9;
    public static final int N = 10;
    public static final int O = 11;
    public static final int P = 12;
    public static final int Q = 13;
    public static final int R = 14;
    public int A;
    public int B;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DataInputStream f142541t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DataOutputStream f142542u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public DataInputStream f142543v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public DataOutputStream f142544w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f142545x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f142546y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f142547z;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteArrayOutputStream f142549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DataOutputStream f142550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f142551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DataOutputStream f142552d;

        public b(int i10, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f142549a = byteArrayOutputStream;
            this.f142550b = new DataOutputStream(byteArrayOutputStream);
            this.f142551c = i10;
            this.f142552d = dataOutputStream;
        }

        public void a() throws IOException {
            this.f142550b.flush();
            int size = this.f142549a.size();
            this.f142552d.writeInt((this.f142551c << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.f142552d.writeInt(size);
            }
            this.f142549a.writeTo(this.f142552d);
        }
    }

    public g(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new f0.a(), new f0.a(), new f0.a());
    }

    @Override // w9.e
    public void C0(double d10) {
        try {
            this.f142544w.writeDouble(d10);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // w9.e
    public boolean F(int i10) {
        while (true) {
            try {
                int i11 = this.A;
                if (i11 == i10) {
                    return true;
                }
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                    return false;
                }
                int i12 = this.f142547z;
                int i13 = this.B;
                if (i12 < i13) {
                    this.f142541t.skip(i13 - i12);
                }
                this.B = -1;
                int i14 = this.f142541t.readInt();
                this.f142547z = 0;
                int i15 = i14 & 65535;
                if (i15 == 65535) {
                    i15 = this.f142541t.readInt();
                }
                this.A = (i14 >> 16) & 65535;
                this.B = i15;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // w9.e
    public float G() {
        try {
            return this.f142543v.readFloat();
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // w9.e
    public void H0(float f10) {
        try {
            this.f142544w.writeFloat(f10);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // w9.e
    public int L() {
        try {
            return this.f142543v.readInt();
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // w9.e
    public void L0(int i10) {
        try {
            this.f142544w.writeInt(i10);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // w9.e
    public long Q() {
        try {
            return this.f142543v.readLong();
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // w9.e
    public void Q0(long j10) {
        try {
            this.f142544w.writeLong(j10);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // w9.e
    public <T extends Parcelable> T V() {
        return null;
    }

    @Override // w9.e
    public void W0(Parcelable parcelable) {
        if (!this.f142546y) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // w9.e
    public void a() {
        b bVar = this.f142545x;
        if (bVar != null) {
            try {
                if (bVar.f142549a.size() != 0) {
                    this.f142545x.a();
                }
                this.f142545x = null;
            } catch (IOException e10) {
                throw new e.b(e10);
            }
        }
    }

    @Override // w9.e
    public e c() {
        return new g(this.f142543v, this.f142544w, this.f142530a, this.f142531b, this.f142532c);
    }

    @Override // w9.e
    public String c0() {
        try {
            int i10 = this.f142543v.readInt();
            if (i10 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i10];
            this.f142543v.readFully(bArr);
            return new String(bArr, C);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // w9.e
    public IBinder e0() {
        return null;
    }

    @Override // w9.e
    public void e1(String str) {
        try {
            if (str == null) {
                this.f142544w.writeInt(-1);
                return;
            }
            byte[] bytes = str.getBytes(C);
            this.f142544w.writeInt(bytes.length);
            this.f142544w.write(bytes);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // w9.e
    public void g1(IBinder iBinder) {
        if (!this.f142546y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // w9.e
    public boolean i() {
        return true;
    }

    @Override // w9.e
    public void i0(int i10) {
        a();
        b bVar = new b(i10, this.f142542u);
        this.f142545x = bVar;
        this.f142544w = bVar.f142550b;
    }

    @Override // w9.e
    public void i1(IInterface iInterface) {
        if (!this.f142546y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // w9.e
    public void j0(boolean z10, boolean z11) {
        if (!z10) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f142546y = z11;
    }

    @Override // w9.e
    public boolean l() {
        try {
            return this.f142543v.readBoolean();
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // w9.e
    public void m0(boolean z10) {
        try {
            this.f142544w.writeBoolean(z10);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    public final void o1(int i10, String str, Bundle bundle) {
        switch (i10) {
            case 0:
                bundle.putParcelable(str, null);
                return;
            case 1:
                bundle.putBundle(str, p());
                return;
            case 2:
                bundle.putBundle(str, p());
                return;
            case 3:
                bundle.putString(str, c0());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) j(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, l());
                return;
            case 6:
                bundle.putBooleanArray(str, n());
                return;
            case 7:
                bundle.putDouble(str, y());
                return;
            case 8:
                bundle.putDoubleArray(str, A());
                return;
            case 9:
                bundle.putInt(str, L());
                return;
            case 10:
                bundle.putIntArray(str, N());
                return;
            case 11:
                bundle.putLong(str, Q());
                return;
            case 12:
                bundle.putLongArray(str, S());
                return;
            case 13:
                bundle.putFloat(str, G());
                return;
            case 14:
                bundle.putFloatArray(str, I());
                return;
            default:
                throw new RuntimeException("Unknown type " + i10);
        }
    }

    @Override // w9.e
    public Bundle p() {
        int iL = L();
        if (iL < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i10 = 0; i10 < iL; i10++) {
            o1(L(), c0(), bundle);
        }
        return bundle;
    }

    public final void p1(Object obj) {
        if (obj == null) {
            L0(0);
            return;
        }
        if (obj instanceof Bundle) {
            L0(1);
            q0((Bundle) obj);
            return;
        }
        if (obj instanceof String) {
            L0(3);
            e1((String) obj);
            return;
        }
        if (obj instanceof String[]) {
            L0(4);
            k0((String[]) obj);
            return;
        }
        if (obj instanceof Boolean) {
            L0(5);
            m0(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof boolean[]) {
            L0(6);
            o0((boolean[]) obj);
            return;
        }
        if (obj instanceof Double) {
            L0(7);
            C0(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof double[]) {
            L0(8);
            E0((double[]) obj);
            return;
        }
        if (obj instanceof Integer) {
            L0(9);
            L0(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof int[]) {
            L0(10);
            N0((int[]) obj);
            return;
        }
        if (obj instanceof Long) {
            L0(11);
            Q0(((Long) obj).longValue());
            return;
        }
        if (obj instanceof long[]) {
            L0(12);
            S0((long[]) obj);
            return;
        }
        if (obj instanceof Float) {
            L0(13);
            H0(((Float) obj).floatValue());
        } else if (obj instanceof float[]) {
            L0(14);
            J0((float[]) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @Override // w9.e
    public void q0(Bundle bundle) {
        try {
            if (bundle == null) {
                this.f142544w.writeInt(-1);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            this.f142544w.writeInt(setKeySet.size());
            for (String str : setKeySet) {
                e1(str);
                p1(bundle.get(str));
            }
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // w9.e
    public byte[] s() {
        try {
            int i10 = this.f142543v.readInt();
            if (i10 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i10];
            this.f142543v.readFully(bArr);
            return bArr;
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // w9.e
    public void t0(byte[] bArr) {
        try {
            if (bArr == null) {
                this.f142544w.writeInt(-1);
            } else {
                this.f142544w.writeInt(bArr.length);
                this.f142544w.write(bArr);
            }
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // w9.e
    public CharSequence v() {
        return null;
    }

    @Override // w9.e
    public void v0(byte[] bArr, int i10, int i11) {
        try {
            if (bArr == null) {
                this.f142544w.writeInt(-1);
            } else {
                this.f142544w.writeInt(i11);
                this.f142544w.write(bArr, i10, i11);
            }
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // w9.e
    public double y() {
        try {
            return this.f142543v.readDouble();
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    @Override // w9.e
    public void y0(CharSequence charSequence) {
        if (!this.f142546y) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    public g(InputStream inputStream, OutputStream outputStream, f0.a<String, Method> aVar, f0.a<String, Method> aVar2, f0.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f142547z = 0;
        this.A = -1;
        this.B = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new a(inputStream)) : null;
        this.f142541t = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f142542u = dataOutputStream;
        this.f142543v = dataInputStream;
        this.f142544w = dataOutputStream;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends FilterInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            g gVar = g.this;
            int i10 = gVar.B;
            if (i10 != -1 && gVar.f142547z >= i10) {
                throw new IOException();
            }
            int i11 = super.read();
            g.this.f142547z++;
            return i11;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j10) throws IOException {
            g gVar = g.this;
            int i10 = gVar.B;
            if (i10 != -1 && gVar.f142547z >= i10) {
                throw new IOException();
            }
            long jSkip = super.skip(j10);
            if (jSkip > 0) {
                g.this.f142547z += (int) jSkip;
            }
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            g gVar = g.this;
            int i12 = gVar.B;
            if (i12 != -1 && gVar.f142547z >= i12) {
                throw new IOException();
            }
            int i13 = super.read(bArr, i10, i11);
            if (i13 > 0) {
                g.this.f142547z += i13;
            }
            return i13;
        }
    }
}
