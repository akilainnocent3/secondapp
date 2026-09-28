package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes.dex */
public interface wxg0 {

    public static final class a {
        public final String a;
        public final byte[] b;

        public a(String str, byte[] bArr) {
            this.a = str;
            this.b = bArr;
        }
    }

    public static final class b {
        public final String a;
        public final int b;
        public final List<a> c;
        public final byte[] d;

        public b(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
            this.a = str;
            this.b = i2;
            this.c = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
            this.d = bArr;
        }

        public final int a() {
            int i = this.b;
            if (i != 2) {
                return i != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    public static final class c {
        public final String a;
        public final int b;
        public final int c;
        public int d;
        public String e;

        public c(int i, int i2, int i3) {
            this.a = i != Integer.MIN_VALUE ? m58.a(i, "/") : "";
            this.b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
            this.e = "";
        }

        public final void a() {
            int i = this.d;
            this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
            this.e = this.a + this.d;
        }

        public final void b() {
            if (this.d != Integer.MIN_VALUE) {
                return;
            }
            ib5.a(Chyeyik.JTk);
        }

        public c(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }
    }

    void a(int i, nsz nszVar);

    void b(zxf0 zxf0Var, m4h m4hVar, c cVar);

    void c();
}
