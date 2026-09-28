package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tl8 implements Comparator {
    public final /* synthetic */ yex a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null ? 0 : 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return this.a.compare(obj, obj2);
    }
}
