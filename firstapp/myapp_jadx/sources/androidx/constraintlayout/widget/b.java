package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import com.sporty.android.core.model.patron.KYCBannerItem;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import defpackage.b9p;
import defpackage.bq7;
import defpackage.d9h0;
import defpackage.hb5;
import defpackage.he;
import defpackage.skf;
import defpackage.wk30;
import defpackage.zj30;
import defpackage.zzc;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final int[] h = {0, 4, 8};
    public static final SparseIntArray i;
    public static final SparseIntArray j;
    public String a;
    public String b = "";
    public String[] c = new String[0];
    public int d = 0;
    public final HashMap<String, androidx.constraintlayout.widget.a> e = new HashMap<>();
    public boolean f = true;
    public final HashMap<Integer, a> g = new HashMap<>();

    public static class a {
        public int a;
        public String b;
        public final d c;
        public final c d;
        public final C0054b e;
        public final e f;
        public HashMap<String, androidx.constraintlayout.widget.a> g;
        public C0053a h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$a$a, reason: collision with other inner class name */
        public static class C0053a {
            public int[] a;
            public int[] b;
            public int c;
            public int[] d;
            public float[] e;
            public int f;
            public int[] g;
            public String[] h;
            public int i;
            public int[] j;
            public boolean[] k;
            public int l;

            public final void a(int i, float f) {
                int i2 = this.f;
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i3 = this.f;
                iArr2[i3] = i;
                float[] fArr2 = this.e;
                this.f = i3 + 1;
                fArr2[i3] = f;
            }

            public final void b(int i, int i2) {
                int i3 = this.c;
                int[] iArr = this.a;
                if (i3 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i4 = this.c;
                iArr3[i4] = i;
                int[] iArr4 = this.b;
                this.c = i4 + 1;
                iArr4[i4] = i2;
            }

            public final void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            public final void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }

            public final void e(a aVar) {
                for (int i = 0; i < this.c; i++) {
                    int i2 = this.a[i];
                    int i3 = this.b[i];
                    int[] iArr = b.h;
                    if (i2 == 6) {
                        aVar.e.D = i3;
                    } else if (i2 == 7) {
                        aVar.e.E = i3;
                    } else if (i2 == 8) {
                        aVar.e.K = i3;
                    } else if (i2 == 27) {
                        aVar.e.F = i3;
                    } else if (i2 == 28) {
                        aVar.e.H = i3;
                    } else if (i2 == 41) {
                        aVar.e.W = i3;
                    } else if (i2 == 42) {
                        aVar.e.X = i3;
                    } else if (i2 == 61) {
                        aVar.e.A = i3;
                    } else if (i2 == 62) {
                        aVar.e.B = i3;
                    } else if (i2 == 72) {
                        aVar.e.g0 = i3;
                    } else if (i2 == 73) {
                        aVar.e.h0 = i3;
                    } else if (i2 == 2) {
                        aVar.e.J = i3;
                    } else if (i2 == 31) {
                        aVar.e.L = i3;
                    } else if (i2 == 34) {
                        aVar.e.I = i3;
                    } else if (i2 == 38) {
                        aVar.a = i3;
                    } else if (i2 == 64) {
                        aVar.d.b = i3;
                    } else if (i2 == 66) {
                        aVar.d.f = i3;
                    } else if (i2 == 76) {
                        aVar.d.e = i3;
                    } else if (i2 == 78) {
                        aVar.c.c = i3;
                    } else if (i2 == 97) {
                        aVar.e.p0 = i3;
                    } else if (i2 == 93) {
                        aVar.e.M = i3;
                    } else if (i2 != 94) {
                        switch (i2) {
                            case 11:
                                aVar.e.Q = i3;
                                break;
                            case 12:
                                aVar.e.R = i3;
                                break;
                            case 13:
                                aVar.e.N = i3;
                                break;
                            case 14:
                                aVar.e.P = i3;
                                break;
                            case 15:
                                aVar.e.S = i3;
                                break;
                            case 16:
                                aVar.e.O = i3;
                                break;
                            case 17:
                                aVar.e.e = i3;
                                break;
                            case 18:
                                aVar.e.f = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 21:
                                        aVar.e.d = i3;
                                        break;
                                    case 22:
                                        aVar.c.b = i3;
                                        break;
                                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                                        aVar.e.c = i3;
                                        break;
                                    case 24:
                                        aVar.e.G = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 54:
                                                aVar.e.Y = i3;
                                                break;
                                            case 55:
                                                aVar.e.Z = i3;
                                                break;
                                            case 56:
                                                aVar.e.a0 = i3;
                                                break;
                                            case 57:
                                                aVar.e.b0 = i3;
                                                break;
                                            case 58:
                                                aVar.e.c0 = i3;
                                                break;
                                            case 59:
                                                aVar.e.d0 = i3;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 82:
                                                        aVar.d.c = i3;
                                                        break;
                                                    case 83:
                                                        aVar.f.i = i3;
                                                        break;
                                                    case 84:
                                                        aVar.d.j = i3;
                                                        break;
                                                    default:
                                                        switch (i2) {
                                                            case 87:
                                                                break;
                                                            case 88:
                                                                aVar.d.l = i3;
                                                                break;
                                                            case 89:
                                                                aVar.d.m = i3;
                                                                break;
                                                            default:
                                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        aVar.e.T = i3;
                    }
                }
                for (int i4 = 0; i4 < this.f; i4++) {
                    int i5 = this.d[i4];
                    float f = this.e[i4];
                    int[] iArr2 = b.h;
                    if (i5 == 19) {
                        aVar.e.g = f;
                    } else if (i5 == 20) {
                        aVar.e.x = f;
                    } else if (i5 == 37) {
                        aVar.e.y = f;
                    } else if (i5 == 60) {
                        aVar.f.b = f;
                    } else if (i5 == 63) {
                        aVar.e.C = f;
                    } else if (i5 == 79) {
                        aVar.d.g = f;
                    } else if (i5 == 85) {
                        aVar.d.i = f;
                    } else if (i5 != 87) {
                        if (i5 == 39) {
                            aVar.e.V = f;
                        } else if (i5 != 40) {
                            switch (i5) {
                                case 43:
                                    aVar.c.d = f;
                                    break;
                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                    e eVar = aVar.f;
                                    eVar.n = f;
                                    eVar.m = true;
                                    break;
                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                    aVar.f.c = f;
                                    break;
                                case 46:
                                    aVar.f.d = f;
                                    break;
                                case 47:
                                    aVar.f.e = f;
                                    break;
                                case 48:
                                    aVar.f.f = f;
                                    break;
                                case 49:
                                    aVar.f.g = f;
                                    break;
                                case 50:
                                    aVar.f.h = f;
                                    break;
                                case 51:
                                    aVar.f.j = f;
                                    break;
                                case 52:
                                    aVar.f.k = f;
                                    break;
                                case 53:
                                    aVar.f.l = f;
                                    break;
                                default:
                                    switch (i5) {
                                        case 67:
                                            aVar.d.h = f;
                                            break;
                                        case 68:
                                            aVar.c.e = f;
                                            break;
                                        case 69:
                                            aVar.e.e0 = f;
                                            break;
                                        case 70:
                                            aVar.e.f0 = f;
                                            break;
                                        default:
                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            aVar.e.U = f;
                        }
                    }
                }
                for (int i6 = 0; i6 < this.i; i6++) {
                    int i7 = this.g[i6];
                    String str = this.h[i6];
                    int[] iArr3 = b.h;
                    if (i7 == 5) {
                        aVar.e.z = str;
                    } else if (i7 == 65) {
                        aVar.d.d = str;
                    } else if (i7 == 74) {
                        C0054b c0054b = aVar.e;
                        c0054b.k0 = str;
                        c0054b.j0 = null;
                    } else if (i7 == 77) {
                        aVar.e.l0 = str;
                    } else if (i7 != 87) {
                        if (i7 != 90) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            aVar.d.k = str;
                        }
                    }
                }
                for (int i8 = 0; i8 < this.l; i8++) {
                    int i9 = this.j[i8];
                    boolean z = this.k[i8];
                    int[] iArr4 = b.h;
                    if (i9 == 44) {
                        aVar.f.m = z;
                    } else if (i9 == 75) {
                        aVar.e.o0 = z;
                    } else if (i9 != 87) {
                        if (i9 == 80) {
                            aVar.e.m0 = z;
                        } else if (i9 != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            aVar.e.n0 = z;
                        }
                    }
                }
            }
        }

        public a() {
            d dVar = new d();
            dVar.a = false;
            dVar.b = 0;
            dVar.c = 0;
            dVar.d = 1.0f;
            dVar.e = Float.NaN;
            this.c = dVar;
            c cVar = new c();
            cVar.a = false;
            cVar.b = -1;
            cVar.c = 0;
            cVar.d = null;
            cVar.e = -1;
            cVar.f = 0;
            cVar.g = Float.NaN;
            cVar.h = Float.NaN;
            cVar.i = Float.NaN;
            cVar.j = -1;
            cVar.k = null;
            cVar.l = -3;
            cVar.m = -1;
            this.d = cVar;
            C0054b c0054b = new C0054b();
            c0054b.a = false;
            c0054b.b = false;
            c0054b.e = -1;
            c0054b.f = -1;
            c0054b.g = -1.0f;
            c0054b.h = true;
            c0054b.i = -1;
            c0054b.j = -1;
            c0054b.k = -1;
            c0054b.l = -1;
            c0054b.m = -1;
            c0054b.n = -1;
            c0054b.o = -1;
            c0054b.p = -1;
            c0054b.q = -1;
            c0054b.r = -1;
            c0054b.s = -1;
            c0054b.t = -1;
            c0054b.u = -1;
            c0054b.v = -1;
            c0054b.w = -1;
            c0054b.x = 0.5f;
            c0054b.y = 0.5f;
            c0054b.z = null;
            c0054b.A = -1;
            c0054b.B = 0;
            c0054b.C = 0.0f;
            c0054b.D = -1;
            c0054b.E = -1;
            c0054b.F = -1;
            c0054b.G = 0;
            c0054b.H = 0;
            c0054b.I = 0;
            c0054b.J = 0;
            c0054b.K = 0;
            c0054b.L = 0;
            c0054b.M = 0;
            c0054b.N = Integer.MIN_VALUE;
            c0054b.O = Integer.MIN_VALUE;
            c0054b.P = Integer.MIN_VALUE;
            c0054b.Q = Integer.MIN_VALUE;
            c0054b.R = Integer.MIN_VALUE;
            c0054b.S = Integer.MIN_VALUE;
            c0054b.T = Integer.MIN_VALUE;
            c0054b.U = -1.0f;
            c0054b.V = -1.0f;
            c0054b.W = 0;
            c0054b.X = 0;
            c0054b.Y = 0;
            c0054b.Z = 0;
            c0054b.a0 = 0;
            c0054b.b0 = 0;
            c0054b.c0 = 0;
            c0054b.d0 = 0;
            c0054b.e0 = 1.0f;
            c0054b.f0 = 1.0f;
            c0054b.g0 = -1;
            c0054b.h0 = 0;
            c0054b.i0 = -1;
            c0054b.m0 = false;
            c0054b.n0 = false;
            c0054b.o0 = true;
            c0054b.p0 = 0;
            this.e = c0054b;
            e eVar = new e();
            eVar.a = false;
            eVar.b = 0.0f;
            eVar.c = 0.0f;
            eVar.d = 0.0f;
            eVar.e = 1.0f;
            eVar.f = 1.0f;
            eVar.g = Float.NaN;
            eVar.h = Float.NaN;
            eVar.i = -1;
            eVar.j = 0.0f;
            eVar.k = 0.0f;
            eVar.l = 0.0f;
            eVar.m = false;
            eVar.n = 0.0f;
            this.f = eVar;
            this.g = new HashMap<>();
        }

        public final void a(ConstraintLayout.LayoutParams layoutParams) {
            C0054b c0054b = this.e;
            layoutParams.e = c0054b.i;
            layoutParams.f = c0054b.j;
            layoutParams.g = c0054b.k;
            layoutParams.h = c0054b.l;
            layoutParams.i = c0054b.m;
            layoutParams.j = c0054b.n;
            layoutParams.k = c0054b.o;
            layoutParams.l = c0054b.p;
            layoutParams.m = c0054b.q;
            layoutParams.n = c0054b.r;
            layoutParams.o = c0054b.s;
            layoutParams.s = c0054b.t;
            layoutParams.t = c0054b.u;
            layoutParams.u = c0054b.v;
            layoutParams.v = c0054b.w;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = c0054b.G;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = c0054b.H;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = c0054b.I;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c0054b.J;
            layoutParams.A = c0054b.S;
            layoutParams.B = c0054b.R;
            layoutParams.x = c0054b.O;
            layoutParams.z = c0054b.Q;
            layoutParams.E = c0054b.x;
            layoutParams.F = c0054b.y;
            layoutParams.p = c0054b.A;
            layoutParams.q = c0054b.B;
            layoutParams.r = c0054b.C;
            layoutParams.G = c0054b.z;
            layoutParams.T = c0054b.D;
            layoutParams.U = c0054b.E;
            layoutParams.I = c0054b.U;
            layoutParams.H = c0054b.V;
            layoutParams.K = c0054b.X;
            layoutParams.J = c0054b.W;
            layoutParams.W = c0054b.m0;
            layoutParams.X = c0054b.n0;
            layoutParams.L = c0054b.Y;
            layoutParams.M = c0054b.Z;
            layoutParams.P = c0054b.a0;
            layoutParams.Q = c0054b.b0;
            layoutParams.N = c0054b.c0;
            layoutParams.O = c0054b.d0;
            layoutParams.R = c0054b.e0;
            layoutParams.S = c0054b.f0;
            layoutParams.V = c0054b.F;
            layoutParams.c = c0054b.g;
            layoutParams.a = c0054b.e;
            layoutParams.b = c0054b.f;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = c0054b.c;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = c0054b.d;
            String str = c0054b.l0;
            if (str != null) {
                layoutParams.Y = str;
            }
            layoutParams.Z = c0054b.p0;
            layoutParams.setMarginStart(c0054b.L);
            layoutParams.setMarginEnd(c0054b.K);
            layoutParams.a();
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a clone() {
            a aVar = new a();
            aVar.e.a(this.e);
            aVar.d.a(this.d);
            d dVar = this.c;
            boolean z = dVar.a;
            d dVar2 = aVar.c;
            dVar2.a = z;
            dVar2.b = dVar.b;
            dVar2.d = dVar.d;
            dVar2.e = dVar.e;
            dVar2.c = dVar.c;
            aVar.f.a(this.f);
            aVar.a = this.a;
            aVar.h = this.h;
            return aVar;
        }

        public final void c(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.a = i;
            int i2 = layoutParams.e;
            C0054b c0054b = this.e;
            c0054b.i = i2;
            c0054b.j = layoutParams.f;
            c0054b.k = layoutParams.g;
            c0054b.l = layoutParams.h;
            c0054b.m = layoutParams.i;
            c0054b.n = layoutParams.j;
            c0054b.o = layoutParams.k;
            c0054b.p = layoutParams.l;
            c0054b.q = layoutParams.m;
            c0054b.r = layoutParams.n;
            c0054b.s = layoutParams.o;
            c0054b.t = layoutParams.s;
            c0054b.u = layoutParams.t;
            c0054b.v = layoutParams.u;
            c0054b.w = layoutParams.v;
            c0054b.x = layoutParams.E;
            c0054b.y = layoutParams.F;
            c0054b.z = layoutParams.G;
            c0054b.A = layoutParams.p;
            c0054b.B = layoutParams.q;
            c0054b.C = layoutParams.r;
            c0054b.D = layoutParams.T;
            c0054b.E = layoutParams.U;
            c0054b.F = layoutParams.V;
            c0054b.g = layoutParams.c;
            c0054b.e = layoutParams.a;
            c0054b.f = layoutParams.b;
            c0054b.c = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            c0054b.d = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            c0054b.G = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            c0054b.H = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            c0054b.I = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            c0054b.J = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            c0054b.M = layoutParams.D;
            c0054b.U = layoutParams.I;
            c0054b.V = layoutParams.H;
            c0054b.X = layoutParams.K;
            c0054b.W = layoutParams.J;
            c0054b.m0 = layoutParams.W;
            c0054b.n0 = layoutParams.X;
            c0054b.Y = layoutParams.L;
            c0054b.Z = layoutParams.M;
            c0054b.a0 = layoutParams.P;
            c0054b.b0 = layoutParams.Q;
            c0054b.c0 = layoutParams.N;
            c0054b.d0 = layoutParams.O;
            c0054b.e0 = layoutParams.R;
            c0054b.f0 = layoutParams.S;
            c0054b.l0 = layoutParams.Y;
            c0054b.O = layoutParams.x;
            c0054b.Q = layoutParams.z;
            c0054b.N = layoutParams.w;
            c0054b.P = layoutParams.y;
            c0054b.S = layoutParams.A;
            c0054b.R = layoutParams.B;
            c0054b.T = layoutParams.C;
            c0054b.p0 = layoutParams.Z;
            c0054b.K = layoutParams.getMarginEnd();
            c0054b.L = layoutParams.getMarginStart();
        }

        public final void d(int i, Constraints.LayoutParams layoutParams) {
            c(i, layoutParams);
            this.c.d = layoutParams.r0;
            float f = layoutParams.u0;
            e eVar = this.f;
            eVar.b = f;
            eVar.c = layoutParams.v0;
            eVar.d = layoutParams.w0;
            eVar.e = layoutParams.x0;
            eVar.f = layoutParams.y0;
            eVar.g = layoutParams.z0;
            eVar.h = layoutParams.A0;
            eVar.j = layoutParams.B0;
            eVar.k = layoutParams.C0;
            eVar.l = layoutParams.D0;
            eVar.n = layoutParams.t0;
            eVar.m = layoutParams.s0;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    public static class C0054b {
        public static final SparseIntArray q0;
        public int A;
        public int B;
        public float C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public float U;
        public float V;
        public int W;
        public int X;
        public int Y;
        public int Z;
        public boolean a;
        public int a0;
        public boolean b;
        public int b0;
        public int c;
        public int c0;
        public int d;
        public int d0;
        public int e;
        public float e0;
        public int f;
        public float f0;
        public float g;
        public int g0;
        public boolean h;
        public int h0;
        public int i;
        public int i0;
        public int j;
        public int[] j0;
        public int k;
        public String k0;
        public int l;
        public String l0;
        public int m;
        public boolean m0;
        public int n;
        public boolean n0;
        public int o;
        public boolean o0;
        public int p;
        public int p0;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public float x;
        public float y;
        public String z;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 87);
            sparseIntArray.append(16, 88);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
            sparseIntArray.append(58, 84);
            sparseIntArray.append(59, 86);
            sparseIntArray.append(58, 83);
            sparseIntArray.append(37, 85);
            sparseIntArray.append(56, 87);
            sparseIntArray.append(34, 88);
            sparseIntArray.append(91, 89);
            sparseIntArray.append(15, 90);
        }

        public final void a(C0054b c0054b) {
            this.a = c0054b.a;
            this.c = c0054b.c;
            this.b = c0054b.b;
            this.d = c0054b.d;
            this.e = c0054b.e;
            this.f = c0054b.f;
            this.g = c0054b.g;
            this.h = c0054b.h;
            this.i = c0054b.i;
            this.j = c0054b.j;
            this.k = c0054b.k;
            this.l = c0054b.l;
            this.m = c0054b.m;
            this.n = c0054b.n;
            this.o = c0054b.o;
            this.p = c0054b.p;
            this.q = c0054b.q;
            this.r = c0054b.r;
            this.s = c0054b.s;
            this.t = c0054b.t;
            this.u = c0054b.u;
            this.v = c0054b.v;
            this.w = c0054b.w;
            this.x = c0054b.x;
            this.y = c0054b.y;
            this.z = c0054b.z;
            this.A = c0054b.A;
            this.B = c0054b.B;
            this.C = c0054b.C;
            this.D = c0054b.D;
            this.E = c0054b.E;
            this.F = c0054b.F;
            this.G = c0054b.G;
            this.H = c0054b.H;
            this.I = c0054b.I;
            this.J = c0054b.J;
            this.K = c0054b.K;
            this.L = c0054b.L;
            this.M = c0054b.M;
            this.N = c0054b.N;
            this.O = c0054b.O;
            this.P = c0054b.P;
            this.Q = c0054b.Q;
            this.R = c0054b.R;
            this.S = c0054b.S;
            this.T = c0054b.T;
            this.U = c0054b.U;
            this.V = c0054b.V;
            this.W = c0054b.W;
            this.X = c0054b.X;
            this.Y = c0054b.Y;
            this.Z = c0054b.Z;
            this.a0 = c0054b.a0;
            this.b0 = c0054b.b0;
            this.c0 = c0054b.c0;
            this.d0 = c0054b.d0;
            this.e0 = c0054b.e0;
            this.f0 = c0054b.f0;
            this.g0 = c0054b.g0;
            this.h0 = c0054b.h0;
            this.i0 = c0054b.i0;
            this.l0 = c0054b.l0;
            int[] iArr = c0054b.j0;
            if (iArr == null || c0054b.k0 != null) {
                this.j0 = null;
            } else {
                this.j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.k0 = c0054b.k0;
            this.m0 = c0054b.m0;
            this.n0 = c0054b.n0;
            this.o0 = c0054b.o0;
            this.p0 = c0054b.p0;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wk30.p);
            this.b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                SparseIntArray sparseIntArray = q0;
                int i2 = sparseIntArray.get(index);
                switch (i2) {
                    case 1:
                        this.q = b.s(typedArrayObtainStyledAttributes, index, this.q);
                        break;
                    case 2:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        this.p = b.s(typedArrayObtainStyledAttributes, index, this.p);
                        break;
                    case 4:
                        this.o = b.s(typedArrayObtainStyledAttributes, index, this.o);
                        break;
                    case 5:
                        this.z = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 9:
                        this.w = b.s(typedArrayObtainStyledAttributes, index, this.w);
                        break;
                    case 10:
                        this.v = b.s(typedArrayObtainStyledAttributes, index, this.v);
                        break;
                    case 11:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                        break;
                    case 18:
                        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                        break;
                    case 19:
                        this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 20:
                        this.x = typedArrayObtainStyledAttributes.getFloat(index, this.x);
                        break;
                    case 21:
                        this.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.d);
                        break;
                    case 22:
                        this.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.c);
                        break;
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        this.i = b.s(typedArrayObtainStyledAttributes, index, this.i);
                        break;
                    case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                        this.j = b.s(typedArrayObtainStyledAttributes, index, this.j);
                        break;
                    case RuntimeVersion.MINOR /* 26 */:
                        this.F = typedArrayObtainStyledAttributes.getInt(index, this.F);
                        break;
                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        this.k = b.s(typedArrayObtainStyledAttributes, index, this.k);
                        break;
                    case 29:
                        this.l = b.s(typedArrayObtainStyledAttributes, index, this.l);
                        break;
                    case 30:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        this.t = b.s(typedArrayObtainStyledAttributes, index, this.t);
                        break;
                    case 32:
                        this.u = b.s(typedArrayObtainStyledAttributes, index, this.u);
                        break;
                    case 33:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        this.n = b.s(typedArrayObtainStyledAttributes, index, this.n);
                        break;
                    case 35:
                        this.m = b.s(typedArrayObtainStyledAttributes, index, this.m);
                        break;
                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        this.y = typedArrayObtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 38:
                        this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 40:
                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 41:
                        b.t(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        b.t(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.A = b.s(typedArrayObtainStyledAttributes, index, this.A);
                                break;
                            case 62:
                                this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                break;
                            case 63:
                                this.C = typedArrayObtainStyledAttributes.getFloat(index, this.C);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.g0 = typedArrayObtainStyledAttributes.getInt(index, this.g0);
                                        break;
                                    case 73:
                                        this.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.h0);
                                        break;
                                    case 74:
                                        this.k0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.o0);
                                        break;
                                    case 76:
                                        this.p0 = typedArrayObtainStyledAttributes.getInt(index, this.p0);
                                        break;
                                    case 77:
                                        this.r = b.s(typedArrayObtainStyledAttributes, index, this.r);
                                        break;
                                    case 78:
                                        this.s = b.s(typedArrayObtainStyledAttributes, index, this.s);
                                        break;
                                    case 79:
                                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        break;
                                    case 80:
                                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        break;
                                    case 81:
                                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 82:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 83:
                                        this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        break;
                                    case 84:
                                        this.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                        break;
                                    case 85:
                                        this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        break;
                                    case 86:
                                        this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        break;
                                    case 87:
                                        this.m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.m0);
                                        break;
                                    case 88:
                                        this.n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.n0);
                                        break;
                                    case 89:
                                        this.l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.h = typedArrayObtainStyledAttributes.getBoolean(index, this.h);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {
        public static final SparseIntArray n;
        public boolean a;
        public int b;
        public int c;
        public String d;
        public int e;
        public int f;
        public float g;
        public float h;
        public float i;
        public int j;
        public String k;
        public int l;
        public int m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(c cVar) {
            this.a = cVar.a;
            this.b = cVar.b;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.h = cVar.h;
            this.g = cVar.g;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wk30.r);
            this.a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (n.get(index)) {
                    case 1:
                        this.h = typedArrayObtainStyledAttributes.getFloat(index, this.h);
                        break;
                    case 2:
                        this.e = typedArrayObtainStyledAttributes.getInt(index, this.e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.d = skf.c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = b.s(typedArrayObtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.c = typedArrayObtainStyledAttributes.getInteger(index, this.c);
                        break;
                    case 7:
                        this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 8:
                        this.j = typedArrayObtainStyledAttributes.getInteger(index, this.j);
                        break;
                    case 9:
                        this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                        break;
                    case 10:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.m = resourceId;
                            if (resourceId != -1) {
                                this.l = -2;
                            }
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.k = string;
                            if (string.indexOf("/") > 0) {
                                this.m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.l = -2;
                            } else {
                                this.l = -1;
                            }
                        } else {
                            this.l = typedArrayObtainStyledAttributes.getInteger(index, this.m);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {
        public boolean a;
        public int b;
        public int c;
        public float d;
        public float e;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wk30.A);
            this.a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                } else if (index == 0) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.b);
                    this.b = i2;
                    this.b = b.h[i2];
                } else if (index == 4) {
                    this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
                } else if (index == 3) {
                    this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {
        public static final SparseIntArray o;
        public boolean a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public int i;
        public float j;
        public float k;
        public float l;
        public boolean m;
        public float n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(e eVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.l = eVar.l;
            this.m = eVar.m;
            this.n = eVar.n;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wk30.D);
            this.a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.b = typedArrayObtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = typedArrayObtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 9:
                        this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 10:
                        this.l = typedArrayObtainStyledAttributes.getDimension(index, this.l);
                        break;
                    case 11:
                        this.m = true;
                        this.n = typedArrayObtainStyledAttributes.getDimension(index, this.n);
                        break;
                    case 12:
                        this.i = b.s(typedArrayObtainStyledAttributes, index, this.i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        i = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        j = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS, 6);
        sparseIntArray.append(HttpStatusCodesKt.HTTP_PROCESSING, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(HttpStatusCodesKt.HTTP_EARLY_HINTS, 84);
        sparseIntArray2.append(HttpStatusCodesKt.HTTP_PROCESSING, 85);
        sparseIntArray2.append(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS, 86);
        sparseIntArray2.append(94, 97);
    }

    public static String B(int i2) {
        switch (i2) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public static a d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, wk30.f);
        v(aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public static int[] m(Barrier barrier, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            Integer num = null;
            try {
                iIntValue = zj30.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, AnalyticsParam.EVENT_PARAM_ID, context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap<String, Integer> map = constraintLayout.B;
                    if (map != null && map.containsKey(strTrim)) {
                        num = constraintLayout.B.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (num != null && (num instanceof Integer)) {
                    iIntValue = num.intValue();
                }
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public static a n(Context context, AttributeSet attributeSet, boolean z) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? wk30.f : wk30.b);
        if (z) {
            v(aVar, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i2 = 0;
            while (true) {
                C0054b c0054b = aVar.e;
                if (i2 < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i2);
                    d dVar = aVar.c;
                    e eVar = aVar.f;
                    c cVar = aVar.d;
                    if (index != 1 && 23 != index && 24 != index) {
                        cVar.a = true;
                        c0054b.b = true;
                        dVar.a = true;
                        eVar.a = true;
                    }
                    SparseIntArray sparseIntArray = i;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            c0054b.q = s(typedArrayObtainStyledAttributes, index, c0054b.q);
                            break;
                        case 2:
                            c0054b.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.J);
                            break;
                        case 3:
                            c0054b.p = s(typedArrayObtainStyledAttributes, index, c0054b.p);
                            break;
                        case 4:
                            c0054b.o = s(typedArrayObtainStyledAttributes, index, c0054b.o);
                            break;
                        case 5:
                            c0054b.z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            c0054b.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0054b.D);
                            break;
                        case 7:
                            c0054b.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0054b.E);
                            break;
                        case 8:
                            c0054b.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.K);
                            break;
                        case 9:
                            c0054b.w = s(typedArrayObtainStyledAttributes, index, c0054b.w);
                            break;
                        case 10:
                            c0054b.v = s(typedArrayObtainStyledAttributes, index, c0054b.v);
                            break;
                        case 11:
                            c0054b.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.Q);
                            break;
                        case 12:
                            c0054b.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.R);
                            break;
                        case 13:
                            c0054b.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.N);
                            break;
                        case 14:
                            c0054b.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.P);
                            break;
                        case 15:
                            c0054b.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.S);
                            break;
                        case 16:
                            c0054b.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.O);
                            break;
                        case 17:
                            c0054b.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0054b.e);
                            break;
                        case 18:
                            c0054b.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0054b.f);
                            break;
                        case 19:
                            c0054b.g = typedArrayObtainStyledAttributes.getFloat(index, c0054b.g);
                            break;
                        case 20:
                            c0054b.x = typedArrayObtainStyledAttributes.getFloat(index, c0054b.x);
                            break;
                        case 21:
                            c0054b.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0054b.d);
                            break;
                        case 22:
                            int i3 = typedArrayObtainStyledAttributes.getInt(index, dVar.b);
                            dVar.b = i3;
                            dVar.b = h[i3];
                            break;
                        case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                            c0054b.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0054b.c);
                            break;
                        case 24:
                            c0054b.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.G);
                            break;
                        case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                            c0054b.i = s(typedArrayObtainStyledAttributes, index, c0054b.i);
                            break;
                        case RuntimeVersion.MINOR /* 26 */:
                            c0054b.j = s(typedArrayObtainStyledAttributes, index, c0054b.j);
                            break;
                        case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            c0054b.F = typedArrayObtainStyledAttributes.getInt(index, c0054b.F);
                            break;
                        case 28:
                            c0054b.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.H);
                            break;
                        case 29:
                            c0054b.k = s(typedArrayObtainStyledAttributes, index, c0054b.k);
                            break;
                        case 30:
                            c0054b.l = s(typedArrayObtainStyledAttributes, index, c0054b.l);
                            break;
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            c0054b.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.L);
                            break;
                        case 32:
                            c0054b.t = s(typedArrayObtainStyledAttributes, index, c0054b.t);
                            break;
                        case 33:
                            c0054b.u = s(typedArrayObtainStyledAttributes, index, c0054b.u);
                            break;
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                            c0054b.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.I);
                            break;
                        case 35:
                            c0054b.n = s(typedArrayObtainStyledAttributes, index, c0054b.n);
                            break;
                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            c0054b.m = s(typedArrayObtainStyledAttributes, index, c0054b.m);
                            break;
                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            c0054b.y = typedArrayObtainStyledAttributes.getFloat(index, c0054b.y);
                            break;
                        case 38:
                            aVar.a = typedArrayObtainStyledAttributes.getResourceId(index, aVar.a);
                            break;
                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            c0054b.V = typedArrayObtainStyledAttributes.getFloat(index, c0054b.V);
                            break;
                        case 40:
                            c0054b.U = typedArrayObtainStyledAttributes.getFloat(index, c0054b.U);
                            break;
                        case 41:
                            c0054b.W = typedArrayObtainStyledAttributes.getInt(index, c0054b.W);
                            break;
                        case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                            c0054b.X = typedArrayObtainStyledAttributes.getInt(index, c0054b.X);
                            break;
                        case 43:
                            dVar.d = typedArrayObtainStyledAttributes.getFloat(index, dVar.d);
                            break;
                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            eVar.m = true;
                            eVar.n = typedArrayObtainStyledAttributes.getDimension(index, eVar.n);
                            break;
                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            eVar.c = typedArrayObtainStyledAttributes.getFloat(index, eVar.c);
                            break;
                        case 46:
                            eVar.d = typedArrayObtainStyledAttributes.getFloat(index, eVar.d);
                            break;
                        case 47:
                            eVar.e = typedArrayObtainStyledAttributes.getFloat(index, eVar.e);
                            break;
                        case 48:
                            eVar.f = typedArrayObtainStyledAttributes.getFloat(index, eVar.f);
                            break;
                        case 49:
                            eVar.g = typedArrayObtainStyledAttributes.getDimension(index, eVar.g);
                            break;
                        case 50:
                            eVar.h = typedArrayObtainStyledAttributes.getDimension(index, eVar.h);
                            break;
                        case 51:
                            eVar.j = typedArrayObtainStyledAttributes.getDimension(index, eVar.j);
                            break;
                        case 52:
                            eVar.k = typedArrayObtainStyledAttributes.getDimension(index, eVar.k);
                            break;
                        case 53:
                            eVar.l = typedArrayObtainStyledAttributes.getDimension(index, eVar.l);
                            break;
                        case 54:
                            c0054b.Y = typedArrayObtainStyledAttributes.getInt(index, c0054b.Y);
                            break;
                        case 55:
                            c0054b.Z = typedArrayObtainStyledAttributes.getInt(index, c0054b.Z);
                            break;
                        case 56:
                            c0054b.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.a0);
                            break;
                        case 57:
                            c0054b.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.b0);
                            break;
                        case 58:
                            c0054b.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.c0);
                            break;
                        case 59:
                            c0054b.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.d0);
                            break;
                        case 60:
                            eVar.b = typedArrayObtainStyledAttributes.getFloat(index, eVar.b);
                            break;
                        case 61:
                            c0054b.A = s(typedArrayObtainStyledAttributes, index, c0054b.A);
                            break;
                        case 62:
                            c0054b.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.B);
                            break;
                        case 63:
                            c0054b.C = typedArrayObtainStyledAttributes.getFloat(index, c0054b.C);
                            break;
                        case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                            cVar.b = s(typedArrayObtainStyledAttributes, index, cVar.b);
                            break;
                        case 65:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                cVar.d = skf.c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            } else {
                                cVar.d = typedArrayObtainStyledAttributes.getString(index);
                            }
                            break;
                        case 66:
                            cVar.f = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            cVar.h = typedArrayObtainStyledAttributes.getFloat(index, cVar.h);
                            break;
                        case 68:
                            dVar.e = typedArrayObtainStyledAttributes.getFloat(index, dVar.e);
                            break;
                        case 69:
                            c0054b.e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            c0054b.f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            c0054b.g0 = typedArrayObtainStyledAttributes.getInt(index, c0054b.g0);
                            break;
                        case 73:
                            c0054b.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.h0);
                            break;
                        case 74:
                            c0054b.k0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            c0054b.o0 = typedArrayObtainStyledAttributes.getBoolean(index, c0054b.o0);
                            break;
                        case 76:
                            cVar.e = typedArrayObtainStyledAttributes.getInt(index, cVar.e);
                            break;
                        case 77:
                            c0054b.l0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            dVar.c = typedArrayObtainStyledAttributes.getInt(index, dVar.c);
                            break;
                        case 79:
                            cVar.g = typedArrayObtainStyledAttributes.getFloat(index, cVar.g);
                            break;
                        case 80:
                            c0054b.m0 = typedArrayObtainStyledAttributes.getBoolean(index, c0054b.m0);
                            break;
                        case 81:
                            c0054b.n0 = typedArrayObtainStyledAttributes.getBoolean(index, c0054b.n0);
                            break;
                        case 82:
                            cVar.c = typedArrayObtainStyledAttributes.getInteger(index, cVar.c);
                            break;
                        case 83:
                            eVar.i = s(typedArrayObtainStyledAttributes, index, eVar.i);
                            break;
                        case 84:
                            cVar.j = typedArrayObtainStyledAttributes.getInteger(index, cVar.j);
                            break;
                        case 85:
                            cVar.i = typedArrayObtainStyledAttributes.getFloat(index, cVar.i);
                            break;
                        case 86:
                            int i4 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i4 == 1) {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                cVar.m = resourceId;
                                if (resourceId != -1) {
                                    cVar.l = -2;
                                }
                            } else if (i4 != 3) {
                                cVar.l = typedArrayObtainStyledAttributes.getInteger(index, cVar.m);
                            } else {
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                cVar.k = string;
                                if (string.indexOf("/") <= 0) {
                                    cVar.l = -1;
                                } else {
                                    cVar.m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    cVar.l = -2;
                                }
                            }
                            break;
                        case 87:
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 88:
                        case 89:
                        case 90:
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 91:
                            c0054b.r = s(typedArrayObtainStyledAttributes, index, c0054b.r);
                            break;
                        case 92:
                            c0054b.s = s(typedArrayObtainStyledAttributes, index, c0054b.s);
                            break;
                        case 93:
                            c0054b.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.M);
                            break;
                        case 94:
                            c0054b.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0054b.T);
                            break;
                        case 95:
                            t(c0054b, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            t(c0054b, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            c0054b.p0 = typedArrayObtainStyledAttributes.getInt(index, c0054b.p0);
                            break;
                    }
                    i2++;
                } else if (c0054b.k0 != null) {
                    c0054b.j0 = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public static int s(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    public static void t(Object obj, TypedArray typedArray, int i2, int i3) {
        int dimensionPixelSize;
        a.C0053a c0053a;
        C0054b c0054b;
        ConstraintLayout.LayoutParams layoutParams;
        if (obj == null) {
            return;
        }
        int i4 = typedArray.peekValue(i2).type;
        boolean z = true;
        int i5 = 0;
        if (i4 != 3) {
            if (i4 != 5) {
                dimensionPixelSize = typedArray.getInt(i2, 0);
                if (dimensionPixelSize == -4) {
                    i5 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i3 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = i5;
                        layoutParams.W = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = i5;
                        layoutParams.X = z;
                        return;
                    }
                }
                if (obj instanceof C0054b) {
                    c0054b = (C0054b) obj;
                    if (i3 == 0) {
                        c0054b.c = i5;
                        c0054b.m0 = z;
                        return;
                    } else {
                        c0054b.d = i5;
                        c0054b.n0 = z;
                        return;
                    }
                }
                if (obj instanceof a.C0053a) {
                    c0053a = (a.C0053a) obj;
                    if (i3 == 0) {
                        c0053a.b(23, i5);
                        c0053a.d(80, z);
                        return;
                    } else {
                        c0053a.b(21, i5);
                        c0053a.d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i2, 0);
            z = false;
            i5 = dimensionPixelSize;
            if (obj instanceof ConstraintLayout.LayoutParams) {
                layoutParams = (ConstraintLayout.LayoutParams) obj;
                if (i3 == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = i5;
                    layoutParams.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = i5;
                    layoutParams.X = z;
                    return;
                }
            }
            if (obj instanceof C0054b) {
                c0054b = (C0054b) obj;
                if (i3 == 0) {
                    c0054b.c = i5;
                    c0054b.m0 = z;
                    return;
                } else {
                    c0054b.d = i5;
                    c0054b.n0 = z;
                    return;
                }
            }
            if (obj instanceof a.C0053a) {
                c0053a = (a.C0053a) obj;
                if (i3 == 0) {
                    c0053a.b(23, i5);
                    c0053a.d(80, z);
                    return;
                } else {
                    c0053a.b(21, i5);
                    c0053a.d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i2);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                    if (i3 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                    }
                    u(layoutParams2, strTrim2);
                    return;
                }
                if (obj instanceof C0054b) {
                    ((C0054b) obj).z = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0053a) {
                        ((a.C0053a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                        if (i3 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                            layoutParams3.H = f;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.I = f;
                            return;
                        }
                    }
                    if (obj instanceof C0054b) {
                        C0054b c0054b2 = (C0054b) obj;
                        if (i3 == 0) {
                            c0054b2.c = 0;
                            c0054b2.V = f;
                            return;
                        } else {
                            c0054b2.d = 0;
                            c0054b2.U = f;
                            return;
                        }
                    }
                    if (obj instanceof a.C0053a) {
                        a.C0053a c0053a2 = (a.C0053a) obj;
                        if (i3 == 0) {
                            c0053a2.b(23, 0);
                            c0053a2.a(39, f);
                            return;
                        } else {
                            c0053a2.b(21, 0);
                            c0053a2.a(40, f);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) obj;
                        if (i3 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).width = 0;
                            layoutParams4.R = fMax;
                            layoutParams4.L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).height = 0;
                            layoutParams4.S = fMax;
                            layoutParams4.M = 2;
                            return;
                        }
                    }
                    if (obj instanceof C0054b) {
                        C0054b c0054b3 = (C0054b) obj;
                        if (i3 == 0) {
                            c0054b3.c = 0;
                            c0054b3.e0 = fMax;
                            c0054b3.Y = 2;
                            return;
                        } else {
                            c0054b3.d = 0;
                            c0054b3.f0 = fMax;
                            c0054b3.Z = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0053a) {
                        a.C0053a c0053a3 = (a.C0053a) obj;
                        if (i3 == 0) {
                            c0053a3.b(23, 0);
                            c0053a3.b(54, 2);
                        } else {
                            c0053a3.b(21, 0);
                            c0053a3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void u(ConstraintLayout.LayoutParams layoutParams, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i2 = 0;
            int i3 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i2 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i3 = i2;
                i2 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i2);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i2, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i3 == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.G = str;
    }

    public static void v(a aVar, TypedArray typedArray) {
        char c2;
        int indexCount = typedArray.getIndexCount();
        a.C0053a c0053a = new a.C0053a();
        c0053a.a = new int[10];
        c0053a.b = new int[10];
        c0053a.c = 0;
        c0053a.d = new int[10];
        c0053a.e = new float[10];
        c0053a.f = 0;
        c0053a.g = new int[5];
        c0053a.h = new String[5];
        c0053a.i = 0;
        c0053a.j = new int[4];
        c0053a.k = new boolean[4];
        c0053a.l = 0;
        aVar.h = c0053a;
        c cVar = aVar.d;
        cVar.a = false;
        C0054b c0054b = aVar.e;
        c0054b.b = false;
        d dVar = aVar.c;
        dVar.a = false;
        e eVar = aVar.f;
        eVar.a = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            int i3 = j.get(index);
            SparseIntArray sparseIntArray = i;
            switch (i3) {
                case 2:
                    c2 = 5;
                    c0053a.b(2, typedArray.getDimensionPixelSize(index, c0054b.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                case RuntimeVersion.MINOR /* 26 */:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    c2 = 5;
                    break;
                case 5:
                    c2 = 5;
                    c0053a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0053a.b(6, typedArray.getDimensionPixelOffset(index, c0054b.D));
                    c2 = 5;
                    break;
                case 7:
                    c0053a.b(7, typedArray.getDimensionPixelOffset(index, c0054b.E));
                    c2 = 5;
                    break;
                case 8:
                    c0053a.b(8, typedArray.getDimensionPixelSize(index, c0054b.K));
                    c2 = 5;
                    break;
                case 11:
                    c0053a.b(11, typedArray.getDimensionPixelSize(index, c0054b.Q));
                    c2 = 5;
                    break;
                case 12:
                    c0053a.b(12, typedArray.getDimensionPixelSize(index, c0054b.R));
                    c2 = 5;
                    break;
                case 13:
                    c0053a.b(13, typedArray.getDimensionPixelSize(index, c0054b.N));
                    c2 = 5;
                    break;
                case 14:
                    c0053a.b(14, typedArray.getDimensionPixelSize(index, c0054b.P));
                    c2 = 5;
                    break;
                case 15:
                    c0053a.b(15, typedArray.getDimensionPixelSize(index, c0054b.S));
                    c2 = 5;
                    break;
                case 16:
                    c0053a.b(16, typedArray.getDimensionPixelSize(index, c0054b.O));
                    c2 = 5;
                    break;
                case 17:
                    c0053a.b(17, typedArray.getDimensionPixelOffset(index, c0054b.e));
                    c2 = 5;
                    break;
                case 18:
                    c0053a.b(18, typedArray.getDimensionPixelOffset(index, c0054b.f));
                    c2 = 5;
                    break;
                case 19:
                    c0053a.a(19, typedArray.getFloat(index, c0054b.g));
                    c2 = 5;
                    break;
                case 20:
                    c0053a.a(20, typedArray.getFloat(index, c0054b.x));
                    c2 = 5;
                    break;
                case 21:
                    c0053a.b(21, typedArray.getLayoutDimension(index, c0054b.d));
                    c2 = 5;
                    break;
                case 22:
                    c0053a.b(22, h[typedArray.getInt(index, dVar.b)]);
                    c2 = 5;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    c0053a.b(23, typedArray.getLayoutDimension(index, c0054b.c));
                    c2 = 5;
                    break;
                case 24:
                    c0053a.b(24, typedArray.getDimensionPixelSize(index, c0054b.G));
                    c2 = 5;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    c0053a.b(27, typedArray.getInt(index, c0054b.F));
                    c2 = 5;
                    break;
                case 28:
                    c0053a.b(28, typedArray.getDimensionPixelSize(index, c0054b.H));
                    c2 = 5;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    c0053a.b(31, typedArray.getDimensionPixelSize(index, c0054b.L));
                    c2 = 5;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    c0053a.b(34, typedArray.getDimensionPixelSize(index, c0054b.I));
                    c2 = 5;
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    c0053a.a(37, typedArray.getFloat(index, c0054b.y));
                    c2 = 5;
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.a);
                    aVar.a = resourceId;
                    c0053a.b(38, resourceId);
                    c2 = 5;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    c0053a.a(39, typedArray.getFloat(index, c0054b.V));
                    c2 = 5;
                    break;
                case 40:
                    c0053a.a(40, typedArray.getFloat(index, c0054b.U));
                    c2 = 5;
                    break;
                case 41:
                    c0053a.b(41, typedArray.getInt(index, c0054b.W));
                    c2 = 5;
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    c0053a.b(42, typedArray.getInt(index, c0054b.X));
                    c2 = 5;
                    break;
                case 43:
                    c0053a.a(43, typedArray.getFloat(index, dVar.d));
                    c2 = 5;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    c0053a.d(44, true);
                    c0053a.a(44, typedArray.getDimension(index, eVar.n));
                    c2 = 5;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    c0053a.a(45, typedArray.getFloat(index, eVar.c));
                    c2 = 5;
                    break;
                case 46:
                    c0053a.a(46, typedArray.getFloat(index, eVar.d));
                    c2 = 5;
                    break;
                case 47:
                    c0053a.a(47, typedArray.getFloat(index, eVar.e));
                    c2 = 5;
                    break;
                case 48:
                    c0053a.a(48, typedArray.getFloat(index, eVar.f));
                    c2 = 5;
                    break;
                case 49:
                    c0053a.a(49, typedArray.getDimension(index, eVar.g));
                    c2 = 5;
                    break;
                case 50:
                    c0053a.a(50, typedArray.getDimension(index, eVar.h));
                    c2 = 5;
                    break;
                case 51:
                    c0053a.a(51, typedArray.getDimension(index, eVar.j));
                    c2 = 5;
                    break;
                case 52:
                    c0053a.a(52, typedArray.getDimension(index, eVar.k));
                    c2 = 5;
                    break;
                case 53:
                    c0053a.a(53, typedArray.getDimension(index, eVar.l));
                    c2 = 5;
                    break;
                case 54:
                    c0053a.b(54, typedArray.getInt(index, c0054b.Y));
                    c2 = 5;
                    break;
                case 55:
                    c0053a.b(55, typedArray.getInt(index, c0054b.Z));
                    c2 = 5;
                    break;
                case 56:
                    c0053a.b(56, typedArray.getDimensionPixelSize(index, c0054b.a0));
                    c2 = 5;
                    break;
                case 57:
                    c0053a.b(57, typedArray.getDimensionPixelSize(index, c0054b.b0));
                    c2 = 5;
                    break;
                case 58:
                    c0053a.b(58, typedArray.getDimensionPixelSize(index, c0054b.c0));
                    c2 = 5;
                    break;
                case 59:
                    c0053a.b(59, typedArray.getDimensionPixelSize(index, c0054b.d0));
                    c2 = 5;
                    break;
                case 60:
                    c0053a.a(60, typedArray.getFloat(index, eVar.b));
                    c2 = 5;
                    break;
                case 62:
                    c0053a.b(62, typedArray.getDimensionPixelSize(index, c0054b.B));
                    c2 = 5;
                    break;
                case 63:
                    c0053a.a(63, typedArray.getFloat(index, c0054b.C));
                    c2 = 5;
                    break;
                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                    c0053a.b(64, s(typedArray, index, cVar.b));
                    c2 = 5;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0053a.c(65, typedArray.getString(index));
                    } else {
                        c0053a.c(65, skf.c[typedArray.getInteger(index, 0)]);
                    }
                    c2 = 5;
                    break;
                case 66:
                    c0053a.b(66, typedArray.getInt(index, 0));
                    c2 = 5;
                    break;
                case 67:
                    c0053a.a(67, typedArray.getFloat(index, cVar.h));
                    c2 = 5;
                    break;
                case 68:
                    c0053a.a(68, typedArray.getFloat(index, dVar.e));
                    c2 = 5;
                    break;
                case 69:
                    c0053a.a(69, typedArray.getFloat(index, 1.0f));
                    c2 = 5;
                    break;
                case 70:
                    c0053a.a(70, typedArray.getFloat(index, 1.0f));
                    c2 = 5;
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    c2 = 5;
                    break;
                case 72:
                    c0053a.b(72, typedArray.getInt(index, c0054b.g0));
                    c2 = 5;
                    break;
                case 73:
                    c0053a.b(73, typedArray.getDimensionPixelSize(index, c0054b.h0));
                    c2 = 5;
                    break;
                case 74:
                    c0053a.c(74, typedArray.getString(index));
                    c2 = 5;
                    break;
                case 75:
                    c0053a.d(75, typedArray.getBoolean(index, c0054b.o0));
                    c2 = 5;
                    break;
                case 76:
                    c0053a.b(76, typedArray.getInt(index, cVar.e));
                    c2 = 5;
                    break;
                case 77:
                    c0053a.c(77, typedArray.getString(index));
                    c2 = 5;
                    break;
                case 78:
                    c0053a.b(78, typedArray.getInt(index, dVar.c));
                    c2 = 5;
                    break;
                case 79:
                    c0053a.a(79, typedArray.getFloat(index, cVar.g));
                    c2 = 5;
                    break;
                case 80:
                    c0053a.d(80, typedArray.getBoolean(index, c0054b.m0));
                    c2 = 5;
                    break;
                case 81:
                    c0053a.d(81, typedArray.getBoolean(index, c0054b.n0));
                    c2 = 5;
                    break;
                case 82:
                    c0053a.b(82, typedArray.getInteger(index, cVar.c));
                    c2 = 5;
                    break;
                case 83:
                    c0053a.b(83, s(typedArray, index, eVar.i));
                    c2 = 5;
                    break;
                case 84:
                    c0053a.b(84, typedArray.getInteger(index, cVar.j));
                    c2 = 5;
                    break;
                case 85:
                    c0053a.a(85, typedArray.getFloat(index, cVar.i));
                    c2 = 5;
                    break;
                case 86:
                    int i4 = typedArray.peekValue(index).type;
                    if (i4 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        cVar.m = resourceId2;
                        c0053a.b(89, resourceId2);
                        if (cVar.m != -1) {
                            cVar.l = -2;
                            c0053a.b(88, -2);
                        }
                    } else if (i4 == 3) {
                        String string = typedArray.getString(index);
                        cVar.k = string;
                        c0053a.c(90, string);
                        if (cVar.k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            cVar.m = resourceId3;
                            c0053a.b(89, resourceId3);
                            cVar.l = -2;
                            c0053a.b(88, -2);
                        } else {
                            cVar.l = -1;
                            c0053a.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, cVar.m);
                        cVar.l = integer;
                        c0053a.b(88, integer);
                    }
                    c2 = 5;
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    c2 = 5;
                    break;
                case 93:
                    c0053a.b(93, typedArray.getDimensionPixelSize(index, c0054b.M));
                    c2 = 5;
                    break;
                case 94:
                    c0053a.b(94, typedArray.getDimensionPixelSize(index, c0054b.T));
                    c2 = 5;
                    break;
                case 95:
                    t(c0053a, typedArray, index, 0);
                    c2 = 5;
                    break;
                case 96:
                    t(c0053a, typedArray, index, 1);
                    c2 = 5;
                    break;
                case 97:
                    c0053a.b(97, typedArray.getInt(index, c0054b.p0));
                    c2 = 5;
                    break;
                case 98:
                    if (MotionLayout.U0) {
                        int resourceId4 = typedArray.getResourceId(index, aVar.a);
                        aVar.a = resourceId4;
                        if (resourceId4 == -1) {
                            aVar.b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.b = typedArray.getString(index);
                    } else {
                        aVar.a = typedArray.getResourceId(index, aVar.a);
                    }
                    c2 = 5;
                    break;
                case 99:
                    c0053a.d(99, typedArray.getBoolean(index, c0054b.h));
                    c2 = 5;
                    break;
            }
        }
    }

    public final void A(int i2, int i3) {
        o(i2).c.b = i3;
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map = this.g;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + zzc.d(childAt));
            } else {
                if (this.f && id == -1) {
                    b9p.a("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = map.get(Integer.valueOf(id));
                        if (aVar != null) {
                            d dVar = aVar.c;
                            C0054b c0054b = aVar.e;
                            e eVar = aVar.f;
                            if (childAt instanceof Barrier) {
                                c0054b.i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(c0054b.g0);
                                barrier.setMargin(c0054b.h0);
                                barrier.setAllowsGoneWidget(c0054b.o0);
                                int[] iArr = c0054b.j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = c0054b.k0;
                                    if (str != null) {
                                        int[] iArrM = m(barrier, str);
                                        c0054b.j0 = iArrM;
                                        barrier.setReferencedIds(iArrM);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.a();
                            aVar.a(layoutParams);
                            androidx.constraintlayout.widget.a.e(childAt, aVar.g);
                            childAt.setLayoutParams(layoutParams);
                            if (dVar.c == 0) {
                                childAt.setVisibility(dVar.b);
                            }
                            childAt.setAlpha(dVar.d);
                            childAt.setRotation(eVar.b);
                            childAt.setRotationX(eVar.c);
                            childAt.setRotationY(eVar.d);
                            childAt.setScaleX(eVar.e);
                            childAt.setScaleY(eVar.f);
                            if (eVar.i != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(eVar.i);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.g)) {
                                    childAt.setPivotX(eVar.g);
                                }
                                if (!Float.isNaN(eVar.h)) {
                                    childAt.setPivotY(eVar.h);
                                }
                            }
                            childAt.setTranslationX(eVar.j);
                            childAt.setTranslationY(eVar.k);
                            childAt.setTranslationZ(eVar.l);
                            if (eVar.m) {
                                childAt.setElevation(eVar.n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = map.get(num);
            if (aVar2 != null) {
                C0054b c0054b2 = aVar2.e;
                if (c0054b2.i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = c0054b2.j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = c0054b2.k0;
                        if (str2 != null) {
                            int[] iArrM2 = m(barrier2, str2);
                            c0054b2.j0 = iArrM2;
                            barrier2.setReferencedIds(iArrM2);
                        }
                    }
                    barrier2.setType(c0054b2.g0);
                    barrier2.setMargin(c0054b2.h0);
                    androidx.constraintlayout.widget.c cVar = ConstraintLayout.E;
                    ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
                    barrier2.t();
                    aVar2.a(layoutParams2);
                    constraintLayout.addView(barrier2, layoutParams2);
                }
                if (c0054b2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    androidx.constraintlayout.widget.c cVar2 = ConstraintLayout.E;
                    ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
                    aVar2.a(layoutParams3);
                    constraintLayout.addView(guideline, layoutParams3);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).j(constraintLayout);
            }
        }
    }

    public final void e(int i2, int i3) {
        a aVar;
        Integer numValueOf = Integer.valueOf(i2);
        HashMap<Integer, a> map = this.g;
        if (!map.containsKey(numValueOf) || (aVar = map.get(Integer.valueOf(i2))) == null) {
            return;
        }
        C0054b c0054b = aVar.e;
        switch (i3) {
            case 1:
                c0054b.j = -1;
                c0054b.i = -1;
                c0054b.G = -1;
                c0054b.N = Integer.MIN_VALUE;
                break;
            case 2:
                c0054b.l = -1;
                c0054b.k = -1;
                c0054b.H = -1;
                c0054b.P = Integer.MIN_VALUE;
                break;
            case 3:
                c0054b.n = -1;
                c0054b.m = -1;
                c0054b.I = 0;
                c0054b.O = Integer.MIN_VALUE;
                break;
            case 4:
                c0054b.o = -1;
                c0054b.p = -1;
                c0054b.J = 0;
                c0054b.Q = Integer.MIN_VALUE;
                break;
            case 5:
                c0054b.q = -1;
                c0054b.r = -1;
                c0054b.s = -1;
                c0054b.M = 0;
                c0054b.T = Integer.MIN_VALUE;
                break;
            case 6:
                c0054b.t = -1;
                c0054b.u = -1;
                c0054b.L = 0;
                c0054b.S = Integer.MIN_VALUE;
                break;
            case 7:
                c0054b.v = -1;
                c0054b.w = -1;
                c0054b.K = 0;
                c0054b.R = Integer.MIN_VALUE;
                break;
            case 8:
                c0054b.C = -1.0f;
                c0054b.B = -1;
                c0054b.A = -1;
                break;
            default:
                hb5.a("unknown constraint");
                break;
        }
    }

    public final void f(ConstraintLayout constraintLayout) {
        int i2;
        HashMap<Integer, a> map;
        int i3;
        b bVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map2 = bVar.g;
        map2.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (bVar.f && id == -1) {
                b9p.a("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new a());
            }
            a aVar = map2.get(Integer.valueOf(id));
            if (aVar == null) {
                i2 = childCount;
                map = map2;
                i3 = i4;
            } else {
                d dVar = aVar.c;
                C0054b c0054b = aVar.e;
                e eVar = aVar.f;
                i2 = childCount;
                HashMap<String, androidx.constraintlayout.widget.a> map3 = new HashMap<>();
                map = map2;
                Class<?> cls = childAt.getClass();
                i3 = i4;
                HashMap<String, androidx.constraintlayout.widget.a> map4 = bVar.e;
                for (String str : map4.keySet()) {
                    androidx.constraintlayout.widget.a aVar2 = map4.get(str);
                    HashMap<String, androidx.constraintlayout.widget.a> map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new androidx.constraintlayout.widget.a(aVar2, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new androidx.constraintlayout.widget.a(aVar2, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        StringBuilder sbA = he.a(" Custom Attribute \"", str, "\" not found on ");
                        sbA.append(cls.getName());
                        Log.e("TransitionLayout", sbA.toString(), e2);
                    } catch (NoSuchMethodException e3) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e3);
                    } catch (InvocationTargetException e4) {
                        StringBuilder sbA2 = he.a(" Custom Attribute \"", str, "\" not found on ");
                        sbA2.append(cls.getName());
                        Log.e("TransitionLayout", sbA2.toString(), e4);
                    }
                    map4 = map5;
                }
                aVar.g = map3;
                aVar.c(id, layoutParams);
                dVar.b = childAt.getVisibility();
                dVar.d = childAt.getAlpha();
                eVar.b = childAt.getRotation();
                eVar.c = childAt.getRotationX();
                eVar.d = childAt.getRotationY();
                eVar.e = childAt.getScaleX();
                eVar.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.g = pivotX;
                    eVar.h = pivotY;
                }
                eVar.j = childAt.getTranslationX();
                eVar.k = childAt.getTranslationY();
                eVar.l = childAt.getTranslationZ();
                if (eVar.m) {
                    eVar.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    c0054b.o0 = barrier.getAllowsGoneWidget();
                    c0054b.j0 = barrier.getReferencedIds();
                    c0054b.g0 = barrier.getType();
                    c0054b.h0 = barrier.getMargin();
                }
            }
            i4 = i3 + 1;
            bVar = this;
            childCount = i2;
            map2 = map;
        }
    }

    public final void g(int i2, int i3, int i4, int i5) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap<Integer, a> map = this.g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i2), new a());
        }
        a aVar = map.get(Integer.valueOf(i2));
        if (aVar == null) {
        }
        C0054b c0054b = aVar.e;
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    c0054b.i = i4;
                    c0054b.j = -1;
                } else if (i5 != 2) {
                    d9h0.a(B(i5), "left to ", " undefined");
                } else {
                    c0054b.j = i4;
                    c0054b.i = -1;
                }
                break;
            case 2:
                if (i5 == 1) {
                    c0054b.k = i4;
                    c0054b.l = -1;
                } else if (i5 != 2) {
                    d9h0.a(B(i5), "right to ", " undefined");
                } else {
                    c0054b.l = i4;
                    c0054b.k = -1;
                }
                break;
            case 3:
                if (i5 == 3) {
                    c0054b.m = i4;
                    c0054b.n = -1;
                    c0054b.q = -1;
                    c0054b.r = -1;
                    c0054b.s = -1;
                } else if (i5 != 4) {
                    d9h0.a(B(i5), "right to ", " undefined");
                } else {
                    c0054b.n = i4;
                    c0054b.m = -1;
                    c0054b.q = -1;
                    c0054b.r = -1;
                    c0054b.s = -1;
                }
                break;
            case 4:
                if (i5 == 4) {
                    c0054b.p = i4;
                    c0054b.o = -1;
                    c0054b.q = -1;
                    c0054b.r = -1;
                    c0054b.s = -1;
                } else if (i5 != 3) {
                    d9h0.a(B(i5), "right to ", " undefined");
                } else {
                    c0054b.o = i4;
                    c0054b.p = -1;
                    c0054b.q = -1;
                    c0054b.r = -1;
                    c0054b.s = -1;
                }
                break;
            case 5:
                if (i5 == 5) {
                    c0054b.q = i4;
                    c0054b.p = -1;
                    c0054b.o = -1;
                    c0054b.m = -1;
                    c0054b.n = -1;
                } else if (i5 == 3) {
                    c0054b.r = i4;
                    c0054b.p = -1;
                    c0054b.o = -1;
                    c0054b.m = -1;
                    c0054b.n = -1;
                } else if (i5 != 4) {
                    d9h0.a(B(i5), "right to ", " undefined");
                } else {
                    c0054b.s = i4;
                    c0054b.p = -1;
                    c0054b.o = -1;
                    c0054b.m = -1;
                    c0054b.n = -1;
                }
                break;
            case 6:
                if (i5 == 6) {
                    c0054b.u = i4;
                    c0054b.t = -1;
                } else if (i5 != 7) {
                    d9h0.a(B(i5), "right to ", " undefined");
                } else {
                    c0054b.t = i4;
                    c0054b.u = -1;
                }
                break;
            case 7:
                if (i5 == 7) {
                    c0054b.w = i4;
                    c0054b.v = -1;
                } else if (i5 != 6) {
                    d9h0.a(B(i5), "right to ", " undefined");
                } else {
                    c0054b.v = i4;
                    c0054b.w = -1;
                }
                break;
            default:
                bq7.a(" to ", B(i3), B(i5), " unknown");
                break;
        }
    }

    public final void h(int i2, int i3, int i4, int i5, int i6) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap<Integer, a> map = this.g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i2), new a());
        }
        a aVar = map.get(Integer.valueOf(i2));
        if (aVar == null) {
        }
        C0054b c0054b = aVar.e;
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    c0054b.i = i4;
                    c0054b.j = -1;
                } else if (i5 != 2) {
                    d9h0.a(B(i5), "Left to ", " undefined");
                } else {
                    c0054b.j = i4;
                    c0054b.i = -1;
                }
                c0054b.G = i6;
                break;
            case 2:
                if (i5 == 1) {
                    c0054b.k = i4;
                    c0054b.l = -1;
                } else if (i5 != 2) {
                    d9h0.a(B(i5), "right to ", " undefined");
                } else {
                    c0054b.l = i4;
                    c0054b.k = -1;
                }
                c0054b.H = i6;
                break;
            case 3:
                if (i5 == 3) {
                    c0054b.m = i4;
                    c0054b.n = -1;
                    c0054b.q = -1;
                    c0054b.r = -1;
                    c0054b.s = -1;
                } else if (i5 != 4) {
                    d9h0.a(B(i5), "right to ", " undefined");
                } else {
                    c0054b.n = i4;
                    c0054b.m = -1;
                    c0054b.q = -1;
                    c0054b.r = -1;
                    c0054b.s = -1;
                }
                c0054b.I = i6;
                break;
            case 4:
                if (i5 == 4) {
                    c0054b.p = i4;
                    c0054b.o = -1;
                    c0054b.q = -1;
                    c0054b.r = -1;
                    c0054b.s = -1;
                } else if (i5 != 3) {
                    d9h0.a(B(i5), "right to ", " undefined");
                } else {
                    c0054b.o = i4;
                    c0054b.p = -1;
                    c0054b.q = -1;
                    c0054b.r = -1;
                    c0054b.s = -1;
                }
                c0054b.J = i6;
                break;
            case 5:
                if (i5 == 5) {
                    c0054b.q = i4;
                    c0054b.p = -1;
                    c0054b.o = -1;
                    c0054b.m = -1;
                    c0054b.n = -1;
                } else if (i5 == 3) {
                    c0054b.r = i4;
                    c0054b.p = -1;
                    c0054b.o = -1;
                    c0054b.m = -1;
                    c0054b.n = -1;
                } else if (i5 != 4) {
                    d9h0.a(B(i5), "right to ", " undefined");
                } else {
                    c0054b.s = i4;
                    c0054b.p = -1;
                    c0054b.o = -1;
                    c0054b.m = -1;
                    c0054b.n = -1;
                }
                break;
            case 6:
                if (i5 == 6) {
                    c0054b.u = i4;
                    c0054b.t = -1;
                } else if (i5 != 7) {
                    d9h0.a(B(i5), "right to ", " undefined");
                } else {
                    c0054b.t = i4;
                    c0054b.u = -1;
                }
                c0054b.L = i6;
                break;
            case 7:
                if (i5 == 7) {
                    c0054b.w = i4;
                    c0054b.v = -1;
                } else if (i5 != 6) {
                    d9h0.a(B(i5), "right to ", " undefined");
                } else {
                    c0054b.v = i4;
                    c0054b.w = -1;
                }
                c0054b.K = i6;
                break;
            default:
                bq7.a(" to ", B(i3), B(i5), " unknown");
                break;
        }
    }

    public final void i(int i2, int i3) {
        o(i2).e.d = i3;
    }

    public final void j(int i2, float f) {
        o(i2).e.f0 = f;
    }

    public final void k(int i2, float f) {
        o(i2).e.e0 = f;
    }

    public final void l(int i2, int i3) {
        o(i2).e.c = i3;
    }

    public final a o(int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap<Integer, a> map = this.g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i2), new a());
        }
        return map.get(Integer.valueOf(i2));
    }

    public final a p(int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap<Integer, a> map = this.g;
        if (map.containsKey(numValueOf)) {
            return map.get(Integer.valueOf(i2));
        }
        return null;
    }

    public final void q(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarN = n(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarN.e.a = true;
                    }
                    this.g.put(Integer.valueOf(aVarN.a), aVarN);
                }
            }
        } catch (IOException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e3);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void r(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            a aVarN = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (aVarN == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVarN.e.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (aVarN == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVarN.d.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                continue;
                            } else {
                                aVarN = n(context, Xml.asAttributeSet(xmlResourceParser), true);
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (aVarN == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVarN.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (aVarN == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                aVarN.f.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -71750448:
                            if (!name.equals("Guideline")) {
                                continue;
                            } else {
                                aVarN = n(context, Xml.asAttributeSet(xmlResourceParser), false);
                                C0054b c0054b = aVarN.e;
                                c0054b.a = true;
                                c0054b.b = true;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (!name.equals("Barrier")) {
                                continue;
                            } else {
                                aVarN = n(context, Xml.asAttributeSet(xmlResourceParser), false);
                                aVarN.e.i0 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            }
                            break;
                        case 1803088381:
                            if (!name.equals("Constraint")) {
                                continue;
                            } else {
                                aVarN = n(context, Xml.asAttributeSet(xmlResourceParser), false);
                            }
                            break;
                        default:
                            continue;
                    }
                    if (aVarN == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                    }
                    androidx.constraintlayout.widget.a.d(context, xmlResourceParser, aVarN.g);
                } else if (eventType == 3) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (!lowerCase.equals("constraintset")) {
                                continue;
                            } else {
                                return;
                            }
                            break;
                        default:
                            continue;
                    }
                    this.g.put(Integer.valueOf(aVarN.a), aVarN);
                    aVarN = null;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e2) {
            Log.e("ConstraintSet", "Error parsing XML resource", e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintSet", "Error parsing XML resource", e3);
        }
    }

    public final void w(int i2, float f) {
        o(i2).c.d = f;
    }

    public final void x(int i2) {
        o(i2).e.O = 0;
    }

    public final void y(float f) {
        o(R.id.multi_guideline).e.g = f;
        o(R.id.multi_guideline).e.f = -1;
        o(R.id.multi_guideline).e.e = -1;
    }

    public final void z(int i2, int i3, int i4) {
        a aVarO = o(i2);
        switch (i3) {
            case 1:
                aVarO.e.G = i4;
                break;
            case 2:
                aVarO.e.H = i4;
                break;
            case 3:
                aVarO.e.I = i4;
                break;
            case 4:
                aVarO.e.J = i4;
                break;
            case 5:
                aVarO.e.M = i4;
                break;
            case 6:
                aVarO.e.L = i4;
                break;
            case 7:
                aVarO.e.K = i4;
                break;
            default:
                hb5.a("unknown constraint");
                break;
        }
    }

    public final void a(MotionLayout motionLayout) {
        a aVar;
        int childCount = motionLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = motionLayout.getChildAt(i2);
            int id = childAt.getId();
            Integer numValueOf = Integer.valueOf(id);
            HashMap<Integer, a> map = this.g;
            if (!map.containsKey(numValueOf)) {
                Log.w(iKBWavCysVP.wGqNGbMdXT, "id unknown " + zzc.d(childAt));
            } else if (this.f && id == -1) {
                b9p.a("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            } else if (map.containsKey(Integer.valueOf(id)) && (aVar = map.get(Integer.valueOf(id))) != null) {
                androidx.constraintlayout.widget.a.e(childAt, aVar.g);
            }
        }
    }
}
