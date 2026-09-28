package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class e840 implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((j5d) obj2).getClass();
                Integer num = 0;
                ((j5d) obj).getClass();
                return num.compareTo(num);
            default:
                return Long.valueOf(((joc0) obj2).h).compareTo(Long.valueOf(((joc0) obj).h));
        }
    }
}
