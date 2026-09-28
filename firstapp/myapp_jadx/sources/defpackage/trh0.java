package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class trh0 {
    public static void a(String str, String str2, IllegalArgumentException illegalArgumentException) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new StackTraceElement(str, str2, illegalArgumentException.getMessage(), 0));
        illegalArgumentException.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
    }
}
