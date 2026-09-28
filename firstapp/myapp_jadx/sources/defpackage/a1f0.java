package defpackage;

import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class a1f0<Key, Data> {
    public final long a;
    public final s4u<Key, Pair<Long, Data>> b;

    public /* synthetic */ a1f0(int i, long j, int i2) {
        this((i & 1) != 0 ? 120000L : j, 10);
    }

    public final Data a(Key key) {
        s4u<Key, Pair<Long, Data>> s4uVar = this.b;
        Pair<Long, Data> pairB = s4uVar.b(key);
        if (pairB != null) {
            long jLongValue = pairB.a.longValue();
            Data data = pairB.b;
            if (jLongValue > System.currentTimeMillis()) {
                return data;
            }
            s4uVar.d(key);
        }
        return null;
    }

    public final void b(Key key, Data data) {
        this.b.c(key, new Pair<>(Long.valueOf(System.currentTimeMillis() + this.a), data));
    }

    public a1f0() {
        this(3, 0L, 0);
    }

    public a1f0(long j, int i) {
        this.a = j;
        this.b = new s4u<>(i);
    }
}
