package e8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f80546g = "PrintHelper";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f80547h = 3500;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f80548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f80549j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f80550k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f80551l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f80552m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f80553n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f80554o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f80555p = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f80556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BitmapFactory.Options f80557b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f80558c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80559d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80560e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f80561f = 1;

    /* JADX INFO: renamed from: e8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class AsyncTaskC0788a extends AsyncTask<Void, Void, Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CancellationSignal f80562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PrintAttributes f80563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bitmap f80564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ PrintAttributes f80565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f80566e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptor f80567f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f80568g;

        public AsyncTaskC0788a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i10, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f80562a = cancellationSignal;
            this.f80563b = printAttributes;
            this.f80564c = bitmap;
            this.f80565d = printAttributes2;
            this.f80566e = i10;
            this.f80567f = parcelFileDescriptor;
            this.f80568g = writeResultCallback;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable doInBackground(Void... voidArr) {
            RectF rectF;
            try {
                if (this.f80562a.isCanceled()) {
                    return null;
                }
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(a.this.f80556a, this.f80563b);
                Bitmap bitmapA = a.a(this.f80564c, this.f80563b.getColorMode());
                if (this.f80562a.isCanceled()) {
                    return null;
                }
                try {
                    PdfDocument.Page pageStartPage = printedPdfDocument.startPage(1);
                    boolean z10 = a.f80549j;
                    if (z10) {
                        rectF = new RectF(pageStartPage.getInfo().getContentRect());
                    } else {
                        PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(a.this.f80556a, this.f80565d);
                        PdfDocument.Page pageStartPage2 = printedPdfDocument2.startPage(1);
                        RectF rectF2 = new RectF(pageStartPage2.getInfo().getContentRect());
                        printedPdfDocument2.finishPage(pageStartPage2);
                        printedPdfDocument2.close();
                        rectF = rectF2;
                    }
                    Matrix matrixD = a.d(bitmapA.getWidth(), bitmapA.getHeight(), rectF, this.f80566e);
                    if (!z10) {
                        matrixD.postTranslate(rectF.left, rectF.top);
                        pageStartPage.getCanvas().clipRect(rectF);
                    }
                    pageStartPage.getCanvas().drawBitmap(bitmapA, matrixD, null);
                    printedPdfDocument.finishPage(pageStartPage);
                    if (this.f80562a.isCanceled()) {
                        return null;
                    }
                    printedPdfDocument.writeTo(new FileOutputStream(this.f80567f.getFileDescriptor()));
                    return null;
                } finally {
                    printedPdfDocument.close();
                    ParcelFileDescriptor parcelFileDescriptor = this.f80567f;
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (bitmapA != this.f80564c) {
                        bitmapA.recycle();
                    }
                }
            } catch (Throwable th2) {
                return th2;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Throwable th2) {
            if (this.f80562a.isCanceled()) {
                this.f80568g.onWriteCancelled();
            } else if (th2 == null) {
                this.f80568g.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                Log.e(a.f80546g, "Error writing printed content", th2);
                this.f80568g.onWriteFailed(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void onFinish();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(19)
    public class c extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f80571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bitmap f80572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f80573d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public PrintAttributes f80574e;

        public c(String str, int i10, Bitmap bitmap, b bVar) {
            this.f80570a = str;
            this.f80571b = i10;
            this.f80572c = bitmap;
            this.f80573d = bVar;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            b bVar = this.f80573d;
            if (bVar != null) {
                bVar.onFinish();
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f80574e = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f80570a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            a.this.r(this.f80574e, this.f80571b, this.f80572c, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(19)
    public class d extends PrintDocumentAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f80577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f80578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f80579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public PrintAttributes f80580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public AsyncTask<Uri, Boolean, Bitmap> f80581f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Bitmap f80582g = null;

        /* JADX INFO: renamed from: e8.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class AsyncTaskC0789a extends AsyncTask<Uri, Boolean, Bitmap> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CancellationSignal f80584a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PrintAttributes f80585b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PrintAttributes f80586c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f80587d;

            /* JADX INFO: renamed from: e8.a$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public class C0790a implements CancellationSignal.OnCancelListener {
                public C0790a() {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    d.this.a();
                    AsyncTaskC0789a.this.cancel(false);
                }
            }

            public AsyncTaskC0789a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f80584a = cancellationSignal;
                this.f80585b = printAttributes;
                this.f80586c = printAttributes2;
                this.f80587d = layoutResultCallback;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    d dVar = d.this;
                    return a.this.i(dVar.f80577b);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onCancelled(Bitmap bitmap) {
                this.f80587d.onLayoutCancelled();
                d.this.f80581f = null;
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0012  */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Bitmap bitmap) {
                Bitmap bitmapCreateBitmap;
                PrintAttributes.MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap == null || (a.f80548i && a.this.f80561f != 0)) {
                    bitmapCreateBitmap = bitmap;
                } else {
                    synchronized (this) {
                        mediaSize = d.this.f80580e.getMediaSize();
                    }
                    if (mediaSize == null || mediaSize.isPortrait() == a.g(bitmap)) {
                        bitmapCreateBitmap = bitmap;
                    } else {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                d.this.f80582g = bitmapCreateBitmap;
                if (bitmapCreateBitmap != null) {
                    this.f80587d.onLayoutFinished(new PrintDocumentInfo.Builder(d.this.f80576a).setContentType(1).setPageCount(1).build(), true ^ this.f80585b.equals(this.f80586c));
                } else {
                    this.f80587d.onLayoutFailed(null);
                }
                d.this.f80581f = null;
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
                this.f80584a.setOnCancelListener(new C0790a());
            }
        }

        public d(String str, Uri uri, b bVar, int i10) {
            this.f80576a = str;
            this.f80577b = uri;
            this.f80578c = bVar;
            this.f80579d = i10;
        }

        public void a() {
            synchronized (a.this.f80558c) {
                try {
                    BitmapFactory.Options options = a.this.f80557b;
                    if (options != null) {
                        if (Build.VERSION.SDK_INT < 24) {
                            options.requestCancelDecode();
                        }
                        a.this.f80557b = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            a();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f80581f;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            b bVar = this.f80578c;
            if (bVar != null) {
                bVar.onFinish();
            }
            Bitmap bitmap = this.f80582g;
            if (bitmap != null) {
                bitmap.recycle();
                this.f80582g = null;
            }
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0048 */
        @Override // android.print.PrintDocumentAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onLayout(android.print.PrintAttributes r7, android.print.PrintAttributes r8, android.os.CancellationSignal r9, android.print.PrintDocumentAdapter.LayoutResultCallback r10, android.os.Bundle r11) throws java.lang.Throwable {
            /*
                r6 = this;
                monitor-enter(r6)
                r6.f80580e = r8     // Catch: java.lang.Throwable -> L43
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L43
                boolean r11 = r9.isCanceled()
                if (r11 == 0) goto Le
                r10.onLayoutCancelled()
                return
            Le:
                android.graphics.Bitmap r11 = r6.f80582g
                if (r11 == 0) goto L2f
                android.print.PrintDocumentInfo$Builder r9 = new android.print.PrintDocumentInfo$Builder
                java.lang.String r11 = r6.f80576a
                r9.<init>(r11)
                r11 = 1
                android.print.PrintDocumentInfo$Builder r9 = r9.setContentType(r11)
                android.print.PrintDocumentInfo$Builder r9 = r9.setPageCount(r11)
                android.print.PrintDocumentInfo r9 = r9.build()
                boolean r7 = r8.equals(r7)
                r7 = r7 ^ r11
                r10.onLayoutFinished(r9, r7)
                return
            L2f:
                e8.a$d$a r0 = new e8.a$d$a
                r1 = r6
                r4 = r7
                r3 = r8
                r2 = r9
                r5 = r10
                r0.<init>(r2, r3, r4, r5)
                r7 = 0
                android.net.Uri[] r7 = new android.net.Uri[r7]
                android.os.AsyncTask r7 = r0.execute(r7)
                r1.f80581f = r7
                return
            L43:
                r0 = move-exception
                r1 = r6
            L45:
                r7 = r0
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L48
                throw r7
            L48:
                r0 = move-exception
                goto L45
            */
            throw new UnsupportedOperationException("Method not decompiled: e8.a.d.onLayout(android.print.PrintAttributes, android.print.PrintAttributes, android.os.CancellationSignal, android.print.PrintDocumentAdapter$LayoutResultCallback, android.os.Bundle):void");
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            a.this.r(this.f80580e, this.f80579d, this.f80582g, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f80548i = i10 > 23;
        f80549j = i10 != 23;
    }

    public a(@NonNull Context context) {
        this.f80556a = context;
    }

    public static Bitmap a(Bitmap bitmap, int i10) {
        if (i10 != 1) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    @t0(19)
    public static PrintAttributes.Builder b(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    public static Matrix d(int i10, int i11, RectF rectF, int i12) {
        Matrix matrix = new Matrix();
        float f10 = i10;
        float fWidth = rectF.width() / f10;
        float fMax = i12 == 2 ? Math.max(fWidth, rectF.height() / i11) : Math.min(fWidth, rectF.height() / i11);
        matrix.postScale(fMax, fMax);
        matrix.postTranslate((rectF.width() - (f10 * fMax)) / 2.0f, (rectF.height() - (i11 * fMax)) / 2.0f);
        return matrix;
    }

    public static boolean g(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    public static boolean q() {
        return true;
    }

    public int c() {
        return this.f80560e;
    }

    public int e() {
        int i10 = this.f80561f;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public int f() {
        return this.f80559d;
    }

    public final Bitmap h(Uri uri, BitmapFactory.Options options) throws Throwable {
        Context context;
        if (uri == null || (context = this.f80556a) == null) {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                        return bitmapDecodeStream;
                    } catch (IOException e10) {
                        Log.w(f80546g, "close fail ", e10);
                    }
                }
                return bitmapDecodeStream;
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpenInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e11) {
                        Log.w(f80546g, "close fail ", e11);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public Bitmap i(Uri uri) throws Throwable {
        BitmapFactory.Options options;
        if (uri == null || this.f80556a == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        h(uri, options2);
        int i10 = options2.outWidth;
        int i11 = options2.outHeight;
        if (i10 > 0 && i11 > 0) {
            int iMax = Math.max(i10, i11);
            int i12 = 1;
            while (iMax > 3500) {
                iMax >>>= 1;
                i12 <<= 1;
            }
            if (i12 > 0 && Math.min(i10, i11) / i12 > 0) {
                synchronized (this.f80558c) {
                    options = new BitmapFactory.Options();
                    this.f80557b = options;
                    options.inMutable = true;
                    options.inSampleSize = i12;
                }
                try {
                    Bitmap bitmapH = h(uri, options);
                    synchronized (this.f80558c) {
                        this.f80557b = null;
                    }
                    return bitmapH;
                } catch (Throwable th2) {
                    synchronized (this.f80558c) {
                        this.f80557b = null;
                        throw th2;
                    }
                }
            }
        }
        return null;
    }

    public void j(@NonNull String str, @NonNull Bitmap bitmap) {
        k(str, bitmap, null);
    }

    public void k(@NonNull String str, @NonNull Bitmap bitmap, @Nullable b bVar) {
        if (bitmap == null) {
            return;
        }
        ((PrintManager) this.f80556a.getSystemService("print")).print(str, new c(str, this.f80559d, bitmap, bVar), new PrintAttributes.Builder().setMediaSize(g(bitmap) ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE).setColorMode(this.f80560e).build());
    }

    public void l(@NonNull String str, @NonNull Uri uri) throws FileNotFoundException {
        m(str, uri, null);
    }

    public void m(@NonNull String str, @NonNull Uri uri, @Nullable b bVar) throws FileNotFoundException {
        d dVar = new d(str, uri, bVar, this.f80559d);
        PrintManager printManager = (PrintManager) this.f80556a.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f80560e);
        int i10 = this.f80561f;
        if (i10 == 1 || i10 == 0) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (i10 == 2) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, dVar, builder.build());
    }

    public void n(int i10) {
        this.f80560e = i10;
    }

    public void o(int i10) {
        this.f80561f = i10;
    }

    public void p(int i10) {
        this.f80559d = i10;
    }

    @t0(19)
    public void r(PrintAttributes printAttributes, int i10, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        new AsyncTaskC0788a(cancellationSignal, f80549j ? printAttributes : b(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build(), bitmap, printAttributes, i10, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }
}
