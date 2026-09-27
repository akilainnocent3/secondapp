package kd;

import android.text.TextUtils;
import android.util.Pair;
import cd.c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static Object[] a(Throwable th2, c cVar) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new Pair("exception_name", th2.getClass().getSimpleName()));
        arrayList.add(new Pair("description", th2.getMessage()));
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.getBuffer().toString();
        if (!TextUtils.isEmpty(string)) {
            arrayList.add(new Pair("stack_trace", string));
        }
        if (cVar != null) {
            arrayList.add(new Pair("error_code", cVar.d()));
        }
        Object[] objArr = new Object[arrayList.size() * 2];
        int i10 = 1;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            Pair pair = (Pair) arrayList.get(i12);
            objArr[i11] = pair.first;
            objArr[i10] = pair.second;
            i11 += 2;
            i10 += 2;
        }
        return objArr;
    }
}
