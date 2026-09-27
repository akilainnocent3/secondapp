package yads;

import android.content.Context;
import android.location.Location;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xy0 implements ch1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hh1 f158048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f158049b;

    public /* synthetic */ xy0(Context context, String str) {
        this(new hh1(context, str));
    }

    @Override // yads.ch1
    public final Location a() {
        Location location;
        synchronized (this.f158049b) {
            try {
                hh1 hh1Var = this.f158048a;
                gh1 gh1VarA = hh1Var.f150133c;
                if (gh1VarA == null) {
                    gh1VarA = hh1Var.a();
                }
                location = null;
                if (gh1VarA != null) {
                    Object objA = om2.a(gh1VarA.f149611a, "isComplete", new Object[0]);
                    Boolean bool = objA instanceof Boolean ? (Boolean) objA : null;
                    if (bool != null && bool.booleanValue()) {
                        Object objA2 = om2.a(gh1VarA.f149611a, "getResult", new Object[0]);
                        location = objA2 instanceof Location ? (Location) objA2 : null;
                        hh1 hh1Var2 = this.f158048a;
                        hh1Var2.f150133c = hh1Var2.a();
                        hh1Var2.f150133c = hh1Var2.a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return location;
    }

    public xy0(hh1 hh1Var) {
        this.f158048a = hh1Var;
        this.f158049b = new Object();
    }
}
