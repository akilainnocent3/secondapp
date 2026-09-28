package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class paz extends taz {

    public static final class a {
        public final OutputConfiguration a;
        public String b;
        public boolean c;
        public long d = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.c == aVar.c && this.d == aVar.d && Objects.equals(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() ^ 31;
            int i = (this.c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
            int i2 = (i << 5) - i;
            String str = this.b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i2;
            return Long.hashCode(this.d) ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    @Override // oaz.a
    public void c(long j) {
        ((a) this.a).d = j;
    }

    @Override // oaz.a
    public void d(String str) {
        ((a) this.a).b = str;
    }

    @Override // oaz.a
    public String e() {
        return ((a) this.a).b;
    }

    @Override // oaz.a
    public void f() {
        ((a) this.a).c = true;
    }

    @Override // oaz.a
    public Object h() {
        Object obj = this.a;
        km20.b(obj instanceof a);
        return ((a) obj).a;
    }

    @Override // defpackage.taz
    public final Surface i() {
        return ((OutputConfiguration) h()).getSurface();
    }

    @Override // defpackage.taz
    public boolean j() {
        return ((a) this.a).c;
    }
}
