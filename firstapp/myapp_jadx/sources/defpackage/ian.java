package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface ian {

    public static final class b implements ian {
        public final com.bumptech.glide.load.data.c a;
        public final px0 b;
        public final ArrayList c;

        public b(npu npuVar, ArrayList arrayList, px0 px0Var) {
            gm20.c(px0Var, "Argument must not be null");
            this.b = px0Var;
            this.c = arrayList;
            this.a = new com.bumptech.glide.load.data.c(npuVar, px0Var);
        }

        @Override // defpackage.ian
        public final Bitmap a(BitmapFactory.Options options) {
            bl40 bl40Var = this.a.a;
            bl40Var.reset();
            return tzk.b(bl40Var, options, this);
        }

        @Override // defpackage.ian
        public final boolean b() {
            bl40 bl40Var = this.a.a;
            bl40Var.reset();
            px0 px0Var = this.b;
            bl40Var.mark(5242880);
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                try {
                    boolean zB = ((ImageHeaderParser) arrayList.get(i)).b(bl40Var, px0Var);
                    bl40Var.reset();
                    if (zB) {
                        return true;
                    }
                } catch (Throwable th) {
                    bl40Var.reset();
                    throw th;
                }
            }
            return false;
        }

        @Override // defpackage.ian
        public final void c() {
            bl40 bl40Var = this.a.a;
            synchronized (bl40Var) {
                bl40Var.c = bl40Var.a.length;
            }
        }

        @Override // defpackage.ian
        public final int d() {
            bl40 bl40Var = this.a.a;
            bl40Var.reset();
            return com.bumptech.glide.load.a.a(this.c, bl40Var, this.b);
        }

        @Override // defpackage.ian
        public final ImageHeaderParser.ImageType e() {
            bl40 bl40Var = this.a.a;
            bl40Var.reset();
            return com.bumptech.glide.load.a.b(this.c, bl40Var, this.b);
        }
    }

    Bitmap a(BitmapFactory.Options options);

    boolean b();

    void c();

    int d();

    ImageHeaderParser.ImageType e();

    public static final class a implements ian {
        public final ByteBuffer a;
        public final ArrayList b;
        public final px0 c;

        public a(ByteBuffer byteBuffer, ArrayList arrayList, px0 px0Var) {
            this.a = byteBuffer;
            this.b = arrayList;
            this.c = px0Var;
        }

        @Override // defpackage.ian
        public final Bitmap a(BitmapFactory.Options options) {
            return tzk.b(new fl5.a(fl5.c(this.a)), options, this);
        }

        @Override // defpackage.ian
        public final boolean b() {
            ByteBuffer byteBufferC = fl5.c(this.a);
            px0 px0Var = this.c;
            if (byteBufferC != null) {
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        boolean zD = ((ImageHeaderParser) arrayList.get(i)).d(byteBufferC, px0Var);
                        if (zD) {
                            return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return false;
        }

        @Override // defpackage.ian
        public final int d() {
            ByteBuffer byteBufferC = fl5.c(this.a);
            px0 px0Var = this.c;
            if (byteBufferC != null) {
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        int iF = ((ImageHeaderParser) arrayList.get(i)).f(byteBufferC, px0Var);
                        if (iF != -1) {
                            return iF;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return -1;
        }

        @Override // defpackage.ian
        public final ImageHeaderParser.ImageType e() {
            return com.bumptech.glide.load.a.c(this.b, fl5.c(this.a));
        }

        @Override // defpackage.ian
        public final void c() {
        }
    }

    public static final class c implements ian {
        public final px0 a;
        public final ArrayList b;
        public final ParcelFileDescriptorRewinder c;

        public c(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, px0 px0Var) {
            gm20.c(px0Var, "Argument must not be null");
            this.a = px0Var;
            this.b = arrayList;
            this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // defpackage.ian
        public final Bitmap a(BitmapFactory.Options options) {
            return tzk.a(this.c.c().getFileDescriptor(), options, this);
        }

        @Override // defpackage.ian
        public final boolean b() throws Throwable {
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            px0 px0Var = this.a;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = (ImageHeaderParser) arrayList.get(i);
                bl40 bl40Var = null;
                try {
                    bl40 bl40Var2 = new bl40(new FileInputStream(parcelFileDescriptorRewinder.c().getFileDescriptor()), px0Var);
                    try {
                        boolean zB = imageHeaderParser.b(bl40Var2, px0Var);
                        bl40Var2.f();
                        parcelFileDescriptorRewinder.c();
                        if (zB) {
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bl40Var = bl40Var2;
                        if (bl40Var != null) {
                            bl40Var.f();
                        }
                        parcelFileDescriptorRewinder.c();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return false;
        }

        @Override // defpackage.ian
        public final int d() throws Throwable {
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            px0 px0Var = this.a;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = (ImageHeaderParser) arrayList.get(i);
                bl40 bl40Var = null;
                try {
                    bl40 bl40Var2 = new bl40(new FileInputStream(parcelFileDescriptorRewinder.c().getFileDescriptor()), px0Var);
                    try {
                        int iA = imageHeaderParser.a(bl40Var2, px0Var);
                        bl40Var2.f();
                        parcelFileDescriptorRewinder.c();
                        if (iA != -1) {
                            return iA;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bl40Var = bl40Var2;
                        if (bl40Var != null) {
                            bl40Var.f();
                        }
                        parcelFileDescriptorRewinder.c();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return -1;
        }

        @Override // defpackage.ian
        public final ImageHeaderParser.ImageType e() throws Throwable {
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            px0 px0Var = this.a;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = (ImageHeaderParser) arrayList.get(i);
                bl40 bl40Var = null;
                try {
                    bl40 bl40Var2 = new bl40(new FileInputStream(parcelFileDescriptorRewinder.c().getFileDescriptor()), px0Var);
                    try {
                        ImageHeaderParser.ImageType imageTypeE = imageHeaderParser.e(bl40Var2);
                        bl40Var2.f();
                        parcelFileDescriptorRewinder.c();
                        if (imageTypeE != ImageHeaderParser.ImageType.UNKNOWN) {
                            return imageTypeE;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bl40Var = bl40Var2;
                        if (bl40Var != null) {
                            bl40Var.f();
                        }
                        parcelFileDescriptorRewinder.c();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }

        @Override // defpackage.ian
        public final void c() {
        }
    }
}
