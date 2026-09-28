package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.a;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.c;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b150 {
    public static x050 a(a aVar, List<a0l> list, ur0 ur0Var) {
        wg50 wk5Var;
        wg50 u7e0Var;
        ue4 ue4Var = aVar.a;
        px0 px0Var = aVar.d;
        wzk wzkVar = aVar.c;
        Context applicationContext = wzkVar.getApplicationContext();
        zzk zzkVar = wzkVar.g;
        x050 x050Var = new x050();
        ldd lddVar = new ldd();
        b9n b9nVar = x050Var.g;
        synchronized (b9nVar) {
            b9nVar.a.add(lddVar);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 27) {
            cvg cvgVar = new cvg();
            b9n b9nVar2 = x050Var.g;
            synchronized (b9nVar2) {
                b9nVar2.a.add(cvgVar);
            }
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListE = x050Var.e();
        cl5 cl5Var = new cl5(applicationContext, arrayListE, ue4Var, px0Var);
        wg50 k3i0Var = new k3i0(ue4Var, new k3i0.g());
        c7f c7fVar = new c7f(x050Var.e(), resources.getDisplayMetrics(), ue4Var, px0Var);
        if (i < 28 || !zzkVar.a.containsKey(vzk.b.class)) {
            wk5Var = new wk5(c7fVar);
            u7e0Var = new u7e0(c7fVar, px0Var);
        } else {
            u7e0Var = new mmn();
            wk5Var = new xk5();
        }
        if (i >= 28) {
            x050Var.d("Animation", InputStream.class, Drawable.class, new mg0.c(new mg0(arrayListE, px0Var)));
            x050Var.d("Animation", ByteBuffer.class, Drawable.class, new mg0.b(new mg0(arrayListE, px0Var)));
        }
        yg50 yg50Var = new yg50(applicationContext);
        ge4 ge4Var = new ge4(px0Var);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        ce4 ce4Var = new ce4();
        ny60 ny60Var = new ny60();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        x050Var.a(ByteBuffer.class, new yk5());
        x050Var.a(InputStream.class, new y7e0(px0Var));
        x050Var.d("Bitmap", ByteBuffer.class, Bitmap.class, wk5Var);
        x050Var.d("Bitmap", InputStream.class, Bitmap.class, u7e0Var);
        String str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
            x050Var.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new dsz(c7fVar));
        }
        x050Var.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new k3i0(ue4Var, new k3i0.c()));
        x050Var.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, k3i0Var);
        j2w j2wVar = bfh0.a.a;
        x050Var.c(Bitmap.class, Bitmap.class, j2wVar);
        x050Var.d("Bitmap", Bitmap.class, Bitmap.class, new zeh0());
        x050Var.b(Bitmap.class, ge4Var);
        x050Var.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new de4(resources, wk5Var));
        x050Var.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new de4(resources, u7e0Var));
        x050Var.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new de4(resources, k3i0Var));
        x050Var.b(BitmapDrawable.class, new ee4(ue4Var, ge4Var));
        x050Var.d("Animation", InputStream.class, thk.class, new a8e0(arrayListE, cl5Var, px0Var));
        x050Var.d("Animation", ByteBuffer.class, thk.class, cl5Var);
        x050Var.b(thk.class, new oy60());
        x050Var.c(rhk.class, rhk.class, j2wVar);
        x050Var.d("Bitmap", rhk.class, Bitmap.class, new yhk(ue4Var));
        x050Var.d("legacy_append", Uri.class, Drawable.class, yg50Var);
        x050Var.d("legacy_append", Uri.class, Bitmap.class, new rg50(yg50Var, ue4Var));
        x050Var.h(new el5.a());
        x050Var.c(File.class, ByteBuffer.class, new bl5.b());
        x050Var.c(File.class, InputStream.class, new ekh.e(new gkh()));
        x050Var.d("legacy_append", File.class, File.class, new vjh());
        x050Var.c(File.class, ParcelFileDescriptor.class, new ekh.b(new fkh()));
        x050Var.c(File.class, File.class, j2wVar);
        x050Var.h(new c.a(px0Var));
        if (!"robolectric".equals(str)) {
            x050Var.h(new ParcelFileDescriptorRewinder.a());
        }
        j2w cVar = new oqe.c(applicationContext);
        j2w aVar2 = new oqe.a(applicationContext);
        j2w bVar = new oqe.b(applicationContext);
        Class cls = Integer.TYPE;
        x050Var.c(cls, InputStream.class, cVar);
        x050Var.c(Integer.class, InputStream.class, cVar);
        x050Var.c(cls, AssetFileDescriptor.class, aVar2);
        x050Var.c(Integer.class, AssetFileDescriptor.class, aVar2);
        x050Var.c(cls, Drawable.class, bVar);
        x050Var.c(Integer.class, Drawable.class, bVar);
        x050Var.c(Uri.class, InputStream.class, new sh50.b(applicationContext));
        x050Var.c(Uri.class, AssetFileDescriptor.class, new sh50.a(applicationContext));
        j2w cVar2 = new gh50.c(resources);
        j2w aVar3 = new gh50.a(resources);
        j2w bVar2 = new gh50.b(resources);
        x050Var.c(Integer.class, Uri.class, cVar2);
        x050Var.c(cls, Uri.class, cVar2);
        x050Var.c(Integer.class, AssetFileDescriptor.class, aVar3);
        x050Var.c(cls, AssetFileDescriptor.class, aVar3);
        x050Var.c(Integer.class, InputStream.class, bVar2);
        x050Var.c(cls, InputStream.class, bVar2);
        x050Var.c(String.class, InputStream.class, new csc.b());
        x050Var.c(Uri.class, InputStream.class, new csc.b());
        x050Var.c(String.class, InputStream.class, new z9e0.c());
        x050Var.c(String.class, ParcelFileDescriptor.class, new z9e0.b());
        x050Var.c(String.class, AssetFileDescriptor.class, new z9e0.a());
        x050Var.c(Uri.class, InputStream.class, new sy0.c(applicationContext.getAssets()));
        x050Var.c(Uri.class, AssetFileDescriptor.class, new sy0.b(applicationContext.getAssets()));
        x050Var.c(Uri.class, InputStream.class, new wkv.a(applicationContext));
        x050Var.c(Uri.class, InputStream.class, new ykv.a(applicationContext));
        if (i >= 29) {
            x050Var.c(Uri.class, InputStream.class, new za30.c(applicationContext, InputStream.class));
            x050Var.c(Uri.class, ParcelFileDescriptor.class, new za30.b(applicationContext, ParcelFileDescriptor.class));
        }
        boolean zContainsKey = zzkVar.a.containsKey(vzk.e.class);
        x050Var.c(Uri.class, InputStream.class, new nmh0.d(contentResolver, zContainsKey));
        x050Var.c(Uri.class, ParcelFileDescriptor.class, new nmh0.b(contentResolver, zContainsKey));
        x050Var.c(Uri.class, AssetFileDescriptor.class, new nmh0.a(contentResolver, zContainsKey));
        x050Var.c(Uri.class, InputStream.class, new lnh0.a());
        x050Var.c(URL.class, InputStream.class, new enh0.a());
        x050Var.c(Uri.class, File.class, new vkv.a(applicationContext));
        x050Var.c(d0l.class, InputStream.class, new tpm.a());
        x050Var.c(byte[].class, ByteBuffer.class, new uk5.a());
        x050Var.c(byte[].class, InputStream.class, new uk5.d());
        x050Var.c(Uri.class, Uri.class, j2wVar);
        x050Var.c(Drawable.class, Drawable.class, j2wVar);
        x050Var.d("legacy_append", Drawable.class, Drawable.class, new afh0());
        x050Var.i(Bitmap.class, BitmapDrawable.class, new fe4(resources));
        x050Var.i(Bitmap.class, byte[].class, ce4Var);
        x050Var.i(Drawable.class, byte[].class, new adf(ue4Var, ce4Var, ny60Var));
        x050Var.i(thk.class, byte[].class, ny60Var);
        wg50 k3i0Var2 = new k3i0(ue4Var, new k3i0.d());
        x050Var.d("legacy_append", ByteBuffer.class, Bitmap.class, k3i0Var2);
        x050Var.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new de4(resources, k3i0Var2));
        for (a0l a0lVar : list) {
            try {
                a0lVar.a(applicationContext, aVar, x050Var);
            } catch (AbstractMethodError e) {
                rzk.b("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(a0lVar.getClass().getName()), e);
                return null;
            }
        }
        if (ur0Var != null) {
            ur0Var.a(applicationContext, aVar, x050Var);
        }
        return x050Var;
    }
}
