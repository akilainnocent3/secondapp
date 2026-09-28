package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ekh<Data> implements i2w<File, Data> {
    public final d<Data> a;

    public static class a<Data> implements j2w<File, Data> {
        public final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // defpackage.j2w
        public final i2w<File, Data> c(wjw wjwVar) {
            return new ekh(this.a);
        }
    }

    public static class b extends a<ParcelFileDescriptor> {
    }

    public interface d<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(File file);
    }

    public static class e extends a<InputStream> {
    }

    public ekh(d<Data> dVar) {
        this.a = dVar;
    }

    @Override // defpackage.i2w
    public final i2w.a a(File file, int i, int i2, s2z s2zVar) {
        File file2 = file;
        return new i2w.a(new acy(file2), new c(file2, this.a));
    }

    @Override // defpackage.i2w
    public final boolean b(File file) {
        return true;
    }

    public static final class c<Data> implements cpc<Data> {
        public final File a;
        public final d<Data> b;
        public Data c;

        public c(File file, d<Data> dVar) {
            this.a = file;
            this.b = dVar;
        }

        @Override // defpackage.cpc
        public final Class<Data> a() {
            return this.b.a();
        }

        @Override // defpackage.cpc
        public final void b() {
            Data data = this.c;
            if (data != null) {
                try {
                    this.b.b(data);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r2v5, types: [Data, java.lang.Object] */
        @Override // defpackage.cpc
        public final void d(lw20 lw20Var, cpc.a<? super Data> aVar) {
            try {
                Data dataC = this.b.c(this.a);
                this.c = dataC;
                aVar.f(dataC);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                aVar.c(e);
            }
        }

        @Override // defpackage.cpc
        public final cqc e() {
            return cqc.a;
        }

        @Override // defpackage.cpc
        public final void cancel() {
        }
    }
}
