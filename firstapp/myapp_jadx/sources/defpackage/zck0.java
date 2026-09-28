package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.c;
import androidx.camera.core.e;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class zck0 {
    public final e16 a;
    public final od80 b;
    public final adk0 c;
    public boolean d = false;
    public boolean e = false;
    public final boolean f;
    public final boolean g;
    public e h;
    public gcn i;
    public a j;

    public static class a {
        public ImageWriter a;
        public final AtomicBoolean b = new AtomicBoolean(true);
        public final od80 c;

        public a(od80 od80Var) {
            this.c = od80Var;
        }
    }

    public zck0(e16 e16Var, od80 od80Var) {
        boolean z;
        this.f = false;
        this.g = false;
        this.a = e16Var;
        this.b = od80Var;
        int[] iArr = (int[]) e16Var.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null) {
            z = false;
            break;
        }
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else {
                if (iArr[i] == 4) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.f = z;
        this.g = zhe.a.b(ZslDisablerQuirk.class) != null;
        this.c = new adk0(new wck0());
    }

    public final void a() {
        e eVar = this.h;
        if (eVar != null) {
            eVar.e();
            this.h = null;
        }
        a aVar = this.j;
        if (aVar != null) {
            aVar.b.set(false);
            this.j = null;
        }
        b();
        gcn gcnVar = this.i;
        if (gcnVar != null) {
            gcnVar.a();
            this.i = null;
        }
    }

    public final void b() {
        boolean zIsEmpty;
        adk0 adk0Var = this.c;
        while (true) {
            synchronized (adk0Var.b) {
                zIsEmpty = adk0Var.a.isEmpty();
            }
            if (zIsEmpty) {
                return;
            } else {
                ((c) adk0Var.a()).close();
            }
        }
    }
}
