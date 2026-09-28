package defpackage;

import android.hardware.camera2.params.OutputConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class raz extends qaz {

    public static final class a {
        public final OutputConfiguration a;
        public long b = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() ^ 31;
            return Long.hashCode(this.b) ^ ((iHashCode << 5) - iHashCode);
        }
    }

    @Override // defpackage.qaz, defpackage.paz, oaz.a
    public void c(long j) {
        ((a) this.a).b = j;
    }

    @Override // defpackage.qaz, defpackage.paz, oaz.a
    public final void d(String str) {
        ((OutputConfiguration) h()).setPhysicalCameraId(str);
    }

    @Override // defpackage.qaz, defpackage.paz, oaz.a
    public final String e() {
        return null;
    }

    @Override // defpackage.qaz, defpackage.paz, oaz.a
    public Object h() {
        Object obj = this.a;
        km20.b(obj instanceof a);
        return ((a) obj).a;
    }
}
