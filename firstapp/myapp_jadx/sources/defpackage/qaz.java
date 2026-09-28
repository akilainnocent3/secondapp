package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class qaz extends paz {

    public static final class a {
        public final OutputConfiguration a;
        public String b;
        public long c = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.c == aVar.c && Objects.equals(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() ^ 31;
            int i = (iHashCode << 5) - iHashCode;
            String str = this.b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i;
            return Long.hashCode(this.c) ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    @Override // defpackage.taz, oaz.a
    public final void b(Surface surface) {
        ((OutputConfiguration) h()).addSurface(surface);
    }

    @Override // defpackage.paz, oaz.a
    public void c(long j) {
        ((a) this.a).c = j;
    }

    @Override // defpackage.paz, oaz.a
    public void d(String str) {
        ((a) this.a).b = str;
    }

    @Override // defpackage.paz, oaz.a
    public String e() {
        return ((a) this.a).b;
    }

    @Override // defpackage.paz, oaz.a
    public final void f() {
        ((OutputConfiguration) h()).enableSurfaceSharing();
    }

    @Override // defpackage.paz, oaz.a
    public Object h() {
        Object obj = this.a;
        km20.b(obj instanceof a);
        return ((a) obj).a;
    }

    @Override // defpackage.paz, defpackage.taz
    public final boolean j() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }
}
