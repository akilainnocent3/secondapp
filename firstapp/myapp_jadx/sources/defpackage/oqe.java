package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class oqe<DataT> implements i2w<Integer, DataT> {
    public final Context a;
    public final e<DataT> b;

    public static final class a implements j2w<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // oqe.e
        public final Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // oqe.e
        public final void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // defpackage.j2w
        public final i2w<Integer, AssetFileDescriptor> c(wjw wjwVar) {
            return new oqe(this.a, this);
        }

        @Override // oqe.e
        public final Object d(int i, Resources.Theme theme, Resources resources) {
            return resources.openRawResourceFd(i);
        }
    }

    public static final class b implements j2w<Integer, Drawable>, e<Drawable> {
        public final Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // oqe.e
        public final Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // oqe.e
        public final void b(Drawable drawable) {
        }

        @Override // defpackage.j2w
        public final i2w<Integer, Drawable> c(wjw wjwVar) {
            return new oqe(this.a, this);
        }

        @Override // oqe.e
        public final Object d(int i, Resources.Theme theme, Resources resources) {
            Context context = this.a;
            return cdf.a(context, context, i, theme);
        }
    }

    public static final class c implements j2w<Integer, InputStream>, e<InputStream> {
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // oqe.e
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // oqe.e
        public final void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // defpackage.j2w
        public final i2w<Integer, InputStream> c(wjw wjwVar) {
            return new oqe(this.a, this);
        }

        @Override // oqe.e
        public final Object d(int i, Resources.Theme theme, Resources resources) {
            return resources.openRawResource(i);
        }
    }

    public interface e<DataT> {
        Class<DataT> a();

        void b(DataT datat);

        Object d(int i, Resources.Theme theme, Resources resources);
    }

    public oqe(Context context, e<DataT> eVar) {
        this.a = context.getApplicationContext();
        this.b = eVar;
    }

    @Override // defpackage.i2w
    public final i2w.a a(Integer num, int i, int i2, s2z s2zVar) {
        Integer num2 = num;
        Resources.Theme theme = (Resources.Theme) s2zVar.c(yg50.b);
        return new i2w.a(new acy(num2), new d(theme, theme != null ? theme.getResources() : this.a.getResources(), this.b, num2.intValue()));
    }

    @Override // defpackage.i2w
    public final boolean b(Integer num) {
        return true;
    }

    public static final class d<DataT> implements cpc<DataT> {
        public final Resources.Theme a;
        public final Resources b;
        public final e<DataT> c;
        public final int d;
        public DataT e;

        public d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i) {
            this.a = theme;
            this.b = resources;
            this.c = eVar;
            this.d = i;
        }

        @Override // defpackage.cpc
        public final Class<DataT> a() {
            return this.c.a();
        }

        @Override // defpackage.cpc
        public final void b() {
            DataT datat = this.e;
            if (datat != null) {
                try {
                    this.c.b(datat);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [DataT, java.lang.Object] */
        @Override // defpackage.cpc
        public final void d(lw20 lw20Var, cpc.a<? super DataT> aVar) {
            try {
                ?? r4 = (DataT) this.c.d(this.d, this.a, this.b);
                this.e = r4;
                aVar.f(r4);
            } catch (Resources.NotFoundException e) {
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
