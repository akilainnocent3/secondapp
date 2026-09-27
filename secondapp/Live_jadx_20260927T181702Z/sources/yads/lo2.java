package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class lo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx0 f152070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p51 f152071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f152072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f152073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pl2 f152074e;

    public lo2(mx0 mx0Var, p51 p51Var, hx2 hx2Var, ArrayList arrayList) {
        ni.a(!p51Var.isEmpty());
        this.f152070a = mx0Var;
        this.f152071b = p51.a((Collection) p51Var);
        this.f152073d = Collections.unmodifiableList(arrayList);
        this.f152074e = hx2Var.a(this);
        this.f152072c = hx2Var.a();
    }

    public abstract String c();

    public abstract i30 d();

    public abstract pl2 e();

    public final pl2 f() {
        return this.f152074e;
    }
}
