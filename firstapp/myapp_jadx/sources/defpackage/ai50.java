package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ai50 {
    public static int a(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static /* synthetic */ void b(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }
}
