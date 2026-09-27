package hk;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class i implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f88445d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f88446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f88448c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements h.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f88449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f88450b;

        public a(byte[] bArr, int[] iArr) {
            this.f88449a = bArr;
            this.f88450b = iArr;
        }

        @Override // hk.h.d
        public void a(InputStream inputStream, int i10) throws IOException {
            try {
                inputStream.read(this.f88449a, this.f88450b[0], i10);
                int[] iArr = this.f88450b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f88452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f88453b;

        public b(byte[] bArr, int i10) {
            this.f88452a = bArr;
            this.f88453b = i10;
        }
    }

    public i(File file, int i10) {
        this.f88446a = file;
        this.f88447b = i10;
    }

    @Override // hk.d
    public byte[] a() {
        b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i10 = bVarG.f88453b;
        byte[] bArr = new byte[i10];
        System.arraycopy(bVarG.f88452a, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // hk.d
    public void b() {
        d();
        this.f88446a.delete();
    }

    @Override // hk.d
    public void c(long j10, String str) {
        h();
        f(j10, str);
    }

    @Override // hk.d
    public void d() {
        fk.i.f(this.f88448c, "There was a problem closing the Crashlytics log file.");
        this.f88448c = null;
    }

    @Override // hk.d
    public String e() {
        byte[] bArrA = a();
        if (bArrA != null) {
            return new String(bArrA, f88445d);
        }
        return null;
    }

    public final void f(long j10, String str) {
        if (this.f88448c == null) {
            return;
        }
        if (str == null) {
            str = fw.b.f85379f;
        }
        try {
            int i10 = this.f88447b / 4;
            if (str.length() > i10) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f88448c.h(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll(za.h.f160939d, " ").replaceAll(IOUtils.LINE_SEPARATOR_UNIX, " ")).getBytes(f88445d));
            while (!this.f88448c.p() && this.f88448c.S() > this.f88447b) {
                this.f88448c.H();
            }
        } catch (IOException e10) {
            ck.g.f().e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    public final b g() {
        if (!this.f88446a.exists()) {
            return null;
        }
        h();
        h hVar = this.f88448c;
        if (hVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[hVar.S()];
        try {
            this.f88448c.m(new a(bArr, iArr));
        } catch (IOException e10) {
            ck.g.f().e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new b(bArr, iArr[0]);
    }

    public final void h() {
        if (this.f88448c == null) {
            try {
                this.f88448c = new h(this.f88446a);
            } catch (IOException e10) {
                ck.g.f().e("Could not open log file: " + this.f88446a, e10);
            }
        }
    }
}
