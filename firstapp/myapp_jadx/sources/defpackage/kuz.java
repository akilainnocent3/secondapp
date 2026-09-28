package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class kuz {
    public final guz a;
    public final long b;
    public final huz c;
    public final ArrayList d;

    public kuz(guz guzVar, float f) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.a = guzVar;
        this.b = jCurrentTimeMillis;
        this.c = new huz(guzVar.m, f);
        this.d = new ArrayList();
    }
}
