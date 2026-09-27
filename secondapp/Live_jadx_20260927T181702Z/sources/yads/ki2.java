package yads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ki2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f151549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f151550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zp0 f151551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final aq0 f151552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f151553e;

    public /* synthetic */ ki2() {
        this(86400000L, 5, new zp0(), new aq0());
    }

    public final synchronized void a(ny0 ny0Var, Object obj) {
        a();
        if (this.f151553e.size() < this.f151550b) {
            ArrayList arrayList = this.f151553e;
            aq0 aq0Var = this.f151552d;
            long j10 = this.f151549a;
            aq0Var.getClass();
            arrayList.add(new ji2(ny0Var, obj, System.currentTimeMillis() + j10));
        }
    }

    public final synchronized boolean b() {
        a();
        return this.f151553e.size() < this.f151550b;
    }

    public ki2(long j10, int i10, zp0 zp0Var, aq0 aq0Var) {
        this.f151549a = j10;
        this.f151550b = i10;
        this.f151551c = zp0Var;
        this.f151552d = aq0Var;
        this.f151553e = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f151553e;
        zp0 zp0Var = this.f151551c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            zp0Var.getClass();
            if (System.currentTimeMillis() > ((ji2) ((yp0) obj)).f151111c) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f151553e.remove((ji2) it.next());
        }
    }

    public final synchronized Object a(ny0 ny0Var) {
        Object obj;
        Object next;
        Object obj2;
        try {
            a();
            Iterator it = this.f151553e.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.m0.g(((ji2) next).f151109a, ny0Var));
            ji2 ji2Var = (ji2) next;
            if (ji2Var != null && (obj2 = ji2Var.f151110b) != null) {
                this.f151553e.remove(ji2Var);
                obj = obj2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return obj;
    }
}
