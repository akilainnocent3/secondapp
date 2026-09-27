package yl;

import android.content.Context;
import android.os.Process;
import dr.v1;
import fr.m1;
import fr.n1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@cr.f
@s1({"SMAP\nProcessDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessDataManager.kt\ncom/google/firebase/sessions/ProcessDataManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1611#2,9:124\n1863#2:133\n1864#2:135\n1620#2:136\n1734#2,3:137\n1#3:134\n1#3:140\n*S KotlinDebug\n*F\n+ 1 ProcessDataManager.kt\ncom/google/firebase/sessions/ProcessDataManagerImpl\n*L\n78#1:124,9\n78#1:133\n78#1:135\n78#1:136\n83#1:137,3\n78#1:134\n*E\n"})
public final class c0 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final Context f159590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final dr.i0 f159591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f159592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final dr.i0 f159593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public final dr.i0 f159594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f159595f;

    @cr.a
    public c0(@oy.l Context appContext, @oy.l final c1 uuidGenerator) {
        kotlin.jvm.internal.m0.p(appContext, "appContext");
        kotlin.jvm.internal.m0.p(uuidGenerator, "uuidGenerator");
        this.f159590a = appContext;
        this.f159591b = dr.k0.b(new ds.a() { // from class: yl.z
            @Override // ds.a
            public final Object invoke() {
                return c0.p(this.f159767b);
            }
        });
        this.f159592c = Process.myPid();
        this.f159593d = dr.k0.b(new ds.a() { // from class: yl.a0
            @Override // ds.a
            public final Object invoke() {
                return c0.q(uuidGenerator);
            }
        });
        this.f159594e = dr.k0.b(new ds.a() { // from class: yl.b0
            @Override // ds.a
            public final Object invoke() {
                return c0.o(this.f159551b);
            }
        });
    }

    public static final e0 o(c0 c0Var) {
        return f0.f159619a.b(c0Var.f159590a);
    }

    public static final String p(c0 c0Var) {
        return c0Var.m().i();
    }

    public static final String q(c1 c1Var) {
        String string = c1Var.next().toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    @Override // yl.y
    @oy.l
    public String a() {
        return (String) this.f159591b.getValue();
    }

    @Override // yl.y
    public boolean b(@oy.l Map<String, x> processDataMap) {
        kotlin.jvm.internal.m0.p(processDataMap, "processDataMap");
        x xVar = processDataMap.get(a());
        return (xVar != null && xVar.e() == f() && kotlin.jvm.internal.m0.g(xVar.f(), d())) ? false : true;
    }

    @Override // yl.y
    public boolean c(@oy.l Map<String, x> processDataMap) {
        kotlin.jvm.internal.m0.p(processDataMap, "processDataMap");
        if (this.f159595f) {
            return false;
        }
        List<e0> listL = l();
        ArrayList<dr.z0> arrayList = new ArrayList();
        for (e0 e0Var : listL) {
            x xVar = processDataMap.get(e0Var.i());
            dr.z0 z0Var = xVar != null ? new dr.z0(e0Var, xVar) : null;
            if (z0Var != null) {
                arrayList.add(z0Var);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (dr.z0 z0Var2 : arrayList) {
            if (!n((e0) z0Var2.d(), (x) z0Var2.g())) {
                return false;
            }
        }
        return true;
    }

    @Override // yl.y
    @oy.l
    public String d() {
        return (String) this.f159593d.getValue();
    }

    @Override // yl.y
    @oy.l
    public Map<String, x> e() {
        return y.a.a(this);
    }

    @Override // yl.y
    public int f() {
        return this.f159592c;
    }

    @Override // yl.y
    @oy.l
    public Map<String, x> g(@oy.m Map<String, x> map) {
        Map mapJ0;
        if (map != null && (mapJ0 = n1.J0(map)) != null) {
            mapJ0.put(a(), new x(Process.myPid(), d()));
            Map<String, x> mapD0 = n1.D0(mapJ0);
            if (mapD0 != null) {
                return mapD0;
            }
        }
        return m1.k(v1.a(a(), new x(Process.myPid(), d())));
    }

    @Override // yl.y
    public void h() {
        this.f159595f = true;
    }

    public final List<e0> l() {
        return f0.f159619a.a(this.f159590a);
    }

    public final e0 m() {
        return (e0) this.f159594e.getValue();
    }

    public final boolean n(e0 e0Var, x xVar) {
        if (kotlin.jvm.internal.m0.g(a(), e0Var.i())) {
            return (e0Var.h() == xVar.e() && kotlin.jvm.internal.m0.g(d(), xVar.f())) ? false : true;
        }
        return e0Var.h() != xVar.e();
    }
}
