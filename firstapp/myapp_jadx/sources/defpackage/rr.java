package defpackage;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes8.dex */
public final class rr extends c87 {
    public final ArrayList b;

    public rr(c87... c87VarArr) {
        final ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Stream.of((Object[]) c87VarArr).filter(new pr()).forEach(new Consumer() { // from class: qr
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.add((c87) obj);
            }
        });
    }

    @Override // defpackage.c87
    public final int a(String str, int i, StringWriter stringWriter) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int iA = ((c87) obj).a(str, i, stringWriter);
            if (iA != 0) {
                return iA;
            }
        }
        return 0;
    }
}
