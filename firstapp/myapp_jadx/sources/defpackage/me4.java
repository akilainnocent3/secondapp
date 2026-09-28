package defpackage;

import android.content.Context;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class me4 extends tj90<g5d, w9n, r8n> implements q8n {
    public final Context n;
    public final int o;

    public static final class a {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
        
            if (android.os.Build.VERSION.SDK_INT >= 26) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
        
            if (android.os.Build.VERSION.SDK_INT >= 34) goto L45;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int a(androidx.media3.common.a r5) {
            /*
                r4 = this;
                java.lang.String r4 = r5.n
                r0 = 0
                if (r4 == 0) goto L86
                boolean r4 = defpackage.gqv.j(r4)
                if (r4 != 0) goto Ld
                goto L86
            Ld:
                java.lang.String r4 = r5.n
                java.lang.String r5 = defpackage.jrh0.a
                r4.getClass()
                int r5 = r4.hashCode()
                r1 = 4
                r2 = 1
                r3 = -1
                switch(r5) {
                    case -1487656890: goto L61;
                    case -1487464693: goto L56;
                    case -1487464690: goto L4b;
                    case -1487394660: goto L40;
                    case -1487018032: goto L35;
                    case -879272239: goto L2a;
                    case -879258763: goto L1f;
                    default: goto L1e;
                }
            L1e:
                goto L6b
            L1f:
                java.lang.String r5 = "image/png"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L28
                goto L6b
            L28:
                r3 = 6
                goto L6b
            L2a:
                java.lang.String r5 = "image/bmp"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L33
                goto L6b
            L33:
                r3 = 5
                goto L6b
            L35:
                java.lang.String r5 = "image/webp"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L3e
                goto L6b
            L3e:
                r3 = r1
                goto L6b
            L40:
                java.lang.String r5 = "image/jpeg"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L49
                goto L6b
            L49:
                r3 = 3
                goto L6b
            L4b:
                java.lang.String r5 = "image/heif"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L54
                goto L6b
            L54:
                r3 = 2
                goto L6b
            L56:
                java.lang.String r5 = "image/heic"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L5f
                goto L6b
            L5f:
                r3 = r2
                goto L6b
            L61:
                java.lang.String r5 = "image/avif"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L6a
                goto L6b
            L6a:
                r3 = r0
            L6b:
                switch(r3) {
                    case 0: goto L76;
                    case 1: goto L6f;
                    case 2: goto L6f;
                    case 3: goto L7c;
                    case 4: goto L7c;
                    case 5: goto L7c;
                    case 6: goto L7c;
                    default: goto L6e;
                }
            L6e:
                goto L81
            L6f:
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 26
                if (r4 < r5) goto L81
                goto L7c
            L76:
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 34
                if (r4 < r5) goto L81
            L7c:
                int r4 = androidx.media3.exoplayer.l.k(r1, r0, r0, r0)
                return r4
            L81:
                int r4 = androidx.media3.exoplayer.l.k(r2, r0, r0, r0)
                return r4
            L86:
                int r4 = androidx.media3.exoplayer.l.k(r0, r0, r0, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: me4.a.a(androidx.media3.common.a):int");
        }
    }

    public me4(Context context) {
        super(new g5d[1], new w9n[1]);
        this.n = context;
        this.o = -1;
    }

    @Override // defpackage.tj90
    public final g5d g() {
        return new g5d(1);
    }

    @Override // defpackage.tj90
    public final h5d h() {
        return new le4(this);
    }

    @Override // defpackage.tj90
    public final f5d i(Throwable th) {
        return new r8n("Unexpected decode error", th);
    }

    @Override // defpackage.tj90
    public final f5d j(g5d g5dVar, h5d h5dVar, boolean z) {
        w9n w9nVar = (w9n) h5dVar;
        ByteBuffer byteBuffer = g5dVar.d;
        byteBuffer.getClass();
        ly0.f(byteBuffer.hasArray());
        ly0.b(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.o;
            if (iMax == -1) {
                Context context = this.n;
                if (context != null) {
                    Point pointW = jrh0.w(context);
                    int i = pointW.x;
                    int i2 = pointW.y;
                    androidx.media3.common.a aVar = g5dVar.b;
                    if (aVar != null) {
                        int i3 = aVar.M;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = aVar.N;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            w9nVar.d = ye4.a(byteBuffer.array(), byteBuffer.remaining(), iMax);
            w9nVar.b = g5dVar.f;
            return null;
        } catch (ssz e) {
            return new r8n("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new r8n(e2);
        }
    }
}
