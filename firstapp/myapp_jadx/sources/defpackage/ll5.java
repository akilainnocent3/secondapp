package defpackage;

import android.view.View;
import com.sportybet.android.gp.tz.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class ll5 {
    public static final long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        inputStream.getClass();
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j = 0;
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            j += (long) i;
            i = inputStream.read(bArr);
        }
        return j;
    }

    public static final ibs b(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            ibs ibsVar = tag instanceof ibs ? (ibs) tag : null;
            if (ibsVar != null) {
                return ibsVar;
            }
            Object objA = abo.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final byte[] c(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        a(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static final void d(View view, ibs ibsVar) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, ibsVar);
    }
}
