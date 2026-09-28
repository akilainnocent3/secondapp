package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.recyclerview.widget.r;
import androidx.window.layout.oKr.TEFcJcMqR;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.patron.KYCBannerItem;
import com.twilio.voice.AudioFormat;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes.dex */
public final class idv implements k4h {
    public static final byte[] f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] g0;
    public static final byte[] h0;
    public static final byte[] i0;
    public static final UUID j0;
    public static final Map<String, Integer> k0;
    public long A;
    public boolean B;
    public long C;
    public long D;
    public long E;
    public jjt F;
    public jjt G;
    public boolean H;
    public boolean I;
    public int J;
    public long K;
    public long L;
    public int M;
    public int N;
    public int[] O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public long U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public boolean Z;
    public final acd a;
    public boolean a0;
    public final nvh0 b;
    public int b0;
    public final SparseArray<b> c;
    public byte c0;
    public final boolean d;
    public boolean d0;
    public final boolean e;
    public m4h e0;
    public final ree0.a f;
    public final nsz g;
    public final nsz h;
    public final nsz i;
    public final nsz j;
    public final nsz k;
    public final nsz l;
    public final nsz m;
    public final nsz n;
    public final nsz o;
    public final nsz p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public b x;
    public boolean y;
    public int z;

    public final class a {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:130:0x0297  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(int i, int i2, l4h l4hVar) throws ssz {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            long j;
            int i9;
            int i10;
            int[] iArr;
            int i11;
            int i12;
            int i13;
            idv idvVar = idv.this;
            nvh0 nvh0Var = idvVar.b;
            SparseArray<b> sparseArray = idvVar.c;
            nsz nszVar = idvVar.k;
            nsz nszVar2 = idvVar.i;
            int i14 = 1;
            int i15 = 0;
            if (i != 161 && i != 163) {
                if (i == 165) {
                    if (idvVar.J != 2) {
                        return;
                    }
                    b bVar = sparseArray.get(idvVar.P);
                    int i16 = idvVar.S;
                    nsz nszVar3 = idvVar.p;
                    if (i16 != 4 || !"V_VP9".equals(bVar.c)) {
                        l4hVar.l(i2);
                        return;
                    } else {
                        nszVar3.F(i2);
                        l4hVar.readFully(nszVar3.a, 0, i2);
                        return;
                    }
                }
                if (i == 16877) {
                    idvVar.f(i);
                    b bVar2 = idvVar.x;
                    int i17 = bVar2.h;
                    if (i17 != 1685485123 && i17 != 1685480259) {
                        l4hVar.l(i2);
                        return;
                    }
                    byte[] bArr = new byte[i2];
                    bVar2.P = bArr;
                    l4hVar.readFully(bArr, 0, i2);
                    return;
                }
                if (i == 16981) {
                    idvVar.f(i);
                    byte[] bArr2 = new byte[i2];
                    idvVar.x.j = bArr2;
                    l4hVar.readFully(bArr2, 0, i2);
                    return;
                }
                if (i == 18402) {
                    byte[] bArr3 = new byte[i2];
                    l4hVar.readFully(bArr3, 0, i2);
                    idvVar.f(i);
                    idvVar.x.k = new njg0.a(1, 0, 0, bArr3);
                    return;
                }
                if (i == 21419) {
                    Arrays.fill(nszVar.a, (byte) 0);
                    l4hVar.readFully(nszVar.a, 4 - i2, i2);
                    nszVar.I(0);
                    idvVar.z = (int) nszVar.y();
                    return;
                }
                if (i == 25506) {
                    idvVar.f(i);
                    byte[] bArr4 = new byte[i2];
                    idvVar.x.l = bArr4;
                    l4hVar.readFully(bArr4, 0, i2);
                    return;
                }
                if (i != 30322) {
                    throw ssz.a(null, "Unexpected id: " + i);
                }
                idvVar.f(i);
                byte[] bArr5 = new byte[i2];
                idvVar.x.x = bArr5;
                l4hVar.readFully(bArr5, 0, i2);
                return;
            }
            int i18 = 8;
            if (idvVar.J == 0) {
                idvVar.P = (int) nvh0Var.b(l4hVar, false, true, 8);
                idvVar.Q = nvh0Var.c;
                idvVar.L = -9223372036854775807L;
                idvVar.J = 1;
                nszVar2.F(0);
            }
            b bVar3 = sparseArray.get(idvVar.P);
            if (bVar3 == null) {
                l4hVar.l(i2 - idvVar.Q);
                idvVar.J = 0;
                return;
            }
            bVar3.Z.getClass();
            if (idvVar.J == 1) {
                idvVar.j(l4hVar, 3);
                int i19 = (nszVar2.a[2] & 6) >> 1;
                if (i19 == 0) {
                    idvVar.N = 1;
                    int[] iArr2 = idvVar.O;
                    if (iArr2 == null) {
                        iArr2 = new int[1];
                    } else if (iArr2.length < 1) {
                        iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                    }
                    idvVar.O = iArr2;
                    iArr2[0] = (i2 - idvVar.Q) - 3;
                } else {
                    idvVar.j(l4hVar, 4);
                    int i20 = (nszVar2.a[3] & 255) + 1;
                    idvVar.N = i20;
                    int[] iArr3 = idvVar.O;
                    if (iArr3 == null) {
                        iArr3 = new int[i20];
                        i4 = 4;
                    } else {
                        i4 = 4;
                        if (iArr3.length < i20) {
                            iArr3 = new int[Math.max(iArr3.length * 2, i20)];
                        }
                    }
                    idvVar.O = iArr3;
                    if (i19 == 2) {
                        int i21 = (i2 - idvVar.Q) - 4;
                        int i22 = idvVar.N;
                        Arrays.fill(iArr3, 0, i22, i21 / i22);
                    } else {
                        if (i19 == 1) {
                            int i23 = 0;
                            int i24 = 0;
                            int i25 = i4;
                            while (true) {
                                i10 = idvVar.N - 1;
                                iArr = idvVar.O;
                                if (i23 >= i10) {
                                    break;
                                }
                                iArr[i23] = 0;
                                while (true) {
                                    i11 = i25 + 1;
                                    idvVar.j(l4hVar, i11);
                                    int i26 = nszVar2.a[i25] & 255;
                                    int[] iArr4 = idvVar.O;
                                    i12 = iArr4[i23] + i26;
                                    iArr4[i23] = i12;
                                    if (i26 != 255) {
                                        break;
                                    } else {
                                        i25 = i11;
                                    }
                                }
                                i24 += i12;
                                i23++;
                                i25 = i11;
                            }
                            iArr[i10] = ((i2 - idvVar.Q) - i25) - i24;
                        } else {
                            if (i19 != 3) {
                                throw ssz.a(null, "Unexpected lacing value: " + i19);
                            }
                            int i27 = 0;
                            int i28 = 0;
                            int i29 = i4;
                            while (true) {
                                int i30 = idvVar.N - i14;
                                int[] iArr5 = idvVar.O;
                                if (i27 >= i30) {
                                    i3 = i14;
                                    i5 = i15;
                                    iArr5[i30] = ((i2 - idvVar.Q) - i29) - i28;
                                    break;
                                }
                                iArr5[i27] = i15;
                                int i31 = i29 + 1;
                                idvVar.j(l4hVar, i31);
                                if (nszVar2.a[i29] == 0) {
                                    throw ssz.a(null, "No valid varint length mask found");
                                }
                                int i32 = i15;
                                while (true) {
                                    if (i32 >= i18) {
                                        i6 = i18;
                                        i7 = i14;
                                        i8 = i15;
                                        j = 0;
                                        i9 = i31;
                                        break;
                                    }
                                    i6 = i18;
                                    int i33 = i14 << (7 - i32);
                                    i7 = i14;
                                    if ((nszVar2.a[i29] & i33) != 0) {
                                        i9 = i31 + i32;
                                        idvVar.j(l4hVar, i9);
                                        i8 = i15;
                                        j = (~i33) & nszVar2.a[i29] & 255;
                                        while (i31 < i9) {
                                            j = (j << i6) | ((long) (nszVar2.a[i31] & 255));
                                            i31++;
                                        }
                                        if (i27 <= 0) {
                                            break;
                                        }
                                        j -= (1 << ((i32 * 7) + 6)) - 1;
                                        break;
                                    }
                                    i32++;
                                    i14 = i7;
                                    i18 = i6;
                                }
                                if (j < -2147483648L || j > 2147483647L) {
                                    throw ssz.a(null, "EBML lacing sample size out of range.");
                                }
                                int i34 = (int) j;
                                int[] iArr6 = idvVar.O;
                                if (i27 != 0) {
                                    i34 += iArr6[i27 - 1];
                                }
                                iArr6[i27] = i34;
                                i28 += i34;
                                i27++;
                                i29 = i9;
                                i14 = i7;
                                i18 = i6;
                                i15 = i8;
                            }
                        }
                        byte[] bArr6 = nszVar2.a;
                        idvVar.K = idvVar.m((bArr6[i3] & 255) | (bArr6[i5] << 8)) + idvVar.E;
                        if (bVar3.e != 2 || (i == 163 && (nszVar2.a[2] & 128) == 128)) {
                            i13 = i3;
                        } else {
                            i13 = i5;
                        }
                        idvVar.R = i13;
                        idvVar.J = 2;
                        idvVar.M = i5;
                    }
                }
                i3 = 1;
                i5 = 0;
                byte[] bArr7 = nszVar2.a;
                idvVar.K = idvVar.m((bArr7[i3] & 255) | (bArr7[i5] << 8)) + idvVar.E;
                if (bVar3.e != 2) {
                    i13 = i3;
                } else {
                    i13 = i3;
                }
                idvVar.R = i13;
                idvVar.J = 2;
                idvVar.M = i5;
            } else {
                i3 = 1;
            }
            if (i == 163) {
                while (true) {
                    int i35 = idvVar.M;
                    if (i35 >= idvVar.N) {
                        idvVar.J = 0;
                        return;
                    }
                    idvVar.g(bVar3, ((long) ((idvVar.M * bVar3.f) / 1000)) + idvVar.K, idvVar.R, idvVar.n(l4hVar, bVar3, idvVar.O[i35], false), 0);
                    idvVar.M++;
                }
            } else {
                while (true) {
                    int i36 = idvVar.M;
                    if (i36 >= idvVar.N) {
                        return;
                    }
                    int[] iArr7 = idvVar.O;
                    boolean z = i3;
                    iArr7[i36] = idvVar.n(l4hVar, bVar3, iArr7[i36], z);
                    idvVar.M += z ? 1 : 0;
                }
            }
        }

        public final void b(int i, long j) throws ssz {
            if (i == 20529) {
                if (j == 0) {
                    return;
                }
                throw ssz.a(null, "ContentEncodingOrder " + j + " not supported");
            }
            if (i == 20530) {
                if (j == 1) {
                    return;
                }
                throw ssz.a(null, "ContentEncodingScope " + j + " not supported");
            }
            idv idvVar = idv.this;
            switch (i) {
                case 131:
                    idvVar.f(i);
                    idvVar.x.e = (int) j;
                    return;
                case 136:
                    idvVar.f(i);
                    idvVar.x.X = j == 1;
                    return;
                case ModuleDescriptor.MODULE_VERSION /* 155 */:
                    idvVar.L = idvVar.m(j);
                    return;
                case 159:
                    idvVar.f(i);
                    idvVar.x.Q = (int) j;
                    return;
                case 176:
                    idvVar.f(i);
                    idvVar.x.n = (int) j;
                    return;
                case 179:
                    idvVar.d(i);
                    idvVar.F.a(idvVar.m(j));
                    return;
                case 186:
                    idvVar.f(i);
                    idvVar.x.o = (int) j;
                    return;
                case 215:
                    idvVar.f(i);
                    idvVar.x.d = (int) j;
                    return;
                case 231:
                    idvVar.E = idvVar.m(j);
                    return;
                case 238:
                    idvVar.S = (int) j;
                    return;
                case 241:
                    if (idvVar.H) {
                        return;
                    }
                    idvVar.d(i);
                    idvVar.G.a(j);
                    idvVar.H = true;
                    return;
                case 251:
                    idvVar.T = true;
                    return;
                case 16871:
                    idvVar.f(i);
                    idvVar.x.h = (int) j;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw ssz.a(null, "ContentCompAlgo " + j + " not supported");
                case 17029:
                    if (j < 1 || j > 2) {
                        throw ssz.a(null, "DocTypeReadVersion " + j + " not supported");
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw ssz.a(null, "EBMLReadVersion " + j + " not supported");
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw ssz.a(null, "ContentEncAlgo " + j + " not supported");
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw ssz.a(null, "AESSettingsCipherMode " + j + " not supported");
                case 21420:
                    idvVar.A = j + idvVar.s;
                    return;
                case 21432:
                    int i2 = (int) j;
                    idvVar.f(i);
                    if (i2 == 0) {
                        idvVar.x.y = 0;
                        return;
                    }
                    if (i2 == 1) {
                        idvVar.x.y = 2;
                        return;
                    } else if (i2 == 3) {
                        idvVar.x.y = 1;
                        return;
                    } else {
                        if (i2 != 15) {
                            return;
                        }
                        idvVar.x.y = 3;
                        return;
                    }
                case 21680:
                    idvVar.f(i);
                    idvVar.x.q = (int) j;
                    return;
                case 21682:
                    idvVar.f(i);
                    idvVar.x.s = (int) j;
                    return;
                case 21690:
                    idvVar.f(i);
                    idvVar.x.r = (int) j;
                    return;
                case 21930:
                    idvVar.f(i);
                    idvVar.x.W = j == 1;
                    return;
                case 21938:
                    idvVar.f(i);
                    b bVar = idvVar.x;
                    bVar.z = true;
                    bVar.p = (int) j;
                    return;
                case 21998:
                    idvVar.f(i);
                    idvVar.x.g = (int) j;
                    return;
                case 22186:
                    idvVar.f(i);
                    idvVar.x.T = j;
                    return;
                case 22203:
                    idvVar.f(i);
                    idvVar.x.U = j;
                    return;
                case 25188:
                    idvVar.f(i);
                    idvVar.x.R = (int) j;
                    return;
                case 30114:
                    idvVar.U = j;
                    return;
                case 30321:
                    idvVar.f(i);
                    int i3 = (int) j;
                    if (i3 == 0) {
                        idvVar.x.t = 0;
                        return;
                    }
                    if (i3 == 1) {
                        idvVar.x.t = 1;
                        return;
                    } else if (i3 == 2) {
                        idvVar.x.t = 2;
                        return;
                    } else {
                        if (i3 != 3) {
                            return;
                        }
                        idvVar.x.t = 3;
                        return;
                    }
                case 2352003:
                    idvVar.f(i);
                    idvVar.x.f = (int) j;
                    return;
                case 2807729:
                    idvVar.t = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            idvVar.f(i);
                            int i4 = (int) j;
                            if (i4 == 1) {
                                idvVar.x.C = 2;
                                return;
                            } else {
                                if (i4 != 2) {
                                    return;
                                }
                                idvVar.x.C = 1;
                                return;
                            }
                        case 21946:
                            idvVar.f(i);
                            int iG = n58.g((int) j);
                            if (iG != -1) {
                                idvVar.x.B = iG;
                                return;
                            }
                            return;
                        case 21947:
                            idvVar.f(i);
                            idvVar.x.z = true;
                            int iF = n58.f((int) j);
                            if (iF != -1) {
                                idvVar.x.A = iF;
                                return;
                            }
                            return;
                        case 21948:
                            idvVar.f(i);
                            idvVar.x.D = (int) j;
                            return;
                        case 21949:
                            idvVar.f(i);
                            idvVar.x.E = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public static final class b {
        public byte[] P;
        public jxg0 V;
        public boolean W;
        public njg0 Z;
        public boolean a;
        public int a0;
        public String b;
        public String c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public boolean i;
        public byte[] j;
        public njg0.a k;
        public byte[] l;
        public DrmInitData m;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = 0;
        public int t = -1;
        public float u = 0.0f;
        public float v = 0.0f;
        public float w = 0.0f;
        public byte[] x = null;
        public int y = -1;
        public boolean z = false;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = 1000;
        public int E = r.d.DEFAULT_DRAG_ANIMATION_DURATION;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public float N = -1.0f;
        public float O = -1.0f;
        public int Q = 1;
        public int R = -1;
        public int S = AudioFormat.AUDIO_SAMPLE_RATE_8000;
        public long T = 0;
        public long U = 0;
        public boolean X = true;
        public String Y = "eng";

        public final byte[] a(String str) throws ssz {
            byte[] bArr = this.l;
            if (bArr != null) {
                return bArr;
            }
            throw ssz.a(null, "Missing CodecPrivate for codec " + str);
        }
    }

    static {
        String str = jrh0.a;
        g0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        h0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        j0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        pwd0.a(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        pwd0.a(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        k0 = Collections.unmodifiableMap(map);
    }

    public idv(ree0.a aVar, int i) {
        acd acdVar = new acd();
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.a = acdVar;
        acdVar.d = new a();
        this.f = aVar;
        this.d = (i & 1) == 0;
        this.e = (i & 2) == 0;
        this.b = new nvh0();
        this.c = new SparseArray<>();
        this.i = new nsz(4);
        this.j = new nsz(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new nsz(4);
        this.g = new nsz(qbx.a);
        this.h = new nsz(4);
        this.l = new nsz();
        this.m = new nsz();
        this.n = new nsz(8);
        this.o = new nsz();
        this.p = new nsz();
        this.O = new int[1];
    }

    public static byte[] h(long j, String str, long j2) {
        ly0.b(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = jrh0.a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:238:0x0395  */
    /* JADX WARN: Code duplicated, block: B:539:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:544:0x090c  */
    /* JADX WARN: Code duplicated, block: B:545:0x090e  */
    /* JADX WARN: Code duplicated, block: B:548:0x091f  */
    /* JADX WARN: Code duplicated, block: B:549:0x092c  */
    /* JADX WARN: Code duplicated, block: B:551:0x0932  */
    /* JADX WARN: Code duplicated, block: B:553:0x0936  */
    /* JADX WARN: Code duplicated, block: B:555:0x093b  */
    /* JADX WARN: Code duplicated, block: B:558:0x0943  */
    /* JADX WARN: Code duplicated, block: B:560:0x0948  */
    /* JADX WARN: Code duplicated, block: B:563:0x094f  */
    /* JADX WARN: Code duplicated, block: B:566:0x095d  */
    /* JADX WARN: Code duplicated, block: B:569:0x0962  */
    /* JADX WARN: Code duplicated, block: B:571:0x0968  */
    /* JADX WARN: Code duplicated, block: B:591:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:593:0x0a3a  */
    /* JADX WARN: Code duplicated, block: B:596:0x0a3f  */
    /* JADX WARN: Code duplicated, block: B:599:0x0a52  */
    /* JADX WARN: Code duplicated, block: B:602:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:608:0x0a70  */
    /* JADX WARN: Code duplicated, block: B:609:0x0a72  */
    /* JADX WARN: Code duplicated, block: B:611:0x0a7c  */
    /* JADX WARN: Code duplicated, block: B:612:0x0a7f  */
    /* JADX WARN: Code duplicated, block: B:614:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:620:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:622:0x0abb  */
    /* JADX WARN: Code duplicated, block: B:624:0x0ac1  */
    /* JADX WARN: Code duplicated, block: B:640:0x0aed  */
    /* JADX WARN: Code duplicated, block: B:646:0x0b02  */
    /* JADX WARN: Code duplicated, block: B:96:0x01cb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v85, types: [java.lang.RuntimeException] */
    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) throws ssz {
        l4h l4hVar2;
        boolean z;
        int i;
        boolean z2;
        String str;
        long j;
        int i2;
        int iA;
        idv idvVar;
        byte b2;
        List<byte[]> listSingletonList;
        int iA2;
        List<byte[]> list;
        int i3;
        String str2;
        RuntimeException runtimeException;
        Pair pair;
        String str3;
        List<byte[]> list2;
        String str4;
        List<byte[]> listN;
        List<byte[]> list3;
        List<byte[]> list4;
        int i4;
        androidx.media3.common.a.C0062a c0062a;
        boolean zI;
        int i5;
        int i6;
        int i7;
        float f;
        n58 n58Var;
        String str5;
        int iIntValue;
        byte[] bArr;
        int i8;
        int i9;
        int i10;
        String str6;
        idv idvVar2;
        mye myeVarA;
        List<byte[]> list5;
        p480 bVar;
        int i11;
        idv idvVar3 = this;
        idvVar3.I = false;
        boolean z3 = true;
        while (true) {
            int i12 = -1;
            if (z3 && !idvVar3.I) {
                acd acdVar = idvVar3.a;
                nvh0 nvh0Var = acdVar.c;
                ArrayDeque<acd.a> arrayDeque = acdVar.b;
                ly0.g(acdVar.d);
                while (true) {
                    acd.a aVarPeek = arrayDeque.peek();
                    if (aVarPeek == null || l4hVar.getPosition() < aVarPeek.b) {
                        int i13 = 0;
                        int i14 = acdVar.e;
                        l4hVar2 = l4hVar;
                        if (i14 == 0) {
                            int i15 = 4;
                            long jB = nvh0Var.b(l4hVar2, true, false, 4);
                            if (jB == -2) {
                                byte[] bArr2 = acdVar.a;
                                l4hVar2.e();
                                while (true) {
                                    l4hVar2.m(bArr2, i13, i15);
                                    byte b3 = bArr2[i13];
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 >= 8) {
                                            i2 = -1;
                                        } else if ((nvh0.d[i16] & ((long) b3)) != 0) {
                                            i2 = i16 + 1;
                                        } else {
                                            i16++;
                                        }
                                    }
                                    if (i2 != -1 && i2 <= 4) {
                                        iA = (int) nvh0.a(i2, false, bArr2);
                                        idv idvVar4 = idv.this;
                                        if (iA == 357149030 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                                        }
                                    }
                                    l4hVar2.l(1);
                                    i13 = 0;
                                    i15 = 4;
                                }
                                l4hVar2.l(i2);
                                j = iA;
                            } else {
                                j = jB;
                            }
                            z = true;
                            if (j == -1) {
                                z2 = false;
                                z3 = false;
                            } else {
                                acdVar.f = (int) j;
                                acdVar.e = 1;
                                i14 = 1;
                            }
                        } else {
                            z = true;
                        }
                        if (i14 == z) {
                            acdVar.g = nvh0Var.b(l4hVar2, false, z, 8);
                            acdVar.e = 2;
                        }
                        a aVar = acdVar.d;
                        int i17 = acdVar.f;
                        idv idvVar5 = idv.this;
                        switch (i17) {
                            case 131:
                            case 136:
                            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                            case 159:
                            case 176:
                            case 179:
                            case 186:
                            case 215:
                            case 231:
                            case 238:
                            case 241:
                            case 251:
                            case 16871:
                            case 16980:
                            case 17029:
                            case 17143:
                            case 18401:
                            case 18408:
                            case 20529:
                            case 20530:
                            case 21420:
                            case 21432:
                            case 21680:
                            case 21682:
                            case 21690:
                            case 21930:
                            case 21938:
                            case 21945:
                            case 21946:
                            case 21947:
                            case 21948:
                            case 21949:
                            case 21998:
                            case 22186:
                            case 22203:
                            case 25188:
                            case 30114:
                            case 30321:
                            case 2352003:
                            case 2807729:
                                i = 2;
                                break;
                            case 134:
                            case 17026:
                            case 21358:
                            case 2274716:
                                i = 3;
                                break;
                            case 160:
                            case 166:
                            case 174:
                            case 183:
                            case 187:
                            case 224:
                            case 225:
                            case 16868:
                            case 18407:
                            case 19899:
                            case 20532:
                            case 20533:
                            case 21936:
                            case 21968:
                            case 25152:
                            case 28032:
                            case 30113:
                            case 30320:
                            case 290298740:
                            case 357149030:
                            case 374648427:
                            case 408125543:
                            case 440786851:
                            case 475249515:
                            case 524531317:
                                i = 1;
                                break;
                            case 161:
                            case 163:
                            case 165:
                            case 16877:
                            case 16981:
                            case 18402:
                            case 21419:
                            case 25506:
                            case 30322:
                                i = 4;
                                break;
                            case 181:
                            case 17545:
                            case 21969:
                            case 21970:
                            case 21971:
                            case 21972:
                            case 21973:
                            case 21974:
                            case 21975:
                            case 21976:
                            case 21977:
                            case 21978:
                            case 30323:
                            case 30324:
                            case 30325:
                                i = 5;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                        if (i == 0) {
                            l4hVar2.l((int) acdVar.g);
                            acdVar.e = 0;
                            i12 = -1;
                        } else if (i == 1) {
                            long position = l4hVar2.getPosition();
                            arrayDeque.push(new acd.a(acdVar.f, acdVar.g + position));
                            a aVar2 = acdVar.d;
                            int i18 = acdVar.f;
                            long j2 = acdVar.g;
                            idv idvVar6 = idv.this;
                            ly0.g(idvVar6.e0);
                            if (i18 == 160) {
                                z2 = false;
                                idvVar6.T = false;
                                idvVar6.U = 0L;
                            } else if (i18 == 174) {
                                z2 = false;
                                b bVar2 = new b();
                                idvVar6.x = bVar2;
                                bVar2.a = idvVar6.w;
                            } else if (i18 != 187) {
                                if (i18 == 19899) {
                                    idvVar6.z = -1;
                                    idvVar6.A = -1L;
                                } else if (i18 == 20533) {
                                    idvVar6.f(i18);
                                    idvVar6.x.i = true;
                                } else if (i18 == 21968) {
                                    idvVar6.f(i18);
                                    idvVar6.x.z = true;
                                } else if (i18 == 408125543) {
                                    long j3 = idvVar6.s;
                                    if (j3 != -1 && j3 != position) {
                                        throw ssz.a(null, "Multiple Segment elements not supported");
                                    }
                                    idvVar6.s = position;
                                    idvVar6.r = j2;
                                } else if (i18 == 475249515) {
                                    idvVar6.F = new jjt();
                                    idvVar6.G = new jjt();
                                } else if (i18 == 524531317 && !idvVar6.y) {
                                    if (!idvVar6.d || idvVar6.C == -1) {
                                        idvVar6.e0.k(new p480.b(idvVar6.v));
                                        idvVar6.y = true;
                                    } else {
                                        idvVar6.B = true;
                                    }
                                }
                                z2 = false;
                            } else {
                                z2 = false;
                                idvVar6.H = false;
                            }
                            acdVar.e = z2 ? 1 : 0;
                        } else if (i == 2) {
                            long j4 = acdVar.g;
                            if (j4 > 8) {
                                throw ssz.a(null, TEFcJcMqR.kpiupLRVlnMGOhu + acdVar.g);
                            }
                            aVar.b(i17, acdVar.a(l4hVar2, (int) j4));
                            z2 = false;
                            acdVar.e = 0;
                        } else if (i == 3) {
                            long j5 = acdVar.g;
                            if (j5 > 2147483647L) {
                                throw ssz.a(null, "String element size: " + acdVar.g);
                            }
                            int i19 = (int) j5;
                            if (i19 == 0) {
                                str = "";
                            } else {
                                byte[] bArr3 = new byte[i19];
                                l4hVar2.readFully(bArr3, 0, i19);
                                while (i19 > 0 && bArr3[i19 - 1] == 0) {
                                    i19--;
                                }
                                str = new String(bArr3, 0, i19);
                            }
                            idv idvVar7 = idv.this;
                            if (i17 == 134) {
                                idvVar7.f(i17);
                                idvVar7.x.c = str;
                            } else if (i17 == 17026) {
                                if (!"webm".equals(str) && !"matroska".equals(str)) {
                                    throw ssz.a(null, "DocType " + str + " not supported");
                                }
                                idvVar7.w = str.equals("webm");
                            } else if (i17 == 21358) {
                                idvVar7.f(i17);
                                idvVar7.x.b = str;
                            } else if (i17 == 2274716) {
                                idvVar7.f(i17);
                                idvVar7.x.Y = str;
                            }
                            z2 = false;
                            acdVar.e = 0;
                        } else if (i == 4) {
                            aVar.a(i17, (int) acdVar.g, l4hVar2);
                            acdVar.e = 0;
                            z2 = false;
                        } else {
                            if (i != 5) {
                                throw ssz.a(null, "Invalid element type " + i);
                            }
                            long j6 = acdVar.g;
                            if (j6 != 4 && j6 != 8) {
                                throw ssz.a(null, "Invalid float size: " + acdVar.g);
                            }
                            int i20 = (int) j6;
                            long jA = acdVar.a(l4hVar2, i20);
                            double dIntBitsToFloat = i20 == 4 ? Float.intBitsToFloat((int) jA) : Double.longBitsToDouble(jA);
                            idv idvVar8 = idv.this;
                            if (i17 == 181) {
                                idvVar8.f(i17);
                                idvVar8.x.S = (int) dIntBitsToFloat;
                            } else if (i17 != 17545) {
                                switch (i17) {
                                    case 21969:
                                        idvVar8.f(i17);
                                        idvVar8.x.F = (float) dIntBitsToFloat;
                                        break;
                                    case 21970:
                                        idvVar8.f(i17);
                                        idvVar8.x.G = (float) dIntBitsToFloat;
                                        break;
                                    case 21971:
                                        idvVar8.f(i17);
                                        idvVar8.x.H = (float) dIntBitsToFloat;
                                        break;
                                    case 21972:
                                        idvVar8.f(i17);
                                        idvVar8.x.I = (float) dIntBitsToFloat;
                                        break;
                                    case 21973:
                                        idvVar8.f(i17);
                                        idvVar8.x.J = (float) dIntBitsToFloat;
                                        break;
                                    case 21974:
                                        idvVar8.f(i17);
                                        idvVar8.x.K = (float) dIntBitsToFloat;
                                        break;
                                    case 21975:
                                        idvVar8.f(i17);
                                        idvVar8.x.L = (float) dIntBitsToFloat;
                                        break;
                                    case 21976:
                                        idvVar8.f(i17);
                                        idvVar8.x.M = (float) dIntBitsToFloat;
                                        break;
                                    case 21977:
                                        idvVar8.f(i17);
                                        idvVar8.x.N = (float) dIntBitsToFloat;
                                        break;
                                    case 21978:
                                        idvVar8.f(i17);
                                        idvVar8.x.O = (float) dIntBitsToFloat;
                                        break;
                                    default:
                                        switch (i17) {
                                            case 30323:
                                                idvVar8.f(i17);
                                                idvVar8.x.u = (float) dIntBitsToFloat;
                                                break;
                                            case 30324:
                                                idvVar8.f(i17);
                                                idvVar8.x.v = (float) dIntBitsToFloat;
                                                break;
                                            case 30325:
                                                idvVar8.f(i17);
                                                idvVar8.x.w = (float) dIntBitsToFloat;
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                idvVar8.u = (long) dIntBitsToFloat;
                            }
                            z2 = false;
                            acdVar.e = 0;
                        }
                    } else {
                        a aVar3 = acdVar.d;
                        int i21 = arrayDeque.pop().a;
                        idv idvVar9 = idv.this;
                        SparseArray<b> sparseArray = idvVar9.c;
                        ly0.g(idvVar9.e0);
                        if (i21 == 160) {
                            if (idvVar9.J == 2) {
                                b bVar3 = sparseArray.get(idvVar9.P);
                                bVar3.Z.getClass();
                                if (idvVar9.U > 0 && "A_OPUS".equals(bVar3.c)) {
                                    nsz nszVar = idvVar9.p;
                                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(idvVar9.U).array();
                                    nszVar.getClass();
                                    nszVar.G(bArrArray.length, bArrArray);
                                }
                                int i22 = 0;
                                for (int i23 = 0; i23 < idvVar9.N; i23++) {
                                    i22 += idvVar9.O[i23];
                                }
                                int i24 = 0;
                                while (i24 < idvVar9.N) {
                                    long j7 = idvVar9.K + ((long) ((bVar3.f * i24) / 1000));
                                    int i25 = idvVar9.R;
                                    if (i24 == 0 && !idvVar9.T) {
                                        i25 |= 1;
                                    }
                                    int i26 = idvVar9.O[i24];
                                    int i27 = i22 - i26;
                                    idvVar9.g(bVar3, j7, i25, i26, i27);
                                    i24++;
                                    i22 = i27;
                                }
                                z2 = false;
                                idvVar9.J = 0;
                            }
                            l4hVar2 = l4hVar;
                        } else if (i21 == 174) {
                            b bVar4 = idvVar9.x;
                            ly0.g(bVar4);
                            String str7 = bVar4.c;
                            if (str7 == null) {
                                throw ssz.a(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str7) {
                                case "V_MPEG4/ISO/AP":
                                case "V_MPEG4/ISO/SP":
                                case "A_MS/ACM":
                                case "A_TRUEHD":
                                case "A_VORBIS":
                                case "A_MPEG/L2":
                                case "A_MPEG/L3":
                                case "V_MS/VFW/FOURCC":
                                case "S_DVBSUB":
                                case "V_MPEG4/ISO/ASP":
                                case "V_MPEG4/ISO/AVC":
                                case "S_VOBSUB":
                                case "A_DTS/LOSSLESS":
                                case "A_AAC":
                                case "A_AC3":
                                case "A_DTS":
                                case "V_AV1":
                                case "V_VP8":
                                case "V_VP9":
                                case "S_HDMV/PGS":
                                case "V_THEORA":
                                case "A_DTS/EXPRESS":
                                case "A_PCM/FLOAT/IEEE":
                                case "A_PCM/INT/BIG":
                                case "A_PCM/INT/LIT":
                                case "S_TEXT/ASS":
                                case "S_TEXT/SSA":
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    m4h m4hVar = idvVar9.e0;
                                    int i28 = bVar4.d;
                                    switch (str7) {
                                        case "V_MPEG4/ISO/AP":
                                            b2 = 0;
                                            break;
                                        case "V_MPEG4/ISO/SP":
                                            b2 = 1;
                                            break;
                                        case "A_MS/ACM":
                                            b2 = 2;
                                            break;
                                        case "A_TRUEHD":
                                            b2 = 3;
                                            break;
                                        case "A_VORBIS":
                                            b2 = 4;
                                            break;
                                        case "A_MPEG/L2":
                                            b2 = 5;
                                            break;
                                        case "A_MPEG/L3":
                                            b2 = 6;
                                            break;
                                        case "V_MS/VFW/FOURCC":
                                            b2 = 7;
                                            break;
                                        case "S_DVBSUB":
                                            b2 = 8;
                                            break;
                                        case "V_MPEG4/ISO/ASP":
                                            b2 = 9;
                                            break;
                                        case "V_MPEG4/ISO/AVC":
                                            b2 = 10;
                                            break;
                                        case "S_VOBSUB":
                                            b2 = 11;
                                            break;
                                        case "A_DTS/LOSSLESS":
                                            b2 = 12;
                                            break;
                                        case "A_AAC":
                                            b2 = 13;
                                            break;
                                        case "A_AC3":
                                            b2 = 14;
                                            break;
                                        case "A_DTS":
                                            b2 = 15;
                                            break;
                                        case "V_AV1":
                                            b2 = 16;
                                            break;
                                        case "V_VP8":
                                            b2 = 17;
                                            break;
                                        case "V_VP9":
                                            b2 = 18;
                                            break;
                                        case "S_HDMV/PGS":
                                            b2 = 19;
                                            break;
                                        case "V_THEORA":
                                            b2 = 20;
                                            break;
                                        case "A_DTS/EXPRESS":
                                            b2 = 21;
                                            break;
                                        case "A_PCM/FLOAT/IEEE":
                                            b2 = 22;
                                            break;
                                        case "A_PCM/INT/BIG":
                                            b2 = 23;
                                            break;
                                        case "A_PCM/INT/LIT":
                                            b2 = 24;
                                            break;
                                        case "S_TEXT/ASS":
                                            b2 = 25;
                                            break;
                                        case "S_TEXT/SSA":
                                            b2 = 26;
                                            break;
                                        case "V_MPEGH/ISO/HEVC":
                                            b2 = 27;
                                            break;
                                        case "S_TEXT/WEBVTT":
                                            b2 = 28;
                                            break;
                                        case "S_TEXT/UTF8":
                                            b2 = 29;
                                            break;
                                        case "V_MPEG2":
                                            b2 = 30;
                                            break;
                                        case "A_EAC3":
                                            b2 = 31;
                                            break;
                                        case "A_FLAC":
                                            b2 = 32;
                                            break;
                                        case "A_OPUS":
                                            b2 = 33;
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    String str8 = "video/x-unknown";
                                    switch (b2) {
                                        case 0:
                                        case 1:
                                        case 9:
                                            byte[] bArr4 = bVar4.l;
                                            str8 = "video/mp4v-es";
                                            listSingletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            iA2 = -1;
                                            str2 = null;
                                            list4 = listSingletonList;
                                            i3 = -1;
                                            list = list4;
                                            if (bVar4.P != null && (myeVarA = mye.a(new nsz(bVar4.P))) != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z4 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i29 = (z4 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6 || (i8 = bVar4.r) == i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = (bVar4.o * i7) / (bVar4.n * i8);
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f || bVar4.G == -1.0f || bVar4.H == -1.0f || bVar4.I == -1.0f || bVar4.J == -1.0f || bVar4.K == -1.0f || bVar4.L == -1.0f || bVar4.M == -1.0f || bVar4.N == -1.0f || bVar4.O == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        byte[] bArr5 = new byte[25];
                                                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                        byteBufferOrder.put((byte) 0);
                                                        byteBufferOrder.putShort((short) ((bVar4.F * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((bVar4.G * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((bVar4.H * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((bVar4.I * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((bVar4.J * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((bVar4.K * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((bVar4.L * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((bVar4.M * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) (bVar4.N + 0.5f));
                                                        byteBufferOrder.putShort((short) (bVar4.O + 0.5f));
                                                        byteBufferOrder.putShort((short) bVar4.D);
                                                        byteBufferOrder.putShort((short) bVar4.E);
                                                        bArr = bArr5;
                                                    }
                                                    int i30 = bVar4.A;
                                                    int i31 = bVar4.C;
                                                    int i32 = bVar4.B;
                                                    int i33 = bVar4.p;
                                                    n58Var = new n58(i30, i31, i32, i33, i33, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null && map.containsKey(str5)) {
                                                    iIntValue = map.get(bVar4.b).intValue();
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0 && Float.compare(bVar4.u, 0.0f) == 0 && Float.compare(bVar4.v, 0.0f) == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0 || Float.compare(bVar4.w, 180.0f) == 0) {
                                                        iIntValue = 180;
                                                    } else if (Float.compare(bVar4.w, -90.0f) == 0) {
                                                        iIntValue = 270;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8) && !"text/x-ssa".equals(str8) && !"text/vtt".equals(str8) && !"application/vobsub".equals(str8) && !"application/pgs".equals(str8) && !"application/dvbsubs".equals(str8)) {
                                                    throw ssz.a(null, "Unexpected MIME type.");
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null && !map.containsKey(str6)) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i29;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar4 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR;
                                            njg0VarR.d(aVar4);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 2:
                                            idvVar9 = idvVar9;
                                            nsz nszVar2 = new nsz(bVar4.a(bVar4.c));
                                            try {
                                                int iP = nszVar2.p();
                                                if (iP != 1) {
                                                    if (iP == 65534) {
                                                        nszVar2.I(24);
                                                        long jQ = nszVar2.q();
                                                        UUID uuid = j0;
                                                        if (jQ != uuid.getMostSignificantBits() || nszVar2.q() != uuid.getLeastSignificantBits()) {
                                                        }
                                                        str8 = "audio/x-unknown";
                                                        iA2 = -1;
                                                        str2 = null;
                                                        i3 = -1;
                                                        list = null;
                                                        if (bVar4.P != null) {
                                                            str2 = (String) myeVarA.a;
                                                            str8 = "video/dolby-vision";
                                                        }
                                                        boolean z5 = bVar4.X;
                                                        if (bVar4.W) {
                                                            i4 = 2;
                                                        } else {
                                                            i4 = 0;
                                                        }
                                                        int i210 = (z5 ? 1 : 0) | i4;
                                                        c0062a = new androidx.media3.common.a.C0062a();
                                                        zI = gqv.i(str8);
                                                        Map<String, Integer> map2 = k0;
                                                        if (zI) {
                                                            c0062a.E = bVar4.Q;
                                                            c0062a.F = bVar4.S;
                                                            c0062a.G = iA2;
                                                            i5 = 1;
                                                        } else if (gqv.l(str8)) {
                                                            if (bVar4.s == 0) {
                                                                i9 = bVar4.q;
                                                                i6 = -1;
                                                                if (i9 == -1) {
                                                                    i9 = bVar4.n;
                                                                }
                                                                bVar4.q = i9;
                                                                i10 = bVar4.r;
                                                                if (i10 == -1) {
                                                                    i10 = bVar4.o;
                                                                }
                                                                bVar4.r = i10;
                                                            } else {
                                                                i6 = -1;
                                                            }
                                                            i7 = bVar4.q;
                                                            if (i7 != i6) {
                                                                f = -1.0f;
                                                            } else {
                                                                f = -1.0f;
                                                            }
                                                            if (bVar4.z) {
                                                                if (bVar4.F != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                int i34 = bVar4.A;
                                                                int i35 = bVar4.C;
                                                                int i36 = bVar4.B;
                                                                int i37 = bVar4.p;
                                                                n58Var = new n58(i34, i35, i36, i37, i37, bArr);
                                                            } else {
                                                                n58Var = null;
                                                            }
                                                            str5 = bVar4.b;
                                                            if (str5 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (bVar4.t == 0) {
                                                                if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                                    iIntValue = 0;
                                                                } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                                    iIntValue = 90;
                                                                } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                                    iIntValue = 180;
                                                                } else {
                                                                    iIntValue = 180;
                                                                }
                                                            }
                                                            c0062a.t = bVar4.n;
                                                            c0062a.u = bVar4.o;
                                                            c0062a.z = f;
                                                            c0062a.y = iIntValue;
                                                            c0062a.A = bVar4.x;
                                                            c0062a.B = bVar4.y;
                                                            c0062a.C = n58Var;
                                                            i5 = 2;
                                                        } else {
                                                            if ("application/x-subrip".equals(str8)) {
                                                            }
                                                            i5 = 3;
                                                        }
                                                        str6 = bVar4.b;
                                                        if (str6 != null) {
                                                            c0062a.b = bVar4.b;
                                                        }
                                                        c0062a.a = Integer.toString(i28);
                                                        c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                                        c0062a.m = gqv.m(str8);
                                                        c0062a.n = i3;
                                                        c0062a.d = bVar4.Y;
                                                        c0062a.e = i210;
                                                        c0062a.p = list;
                                                        c0062a.j = str2;
                                                        c0062a.q = bVar4.m;
                                                        androidx.media3.common.a aVar5 = new androidx.media3.common.a(c0062a);
                                                        njg0 njg0VarR2 = m4hVar.r(bVar4.d, i5);
                                                        bVar4.Z = njg0VarR2;
                                                        njg0VarR2.d(aVar5);
                                                        sparseArray.put(bVar4.d, bVar4);
                                                        idvVar2 = idvVar9;
                                                    }
                                                    cft.g("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str8 = "audio/x-unknown";
                                                    iA2 = -1;
                                                    str2 = null;
                                                    i3 = -1;
                                                    list = null;
                                                    if (bVar4.P != null) {
                                                        str2 = (String) myeVarA.a;
                                                        str8 = "video/dolby-vision";
                                                    }
                                                    boolean z6 = bVar4.X;
                                                    if (bVar4.W) {
                                                        i4 = 2;
                                                    } else {
                                                        i4 = 0;
                                                    }
                                                    int i211 = (z6 ? 1 : 0) | i4;
                                                    c0062a = new androidx.media3.common.a.C0062a();
                                                    zI = gqv.i(str8);
                                                    Map<String, Integer> map3 = k0;
                                                    if (zI) {
                                                        c0062a.E = bVar4.Q;
                                                        c0062a.F = bVar4.S;
                                                        c0062a.G = iA2;
                                                        i5 = 1;
                                                    } else if (gqv.l(str8)) {
                                                        if (bVar4.s == 0) {
                                                            i9 = bVar4.q;
                                                            i6 = -1;
                                                            if (i9 == -1) {
                                                                i9 = bVar4.n;
                                                            }
                                                            bVar4.q = i9;
                                                            i10 = bVar4.r;
                                                            if (i10 == -1) {
                                                                i10 = bVar4.o;
                                                            }
                                                            bVar4.r = i10;
                                                        } else {
                                                            i6 = -1;
                                                        }
                                                        i7 = bVar4.q;
                                                        if (i7 != i6) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (bVar4.z) {
                                                            if (bVar4.F != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i38 = bVar4.A;
                                                            int i39 = bVar4.C;
                                                            int i310 = bVar4.B;
                                                            int i311 = bVar4.p;
                                                            n58Var = new n58(i38, i39, i310, i311, i311, bArr);
                                                        } else {
                                                            n58Var = null;
                                                        }
                                                        str5 = bVar4.b;
                                                        if (str5 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (bVar4.t == 0) {
                                                            if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c0062a.t = bVar4.n;
                                                        c0062a.u = bVar4.o;
                                                        c0062a.z = f;
                                                        c0062a.y = iIntValue;
                                                        c0062a.A = bVar4.x;
                                                        c0062a.B = bVar4.y;
                                                        c0062a.C = n58Var;
                                                        i5 = 2;
                                                    } else {
                                                        if ("application/x-subrip".equals(str8)) {
                                                        }
                                                        i5 = 3;
                                                    }
                                                    str6 = bVar4.b;
                                                    if (str6 != null) {
                                                        c0062a.b = bVar4.b;
                                                    }
                                                    c0062a.a = Integer.toString(i28);
                                                    c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                                    c0062a.m = gqv.m(str8);
                                                    c0062a.n = i3;
                                                    c0062a.d = bVar4.Y;
                                                    c0062a.e = i211;
                                                    c0062a.p = list;
                                                    c0062a.j = str2;
                                                    c0062a.q = bVar4.m;
                                                    androidx.media3.common.a aVar6 = new androidx.media3.common.a(c0062a);
                                                    njg0 njg0VarR3 = m4hVar.r(bVar4.d, i5);
                                                    bVar4.Z = njg0VarR3;
                                                    njg0VarR3.d(aVar6);
                                                    sparseArray.put(bVar4.d, bVar4);
                                                    idvVar2 = idvVar9;
                                                    break;
                                                }
                                                int i40 = bVar4.R;
                                                String str9 = jrh0.a;
                                                iA2 = jrh0.A(i40, ByteOrder.LITTLE_ENDIAN);
                                                if (iA2 == 0) {
                                                    cft.g("MatroskaExtractor", "Unsupported PCM bit depth: " + bVar4.R + ". Setting mimeType to audio/x-unknown");
                                                    str8 = "audio/x-unknown";
                                                    iA2 = -1;
                                                } else {
                                                    str8 = "audio/raw";
                                                }
                                                str2 = null;
                                                i3 = -1;
                                                list = null;
                                                if (bVar4.P != null) {
                                                    str2 = (String) myeVarA.a;
                                                    str8 = "video/dolby-vision";
                                                }
                                                boolean z7 = bVar4.X;
                                                if (bVar4.W) {
                                                    i4 = 2;
                                                } else {
                                                    i4 = 0;
                                                }
                                                int i212 = (z7 ? 1 : 0) | i4;
                                                c0062a = new androidx.media3.common.a.C0062a();
                                                zI = gqv.i(str8);
                                                Map<String, Integer> map4 = k0;
                                                if (zI) {
                                                    c0062a.E = bVar4.Q;
                                                    c0062a.F = bVar4.S;
                                                    c0062a.G = iA2;
                                                    i5 = 1;
                                                } else if (gqv.l(str8)) {
                                                    if (bVar4.s == 0) {
                                                        i9 = bVar4.q;
                                                        i6 = -1;
                                                        if (i9 == -1) {
                                                            i9 = bVar4.n;
                                                        }
                                                        bVar4.q = i9;
                                                        i10 = bVar4.r;
                                                        if (i10 == -1) {
                                                            i10 = bVar4.o;
                                                        }
                                                        bVar4.r = i10;
                                                    } else {
                                                        i6 = -1;
                                                    }
                                                    i7 = bVar4.q;
                                                    if (i7 != i6) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (bVar4.z) {
                                                        if (bVar4.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i312 = bVar4.A;
                                                        int i313 = bVar4.C;
                                                        int i314 = bVar4.B;
                                                        int i315 = bVar4.p;
                                                        n58Var = new n58(i312, i313, i314, i315, i315, bArr);
                                                    } else {
                                                        n58Var = null;
                                                    }
                                                    str5 = bVar4.b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (bVar4.t == 0) {
                                                        if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    c0062a.t = bVar4.n;
                                                    c0062a.u = bVar4.o;
                                                    c0062a.z = f;
                                                    c0062a.y = iIntValue;
                                                    c0062a.A = bVar4.x;
                                                    c0062a.B = bVar4.y;
                                                    c0062a.C = n58Var;
                                                    i5 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str8)) {
                                                    }
                                                    i5 = 3;
                                                }
                                                str6 = bVar4.b;
                                                if (str6 != null) {
                                                    c0062a.b = bVar4.b;
                                                }
                                                c0062a.a = Integer.toString(i28);
                                                c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                                c0062a.m = gqv.m(str8);
                                                c0062a.n = i3;
                                                c0062a.d = bVar4.Y;
                                                c0062a.e = i212;
                                                c0062a.p = list;
                                                c0062a.j = str2;
                                                c0062a.q = bVar4.m;
                                                androidx.media3.common.a aVar7 = new androidx.media3.common.a(c0062a);
                                                njg0 njg0VarR4 = m4hVar.r(bVar4.d, i5);
                                                bVar4.Z = njg0VarR4;
                                                njg0VarR4.d(aVar7);
                                                sparseArray.put(bVar4.d, bVar4);
                                                idvVar2 = idvVar9;
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw ssz.a(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 3:
                                            idvVar9 = idvVar9;
                                            bVar4.V = new jxg0();
                                            str8 = "audio/true-hd";
                                            iA2 = -1;
                                            str2 = null;
                                            i3 = -1;
                                            list = null;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z8 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i213 = (z8 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map5 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i316 = bVar4.A;
                                                    int i317 = bVar4.C;
                                                    int i318 = bVar4.B;
                                                    int i319 = bVar4.p;
                                                    n58Var = new n58(i316, i317, i318, i319, i319, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i213;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar8 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR5 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR5;
                                            njg0VarR5.d(aVar8);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 4:
                                            byte[] bArrA = bVar4.a(str7);
                                            try {
                                                try {
                                                    if (bArrA[0] != 2) {
                                                        throw ssz.a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i41 = 0;
                                                    int i42 = 1;
                                                    while (true) {
                                                        int i43 = i42;
                                                        int i44 = bArrA[i42] & 255;
                                                        if (i44 != 255) {
                                                            int i45 = i43 + 1;
                                                            int i46 = i41 + i44;
                                                            int i47 = 0;
                                                            while (true) {
                                                                int i48 = bArrA[i45] & 255;
                                                                if (i48 != 255) {
                                                                    int i49 = i45 + 1;
                                                                    int i50 = i47 + i48;
                                                                    if (bArrA[i49] != 1) {
                                                                        throw ssz.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i46];
                                                                    System.arraycopy(bArrA, i49, bArr6, 0, i46);
                                                                    int i51 = i49 + i46;
                                                                    if (bArrA[i51] != 3) {
                                                                        throw ssz.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i52 = i51 + i50;
                                                                    if (bArrA[i52] != 5) {
                                                                        throw ssz.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[bArrA.length - i52];
                                                                    idvVar9 = idvVar9;
                                                                    System.arraycopy(bArrA, i52, bArr7, 0, bArrA.length - i52);
                                                                    ArrayList arrayList = new ArrayList(2);
                                                                    arrayList.add(bArr6);
                                                                    arrayList.add(bArr7);
                                                                    str8 = "audio/vorbis";
                                                                    list = arrayList;
                                                                    i3 = 8192;
                                                                    iA2 = -1;
                                                                    str2 = null;
                                                                    if (bVar4.P != null) {
                                                                        str2 = (String) myeVarA.a;
                                                                        str8 = "video/dolby-vision";
                                                                    }
                                                                    boolean z9 = bVar4.X;
                                                                    if (bVar4.W) {
                                                                        i4 = 2;
                                                                    } else {
                                                                        i4 = 0;
                                                                    }
                                                                    int i214 = (z9 ? 1 : 0) | i4;
                                                                    c0062a = new androidx.media3.common.a.C0062a();
                                                                    zI = gqv.i(str8);
                                                                    Map<String, Integer> map6 = k0;
                                                                    if (zI) {
                                                                        c0062a.E = bVar4.Q;
                                                                        c0062a.F = bVar4.S;
                                                                        c0062a.G = iA2;
                                                                        i5 = 1;
                                                                    } else if (gqv.l(str8)) {
                                                                        if (bVar4.s == 0) {
                                                                            i9 = bVar4.q;
                                                                            i6 = -1;
                                                                            if (i9 == -1) {
                                                                                i9 = bVar4.n;
                                                                            }
                                                                            bVar4.q = i9;
                                                                            i10 = bVar4.r;
                                                                            if (i10 == -1) {
                                                                                i10 = bVar4.o;
                                                                            }
                                                                            bVar4.r = i10;
                                                                        } else {
                                                                            i6 = -1;
                                                                        }
                                                                        i7 = bVar4.q;
                                                                        if (i7 != i6) {
                                                                            f = -1.0f;
                                                                        } else {
                                                                            f = -1.0f;
                                                                        }
                                                                        if (bVar4.z) {
                                                                            if (bVar4.F != -1.0f) {
                                                                                bArr = null;
                                                                            } else {
                                                                                bArr = null;
                                                                            }
                                                                            int i3110 = bVar4.A;
                                                                            int i3111 = bVar4.C;
                                                                            int i3112 = bVar4.B;
                                                                            int i3113 = bVar4.p;
                                                                            n58Var = new n58(i3110, i3111, i3112, i3113, i3113, bArr);
                                                                        } else {
                                                                            n58Var = null;
                                                                        }
                                                                        str5 = bVar4.b;
                                                                        if (str5 == null) {
                                                                            iIntValue = -1;
                                                                        } else {
                                                                            iIntValue = -1;
                                                                        }
                                                                        if (bVar4.t == 0) {
                                                                            if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                                                iIntValue = 0;
                                                                            } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                                                iIntValue = 90;
                                                                            } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                                                iIntValue = 180;
                                                                            } else {
                                                                                iIntValue = 180;
                                                                            }
                                                                        }
                                                                        c0062a.t = bVar4.n;
                                                                        c0062a.u = bVar4.o;
                                                                        c0062a.z = f;
                                                                        c0062a.y = iIntValue;
                                                                        c0062a.A = bVar4.x;
                                                                        c0062a.B = bVar4.y;
                                                                        c0062a.C = n58Var;
                                                                        i5 = 2;
                                                                    } else {
                                                                        if ("application/x-subrip".equals(str8)) {
                                                                        }
                                                                        i5 = 3;
                                                                    }
                                                                    str6 = bVar4.b;
                                                                    if (str6 != null) {
                                                                        c0062a.b = bVar4.b;
                                                                    }
                                                                    c0062a.a = Integer.toString(i28);
                                                                    c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                                                    c0062a.m = gqv.m(str8);
                                                                    c0062a.n = i3;
                                                                    c0062a.d = bVar4.Y;
                                                                    c0062a.e = i214;
                                                                    c0062a.p = list;
                                                                    c0062a.j = str2;
                                                                    c0062a.q = bVar4.m;
                                                                    androidx.media3.common.a aVar9 = new androidx.media3.common.a(c0062a);
                                                                    njg0 njg0VarR6 = m4hVar.r(bVar4.d, i5);
                                                                    bVar4.Z = njg0VarR6;
                                                                    njg0VarR6.d(aVar9);
                                                                    sparseArray.put(bVar4.d, bVar4);
                                                                    idvVar2 = idvVar9;
                                                                } else {
                                                                    i47 += 255;
                                                                    i45++;
                                                                }
                                                            }
                                                        } else {
                                                            i41 += 255;
                                                            i42 = i43 + 1;
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw ssz.a(bArrA, "Error parsing vorbis codec private");
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                bArrA = 0;
                                            }
                                            break;
                                        case 5:
                                            str8 = "audio/mpeg-L2";
                                            idvVar9 = idvVar9;
                                            iA2 = -1;
                                            str2 = null;
                                            i3 = 4096;
                                            list = null;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z10 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i215 = (z10 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map7 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3114 = bVar4.A;
                                                    int i3115 = bVar4.C;
                                                    int i3116 = bVar4.B;
                                                    int i3117 = bVar4.p;
                                                    n58Var = new n58(i3114, i3115, i3116, i3117, i3117, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i215;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar10 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR7 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR7;
                                            njg0VarR7.d(aVar10);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 6:
                                            str8 = "audio/mpeg";
                                            idvVar9 = idvVar9;
                                            iA2 = -1;
                                            str2 = null;
                                            i3 = 4096;
                                            list = null;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z11 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i216 = (z11 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map8 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3118 = bVar4.A;
                                                    int i3119 = bVar4.C;
                                                    int i31110 = bVar4.B;
                                                    int i31111 = bVar4.p;
                                                    n58Var = new n58(i3118, i3119, i31110, i31111, i31111, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i216;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar11 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR8 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR8;
                                            njg0VarR8.d(aVar11);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 7:
                                            nsz nszVar3 = new nsz(bVar4.a(bVar4.c));
                                            try {
                                                nszVar3.J(16);
                                                long jN = nszVar3.n();
                                                if (jN == 1482049860) {
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str3 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        runtimeException = null;
                                                    }
                                                } else {
                                                    if (jN == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (jN == 826496599) {
                                                            int i53 = nszVar3.b + 20;
                                                            byte[] bArr8 = nszVar3.a;
                                                            while (true) {
                                                                if (i53 < bArr8.length - 4) {
                                                                    if (bArr8[i53] == 0 && bArr8[i53 + 1] == 0 && bArr8[i53 + 2] == 1) {
                                                                        if (bArr8[i53 + 3] == 15) {
                                                                            pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i53, bArr8.length)));
                                                                        }
                                                                    }
                                                                    i53++;
                                                                } else {
                                                                    try {
                                                                        throw ssz.a(null, "Failed to find FourCC VC1 initialization data");
                                                                    } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                        runtimeException = null;
                                                                    }
                                                                }
                                                                throw ssz.a(runtimeException, "Error parsing FourCC private data");
                                                            }
                                                        }
                                                        cft.g("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str3 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                    }
                                                    str3 = null;
                                                }
                                                str8 = (String) pair.first;
                                                str2 = str3;
                                                list2 = (List) pair.second;
                                                iA2 = -1;
                                                list4 = list2;
                                                i3 = -1;
                                                list = list4;
                                                if (bVar4.P != null) {
                                                    str2 = (String) myeVarA.a;
                                                    str8 = "video/dolby-vision";
                                                }
                                                boolean z12 = bVar4.X;
                                                if (bVar4.W) {
                                                    i4 = 2;
                                                } else {
                                                    i4 = 0;
                                                }
                                                int i217 = (z12 ? 1 : 0) | i4;
                                                c0062a = new androidx.media3.common.a.C0062a();
                                                zI = gqv.i(str8);
                                                Map<String, Integer> map9 = k0;
                                                if (zI) {
                                                    c0062a.E = bVar4.Q;
                                                    c0062a.F = bVar4.S;
                                                    c0062a.G = iA2;
                                                    i5 = 1;
                                                } else if (gqv.l(str8)) {
                                                    if (bVar4.s == 0) {
                                                        i9 = bVar4.q;
                                                        i6 = -1;
                                                        if (i9 == -1) {
                                                            i9 = bVar4.n;
                                                        }
                                                        bVar4.q = i9;
                                                        i10 = bVar4.r;
                                                        if (i10 == -1) {
                                                            i10 = bVar4.o;
                                                        }
                                                        bVar4.r = i10;
                                                    } else {
                                                        i6 = -1;
                                                    }
                                                    i7 = bVar4.q;
                                                    if (i7 != i6) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (bVar4.z) {
                                                        if (bVar4.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i31112 = bVar4.A;
                                                        int i31113 = bVar4.C;
                                                        int i31114 = bVar4.B;
                                                        int i31115 = bVar4.p;
                                                        n58Var = new n58(i31112, i31113, i31114, i31115, i31115, bArr);
                                                    } else {
                                                        n58Var = null;
                                                    }
                                                    str5 = bVar4.b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (bVar4.t == 0) {
                                                        if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    c0062a.t = bVar4.n;
                                                    c0062a.u = bVar4.o;
                                                    c0062a.z = f;
                                                    c0062a.y = iIntValue;
                                                    c0062a.A = bVar4.x;
                                                    c0062a.B = bVar4.y;
                                                    c0062a.C = n58Var;
                                                    i5 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str8)) {
                                                    }
                                                    i5 = 3;
                                                }
                                                str6 = bVar4.b;
                                                if (str6 != null) {
                                                    c0062a.b = bVar4.b;
                                                }
                                                c0062a.a = Integer.toString(i28);
                                                c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                                c0062a.m = gqv.m(str8);
                                                c0062a.n = i3;
                                                c0062a.d = bVar4.Y;
                                                c0062a.e = i217;
                                                c0062a.p = list;
                                                c0062a.j = str2;
                                                c0062a.q = bVar4.m;
                                                androidx.media3.common.a aVar12 = new androidx.media3.common.a(c0062a);
                                                njg0 njg0VarR9 = m4hVar.r(bVar4.d, i5);
                                                bVar4.Z = njg0VarR9;
                                                njg0VarR9.d(aVar12);
                                                sparseArray.put(bVar4.d, bVar4);
                                                idvVar2 = idvVar9;
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                runtimeException = null;
                                            }
                                            break;
                                        case 8:
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(bVar4.a(str7), 0, bArr9, 0, 4);
                                            listSingletonList = pcn.n(bArr9);
                                            str8 = "application/dvbsubs";
                                            iA2 = -1;
                                            str2 = null;
                                            list4 = listSingletonList;
                                            i3 = -1;
                                            list = list4;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z13 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i218 = (z13 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map10 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31116 = bVar4.A;
                                                    int i31117 = bVar4.C;
                                                    int i31118 = bVar4.B;
                                                    int i31119 = bVar4.p;
                                                    n58Var = new n58(i31116, i31117, i31118, i31119, i31119, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i218;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar13 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR10 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR10;
                                            njg0VarR10.d(aVar13);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 10:
                                            cp1 cp1VarA = cp1.a(new nsz(bVar4.a(bVar4.c)));
                                            ArrayList arrayList2 = cp1VarA.a;
                                            bVar4.a0 = cp1VarA.b;
                                            str4 = cp1VarA.l;
                                            str8 = "video/avc";
                                            list3 = arrayList2;
                                            str2 = str4;
                                            list2 = list3;
                                            iA2 = -1;
                                            list4 = list2;
                                            i3 = -1;
                                            list = list4;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z14 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i219 = (z14 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map11 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311110 = bVar4.A;
                                                    int i311111 = bVar4.C;
                                                    int i311112 = bVar4.B;
                                                    int i311113 = bVar4.p;
                                                    n58Var = new n58(i311110, i311111, i311112, i311113, i311113, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i219;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar14 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR11 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR11;
                                            njg0VarR11.d(aVar14);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 11:
                                            listSingletonList = pcn.n(bVar4.a(str7));
                                            str8 = "application/vobsub";
                                            iA2 = -1;
                                            str2 = null;
                                            list4 = listSingletonList;
                                            i3 = -1;
                                            list = list4;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z15 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i2110 = (z15 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map12 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311114 = bVar4.A;
                                                    int i311115 = bVar4.C;
                                                    int i311116 = bVar4.B;
                                                    int i311117 = bVar4.p;
                                                    n58Var = new n58(i311114, i311115, i311116, i311117, i311117, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i2110;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar15 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR12 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR12;
                                            njg0VarR12.d(aVar15);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 12:
                                            str8 = "audio/vnd.dts.hd";
                                            idvVar9 = idvVar9;
                                            iA2 = -1;
                                            str2 = null;
                                            i3 = -1;
                                            list = null;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z16 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i2111 = (z16 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map13 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311118 = bVar4.A;
                                                    int i311119 = bVar4.C;
                                                    int i3111110 = bVar4.B;
                                                    int i3111111 = bVar4.p;
                                                    n58Var = new n58(i311118, i311119, i3111110, i3111111, i3111111, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i2111;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar16 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR13 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR13;
                                            njg0VarR13.d(aVar16);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 13:
                                            List<byte[]> listSingletonList2 = Collections.singletonList(bVar4.a(str7));
                                            byte[] bArr10 = bVar4.l;
                                            s1.a aVarB = s1.b(new msz(bArr10.length, bArr10), false);
                                            bVar4.S = aVarB.a;
                                            bVar4.Q = aVarB.b;
                                            String str10 = aVarB.c;
                                            str8 = "audio/mp4a-latm";
                                            str2 = str10;
                                            i3 = -1;
                                            list5 = listSingletonList2;
                                            list = list5;
                                            iA2 = -1;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z17 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i2112 = (z17 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map14 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111112 = bVar4.A;
                                                    int i3111113 = bVar4.C;
                                                    int i3111114 = bVar4.B;
                                                    int i3111115 = bVar4.p;
                                                    n58Var = new n58(i3111112, i3111113, i3111114, i3111115, i3111115, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i2112;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar17 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR14 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR14;
                                            njg0VarR14.d(aVar17);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 14:
                                            str8 = "audio/ac3";
                                            idvVar9 = idvVar9;
                                            iA2 = -1;
                                            str2 = null;
                                            i3 = -1;
                                            list = null;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z18 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i2113 = (z18 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map15 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111116 = bVar4.A;
                                                    int i3111117 = bVar4.C;
                                                    int i3111118 = bVar4.B;
                                                    int i3111119 = bVar4.p;
                                                    n58Var = new n58(i3111116, i3111117, i3111118, i3111119, i3111119, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i2113;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar18 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR15 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR15;
                                            njg0VarR15.d(aVar18);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 15:
                                        case 21:
                                            str8 = "audio/vnd.dts";
                                            idvVar9 = idvVar9;
                                            iA2 = -1;
                                            str2 = null;
                                            i3 = -1;
                                            list = null;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z19 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i2114 = (z19 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map16 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111110 = bVar4.A;
                                                    int i31111111 = bVar4.C;
                                                    int i31111112 = bVar4.B;
                                                    int i31111113 = bVar4.p;
                                                    n58Var = new n58(i31111110, i31111111, i31111112, i31111113, i31111113, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i2114;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar19 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR16 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR16;
                                            njg0VarR16.d(aVar19);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 16:
                                            byte[] bArr11 = bVar4.l;
                                            listN = bArr11 == null ? null : pcn.n(bArr11);
                                            str8 = "video/av01";
                                            listSingletonList = listN;
                                            iA2 = -1;
                                            str2 = null;
                                            list4 = listSingletonList;
                                            i3 = -1;
                                            list = list4;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z110 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i2115 = (z110 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map17 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111114 = bVar4.A;
                                                    int i31111115 = bVar4.C;
                                                    int i31111116 = bVar4.B;
                                                    int i31111117 = bVar4.p;
                                                    n58Var = new n58(i31111114, i31111115, i31111116, i31111117, i31111117, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i2115;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar110 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR17 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR17;
                                            njg0VarR17.d(aVar110);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 17:
                                            str8 = "video/x-vnd.on2.vp8";
                                            idvVar9 = idvVar9;
                                            iA2 = -1;
                                            str2 = null;
                                            i3 = -1;
                                            list = null;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z111 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i2116 = (z111 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map18 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111118 = bVar4.A;
                                                    int i31111119 = bVar4.C;
                                                    int i311111110 = bVar4.B;
                                                    int i311111111 = bVar4.p;
                                                    n58Var = new n58(i31111118, i31111119, i311111110, i311111111, i311111111, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i2116;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar111 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR18 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR18;
                                            njg0VarR18.d(aVar111);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 18:
                                            byte[] bArr12 = bVar4.l;
                                            listN = bArr12 == null ? null : pcn.n(bArr12);
                                            str8 = "video/x-vnd.on2.vp9";
                                            listSingletonList = listN;
                                            iA2 = -1;
                                            str2 = null;
                                            list4 = listSingletonList;
                                            i3 = -1;
                                            list = list4;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z112 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i2117 = (z112 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map19 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111112 = bVar4.A;
                                                    int i311111113 = bVar4.C;
                                                    int i311111114 = bVar4.B;
                                                    int i311111115 = bVar4.p;
                                                    n58Var = new n58(i311111112, i311111113, i311111114, i311111115, i311111115, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i2117;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar112 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR19 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR19;
                                            njg0VarR19.d(aVar112);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 19:
                                            idvVar9 = idvVar9;
                                            str8 = "application/pgs";
                                            iA2 = -1;
                                            str2 = null;
                                            i3 = -1;
                                            list = null;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z113 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i2118 = (z113 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map110 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111116 = bVar4.A;
                                                    int i311111117 = bVar4.C;
                                                    int i311111118 = bVar4.B;
                                                    int i311111119 = bVar4.p;
                                                    n58Var = new n58(i311111116, i311111117, i311111118, i311111119, i311111119, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i2118;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar113 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR110 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR110;
                                            njg0VarR110.d(aVar113);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 20:
                                            idvVar9 = idvVar9;
                                            iA2 = -1;
                                            str2 = null;
                                            i3 = -1;
                                            list = null;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z114 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i2119 = (z114 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map111 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111110 = bVar4.A;
                                                    int i3111111111 = bVar4.C;
                                                    int i3111111112 = bVar4.B;
                                                    int i3111111113 = bVar4.p;
                                                    n58Var = new n58(i3111111110, i3111111111, i3111111112, i3111111113, i3111111113, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i2119;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar114 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR111 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR111;
                                            njg0VarR111.d(aVar114);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 22:
                                            if (bVar4.R == 32) {
                                                idvVar9 = idvVar9;
                                                str8 = "audio/raw";
                                                iA2 = 4;
                                            } else {
                                                cft.g("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + bVar4.R + ". Setting mimeType to audio/x-unknown");
                                                idvVar9 = idvVar9;
                                                str8 = "audio/x-unknown";
                                                iA2 = -1;
                                            }
                                            str2 = null;
                                            i3 = -1;
                                            list = null;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z115 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i21110 = (z115 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map112 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111114 = bVar4.A;
                                                    int i3111111115 = bVar4.C;
                                                    int i3111111116 = bVar4.B;
                                                    int i3111111117 = bVar4.p;
                                                    n58Var = new n58(i3111111114, i3111111115, i3111111116, i3111111117, i3111111117, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i21110;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar115 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR112 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR112;
                                            njg0VarR112.d(aVar115);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                                            int i54 = bVar4.R;
                                            if (i54 == 8) {
                                                idvVar9 = idvVar9;
                                                str8 = "audio/raw";
                                                iA2 = 3;
                                            } else {
                                                if (i54 == 16) {
                                                    iA2 = 268435456;
                                                } else if (i54 == 24) {
                                                    iA2 = 1342177280;
                                                } else if (i54 == 32) {
                                                    iA2 = 1610612736;
                                                } else {
                                                    cft.g("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + bVar4.R + ". Setting mimeType to audio/x-unknown");
                                                    idvVar9 = idvVar9;
                                                    str8 = "audio/x-unknown";
                                                    iA2 = -1;
                                                }
                                                idvVar9 = idvVar9;
                                                str8 = "audio/raw";
                                            }
                                            str2 = null;
                                            i3 = -1;
                                            list = null;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z116 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i21111 = (z116 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map113 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111118 = bVar4.A;
                                                    int i3111111119 = bVar4.C;
                                                    int i31111111110 = bVar4.B;
                                                    int i31111111111 = bVar4.p;
                                                    n58Var = new n58(i3111111118, i3111111119, i31111111110, i31111111111, i31111111111, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i21111;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar116 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR113 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR113;
                                            njg0VarR113.d(aVar116);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 24:
                                            int i55 = bVar4.R;
                                            String str11 = jrh0.a;
                                            iA2 = jrh0.A(i55, ByteOrder.LITTLE_ENDIAN);
                                            if (iA2 == 0) {
                                                cft.g("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + bVar4.R + ". Setting mimeType to audio/x-unknown");
                                                idvVar9 = idvVar9;
                                                str8 = "audio/x-unknown";
                                                iA2 = -1;
                                                str2 = null;
                                                i3 = -1;
                                                list = null;
                                                if (bVar4.P != null) {
                                                    str2 = (String) myeVarA.a;
                                                    str8 = "video/dolby-vision";
                                                }
                                                boolean z117 = bVar4.X;
                                                if (bVar4.W) {
                                                    i4 = 2;
                                                } else {
                                                    i4 = 0;
                                                }
                                                int i21112 = (z117 ? 1 : 0) | i4;
                                                c0062a = new androidx.media3.common.a.C0062a();
                                                zI = gqv.i(str8);
                                                Map<String, Integer> map114 = k0;
                                                if (zI) {
                                                    c0062a.E = bVar4.Q;
                                                    c0062a.F = bVar4.S;
                                                    c0062a.G = iA2;
                                                    i5 = 1;
                                                } else if (gqv.l(str8)) {
                                                    if (bVar4.s == 0) {
                                                        i9 = bVar4.q;
                                                        i6 = -1;
                                                        if (i9 == -1) {
                                                            i9 = bVar4.n;
                                                        }
                                                        bVar4.q = i9;
                                                        i10 = bVar4.r;
                                                        if (i10 == -1) {
                                                            i10 = bVar4.o;
                                                        }
                                                        bVar4.r = i10;
                                                    } else {
                                                        i6 = -1;
                                                    }
                                                    i7 = bVar4.q;
                                                    if (i7 != i6) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (bVar4.z) {
                                                        if (bVar4.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i31111111112 = bVar4.A;
                                                        int i31111111113 = bVar4.C;
                                                        int i31111111114 = bVar4.B;
                                                        int i31111111115 = bVar4.p;
                                                        n58Var = new n58(i31111111112, i31111111113, i31111111114, i31111111115, i31111111115, bArr);
                                                    } else {
                                                        n58Var = null;
                                                    }
                                                    str5 = bVar4.b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (bVar4.t == 0) {
                                                        if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    c0062a.t = bVar4.n;
                                                    c0062a.u = bVar4.o;
                                                    c0062a.z = f;
                                                    c0062a.y = iIntValue;
                                                    c0062a.A = bVar4.x;
                                                    c0062a.B = bVar4.y;
                                                    c0062a.C = n58Var;
                                                    i5 = 2;
                                                } else {
                                                    if ("application/x-subrip".equals(str8)) {
                                                    }
                                                    i5 = 3;
                                                }
                                                str6 = bVar4.b;
                                                if (str6 != null) {
                                                    c0062a.b = bVar4.b;
                                                }
                                                c0062a.a = Integer.toString(i28);
                                                c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                                c0062a.m = gqv.m(str8);
                                                c0062a.n = i3;
                                                c0062a.d = bVar4.Y;
                                                c0062a.e = i21112;
                                                c0062a.p = list;
                                                c0062a.j = str2;
                                                c0062a.q = bVar4.m;
                                                androidx.media3.common.a aVar117 = new androidx.media3.common.a(c0062a);
                                                njg0 njg0VarR114 = m4hVar.r(bVar4.d, i5);
                                                bVar4.Z = njg0VarR114;
                                                njg0VarR114.d(aVar117);
                                                sparseArray.put(bVar4.d, bVar4);
                                                idvVar2 = idvVar9;
                                            }
                                            idvVar9 = idvVar9;
                                            str8 = "audio/raw";
                                            str2 = null;
                                            i3 = -1;
                                            list = null;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z118 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i21113 = (z118 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map115 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111116 = bVar4.A;
                                                    int i31111111117 = bVar4.C;
                                                    int i31111111118 = bVar4.B;
                                                    int i31111111119 = bVar4.p;
                                                    n58Var = new n58(i31111111116, i31111111117, i31111111118, i31111111119, i31111111119, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i21113;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar118 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR115 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR115;
                                            njg0VarR115.d(aVar118);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                                        case RuntimeVersion.MINOR /* 26 */:
                                            listSingletonList = pcn.o(g0, bVar4.a(str7));
                                            str8 = "text/x-ssa";
                                            iA2 = -1;
                                            str2 = null;
                                            list4 = listSingletonList;
                                            i3 = -1;
                                            list = list4;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z119 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i21114 = (z119 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map116 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111111110 = bVar4.A;
                                                    int i311111111111 = bVar4.C;
                                                    int i311111111112 = bVar4.B;
                                                    int i311111111113 = bVar4.p;
                                                    n58Var = new n58(i311111111110, i311111111111, i311111111112, i311111111113, i311111111113, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i21114;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar119 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR116 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR116;
                                            njg0VarR116.d(aVar119);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                            gjl gjlVarA = gjl.a(new nsz(bVar4.a(bVar4.c)), false, null);
                                            List<byte[]> list6 = gjlVarA.a;
                                            bVar4.a0 = gjlVarA.b;
                                            str4 = gjlVarA.n;
                                            str8 = "video/hevc";
                                            list3 = list6;
                                            str2 = str4;
                                            list2 = list3;
                                            iA2 = -1;
                                            list4 = list2;
                                            i3 = -1;
                                            list = list4;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z1110 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i21115 = (z1110 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map117 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111111114 = bVar4.A;
                                                    int i311111111115 = bVar4.C;
                                                    int i311111111116 = bVar4.B;
                                                    int i311111111117 = bVar4.p;
                                                    n58Var = new n58(i311111111114, i311111111115, i311111111116, i311111111117, i311111111117, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i21115;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar1110 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR117 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR117;
                                            njg0VarR117.d(aVar1110);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 28:
                                            idvVar9 = idvVar9;
                                            str8 = "text/vtt";
                                            iA2 = -1;
                                            str2 = null;
                                            i3 = -1;
                                            list = null;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z1111 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i21116 = (z1111 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map118 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111111118 = bVar4.A;
                                                    int i311111111119 = bVar4.C;
                                                    int i3111111111110 = bVar4.B;
                                                    int i3111111111111 = bVar4.p;
                                                    n58Var = new n58(i311111111118, i311111111119, i3111111111110, i3111111111111, i3111111111111, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i21116;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar1111 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR118 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR118;
                                            njg0VarR118.d(aVar1111);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 29:
                                            idvVar9 = idvVar9;
                                            str8 = "application/x-subrip";
                                            iA2 = -1;
                                            str2 = null;
                                            i3 = -1;
                                            list = null;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z1112 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i21117 = (z1112 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map119 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111111112 = bVar4.A;
                                                    int i3111111111113 = bVar4.C;
                                                    int i3111111111114 = bVar4.B;
                                                    int i3111111111115 = bVar4.p;
                                                    n58Var = new n58(i3111111111112, i3111111111113, i3111111111114, i3111111111115, i3111111111115, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i21117;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar1112 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR119 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR119;
                                            njg0VarR119.d(aVar1112);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 30:
                                            str8 = "video/mpeg2";
                                            idvVar9 = idvVar9;
                                            iA2 = -1;
                                            str2 = null;
                                            i3 = -1;
                                            list = null;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z1113 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i21118 = (z1113 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map1110 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111111116 = bVar4.A;
                                                    int i3111111111117 = bVar4.C;
                                                    int i3111111111118 = bVar4.B;
                                                    int i3111111111119 = bVar4.p;
                                                    n58Var = new n58(i3111111111116, i3111111111117, i3111111111118, i3111111111119, i3111111111119, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i21118;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar1113 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR1110 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR1110;
                                            njg0VarR1110.d(aVar1113);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                            str8 = "audio/eac3";
                                            idvVar9 = idvVar9;
                                            iA2 = -1;
                                            str2 = null;
                                            i3 = -1;
                                            list = null;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z1114 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i21119 = (z1114 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map1111 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111111110 = bVar4.A;
                                                    int i31111111111111 = bVar4.C;
                                                    int i31111111111112 = bVar4.B;
                                                    int i31111111111113 = bVar4.p;
                                                    n58Var = new n58(i31111111111110, i31111111111111, i31111111111112, i31111111111113, i31111111111113, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i21119;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar1114 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR1111 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR1111;
                                            njg0VarR1111.d(aVar1114);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 32:
                                            listN = Collections.singletonList(bVar4.a(str7));
                                            str8 = "audio/flac";
                                            listSingletonList = listN;
                                            iA2 = -1;
                                            str2 = null;
                                            list4 = listSingletonList;
                                            i3 = -1;
                                            list = list4;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z1115 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i211110 = (z1115 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map1112 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111111114 = bVar4.A;
                                                    int i31111111111115 = bVar4.C;
                                                    int i31111111111116 = bVar4.B;
                                                    int i31111111111117 = bVar4.p;
                                                    n58Var = new n58(i31111111111114, i31111111111115, i31111111111116, i31111111111117, i31111111111117, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i211110;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar1115 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR1112 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR1112;
                                            njg0VarR1112.d(aVar1115);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        case 33:
                                            ArrayList arrayList3 = new ArrayList(3);
                                            arrayList3.add(bVar4.a(bVar4.c));
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            arrayList3.add(byteBufferAllocate.order(byteOrder).putLong(bVar4.T).array());
                                            arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(bVar4.U).array());
                                            str8 = "audio/opus";
                                            i3 = 5760;
                                            str2 = null;
                                            list5 = arrayList3;
                                            list = list5;
                                            iA2 = -1;
                                            if (bVar4.P != null) {
                                                str2 = (String) myeVarA.a;
                                                str8 = "video/dolby-vision";
                                            }
                                            boolean z1116 = bVar4.X;
                                            if (bVar4.W) {
                                                i4 = 2;
                                            } else {
                                                i4 = 0;
                                            }
                                            int i211111 = (z1116 ? 1 : 0) | i4;
                                            c0062a = new androidx.media3.common.a.C0062a();
                                            zI = gqv.i(str8);
                                            Map<String, Integer> map1113 = k0;
                                            if (zI) {
                                                c0062a.E = bVar4.Q;
                                                c0062a.F = bVar4.S;
                                                c0062a.G = iA2;
                                                i5 = 1;
                                            } else if (gqv.l(str8)) {
                                                if (bVar4.s == 0) {
                                                    i9 = bVar4.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = bVar4.n;
                                                    }
                                                    bVar4.q = i9;
                                                    i10 = bVar4.r;
                                                    if (i10 == -1) {
                                                        i10 = bVar4.o;
                                                    }
                                                    bVar4.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = bVar4.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (bVar4.z) {
                                                    if (bVar4.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111111118 = bVar4.A;
                                                    int i31111111111119 = bVar4.C;
                                                    int i311111111111110 = bVar4.B;
                                                    int i311111111111111 = bVar4.p;
                                                    n58Var = new n58(i31111111111118, i31111111111119, i311111111111110, i311111111111111, i311111111111111, bArr);
                                                } else {
                                                    n58Var = null;
                                                }
                                                str5 = bVar4.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bVar4.t == 0) {
                                                    if (Float.compare(bVar4.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(bVar4.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(bVar4.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c0062a.t = bVar4.n;
                                                c0062a.u = bVar4.o;
                                                c0062a.z = f;
                                                c0062a.y = iIntValue;
                                                c0062a.A = bVar4.x;
                                                c0062a.B = bVar4.y;
                                                c0062a.C = n58Var;
                                                i5 = 2;
                                            } else {
                                                if ("application/x-subrip".equals(str8)) {
                                                }
                                                i5 = 3;
                                            }
                                            str6 = bVar4.b;
                                            if (str6 != null) {
                                                c0062a.b = bVar4.b;
                                            }
                                            c0062a.a = Integer.toString(i28);
                                            c0062a.l = gqv.m(bVar4.a ? "video/webm" : "video/x-matroska");
                                            c0062a.m = gqv.m(str8);
                                            c0062a.n = i3;
                                            c0062a.d = bVar4.Y;
                                            c0062a.e = i211111;
                                            c0062a.p = list;
                                            c0062a.j = str2;
                                            c0062a.q = bVar4.m;
                                            androidx.media3.common.a aVar1116 = new androidx.media3.common.a(c0062a);
                                            njg0 njg0VarR1113 = m4hVar.r(bVar4.d, i5);
                                            bVar4.Z = njg0VarR1113;
                                            njg0VarR1113.d(aVar1116);
                                            sparseArray.put(bVar4.d, bVar4);
                                            idvVar2 = idvVar9;
                                            break;
                                        default:
                                            throw ssz.a(null, "Unrecognized codec identifier.");
                                    }
                                    break;
                                default:
                                    idvVar2 = idvVar9;
                                    break;
                            }
                            idvVar2.x = null;
                        } else {
                            if (i21 == 19899) {
                                int i56 = idvVar9.z;
                                if (i56 != i12) {
                                    long j8 = idvVar9.A;
                                    if (j8 != -1) {
                                        if (i56 == 475249515) {
                                            idvVar9.C = j8;
                                        }
                                    }
                                }
                                throw ssz.a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i21 == 25152) {
                                idvVar9.f(i21);
                                b bVar5 = idvVar9.x;
                                if (bVar5.i) {
                                    njg0.a aVar20 = bVar5.k;
                                    if (aVar20 == null) {
                                        throw ssz.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    bVar5.m = new DrmInitData(null, true, new DrmInitData.SchemeData(vl5.a, null, "video/webm", aVar20.b));
                                }
                            } else if (i21 == 28032) {
                                idvVar9.f(i21);
                                b bVar6 = idvVar9.x;
                                if (bVar6.i && bVar6.j != null) {
                                    throw ssz.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i21 == 357149030) {
                                if (idvVar9.t == -9223372036854775807L) {
                                    idvVar9.t = 1000000L;
                                }
                                long j9 = idvVar9.u;
                                if (j9 != -9223372036854775807L) {
                                    idvVar9.v = idvVar9.m(j9);
                                }
                            } else if (i21 == 374648427) {
                                if (sparseArray.size() == 0) {
                                    throw ssz.a(null, "No valid tracks were found");
                                }
                                idvVar9.e0.n();
                            } else if (i21 == 475249515) {
                                if (!idvVar9.y) {
                                    m4h m4hVar2 = idvVar9.e0;
                                    jjt jjtVar = idvVar9.F;
                                    jjt jjtVar2 = idvVar9.G;
                                    if (idvVar9.s == -1 || idvVar9.v == -9223372036854775807L || jjtVar == null || (i11 = jjtVar.a) == 0 || jjtVar2 == null || jjtVar2.a != i11) {
                                        bVar = new p480.b(idvVar9.v);
                                    } else {
                                        int[] iArrCopyOf = new int[i11];
                                        long[] jArrCopyOf = new long[i11];
                                        long[] jArrCopyOf2 = new long[i11];
                                        long[] jArrCopyOf3 = new long[i11];
                                        for (int i57 = 0; i57 < i11; i57++) {
                                            jArrCopyOf3[i57] = jjtVar.c(i57);
                                            jArrCopyOf[i57] = jjtVar2.c(i57) + idvVar9.s;
                                        }
                                        int i58 = 0;
                                        while (true) {
                                            int i59 = i11 - 1;
                                            if (i58 < i59) {
                                                int i60 = i58 + 1;
                                                iArrCopyOf[i58] = (int) (jArrCopyOf[i60] - jArrCopyOf[i58]);
                                                jArrCopyOf2[i58] = jArrCopyOf3[i60] - jArrCopyOf3[i58];
                                                i58 = i60;
                                            } else {
                                                int i61 = i59;
                                                while (i61 > 0 && jArrCopyOf3[i61] > idvVar9.v) {
                                                    i61--;
                                                }
                                                iArrCopyOf[i61] = (int) ((idvVar9.s + idvVar9.r) - jArrCopyOf[i61]);
                                                jArrCopyOf2[i61] = idvVar9.v - jArrCopyOf3[i61];
                                                if (i61 < i59) {
                                                    cft.g("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
                                                    int i62 = i61 + 1;
                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i62);
                                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i62);
                                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i62);
                                                    jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i62);
                                                }
                                                bVar = new nn7(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                                            }
                                        }
                                    }
                                    m4hVar2.k(bVar);
                                    idvVar9.y = true;
                                }
                                idvVar9.F = null;
                                idvVar9.G = null;
                            }
                        }
                        z2 = false;
                        l4hVar2 = l4hVar;
                    }
                    z3 = true;
                }
                if (z3) {
                    long position2 = l4hVar2.getPosition();
                    idvVar = this;
                    if (idvVar.B) {
                        idvVar.D = position2;
                        k620Var.a = idvVar.C;
                        idvVar.B = z2;
                        return 1;
                    }
                    if (idvVar.y) {
                        long j10 = idvVar.D;
                        if (j10 != -1) {
                            k620Var.a = j10;
                            idvVar.D = -1L;
                            return 1;
                        }
                    } else {
                        continue;
                    }
                } else {
                    idvVar = this;
                }
                idvVar3 = idvVar;
            }
        }
        idv idvVar10 = idvVar3;
        if (z3) {
            return 0;
        }
        int i63 = 0;
        while (true) {
            SparseArray<b> sparseArray2 = idvVar10.c;
            if (i63 >= sparseArray2.size()) {
                return -1;
            }
            b bVarValueAt = sparseArray2.valueAt(i63);
            bVarValueAt.Z.getClass();
            jxg0 jxg0Var = bVarValueAt.V;
            if (jxg0Var != null) {
                jxg0Var.a(bVarValueAt.Z, bVarValueAt.k);
            }
            i63++;
        }
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) throws EOFException, InterruptedIOException {
        y6a0 y6a0Var = new y6a0();
        jcd jcdVar = (jcd) l4hVar;
        long j = jcdVar.c;
        long j2 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (j != -1 && j <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j2 = j;
        }
        int i = (int) j2;
        nsz nszVar = y6a0Var.a;
        jcdVar.c(nszVar.a, 0, 4, false);
        y6a0Var.b = 4;
        for (long jY = nszVar.y(); jY != 440786851; jY = ((jY << 8) & (-256)) | ((long) (nszVar.a[0] & 255))) {
            int i2 = y6a0Var.b + 1;
            y6a0Var.b = i2;
            if (i2 == i) {
                return false;
            }
            jcdVar.c(nszVar.a, 0, 1, false);
        }
        long jA = y6a0Var.a(jcdVar);
        long j3 = y6a0Var.b;
        if (jA != Long.MIN_VALUE && (j == -1 || j3 + jA < j)) {
            while (true) {
                long j4 = y6a0Var.b;
                long j5 = j3 + jA;
                if (j4 < j5) {
                    if (y6a0Var.a(jcdVar) == Long.MIN_VALUE) {
                        break;
                    }
                    long jA2 = y6a0Var.a(jcdVar);
                    if (jA2 < 0 || jA2 > 2147483647L) {
                        break;
                    }
                    if (jA2 != 0) {
                        int i3 = (int) jA2;
                        jcdVar.n(i3, false);
                        y6a0Var.b += i3;
                    }
                } else if (j4 == j5) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        this.E = -9223372036854775807L;
        this.J = 0;
        acd acdVar = this.a;
        acdVar.e = 0;
        acdVar.b.clear();
        nvh0 nvh0Var = acdVar.c;
        nvh0Var.b = 0;
        nvh0Var.c = 0;
        nvh0 nvh0Var2 = this.b;
        nvh0Var2.b = 0;
        nvh0Var2.c = 0;
        k();
        int i = 0;
        while (true) {
            SparseArray<b> sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            jxg0 jxg0Var = sparseArray.valueAt(i).V;
            if (jxg0Var != null) {
                jxg0Var.b = false;
                jxg0Var.c = 0;
            }
            i++;
        }
    }

    public final void d(int i) throws ssz {
        if (this.F == null || this.G == null) {
            throw ssz.a(null, "Element " + i + " must be in a Cues");
        }
    }

    public final void f(int i) throws ssz {
        if (this.x != null) {
            return;
        }
        throw ssz.a(null, "Element " + i + " must be in a TrackEntry");
    }

    public final void g(b bVar, long j, int i, int i2, int i3) {
        byte[] bArrH;
        int i4;
        int i5;
        jxg0 jxg0Var = bVar.V;
        if (jxg0Var != null) {
            jxg0Var.b(bVar.Z, j, i, i2, i3, bVar.k);
        } else {
            if ("S_TEXT/UTF8".equals(bVar.c) || "S_TEXT/ASS".equals(bVar.c) || "S_TEXT/SSA".equals(bVar.c) || "S_TEXT/WEBVTT".equals(bVar.c)) {
                if (this.N > 1) {
                    cft.g("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.L;
                    if (j2 == -9223372036854775807L) {
                        cft.g("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = bVar.c;
                        nsz nszVar = this.m;
                        byte[] bArr = nszVar.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                bArrH = h(j2, "%01d:%02d:%02d:%02d", 10000L);
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrH = h(j2, "%02d:%02d:%02d.%03d", 1000L);
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrH = h(j2, "%02d:%02d:%02d,%03d", 1000L);
                                i4 = 19;
                                break;
                            default:
                                d580.a();
                                return;
                        }
                        System.arraycopy(bArrH, 0, bArr, i4, bArrH.length);
                        for (int i6 = nszVar.b; i6 < nszVar.c; i6++) {
                            if (nszVar.a[i6] == 0) {
                                nszVar.H(i6);
                                bVar.Z.f(nszVar.c, nszVar);
                                i5 = i2 + nszVar.c;
                            }
                        }
                        bVar.Z.f(nszVar.c, nszVar);
                        i5 = i2 + nszVar.c;
                    }
                }
                i5 = i2;
            } else {
                i5 = i2;
            }
            if ((i & 268435456) != 0) {
                int i7 = this.N;
                nsz nszVar2 = this.p;
                if (i7 > 1) {
                    nszVar2.F(0);
                } else {
                    int i8 = nszVar2.c;
                    bVar.Z.b(nszVar2, i8, 2);
                    i5 += i8;
                }
            }
            bVar.Z.a(j, i, i5, i3, bVar.k);
        }
        this.I = true;
    }

    public final void j(l4h l4hVar, int i) {
        nsz nszVar = this.i;
        if (nszVar.c >= i) {
            return;
        }
        byte[] bArr = nszVar.a;
        if (bArr.length < i) {
            nszVar.c(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = nszVar.a;
        int i2 = nszVar.c;
        l4hVar.readFully(bArr2, i2, i - i2);
        nszVar.H(i);
    }

    public final void k() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.b0 = 0;
        this.c0 = (byte) 0;
        this.d0 = false;
        this.l.F(0);
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        if (this.e) {
            m4hVar = new see0(m4hVar, this.f);
        }
        this.e0 = m4hVar;
    }

    public final long m(long j) throws ssz {
        long j2 = this.t;
        if (j2 == -9223372036854775807L) {
            throw ssz.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = jrh0.a;
        return jrh0.V(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x016d  */
    public final int n(l4h l4hVar, b bVar, int i, boolean z) throws ssz {
        int iC;
        int iC2;
        int i2;
        boolean z2;
        int i3;
        if ("S_TEXT/UTF8".equals(bVar.c)) {
            o(l4hVar, f0, i);
            int i4 = this.W;
            k();
            return i4;
        }
        if ("S_TEXT/ASS".equals(bVar.c) || "S_TEXT/SSA".equals(bVar.c)) {
            o(l4hVar, h0, i);
            int i5 = this.W;
            k();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(bVar.c)) {
            o(l4hVar, i0, i);
            int i6 = this.W;
            k();
            return i6;
        }
        njg0 njg0Var = bVar.Z;
        boolean z3 = this.Y;
        nsz nszVar = this.l;
        int i7 = 2;
        if (!z3) {
            boolean z4 = bVar.i;
            nsz nszVar2 = this.i;
            if (z4) {
                this.R &= -1073741825;
                if (!this.Z) {
                    l4hVar.readFully(nszVar2.a, 0, 1);
                    this.V++;
                    byte b2 = nszVar2.a[0];
                    if ((b2 & 128) == 128) {
                        throw ssz.a(null, "Extension bit is set in signal byte");
                    }
                    this.c0 = b2;
                    this.Z = true;
                }
                byte b3 = this.c0;
                if ((b3 & 1) != 1) {
                    i2 = 2;
                } else {
                    boolean z5 = (b3 & 2) == 2;
                    this.R |= 1073741824;
                    if (!this.d0) {
                        nsz nszVar3 = this.n;
                        l4hVar.readFully(nszVar3.a, 0, 8);
                        this.V += 8;
                        this.d0 = true;
                        nszVar2.a[0] = (byte) ((z5 ? 128 : 0) | 8);
                        nszVar2.I(0);
                        njg0Var.b(nszVar2, 1, 1);
                        this.W++;
                        nszVar3.I(0);
                        njg0Var.b(nszVar3, 8, 1);
                        this.W += 8;
                    }
                    if (z5) {
                        if (!this.a0) {
                            l4hVar.readFully(nszVar2.a, 0, 1);
                            this.V++;
                            nszVar2.I(0);
                            this.b0 = nszVar2.w();
                            this.a0 = true;
                        }
                        int i8 = this.b0 * 4;
                        nszVar2.F(i8);
                        l4hVar.readFully(nszVar2.a, 0, i8);
                        this.V += i8;
                        short s = (short) ((this.b0 / 2) + 1);
                        int i9 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.q = ByteBuffer.allocate(i9);
                        }
                        this.q.position(0);
                        this.q.putShort(s);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i3 = this.b0;
                            if (i10 >= i3) {
                                break;
                            }
                            int iA = nszVar2.A();
                            int i12 = i10 % 2;
                            int i13 = i7;
                            ByteBuffer byteBuffer2 = this.q;
                            if (i12 == 0) {
                                byteBuffer2.putShort((short) (iA - i11));
                            } else {
                                byteBuffer2.putInt(iA - i11);
                            }
                            i10++;
                            i11 = iA;
                            i7 = i13;
                        }
                        i2 = i7;
                        int i14 = (i - this.V) - i11;
                        int i15 = i3 % 2;
                        ByteBuffer byteBuffer3 = this.q;
                        if (i15 == 1) {
                            byteBuffer3.putInt(i14);
                        } else {
                            byteBuffer3.putShort((short) i14);
                            this.q.putInt(0);
                        }
                        byte[] bArrArray = this.q.array();
                        nsz nszVar4 = this.o;
                        nszVar4.G(i9, bArrArray);
                        njg0Var.b(nszVar4, i9, 1);
                        this.W += i9;
                    } else {
                        i2 = 2;
                    }
                }
            } else {
                i2 = 2;
                byte[] bArr = bVar.j;
                if (bArr != null) {
                    nszVar.G(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(bVar.c)) {
                z2 = z;
            } else {
                z2 = bVar.g > 0;
            }
            if (z2) {
                this.R |= 268435456;
                this.p.F(0);
                int i16 = (nszVar.c + i) - this.V;
                nszVar2.F(4);
                byte[] bArr2 = nszVar2.a;
                bArr2[0] = (byte) ((i16 >> 24) & 255);
                bArr2[1] = (byte) ((i16 >> 16) & 255);
                bArr2[i2] = (byte) ((i16 >> 8) & 255);
                bArr2[3] = (byte) (i16 & 255);
                njg0Var.b(nszVar2, 4, i2);
                this.W += 4;
            }
            this.Y = true;
        }
        int i17 = i + nszVar.c;
        if (!"V_MPEG4/ISO/AVC".equals(bVar.c) && !"V_MPEGH/ISO/HEVC".equals(bVar.c)) {
            if (bVar.V != null) {
                ly0.f(nszVar.c == 0);
                bVar.V.c(l4hVar);
            }
            while (true) {
                int i18 = this.V;
                if (i18 >= i17) {
                    break;
                }
                int i19 = i17 - i18;
                int iA2 = nszVar.a();
                if (iA2 > 0) {
                    iC2 = Math.min(i19, iA2);
                    njg0Var.f(iC2, nszVar);
                } else {
                    iC2 = njg0Var.c(l4hVar, i19, false);
                }
                this.V += iC2;
                this.W += iC2;
            }
        } else {
            nsz nszVar5 = this.h;
            byte[] bArr3 = nszVar5.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i20 = bVar.a0;
            int i21 = 4 - i20;
            while (this.V < i17) {
                int i22 = this.X;
                if (i22 == 0) {
                    int iMin = Math.min(i20, nszVar.a());
                    l4hVar.readFully(bArr3, i21 + iMin, i20 - iMin);
                    if (iMin > 0) {
                        nszVar.h(bArr3, i21, iMin);
                    }
                    this.V += i20;
                    nszVar5.I(0);
                    this.X = nszVar5.A();
                    nsz nszVar6 = this.g;
                    nszVar6.I(0);
                    njg0Var.f(4, nszVar6);
                    this.W += 4;
                } else {
                    int iA3 = nszVar.a();
                    if (iA3 > 0) {
                        iC = Math.min(i22, iA3);
                        njg0Var.f(iC, nszVar);
                    } else {
                        iC = njg0Var.c(l4hVar, i22, false);
                    }
                    this.V += iC;
                    this.W += iC;
                    this.X -= iC;
                }
            }
        }
        if ("A_VORBIS".equals(bVar.c)) {
            nsz nszVar7 = this.j;
            nszVar7.I(0);
            njg0Var.f(4, nszVar7);
            this.W += 4;
        }
        int i23 = this.W;
        k();
        return i23;
    }

    public final void o(l4h l4hVar, byte[] bArr, int i) {
        int length = bArr.length + i;
        nsz nszVar = this.m;
        byte[] bArr2 = nszVar.a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            nszVar.G(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        l4hVar.readFully(nszVar.a, bArr.length, i);
        nszVar.I(0);
        nszVar.H(length);
    }

    @Override // defpackage.k4h
    public final void release() {
    }
}
