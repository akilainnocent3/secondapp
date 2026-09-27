package ad;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f4822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ed.a f4823c;

    public f(a aVar, ed.a aVar2) {
        this.f4822b = aVar;
        this.f4823c = aVar2;
        aVar.k(this);
        aVar.m(this);
    }

    @Override // ad.a
    public boolean a() {
        return this.f4822b.a();
    }

    @Override // ad.a
    public void b() {
        this.f4822b.b();
    }

    @Override // ad.a
    public boolean c() {
        return this.f4822b.c();
    }

    @Override // ad.a
    public String d() {
        return null;
    }

    @Override // ad.a
    public void destroy() {
        this.f4823c = null;
        this.f4822b.destroy();
    }

    @Override // ad.a
    public final String e() {
        return this.f4822b.e();
    }

    @Override // ad.a
    public boolean f() {
        return this.f4822b.f();
    }

    @Override // ad.a
    public Context g() {
        return this.f4822b.g();
    }

    @Override // ad.a
    public boolean h() {
        return this.f4822b.h();
    }

    @Override // ad.a
    public String i() {
        return null;
    }

    @Override // ad.a
    public boolean j() {
        return false;
    }

    @Override // ad.a
    public IIgniteServiceAPI k() {
        return this.f4822b.k();
    }

    @Override // ad.a
    public void l() {
        this.f4822b.l();
    }

    @Override // ad.a
    public final void m(a aVar) {
        this.f4822b.m(aVar);
    }

    @Override // ed.b
    public void onCredentialsRequestFailed(String str) {
        this.f4822b.onCredentialsRequestFailed(str);
    }

    @Override // ed.b
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.f4822b.onCredentialsRequestSuccess(str, str2);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f4822b.onServiceConnected(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f4822b.onServiceDisconnected(componentName);
    }

    @Override // ad.a
    public void a(String str) {
        ed.a aVar = this.f4823c;
        if (aVar != null) {
            aVar.onIgniteServiceAuthenticationFailed(str);
        }
    }

    @Override // ad.a
    public void b(String str) {
        ed.a aVar = this.f4823c;
        if (aVar != null) {
            aVar.onIgniteServiceConnectionFailed(str);
        }
    }

    @Override // ad.a
    public void c(String str) {
        ed.a aVar = this.f4823c;
        if (aVar != null) {
            aVar.onIgniteServiceAuthenticated(str);
        }
    }

    @Override // ad.a
    public final void k(a aVar) {
        this.f4822b.k(aVar);
    }

    @Override // ad.a
    public void c(ComponentName componentName, IBinder iBinder) {
        ed.a aVar = this.f4823c;
        if (aVar != null) {
            aVar.onIgniteServiceConnected(componentName, iBinder);
        }
    }
}
