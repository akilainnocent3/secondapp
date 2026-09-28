package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface e06 {

    public static final class a implements e06 {
        @Override // defpackage.e06
        public final c06 b() {
            return c06.a;
        }

        @Override // defpackage.e06
        public final c4f0 c() {
            return c4f0.b;
        }

        @Override // defpackage.e06
        public final long d() {
            return -1L;
        }

        @Override // defpackage.e06
        public final CaptureResult e() {
            return null;
        }

        @Override // defpackage.e06
        public final zz5 f() {
            return zz5.a;
        }

        @Override // defpackage.e06
        public final b06 g() {
            return b06.a;
        }

        @Override // defpackage.e06
        public final xz5 h() {
            return xz5.a;
        }
    }

    default void a(wug.a aVar) {
        int i;
        ArrayList arrayList = aVar.a;
        c06 c06VarB = b();
        if (c06VarB == c06.a) {
            return;
        }
        int iOrdinal = c06VarB.ordinal();
        if (iOrdinal == 1) {
            i = 32;
        } else if (iOrdinal == 2) {
            i = 0;
        } else {
            if (iOrdinal != 3) {
                pgt.i("ExifData", "Unknown flash state: " + c06VarB);
                return;
            }
            i = 1;
        }
        if ((i & 1) == 1) {
            aVar.c("LightSource", String.valueOf(4), arrayList);
        }
        aVar.c("Flash", String.valueOf(i), arrayList);
    }

    c06 b();

    c4f0 c();

    long d();

    default CaptureResult e() {
        return null;
    }

    zz5 f();

    b06 g();

    xz5 h();
}
