package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.patron.KYCBannerItem;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class qjv {
    public static final qjv B;
    public final pcn<String> A;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final byte[] f;
    public final Integer g;
    public final Integer h;
    public final Integer i;

    @Deprecated
    public final Integer j;
    public final Boolean k;

    @Deprecated
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final CharSequence s;
    public final CharSequence t;
    public final CharSequence u;
    public final Integer v;
    public final Integer w;
    public final CharSequence x;
    public final CharSequence y;
    public final Integer z;

    public static final class a {
        public CharSequence a;
        public CharSequence b;
        public CharSequence c;
        public CharSequence d;
        public CharSequence e;
        public byte[] f;
        public Integer g;
        public Integer h;
        public Integer i;
        public Integer j;
        public Boolean k;
        public Integer l;
        public Integer m;
        public Integer n;
        public Integer o;
        public Integer p;
        public Integer q;
        public CharSequence r;
        public CharSequence s;
        public CharSequence t;
        public Integer u;
        public Integer v;
        public CharSequence w;
        public CharSequence x;
        public Integer y;
        public pcn<String> z;

        public final void a(int i, byte[] bArr) {
            if (this.f == null || i == 3 || !Objects.equals(this.g, 3)) {
                this.f = (byte[]) bArr.clone();
                this.g = Integer.valueOf(i);
            }
        }
    }

    static {
        a aVar = new a();
        pcn.b bVar = pcn.b;
        aVar.z = c150.e;
        B = new qjv(aVar);
        jf.a(0, 1, 2, 3, 4);
        jf.a(5, 6, 8, 9, 10);
        jf.a(11, 12, 13, 14, 15);
        jf.a(16, 17, 18, 19, 20);
        jf.a(21, 22, 23, 24, 25);
        jf.a(26, 27, 28, 29, 30);
        jf.a(31, 32, 33, 34, 1000);
    }

    public qjv(a aVar) {
        Boolean boolValueOf = aVar.k;
        Integer numValueOf = aVar.j;
        Integer numValueOf2 = aVar.y;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        case 32:
                        case 33:
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        case 35:
                            break;
                        case 20:
                        case RuntimeVersion.MINOR /* 26 */:
                        case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                            i = 6;
                            break;
                    }
                    i3 = i;
                }
                numValueOf = Integer.valueOf(i3);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = numValueOf;
        this.k = boolValueOf;
        Integer num = aVar.l;
        this.l = num;
        this.m = num;
        this.n = aVar.m;
        this.o = aVar.n;
        this.p = aVar.o;
        this.q = aVar.p;
        this.r = aVar.q;
        this.s = aVar.r;
        this.t = aVar.s;
        this.u = aVar.t;
        this.v = aVar.u;
        this.w = aVar.v;
        this.x = aVar.w;
        this.y = aVar.x;
        this.z = numValueOf2;
        this.A = aVar.z;
    }

    public final a a() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        aVar.i = this.i;
        aVar.j = this.j;
        aVar.k = this.k;
        aVar.l = this.m;
        aVar.m = this.n;
        aVar.n = this.o;
        aVar.o = this.p;
        aVar.p = this.q;
        aVar.q = this.r;
        aVar.r = this.s;
        aVar.s = this.t;
        aVar.t = this.u;
        aVar.u = this.v;
        aVar.v = this.w;
        aVar.w = this.x;
        aVar.x = this.y;
        aVar.y = this.z;
        aVar.z = this.A;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qjv.class != obj.getClass()) {
            return false;
        }
        qjv qjvVar = (qjv) obj;
        return Objects.equals(this.a, qjvVar.a) && Objects.equals(this.b, qjvVar.b) && Objects.equals(this.c, qjvVar.c) && Objects.equals(this.d, qjvVar.d) && Objects.equals(this.e, qjvVar.e) && Arrays.equals(this.f, qjvVar.f) && Objects.equals(this.g, qjvVar.g) && Objects.equals(this.h, qjvVar.h) && Objects.equals(this.i, qjvVar.i) && Objects.equals(this.j, qjvVar.j) && Objects.equals(this.k, qjvVar.k) && Objects.equals(this.m, qjvVar.m) && Objects.equals(this.n, qjvVar.n) && Objects.equals(this.o, qjvVar.o) && Objects.equals(this.p, qjvVar.p) && Objects.equals(this.q, qjvVar.q) && Objects.equals(this.r, qjvVar.r) && Objects.equals(this.s, qjvVar.s) && Objects.equals(this.t, qjvVar.t) && Objects.equals(this.u, qjvVar.u) && Objects.equals(this.v, qjvVar.v) && Objects.equals(this.w, qjvVar.w) && Objects.equals(this.x, qjvVar.x) && Objects.equals(this.y, qjvVar.y) && Objects.equals(this.z, qjvVar.z) && Objects.equals(this.A, qjvVar.A);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, null, null, this.e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.g, null, this.h, this.i, this.j, this.k, null, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, null, this.y, this.z, true, this.A);
    }
}
