package defpackage;

import android.util.Log;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class ytb {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final ttb g = new ttb();
    public static final utb h = new utb();
    public static final vtb i = new vtb();
    public final AtomicInteger a = new AtomicInteger(0);
    public final xkh b;
    public final fk80 c;
    public final wrb d;

    public ytb(xkh xkhVar, fk80 fk80Var, wrb wrbVar) {
        this.b = xkhVar;
        this.c = fk80Var;
        this.d = wrbVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        xkh xkhVar = this.b;
        arrayList.addAll(xkh.e(xkhVar.f.listFiles()));
        arrayList.addAll(xkh.e(xkhVar.g.listFiles()));
        utb utbVar = h;
        Collections.sort(arrayList, utbVar);
        List listE = xkh.e(xkhVar.e.listFiles());
        Collections.sort(listE, utbVar);
        arrayList.addAll(listE);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(xkh.e(this.b.d.list())).descendingSet();
    }

    public final void d(ktb.e.d dVar, String str, boolean z) {
        xkh xkhVar = this.b;
        int i2 = this.c.b().a.a;
        g.getClass();
        try {
            f(xkhVar.b(str, tug.a(AnalyticsEvent.BI_TRACKING_KIND_EVENT, String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z ? "_" : "")), ttb.a.a(dVar));
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e2);
        }
        wtb wtbVar = new wtb();
        File file = new File(xkhVar.d, str);
        file.mkdirs();
        List<File> listE = xkh.e(file.listFiles(wtbVar));
        Collections.sort(listE, new xtb());
        int size = listE.size();
        for (File file2 : listE) {
            if (size <= i2) {
                return;
            }
            xkh.d(file2);
            size--;
        }
    }
}
